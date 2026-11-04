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


## Pembaruan 2026-11-04: struktur source dan hambatan call-site

Penelusuran repository reference di branch `master` menemukan:
- APK referensi: `reference/MT2.26.11.apk` (38,601,156 bytes; blob `8bb45032be77496b2f770238189008d689b2ae9b`).
- Hasil JADX berada di `reference/jadx/sources`, terpisah dari hasil Apktool Smali.
- Package utama `reference/jadx/sources/bin/mt/plus` memiliki `Main.java` (1,080,780 bytes; blob `d66181b71f35dbb543791144d4f085e4d879480b`), `R.java` (1,419,941 bytes), `ShortcutActivity.java`, dan tiga wrapper Features*.java.
- `reference/apktool/smali/bin/mt/plus/Main.smali` berukuran 1,220,058 bytes. Fetch potongan file melalui connector menghasilkan konten kosong, sedangkan beberapa resource menu di Apktool tersimpan sebagai binary XML dan tidak dapat dibaca sebagai UTF-8 biasa. Karena itu belum aman untuk mengklaim bahwa menu/call-site sudah berhasil dipetakan.
- Repository memuat lima roots Smali (`smali`, `smali_classes2` sampai `smali_classes5`). Penelusuran selanjutnya perlu memakai Git tree/blob atau ekstraksi lokal APK untuk pencarian lintas root, bukan hanya fetch satu file raksasa.

Implikasi audit:
1. Wrapper Features*.java/Smali tetap bukti interface JNI saja.
2. Nama resource/menu yang di-rename menjadi `APKTOOL_RENAMED_*` tidak cukup untuk menyimpulkan fungsi menu tanpa decode binary XML dan korelasi `R.java`/handler.
3. Main.java dan Main.smali berukuran sangat besar; hasil JADX tidak boleh diperlakukan sebagai satu-satunya sumber kebenaran. Call-site kritis harus dikonfirmasi di Smali.
4. Belum ada bukti runtime untuk installer, SAF, Shizuku/Dhizuku, root, bookmark persistence, atau operasi filesystem. Semua tetap backlog verifikasi.

Status tambahan: struktur JADX/Smali roots teridentifikasi (E1/E2); call-site Features JNI lintas DEX belum selesai; pemetaan menu-resource-to-handler belum selesai.


## Pembaruan 2026-11-04: pemeriksaan blob Main dan native ABI

Pemeriksaan dilakukan memakai Git blob API agar file besar tidak terpotong oleh fetch potongan teks:

- Blob `Main.smali` (`62e12fa0796baa2c4e06b97e61cbed50c17365f2`, 1,220,058 bytes) berhasil dibaca utuh. Pencarian literal descriptor `Lbin/mt/plus/Features;->`, `Features2`, `Features3`, `startMTIO`, `installSeccomp`, dan `deleteFile` pada Main.smali menghasilkan nol hit.
- Blob `Main.java` JADX (`d66181b71f35dbb543791144d4f085e4d879480b`, 1,080,780 bytes) juga berhasil dibaca utuh. Pencarian literal `Features`, `Features2`, `Features3`, `startMTIO`, `installSeccomp`, `deleteFile`, `mt1`, `mt2`, dan `mt3` menghasilkan nol hit.
- Ini adalah hasil negatif terbatas pada class Main; bukan bukti bahwa pemanggil JNI tidak ada. Call-site kemungkinan berada pada class obfuscated di root Smali lain dan tetap perlu ditemukan.
- Native library reference terkonfirmasi ada pada setidaknya ABI `arm64-v8a` dan `armeabi-v7a`: `libmt1.so`, `libmt2.so`, `libmt3.so`, serta `libmtprotect.so`. Untuk arm64-v8a blob SHA: libmt1 `753bec7aa7ef9b1d07a0a8ae3ac599fa7d2a03d0`, libmt2 `9a7fbc924847f1b5a3f68ba8ed69f7b05965b272`, libmt3 `dd73630e560cf3cf556b795bdcddfa4af6a90da0`, libmtprotect `70ec038e70918b21935d0b19a82b0f4544a29bf8`.
- Untuk armeabi-v7a: libmt1 `0fae753067522914c519e3dfe96e78ea0d28afd8`, libmt2 `92aa6f58219257364aea17d069c25e122970233f`, libmt3 `c01edeed30fb1356962ba1c3ef2a01352660d8f7`, libmtprotect `226df77101e51aa3b02b11afc4dd7acf5d959e37`.

Konsekuensi teknis: Main bukan call-site langsung JNI yang dicari. Penelusuran berikutnya harus memindai descriptor di seluruh blob Smali pada lima DEX roots, termasuk class obfuscated. Native .so hanya dicatat sebagai artefak referensi; tidak akan disalin ke BF Manager. Untuk BF, implementasi native harus ditulis ulang secara independen setelah kontrak perilaku dan pengujian ditetapkan.



## Pembaruan 2026-11-04: pemetaan skala DEX obfuscated untuk audit JNI

Git tree API pada branch referensi `master` dipakai untuk memetakan root Smali secara terpisah (tree recursive penuh pada subtree obfuscated, tanpa mengubah branch referensi):

| Root | Subtree obfuscated | Jumlah entry Smali |
|---|---|---:|
| `smali_classes2/l` | `b0c4954d880f27f396d31dbc2f36a2a3e18308be` | 3.157 |
| `smali_classes3/l` | `f88d341e82d967019691b54af386d009f977f4d2` | 6.857 |
| `smali_classes4/l` | `db6206d22e671dd80c30efc808e20a27d94bec38` | 6.783 |
| `smali_classes5/l` | `d9541553016fb2727171b6f13b156c7caa9bd0f7` | 4.828 |
| **Total** | | **21.625** |

Temuan ini mengonfirmasi bahwa pencarian JNI caller bukan pekerjaan satu atau dua class: empat subtree obfuscated saja memuat 21.625 file Smali. Pencarian GitHub code-search sebelumnya tidak mengembalikan hasil untuk descriptor wrapper; hasil kosong tersebut tidak dapat dipakai sebagai bukti tidak ada call-site. Pemindaian blob secara menyeluruh masih diperlukan.

Batasan dan keputusan:
- Angka di atas adalah jumlah entry Smali pada subtree `l`, bukan jumlah seluruh class dalam APK dan bukan jumlah call-site JNI.
- Hasil pemeriksaan `Main.smali` yang nihil tetap hanya berlaku untuk class Main.
- Belum ada class obfuscated yang dapat dinyatakan sebagai pemanggil Features1/2/3 berdasarkan bukti yang tervalidasi pada tahap ini.
- Audit ELF/JNI registration pada file .so juga belum selesai; SHA artefak native yang dicatat di atas hanya inventaris file.
- Tidak boleh menyimpulkan kontrak filesystem dari nama native method. Setiap caller harus dikorelasikan dengan argumen, return value, penanganan errno/exception, dan jalur permission sebelum spesifikasi BF ditetapkan.

Langkah berikutnya:
1. Ekstrak APK referensi secara lokal atau lakukan pemindaian blob terkontrol pada seluruh 21.625 file untuk descriptor `Lbin/mt/plus/Features;`, `Features2;`, dan `Features3;` serta pemanggilan reflection/JNI terkait.
2. Setelah caller ditemukan, telusuri alur ke UI/worker dan permission adapter; catat call-site Smali beserta signature dan konteks minimal.
3. Analisis ELF per ABI (architecture, exported/dynamic symbols, JNI_OnLoad/registration, dependencies, build-id) hanya untuk memahami interface; tidak menyalin binary ke BF.
4. Update feature inventory dan acceptance criteria hanya setelah bukti caller/semantik cukup, lalu tambahkan test contract untuk implementasi BF independen.


## Koreksi status setelah pemindaian arsip lokal (2026-11-04)

Bagian historis di atas mencatat keadaan sebelum arsip referensi lengkap dipindai. Status tersebut kini diperbarui sebagai berikut:

- Pemindaian descriptor langsung `Lbin/mt/plus/Features3;->` telah dilakukan terhadap seluruh Smali dalam `MT2.26.11_reference.zip`: 21 referensi tekstual (3 internal wrapper dan 18 eksternal pada 7 file Smali).
- Adapter handle I/O, direct caller `startMTIO`, dan callback `receiveFdResponse` telah dipetakan pada tingkat Smali. Ini belum menyelesaikan parameter/protokol MTIO atau permission chain.
- `libmt3.so` telah diinventarisasi untuk empat ABI, termasuk Build ID, SHA-256, dependencies, 16 JNI exports, dan imports POSIX/Bionic.
- Disassembly semantik native, reflection/dynamic invocation, permission/provider call-chain, dan runtime tests masih belum selesai.

Untuk menghindari duplikasi, rincian dan bukti primer dipusatkan pada `docs/audit-filesystem-jni-permissions-bookmarks.md` §9–§11. Bagian ini menjadi status/backlog ringkas; jangan membuat laporan atau folder audit baru untuk temuan lanjutan.

### Backlog aktif (urutan berikutnya)

1. Trace worker `run()V`: asal argumen `startMTIO`, state machine, dan return status.
2. Trace `receiveFdResponse`: callback, protokol, dan transfer descriptor.
3. Disassemble kedua JNI function tersebut pada arm64-v8a, lalu bandingkan ABI lain.
4. Trace factory `ParcelFileDescriptor` sampai permission/capability provider.
5. Baru setelah itu lanjutkan semantik filesystem native lain dan update dokumen kanonis yang sama.


## Status audit terbaru setelah AUD-01R dan disassembly awal (2026-11-04)

Status pada bagian historis sebelumnya tetap dipertahankan sebagai catatan waktu. Tabel ini adalah status aktif terbaru dan menjadi acuan sesi berikutnya.

| ID | Pekerjaan | Status terbaru | Catatan |
|---|---|---|---|
| AUD-01 | Direct JNI Call-Site Mapping | Selesai | Direct descriptor Features3 pada seluruh Smali telah dipetakan; lihat dokumen kanonis §9. |
| AUD-01R | Reflection dan dynamic invocation | Partial | Scan statis seluruh 33.491 Smali tidak menemukan bukti eksplisit reflection/MethodHandle ke Features3. Reflection umum ditemukan; string decoder/dynamic DEX/native registration belum tertutup. Lihat §12. |
| AUD-02 | Native Filesystem Semantics | Partial | Path operations, handle I/O (read/write/fsync/lseek/fstat/ftruncate), dan listGarbledFileNames telah dianalisis pada arm64-v8a. Cross-ABI, runtime, permission chain, serta error/race verification masih terbuka. Lihat §13 dan §15. |
| AUD-03 | ELF Inventory | Awal selesai | Empat ABI libmt3.so telah diinventarisasi pada tingkat ELF metadata, exports, imports, Build ID, dan SHA-256. |
| AUD-03R | Disassembly libmt3.so | Partial | startMTIO/receiveFdResponse, SCM_RIGHTS, PFD handoff, server LocalSocket/TCP, serta cross-ABI exports/imports terpetakan. Helper command/state machine, asal argumen worker, peer launcher, dan cross-ABI instruction comparison belum selesai. Lihat §14, §16–17. |
| AUD-04 | Permission Mapping | Partial | Transport interface, LocalSocket FD capability, TCP fallback, LocalServerSocket/ServerSocket acceptor, guard Android/data/obb API 30+, serta provider interface C4013/C11762 dan capability delegation terpetakan. Isi method provider utama, helper capability C7756, peer launcher, privilege context, dan permission chain masih terbuka. Lihat §16–17. |
| AUD-05 | Feature Inventory | Pending | Sinkronkan Feature ID dan evidence hanya setelah audit caller/permission cukup; jangan klaim parity dari string/resource saja. |

### Urutan kerja berikutnya

1. Lanjutkan AUD-01R secara terarah: telusuri string decoder dan dynamic loading hanya pada class yang membangun/menjalankan worker MTIO; jangan audit seluruh reflection call-site tanpa target.
2. Selesaikan AUD-02: kontrak newStringUTF, error-path/race review, dan perbandingan instruction-level arm64 dengan ABI lain.
3. Lanjutkan AUD-03R: temukan pembentuk String[] worker (khusus elemen 1/2), peer launcher yang menerima socket name/port, lalu rekonstruksi command/state machine helper MTIO dan lifecycle descriptor.
4. Lanjutkan AUD-04: telusuri C7756 sebagai sumber capability C11762, rekonstruksi method callback C11762.mo4910(String, boolean)/mo4909(int), cari peer launcher yang menerima socket name/port, lalu petakan privilege context dan permission/provider chain.
5. Setelah evidence caller dan permission cukup, sinkronkan Feature Inventory dan acceptance criteria (AUD-05).

### Catatan eksekusi

- Arsip sumber tetap `/mnt/data/files/MT2.26.11_reference.zip`, SHA-256 `79be2c8909585b002e7c8e0dac0e61eec3dfa1e33f9a75e4abd43ea88821c7ed`; arsip tersedia di workspace dan tidak diunduh ulang.
- Binary arm64 diekstrak sementara ke `/tmp/libmt3-arm64.so` hanya untuk disassembly; tidak ditambahkan ke repository.
- Semua hasil baru ditambahkan ke dokumen kanonis yang sudah ada. Tidak ada direktori atau laporan audit baru yang dibuat.
