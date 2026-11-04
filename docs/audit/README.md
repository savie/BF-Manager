# Audit Referensi MT Manager

Dokumen audit hasil pemeriksaan referensi MT Manager disimpan di direktori ini. Artefak referensi besar tetap berada pada penyimpanan kerja lokal; repository hanya menyimpan laporan, metadata provenance, dan hasil analisis yang relevan untuk pengembangan BF Manager.

## Laporan

| ID | Dokumen | Ruang lingkup | Status |
|---|---|---|---|
| AUD-01 | [Pemetaan JNI Call-Site Features3](AUD-01-Features3-callsite-mapping.md) | Deklarasi JNI dan pemanggil Smali langsung | Selesai untuk pencarian descriptor langsung; dynamic/reflection tracing terbuka |
| AUD-03 | [Inventaris ELF libmt3.so](AUD-03-libmt3-elf-inventory.md) | ABI, metadata ELF, dependencies, JNI exports | Inventaris awal selesai; semantik native belum direverse engineer |

## Prinsip provenance

- Sumber: `MT2.26.11_reference.zip`.
- SHA-256: `79be2c8909585b002e7c8e0dac0e61eec3dfa1e33f9a75e4abd43ea88821c7ed`.
- Jangan commit APK, hasil decode massal, DEX, Smali lengkap, atau library native milik aplikasi referensi ke repository BF Manager.
- Simpan artefak referensi pada storage lokal untuk pembacaan dan ekstraksi terarah.
- Commit laporan analisis, hash sumber, bukti call-site, dan kontrak perilaku yang diperlukan bagi implementasi independen.
- Jangan menyamakan keberadaan string, deklarasi API, atau ekspor JNI dengan feature parity yang telah diuji.

