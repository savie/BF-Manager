# Dokumentasi BF-Manager

Dokumen repository ini menggunakan Bahasa Indonesia. Istilah canonical dan nama API/teknologi dipertahankan dalam bahasa Inggris bila lebih tepat secara teknis.

## Peta dokumentasi

| Dokumen | Fungsi dan batas cakupan |
|---|---|
| [Audit referensi MT Manager](audit-mt-manager.md) | Ringkasan provenance, kondisi artefak, hasil audit tingkat tinggi, keputusan arsitektur, dan status kesiapan proyek. |
| [Audit filesystem, JNI, permission, dan bookmark](audit-filesystem-jni-permissions-bookmarks.md) | **Dokumen kanonis** untuk detail filesystem/JNI, bookmark, permission, direct call-site Features3 (AUD-01), inventaris ELF libmt3 (AUD-03), dan backlog native terkait. |
| [Audit lanjutan](audit-follow-up.md) | Catatan kronologis pekerjaan audit dan backlog aktif. Bagian historis dipertahankan sebagai riwayat; status terbaru berada di bagian pembaruan paling akhir dan harus selaras dengan dokumen kanonis. |
| [Audit permission, installer, dan intent](audit-follow-up-permission-installer-intents.md) | Bukti terfokus untuk SAF, package installer, intent routing, dan permission/capability. |
| [Katalog fitur dari resources](audit-feature-catalog-from-resources.md) | Temuan discovery berbasis resource string/UI. Evidence resource tidak dianggap sebagai bukti runtime. |
| [Inventaris fitur](feature-inventory.md) | Daftar Feature ID, evidence level, prioritas pengerjaan, dan cakupan produk. |
| [Kriteria penerimaan fitur](feature-acceptance-criteria.md) | Definition of Done, quality gates, dan traceability setiap Feature ID. |
| [Spesifikasi fondasi P0](bf-manager-p0-spec.md) | Kontrak arsitektur dan acceptance criteria untuk fondasi aplikasi. |

## Paket sumber audit dan provenance

Sumber utama audit reverse engineering adalah arsip referensi lokal berikut:

| Atribut | Nilai |
|---|---|
| Arsip | `MT2.26.11_reference.zip` |
| Lokasi workspace yang sudah digunakan | `/mnt/data/files/MT2.26.11_reference.zip` |
| Ukuran | `170,268,443 bytes` |
| SHA-256 | `79be2c8909585b002e7c8e0dac0e61eec3dfa1e33f9a75e4abd43ea88821c7ed` |
| Integritas ZIP | CRC test lulus |
| Peran | Sumber lokal untuk pembacaan dan audit; bukan artefak yang di-commit ke repository |

**Penting untuk sesi baru:** gunakan arsip lokal yang sama sebagai sumber bukti. Periksa apakah path di atas tersedia di workspace sesi tersebut. Jika tersedia, verifikasi ukuran/hash bila perlu lalu lanjutkan membaca arsip itu. Jangan mengunduh ulang, membuat salinan arsip, atau meminta pengguna mengirim ulang sebelum memastikan arsip lokal memang tidak tersedia. Jika path tidak tersedia di sesi baru, laporkan kondisi itu terlebih dahulu; jangan mengarang bahwa sumber sudah terbaca.

### Lokasi sumber yang relevan untuk backlog JNI/native

Di dalam struktur hasil ekstraksi arsip, bukti yang sudah dipakai antara lain:

- `reference/apktool/smali/bin/mt/plus/Features3.smali` — deklarasi native dan wrapper Smali.
- `reference/jadx/sources/bin/mt/plus/Features3.java` — representasi JADX untuk cross-check, bukan pengganti Smali.
- `lib/arm64-v8a/libmt3.so`, `lib/armeabi-v7a/libmt3.so`, `lib/x86/libmt3.so`, `lib/x86_64/libmt3.so` — binary native per ABI; gunakan salinan yang sudah diekstrak dari arsip lokal.
- `l/֫ܿ֫.smali` pada dex hasil ekstraksi — worker `run()V` yang memanggil `startMTIO`; path lengkap dan nomor baris bukti dicatat di dokumen audit kanonis.

Path di atas adalah petunjuk lokasi sumber di dalam hasil ekstraksi, bukan file yang harus ditambahkan ke GitHub. Untuk daftar deklarasi, direct call-site, ABI metadata, hash binary, batasan bukti, dan backlog terperinci, baca bagian 9–11 pada [audit filesystem/JNI/permission/bookmark](audit-filesystem-jni-permissions-bookmarks.md).

## Protokol mulai sesi baru (hindari membaca seluruh repository)

1. Pastikan repository dan branch kerja: `savie/BF-Manager`, branch `v1.0`.
2. Baca dokumen ini saja terlebih dahulu untuk memahami provenance, peta dokumen, dan aturan kerja.
3. Baca bagian status/backlog terbaru di [audit lanjutan](audit-follow-up.md); jangan membaca ulang seluruh dokumen historis.
4. Jika melanjutkan JNI/native, baca hanya bagian 9–15 dari [dokumen audit kanonis JNI/native](audit-filesystem-jni-permissions-bookmarks.md), lalu buka sumber lokal yang dirujuk oleh backlog. Status terbaru AUD-01R/AUD-02/AUD-03R dan urutan kerja aktif ada di bagian paling akhir audit-follow-up.md; jangan gunakan tabel status historis yang lebih lama sebagai status aktif.
5. Buka dokumen lain hanya jika tugas aktif memang menyentuh domain dokumen tersebut. Jangan melakukan full-repository read atau mengulang audit yang sudah berstatus selesai.
6. Sebelum mengubah dokumentasi, periksa bagian kanonis yang sudah ada dan tambahkan hasil di sana. Jangan membuat folder/laporan baru untuk satu sesi.

## Aturan pemeliharaan dokumentasi

1. Periksa dokumen pada peta di atas sebelum membuat dokumen baru. Hindari laporan paralel yang mengulang bukti atau kesimpulan yang sama.
2. Tambahkan temuan ke dokumen kanonis yang sudah ada berdasarkan domainnya. Untuk filesystem/JNI/native, gunakan audit-filesystem-jni-permissions-bookmarks.md; untuk resource discovery, gunakan audit-feature-catalog-from-resources.md.
3. Perbarui ringkasan dan backlog di audit-mt-manager.md atau audit-follow-up.md bila status berubah. Jangan menghapus catatan historis; tandai dengan jelas jika sudah superseded.
4. Setiap temuan harus memisahkan fakta teramati, interpretasi, batasan, dan langkah verifikasi. Cantumkan path sumber, method/signature, evidence level, dan provenance bila tersedia.
5. Perubahan Feature ID, status evidence, atau acceptance criteria harus disinkronkan dengan feature-inventory.md dan feature-acceptance-criteria.md.
6. Arsip referensi dan hasil ekstraksi lengkap dipertahankan di workspace lokal untuk menghindari fetch berulang. Repository hanya menyimpan dokumentasi dan artefak turunan yang diperlukan; jangan commit APK referensi, hasil dekompilasi massal, atau binary native referensi.
7. Jangan membuat direktori audit per sesi atau per percobaan. Gunakan struktur dokumentasi yang sudah ada.

## Status audit JNI/native terbaru

- Direct call-site mapping Features3: selesai pada tingkat descriptor langsung; reflection/dynamic invocation dan permission chain masih terbuka.
- Inventaris ELF libmt3.so untuk empat ABI: selesai pada tingkat metadata/symbol/import inventory.
- Disassembly arm64 awal startMTIO/receiveFdResponse dan semantik path/handle I/O telah dicatat; command/state machine, cross-ABI, runtime, dan permission chain masih terbuka.

Rincian bukti dan backlog berada di audit-filesystem-jni-permissions-bookmarks.md bagian 9–15. Bagian 12 mencatat scan reflection Features3; bagian 13 dan 15 mencatat semantik path operations, handle I/O, dan nama file non-UTF-8 pada arm64-v8a; bagian 14 mencatat disassembly awal MTIO dan transfer descriptor.
