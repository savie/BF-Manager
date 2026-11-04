# Inventaris Fitur Referensi untuk BF Manager

Tanggal: 2026-11-04  
Status: baseline awal dari resource/manifest; belum seluruhnya diverifikasi melalui call-site dan runtime.

Dokumen ini melengkapi `audit-mt-manager.md`. Feature ID dipakai lintas spesifikasi, issue, implementasi, dan test.

## Kode evidence
- **E1** — metadata atau manifest.
- **E2** — resource string, layout, atau menu.
- **E3** — call-site UI sampai domain operation/API telah ditelusuri.
- **E4** — perilaku diuji pada APK referensi dan environment dicatat.
- **E5** — implementasi BF Manager lulus test suite.

Status: `indicated` (ada indikasi), `tracing` (penelusuran berjalan), `specified` (kontrak ditulis), `implemented`, `validated`, atau `blocked`.

| ID | Domain | Kapabilitas | Evidence sekarang | Status |
|---|---|---|---|---|
| FM-01 | File Manager | Navigasi direktori dan list/grid file/folder | E2; main component E1 | indicated |
| FM-02 | File Manager | Multi-select, copy/move/delete/rename | E2 | indicated |
| FM-03 | File Manager | Buat file/folder dan konflik overwrite/keep-both | E2 | indicated |
| FM-04 | File Manager | Bookmark dan group management | E2 | indicated |
| FM-05 | File Manager | Hidden files dan recycle bin/restore | E2 | indicated |
| FM-06 | File Manager | Name search, wildcard, regex, size filter | E2 | indicated |
| FM-07 | File Manager | Sort, export file list, file properties | E2 | indicated |
| AR-01 | Archive | Archive viewer dan archive testing | E2 | indicated |
| AR-02 | Archive | Create/compress dengan password opsional | E2 | indicated |
| AR-03 | Archive | Extract ke current/new folder/another pane | E2 | indicated |
| AR-04 | Archive | Common password list dan retry behavior | E2 | indicated |
| AP-01 | APK | Package metadata dan signature inspection | E2 | indicated |
| AP-02 | APK | Extract APK/icon, optimize, zipalign | E2 | indicated |
| AP-03 | APK | Sign APK dengan imported/generated key | E2 | indicated |
| AP-04 | APK | Install APK/APKS/XAPK via system/Shizuku/Dhizuku/root | E1/E2 | indicated |
| DX-01 | DEX | DEX viewer/editor, redivision, compare | E2 | indicated |
| DX-02 | DEX | Dex2Jar, Dex2Smali, anti-confusion, decrypt strings | E2 | indicated |
| RS-01 | Resources | ARSC query/editor/compare | E2 | indicated |
| RS-02 | Resources | AXML/manifest edit/compare dan XML batch replace | E2 | indicated |
| RS-03 | Resources | 9-patch editor dan color picker | E2 | indicated |
| ED-01 | Editor | Text/code editor, syntax highlight, Markdown preview | E2 | indicated |
| ED-02 | Editor | Hex viewer/editor, search dan save behavior | E2 | indicated |
| VW-01 | Viewer | Image/font viewer | E1/E2 | indicated |
| VW-02 | Viewer | Music/video player | E1/E2 | indicated |
| UT-01 | Utilities | Checksum dan binary compare/diff | E2 | indicated |
| NW-01 | Network | FTP server dan FTP remote manager | E2 | indicated |
| NW-02 | Network | HTTP remote manager dan LAN transfer | E2 | indicated |
| NW-03 | Network | Network storage, SFTP/WebDAV dan cloud providers | E2; protocol pending | indicated |
| SY-01 | System | SAF/storage access dan all-files flow | E1/E2 | indicated |
| SY-02 | System | Root/Shizuku/Dhizuku/shell integration | E1/E2 | indicated |
| SY-03 | System | Terminal, script executor, floating window | E1/E2 | indicated |
| SY-04 | System | Accessibility Activity Record | E1/E2 | indicated |
| PL-01 | Extensibility | Plugin manager/viewer, translation/editor plugins | E2 | indicated |
| BK-01 | Backup | Local/cloud backup dan restore data pengguna | E2; payload pending | indicated |

## Prioritas awal BF Manager

| Prioritas | Feature ID | Target |
|---|---|---|
| P0 | FM-01..FM-04, SY-01 | File browser, operasi dasar, SAF, bookmark |
| P0 | BK-01 subset lokal | Preferensi dan bookmark lokal |
| P1 | FM-05..FM-07 | Recycle bin, pencarian dan metadata |
| P1 | AR-01..AR-04 | Archive reader/create/extract |
| P1 | ED-01 | Editor teks/code |
| P2 | AP-01..AP-04, ED-02, VW-01..VW-02, UT-01 | Tools lanjutan dan viewers |
| P3 | DX-01..DX-02, RS-01..RS-03, NW-01..NW-03, SY-02..SY-04, PL-01 | Modul kompleks dan integrasi privilege |

## Langkah menaikkan evidence

1. Telusuri resource ID/menu ID ke click listener atau navigation destination.
2. Ikuti UI event sampai domain operation, lalu catat class/method Smali/JADX.
3. Cocokkan JADX dengan Smali untuk flow yang mengalami missing block/error.
4. Jalankan fungsi referensi dengan fixture dan catat Android version, input, hasil, error, serta batasan.
5. Ubah evidence level setelah bukti tersedia; jangan menganggap label menu sebagai bukti dukungan format/runtime.


## Catatan implementasi dan verifikasi

Pada snapshot `v1.0` tanggal 2026-11-04, seluruh entri masih berstatus `indicated`: daftar ini berasal dari bukti MT, bukan status implementasi BF Manager. Gunakan `docs/feature-acceptance-criteria.md` untuk Definition of Done per Feature ID dan `docs/bf-manager-p0-spec.md` untuk kontrak P0. Status hanya boleh dinaikkan setelah commit implementasi dan bukti test/call-site dicantumkan.


## Pembaruan audit JNI dan bookmark (2026-11-04)

Bukti tambahan statis dari `master`:
- Bookmark: resource string prompt add selected files to bookmarks, success message, dan Add group (E2). Schema/persistence belum diketahui.
- JNI wrapper Features/libmt1, Features2/libmt2, Features3/libmt3: declarations dan Smali cocok (E3 interface-level). Caller belum dipetakan sehingga feature behavior tetap `indicated`.
- Filesystem contract BF: provider URI opaque, capability-aware operations, explicit conflict policy, copy-verify-delete untuk cross-provider move, partial outcomes, streaming/cancellation.
- Permission decisions: SAF-first; persisted grants; `MANAGE_EXTERNAL_STORAGE` bukan default; privilege bridges optional.

Feature inventory tidak dinaikkan ke `implemented` atau `validated`. Lihat `docs/audit-filesystem-jni-permissions-bookmarks.md` untuk evidence, kontrak, dan backlog lengkap.
