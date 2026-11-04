# Status Audit Aktif dan Backlog

Tanggal konsolidasi: 2026-11-04  
Branch dokumentasi: `v1.0`  
Referensi: MT Manager 2.26.11; provenance arsip lokal tercatat di [README](README.md).

Dokumen ini adalah dashboard status saat ini, bukan jurnal kegiatan. Bukti lengkap berada pada dokumen domain. Catatan status historis yang sudah superseded tidak dipertahankan di sini.

## 1. Status audit

| ID | Area | Status | Cakupan yang sudah terbukti | Sisa verifikasi utama |
|---|---|---|---|---|
| AUD-01 | Direct JNI call-site | **Selesai** | Seluruh Smali dipindai untuk descriptor Features3; 18 referensi eksternal pada 7 file dan 3 referensi internal wrapper. Adapter handle I/O, caller `startMTIO`, serta callback `receiveFdResponse` dipetakan. | Tidak ada backlog untuk direct descriptor mapping yang sudah ditutup; temuan baru harus berupa bukti tambahan spesifik. |
| AUD-01R | Reflection/dynamic invocation | **Partial** | Scan statis 33.491 file Smali tidak menemukan bukti eksplisit reflection/MethodHandle yang memanggil Features3. Reflection umum ditemukan. | Decoder string pada callback/launcher, dynamic DEX loading, JNI registration dinamis, serta jalur invokasi yang tidak tertangkap scan statis. |
| AUD-02 | Native filesystem semantics | **Partial** | Path operations, handle I/O (read/write/fsync/lseek/fstat/ftruncate), dan `listGarbledFileNames` dianalisis pada arm64-v8a. | Error/race review, `newStringUTF`, cross-ABI instruction comparison, runtime, permission/provider semantics. |
| AUD-03 | ELF inventory | **Selesai pada level inventory** | Empat ABI `libmt3.so`: ELF metadata, Build ID, SHA-256, dependencies, 16 JNI exports, dan imports POSIX/Bionic. | Pemahaman semantik native adalah domain AUD-03R, bukan bagian yang dianggap selesai oleh inventory. |
| AUD-03R | Disassembly `libmt3.so` | **Partial** | `startMTIO`/`receiveFdResponse`, SCM_RIGHTS, PFD handoff, server LocalSocket/TCP, helper preparation, callback C11762 → worker, dan pembentukan `String[4]` terpetakan sebagian. | Nilai konfigurasi, command launcher aktual, state machine helper, descriptor lifecycle penuh, serta perbandingan instruction lintas ABI. |
| AUD-04 | Permission/provider mapping | **Partial** | Backend Root, Shizuku, fallback app shell, UID 0/2000, capability provider, helper placement, dan callback/worker MTIO terpetakan sebagian. | Permission grant, process identity runtime, UID/SELinux per perangkat, command launcher, fallback runtime, serta provider chain end-to-end. |
| AUD-05 | Feature inventory/evidence sync | **Konsolidasi berjalan** | Feature ID, resource discovery, baseline Free/VIP, delta 2.26.10–2.26.11, kandidat OSS, dan acceptance criteria telah dikatalogkan. | Sinkronkan evidence per fitur saat bukti call-site/runtime bertambah; jangan menaikkan status dari resource string saja. |

**Makna status:** `Selesai` berlaku hanya pada cakupan yang tertulis. `Partial` berarti sebagian kontrak sudah dibuktikan, bukan audit harus diulang dari awal. Bukti statis dan runtime tetap dibedakan.

## 2. Backlog aktif berurutan

1. **AUD-01R:** identifikasi dan decode string yang benar-benar dipanggil oleh `C11762.ۙ(String, boolean)` dan helper terkait; batasi pencarian pada callback, worker, dan launcher MTIO.
2. **AUD-03R:** pulihkan empat nilai konfigurasi worker `String[4]`, khususnya mode, socket path, dan command/helper arguments. Buktikan invocation yang benar-benar menjalankan executable `mtio`; penempatan file saja tidak membuktikan invocation.
3. **AUD-04:** tautkan server endpoint → callback → command launcher → process/helper; petakan permission grant, UID aktual, SELinux, dan fallback provider. Root/Shizuku bukan asumsi backend yang selalu aktif.
4. **AUD-03R:** rekonstruksi command/state machine helper dan descriptor lifecycle; bandingkan instruksi native lintas ABI setelah fungsi dan calling convention tervalidasi.
5. **AUD-02:** selesaikan review `newStringUTF`, error-path, race/lifecycle, dan perbedaan ABI; lakukan runtime test bila APK, perangkat, dan instrumentation tersedia.
6. **AUD-05:** sinkronkan Feature ID, evidence level, keputusan implementasi BF, serta acceptance criteria setelah bukti baru cukup.

## 3. Dokumen sumber bukti

| Domain | Dokumen kanonis |
|---|---|
| Filesystem, JNI, ELF, MTIO, permission/provider, bookmark | [Audit filesystem/JNI](audit-filesystem-jni-permissions-bookmarks.md) |
| SAF, installer, intent, permission leads | [Audit permission/installer/intent](audit-follow-up-permission-installer-intents.md) |
| Discovery fitur berbasis resource | [Katalog fitur resource](audit-feature-catalog-from-resources.md) |
| Baseline APK, manifest, provenance, pipeline, keputusan arsitektur | [Audit referensi MT](audit-mt-manager.md) |
| Feature ID, cakupan Free/VIP, delta versi, OSS mapping | [Inventaris fitur](feature-inventory.md) |
| Definition of Done dan test contract | [Kriteria penerimaan](feature-acceptance-criteria.md) |
| Arsitektur fondasi BF | [Spesifikasi P0](bf-manager-p0-spec.md) |

## 4. Aturan kelanjutan

- Mulai dari status dan backlog ini; lanjutkan bukti yang dirujuk, jangan mengulang audit yang sudah selesai.
- Bukti baru masuk ke dokumen kanonis domainnya. Jangan membuat jurnal per sesi, file histori, atau backlog paralel.
- Setiap temuan memisahkan fakta, interpretasi, batasan, dan verifikasi yang masih diperlukan.
- Catat source path, class/method/signature, ABI/hash bila relevan, serta evidence level.
- JADX untuk navigasi/cross-check; Smali dan disassembly tervalidasi menjadi rujukan saat control-flow ambigu.
- Jangan menyalin source hasil dekompilasi MT, binary native, asset, signing material, credential, atau endpoint privat ke implementasi BF.
- Sinkronkan perubahan Feature ID/evidence/acceptance ke `feature-inventory.md` dan `feature-acceptance-criteria.md`.

## 5. Batas klaim

Audit selesai tidak berarti fitur BF sudah diimplementasikan. BF belum boleh disebut parity 1:1 sebelum seluruh fitur target memiliki implementasi independen dan lulus acceptance test, termasuk permission/provider dan runtime test sesuai kemampuan platform.
