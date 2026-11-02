#!/usr/bin/env python3
"""Make Apktool's decoded XML compilable without renaming application classes.

The prepare phase substitutes only invalid non-ASCII XML element names with
temporary ASCII tokens. The restore phase patches those tokens back into the
compiled Android binary-XML string pools inside the rebuilt APK. Smali,
manifest class names, JNI symbols, and native libraries are never modified.
"""
from __future__ import annotations

import argparse
import json
import os
import re
import struct
import sys
import tempfile
import zipfile
from pathlib import Path

TAG_RE = re.compile(r"(<\/?)([^\s<>/]+)(?=[\s/>])")
CHUNK_HEADER = struct.Struct("<HHI")
STRING_POOL_HEADER = struct.Struct("<HHIIIIII")
UTF8_FLAG = 0x00000100


def read_text(path: Path) -> str:
    return path.read_text(encoding="utf-8-sig")


def encode_length8(value: int) -> bytes:
    if value <= 0x7F:
        return bytes((value,))
    if value <= 0x7FFF:
        return bytes(((value >> 8) | 0x80, value & 0xFF))
    raise ValueError(f"UTF-8 string length is too large: {value}")


def decode_length8(data: bytes, pos: int) -> tuple[int, int]:
    first = data[pos]
    pos += 1
    if first & 0x80:
        return (((first & 0x7F) << 8) | data[pos]), pos + 1
    return first, pos


def encode_length16(value: int) -> bytes:
    if value <= 0x7FFF:
        return struct.pack("<H", value)
    if value <= 0x7FFFFFFF:
        return struct.pack("<HH", ((value >> 16) | 0x8000), value & 0xFFFF)
    raise ValueError(f"UTF-16 string length is too large: {value}")


def decode_length16(data: bytes, pos: int) -> tuple[int, int]:
    first = struct.unpack_from("<H", data, pos)[0]
    pos += 2
    if first & 0x8000:
        second = struct.unpack_from("<H", data, pos)[0]
        return (((first & 0x7FFF) << 16) | second), pos + 2
    return first, pos


def decode_pool_string(chunk: bytes, strings_start: int, offset: int, utf8: bool) -> str:
    pos = strings_start + offset
    if utf8:
        _, pos = decode_length8(chunk, pos)  # UTF-16 code-unit count
        byte_count, pos = decode_length8(chunk, pos)
        return chunk[pos:pos + byte_count].decode("utf-8")
    char_count, pos = decode_length16(chunk, pos)
    return chunk[pos:pos + char_count * 2].decode("utf-16le")


def encode_pool_string(value: str, utf8: bool) -> bytes:
    if utf8:
        encoded = value.encode("utf-8")
        return (encode_length8(len(value.encode("utf-16le")) // 2)
                + encode_length8(len(encoded)) + encoded + b"\0")
    encoded = value.encode("utf-16le")
    return encode_length16(len(encoded) // 2) + encoded + b"\0\0"


def patch_string_pool(chunk: bytes, replacements: dict[str, str]) -> tuple[bytes, int]:
    if len(chunk) < STRING_POOL_HEADER.size:
        raise ValueError("Truncated Android string-pool chunk")
    (chunk_type, header_size, chunk_size, string_count, style_count,
     flags, strings_start, styles_start) = STRING_POOL_HEADER.unpack_from(chunk)
    if chunk_type != 0x0001 or header_size < STRING_POOL_HEADER.size or chunk_size != len(chunk):
        raise ValueError("Invalid Android string-pool header")
    arrays_end = header_size + 4 * (string_count + style_count)
    if arrays_end > len(chunk) or strings_start < arrays_end or strings_start > len(chunk):
        raise ValueError("Invalid Android string-pool offsets")

    string_offsets = list(struct.unpack_from(f"<{string_count}I", chunk, header_size)) if string_count else []
    style_offset_pos = header_size + 4 * string_count
    style_offsets = list(struct.unpack_from(f"<{style_count}I", chunk, style_offset_pos)) if style_count else []
    utf8 = bool(flags & UTF8_FLAG)

    values = [decode_pool_string(chunk, strings_start, off, utf8) for off in string_offsets]
    replaced = 0
    for i, value in enumerate(values):
        if value in replacements:
            values[i] = replacements[value]
            replaced += 1

    if not replaced:
        return chunk, 0

    strings_blob = bytearray()
    new_offsets = []
    for value in values:
        new_offsets.append(len(strings_blob))
        strings_blob.extend(encode_pool_string(value, utf8))
    while len(strings_blob) % 4:
        strings_blob.append(0)

    new_strings_start = arrays_end
    styles_blob = b""
    if style_count:
        if not styles_start or styles_start > len(chunk):
            raise ValueError("Invalid Android style-string offsets")
        styles_blob = chunk[styles_start:]
        new_styles_start = new_strings_start + len(strings_blob)
    else:
        new_styles_start = 0

    new_size = new_strings_start + len(strings_blob) + len(styles_blob)
    out = bytearray()
    out.extend(STRING_POOL_HEADER.pack(
        chunk_type, header_size, new_size, string_count, style_count,
        flags, new_strings_start, new_styles_start
    ))
    out.extend(struct.pack(f"<{string_count}I", *new_offsets) if string_count else b"")
    out.extend(struct.pack(f"<{style_count}I", *style_offsets) if style_count else b"")
    if len(out) < new_strings_start:
        out.extend(b"\0" * (new_strings_start - len(out)))
    out.extend(strings_blob)
    out.extend(styles_blob)
    return bytes(out), replaced


def patch_binary_xml(data: bytes, replacements: dict[str, str]) -> tuple[bytes, int]:
    if len(data) < 8:
        raise ValueError("Truncated Android binary XML")
    xml_type, header_size, total_size = CHUNK_HEADER.unpack_from(data)
    if xml_type != 0x0003 or header_size < 8 or total_size != len(data):
        raise ValueError("Resource entry is not a valid Android binary XML document")

    out = bytearray(data[:header_size])
    pos = header_size
    total_replaced = 0
    while pos < total_size:
        if pos + 8 > total_size:
            raise ValueError("Truncated Android XML child chunk")
        chunk_type, child_header_size, child_size = CHUNK_HEADER.unpack_from(data, pos)
        if child_size < child_header_size or pos + child_size > total_size:
            raise ValueError("Invalid Android XML child chunk size")
        chunk = data[pos:pos + child_size]
        if chunk_type == 0x0001:
            chunk, count = patch_string_pool(chunk, replacements)
            total_replaced += count
        out.extend(chunk)
        pos += child_size
    struct.pack_into("<I", out, 4, len(out))
    return bytes(out), total_replaced


def prepare(res_dir: Path, mapping_path: Path) -> int:
    if not res_dir.is_dir():
        print(f"Resource directory does not exist: {res_dir}", file=sys.stderr)
        return 2

    manifest: dict[str, dict[str, str]] = {}
    serial = 0
    for path in sorted(res_dir.rglob("*.xml")):
        original = read_text(path)
        tags = sorted({
            tag for _, tag in TAG_RE.findall(original)
            if not tag.startswith(("?", "!")) and not tag.isascii()
        })
        if not tags:
            continue

        replacements: dict[str, str] = {}
        for tag in tags:
            serial += 1
            replacements[tag] = f"BFXmlTag{serial:05d}"
        updated = original
        for old, token in replacements.items():
            tag_pattern = re.compile(r"(<\/?)" + re.escape(old) + r"(?=[\s/>])")
            updated = tag_pattern.sub(lambda match: match.group(1) + token, updated)
        path.write_text(updated, encoding="utf-8", newline="")
        archive_path = path.relative_to(res_dir.parent).as_posix()
        manifest[archive_path] = {token: old for old, token in replacements.items()}

    mapping_path.parent.mkdir(parents=True, exist_ok=True)
    mapping_path.write_text(json.dumps(manifest, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(f"Prepared {sum(len(v) for v in manifest.values())} temporary XML tag token(s) across {len(manifest)} resource file(s).")
    print("No Smali class, manifest class name, JNI symbol, or native library was changed.")
    return 0


def restore(apk_path: Path, mapping_path: Path) -> int:
    if not apk_path.is_file() or not mapping_path.is_file():
        print("APK or XML mapping file is missing.", file=sys.stderr)
        return 2
    manifest = json.loads(mapping_path.read_text(encoding="utf-8"))
    if not manifest:
        print("No XML tag substitutions to restore.")
        return 0

    fd, temp_name = tempfile.mkstemp(prefix=apk_path.stem + "-", suffix=".apk", dir=apk_path.parent)
    os.close(fd)
    total = 0
    try:
        with zipfile.ZipFile(apk_path, "r") as source, zipfile.ZipFile(temp_name, "w") as target:
            seen = set()
            for info in source.infolist():
                if info.filename in seen:
                    raise ValueError(f"Duplicate APK ZIP entry: {info.filename}")
                seen.add(info.filename)
                payload = source.read(info.filename)
                if info.filename in manifest:
                    payload, count = patch_binary_xml(payload, manifest[info.filename])
                    expected = len(manifest[info.filename])
                    if count != expected:
                        raise ValueError(
                            f"{info.filename}: restored {count}/{expected} XML tag token(s); "
                            "refusing to ship a partially restored APK"
                        )
                    total += count
                target.writestr(info, payload)
            missing = sorted(set(manifest) - seen)
            if missing:
                raise ValueError("Compiled APK is missing XML resource(s): " + ", ".join(missing))
        os.replace(temp_name, apk_path)
    except Exception:
        if os.path.exists(temp_name):
            os.unlink(temp_name)
        raise

    print(f"Restored {total} original XML tag name(s) in {len(manifest)} compiled resource file(s).")
    print("Original class names and native/JNI identities were preserved.")
    return 0


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("phase", choices=("prepare", "restore"))
    parser.add_argument("--res", type=Path, default=Path("bf_manager/res"))
    parser.add_argument("--mapping", type=Path, required=True)
    parser.add_argument("--apk", type=Path)
    args = parser.parse_args()

    if args.phase == "prepare":
        return prepare(args.res, args.mapping)
    if args.apk is None:
        parser.error("--apk is required for the restore phase")
    return restore(args.apk, args.mapping)


if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except (OSError, UnicodeError, ValueError, zipfile.BadZipFile, struct.error) as exc:
        print(f"repair_xml.py: {exc}", file=sys.stderr)
        raise SystemExit(1)
