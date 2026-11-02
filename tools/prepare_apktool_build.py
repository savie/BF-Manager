#!/usr/bin/env python3
"""Temporarily quarantine decompiled XML with non-ASCII element names.

AAPT2 rejects some obfuscated element names emitted by Apktool (for example
classes whose names contain combining Unicode marks). The original files are
kept intact and restored by the CI shell trap after the build.
"""
from __future__ import annotations

import argparse
import re
import shutil
import sys
from pathlib import Path

# Apktool-generated resource XML can contain obfuscated Java class names as
# element names. AAPT2's resource XML parser is stricter than the XML parser
# used by Apktool and rejects these names.
TAG_RE = re.compile(r"<\\s*/?\\s*([A-Za-z_][^\\s/>]*)")


def has_non_ascii_element_name(path: Path) -> bool:
    try:
        text = path.read_text(encoding="utf-8-sig")
    except (OSError, UnicodeError) as exc:
        print(f"ERROR: cannot read {path}: {exc}", file=sys.stderr)
        raise
    for match in TAG_RE.finditer(text):
        name = match.group(1)
        if any(ord(char) > 0x7F for char in name):
            return True
    return False


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--root", type=Path, required=True,
                        help="Decoded Apktool project directory")
    parser.add_argument("--quarantine", type=Path, required=True,
                        help="Directory outside the Apktool project for originals")
    args = parser.parse_args()

    root = args.root.resolve()
    quarantine = args.quarantine.resolve()
    resource_xml = root / "res" / "xml"
    if not resource_xml.is_dir():
        print("No res/xml directory; nothing to prepare.")
        return 0
    if quarantine == root or root in quarantine.parents:
        parser.error("--quarantine must be outside the Apktool project")

    quarantine.mkdir(parents=True, exist_ok=True)
    moved = []
    for path in sorted(resource_xml.rglob("*.xml")):
        if has_non_ascii_element_name(path):
            relative = path.relative_to(root)
            destination = quarantine / relative
            destination.parent.mkdir(parents=True, exist_ok=True)
            shutil.move(str(path), str(destination))
            moved.append((relative, destination))
            print(f"QUARANTINED: {relative}")

    manifest = quarantine / ".bf-manager-quarantine"
    manifest.write_text("\\n".join(str(item[0]) for item in moved) +
                        ("\\n" if moved else ""), encoding="utf-8")
    print(f"Prepared Apktool resources; quarantined {len(moved)} incompatible XML file(s).")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
