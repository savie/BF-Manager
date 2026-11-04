# Audit Lanjutan dan Backlog Verifikasi

Tanggal: 2026-11-04  
Status: diperbarui setelah penelusuran wrapper JNI/Smali dan strings bookmark pada branch `master`.

## Snapshot repository

- Branch target perubahan: `v1.0`.
- Head sebelum pembaruan: `7129ffeac0be7a293c6541d966793754f93e3a86`.
- Tidak membuat branch baru, tidak mengubah `master`, dan tidak membuat PR.
- `master/reference/apktool/apktool.yml` sekarang mencatat `MT2.26.11.apk`, versionName 2.26.11, versionCode 26110365, minSdk 21 dan targetSdk 30.
- Struktur decode memuat lima roots Smali. `reference/apktool/smali/bin/mt/plus` berisi Features, Features2, Features3, Main. Ini menyediakan titik awal mapping untuk JNI yang mudah dikenali.
- `v1.0` masih berupa dokumentasi dan belum mempunyai project Gradle/Kotlin.
- Workflow `.github/workflows/bf-manager-ci.yml` di master hanya workflow_dispatch dan membangun decode tree Apktool. Tidak dijalankan dalam pekerjaan ini.

## Bukti baru: bookmark

Strings resource membuktikan UI prompt untuk menambahkan beberapa file ke bookmarks, pesan sukses, dan Add group. Ini meningkatkan keyakinan keberadaan fitur/grouping UI, tetapi bukan bukti schema/persistence/reorder/import-export.

## Bukti baru: native wrappers

- `Features` / libmt1: `analyze(byte[])`, `deleteFile(String)`, `getABI()`, `uid2name(int)`.
- `Features2` / libmt2: `init(String,String,String,String)`, `installSeccomp(int)`.
- `Features3` / libmt3: path operations (delete, lastModified, listGarbledFileNames, readlink, rename, stat) dan handle-based IO (length/read/seek/startMTIO/sync/tell/truncate/write/receiveFdResponse).
- Smali declarations cocok dengan wrapper Java hasil JADX. Wrapper metadata mengubah path ke UTF-8 untuk stat, last modified, dan readlink. `stat0` menggunakan output `long[3]`, sukses bila errno/code 0, selain itu menjadi ErrnoException.
- Ini membuktikan interface yang tersedia, bukan alur caller. Belum dapat disimpulkan provider, root, SAF, recursive deletion, symlink policy, ataupun file-handle semantics yang sebenarnya.

## Prioritas berikut

1. Cari call-site seluruh method Features/Features2/Features3 pada lima DEX Smali roots.
2. Telusuri entry file manager, list adapter/menu actions, bookmark handler, dan persistence class.
3. Map permission manifest ke call-site konkret dan Android API.
4. Inventaris libmt*.so per ABI (ELF exports, build-id, JNI symbols) tanpa mengasumsikan native source.
5. Tetapkan fake provider fixtures untuk BF; uji copy/move failure ordering, cancellation, permission revocation, dan bookmark relink.
6. Lakukan runtime test MT bila perangkat/emulator dan APK tersedia; catat versi Android, ABI, langkah, hasil.

## Status

| Area | Status |
|---|---|
| APK metadata / manifest | diperiksa statis |
| JNI wrapper declarations | E3 interface-level |
| JNI callers | belum selesai |
| Filesystem semantics | belum selesai |
| Bookmark UI strings | E2 |
| Bookmark persistence/schema | unknown |
| Permission-to-call-site | belum selesai |
| Runtime parity | belum diuji |
| Kotlin project | belum dibuat |

## Catatan batasan

JADX mempunyai error control-flow dan type inference. Gunakan Smali sebagai sumber utama untuk call-site kritis. Jangan menaikkan feature inventory ke E3 end-to-end dari deklarasi native saja. Implementasi BF harus independen; tidak membawa source hasil decompile, .so MT, credential, entitlement atau asset tanpa hak.


## Pembaruan 2026-11-04: permission flow, installer, dan intent

Audit tambahan dicatat pada `docs/audit-follow-up-permission-installer-intents.md`. Temuan utama:
- Resource menjelaskan akses folder melalui SAF, shell/Shizuku, atau Root pada Android 11+; jalur tersebut harus ditelusuri sebagai adapter berbeda.
- Resource instalasi menjelaskan prioritas Shizuku > Dhizuku > Root > System Installer serta batasan custom install source dan verifikasi signature/version.
- Manifest mendeklarasikan ACTION_VIEW/ACTION_EDIT/ACTION_SEND untuk file/content URI dan MIME family text/image/audio/video/application.
- Smali wrapper JNI telah diverifikasi langsung pada tiga file Features*.smali, tetapi caller dan native semantics belum dipetakan.
- Feature status tetap indicated/E2 atau interface-level; belum ada runtime parity claim.


## Pembaruan 2026-11-04: katalog fitur dari resource

Katalog fitur resource ditambahkan di `docs/audit-feature-catalog-from-resources.md` (blob sumber `strings.xml`: `0da8dbaeb6b451e6ce8fe10e7dad459df30cccff`). Temuan resource memperluas domain yang wajib ditelusuri:
- APK workspace, decompile/build/optimize/sign/install, AXML/ARSC editor/comparator.
- DEX/Smali editor, DEX/JAR conversion, anti-obfuscation, string decryption, class/method/field tooling.
- File operations, batch operations, recycle bin, hidden files, compare, history, bookmark groups/order/import/merge.
- Archive testing/password manager/conflict handling.
- FTP server, network storage, jump host, S3-compatible/cloud providers, cloud backup/restore.
- Hex/text/code/image/font/audio/video/archive/web/SVG viewers and editors.
- Terminal/script, plugin runtime/developer workflow, shortcut, overlay and battery optimization settings.

Semua temuan ini berstatus E2 karena berasal dari resource string. Dokumen menandai dependency permission sebagai leads untuk penelusuran call-site, bukan kesimpulan bahwa permission tertentu pasti diperlukan. Tidak ada feature yang dianggap implemented/validated dari string saja.
