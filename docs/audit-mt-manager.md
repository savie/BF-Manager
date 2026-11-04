# Audit Referensi MT Manager 2.26.11

Tanggal audit: 2026-11-04  
Repositori: `savie/BF-Manager`  
Referensi yang diaudit: hasil dekompilasi pada branch `master` di `bf_manager/` dan `reference/`.  
Branch tujuan implementasi: `v1.0`.

## 1. Ringkasan eksekutif

Repositori memuat hasil dekompilasi APK MT Manager, bukan source project Android asli. Isi yang terlihat mencakup `AndroidManifest.xml`, `apktool.yml`, resource Android, beberapa direktori Smali, library native, dan hasil JADX. Branch `v1.0` saat audit masih berupa fondasi minimal (README saja), sehingga belum ada aplikasi Kotlin native yang dapat dibangun.

Dokumentasi ini merupakan audit awal berbasis artefak dekompilasi dan metadata yang dapat dibaca melalui GitHub. Ini **bukan** klaim bahwa setiap fitur MT Manager telah berhasil dieksekusi atau seluruh alur telah dipetakan. Daftar fitur final harus dilengkapi dengan penelusuran source/resource lebih lanjut dan uji perilaku pada APK referensi yang sah.

## 2. Struktur artefak

| Lokasi | Isi / makna | Catatan |
|---|---|---|
| `bf_manager/AndroidManifest.xml` | Deklarasi komponen, permission, intent filter, metadata | Sumber utama audit permission dan komponen |
| `bf_manager/res/` | Layout, drawable, menu, values, XML, variasi resource | Dapat memetakan UI dan string fitur |
| `bf_manager/smali/` dan `smali_classes2..5/` | Bytecode Dalvik hasil decode | Logika aplikasi tersebar dan obfuscated |
| `bf_manager/lib/` | Native libraries | Fitur native perlu dianalisis terpisah per ABI |
| `bf_manager/assets/` | Asset data, script, plugin, konfigurasi dan resource lain | Perlu identifikasi format dan fungsi |
| `reference/apktool/` | Referensi hasil apktool | Struktur lengkap hasil decode |
| `reference/jadx/sources/` | Source-like Java hasil JADX | Bukan source asli; hasil decompiler dapat salah/tidak lengkap |
| `reference/jadx/resources/` | Resource hasil JADX | Pembanding resource |
| `reference/jadx/jadx.log`, `errors.txt` | Catatan proses dekompilasi | Wajib dipakai untuk menandai kelas yang gagal direkonstruksi |

## 3. Identitas dan versi

README pada branch `v1.0` menyebut target referensi MT Manager versi 2.26.11. Artefak dekompilasi pada branch `master` harus tetap diverifikasi terhadap APK yang tepat: package name, versionName, versionCode, minSdk, targetSdk, signer, dan hash APK. Jangan menganggap angka versi README sebagai bukti metadata APK tanpa pemeriksaan manifest dan apktool metadata.

## 4. Fitur yang terindikasi dari artefak

Indikasi di bawah merupakan petunjuk audit, bukan jaminan kelengkapan implementasi.

### 4.1 Pengelolaan berkas
- Navigasi direktori dan daftar berkas/folder.
- Operasi berkas dasar yang perlu diverifikasi: salin, pindah, hapus, rename, buat folder/berkas, properti, pencarian, sort, dan multi-select.
- Dukungan penyimpanan eksternal dan akses direktori melalui mekanisme Android.
- Pengelolaan berkas tersembunyi dan pengaturan tampilan.
- Perlu uji khusus untuk SAF, scoped storage, `MANAGE_EXTERNAL_STORAGE`, dan izin per direktori.

### 4.2 Editor dan pengembangan
- Artefak resource syntax/highlighting mengindikasikan dukungan editor teks/kode.
- Ada asset terkait Markdown preview dan KaTeX.
- Perlu penelusuran kelas untuk memastikan kemampuan editor: encoding, line number, search/replace, syntax highlighting, undo/redo, dan preview.

### 4.3 Arsip dan paket aplikasi
- Struktur resource/Smali mengindikasikan dukungan pemrosesan berbagai format arsip dan paket.
- APK, DEX, manifest, resource table, signing, zip operations, dan format lain wajib dipisahkan menjadi kapabilitas yang diuji; jangan menyimpulkan dukungan hanya dari nama library atau string.

### 4.4 Android package / binary tools
- Artefak `bin/mt/plus` teridentifikasi di Smali, termasuk kelas `Main`, `Features`, `Features2`, dan `Features3`.
- Ada referensi kelas `ActivityRecordService` dan pemeriksaan package tertentu.
- Perlu pemetaan rinci fitur APK editor, DEX, manifest, resource, signing, alignment, dan integrasi shell.

### 4.5 Integrasi sistem
- String resource menyebut akses semua file, floating window, dan Shizuku/shell authorization.
- Ini menunjukkan adanya alur permission khusus, tetapi jenis permission dan kebutuhan setiap fitur harus diverifikasi melalui manifest dan pemanggil API.
- Permission bukan sesuatu yang dapat diberikan aplikasi secara diam-diam. Implementasi BF Manager harus meminta izin runtime atau mengarahkan pengguna ke halaman Settings sesuai ketentuan Android.

### 4.6 VIP dan akun
- Resource strings memuat teks tentang akun MT dan aktivasi VIP.
- Teks tersebut membuktikan adanya UI/konsep VIP, bukan daftar definitif feature gate atau implementasi entitlement.
- BF Manager memiliki requirement produk berbeda: seluruh fitur BF Manager tersedia lokal tanpa login dan tanpa subscribe. Jangan membawa sistem login, pembayaran, server VIP, atau pemeriksaan entitlement MT ke aplikasi BF Manager.

## 5. Permission dan integrasi Android

Audit permission harus menghasilkan tabel final dengan kolom: permission/feature, deklarasi manifest, API yang menggunakannya, versi Android yang terdampak, cara meminta izin, fallback ketika ditolak, serta test case.

Poin yang wajib ditelusuri:
1. `READ_EXTERNAL_STORAGE` / `WRITE_EXTERNAL_STORAGE` untuk kompatibilitas versi lama.
2. `MANAGE_EXTERNAL_STORAGE` untuk akses pengelolaan semua file pada Android yang mendukungnya; harus melalui pengaturan khusus dan kebijakan distribusi yang relevan.
3. Media permissions versi Android baru bila akses hanya ke media.
4. SAF `ACTION_OPEN_DOCUMENT` / `ACTION_OPEN_DOCUMENT_TREE` dan persistable URI permission.
5. Overlay permission `SYSTEM_ALERT_WINDOW` bila memang ada fitur floating window.
6. Shizuku atau akses shell sebagai integrasi opsional yang membutuhkan setup/otorisasi pengguna.
7. Notification, foreground service, package visibility, dan permission lain setelah dibuktikan dari manifest serta penggunaan kode.

**Jangan menyalin seluruh permission MT secara membabi buta.** BF Manager harus memakai prinsip minimum permission yang diperlukan; UX menjelaskan alasan dan menyediakan fallback.

## 6. Batasan dan kualitas hasil dekompilasi

- Nama class/method yang obfuscated menyulitkan pemetaan domain.
- JADX dapat menghasilkan kode tidak valid atau kehilangan struktur kontrol; Smali tetap menjadi bukti bytecode untuk kasus ambigu.
- Binary XML/resource dapat memiliki placeholder hasil decode. Placeholder tersebut bukan nama resource asli.
- Native library tidak otomatis dapat dipindahkan ke aplikasi Kotlin; perlu analisis ABI, JNI, dan lisensi.
- Asset tertanam mungkin memiliki lisensi dan ketentuan redistribusi tersendiri.
- Artefak dekompilasi tidak memberikan jaminan bahwa seluruh source asli atau build configuration tersedia.

## 7. Strategi implementasi BF Manager

BF Manager harus menjadi implementasi baru Kotlin native, bukan repackaging, patching, atau penyalinan kode proprietari MT Manager. Gunakan audit ini untuk memahami kebutuhan pengguna dan kompatibilitas Android, lalu implementasikan perilaku secara independen.

Arsitektur awal yang disarankan:
- `app`: UI dan lifecycle.
- `core/filesystem`: abstraction filesystem, SAF, URI grants, operasi file.
- `core/archive`: adapter format arsip.
- `feature/editor`: editor teks dan syntax.
- `feature/apk`: parser/inspector APK dan operasi yang implementasinya tersedia secara sah.
- `feature/hex`: hex viewer/editor.
- `feature/terminal`: integrasi shell lokal yang dibatasi dan eksplisit.
- `feature/settings`: permission status, tema, bahasa, preferensi.
- `feature/vip`: hanya label/pengelompokan fitur premium secara UX; seluruh fungsi tetap terbuka tanpa akun.

Gunakan AndroidX dan Jetpack sesuai kebutuhan, Kotlin coroutines, dependency injection yang ringan, serta modularisasi berdasarkan fitur. Pilih minSdk/targetSdk setelah matriks kompatibilitas ditetapkan.

## 8. Matriks audit lanjutan

Status awal:
- [x] Identifikasi struktur dekompilasi di branch master.
- [x] Identifikasi keberadaan manifest, resources, Smali multi-dex, assets, native libs, JADX.
- [x] Identifikasi string yang menyebut VIP, all-files access, floating window, Shizuku, Markdown.
- [ ] Ekstrak seluruh permission dari manifest dan kelompokkan menurut risiko/fitur.
- [ ] Inventaris seluruh Activity, Service, Receiver, Provider, intent filter.
- [ ] Pemetaan menu dan layar dari resources/layout/menu/navigation.
- [ ] Pemetaan kelas domain dan API berdasarkan source JADX + konfirmasi Smali.
- [ ] Inventaris operasi filesystem dan edge cases.
- [ ] Inventaris format arsip dan kemampuan kompresi/dekompresi.
- [ ] Inventaris editor, syntax, preview, encoding.
- [ ] Inventaris APK/DEX/resource/manifest/signer tools.
- [ ] Pemetaan fitur VIP yang benar-benar terkunci di runtime.
- [ ] Pemeriksaan lisensi third-party dan native libraries.
- [ ] Uji perilaku referensi pada perangkat/emulator per versi Android.

## 9. Kriteria penerimaan sebelum implementasi lengkap

Setiap fitur harus mempunyai:
1. ID dan deskripsi fitur yang tidak ambigu.
2. Bukti sumber (file/class/resource/manifest) dan tingkat keyakinan.
3. Alur pengguna dan permission yang diperlukan.
4. Implementasi independen pada BF Manager.
5. Unit test dan instrumentation test.
6. Uji error, cancellation, file besar, storage penuh, permission ditolak, dan proses dihentikan.
7. Status: belum dimulai, berjalan, terimplementasi, tervalidasi, atau diblokir.

Tidak ada klaim "tanpa bug" yang dapat dijamin. Target kualitas adalah tidak ada known blocker, regression suite lulus, dan seluruh fungsi yang dinyatakan tersedia memiliki test evidence.

## 10. Kesimpulan

Artefak pada branch master cukup untuk memulai reverse-engineering fungsional, tetapi belum cukup untuk menyatakan katalog fitur MT Manager lengkap. Langkah berikutnya adalah menyelesaikan inventaris manifest, layar, class, resource, dan permission dengan bukti yang bisa dilacak. Setelah baseline audit disetujui, implementasi Kotlin native BF Manager dilakukan pada branch `v1.0`, dengan semua fungsi produk tersedia tanpa login dan tanpa subscription.
