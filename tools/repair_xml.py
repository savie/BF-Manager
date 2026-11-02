#!/usr/bin/env python3
"""Repair Apktool XML names that cannot be represented by XML 1.0.

Some obfuscated DEX class names contain Unicode combining marks. Apktool writes
those names as XML element names, but AAPT2 rejects them. This tool creates
ASCII-safe aliases for the affected DEX class descriptors and applies the same
rename consistently to smali references and decoded resource XML.

It refuses to guess when an XML tag has no matching smali class.
"""
from __future__ import annotations

import argparse
import re
import sys
from pathlib import Path

TAG_RE = re.compile(r"(<\/?)([A-Za-z_][^\s<>/]*)(?=[\s/>])")
CLASS_RE = re.compile(r"(?m)^(\s*\.class\s+[^\r\n]*?)(L[^;\s]+;)")
SAFE = re.compile(r"^[A-Za-z_][A-Za-z0-9_./$-]*$")


def safe_descriptor(descriptor: str) -> str:
    body = descriptor[1:-1]
    out = []
    for ch in body:
        if ch.isascii() and (ch.isalnum() or ch in "/_$.-"):
            out.append(ch)
        else:
            out.append(f"_u{ord(ch):04X}_")
    return "L" + "".join(out) + ";"


def read_text(path: Path) -> str:
    return path.read_text(encoding="utf-8-sig")


def main() -> int:
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--res", type=Path, default=Path("bf_manager/res"))
    ap.add_argument("--smali", type=Path, default=Path("bf_manager"))
    ap.add_argument("--dry-run", action="store_true")
    args = ap.parse_args()

    if not args.res.is_dir() or not args.smali.is_dir():
        print("Expected decoded resource and smali directories.", file=sys.stderr)
        return 2

    smali_files = sorted(args.smali.glob("smali*/**/*.smali"))
    class_map: dict[str, str] = {}
    class_files: dict[str, Path] = {}
    for path in smali_files:
        try:
            text = read_text(path)
        except (OSError, UnicodeError):
            continue
        match = CLASS_RE.search(text)
        if not match:
            continue
        old = match.group(2)
        new = safe_descriptor(old)
        if old != new:
            class_map[old] = new
            class_files[old] = path

    if not class_map:
        print("No non-ASCII smali class descriptors found; nothing to rename.")
        return 0

    xml_files = sorted(args.res.rglob("*.xml"))
    tag_names: set[str] = set()
    for path in xml_files:
        try:
            data = read_text(path)
        except (OSError, UnicodeError) as exc:
            print(f"Cannot read {path}: {exc}", file=sys.stderr)
            return 1
        for _, tag in TAG_RE.findall(data):
            if not tag.startswith(("?", "!")) and not tag.isascii():
                tag_names.add(tag)

    # Match XML element names to actual DEX class descriptors. No heuristic
    # renames: a missing class mapping is a hard error. Ignore unrelated
    # obfuscated classes; only rename classes actually used as XML elements.
    unresolved = []
    tag_map: dict[str, str] = {}
    used_class_map: dict[str, str] = {}
    for tag in sorted(tag_names):
        descriptor = "L" + tag.replace(".", "/") + ";"
        replacement = class_map.get(descriptor)
        if replacement is None:
            unresolved.append(tag)
        else:
            used_class_map[descriptor] = replacement
            tag_map[tag] = replacement[1:-1].replace("/", ".")
    class_map = used_class_map

    if unresolved:
        print("Cannot safely map XML element(s) to smali classes:", file=sys.stderr)
        for tag in unresolved:
            print(f"  {tag}", file=sys.stderr)
        return 1

    # Every XML class must have a corresponding smali definition. Rewrite
    # descriptor references in all smali sources, then move the defining file.
    changes = 0
    if not args.dry_run:
        for path in smali_files:
            original = read_text(path)
            updated = original
            for old, new in class_map.items():
                updated = updated.replace(old, new)
            if updated != original:
                path.write_text(updated, encoding="utf-8", newline="")
                changes += 1

        for old, path in class_files.items():
            new = class_map[old]
            relative = Path(*new[1:-1].split("/")).with_suffix(".smali")
            destination = path.parents[0]
            # Preserve the smali root (smali, smali_classes2, etc.).
            root = path
            while root.parent != args.smali and root.parent != root:
                root = root.parent
            smali_root = root.parent
            # Locate the matching smali root from the original path.
            parts = path.parts
            root_index = next((i for i, part in enumerate(parts) if part.startswith("smali")), None)
            if root_index is None:
                raise RuntimeError(f"Cannot identify smali root for {path}")
            smali_root = Path(*parts[:root_index + 1])
            target = smali_root / relative
            target.parent.mkdir(parents=True, exist_ok=True)
            if path != target:
                if target.exists():
                    raise RuntimeError(f"Refusing to overwrite existing class file: {target}")
                path.rename(target)

        for path in xml_files:
            original = read_text(path)
            updated = original
            for old, new in tag_map.items():
                updated = updated.replace("<" + old, "<" + new)
                updated = updated.replace("</" + old, "</" + new)
            if updated != original:
                path.write_text(updated, encoding="utf-8", newline="")
                changes += 1

    mode = "Would rename" if args.dry_run else "Renamed"
    print(f"{mode} {len(class_map)} smali class descriptor(s); updated {changes} file(s).")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
