#!/usr/bin/env python3
"""Normalize obfuscated custom-view class names so AAPT2 can parse resource XML.

The rename is semantics-preserving: each affected Smali class and every textual
Smali/XML reference is renamed together. The original class implementation and
inheritance are left untouched.
"""
from __future__ import annotations

import re
import sys
from pathlib import Path

REPO_ROOT = Path(__file__).resolve().parents[1]
PROJECT = REPO_ROOT / "bf_manager"
TAG_RE = re.compile(r"<(/?)([^\s/>]+)")
CLASS_REF_RE = re.compile(r"""(?<![A-Za-z0-9_$])l\.[^\s"'<>/]+""")
ASCII_XML_NAME = re.compile(r"[A-Za-z_][A-Za-z0-9_.:-]*\Z")

def read_utf8_xml(path: Path) -> str | None:
    """Read textual UTF-8 XML; ignore binary/non-UTF-8 payloads safely."""
    data = path.read_bytes()
    try:
        return data.decode("utf-8-sig")
    except UnicodeDecodeError:
        print(f"Skipping non-UTF-8 XML payload: {path.relative_to(REPO_ROOT)}", file=sys.stderr)
        return None


def main() -> int:
    if not (PROJECT / "apktool.yml").is_file():
        raise SystemExit("bf_manager/apktool.yml not found; run from the repository checkout")

    xml_files = sorted(PROJECT.rglob("*.xml"))
    affected_names: set[str] = set()
    for path in xml_files:
        source = read_utf8_xml(path)
        if source is None:
            continue
        # Include class names in element tags AND manifest attributes such as
        # application android:name, provider android:name, and activity names.
        for name in CLASS_REF_RE.findall(source):
            if not ASCII_XML_NAME.fullmatch(name):
                affected_names.add(name)

    if not affected_names:
        print("No non-ASCII obfuscated l.* XML class names need normalization.")
        return 0

    smali_roots = sorted(p for p in PROJECT.glob("smali*") if p.is_dir())
    mapping: dict[str, str] = {}
    class_files: dict[str, Path] = {}

    for index, old_name in enumerate(sorted(affected_names), start=1):
        old_simple = old_name[2:]
        matches = [
            path
            for smali_root in smali_roots
            for path in smali_root.rglob(old_simple + ".smali")
            if path.parent.name == "l"
        ]
        if len(matches) != 1:
            raise SystemExit(
                f"Expected exactly one Smali definition for {old_name}, found {len(matches)}"
            )
        mapping[old_name] = f"l.BFCompat{index:03d}"
        class_files[old_name] = matches[0]

    # Rename all class descriptors/references before moving the definition files.
    smali_files = [
        path
        for smali_root in smali_roots
        for path in smali_root.rglob("*.smali")
    ]
    for path in smali_files:
        source = path.read_text(encoding="utf-8")
        updated = source
        for old_name, new_name in mapping.items():
            old_internal = old_name.replace(".", "/")
            new_internal = new_name.replace(".", "/")
            updated = updated.replace(old_internal, new_internal)
            updated = updated.replace(old_name, new_name)
        if updated != source:
            path.write_text(updated, encoding="utf-8", newline="\n")

    for old_name, path in class_files.items():
        new_simple = mapping[old_name].split(".", 1)[1]
        new_path = path.with_name(new_simple + ".smali")
        if new_path.exists():
            raise SystemExit(f"Refusing to overwrite existing Smali file: {new_path}")
        path.rename(new_path)

    # Resource XML element names must match the renamed JVM class names.
    for path in xml_files:
        source = read_utf8_xml(path)
        if source is None:
            continue
        updated = source
        for old_name, new_name in mapping.items():
            updated = updated.replace(old_name, new_name)
        if updated != source:
            path.write_text(updated, encoding="utf-8", newline="\n")

    print(f"Normalized {len(mapping)} obfuscated XML class names:")
    for old_name, new_name in sorted(mapping.items()):
        print(f"  {old_name} -> {new_name}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
