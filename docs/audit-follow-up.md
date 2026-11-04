# Audit Lanjutan dan Backlog Verifikasi

Tanggal: 2026-11-04  
Status: hasil pemeriksaan repository dan backlog audit berikutnya.

## 1. Temuan repository

- Branch kerja dokumentasi adalah `v1.0`; branch yang digunakan sesuai repository, tanpa membuat branch baru.
- Tree `v1.0` yang diperiksa memuat dokumen audit dan inventaris, belum memuat project Gradle/Kotlin.
- Tree `master` berisi artefak decode/reverse-engineering dan workflow rebuild APK.
- Pemeriksaan langsung `master/reference/apktool/apktool.yml` sekarang menunjukkan `apkFileName: MT2.26.11.apk`, versionName `2.26.11`, versionCode `26110365`, minSdk 21, targetSdk 30. Ini memperbarui klaim lama 2.26.10 pada audit. Kecocokan binary APK dan hasil decode tetap perlu dijaga dengan pencatatan SHA-256 artefak input.
- Workflow `.github/workflows/bf-manager-ci.yml` hanya menggunakan `workflow_dispatch`; trigger push dikomentari. Workflow memakai Java 21, Android platform/build-tools 35 dan Apktool 3.0.3, menjalankan `tools/repair_xml.py`, lalu rebuild folder decode `bf_manager/`, align, sign, dan upload artifact.
- Workflow menyatakan secara eksplisit bahwa `app/` belum memiliki Gradle project yang dikonfigurasi. Karena itu workflow tersebut bukan build pipeline Kotlin BF Manager.

## 2. Kualitas dekompilasi

Log JADX menunjukkan contoh:
- Type inference update limit exceeded.
- Exception pada ConstructorVisitor dan RegionMakerVisitor.
- Warning `Code restructure failed: missing block`.
- Beberapa method kehilangan control-flow block pada output hasil decompile.

Implikasi: JADX tidak boleh menjadi satu-satunya sumber kebenaran untuk alur file operation, privilege, archive, APK/DEX/resource editor, atau JNI. Cocokkan dengan Smali dan, bila perlu, runtime fixture.

Catatan metrik: angka 292 error dan 1.841 warning/581 nodes pada audit awal perlu dihitung ulang secara deterministik dari log lengkap sebelum dikutip sebagai metrik final. Sampel log yang diperiksa di sini membuktikan jenis error, bukan keseluruhan jumlah final.

## 3. Matriks investigasi lanjutan

| ID | Area | Yang ditelusuri | Evidence yang diperlukan | Prioritas |
|---|---|---|---|---|
| AUD-01 | File navigation | Menu/drawer/tab -> listener -> list provider | resource ID, Smali method, call graph | P0 |
| AUD-02 | Filesystem | copy/move/delete/rename, conflict, SAF, root path | Smali + JNI + runtime fixture | P0 |
| AUD-03 | Bookmark/recycle | persistence, group, restore/delete policy | schema, call-site, runtime | P0 |
| AUD-04 | Archive | format, ZIP64, password, error/cancel | dependency inventory + fixture | P1 |
| AUD-05 | Editor | encoding, large files, syntax engine, safe save | call-site + fixture | P1 |
| AUD-06 | APK | parser, signer, alignment, install route | library/license + runtime | P2 |
| AUD-07 | DEX/resources | editor pipeline, ARSC, binary XML | Smali + library/license + fixture | P3 |
| AUD-08 | Network | FTP/HTTP/SFTP/WebDAV/cloud | protocol implementation + conformance | P3 |
| AUD-09 | Native/JNI | exports per ABI, descriptors, callers | ELF symbols + JNI mapping + Smali | P0 |
| AUD-10 | Permission | permission -> feature -> rationale/fallback | manifest + call-site + Android matrix | P0 |
| AUD-11 | Third-party | SDK/native/assets and licenses | SBOM + license review | P0 |
| AUD-12 | VIP gates | UI gate vs entitlement enforcement | call-site + runtime | P1 |

## 4. Urutan kerja

1. Audit file operation dan provider path karena menentukan kontrak P0.
2. Petakan JNI/native bridge dan ABI; tentukan mana yang dapat diganti API Android/SAF.
3. Petakan menu/navigation ke Feature ID, mulai dari file manager dan bookmark.
4. Inventaris third-party library/assets dan lisensi sebelum dependency dipakai.
5. Verifikasi archive/editor dengan fixture.
6. Baru turunkan modul kompleks APK, DEX, resource editor, privilege bridge, plugin, dan network.

## 5. Status kesiapan

- Audit baseline: tersedia, tetapi call-site/runtime/license evidence belum lengkap.
- Feature inventory: seluruh fitur referensi masih berstatus indicated, bukan parity tervalidasi.
- P0 architecture: ditulis di `docs/bf-manager-p0-spec.md`.
- Source project Kotlin: belum dibuat.
- Modul kompleks: belum siap implementasi sampai call-site/runtime/license evidence tersedia.

Kesimpulan: desain P0 sudah cukup untuk memulai project native setelah keputusan identitas aplikasi dibuat. Audit referensi belum selesai dan tidak boleh disebut parity-complete.
