# Dokumentasi BF-Manager

Dokumen repository ini menggunakan Bahasa Indonesia resmi. Nama API, identifier, canonical term, dan istilah teknis dipertahankan dalam bahasa Inggris bila lebih tepat.

## Mulai dari sini

1. Baca [Status audit aktif](audit-follow-up.md) untuk mengetahui pekerjaan yang selesai, yang masih partial, dan backlog berikutnya.
2. Buka dokumen bukti sesuai domain melalui tabel di bawah.
3. Jangan mengulang audit berstatus selesai atau memakai catatan status lama sebagai status aktif.

## Peta dokumen

| Dokumen | Fungsi |
|---|---|
| [Status audit aktif](audit-follow-up.md) | Satu-satunya dashboard status/backlog; bukan jurnal kronologis. |
| [Audit referensi MT Manager](audit-mt-manager.md) | Provenance APK, manifest, permission, komponen, batasan dekompilasi, pipeline, risiko, keputusan arsitektur. |
| [Audit filesystem/JNI/permission/bookmark](audit-filesystem-jni-permissions-bookmarks.md) | Bukti teknis utama: direct JNI call-site, ELF, native filesystem, MTIO, descriptor handoff, Root/Shizuku, UID, capability, bookmark. |
| [Audit permission/installer/intent](audit-follow-up-permission-installer-intents.md) | Bukti tambahan SAF, alur installer, intent, dan JNI interface. |
| [Katalog fitur resource](audit-feature-catalog-from-resources.md) | Discovery fitur dari strings/resources dan permission leads; E2, bukan bukti runtime. |
| [Inventaris fitur](feature-inventory.md) | Feature ID, scope MT Free + VIP, baseline release, OSS mapping, dan gap. |
| [Kriteria penerimaan](feature-acceptance-criteria.md) | Status baku, quality gates, Definition of Done, acceptance test per fitur. |
| [Spesifikasi P0](bf-manager-p0-spec.md) | Kontrak arsitektur dan test fondasi BF Manager. |

## Sumber audit dan provenance

Sumber utama reverse engineering adalah arsip lokal berikut:

| Atribut | Nilai |
|---|---|
| Arsip | `MT2.26.11_reference.zip` |
| Path workspace yang tercatat | `/mnt/data/files/MT2.26.11_reference.zip` |
| Ukuran | `170,268,443 bytes` |
| SHA-256 | `79be2c8909585b002e7c8e0dac0e61eec3dfa1e33f9a75e4abd43ea88821c7ed` |
| Integritas | CRC test lulus |
| Peran | Sumber bukti lokal; arsip dan hasil ekstraksi massal tidak di-commit ke repository. |

Pada sesi baru, periksa apakah arsip tersebut tersedia di workspace. Jika tersedia, lanjutkan memakai arsip yang sama dan verifikasi hash bila diperlukan. Jika tidak tersedia, laporkan ketiadaannya; jangan mengklaim sudah membaca sumber lokal atau mengunduh ulang tanpa alasan.

### Lokasi bukti penting dalam hasil ekstraksi

- `reference/apktool/smali/bin/mt/plus/Features*.smali` — wrapper/interface JNI.
- `reference/jadx/sources/bin/mt/plus/Features*.java` — cross-check JADX; bukan pengganti Smali.
- `lib/<abi>/libmt*.so` — native library per ABI.
- Class obfuscated worker/server/provider dan bukti line-level dijelaskan pada dokumen audit filesystem/JNI.

Path tersebut merujuk struktur ekstraksi lokal, bukan instruksi menambahkan hasil dekompilasi atau binary MT ke Git.

## Aturan evidence dan status

- **E1:** metadata/manifest.
- **E2:** resource, string, layout, atau menu.
- **E3:** source/call-site sampai API/domain ditelusuri.
- **E4:** perilaku diuji pada APK referensi dengan environment tercatat.
- **E5:** perilaku BF diuji pada implementasi BF dengan test evidence.

Status audit (selesai/partial/pending) berbeda dari status implementasi BF (not_started/implemented/validated). Resource string tidak membuktikan runtime. Deklarasi JNI tidak membuktikan caller. Hasil JADX dengan control-flow gagal harus dikonfirmasi melalui Smali/disassembly.

## Aturan pemeliharaan

1. Gunakan `audit-follow-up.md` sebagai satu-satunya dashboard status dan backlog.
2. Tambahkan fakta teknis ke dokumen domain yang sudah ada; jangan membuat file histori, laporan per sesi, atau backlog paralel.
3. Pertahankan bukti krusial: source path, signature, hash, ABI, angka hasil scan, negative findings, koreksi interpretasi, batasan, dan keputusan teknis.
4. Pisahkan fakta, interpretasi, batasan, dan verifikasi. Jika kesimpulan berubah, perbarui bagian kanonis dan dashboard agar tidak ada dua status aktif bertentangan.
5. Sinkronkan perubahan Feature ID/evidence/acceptance ke `feature-inventory.md` dan `feature-acceptance-criteria.md`.
6. Jangan commit APK referensi, dekompilasi massal, native binary MT, credential, signing material, atau asset tanpa izin redistribusi.
7. Repository ini adalah **BF-Manager**. Jangan mencampur nama, path, status, atau artefak proyek lain.

## Prinsip produk

Target BF Manager adalah cakupan fitur MT Manager Free dan VIP dengan implementasi, UI, dan arsitektur BF sendiri. Semua fitur dalam scope tersedia tanpa VIP/paywall/subscription/login BF. Prioritas hanya menentukan urutan, bukan menghapus fitur. Parity tidak boleh diklaim sebelum implementasi dan acceptance test seluruh fitur lulus.
