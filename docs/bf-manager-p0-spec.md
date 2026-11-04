# Spesifikasi Fondasi BF Manager (P0)

Tanggal: 2026-11-04  
Status: rancangan teknis awal; siap diturunkan menjadi implementasi setelah keputusan package ID dan minSdk disahkan.  
Branch: `v1.0`

## 1. Batasan dan keputusan arsitektur

- Kotlin native; UI direkomendasikan Jetpack Compose.
- Tahap awal satu Gradle app module dengan pemisahan package berdasarkan domain. Ekstraksi ke module terpisah dilakukan setelah dependency dan API stabil.
- Layer: presentation -> domain -> data/platform adapter.
- Semua operasi berkas melalui kontrak `FileSystemProvider`; UI tidak mengasumsikan path absolut.
- Storage Access Framework (SAF) menjadi jalur akses utama. Persisted URI permission hanya disimpan sesuai grant yang diberikan pengguna.
- Jangan menambahkan `MANAGE_EXTERNAL_STORAGE`, root, Shizuku, Accessibility, atau foreground service tanpa use-case, rationale, fallback, dan pengujian.
- Fitur lokal berjalan tanpa login, subscription, koneksi jaringan, atau backend.
- Repository BF Manager tidak boleh menggunakan source hasil dekompilasi MT, native library MT, signing material, credential, endpoint privat, atau asset yang lisensinya belum jelas.
- APK BF Manager harus dibangun dari project Gradle Kotlin, bukan dari Apktool.

## 2. Struktur source target

```text
app/
  src/main/
    java/<application-id>/
      MainActivity.kt
      BFManagerApplication.kt
      navigation/
      ui/theme/
      core/
        common/
        filesystem/
        permissions/
        database/
        operation/
      feature/
        home/
        filemanager/
        bookmarks/
        settings/
    res/
  src/test/
  src/androidTest/
gradle/
build.gradle.kts
settings.gradle.kts
gradle.properties
gradlew
```

## 3. Kontrak domain P0

### 3.1 FileSystemProvider

Kontrak minimum yang harus diimplementasikan:

- `list(location): Result<List<FileEntry>>`
- `stat(location): Result<FileEntry>`
- `createDirectory(parent, name): Result<Location>`
- `createFile(parent, name, mimeType): Result<Location>`
- `openRead(location): Result<InputStream>`
- `openWrite(location, mode): Result<OutputStream>`
- `rename(location, newName): Result<Location>`
- `delete(location): Result<Unit>`
- `copy(source, destination, conflictPolicy, progress, cancellation): Result<OperationReport>`
- `move(source, destination, conflictPolicy, progress, cancellation): Result<OperationReport>`

`Location` adalah abstraksi URI/provider, bukan string path. Implementasi awal mencakup app-private/local dan SAF document-tree provider. Operasi lintas provider dapat menggunakan stream copy.

### 3.2 FileEntry

Data minimum: stable provider ID/URI, display name, MIME type nullable, kind (file/directory/unknown), size nullable, modified time nullable, capability flags (read/write/delete/rename), dan parent location.

Identitas item tidak boleh bergantung pada nama file karena nama dapat sama dalam direktori berbeda. Gunakan URI/document ID dari provider.

### 3.3 Konflik dan laporan operasi

Conflict policy eksplisit: `FAIL`, `SKIP`, `REPLACE`, `KEEP_BOTH`. Jangan melakukan overwrite diam-diam.

Operation report mencatat hasil per item, bytes processed bila tersedia, tujuan akhir, dan error yang dapat ditampilkan. Partial failure harus tetap terlihat sebagai partial failure.

### 3.4 Bookmark

Bookmark menyimpan provider URI/ID, display-name snapshot, urutan, grup opsional, createdAt, dan status persisted permission. URI yang sudah tidak valid ditandai broken dan menawarkan relink; jangan dihapus otomatis.

### 3.5 Permission flow

- Minta folder melalui `ACTION_OPEN_DOCUMENT_TREE` saat pengguna memilih lokasi.
- Simpan read/write URI permission sesuai grant.
- Tangani permission revocation, dokumen dipindahkan/dihapus, provider tidak tersedia, dan permission denied.
- Jangan meminta all-files access saat onboarding.
- UI menjelaskan cakupan akses dan menyediakan pemilihan ulang folder.

## 4. Acceptance criteria P0

### Home dan navigasi
- Aplikasi bisa dibuka offline tanpa login.
- Pengguna dapat memilih lokasi storage, membuka bookmark, dan masuk ke settings.
- Loading, empty, permission denied, dan provider error memiliki state berbeda.
- Lokasi aktif tetap tersedia setelah process restart jika grant masih valid.

### Browse directory
- Menampilkan file/folder dengan sort yang deterministik.
- Hidden entries default off dan preferensinya lokal.
- IO tidak berjalan di main thread.
- Folder kosong dibedakan dari folder yang gagal diakses.

### Create, rename, delete
- Validasi nama kosong, separator, dot entries, dan karakter yang tidak diterima provider.
- Rename memperbarui URI dan state bookmark.
- Delete meminta konfirmasi dan melaporkan kegagalan per item.
- Recycle bin bukan bagian P0; fitur itu memerlukan semantics provider-aware pada FM-05.

### Copy dan move
- Mendukung multi-select, conflict policy, progress, dan cancellation.
- Streaming menggunakan buffer; jangan membaca keseluruhan file besar ke RAM.
- Move lintas provider menggunakan copy-then-delete hanya setelah hasil copy divalidasi.
- Cancellation menutup stream dan membersihkan temporary item bila aman.
- Sumber tidak boleh dihapus saat copy gagal atau hasil tidak valid.

### Bookmark
- Tambah, hapus, reorder, dan grouping opsional.
- URI yang dicabut/dihapus menampilkan status broken dan aksi relink.
- Metadata disimpan lokal.

## 5. Model error domain

Gunakan sealed error model yang dapat dipetakan ke UI:

- `PermissionDenied`
- `NotFound`
- `AlreadyExists`
- `NotSupported`
- `ProviderUnavailable`
- `NoSpace`
- `ReadOnly`
- `Cancelled`
- `IntegrityFailure`
- `Unknown(cause)`

Jangan tampilkan stack trace atau raw provider exception kepada pengguna. Log harus meredaksi URI/token yang sensitif.

## 6. Strategi pengujian

### Unit
- Sorting/filtering FileEntry.
- Validasi nama.
- Conflict policy.
- Agregasi partial batch operation.
- Bookmark state transition dan relink.
- Error mapping.

### Integration
- FakeFileSystemProvider dengan fixture tree.
- Copy/move untuk file kecil, stream besar, file kosong, Unicode, nama panjang, konflik nama, read-only, simulasi ruang penuh.
- Cancellation di tengah stream.
- Provider failure sebelum, selama, dan setelah operasi.
- Pastikan sumber tidak terhapus bila copy gagal.

### Instrumentation
- ACTION_OPEN_DOCUMENT_TREE dan persisted grants.
- Open/list/create/rename/delete melalui document provider emulator.
- Permission dicabut setelah bookmark dibuat.
- Activity recreation ketika direktori dibuka.

## 7. Definition of Done P0

- Project Gradle Kotlin dapat sync dan build tanpa referensi APK MT.
- Debug APK dibuat Gradle dan dapat di-install.
- App launch offline tanpa login.
- SAF tree dapat dipilih dan dibuka kembali setelah process restart.
- Browse, create, rename, delete, copy/move dasar, dan bookmark berjalan dengan fixture/instrumentation.
- Test relevan lulus di CI.
- Tidak ada permission luas tanpa ADR dan justifikasi.
- Feature inventory hanya dinaikkan ke E3/E5 setelah evidence test/call-site tersedia.

## 8. Keputusan produk yang masih diperlukan

1. Application ID final.
2. minSdk dan targetSdk produk.
3. Minimum Android/device yang akan diuji.
4. Branding, icon, dan signing keystore release.
5. Daftar storage provider yang masuk dukungan awal.
6. Strategi cloud backup pada fase terpisah.

## 9. Traceability

- Audit: `docs/audit-mt-manager.md`
- Feature IDs: `docs/feature-inventory.md`
- P0: FM-01..FM-04, SY-01, dan subset lokal BK-01.
- P1 berikutnya: FM-05..FM-07, AR-01..AR-04, ED-01.


## Tambahan keputusan filesystem berdasarkan audit JNI 2026-11-04

- Jangan meniru handle integer native MT secara otomatis; gunakan stream/channel per operation scope pada implementasi Kotlin/Android.
- `content://` adalah identity opaque. Jangan mengonversi SAF URI menjadi filesystem path.
- Cross-provider move adalah copy, close/flush, verifikasi, publish destination, kemudian delete source. Jika source delete gagal, hasil dilaporkan partial/duplicate.
- Bookmark menggunakan URI/provider key dan status grant; gunakan relink ketika stale/revoked.
- FileEntry metadata nullable karena DocumentProvider tidak menjamin size/timestamp.
- Native/root/Shizuku hanya adapter opsional terpisah dari core SAF.


## Keputusan produk wajib: full feature parity dan freemium tanpa gate

Arahan pemilik proyek (2026-11-04): seluruh fitur MT Manager yang teridentifikasi adalah scope wajib BF Manager dengan target minimal parity 1:1. Prioritas P0/P1/P2/P3 hanya urutan pengerjaan, bukan penghapusan scope. Tidak boleh menghapus fitur atau menggantinya permanen dengan placeholder.

Semua fitur BF tersedia gratis: tidak ada VIP, premium gate, paywall, subscription, IAP, payment, entitlement/license check. BF Manager tidak membutuhkan akun/login. Credential layanan remote (FTP/SFTP/WebDAV/cloud) tetap dapat diminta sesuai autentikasi server; itu bukan login BF.

### Permission dan capability

"Semua permission" berarti seluruh permission/capability Android yang diperlukan oleh setiap fitur harus dianalisis, didukung, dan diuji. Jangan mengurangi fitur hanya karena memerlukan permission tambahan.

- Buat permission/capability matrix per Feature ID: Android permission/API, protection level, runtime grant atau Settings special access, privilege adapter, fallback, versi Android, dan alasan.
- Dukung flow permission yang relevan: storage/SAF/all-files, package visibility/install/delete, network, overlay, accessibility, media projection, foreground service/notification, battery settings, dan root/Shizuku/Dhizuku/shell sesuai kebutuhan fitur.
- SAF bukan satu-satunya backend dan tidak boleh menjadi alasan menghapus filesystem capability. Gunakan adapter yang sesuai: app-private, SAF/DocumentsProvider, media/storage API, all-files access bila dibutuhkan dan sesuai kebijakan distribusi, serta privileged adapter untuk fitur yang memerlukannya.
- Minta izin just-in-time saat fitur digunakan, bukan meminta semuanya saat onboarding. Tangani denial, revocation, provider unavailable, dan perangkat/API yang tidak mendukung.
- Jangan menyalin manifest MT secara buta; manifest BF harus mencakup seluruh permission yang benar-benar dibutuhkan fitur BF dan tidak meminta permission tanpa alasan.
- Root/Shizuku/Dhizuku/shell tidak boleh dihapus dari scope jika fitur referensi memerlukannya. Implementasikan adapter dan fallback capability-aware.

Setiap Feature ID wajib punya implementasi, permission/capability dependency, fallback, acceptance test, dan evidence. Parity 1:1 hanya boleh diklaim setelah seluruh fitur lulus pengujian feature-by-feature.
