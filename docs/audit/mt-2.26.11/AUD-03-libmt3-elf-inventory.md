# AUD-03 — Inventaris ELF Awal `libmt3.so`

**Tanggal:** 2026-11-04  
**Sumber:** `reference/apktool/lib/<abi>/libmt3.so` dari `MT2.26.11_reference.zip`  
**Tujuan:** inventaris ABI, metadata ELF, dependency, dan ekspor JNI; belum merupakan reverse engineering semantik fungsi.

## 1. Ringkasan

Empat varian ABI ditemukan: `arm64-v8a`, `armeabi-v7a`, `x86`, dan `x86_64`. Seluruh varian adalah shared object Android, bertipe ELF `DYN`, little-endian, ditautkan untuk Android API 21, dibangun dengan NDK `r29-beta2 (13599879)`, dan berstatus stripped.

Keempat varian mengekspor 16 simbol JNI bernama `Java_bin_mt_plus_Features3_<method>`, sesuai 16 deklarasi native di `Features3.smali`. Tidak ditemukan simbol ekspor `JNI_OnLoad` atau `JNI_OnUnload` pada dynamic symbol table yang diperiksa. Ini konsisten dengan penggunaan JNI name-based exports untuk wrapper yang terlihat, tetapi belum menyingkirkan kemungkinan registrasi/dispatch tambahan melalui mekanisme lain.

## 2. Metadata per ABI

| ABI | ELF | Machine | Build ID (SHA-1) | SHA-256 file |
|---|---|---|---|---|
| arm64-v8a | ELF64 | AArch64 | `382cb5bbd6b1704cb617da77d18df8e1b50ee025` | `843168d72677af9670cc5048e45a603c05a28cbf8e33191f946b0fb08438f8fa` |
| armeabi-v7a | ELF32 | ARM EABI5 | `36239aa16cb2f4a9f6013a5b57d1991d74cccc38` | `0ad442fcd7d30d4155a4b1ac75aafb41ccc1695e4d069739d178b30456079103` |
| x86 | ELF32 | Intel 80386 | `62962ca13040af3b1ae66b502392408b29576141` | `0f60ec3a492cf6afe6546768913a54fbfdf09b51a2c44f6524dfeea40577aefe` |
| x86_64 | ELF64 | AMD x86-64 | `a5af34d4425aaa73f8f007f50103756091964000` | `2c801ffaa2a0bf11603ded6dfaeaf079ed0518f35cddc1ee8742b3a63936ce7a` |

## 3. Dynamic dependencies

Seluruh ABI melaporkan SONAME `libmt3.so` dan dependency langsung:
- `libm.so`
- `libdl.so`
- `libc.so`

Tidak terlihat dependency langsung terhadap `libandroid.so` atau library JNI terpisah pada dynamic section yang diperiksa.

## 4. Ekspor JNI

Seluruh ABI mengekspor 16 fungsi JNI dengan pola `Java_bin_mt_plus_Features3_*`, yaitu:

`delete`, `lastModified0`, `length`, `listGarbledFileNames`, `newStringUTF`, `read`, `readlink0`, `receiveFdResponse`, `rename`, `seek`, `startMTIO`, `stat0`, `sync`, `tell`, `truncate`, `write`.

Kesesuaian jumlah dan nama dengan deklarasi Java/Smali adalah bukti kuat bahwa JNI binding utama menggunakan ekspor bernama, bukan semata-mata `RegisterNatives` pada `JNI_OnLoad`.

## 5. Simbol libc yang relevan

Dynamic undefined symbols yang terlihat mencakup:
- I/O descriptor: `read`, `write`, `lseek`, `lseek64`, `fstat`, `ftruncate`, `ftruncate64`, `fsync`.
- Path/filesystem: `stat`, `lstat`, `fstatat`, `readlink`, `readlinkat`, `rename`, `readdir`.
- Lainnya: `__read_chk`, `fwrite`.

Daftar ini menunjukkan bahwa implementasi native berinteraksi dengan API filesystem POSIX/Bionic. Namun, simbol import saja tidak membuktikan fungsi mana yang memanggilnya atau flag/errno/urutan operasinya.

## 6. Batasan

- Binary stripped; nama fungsi JNI yang diekspor masih terlihat, tetapi simbol internal dan nama source-level tidak tersedia.
- Belum dilakukan disassembly/decompilation per fungsi.
- Belum diverifikasi penggunaan syscall langsung, `ioctl`, socket/pipe, atau helper internal.
- Belum dibandingkan instruksi antar-ABI untuk memastikan kesetaraan semantik.
- Belum diaudit `libmtprotect.so`, `libmt1.so`, dan `libmt2.so`.

## 7. Kesimpulan dan tindak lanjut

Inventaris ELF `libmt3.so` untuk empat ABI selesai. Seluruh varian menyediakan 16 ekspor JNI yang sesuai dengan `Features3`; dependency langsungnya terbatas pada `libm`, `libdl`, dan `libc`, sementara impor filesystem POSIX/Bionic terlihat jelas.

Langkah berikutnya adalah mengurai implementasi fungsi `startMTIO` dan `receiveFdResponse`, kemudian fungsi filesystem (`read/write/seek/tell/truncate/sync/stat/rename/delete/listGarbledFileNames`) dengan disassembly per ABI. Hasilnya harus dikorelasikan kembali dengan caller Smali sebelum kontrak perilaku BF ditetapkan.
