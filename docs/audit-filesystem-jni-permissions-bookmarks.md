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
