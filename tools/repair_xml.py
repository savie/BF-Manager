#!/usr/bin/env python3
"""Validate and safely repair malformed decoded Android XML resources.

The repair is deliberately conservative: it removes only illegal XML control/
Unicode code points. It never drops a resource element or rewrites tags,
attributes, references, or text. If parsing still fails, the build stops with
a precise diagnostic rather than silently producing a damaged APK.
"""
from __future__ import annotations

import argparse
import sys
import xml.etree.ElementTree as ET
from pathlib import Path
from typing import Iterable

# XML 1.0 valid character ranges (Fifth Edition).
def is_xml10_char(codepoint: int) -> bool:
    return (
        codepoint in (0x9, 0xA, 0xD)
        or 0x20 <= codepoint <= 0xD7FF
        or 0xE000 <= codepoint <= 0xFFFD
        or 0x10000 <= codepoint <= 0x10FFFF
    )


def sanitize_xml_text(text: str) -> tuple[str, int]:
    cleaned = []
    removed = 0
    for char in text:
        if is_xml10_char(ord(char)):
            cleaned.append(char)
        else:
            removed += 1
    return "".join(cleaned), removed


def iter_xml_files(root: Path) -> Iterable[Path]:
    if not root.exists():
        raise FileNotFoundError(f"Resource directory not found: {root}")
    yield from sorted(root.rglob("*.xml"))


def repair_file(path: Path, dry_run: bool = False) -> tuple[bool, int]:
    # utf-8-sig accepts both regular UTF-8 and a BOM without retaining it.
    original = path.read_text(encoding="utf-8-sig")
    cleaned, removed = sanitize_xml_text(original)

    if removed:
        try:
            ET.fromstring(cleaned)
        except ET.ParseError as exc:
            raise ValueError(
                f"{path}: illegal XML characters were found ({removed}), "
                f"but removing only those characters does not make the XML "
                f"well-formed: {exc}. No file was changed."
            ) from exc
        if not dry_run:
            path.write_text(cleaned, encoding="utf-8", newline="")
        return True, removed

    try:
        ET.fromstring(original)
    except ET.ParseError as exc:
        raise ValueError(
            f"{path}: XML is malformed ({exc}). The file was left unchanged; "
            "automatic structural rewriting is intentionally disabled."
        ) from exc
    return False, 0


def main() -> int:
    parser = argparse.ArgumentParser(
        description="Safely validate decoded APK XML resources."
    )
    parser.add_argument(
        "--res", type=Path, default=Path("bf_manager/res"),
        help="Decoded resource directory (default: bf_manager/res)",
    )
    parser.add_argument(
        "--dry-run", action="store_true",
        help="Validate and report without modifying files.",
    )
    args = parser.parse_args()

    changed = 0
    removed_total = 0
    try:
        for xml_path in iter_xml_files(args.res):
            repaired, removed = repair_file(xml_path, args.dry_run)
            if repaired:
                changed += 1
                removed_total += removed
                action = "Would sanitize" if args.dry_run else "Sanitized"
                print(f"{action}: {xml_path} (removed {removed} illegal XML character(s))")
    except (OSError, UnicodeError, ValueError) as exc:
        print(f"XML validation failed: {exc}", file=sys.stderr)
        return 1

    print(
        f"XML validation passed: {changed} file(s) "
        f"{'would be sanitized' if args.dry_run else 'sanitized'}, "
        f"{removed_total} illegal character(s) removed."
    )
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
