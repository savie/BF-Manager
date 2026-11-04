# Audit Reverse Engineering — MT Manager 2.26.11

Dokumentasi ini mencatat hasil pemeriksaan artefak referensi MT Manager 2.26.11 untuk mendukung rekonstruksi perilaku dan implementasi fitur BF-Manager.

## Dokumen audit

| ID | Dokumen | Cakupan | Status |
|---|---|---|---|
| AUD-01 | [Pemetaan JNI Call-Site `Features3`](AUD-01-Features3-callsite-mapping.md) | Deklarasi native, pemindaian direct call-site Smali, wrapper Java, dan adapter file-descriptor | Pemetaan descriptor langsung selesai; analisis call-chain/reflection berlanjut |
| AUD-03 | [Inventaris ELF Awal `libmt3.so`](AUD-03-libmt3-elf-inventory.md) | ABI, metadata ELF, Build ID, dependency, ekspor JNI, dan impor libc | Inventaris awal selesai; disassembly semantik berlanjut |

## Provenance artefak referensi

- Nama arsip: `MT2.26.11_reference.zip`
- Ukuran: 170.268.443 byte
- SHA-256: `79be2c8909585b002e7c8e0dac0e61eec3dfa1e33f9a75e4abd43ea88821c7ed`
- Integritas ZIP: pemeriksaan CRC selesai tanpa entri rusak (`testzip()` menghasilkan `None`).

Arsip referensi dan hasil ekstraksi lengkap tidak disimpan di repository ini. Arsip dipertahankan sebagai bahan kerja lokal agar pemeriksaan berikutnya dapat dilakukan tanpa mengunduh ulang atau melakukan fetch berulang. Repository hanya menyimpan dokumentasi audit dan artefak turunan yang memang diperlukan untuk pengembangan.

## Prinsip pencatatan

1. Pisahkan fakta yang teramati dari interpretasi dan hipotesis.
2. Cantumkan batasan setiap pemeriksaan; hasil inventaris simbol bukan bukti semantik implementasi.
3. Korelasikan hasil native dengan Smali/JADX dan alur permission sebelum menetapkan kontrak implementasi BF-Manager.
4. Jangan menganggap keberhasilan build sebagai bukti feature parity.
