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


## Product scope: mandatory complete parity

Seluruh fitur yang teridentifikasi pada referensi MT Manager menjadi scope wajib BF Manager. Label P0/P1/P2/P3 hanya urutan pengerjaan. Tidak boleh menghapus fitur, meninggalkannya sebagai placeholder, atau mengunci fitur di balik pembayaran.

- Semua fitur gratis; tidak ada VIP/premium/paywall/subscription/IAP/entitlement/license check.
- Tidak perlu login/akun BF Manager.
- Credential protokol remote tetap boleh diminta sesuai autentikasi server, bukan login BF.
- Setiap Feature ID wajib punya implementasi, permission/capability dependency, fallback, acceptance test, dan evidence runtime.
- Seluruh permission/capability yang diperlukan tiap fitur harus didukung dan dimasukkan ke matriks; jangan mengurangi fitur karena permission.
- Gunakan runtime permission, Settings special access, SAF, all-files access, package installer, media projection, overlay, accessibility, network, atau privilege adapter sesuai kebutuhan fitur dan aturan Android.
- Root/Shizuku/Dhizuku/shell harus tersedia sebagai adapter untuk fitur yang memerlukannya, dengan fallback jika memungkinkan.
- Minta permission just-in-time dan tangani denial/revocation. Manifest BF harus memuat seluruh permission yang dibutuhkan fitur BF.
- Parity 1:1 baru boleh diklaim setelah semua Feature ID selesai dan lulus pengujian feature-by-feature.


## Pembaruan katalog resource lanjutan (2026-11-04)

Rincian domain tambahan hasil pembacaan strings.xml dicatat pada `docs/audit-feature-catalog-from-resources.md`. Pemetaan awal ke Feature ID yang sudah ada:
- AP-01..AP-04: APK workspace, decompile/build/optimize, package data multiplexing, APK compare, signing key, install formats and installer adapters.
- DX-01..DX-02: class/method/field tooling, register analysis, DEX/Smali editor, DEX/JAR conversion, anti-obfuscation, mapping/recovery, string decryption.
- RS-01..RS-03: ARSC/AXML editor and comparator, XML batch replace, resource entry repair, nine-patch.
- FM-02..FM-07: batch operations, overwrite/keep-both policies, backup-before-edit, hidden files, history, file/directory compare, extension identification.
- AR-01..AR-04: archive integrity test, encrypted archive password manager/retry, extraction conflict handling.
- ED-01..ED-02 / VW-01..VW-02: code/text/hex/image/font/audio/video/web/SVG viewers and editors; format-specific capabilities need their own acceptance tests.
- NW-01..NW-03 / BK-01: FTP server active/passive and TLS modes, jump host, S3-compatible providers, cloud backup/restore merge semantics.
- SY-02..SY-03 / PL-01: terminal/root su configuration, script executor, plugin viewer/runtime/developer workflow, shortcuts, overlay and battery settings.
- FM-04 / BK-01: bookmark group ordering, pane-aware swipe navigation, import merge/replace, cloud merge preservation.

Ini bukan feature ID baru final dan bukan kenaikan status. Pecah menjadi ID tersendiri bila call-site mengungkap lifecycle, permission, data model, atau acceptance criteria yang berbeda. Semua status tetap `indicated` sampai ada E3/E4 dan implementasi BF teruji.


## Cakupan fitur VIP MT Manager dan OSS 1:1 (2026-11-04)

### Prinsip produk
- Target referensi: MT Manager 2.26.11. Seluruh fitur MT reguler dan VIP masuk cakupan wajib BF Manager.
- BF Manager menyediakan semua fitur tanpa VIP gate, premium gate, login akun BF, subscription, IAP, payment, atau entitlement check.
- Status VIP pada MT hanya metadata referensi; tidak menjadi gate di BF.
- Daftar VIP bersumber dari halaman resmi MT Manager VIP dan perlu ditinjau ulang saat target versi MT berubah.

### Katalog VIP MT Manager

| ID | Fitur VIP MT Manager | Scope BF Manager | Feature ID |
|---|---|---|---|
| VIP-AXML-01 | AXml editing penuh tanpa batas panjang/kecepatan versi gratis | Editor AXML lengkap, pencarian/penggantian, namespace dan round-trip preservation | RS-02 |
| VIP-AXML-02 | AXml code search/replace | Pencarian dan penggantian pada hasil decode AXML/XML | RS-02 |
| VIP-DEX-01 | Smali to Java | Smali-to-Java/decompiler view dengan mapping dan batasan yang terlihat | DX-02 |
| VIP-APK-01 | Custom APK signing keys | Import/generate/manage keystore, sign dan verify | AP-03 |
| VIP-ARSC-01 | Arsc++ editor | Resource table editor penuh | RS-01 |
| VIP-ARSC-02 | Arsc resource query | Query resource ID/name/type/value | RS-01 |
| VIP-DEX-02 | Dex editor++ code flow graph | DEX control-flow graph dan navigation | DX-01 |
| VIP-DEX-03 | Dex repair | DEX validation/repair workflow | DX-01 |
| VIP-DEX-04 | Dex anti-obfuscation | Analysis/deobfuscation helpers dengan explicit scope | DX-02 |
| VIP-DEX-05 | Dex string decryption | String decrypt workflow/custom method support | DX-02 |
| VIP-DEX-06 | Dex repartition | DEX multidex split/repartition | DX-01 |
| VIP-DEX-07 | Dex comparison | Class/method/code-level DEX diff | DX-01 |
| VIP-ARSC-03 | Arsc comparison | Resource table diff | RS-01 |
| VIP-DIFF-01 | Text comparison | Side-by-side text diff, edit, syntax and navigation | UT-01/ED-01 |
| VIP-HEX-01 | Hex editor | Hex view/edit/search, bounded-memory and safe save | ED-02 |
| VIP-APK-02 | Remove APK signature verification | Analysis and patch workflow for authorized test APKs, with audit trail | AP-02/DX-02 |
| VIP-APK-03 | APKS/XAPK to APK conversion | Split-package extraction/selection and output validation | AP-04 |
| VIP-BACKUP-01 | Cloud backup of user data | Local/cloud backup and restore, import/merge semantics | BK-01 |
| VIP-PLUGIN-01 | Plugins (custom translation engine) | Plugin manager/runtime and translation provider API | PL-01 |
| VIP-NET-01 | Multiple network storage support | Remote storage adapters and connection manager | NW-03 |
| VIP-EDITOR-01 | Local backup of file-editor shortcuts | Shortcut/editor profile backup and restore | ED-01/BK-01 |
| VIP-SHORTCUT-01 | Custom icon when creating shortcuts | Shortcut creation with custom icon | SY-03 |

**Catatan:** daftar ini merangkum fitur yang ditampilkan halaman VIP resmi saat ditinjau 2026-11-04. Nama fitur bukan spesifikasi lengkap; detail perilaku, batas versi, dan acceptance test harus dilengkapi dari audit MT dan verifikasi runtime.

### OSS implementation/reference registry

Hanya repository yang memiliki source code yang boleh masuk registry. README saja tanpa source/build structure tidak cukup. Jenis `application` berarti aplikasi Android lengkap; `library` berarti komponen integrasi; `engine` berarti toolchain yang perlu dibungkus adapter; `reference` berarti dipelajari dan bukan otomatis di-copy.

| Domain BF | Repository | Jenis | Lisensi metadata | Verifikasi source/build awal | Peran yang disarankan |
|---|---|---|---|---|---|
| File manager | [MaterialFiles](https://github.com/zhanghai/MaterialFiles) | application/reference | GPL-3.0 | Source Kotlin, Gradle, manifest tersedia | Referensi filesystem/provider, root, remote storage, lifecycle; review GPL sebelum reuse |
| File manager dan APK/DEX toolkit | [Strata](https://github.com/CluvexStudio/Strata) | application/reference | AGPL-3.0 | Source Kotlin, Gradle, manifest, 298 source files terdeteksi | Kandidat benchmark end-to-end paling dekat; audit modul dan kewajiban AGPL terlebih dahulu |
| File manager | [SentryFileManager](https://github.com/void-616/SentryFileManager) | application/reference | GPL-3.0 | Source Kotlin, Gradle, manifest, 750 source files terdeteksi | Referensi tabs, terminal, automation, root, remote storage; upstream berbasis MaterialFiles, cek provenance |
| File manager | [Files](https://github.com/clpsudio/filesmanager) | application/reference | Apache-2.0 (kode proyek; komponen pihak ketiga punya lisensi masing-masing) | Source Kotlin, Gradle, manifest, 291 source files terdeteksi | Referensi vault, bin, offline file manager, viewers; bukan pengganti toolkit APK |
| APK decode/build | [Apktool](https://github.com/iBotPeaches/Apktool) | engine | Apache-2.0 | Source Java dan build project tersedia | Decode/build resources, manifest; adapter dan Android packaging perlu diuji |
| DEX/Smali | [smali](https://github.com/JesusFreke/smali) | engine | Periksa LICENSE pada revision yang dipin | Source Java tersedia; upstream repository archived | Assembly/disassembly; cari maintained fork/alternatif sebelum memilih dependency |
| Java decompiler | [JADX](https://github.com/skylot/jadx) | engine | Apache-2.0 | Source Java dan Gradle build tersedia | Dex-to-Java decompiler backend; evaluasi Android embedding dan resource profile |
| Code editor | [Sora Editor](https://github.com/Rosemoe/sora-editor) | library | LGPL-2.1 | Android editor source/build tersedia | Syntax editor Java/Smali/XML/text; review kewajiban LGPL |
| Root/system API bridge | [Shizuku](https://github.com/RikkaApps/Shizuku) | library/application | Apache-2.0 | Kotlin source/build tersedia | Privileged adapter untuk fitur tertentu; opsional untuk fungsi yang tak memerlukannya |
| Terminal | [Termux](https://github.com/termux/termux-app) | application/reference | Metadata API NOASSERTION; cek LICENSE dan submodule | Android source/build tersedia | Referensi atau integration boundary; jangan embed seluruh Termux tanpa audit ukuran/lisensi |
| ZIP | [Zip4j](https://github.com/srikanth-lingala/zip4j) | library | Apache-2.0 | Java source/build tersedia | ZIP create/extract/password/AES |
| Archive formats | [Apache Commons Compress](https://github.com/apache/commons-compress) | library | Apache-2.0 | Java source/build tersedia | Format tambahan; ukur Android compatibility dan resource limits |
| Archive formats | [libarchive](https://github.com/libarchive/libarchive) | engine | Periksa LICENSE; metadata API NOASSERTION | C source/build tersedia | Native multi-format archive candidate; NDK integration dan codec license audit |


### Matriks cakupan OSS per Feature ID

Kode coverage: `full-candidate` = kandidat mempunyai implementasi fitur sejenis dan perlu verifikasi parity; `partial` = hanya sebagian; `reference` = arsitektur/pola, bukan drop-in; `missing` = belum ada kandidat source tervalidasi. Coverage bukan status implementasi BF.

| Feature ID | Domain/fungsi | Kandidat source code | Coverage awal | Catatan verifikasi/pekerjaan tersisa |
|---|---|---|---|---|
| FM-01 | Browse, list/grid, breadcrumb, dual pane | MaterialFiles; Strata; SentryFileManager | partial | Strata mengklaim dua pane; audit provider URI, navigation, sorting, lifecycle. |
| FM-02 | Copy/move/delete/rename/multi-select | MaterialFiles; Strata; SentryFileManager; Files | partial | Audit conflict policies, partial failures, SAF/root/provider semantics dan batch cancellation. |
| FM-03 | Create file/folder dan naming policy | MaterialFiles; Strata; Files | partial | Uji document providers, Unicode, collision, atomic writes. |
| FM-04 | Bookmark/group/order | MaterialFiles; Strata; SentryFileManager | partial | Cocokkan group, pane-aware navigation, import/merge semantics referensi MT. |
| FM-05 | Hidden files/recycle bin | Strata; Files | partial | MaterialFiles/SentryFileManager patterns; verifikasi restore semantics dan SAF support. |
| FM-06 | Advanced search | Strata; SentryFileManager; Files | partial | Regex/wildcard/content/date/size scope dan indexing belum disamakan. |
| FM-07 | Sort/export/properties | MaterialFiles; Strata; Files | partial | Periksa metadata nullable, file attributes, SELinux/POSIX metadata. |
| AR-01 | Archive view/test/integrity | Strata; Apache Commons Compress; libarchive | partial | Validasi format matrix, encrypted, split archives, integrity and decompression limits. |
| AR-02 | Archive create/password | Zip4j; Strata; Apache Commons Compress; libarchive | partial | Zip4j mencakup ZIP; format non-ZIP perlu backend lain dan tests. |
| AR-03 | Archive extraction/conflict/path safety | Strata; Zip4j; Apache Commons Compress; libarchive | partial | Audit traversal defense, symlink, duplicate paths, permissions, cancellation. |
| AR-04 | Password retry/list workflows | Strata | missing | Tidak ada kandidat terverifikasi untuk perilaku password-list/import/retry spesifik MT. |
| AP-01 | APK metadata/signature inspection | Strata; Apktool; Android SDK apksig | partial | Metadata parser, v1-v4 signatures, source stamp, multiple signers. |
| AP-02 | APK extract/optimize/decompile/build | Apktool; Strata | partial | Apktool build pipeline; zipalign/apksig; deterministic rebuild; preserve unknown chunks. |
| AP-03 | Keystore management/sign/verify | Strata; Android build-tools apksig | partial | User-owned keys, export/import, key recovery, fingerprint and v1-v4 verification. |
| AP-04 | APK/APKS/XAPK install/convert | Strata; Android PackageInstaller; bundletool | partial | Split selection, XAPK parsing, Shizuku/root adapters, installer confirmations. |
| DX-01 | DEX viewer/edit/compare/repartition/repair/CFG | Strata; smali; dexlib2 (part of smali project) | partial | Verify code editing, multidex, CFG, repair and safe write; smali upstream archived. |
| DX-02 | DEX/Smali conversion, deobfuscation, string decrypt | Strata; smali; JADX | partial | Smali→Java needs decompiler mapping; custom decrypt routines are feature-specific, not generic lib capability. |
| RS-01 | ARSC inspect/edit/compare/query | Strata | partial | Validate parser/writer round-trip, complex qualifiers, sparse entries, unknown chunks, compare. |
| RS-02 | AXML/Manifest/XML edit/search/replace | Strata; Apktool | partial | Validate binary XML round-trip, namespace/attribute preservation, batch replace, limits. |
| RS-03 | 9-patch edit/render | Strata | partial | Validate chunk parsing, stretch/padding regions, density variants and compile round-trip. |
| ED-01 | Text/code editor, syntax, shortcut backup | Sora Editor; Strata | partial | Large-file behavior, grammar packs, encoding, safe save, editor profile backup. |
| ED-02 | Hex editor/compare | Strata | partial | Chunked byte source exists; validate editing/undo/diff, large files and save integrity. |
| VW-01 | Image/font viewer/EXIF | Strata; Files | partial | EXIF details, animated/vector formats, sampling, huge images, font metadata. |
| VW-02 | Audio/video/media player | Strata; AndroidX Media3 | partial | Playlist, background playback, subtitles, M3U8/network headers and lifecycle. |
| UT-01 | Checksums/text/binary compare | Strata; Apache Commons Codec (candidate requires repo/license validation) | partial | Hash streaming and full diff semantics need coverage tests. |
| NW-01 | FTP server/client | Strata; SentryFileManager | partial | Auth modes, passive/active, TLS, lifecycle, background restrictions. |
| NW-02 | HTTP/LAN transfer | Strata; SentryFileManager | partial | Upload/download, bearer token, expiry, interrupted transfer and TLS. |
| NW-03 | FTP/SFTP/SMB/WebDAV/S3/cloud providers | Strata; MaterialFiles; SentryFileManager | partial | Protocol implementation per provider, credential vault, host-key validation and cloud SDKs. |
| SY-01 | SAF/storage/all-files | MaterialFiles; Strata; Files | partial | Build target-specific permission matrix and Android 11+ flows; no broad permission assumption. |
| SY-02 | Root/Shizuku/Dhizuku/shell adapters | Shizuku; MaterialFiles; Strata; SentryFileManager | partial | Distinguish Shizuku API source from root implementation; permission and fallback tests. |
| SY-03 | Terminal/script/shortcuts/overlay | Termux; Strata; SentryFileManager | partial | Process lifecycle, PTY, command environment, script safety, shortcut icon path. |
| SY-04 | Activity record/accessibility/layout inspection | Strata? (not yet verified); Android APIs | missing | Do not assign Strata until source implementation verified; Android accessibility/API design audit needed. |
| PL-01 | Plugin manager/runtime/translation plugins | Strata | partial | Audit PluginProtocol/PluginRunner, sandbox/capabilities, signing and compatibility. |
| BK-01 | Local/cloud backup/restore/merge | Strata; Files (local-only areas) | partial | Need cloud provider adapters and MT bookmark/network-storage merge semantics. |

### Fitur MT VIP yang belum punya kandidat OSS terverifikasi

- Password manager/retry/import-export behavior spesifik archive (VIP-AR-04).
- Full resource-table repair and complex ARSC compare semantics beyond basic parser/writer.
- DEX anti-obfuscation, custom string-decryption workflow and repair parity.
- Remove APK signature verification workflow: requires precise scope and authorized test cases; no drop-in OSS candidate established.
- Cloud backup preserving MT-style bookmarks/network storage merge semantics.
- Custom file-editor shortcut backup and shortcut icon assignment parity.
- Activity/layout inspection matching MT 2.26.11.

Untuk semua item tersebut, status `missing` berarti belum ditemukan kandidat source code yang memenuhi perilaku yang sama; bukan berarti mustahil dibuat.
### Batas registry dan metode verifikasi
- Registry ini adalah discovery awal, bukan rekomendasi untuk meng-copy seluruh aplikasi.
- Setiap kandidat wajib dicek: source/build files, aktivitas upstream, license file, dependency/transitive license, Android compatibility, API surface, tests, security posture, native requirements, dan maintenance state.
- Pin exact commit/tag dan evaluasi file LICENSE pada revision tersebut. Metadata GitHub API boleh kosong/tidak lengkap dan tidak menggantikan file LICENSE.
- GPL/AGPL/LGPL dapat menimbulkan kewajiban distribusi source, relinking/replacement, attribution, atau batas distribusi. Jangan integrasikan sebelum review kompatibilitas lisensi produk.
- Fork/snapshot tanpa provenance jelas tidak boleh dianggap setara dengan upstream.
- NP Manager dan MP Manager tidak dimasukkan sebagai dependency karena belum ada source app yang diverifikasi.
- Jangan menaikkan status Feature ID menjadi implemented hanya karena library ditemukan. Wajib ada integrasi BF dan test.

### Kandidat prioritas integrasi
1. Audit Strata secara mendalam sebagai kandidat referensi end-to-end paling dekat dengan cakupan BF; verifikasi implementasi file per file, bukan hanya README.
2. Audit MaterialFiles dan SentryFileManager untuk filesystem, root, remote providers, terminal, dan lifecycle.
3. Evaluasi engine terpisah: Apktool + smali/baksmali + JADX; buktikan pipeline resource/DEX/build pada target Android.
4. Evaluasi Sora Editor, Zip4j, Commons Compress, dan Shizuku sebagai library/adapters.
5. Petakan tiap Feature ID ke satu atau lebih kandidat dengan coverage `full`, `partial`, `reference`, `missing`, atau `license-blocked`.
6. Bila kandidat tidak memiliki source, build setup, atau lisensi yang jelas, keluarkan dari daftar dependency dan catat sebagai missing.
