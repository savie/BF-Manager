# Audit Lanjutan MT Manager — Permission Flow, Installer, dan Intent

Tanggal: 2026-11-04  
Referensi: `master/reference/apktool` pada repository BF-Manager  
Branch dokumentasi: `v1.0`  
Status: bukti statis Smali/manifest/resource; belum merupakan validasi runtime.

## 1. Cakupan dan provenance

Audit lanjutan membaca ulang branch referensi `master` melalui GitHub connector. Branch `v1.0` tetap hanya berisi dokumentasi pada snapshot ini; tidak ada source project Kotlin/Gradle BF Manager yang sedang diaudit.

Berkas Smali yang diperiksa:
- `reference/apktool/smali/bin/mt/plus/Features.smali`
- `reference/apktool/smali/bin/mt/plus/Features2.smali`
- `reference/apktool/smali/bin/mt/plus/Features3.smali`

Berkas referensi lain:
- `reference/apktool/AndroidManifest.xml`
- `reference/apktool/res/values/strings.xml`

Hash blob GitHub untuk ketiga wrapper:
- Features.smali: `5d4810125123b8821af7a2464483bf017b5c0e1c`
- Features2.smali: `a6b933952353a2e1da4c17438482963a45f3a3e6`
- Features3.smali: `1b2cdf0db7009f5d184adf80e034f5527d722e65`

## 2. Bukti tambahan: jalur akses direktori Android 11+

Resource string referensi secara eksplisit membedakan jalur akses berikut:
- SAF / Documents Provider: pengguna diarahkan memilih folder dan menekan `USE THIS FOLDER`.
- Shell/Shizuku: resource menyatakan akses shell dapat membuka folder tanpa grant SAF dan dapat digunakan pada perangkat non-root setelah Shizuku diaktifkan.
- Root: resource menyebut pemberian akses Root sebagai jalur alternatif.
- Jika DocumentsUI/Files provider perangkat tidak mendukung grant folder tertentu, referensi memberi pesan troubleshooting.

Implikasi untuk BF:
1. Implementasikan SAF sebagai jalur akses folder yang dipilih pengguna dan simpan persisted URI permission.
2. Implementasikan Shizuku/shell dan Root sebagai adapter privilege yang terpisah, bukan menyamakan statusnya dengan SAF.
3. Simpan status kemampuan per provider/adapter; jangan menganggap grant ke satu folder berarti akses filesystem global.
4. Uji grant, revoke, process death, reboot, folder tidak didukung, dan provider yang tidak kompatibel.
5. Jangan membuat UI menyatakan folder bisa diakses jika operasi baca/tulis aktual gagal.

Bukti ini menaikkan pemahaman jalur permission pada level resource, tetapi belum membuktikan call-site lengkap ataupun hasil runtime.

## 3. Bukti tambahan: alur instalasi APK/APKS/XAPK

Resource instalasi memuat:
- Pilihan instalasi melalui Shizuku, Dhizuku, Root, dan system installer.
- Urutan prioritas yang ditampilkan: Shizuku > Dhizuku > Root > System Installer.
- Dhizuku dan Shizuku memerlukan service terpasang dan aktif.
- Root hanya berlaku ketika hak Root tersedia.
- Custom install source hanya didukung pada jalur Root/Shizuku; bukan Dhizuku/system installer.
- Verifikasi signature dan version code sebelum install.
- Penanganan signature tidak cocok, downgrade, APK perlu ditandatangani, target SDK tidak kompatibel, serta opsi mencegah file APK dihapus oleh sistem.

Implikasi kontrak BF:
- Buat `PackageInstallAdapter` dengan adapter terpisah untuk system PackageInstaller, Shizuku, Dhizuku, dan Root.
- Adapter harus mengembalikan hasil bertipe: sukses, dibatalkan pengguna, tidak didukung, permission/service tidak tersedia, signature mismatch, downgrade, parse error, dan kegagalan sistem.
- Jangan mengasumsikan semua adapter mendukung custom installer attribution atau opsi yang sama.
- APK/APKS/XAPK harus memiliki pipeline parsing/validasi yang jelas sebelum masuk adapter instalasi.
- Uji package installer pada versi Android yang didukung, termasuk session multi-package bila format memerlukannya.
- Feature gate VIP pada referensi tidak dibawa ke BF; semua kapabilitas BF tetap gratis sesuai keputusan produk.

## 4. Bukti tambahan: intent dan integrasi file

Manifest menunjukkan entry point `OpenFileActivity` sebagai alias untuk activity internal dan mendeklarasikan:
- ACTION_VIEW dan ACTION_EDIT.
- ACTION_SEND.
- URI scheme `file` dan `content`.
- MIME family text, image, audio, video, dan application.

Manifest juga menunjukkan `OpenTextActivity` untuk VIEW/EDIT atas file/content URI dengan MIME `text/*`.

Implikasi BF:
- Sediakan intent filters yang sesuai dengan fitur yang benar-benar diimplementasikan.
- Tangani URI `content://` melalui ContentResolver dan grant flags; jangan mengubahnya secara naif menjadi filesystem path.
- Tangani ACTION_SEND, ACTION_VIEW, ACTION_EDIT, MIME tidak dikenal, stream null, URI tidak dapat dibaca, dan grant yang dicabut.
- Hindari mengklaim semua `application/*` bisa diedit; routing harus berdasarkan MIME/format dan kemampuan modul.
- Tambahkan acceptance test untuk open/share dari Files, browser, galeri, dan aplikasi pihak ketiga.

## 5. JNI wrapper: kontrak yang dapat dipastikan dari Smali

### Features / libmt1
- `analyze(byte[])` menghasilkan `Object[]`.
- `deleteFile(String)` menghasilkan boolean.
- `getABI()` menghasilkan string.
- `uid2name(int)` menghasilkan string.
- Class initializer memuat library `mt1`.

### Features2 / libmt2
- `init(String,String,String,String)` menghasilkan integer.
- `installSeccomp(int)` menghasilkan integer.
- Class initializer memuat library `mt2`.

### Features3 / libmt3
- Handle I/O: `read`, `write`, `seek`, `tell`, `length`, `truncate`, `sync`, `receiveFdResponse`.
- Path operations: `delete`, `rename`, `lastModified0`, `readlink0`, `stat0`, `listGarbledFileNames`, `startMTIO`.
- Wrapper mengubah path Java menjadi UTF-8 byte array.
- Wrapper `stat` menyediakan array 3 elemen bertipe long; return non-zero dipetakan menjadi `ErrnoException("stat", errno)`.
- Class initializer memuat library `mt3`.

Batas kesimpulan:
- Smali wrapper memastikan signature dan sebagian konversi/exception mapping.
- Belum memastikan implementasi native, semantik handle, ownership FD, concurrency, errno lengkap, atau siapa caller setiap native method.
- BF tidak boleh menyalin library MT atau menganggap API tersebut sebagai kontrak yang harus ditiru. Buat kontrak BF sendiri setelah caller dan kebutuhan perilaku dipetakan.

## 6. Matriks perubahan inventaris

| Feature ID | Bukti baru | Tindak lanjut |
|---|---|---|
| SY-01 | Resource menjelaskan SAF folder grant dan keterbatasan provider Android 11+ | Trace handler SAF, persisted grant, dan revoke |
| SY-02 | Resource menjelaskan shell/Shizuku dan Root sebagai jalur akses alternatif | Trace service binding, permission handshake, dan command execution |
| APK-02 | Resource menjelaskan urutan Shizuku > Dhizuku > Root > System Installer dan perbedaan dukungan opsi | Trace setiap installer adapter dan session lifecycle |
| FM-01 / ED-01 / VW-01 / VW-02 | Manifest menunjukkan VIEW/EDIT/SEND dan URI/MIME filters | Trace activity routing dan grant propagation |
| SY-03 | Manifest memuat komponen terkait script/terminal pada audit sebelumnya | Trace command lifecycle, environment, dan process termination |
| PL-01 | Manifest memuat plugin scheme/receiver | Trace plugin protocol, signature/trust boundary, dan compatibility |

Status feature inventory tidak dinaikkan ke `implemented` atau `validated`. Bukti resource/manifest tetap E1/E2; JNI wrapper hanya E3 interface-level.

## 7. Status dan verifikasi tersisa

Dokumen ini menyimpan bukti statis permission/installer/intent. Statusnya bukan validasi runtime atau implementasi BF.

- SAF: resource memberi petunjuk flow; caller, persisted grant, revocation, dan provider failure masih perlu ditautkan ke source.
- Installer: urutan adapter yang terlihat pada resource adalah petunjuk; session lifecycle dan hasil masing-masing adapter perlu bukti source/runtime.
- Intent: manifest filters menunjukkan entry points; dispatch, URI grant propagation, dan MIME routing perlu ditelusuri.
- JNI declarations: interface-level evidence; direct Features3 call-site, MTIO, dan ELF inventory yang lebih baru dirujuk pada dokumen kanonis filesystem/JNI.

Backlog lintas domain terkini hanya berada di [status audit aktif](audit-follow-up.md). Jangan membuat backlog paralel di dokumen ini.

## 8. Keputusan produk tetap berlaku

- Semua fitur yang teridentifikasi menjadi scope wajib BF Manager.
- Tidak ada login BF Manager, VIP, premium, paywall, subscription, IAP, atau entitlement gate.
- Permission/capability tidak boleh dijadikan alasan menghapus fitur.
- Root dan non-root memang dua capability profile yang berbeda; UI harus mengidentifikasi profile yang tersedia dan menjelaskan metode yang dibutuhkan fitur.
- Tidak ada klaim parity sampai seluruh feature-level acceptance test lulus.
