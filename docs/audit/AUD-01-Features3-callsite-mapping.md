# AUD-01 — Pemetaan JNI Call-Site `Features3`

**Tanggal audit:** 2026-11-04  
**Sumber:** `MT2.26.11_reference.zip`  
**Ukuran sumber:** 170.268.443 byte  
**SHA-256:** `79be2c8909585b002e7c8e0dac0e61eec3dfa1e33f9a75e4abd43ea88821c7ed`

## 1. Ruang lingkup dan integritas sumber

Arsip berhasil dibuka dan diuji menggunakan pemeriksaan CRC ZIP (`testzip()` menghasilkan `None`). Arsip memuat 76.375 entri, termasuk 33.491 file Smali dan 83 file ELF `.so`.

Pemindaian descriptor langsung `Lbin/mt/plus/Features3;->` dilakukan terhadap seluruh file Smali di dalam arsip, bukan hanya subtree obfuscated. Hasilnya adalah 21 referensi tekstual: 3 referensi internal dari wrapper Java `Features3` dan 18 referensi eksternal pada 7 file Smali.

## 2. Deklarasi native

`reference/apktool/smali/bin/mt/plus/Features3.smali` mendeklarasikan native methods berikut dan memuat `libmt3` melalui `System.loadLibrary("mt3")`:

| Native method | Signature | Catatan awal |
|---|---|---|
| `delete` | `(String, byte[]) -> boolean` | Penghapusan nama/path berbasis byte |
| `lastModified0` | `(byte[]) -> long` | Metadata waktu modifikasi |
| `length` | `(int) -> long` | Metadata ukuran dari integer handle |
| `listGarbledFileNames` | `(String) -> byte[][]` | Enumerasi nama file nonstandar/garbled |
| `newStringUTF` | `(byte[]) -> String` | Konversi byte ke String melalui native |
| `read` | `(int, byte[], int, int) -> int` | Baca dari integer handle |
| `readlink0` | `(byte[]) -> byte[]` | Resolusi symbolic link berbasis byte path |
| `receiveFdResponse` | `(int) -> long` | Menerima respons FD melalui kanal MTIO |
| `rename` | `(String, byte[], String) -> boolean` | Rename dengan nama sumber berbasis byte |
| `seek` | `(int, long) -> void` | Ubah posisi handle |
| `startMTIO` | `(String, String) -> int` | Memulai mekanisme MTIO |
| `stat0` | `(byte[], long[]) -> int` | Metadata filesystem; hasil ditulis ke array long |
| `sync` | `(int) -> void` | Sinkronisasi handle |
| `tell` | `(int) -> long` | Posisi handle saat ini |
| `truncate` | `(int, long) -> void` | Ubah panjang file melalui handle |
| `write` | `(int, byte[], int, int) -> void` | Tulis ke integer handle |

Wrapper Java Smali tambahan:
- `ۙ(String) -> long` mengubah path menjadi UTF-8 lalu memanggil `lastModified0`; `IOException` dibungkus ulang.
- `ۤ(String) -> long[]` mengalokasikan array tiga elemen, memanggil `stat0`, dan melempar `ErrnoException("stat", errno)` bila hasil bukan nol.
- `᩷(String) -> String` memanggil `readlink0`, lalu mengubah byte hasil ke UTF-8; `null` dipertahankan.

## 3. Direct call-site yang ditemukan

| DEX | File Smali | Method pemanggil / operasi | Native method |
|---|---|---|---|
| classes2 | `l/֫ܿ֫.smali:539` | `run()V` — jalur worker MTIO | `startMTIO` |
| classes3 | `l/֨ۨᩴ.smali:83` | `۟᩷()Z` — penghapusan file dengan fallback | `delete` |
| classes3 | `l/֨ۨᩴ.smali:208` | `ܿ᩷()[B` — enumerasi nama garbled | `listGarbledFileNames` |
| classes3 | `l/֨ۨᩴ.smali:222` | `ܿ᩷()[B` — konversi nama byte ke String | `newStringUTF` |
| classes3 | `l/֨ۨᩴ.smali:743` | wrapper/helper metadata waktu | `ۙ(String)` → `lastModified0` |
| classes3 | `l/֨ۨᩴ.smali:973` | wrapper/helper readlink | `᩷(String)` → `readlink0` |
| classes3 | `l/֨ۨᩴ.smali:1247` | `᩷(Ll/᩷ۨᩴ;)Z` — fallback rename | `rename` |
| classes3 | `l/ۖۨᩴ.smali:32` | `ۙ(Ll/᩷ۨᩴ; File)` — klasifikasi metadata file | `ۤ(String)` → `stat0` |
| classes3 | `l/ۙܽۤ.smali:83` | `length()J` | `length` |
| classes3 | `l/ۙܽۤ.smali:96` | `position()J` | `tell` |
| classes3 | `l/ۙܽۤ.smali:109` | `read([BII)I` | `read` |
| classes3 | `l/ۙܽۤ.smali:127` | `seek(J)V` | `seek` |
| classes3 | `l/ۙܽۤ.smali:138` | `setLength(J)V` | `truncate` |
| classes3 | `l/ۙܽۤ.smali:149` | `write([BII)V` | `write` |
| classes3 | `l/ۙܽۤ.smali:195` | `ܺ()V` — sinkronisasi | `sync` |
| classes4 | `l/ۜܿᩴ.smali:1466` | `ۡۙ()J` — metadata waktu dengan fallback | `ۙ(String)` → `lastModified0` |
| classes4 | `l/ܰۨᩴ.smali:1451` | `ۙ(File)` — pemeriksaan jalur khusus Android | `᩷(String)` → `readlink0` |
| classes4 | `l/ܶ۟ᩴ.smali:1968` | callback sintetis `ۤ(I)Long` | `receiveFdResponse` |

**Kesimpulan langsung:** seluruh 16 deklarasi native teridentifikasi. Dari 18 referensi eksternal, jalur file-handle I/O (length/tell/read/seek/truncate/write/sync) terpusat pada adapter `l/ۙܽۤ.smali`, yang menyimpan `ParcelFileDescriptor` dan integer hasil `getFd()`. Jalur MTIO terlihat terpisah melalui `startMTIO` dan `receiveFdResponse`.

## 4. Bukti semantik yang sudah dapat dipastikan

1. Adapter I/O menerima `ParcelFileDescriptor`, mengambil `getFd()`, lalu menggunakan integer tersebut untuk semua operasi `length`, `tell`, `read`, `seek`, `truncate`, `write`, dan `sync`.
2. `close()` pada adapter menutup `ParcelFileDescriptor`; tidak ditemukan pemanggilan native close pada adapter tersebut.
3. Adapter mengubah hasil `read == 0` menjadi `-1`. Ini adalah perilaku wrapper Java yang harus dipertahankan atau diverifikasi lebih lanjut terhadap kontrak native.
4. Jalur penghapusan dan rename menggunakan fallback native hanya setelah operasi `File.delete`/`File.renameTo` atau pemeriksaan nama tertentu tidak berhasil. Terdapat fallback tambahan melalui helper/root bridge pada kondisi tertentu.
5. `stat0` mengisi array `long[3]`; pemanggil membaca elemen pertama sebagai mode file, elemen kedua sebagai ukuran (kecuali direktori), dan elemen ketiga sebagai metadata lain yang belum ditafsirkan pada tahap ini.
6. `receiveFdResponse(int)` mengembalikan `long` dan callback membungkusnya menjadi `Long`; `IOException` diteruskan melalui handler error.

## 5. Hal yang belum terverifikasi

- Isi dan kontrak native di dalam `libmt3.so`, termasuk implementasi JNI registration dan perilaku errno.
- Arti pasti kedua parameter `startMTIO(String, String)` dan pemetaan status integer yang dikembalikan.
- Semantik tepat `receiveFdResponse(int)` dan apakah nilai `long` merupakan descriptor, token, atau nilai protokol lain.
- Layout ketiga elemen array hasil `stat0` secara penuh.
- Semantik encoding untuk `listGarbledFileNames`, `newStringUTF`, dan `delete/rename` pada filename non-UTF-8.
- Jalur permission/capability yang mengantar ke pemanggil native (SAF, Root, Shizuku, Dhizuku, atau bridge lain).
- Kemungkinan pemanggilan reflektif/dinamis yang tidak mengandung descriptor langsung. Pemindaian descriptor langsung tidak membuktikan ketiadaan seluruh jalur refleksi.

## 6. Catatan anomali hasil dekompilasi

JADX menampilkan beberapa sumber Java tambahan yang mengimpor `Features3`, termasuk dua kelas adapter I/O dengan bentuk kode serupa dan satu kelas worker tambahan yang memanggil `startMTIO`. Namun, pemindaian seluruh Smali pada arsip menemukan tepat satu direct call-site `startMTIO` dan satu kelas adapter Smali untuk operasi handle I/O. Perbedaan representasi JADX tersebut perlu direkonsiliasi dengan pemetaan class DEX sebelum dianggap sebagai call-site tambahan.

## 7. Langkah audit berikutnya

1. Audit `libmt3.so` per ABI: ELF header, architecture, dynamic symbols, dependencies, JNI exports/registration, build-id, dan strings yang relevan.
2. Rekonstruksi state machine worker `run()V` untuk mengetahui asal parameter `startMTIO` dan status hasilnya.
3. Telusuri caller adapter I/O ke factory yang membuat `ParcelFileDescriptor`, termasuk mode read/write dan sumber descriptor.
4. Telusuri callback `receiveFdResponse` ke protokol MTIO dan pengiriman descriptor.
5. Korelasikan seluruh jalur dengan permission/capability sebelum menetapkan kontrak implementasi BF.

## 8. Status

**AUD-01: direct JNI declaration dan direct call-site mapping awal — selesai untuk pencarian descriptor langsung pada arsip ini.**  
**AUD-01: reflection/dynamic invocation dan call-chain sampai permission/native behavior — masih berlangsung.**
