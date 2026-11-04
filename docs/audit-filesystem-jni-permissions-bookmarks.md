# Audit Mendalam: File Manager, Filesystem, JNI, Permission, dan Bookmark

Tanggal: 2026-11-04  
Branch: `v1.0`  
Referensi: MT Manager 2.26.11; hasil decode pada `master`  
Status: audit statis lanjutan, sebagian bukti interface-level tersedia; call-site filesystem penuh dan runtime belum tervalidasi.

## 1. Ruang lingkup dan provenance

Audit ini membaca metadata decode, binary manifest hasil Apktool, wrapper JNI Java/Smali yang tidak obfuscated, serta strings resource. Data dipakai untuk menetapkan kebutuhan dan kontrak BF Manager, bukan menyalin implementasi MT.

Metadata `reference/apktool/apktool.yml` pada `master` menunjukkan:
- APK input: `MT2.26.11.apk`
- package: `bin.mt.plus` (dikonfirmasi manifest)
- versionName: `2.26.11`
- versionCode: `26110365`
- minSdk 21, targetSdk 30
- hasil decode memisahkan lima DEX/smali roots.

SHA/blob yang dipakai untuk audit:
- `apktool.yml`: `9bcea2a820dc0ea55d611320b7eadc123cd790ad`
- `AndroidManifest.xml`: `ed8380e848686abc29398c525a6bd8dc1487856e`
- `Features.java`: `e5ae69ca5e88afe2615d5eb7ac887a65f5523583`
- `Features2.java`: `63703016e589cffc3cf55450a9ea58dd270011e9`
- `Features3.java`: `aee3a40bc64f64f1a3028ff80af4fe687508c381`
- `Features3.smali`: `1b2cdf0db7009f5d184adf80e034f5527d722e65`

## 2. Bukti bookmark: fungsi terlihat, model data belum diketahui

Resource strings di `reference/apktool/res/values/strings.xml` mempunyai kalimat:
- `Do you want to add the selected %d files to bookmarks?`
- `Added to bookmarks successfully`
- `Add group`

Ini memperkuat bahwa MT mempunyai operasi menambahkan beberapa item ke bookmark dan pengelompokan bookmark. Evidence masih E2 (resource). Belum ditemukan bukti yang cukup untuk menyatakan:
- format storage (database, preferences, file, atau lainnya);
- schema item/group dan stable ID;
- apakah bookmark dapat menyimpan folder maupun file;
- persistence lintas restart/update;
- perilaku ketika target dihapus, dipindah, atau permission dicabut;
- impor/ekspor/sinkronisasi bookmark;
- drag reorder atau urutan manual.

### Kontrak BF Manager

Bookmark harus memakai provider identity, bukan hanya string path/display name:
- `bookmarkId`: UUID lokal.
- `location`: URI opaque milik provider.
- `providerId`: identitas adapter.
- `displayNameSnapshot`: label terakhir yang diketahui.
- `groupId`: nullable.
- `sortOrder`: integer stabil.
- `createdAt`, `updatedAt`.
- `grantState`: persisted / unavailable / revoked / needs_relink.

Saat load, validasi URI/grant secara lazy. Jangan hapus bookmark rusak otomatis. Tawarkan relink, remove bookmark, atau retry. Rename/move melalui BF Manager harus memperbarui referensi bila provider mengembalikan URI baru. Operasi di luar aplikasi dapat menyebabkan bookmark stale, jadi UI harus mampu menandai target hilang.

Schema awal yang disarankan:

```sql
CREATE TABLE bookmark_group (
  id TEXT PRIMARY KEY NOT NULL,
  name TEXT NOT NULL,
  sort_order INTEGER NOT NULL,
  created_at INTEGER NOT NULL
);

CREATE TABLE bookmark (
  id TEXT PRIMARY KEY NOT NULL,
  provider_id TEXT NOT NULL,
  location_uri TEXT NOT NULL,
  display_name TEXT NOT NULL,
  group_id TEXT,
  sort_order INTEGER NOT NULL,
  created_at INTEGER NOT NULL,
  updated_at INTEGER NOT NULL,
  grant_state TEXT NOT NULL,
  FOREIGN KEY(group_id) REFERENCES bookmark_group(id)
);
CREATE INDEX bookmark_group_order
  ON bookmark(group_id, sort_order);
```

Schema tersebut rancangan BF, bukan hasil reverse-engineering schema MT.

## 3. Native/JNI: interface yang dapat dibuktikan

Wrapper Java/Smali mengidentifikasi tiga library berbeda: `mt1`, `mt2`, dan `mt3`.

### 3.1 Features / libmt1

Native declarations:
- `analyze(byte[]): Object[]`
- `deleteFile(String): boolean`
- `getABI(): String`
- `uid2name(int): String`

Kesimpulan terbatas:
- `deleteFile` adalah native delete helper; semantik path, symlink, permission, recursive behavior, return/error detail belum diketahui.
- `getABI` mengembalikan string ABI yang dipahami implementasi MT; belum diketahui apakah sama dengan `Build.SUPPORTED_ABIS`.
- `uid2name` menerjemahkan UID ke nama; kemungkinan terkait owner metadata, tetapi caller/use-case belum ditelusuri.
- `analyze` menerima byte array dan mengembalikan object array; jangan menebak format input/output tanpa call-site.

### 3.2 Features2 / libmt2

Native declarations:
- `init(String, String, String, String): int`
- `installSeccomp(int): int`

Empat argumen `init` dan hasil kode integer belum dipetakan. `installSeccomp` menunjukkan konfigurasi seccomp native, tetapi kebijakan filter, kapan dipanggil, dan target proses belum diketahui. Tidak ada implementasi BF yang boleh meniru privilege boundary tanpa memahami threat model.

### 3.3 Features3 / libmt3

Native declarations:
- `delete(String, byte[]): boolean`
- `lastModified0(byte[]): long`
- `length(int): long`
- `listGarbledFileNames(String): byte[][]`
- `newStringUTF(byte[]): String`
- `read(int, byte[], int, int): int`
- `readlink0(byte[]): byte[]`
- `receiveFdResponse(int): long`
- `rename(String, byte[], String): boolean`
- `seek(int, long): void`
- `startMTIO(String, String): int`
- `stat0(byte[], long[]): int`
- `sync(int): void`
- `tell(int): long`
- `truncate(int, long): void`
- `write(int, byte[], int, int): void`

Wrapper Smali mengonfirmasi native signatures tersebut. Wrapper helper mengubah path ke UTF-8 sebelum `lastModified0`, `stat0`, dan `readlink0`; helper stat mengalokasikan `long[3]`, menganggap return code 0 sukses, dan mengubah non-zero menjadi `ErrnoException`.

Interpretasi yang aman:
- Ada native path-based metadata/delete/rename/readlink.
- Ada integer-handle based IO dengan read/write/seek/tell/length/truncate/sync.
- Ada jalur pembukaan/initialization `startMTIO(String,String)` dan FD response.
- Ada perlakuan khusus nama file yang tidak dapat diubah ke representasi biasa melalui `listGarbledFileNames`/ `newStringUTF`.
- Signature saja belum membuktikan apakah filesystem lokal, SAF, FUSE, root, atau custom protocol menjadi target.

Jangan mengarang struktur tiga nilai `stat0` sebelum caller atau native output ditemukan. Jangan menganggap `delete` dan `deleteFile` punya semantik sama.

## 4. Permission dan platform contract

Manifest decode mendeklarasikan, antara lain:
- `READ_EXTERNAL_STORAGE`, `WRITE_EXTERNAL_STORAGE`, `MANAGE_EXTERNAL_STORAGE`;
- `INTERNET`, network state, Wi-Fi state;
- Shizuku `moe.shizuku.manager.permission.API_V23`;
- Dhizuku `com.rosan.dhizuku.permission.API`;
- privilege `ACCESS_SUPERUSER`;
- `REQUEST_INSTALL_PACKAGES`, `REQUEST_DELETE_PACKAGES`, `QUERY_ALL_PACKAGES`;
- overlay, wake lock, ignore battery optimization, foreground service dan media projection;
- `requestLegacyExternalStorage=true`, `requestRawExternalStorageAccess=true`, `usesCleartextTraffic=true`.

Deklarasi manifest bukan bukti bahwa setiap permission digunakan oleh file manager. Sebagian bisa milik fitur lain atau compatibility legacy. Mapping permission->call-site belum lengkap.

### Keputusan permission BF

1. Default P0: app-private + SAF `ACTION_OPEN_DOCUMENT_TREE` / document APIs.
2. Simpan persisted URI read/write grants hanya jika diberikan.
3. Gunakan `ContentResolver` stream dan `DocumentFile`/DocumentsContract; jangan mengubah `content://` menjadi filesystem path.
4. `MANAGE_EXTERNAL_STORAGE` tidak dipakai untuk menghindari SAF. Baru dipertimbangkan sebagai mode opsional dengan use-case terukur dan review kebijakan distribusi.
5. Root/Shizuku/Dhizuku adapter tidak menjadi dependency core; capability harus terdeteksi, eksplisit, dan gagal dengan fallback.
6. Tidak menyalin cleartext traffic, legacy flags, accessibility, overlay, atau background service MT tanpa kebutuhan BF yang terbukti.

## 5. Kontrak filesystem BF (P0)

### Location

`Location` harus opaque:
- providerId
- canonical URI/provider key
- optional parent key
- display label hanya untuk UI

Path string bukan universal identifier. SAF provider bisa berupa cloud-backed document, removable volume, atau virtual document.

### FileEntry

Minimal:
- stable provider key/URI
- displayName
- mimeType nullable
- kind: file/directory/unknown
- size nullable
- modifiedAt nullable
- capability flags (read/write/create/delete/rename)
- hidden flag hanya jika provider dapat memberi data valid
- optional owner/flags jika ada permission API khusus

Jangan menebak size/timestamp jika provider tidak mendukung. Hindari sort comparator yang menganggap null = 0 tanpa definisi.

### Operation semantics

Setiap operasi mengembalikan hasil per item:
- success, skipped, failed, cancelled;
- source, destination;
- bytes processed bila diketahui;
- typed error;
- final location bila provider mengubah document ID/URI.

Conflict policy eksplisit: FAIL, SKIP, REPLACE, KEEP_BOTH. REPLACE tidak boleh menghapus tujuan lama sebelum data baru tervalidasi. Untuk SAF, rename/copy/move support bergantung pada provider dan API; adapter dapat fallback ke stream create-copy-verify-delete.

Move lintas provider wajib:
1. create temporary/destination entry;
2. stream copy dengan cancellation;
3. flush/close;
4. verifikasi ukuran dan/atau checksum sesuai mode;
5. publish destination/rename temp bila provider mendukung;
6. baru delete source;
7. jika delete source gagal, laporkan duplicate/partial move, jangan menghapus destination.

Jangan klaim atomic move di seluruh provider. Atomicity dan rename semantics provider-specific.

### File handle lifecycle

Untuk handle-based IO, BF memakai stream/channel abstraction:
- satu operation scope memiliki ownership handle;
- close dijamin pada semua exit path;
- cancellation menutup stream dan menghentikan loop;
- buffer dibatasi;
- progress tidak mengandalkan size nullable;
- partial write dilaporkan;
- sync/flush sesuai kemampuan API dan durability requirement.

JNI MT menunjukkan API handle read/write, tetapi BF tidak perlu mengadopsi file descriptor integer buatan sendiri kecuali backend native independen benar-benar dibutuhkan.

## 6. Temuan dan status evidence

| Temuan | Evidence | Status |
|---|---|---|
| MT punya add-to-bookmarks dan add group UI | resource strings | E2 |
| libmt1 native delete helper | Java + Smali declaration | E3 interface |
| libmt2 init dan seccomp wrappers | Java + Smali declaration | E3 interface |
| libmt3 stat/mtime/readlink/delete/rename | Java + Smali declaration dan UTF-8 wrapper | E3 interface |
| libmt3 stream-like handle IO | Java + Smali declarations | E3 interface |
| file manager menggunakan setiap method di atas | caller belum dipetakan | unknown |
| root/SAF/custom backend dipakai pada tiap operasi | caller belum dipetakan | unknown |
| bookmark schema dan persistence semantics MT | belum ditemukan | unknown |
| permission-call-site mapping | belum ditelusuri | unknown |
| runtime behavior | belum dites | unknown |

E3 pada tabel ini hanya berarti interface/native wrapper dapat dilihat secara langsung. Ini tidak menaikkan status perilaku fitur menjadi E3 end-to-end. Dalam inventory fitur, perilaku tetap indicated sampai call-site ditemukan.

## 7. Backlog audit berikutnya

| ID | Tugas | Hasil wajib |
|---|---|---|
| AUD-FS-01 | Menemukan caller `Features3.startMTIO` dan `receiveFdResponse` | descriptor/caller/call flow |
| AUD-FS-02 | Menemukan caller read/write/seek/tell/length/truncate/sync | lifecycle handle dan IO semantics |
| AUD-FS-03 | Menemukan caller delete/rename/stat/mtime/readlink | operation behavior dan error mapping |
| AUD-FS-04 | Telusuri `listGarbledFileNames` / `newStringUTF` | encoding/name model |
| AUD-FS-05 | Trace menu/file-list click ke provider operation | navigation and operation graph |
| AUD-BK-01 | Temukan bookmark repository/DAO/persistence | schema dan lifecycle |
| AUD-PM-01 | Map manifest permission ke call-site | rationale dan fallback |
| AUD-NJ-01 | Inventaris ELF exports/build IDs/ABI per .so | JNI mapping/native deps |
| AUD-RT-01 | Runtime test root/non-root/SAF Android versions | observed behavior matrix |

## 8. Keputusan implementasi

P0 BF Manager tetap dimulai dari SAF-first provider, bukan menulis ulang native layer MT. Semua operasi destructive punya typed outcomes, explicit conflict policy, progress/cancel, dan data-integrity ordering. Bookmark menggunakan stable URI/provider key plus relink support. Permission luas dan privilege tidak menjadi requirement core.

Jangan tandai implementasi atau feature parity tervalidasi sebelum test provider dan runtime selesai.


## Revisi keputusan permission dan parity (2026-11-04)

Arahan pemilik proyek: semua fitur wajib ada dengan target minimal parity 1:1. Semua fitur tersedia gratis, tanpa login akun BF, tanpa VIP/paywall/IAP/subscription/entitlement gate. Prioritas P0-P3 hanya roadmap, bukan pengurangan scope.

Permission policy:
- Buat matriks permission/capability per Feature ID.
- Dukung seluruh mekanisme Android yang relevan (runtime, special access, SAF, all-files access, package visibility/install/delete, overlay, accessibility, media projection, foreground service/notification, network, battery settings, dan privilege bridge) sesuai kebutuhan dan platform API.
- Root/Shizuku/Dhizuku/shell wajib diaudit dan diimplementasikan untuk fitur yang memerlukannya; SAF bukan satu-satunya backend.
- Minta izin saat fitur terkait dipakai, tangani denial/revocation, serta sediakan fallback yang jujur.
- Jangan menyalin manifest MT mentah; manifest BF harus mencakup semua permission BF yang diperlukan fitur.
- Permission yang tidak dapat diberikan Android pada perangkat tertentu harus dilaporkan sebagai limitation, bukan disimulasikan berhasil.

Login BF tidak diperlukan; autentikasi layanan remote tetap mengikuti protokol. Parity 1:1 hanya boleh diklaim setelah seluruh Feature ID lulus pengujian.


## 9. Pemetaan direct call-site JNI Features3 (AUD-01, 2026-11-04)

Bagian ini memperbarui inventaris interface pada §3.3 dengan hasil pemindaian langsung seluruh Smali dalam arsip referensi `MT2.26.11_reference.zip`. Arsip sumber berukuran 170.268.443 byte, SHA-256 `79be2c8909585b002e7c8e0dac0e61eec3dfa1e33f9a75e4abd43ea88821c7ed`, dan lolos pemeriksaan CRC ZIP.

### 9.1 Cakupan dan hasil pemindaian

Arsip memuat 76.375 entri, termasuk 33.491 file Smali dan 83 file ELF `.so`. Pemindaian descriptor langsung `Lbin/mt/plus/Features3;->` pada seluruh Smali menghasilkan 21 referensi tekstual: 3 referensi internal dari wrapper Java `Features3` dan 18 referensi eksternal pada 7 file Smali.

### 9.2 Deklarasi native

Seluruh 16 deklarasi native teridentifikasi pada `reference/apktool/smali/bin/mt/plus/Features3.smali`; static initializer memuat library `mt3`:

| Native method | Signature |
|---|---|
| `delete` | `(String, byte[]) -> boolean` |
| `lastModified0` | `(byte[]) -> long` |
| `length` | `(int) -> long` |
| `listGarbledFileNames` | `(String) -> byte[][]` |
| `newStringUTF` | `(byte[]) -> String` |
| `read` | `(int, byte[], int, int) -> int` |
| `readlink0` | `(byte[]) -> byte[]` |
| `receiveFdResponse` | `(int) -> long` |
| `rename` | `(String, byte[], String) -> boolean` |
| `seek` | `(int, long) -> void` |
| `startMTIO` | `(String, String) -> int` |
| `stat0` | `(byte[], long[]) -> int` |
| `sync` | `(int) -> void` |
| `tell` | `(int) -> long` |
| `truncate` | `(int, long) -> void` |
| `write` | `(int, byte[], int, int) -> void` |

Wrapper Java/Smali:
- `ۙ(String) -> long`: path UTF-8 → `lastModified0`; `IOException` dibungkus ulang.
- `ۤ(String) -> long[]`: alokasi `long[3]`, panggil `stat0`, dan lempar `ErrnoException("stat", errno)` untuk hasil non-zero.
- `᩷(String) -> String`: panggil `readlink0`, konversi byte ke UTF-8, pertahankan `null`.

### 9.3 Direct call-site yang ditemukan

| DEX | File Smali:baris | Operasi / pemanggil | Native method atau wrapper |
|---|---|---|---|
| classes2 | `l/֫ܿ֫.smali:539` | `run()V`, worker MTIO | `startMTIO` |
| classes3 | `l/֨ۨᩴ.smali:83` | Penghapusan dengan fallback | `delete` |
| classes3 | `l/֨ۨᩴ.smali:208` | Enumerasi nama garbled | `listGarbledFileNames` |
| classes3 | `l/֨ۨᩴ.smali:222` | Konversi byte nama ke String | `newStringUTF` |
| classes3 | `l/֨ۨᩴ.smali:743` | Metadata waktu | `ۙ(String)` → `lastModified0` |
| classes3 | `l/֨ۨᩴ.smali:973` | Resolusi symbolic link | `᩷(String)` → `readlink0` |
| classes3 | `l/֨ۨᩴ.smali:1247` | Fallback rename | `rename` |
| classes3 | `l/ۖۨᩴ.smali:32` | Klasifikasi metadata | `ۤ(String)` → `stat0` |
| classes3 | `l/ۙܽۤ.smali:83` | `length()J` | `length` |
| classes3 | `l/ۙܽۤ.smali:96` | `position()J` | `tell` |
| classes3 | `l/ۙܽۤ.smali:109` | `read([BII)I` | `read` |
| classes3 | `l/ۙܽۤ.smali:127` | `seek(J)V` | `seek` |
| classes3 | `l/ۙܽۤ.smali:138` | `setLength(J)V` | `truncate` |
| classes3 | `l/ۙܽۤ.smali:149` | `write([BII)V` | `write` |
| classes3 | `l/ۙܽۤ.smali:195` | Sinkronisasi handle | `sync` |
| classes4 | `l/ۜܿᩴ.smali:1466` | Metadata waktu dengan fallback | `ۙ(String)` → `lastModified0` |
| classes4 | `l/ܰۨᩴ.smali:1451` | Pemeriksaan jalur khusus Android | `᩷(String)` → `readlink0` |
| classes4 | `l/ܶ۟ᩴ.smali:1968` | Callback sintetis `ۤ(I)Long` | `receiveFdResponse` |

### 9.4 Semantik wrapper yang telah diverifikasi

1. Adapter `l/ۙܽۤ` menyimpan `ParcelFileDescriptor`, mengambil integer descriptor melalui `getFd()`, lalu memakainya untuk `length/tell/read/seek/truncate/write/sync`.
2. `close()` pada adapter menutup `ParcelFileDescriptor`; tidak ada native close pada adapter tersebut.
3. Adapter mengubah hasil `read == 0` menjadi `-1`.
4. Jalur delete/rename mempunyai fallback native setelah operasi Java standar atau pemeriksaan nama tertentu gagal.
5. `stat0` mengisi `long[3]`; pemanggil membaca elemen pertama sebagai mode dan elemen kedua sebagai ukuran (kecuali direktori). Makna elemen ketiga belum diketahui.
6. `receiveFdResponse(int)` mengembalikan `long`, dibungkus menjadi `Long`; `IOException` diteruskan melalui handler.

JADX menampilkan beberapa kelas tambahan yang mengimpor `Features3`, termasuk adapter dan worker serupa. Namun, pemindaian Smali menemukan satu direct call-site `startMTIO` dan satu adapter Smali untuk handle I/O. Perbedaan output JADX/Smali harus direkonsiliasi dengan pemetaan class DEX; jangan menghitung hasil JADX sebagai call-site tambahan tanpa verifikasi.

### 9.5 Batasan dan status AUD-01

Belum terverifikasi: parameter `startMTIO`, protokol `receiveFdResponse`, layout lengkap `stat0`, encoding filename non-UTF-8, errno/native semantics, jalur permission, serta invocation reflektif/dinamis. Pemetaan direct descriptor selesai; analisis call-chain, reflection, dan perilaku native masih berlangsung.

## 10. Inventaris ELF awal libmt3.so (AUD-03, 2026-11-04)

Empat varian `libmt3.so` diperiksa pada `arm64-v8a`, `armeabi-v7a`, `x86`, dan `x86_64`. Seluruhnya merupakan ELF `DYN`, little-endian, Android API 21, dibangun dengan NDK `r29-beta2 (13599879)`, dan stripped.

### 10.1 Identitas binary

| ABI | ELF / machine | Build ID | SHA-256 |
|---|---|---|---|
| arm64-v8a | ELF64 / AArch64 | `382cb5bbd6b1704cb617da77d18df8e1b50ee025` | `843168d72677af9670cc5048e45a603c05a28cbf8e33191f946b0fb08438f8fa` |
| armeabi-v7a | ELF32 / ARM EABI5 | `36239aa16cb2f4a9f6013a5b57d1991d74cccc38` | `0ad442fcd7d30d4155a4b1ac75aafb41ccc1695e4d069739d178b30456079103` |
| x86 | ELF32 / Intel 80386 | `62962ca13040af3b1ae66b502392408b29576141` | `0f60ec3a492cf6afe6546768913a54fbfdf09b51a2c44f6524dfeea40577aefe` |
| x86_64 | ELF64 / AMD x86-64 | `a5af34d4425aaa73f8f007f50103756091964000` | `2c801ffaa2a0bf11603ded6dfaeaf079ed0518f35cddc1ee8742b3a63936ce7a` |

### 10.2 Dependency dan simbol

Seluruh ABI menggunakan SONAME `libmt3.so` dan dependency langsung `libm.so`, `libdl.so`, serta `libc.so`. Dynamic symbol table menampilkan 16 ekspor JNI bernama `Java_bin_mt_plus_Features3_<method>`, tepat sesuai deklarasi pada §9.2. Tidak ditemukan ekspor `JNI_OnLoad` atau `JNI_OnUnload` pada dynamic symbol table yang diperiksa; temuan ini tidak menyingkirkan seluruh kemungkinan dispatch/registrasi dinamis.

Undefined imports yang relevan:
- Descriptor I/O: `read`, `write`, `lseek`, `lseek64`, `fstat`, `ftruncate`, `ftruncate64`, `fsync`.
- Filesystem path: `stat`, `lstat`, `fstatat`, `readlink`, `readlinkat`, `rename`, `readdir`.
- Lainnya: `__read_chk`, `fwrite`.

Daftar import membuktikan adanya dependency pada API filesystem POSIX/Bionic, bukan pemetaan fungsi native ke simbol tertentu atau semantik flag/errno.

### 10.3 Batasan dan status AUD-03

Binary stripped; belum dilakukan disassembly/decompilation per fungsi, perbandingan instruksi antar-ABI, atau pemeriksaan penggunaan syscall langsung, `ioctl`, socket/pipe, dan helper internal. Library `libmtprotect.so`, `libmt1.so`, dan `libmt2.so` belum diaudit pada tahap ini. AUD-03 selesai pada tingkat inventaris ELF; reverse engineering semantik native belum dimulai.

## 11. Urutan audit lanjutan yang disepakati

1. Rekonstruksi state machine worker `run()V` dan asal dua argumen `startMTIO`.
2. Telusuri callback `receiveFdResponse` dan protokol pertukaran descriptor.
3. Disassemble fungsi `startMTIO` dan `receiveFdResponse` pada arm64-v8a, lalu bandingkan ABI lain.
4. Telusuri factory pembuat `ParcelFileDescriptor`, mode akses, caller, serta permission/capability adapter.
5. Analisis fungsi filesystem lain dan korelasikan hasil native dengan Smali sebelum menyusun kontrak implementasi BF.


## 12. Pemeriksaan reflection dan dynamic invocation Features3 (AUD-01R, 2026-11-04)

### 12.1 Cakupan dan metode

Pemeriksaan dilakukan langsung terhadap seluruh 33.491 file Smali di dalam arsip lokal MT2.26.11_reference.zip (5 DEX roots). Pemindaian mencakup:

- Referensi class descriptor Lbin/mt/plus/Features3;.
- Literal nama class dan native method dalam const-string.
- Instruksi reflection Class.forName, Class.getMethod, Class.getDeclaredMethod, Method.invoke, serta ClassLoader.loadClass.
- Referensi Java Method Handles.

Hasil pencarian literal class/method names harus dibaca sebagai pencarian string yang terlihat di Smali. Hasil negatif tidak membuktikan bahwa string tidak dapat dibentuk saat runtime melalui decoder, XOR, array byte, atau sumber eksternal.

### 12.2 Hasil teramati

1. Referensi Lbin/mt/plus/Features3; tetap terbatas pada 23 baris yang telah terinventarisasi di §9: deklarasi/wrapper internal dan direct call-site yang tercatat. Tidak ditemukan instruksi const-class Lbin/mt/plus/Features3; atau call-site reflection yang secara eksplisit menunjuk ke class tersebut.
2. Tidak ditemukan literal Features3, bin.mt.plus.Features3, atau nama method JNI Features3 (startMTIO, receiveFdResponse, lastModified0, listGarbledFileNames, newStringUTF, readlink0, stat0) sebagai string konstan pada file Smali yang dipindai.
3. Reflection memang digunakan secara luas di APK. Jumlah instruksi lintas semua DEX yang ditemukan:
   - Method.invoke: 347
   - Class.getMethod: 238
   - Class.getDeclaredMethod: 141
   - Class.forName: 238
   - ClassLoader.loadClass: 27
4. Sebagian call-site berada di package obfuscated l/ pada beberapa DEX roots. Keberadaan reflection umum ini sendiri bukan bukti bahwa Features3 dipanggil secara reflektif.
5. Tidak ditemukan referensi tipe java.lang.invoke.MethodHandle / MethodHandles yang menghubungkan invocation ke Features3 pada hasil pemindaian ini.

### 12.3 Kesimpulan terbatas

- Tidak ada bukti statis eksplisit bahwa deklarasi native Features3 dipanggil melalui Java Reflection atau Method Handles. Semua pemanggilan yang berhasil diidentifikasi tetap direct static invocation sebagaimana §9.
- Reflection/dynamic invocation secara umum ada di APK, termasuk pada class obfuscated dan library pihak ketiga. Karena itu, tidak tepat menyimpulkan bahwa aplikasi sama sekali tidak memakai dynamic invocation.
- Belum tertutup sepenuhnya: obfuscated string decoder, nama class/method yang dirakit saat runtime, DexClassLoader/dynamic DEX loading, native-side RegisterNatives, atau invocation yang perantara target-nya tidak dapat ditautkan dengan pencarian descriptor/string statis.

### 12.4 Status AUD-01R dan langkah verifikasi tersisa

Pemeriksaan statis terarah untuk keterkaitan reflection dengan Features3 selesai dengan hasil negatif eksplisit. Status AUD-01R menjadi partial / no explicit Features3 reflection evidence; bukan closed untuk seluruh dynamic dispatch.

Langkah lanjutan yang proporsional:
1. Audit decoder string yang dipakai class obfuscated yang berada pada jalur filesystem/MTIO, bukan seluruh 347 call-site secara membabi buta.
2. Periksa pemanggil Class.forName / loadClass yang menerima hasil decoder dan apakah target class dapat dipetakan ke Features3.
3. Periksa ELF registration/dynamic lookup saat AUD-03R untuk melengkapi sisi native.
4. Jangan menaikkan atau menurunkan status direct call-site AUD-01 §9; hasil ini hanya memperjelas batas pencarian reflection.


## 13. Semantik awal operasi filesystem native (AUD-02, arm64-v8a, 2026-11-04)

### 13.1 Metode

Disassembly dilakukan terhadap binary lokal `reference/apktool/lib/arm64-v8a/libmt3.so` memakai LLVM objdump. Alamat fungsi dicocokkan dengan dynamic symbol table ELF dan call target PLT/relocation. Hasil di bawah hanya berlaku untuk ABI arm64-v8a sampai perbandingan ABI lain dilakukan.

### 13.2 Temuan per fungsi

| JNI export | Alamat | Temuan dari disassembly | Status interpretasi |
|---|---:|---|---|
| `stat0` | `0x392c` | Menerima path byte array, menyalin ke buffer native, menolak embedded NUL, lalu memanggil libc `stat`. Jika sukses, mengisi tiga elemen `long[]`. | Mode, size, dan mtime (ms) terkonfirmasi melalui korelasi dengan caller Smali §9 dan class metadata adapter. |
| `lastModified0` | `0x374c` | Jalur path byte array serupa, memanggil `stat`, mengonversi `st_mtim` ke millisecond epoch, dan melempar IOException pada jalur error. | Mengikuti symlink karena memakai `stat`, bukan `lstat`. |
| `readlink0` | `0x3604` | Menyalin path byte array, memanggil libc `readlink` dengan buffer 4096 byte, lalu mengembalikan byte array sepanjang hasil readlink. Hasil yang melebihi 4095 byte atau error menghasilkan null. | Raw target bytes; bukan String UTF-8 pada lapisan native. |
| `delete` | `0x3ee4` | Membentuk path anak dari parent path + separator + byte-array name; memanggil `lstat`; mode direktori diarahkan ke `rmdir`, selain direktori ke `unlink`. | Non-recursive. Symlink diperiksa sebagai link oleh `lstat`, lalu dihapus melalui `unlink`; direktori harus kosong agar `rmdir` berhasil. |
| `rename` | `0x4094` | Membentuk source path dari parent path + separator + byte-array name, lalu memanggil libc `rename(source, target)`. | Rename berbasis path POSIX; atomicity dan cross-filesystem behavior tetap mengikuti kernel/filesystem dan tidak boleh digeneralisasi ke SAF/provider. |

Korelasi tambahan untuk `stat0`: caller Smali `reference/apktool/smali_classes3/l/ۖۨᩴ.smali:32-112` membaca elemen 0 sebagai mode, elemen 1 sebagai size (direktori diperlakukan khusus), dan elemen 2 sebagai nilai waktu. Ini menguatkan pemetaan tiga nilai output native.

### 13.3 Implikasi dan batasan

- Native `stat0` dan `lastModified0` mengikuti target symlink melalui `stat`; `readlink0` secara terpisah membaca target symlink.
- Native `delete` tidak melakukan recursive traversal. Ia memilih `rmdir` untuk direktori dan `unlink` untuk selain direktori.
- Native `rename` menggunakan POSIX `rename`; belum ada bukti bahwa operasi ini merupakan implementasi lintas-provider atau memiliki semantics yang sama dengan SAF.
- Error handling, seluruh JNI array bounds, race/symlink TOCTOU, dan perbedaan ABI belum diverifikasi. Jangan menyimpulkan keamanan race-free hanya dari pemakaian `lstat`.

Status AUD-02: **partial** — lima fungsi path operation telah dibaca pada arm64-v8a. Handle I/O, `listGarbledFileNames`, dan cross-ABI comparison masih terbuka.

## 14. Disassembly awal jalur MTIO dan descriptor transfer (AUD-03R, 2026-11-04)

### 14.1 Identitas fungsi arm64-v8a

| JNI export | Alamat | Ukuran simbol |
|---|---:|---:|
| `receiveFdResponse` | `0x3468` | 412 bytes |
| `startMTIO` | `0x3ab4` | 176 bytes |

Disassembly sumber: `reference/apktool/lib/arm64-v8a/libmt3.so`; binary Build ID `382cb5bbd6b1704cb617da77d18df8e1b50ee025`.

### 14.2 `receiveFdResponse(int)`

Fungsi memanggil `recvmsg` pada integer descriptor yang diterima dari Java. Jalur error:
- Jika `recvmsg` gagal dengan `EINTR` (4), operasi diulang.
- Jika peer menutup koneksi (hasil 0), errno diset ke `ECONNRESET` (104), kemudian IOException dibuat melalui JNI.
- Flag `MSG_CTRUNC` (bit 3 pada `msg_flags`) menyebabkan descriptor tidak diterima.
- Control message diperiksa untuk `cmsg_level == SOL_SOCKET` (1), `cmsg_type == SCM_RIGHTS` (1), dan panjang minimal 20 byte; integer descriptor dibaca dari payload control message.

Temuan ini mengonfirmasi bahwa fungsi menerima file descriptor melalui ancillary data `SCM_RIGHTS` pada Unix-domain socket, bukan membaca descriptor dari payload biasa. Jalur sukses mengembalikan descriptor yang diterima; ownership/close lifecycle setelah return harus dikorelasikan dengan caller Java dan belum sepenuhnya dipetakan.

### 14.3 `startMTIO(String, String)`

Wrapper JNI mengambil UTF chars dari kedua argumen dan meneruskannya ke helper internal pada alamat `0x431c`. Helper:
- Memvalidasi argumen mode terhadap string `MTIO` dan `standard`.
- Membuat stream socket dan melakukan `connect`.
- Jalur yang dipanggil oleh JNI saat ini memberikan parameter internal ketiga bernilai 0, sehingga cabang yang tampak digunakan adalah Unix-domain socket dengan argumen kedua sebagai socket pathname.
- Memiliki cabang IPv4 yang memakai `inet_pton` dan `connect`, tetapi keterjangkauannya dari call-site JNI yang dipetakan belum terbukti.
- Memanggil `daemon(1, 0)` pada cabang mode `MTIO`; sesudahnya helper mengalokasikan state/buffer dan menjalankan loop berbasis `select`, `ioctl`, dan descriptor socket.

Helper internal juga memuat dispatch command dan request handling yang belum selesai dipetakan. Karena itu, belum aman untuk menyimpulkan keseluruhan lifecycle worker atau nilai return semantik hanya dari potongan awal ini.

### 14.4 Batasan dan status AUD-03R

Disassembly awal arm64-v8a membuktikan penggunaan Unix-domain socket dan `SCM_RIGHTS` untuk transfer descriptor pada jalur yang dianalisis. Belum dilakukan:
- pemetaan lengkap command/state machine helper MTIO;
- korelasi semua argumen Java dengan socket pathname dan mode;
- lifecycle descriptor pada semua cabang sukses/gagal;
- perbandingan instruksi dan behavior pada armeabi-v7a, x86, dan x86_64;
- pemeriksaan apakah native helper memakai mekanisme tambahan pada ABI lain.

Status AUD-03R: **partial / arm64 initial disassembly**. Binary tetap hanya sumber referensi lokal dan tidak boleh disalin ke repository BF-Manager.


## 15. Semantik handle I/O dan nama file non-UTF-8 (AUD-02 lanjutan, arm64-v8a, 2026-11-04)

### 15.1 Handle-based I/O

| JNI export | Alamat | Operasi native | Error behavior teramati |
|---|---:|---|---|
| `read` | `0x2e94` | Alokasi buffer native, `__read_chk(fd, buffer, count, -1)`, lalu salin hasil positif ke Java byte array pada offset yang diminta. | Hasil -1 diterjemahkan menjadi IOException; hasil 0 dikembalikan sebagai 0. Adapter Smali §9 mengubah 0 menjadi -1 (EOF). |
| `write` | `0x2f94` | Meminjam byte array Java, lalu melakukan loop `write` sampai seluruh rentang yang diminta tertulis; menangani partial write dan mengulang bila errno `EINTR`. | `write == 0` menghasilkan IOException; error lain menggunakan errno/strerror. Array dilepas dengan mode JNI_ABORT karena native tidak menulis balik ke array Java. |
| `sync` | `0x313c` | Memanggil `fsync(fd)`. | Gagal → IOException berisi strerror. |
| `seek` | `0x31d0` | Memanggil `lseek64(fd, offset, SEEK_SET)`. | Gagal → IOException; nilai posisi hasil syscall tidak dikembalikan oleh deklarasi JNI void. |
| `tell` | `0x3270` | Memanggil `lseek64(fd, 0, SEEK_CUR)`. | Mengembalikan offset saat ini; gagal → IOException. |
| `length` | `0x330c` | Memanggil `fstat(fd)` dan mengembalikan `st_size`. | Gagal → IOException. Tidak ada pemeriksaan eksplisit bahwa descriptor menunjuk regular file. |
| `truncate` | `0x33d0` | Memanggil `ftruncate64(fd, length)`. | Gagal → IOException. |

Korelasi dengan adapter Smali `l/ۙܽۤ`:
- Adapter menyimpan `ParcelFileDescriptor` dan integer hasil `getFd()`.
- `read == 0` dikonversi menjadi -1 di lapisan adapter.
- `close()` menutup `ParcelFileDescriptor`; tidak ada JNI close pada adapter ini.
- `write` native menyelesaikan loop partial write sebelum kembali sukses, sehingga caller tidak menerima jumlah byte tertulis sebagai return value.

Implikasi: kontrak stream BF perlu menangani EOF, partial write, EINTR, IOException, dan ownership descriptor secara eksplisit. Ini adalah perilaku backend native MT, bukan alasan untuk meniru integer FD pada backend SAF BF.

### 15.2 `listGarbledFileNames(String)`

Fungsi pada alamat `0x3b64`:
1. Membuka directory dengan `opendir` dan membaca entry melalui `readdir`.
2. Melewati entry `.` dan `..`.
3. Memanggil validator byte internal pada setiap nama. Validator memeriksa struktur UTF-8, continuation bytes, batas minimum code point, surrogate range, dan batas Unicode maksimum.
4. Menghitung nama yang gagal validasi UTF-8.
5. Melakukan `rewinddir`, mengulangi enumeration, lalu mengembalikan nama invalid sebagai `byte[][]` tanpa memaksakan konversi ke Java String.

Interpretasi: fungsi ini memang mengumpulkan nama directory entry yang byte sequence-nya bukan UTF-8 valid, sehingga UI/lapisan Java dapat menanganinya tanpa kehilangan byte asli. Ini selaras dengan pasangan `newStringUTF(byte[])` yang dipakai caller untuk nama yang dapat dikonversi.

### 15.3 Status AUD-02 setelah pendalaman

Semua 16 export Features3 kini telah dipetakan pada tingkat deklarasi/call-site; semantik arm64 telah dianalisis untuk path operations, handle I/O, dan enumerasi nama invalid UTF-8. AUD-02 tetap **partial**, karena belum ada perbandingan ABI, uji runtime, dan pemetaan seluruh call chain permission/provider. Error-path/race details juga belum diverifikasi menyeluruh.
