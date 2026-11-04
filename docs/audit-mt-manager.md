# Audit Referensi MT Manager untuk BF Manager

Tanggal pembaruan: 2026-11-04  
Repositori: `savie/BF-Manager`  
Status: audit statis tahap awal. Metadata APK, struktur paket, permission, komponen, native bridge, inventaris fitur dari resource, dan batasan JADX telah diperiksa. Pemetaan lengkap call-site Smali/JADX serta uji runtime masih harus diselesaikan.

> Tujuan dokumen ini adalah menjadikan APK referensi sebagai sumber kebutuhan fungsional dan kompatibilitas Android, bukan sebagai source code untuk disalin. BF Manager akan menjadi aplikasi Kotlin native yang dikembangkan secara independen.

## 1. Provenance APK

### 1.1 APK yang ditemukan di GPT Library

| Berkas | Ukuran | SHA-256 | Identitas dari binary AndroidManifest |
|---|---:|---|---|
| `MT2.26.11.apk` | 38.601.156 byte | `d4d8790c5597adab39f7dcc8dd7dc81eb9ab9f2e9580d04939550af35186bea9` | `bin.mt.plus`, versionName `2.26.11`, versionCode `26110365` |
| `BΛR☰.apk` | 15.737.978 byte | `699e55de5675e70418cf9a41761c8bf5aa386906d1a8864d08b884cc6df61786` | `com.bareapps.barebackup`, versionName `1.4.6`, versionCode `146` |

APK MT yang ditemukan di Library adalah 2.26.11. Identitas diambil langsung dari binary AndroidManifest, bukan hanya nama file.

### 1.2 Ketidakcocokan artefak repository

File `reference/apktool/apktool.yml` pada branch `master` menyebut:
- `apkFileName: MT_2.26.10.apk`
- `versionName: 2.26.11`
- `versionCode: 26110365`
- `minSdkVersion: 21`
- `targetSdkVersion: 30`

Artinya, hasil dekompilasi yang tersimpan pada `master` kini mencatat provenance 2.26.11, sedangkan APK Library adalah 2.26.11. Hasil dekompilasi yang sekarang ada **tidak boleh dianggap sebagai hasil dekompilasi APK 2.26.11** sebelum artefaknya disinkronkan dan diverifikasi. Audit resource/Smali dari folder tersebut sementara dilabeli referensi 2.26.10 atau provenance belum tersinkron.

Pembaruan 2026-11-04: metadata artefak decode pada master telah diperiksa ulang dan menunjukkan versi 2.26.11; klaim lama 2.26.10 pada snapshot terdahulu tidak lagi berlaku untuk metadata terkini.

### 1.3 Metadata APK 2.26.11

| Atribut | Nilai |
|---|---|
| Package | `bin.mt.plus` |
| Version name | `2.26.11` |
| Version code | `26110365` |
| minSdkVersion | `21` |
| targetSdkVersion | `30` |
| compileSdkVersion | `36` |
| compileSdk codename | `16` |
| DEX files | 5 (`classes.dex` sampai `classes5.dex`) |
| Jumlah entri ZIP | 2.310 |
| ABI native | `arm64-v8a`, `armeabi-v7a`, `x86`, `x86_64` |

Hash SHA-256 mengidentifikasi byte APK yang diaudit. Pemeriksaan saat ini belum memvalidasi sertifikat terhadap sumber distribusi resmi. BF Manager harus memiliki package identity, signing key, dan branding independen.

## 2. Struktur artefak repository

| Lokasi | Peran | Catatan |
|---|---|---|
| `bf_manager/` | Decode/rebuild tree pada branch master | Artefak referensi, bukan source Kotlin baru |
| `reference/apktool/` | Hasil decode Apktool | Metadata menyebut MT 2.26.10 |
| `reference/jadx/sources/` | Hasil decompiler Java | Source-like, bukan source asli |
| `reference/jadx/resources/` | Resource hasil JADX | Pembanding resource |
| `reference/jadx/jadx.log`, `errors.txt` | Diagnostik dekompilasi | Menandai bagian yang gagal direkonstruksi |
| `tools/repair_xml.py` | Utilitas pemulihan nama XML | Tool build untuk artefak decode |
| `.github/workflows/bf-manager-ci.yml` | Workflow build | Saat ini rebuild artefak decode, belum build Kotlin native |

Branch `v1.0` adalah branch dokumentasi/target kerja pada audit ini. Branch `master` menyimpan hasil reverse-engineering besar. Tree `v1.0` yang diperiksa belum memiliki project Gradle/Kotlin; workflow pada master masih membangun artefak decode.

## 3. Manifest, permission, dan komponen

### 3.1 Permission APK 2.26.11

Manifest APK Library mendeklarasikan permission berikut. Daftar ini merupakan inventaris deklarasi, bukan rekomendasi untuk menyalinnya ke BF Manager.

| Kelompok | Deklarasi |
|---|---|
| Jaringan | `INTERNET`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE`, `CHANGE_WIFI_MULTICAST_STATE` |
| Instalasi paket | `REQUEST_INSTALL_PACKAGES`, `REQUEST_DELETE_PACKAGES`, `QUERY_ALL_PACKAGES` |
| Berkas | `READ_EXTERNAL_STORAGE`, `WRITE_EXTERNAL_STORAGE`, `MANAGE_EXTERNAL_STORAGE` |
| UI/sistem | `SYSTEM_ALERT_WINDOW`, `VIBRATE`, `WAKE_LOCK`, `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` |
| Foreground service | `FOREGROUND_SERVICE`, `FOREGROUND_SERVICE_MEDIA_PROJECTION`, `FOREGROUND_SERVICE_SPECIAL_USE` |
| Privilege/OEM | `ACCESS_SUPERUSER`, `com.android.permission.GET_INSTALLED_APPS` |
| Launcher | `com.android.launcher.permission.INSTALL_SHORTCUT`, `com.android.launcher.permission.UNINSTALL_SHORTCUT` |
| Shizuku/Dhizuku | `moe.shizuku.manager.permission.API_V23`, `com.rosan.dhizuku.permission.API` |
| Permission internal | `bin.mt.plus.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` |

Temuan tambahan pada manifest:
- `application` menyetel `usesCleartextTraffic=true`.
- `requestLegacyExternalStorage=true` dan `requestRawExternalStorageAccess=true` dideklarasikan.
- Ada Shizuku provider dengan authority `bin.mt.plus.shizuku`.
- Accessibility service: `bin.mt.function.ar.ActivityRecordService`.
- Ada file provider dengan authority `bin.mt.plus.fp`.
- Foreground service menggunakan tipe `specialUse`, `mediaPlayback`, dan `mediaProjection`.

**Keputusan BF Manager:** jangan menyalin `usesCleartextTraffic`, legacy storage flags, privilege flags, atau seluruh permission referensi. Gunakan Storage Access Framework (SAF) dan persisted URI permission sebagai jalur default. `MANAGE_EXTERNAL_STORAGE` hanya dipertimbangkan untuk fungsi file manager yang benar-benar memerlukannya dan setelah evaluasi aturan distribusi. Setiap permission harus punya alasan, UX izin, fallback, dan test.

### 3.2 Komponen yang dapat dikenali

Nama komponen/alias yang masih dapat dikenali mencakup:
- Entry utama: `bin.mt.plus.Main`, beserta alias icon launcher.
- Open/share: `OpenFileActivity`, `OpenTextActivity`.
- Shortcut: `ShortcutActivity`.
- Viewer: `ImageViewerActivity`, `MusicPlayerActivity`, `VideoPlayerActivity`.
- Tool: `RemoteManageActivity`, `ApkMcpActivity`, `ColorPickerActivity`, `SignatureKeyActivity`, `SmaliQueryActivity`, `ArscQuery`, `CommonPasswordActivity`.
- System: `ScriptExecutor`, `ActivityRecordService`.
- Integrasi plugin, pembayaran, analytics, dan autentikasi pihak ketiga juga terdaftar.

Manifest memiliki lebih dari 140 deklarasi komponen termasuk alias. Daftar ini belum lengkap; komponen vendor/payment/auth tidak otomatis relevan bagi BF Manager.

### 3.3 JNI/native bridge

Output JADX yang tersedia memperlihatkan wrapper native:
- `Features` memuat `libmt1` dan method native seperti `analyze(byte[])`, `deleteFile(String)`, `getABI()`, dan `uid2name(int)`.
- `Features2` memuat `libmt2` dengan `init(...)` serta `installSeccomp(int)`.
- `Features3` memuat `libmt3` dengan low-level operations `listGarbledFileNames`, `read`, `write`, `seek`, `truncate`, `stat0`, `rename`, `delete`, `readlink0`, dan `startMTIO`.

Ini mengindikasikan filesystem/privilege layer penting berada pada native bridge; Java decompiler saja tidak cukup untuk memahaminya. Pemetaan JNI descriptor dan pemanggil harus dilanjutkan. Jangan menyalin .so atau wrapper MT ke project BF Manager.

## 4. Inventaris fitur awal

Daftar di bawah bersumber dari strings dan manifest. Label menu membuktikan adanya indikasi UI, bukan jaminan seluruh perilaku/fomat telah berjalan. Kategori evidence: E1 = manifest/metadata, E2 = resource, E3 = call-site, E4 = runtime, E5 = validasi BF Manager.

| ID | Area | Fitur terindikasi | Bukti saat ini |
|---|---|---|---|
| FM-01 | File Manager | Navigasi direktori, daftar file/folder, multi-select, copy/move/delete/rename, buat folder | E2 |
| FM-02 | File Manager | Bookmark, grup bookmark, hidden files, recycle bin, restore | E2 |
| FM-03 | File Manager | Pencarian nama, wildcard, regex, filter ukuran, export file list | E2 |
| AR-01 | Archive | Viewer, test archive, create/compress, extract, password, common password manager | E2 |
| APK-01 | APK | APK information, extract APK/icon, optimize, zipalign, signing key, signature verification | E2 |
| APK-02 | APK | Install APK/APKS/XAPK melalui system installer, Root, Shizuku, Dhizuku | E1/E2 |
| DEX-01 | DEX | Dex2Jar, Dex2Smali, Dex Editor, Dex Redivision, Dex Comparator, anti-confusion, decrypt strings | E2 |
| RES-01 | Android resources | ARSC editor/comparator/query, AXML editor/comparator, XML batch replace, 9-patch | E2 |
| ED-01 | Editor | Text/code editor, syntax highlight, Markdown preview | E2 |
| ED-02 | Editor | Hex viewer/editor, search, save behavior | E2 |
| VW-01 | Viewer | Image/font viewer | E1/E2 |
| VW-02 | Viewer | Music/video player | E1/E2 |
| UT-01 | Utilities | Checksum, compare/diff | E2 |
| NW-01 | Network | FTP server dan FTP remote manager | E2 |
| NW-02 | Network | HTTP remote manager dan LAN transfer | E2 |
| NW-03 | Network | Network storage, SFTP/WebDAV dan cloud providers | E2; protokol perlu verifikasi |
| SY-01 | System | SAF/storage access dan all-files flow | E1/E2 |
| SY-02 | System | Root/Shizuku/Dhizuku/shell integration | E1/E2 |
| SY-03 | System | Terminal, script executor, floating window | E1/E2 |
| SY-04 | System | Accessibility Activity Record | E1/E2 |
| PL-01 | Extensibility | Plugin manager/viewer, translation/editor plugins | E2 |
| BK-01 | Backup | Local/cloud backup dan restore data pengguna | E2; payload perlu verifikasi |

### 4.1 Batasan feature gate

Resource strings menyebut bahwa fitur APK editing, penyimpanan perubahan Hex Editor, dan sebagian XML search dibatasi VIP pada MT. String tersebut menunjukkan pesan UI/feature gate, tetapi belum memetakan seluruh entitlement runtime.

Requirement BF Manager berbeda: fitur lokal tidak memerlukan login atau subscription. Jangan membawa akun, pembayaran, endpoint, token, maupun entitlement MT ke aplikasi baru.

## 5. Kualitas hasil dekompilasi

Log `reference/jadx/jadx.log` berisi 13.092 baris dan ringkasan:
- 292 error pada proses JADX.
- 1.841 warning dalam 581 node.
- 6 referensi ke unknown classes.
- Peringatan `Code restructure failed: missing block` pada sejumlah method.

Dampaknya: source Java hasil JADX tidak selalu menggambarkan flow yang benar; struktur kontrol bisa hilang/berubah. Nama class/method obfuscated tidak cukup menjelaskan domain. Native .so harus dianalisis terpisah per ABI/JNI. Resource Apktool memiliki placeholder `APKTOOL_RENAMED_*`, bukan nama resource asli.

Aturan audit: untuk flow kritis (filesystem, archive, installer, APK/DEX/resource editor, dan system bridge), cocokkan JADX dengan Smali. Jika masih ambigu, tandai unknown dan jangan jadikan dasar implementasi.

## 6. Build pipeline repository saat ini

Workflow `.github/workflows/bf-manager-ci.yml` saat ini memakai Java 21, Android platform/build-tools 35 dan Apktool 3.0.3; menjalankan `tools/repair_xml.py`; membangun direktori decode `bf_manager/`; mengembalikan nama XML; melakukan zipalign/sign; membutuhkan secret `BF_DEBUG_KEYSTORE_BASE64`; lalu mengunggah APK hasil rebuild.

Workflow itu adalah **pipeline repack/rebuild artefak decode referensi**, bukan pipeline build project Kotlin BF Manager. Ada langkah yang menyatakan folder `app/` belum memiliki Gradle project. Jadi status CI tersebut bukan bukti bahwa aplikasi baru sudah tersedia atau siap rilis.

## 7. Arah arsitektur BF Manager

```text
bf_manager/
  app/                    # Application, navigation, lifecycle
  core/
    common/               # Result, error model, dispatchers
    filesystem/            # FileSystemProvider, SAF, local storage
    permissions/           # Permission state, rationale, fallback
    database/              # Metadata lokal, bookmark, history
    archive/               # Archive adapters dan operation model
    security/              # Keystore, redaction, safe path handling
  feature/
    home/
    filemanager/
    search/
    bookmarks/
    recyclebin/
    editor/
    hex/
    archive/
    apk/
    dex/
    resources/
    media/
    network/
    terminal/
    plugins/
    settings/
  testing/
    fixtures/
    fake-filesystem/
```

Prinsip arsitektur:
- Kotlin native dan modularisasi domain; hindari single giant Activity.
- Domain/use-case tidak bergantung langsung pada Android UI.
- Operasi file melalui interface provider agar local, SAF, dan network storage dapat dikembangkan terpisah.
- Long-running task memakai coroutine/WorkManager sesuai jenis pekerjaan, dengan progress, cancellation, retry aman, dan recovery.
- Write operation menangani konflik nama, partial failure, atomic/temporary file bila memungkinkan, dan cleanup.
- Permission diminta saat fitur memerlukannya, bukan tanpa alasan saat first launch.
- Bookmark/settings disimpan lokal lebih dulu. Cloud backup opt-in dan menggunakan storage pengguna sesuai requirement produk.
- Fitur lokal tidak memiliki login/subscribe gate.
- Package ID, signing key, app label, icon, dan branding BF Manager independen dari MT.

## 8. Prioritas pembangunan

| Prioritas | Modul | Alasan |
|---|---|---|
| P0 | Gradle app skeleton, CI, package identity, navigation, theme, crash handling | Fondasi aplikasi |
| P0 | Filesystem abstraction + SAF + permission UX | Dependency utama file manager/editor |
| P0 | File list, operasi file, progress/cancel, bookmarks | Core experience |
| P1 | Search, filters, hidden entries, recycle bin | Memperluas use-case filesystem |
| P1 | Archive viewer/create/extract + password handling | Engine arsip dan fixture test |
| P1 | Text editor + encoding + large-file mode | Fitur lokal penting |
| P2 | APK info/signature inspection dan install flow | Modul terpisah dari APK rebuild |
| P2 | Hex viewer/editor dan checksum/diff | Bergantung pada file IO |
| P2 | Media/font viewers dan network transfer | Modul opsional |
| P3 | DEX/resource editing, terminal/root/Shizuku, plugin runtime | Kompleksitas dan compatibility tinggi |

## 9. Risiko dan mitigasi

| Risiko | Dampak | Mitigasi |
|---|---|---|
| Repository decode 2.26.10, Library APK 2.26.11 | Salah atribusi fitur/komponen | Pisahkan provenance dan sinkronkan artefak |
| JADX punya 292 errors dan 1.841 warnings | Call-flow keliru | Smali + runtime evidence |
| Native libraries proprietary/tidak dipahami | Porting sulit dan berisiko | Rancang ulang API/native layer sendiri; jangan salin .so |
| File access berbeda per Android version | Operasi gagal di device tertentu | SAF-first dan compatibility matrix |
| Root/Shizuku/Dhizuku tidak tersedia universal | Fitur privilege tidak universal | Modul opsional, core berjalan tanpa privilege |
| File operation gagal di tengah jalan | Data korup/hilang | Temp-file, atomic replace, journaling, cancellation tests |
| Cloud protocol belum diverifikasi | Klaim dukungan keliru | Conformance test tiap provider/protokol |
| Plugin/script execution | Attack surface dan stabilitas | Permission UX, sandboxing, disabled-by-default |
| Asset/library license unknown | Risiko distribusi | SBOM, license inventory, provenance |

## 10. Acceptance criteria

Satu fitur boleh disebut **terpetakan** bila mencatat Feature ID, alur pengguna, evidence source/class/method/resource, evidence level E1-E5, permission/dependency Android, batas ukuran/format, error case, cancellation, data integrity, keputusan desain BF, dan test case.

Satu fitur BF Manager boleh disebut **tervalidasi** bila unit/integration test dan instrumentation test lulus; file besar, nama Unicode/panjang, storage penuh, permission denied, cancellation diuji sesuai konteks; operasi destructive tidak kehilangan/mengkorupsi data; dan CI menghasilkan APK dari source project Kotlin, bukan hasil decode MT.

## 11. Checklist audit lanjutan

### Metadata dan provenance
- [x] APK MT 2.26.11 ditemukan di GPT Library.
- [x] SHA-256 APK MT dihitung.
- [x] Package/version/min/target/compile SDK dibaca dari binary manifest.
- [x] Provenance hasil decode repository `master` diketahui sebagai MT 2.26.10.
- [ ] Sinkronisasi atau pemisahan hasil dekompilasi 2.26.11.
- [ ] Validasi signer certificate/fingerprint dari sumber distribusi tepercaya.

### Manifest dan native
- [x] Inventaris permission dari manifest APK 2.26.11.
- [x] Identifikasi komponen utama, Accessibility service, provider, dan foreground service.
- [x] Identifikasi wrapper JNI `Features`, `Features2`, `Features3` pada output JADX.
- [ ] Pemetaan seluruh komponen ke layar/use-case.
- [ ] Pemetaan permission ke call-site dan fallback nyata.
- [ ] Inventaris JNI method, native symbols, operasi filesystem dan ABI behavior.

### Fitur
- [x] Inventaris awal fitur melalui strings dan manifest.
- [ ] Pemetaan menu/layout/navigation ke Feature ID.
- [ ] Pemetaan Smali/JADX call-site untuk file manager, archive, editor, APK, DEX, resource, network.
- [ ] Verifikasi format arsip, protokol storage, dan format editor.
- [ ] Verifikasi VIP gate dari runtime, bukan string saja.
- [ ] Uji APK referensi pada perangkat/emulator dengan versi Android terdokumentasi.

### Kualitas dan lisensi
- [x] Diagnostik JADX dicatat (292 errors, 1.841 warnings/581 nodes, 6 unknown class refs).
- [ ] Inventaris third-party/native library dan kewajiban lisensinya.
- [ ] Klasifikasi assets proprietary/third-party/open source/unknown.
- [ ] Buat SBOM dan keputusan dependency project BF Manager.

### Persiapan BF Manager
- [ ] Tetapkan scope feature tanpa login/subscribe untuk fitur lokal.
- [ ] Tetapkan minSdk/targetSdk BF Manager sendiri.
- [ ] Tetapkan package ID dan signing key BF Manager.
- [ ] Buat Gradle Kotlin project baru dan native CI.
- [ ] Implementasikan P0 dan tambahkan test evidence per Feature ID.

## 12. Kesimpulan dan status kesiapan

Baseline audit kini memisahkan dua versi: APK di Library adalah MT Manager 2.26.11 (`bin.mt.plus`), sedangkan hasil dekompilasi repository yang ada berasal dari 2.26.10. Manifest 2.26.11, native bridge, feature strings, komponen, diagnostik JADX, serta status build workflow sudah diinventarisasi.

**Status:** siap mulai membuat fondasi P0 dan spesifikasi modul BF Manager. Belum siap mengklaim parity fitur penuh. Sebelum modul kompleks (APK/DEX/resource editing, native filesystem, root/Shizuku) dibangun, audit Smali/call-site serta verifikasi runtime masih wajib.

BF Manager harus menjadi implementasi Kotlin independen. Gunakan hasil audit untuk menentukan fitur/kontrak dan menguji kompatibilitas; jangan memasukkan kode hasil dekompilasi MT, native binaries, signing material, private API, atau asset tanpa hak redistribusi ke source BF Manager.


## Pembaruan audit mendalam (2026-11-04)

Audit lanjutan menelusuri secara langsung wrapper JNI Java/Smali dan resource bookmark. File decode `master/reference/apktool/apktool.yml` menunjukkan MT Manager 2.26.11; JNI declarations pada Features/Features2/Features3 di Smali cocok dengan Java wrapper JADX.

Temuan baru:
- `libmt1`: analyze, deleteFile, getABI, uid2name.
- `libmt2`: init dengan empat String dan installSeccomp.
- `libmt3`: path metadata/delete/rename/readlink/listGarbledFileNames dan handle-based IO read/write/seek/tell/length/truncate/sync.
- Wrapper stat memakai `long[3]`, path UTF-8, dan errno-style return code.
- Resource strings membuktikan add selected files to bookmarks dan Add group; schema persistence belum diketahui.

PENTING: E3 yang tercapai hanya interface-level untuk native wrapper. Belum ada bukti end-to-end caller, provider, root/SAF semantics, bookmark persistence, atau runtime behavior. Jangan klaim mapping filesystem selesai. Kontrak BF harus SAF-first, URI opaque, capability-aware, streaming, explicit conflict policy, dan copy-verify-delete untuk move lintas provider.

Detail dan backlog: `docs/audit-filesystem-jni-permissions-bookmarks.md`.


## Konsolidasi hasil audit JNI dan ELF (2026-11-04)

Hasil pemindaian penuh arsip referensi lokal `MT2.26.11_reference.zip` telah memperbarui status audit sebelumnya:
- Direct descriptor scan `Features3` pada seluruh Smali menemukan 18 referensi eksternal pada 7 file, selain 3 referensi internal wrapper. Pemetaan call-site dan adapter file descriptor sekarang tercatat di [audit filesystem/JNI/permission/bookmark](audit-filesystem-jni-permissions-bookmarks.md) §9.
- Empat ABI `libmt3.so` telah diinventarisasi: ELF metadata, Build ID, SHA-256, dependency, 16 JNI exports, dan filesystem imports. Batasan analisis tercatat di dokumen yang sama §10.
- Ini memperbarui catatan lama yang menyatakan pemindaian call-site lintas DEX dan inventaris ELF belum selesai. Yang selesai baru direct call-site mapping serta ELF inventory; reflection/dynamic invocation, native disassembly, MTIO protocol, permission chain, dan runtime behavior tetap terbuka.

Dokumen audit rinci dipusatkan pada file yang sudah ada di `docs/`; jangan membuat direktori atau salinan laporan audit baru untuk tahap berikutnya. Tambahkan hasil lanjutan ke dokumen kanonis terkait dan perbarui bagian status/backlog yang sudah ada.
