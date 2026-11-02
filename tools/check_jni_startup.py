#!/usr/bin/env python3
"""Read-only JNI startup diagnostics for the BF Manager apktool tree.

Run from the repository root:
    python3 tools/check_jni_startup.py
This script does not modify Smali, native libraries, or the APK.
"""
from pathlib import Path
import re
import shutil
import subprocess
import sys

ROOT = Path(__file__).resolve().parents[1]
PROJECT = ROOT / "bf_manager"
TARGET_CLASS = "l/ۗܺ;"
LIBRARY = "libmtprotect.so"
ABIS = ("arm64-v8a", "armeabi-v7a", "x86", "x86_64")


def say(status, message):
    print(f"[{status}] {message}")


def main():
    if not PROJECT.is_dir():
        say("ERROR", f"apktool project not found: {PROJECT}")
        return 2

    smali_roots = [p for p in PROJECT.glob("smali*") if p.is_dir()]
    class_files = []
    load_calls = []
    native_declarations = []

    for root in smali_roots:
        for path in root.rglob("*.smali"):
            try:
                text = path.read_text(encoding="utf-8")
            except (UnicodeError, OSError):
                continue
            if TARGET_CLASS in text and re.search(r"^\.class\\b", text, re.M):
                if path.as_posix().endswith("/l/ۗܺ.smali"):
                    class_files.append(path)
            for match in re.finditer(r"invoke-static[^\\n]*System;->loadLibrary\\(Ljava/lang/String;\\)V", text):
                excerpt = text[max(0, match.start()-180):match.end()+100]
                load_calls.append((path.relative_to(PROJECT), excerpt.strip()))
            if re.search(r"\\.method\\s+static\\s+native\\s+constructor\\s+<clinit>\\(\\)V", text):
                native_declarations.append(path.relative_to(PROJECT))

    say("INFO", f"Smali roots: {', '.join(p.name for p in smali_roots) or '(none)'}")
    if class_files:
        say("OK", f"Target class found: {class_files[0].relative_to(PROJECT)}")
    else:
        say("ERROR", f"Target class {TARGET_CLASS} not found in decoded Smali")
    if native_declarations:
        say("OK", "Native <clinit> declarations: " + ", ".join(map(str, native_declarations)))
    else:
        say("WARN", "No native <clinit> declaration detected")

    errors = 0
    for abi in ABIS:
        library = PROJECT / "lib" / abi / LIBRARY
        if not library.is_file():
            say("ERROR", f"Missing {abi}/{LIBRARY}")
            errors += 1
            continue
        say("OK", f"{abi}/{LIBRARY} present ({library.stat().st_size} bytes)")
        readelf = shutil.which("llvm-readelf") or shutil.which("readelf")
        if readelf:
            result = subprocess.run([readelf, "-h", str(library)], text=True,
                                    stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
            machine = re.search(r"Machine:\\s*(.+)", result.stdout)
            if result.returncode == 0 and machine:
                say("INFO", f"{abi} ELF machine: {machine.group(1).strip()}")
            else:
                say("WARN", f"Could not read ELF header for {abi}")

    if load_calls:
        say("INFO", f"Direct System.loadLibrary calls found: {len(load_calls)}")
        for path, excerpt in load_calls[:20]:
            say("INFO", f"{path}: {excerpt.splitlines()[-1]}")
    else:
        say("WARN", "No direct System.loadLibrary call found; inspect custom/native loader paths")

    say("INFO", "This is a static check only; it cannot prove JNI registration or runtime startup.")
    return 1 if errors or not class_files else 0


if __name__ == "__main__":
    sys.exit(main())
