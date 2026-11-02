#!/usr/bin/env python3
"""Repair non-ASCII Apktool XML class element names safely.

Only classes referenced as non-ASCII XML element names are renamed. Their
smali definitions, all descriptor references, and XML start/end tags are
updated consistently. Unrelated obfuscated classes are left untouched.
"""
from __future__ import annotations

import argparse
import re
import sys
from pathlib import Path

TAG_RE = re.compile(r"(<\\/?)([^\\s<>/]+)(?=[\\s/>])")
CLASS_RE = re.compile(r"(?m)^\\s*\\.class\\s+[^\\r\\n]*?(L[^;\\s]+;)")


def safe_descriptor(descriptor: str) -> str:
    if not descriptor.startswith("L") or not descriptor.endswith(";"):
        raise ValueError(f"Invalid class descriptor: {descriptor!r}")
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

    if not tag_names:
        print("No non-ASCII XML element names found; nothing to rename.")
        return 0

    # Build descriptor -> defining file for every class, but do not rename
    # classes unless an XML element explicitly refers to that descriptor.
    smali_files = sorted(args.smali.glob("smali*/**/*.smali"))
    definitions: dict[str, Path] = {}
    for path in smali_files:
        try:
            content = read_text(path)
        except (OSError, UnicodeError) as exc:
            print(f"Cannot read {path}: {exc}", file=sys.stderr)
            return 1
        match = CLASS_RE.search(content)
        if match:
            descriptor = match.group(1)
            if descriptor in definitions:
                print(f"Duplicate smali class definition: {descriptor}", file=sys.stderr)
                return 1
            definitions[descriptor] = path

    class_map: dict[str, str] = {}
    tag_map: dict[str, str] = {}
    unresolved: list[str] = []
    for tag in sorted(tag_names):
        descriptor = "L" + tag.replace(".", "/") + ";"
        if descriptor not in definitions:
            unresolved.append(tag)
            continue
        replacement = safe_descriptor(descriptor)
        if replacement == descriptor:
            unresolved.append(tag)
            continue
        class_map[descriptor] = replacement
        tag_map[tag] = replacement[1:-1].replace("/", ".")

    if unresolved:
        print("Cannot safely map XML element(s) to smali class definitions:", file=sys.stderr)
        for tag in unresolved:
            print(f"  {tag}", file=sys.stderr)
        return 1

    # Check destinations before modifying anything, so failure is atomic
    # with respect to the common collision case.
    targets: dict[Path, Path] = {}
    for old, source in definitions.items():
        if old not in class_map:
            continue
        new = class_map[old]
        relative = Path(*new[1:-1].split("/")).with_suffix(".smali")
        root_index = next((i for i, part in enumerate(source.parts)
                           if part.startswith("smali")), None)
        if root_index is None:
            print(f"Cannot identify smali root for {source}", file=sys.stderr)
            return 1
        target = Path(*source.parts[:root_index + 1]) / relative
        if target.exists() and target != source:
            print(f"Refusing to overwrite existing class file: {target}", file=sys.stderr)
            return 1
        targets[source] = target

    if args.dry_run:
        print(f"Validated {len(class_map)} XML-referenced class rename(s).")
        for old, new in sorted(class_map.items()):
            print(f"  {old} -> {new}")
        return 0

    changed_files = 0
    # Replace descriptor references globally before moving definition files.
    for path in smali_files:
        original = read_text(path)
        updated = original
        for old, new in class_map.items():
            updated = updated.replace(old, new)
        if updated != original:
            path.write_text(updated, encoding="utf-8", newline="")
            changed_files += 1

    for source, target in targets.items():
        target.parent.mkdir(parents=True, exist_ok=True)
        if source != target:
            source.rename(target)

    for path in xml_files:
        original = read_text(path)
        updated = original
        for old, new in tag_map.items():
            updated = updated.replace("<" + old, "<" + new)
            updated = updated.replace("</" + old, "</" + new)
        if updated != original:
            path.write_text(updated, encoding="utf-8", newline="")
            changed_files += 1

    print(f"Renamed {len(class_map)} XML-referenced smali class(es); updated {changed_files} file(s).")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
