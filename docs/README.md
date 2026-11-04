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
- Disassembly semantik startMTIO/receiveFdResponse, protokol MTIO, dan semantik fungsi filesystem native: belum selesai.

Rincian bukti dan backlog berada di audit-filesystem-jni-permissions-bookmarks.md bagian 9–11.
