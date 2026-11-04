# Matriks Kriteria Fitur BF Manager

Tanggal: 2026-11-04  
Status implementasi: `not_started`.

Dokumen ini mendefinisikan bukti yang diperlukan sebelum fitur disebut implemented atau validated. Keberadaan string/menu MT bukan bukti bahwa BF Manager telah memiliki fitur tersebut.

## Status baku
- `indicated`: ada indikasi resource/manifest.
- `tracing`: call-site sedang dipetakan.
- `specified`: kontrak dan acceptance criteria ditulis.
- `implemented`: kode BF Manager tersedia; test belum tentu lengkap.
- `validated`: test relevan lulus dan evidence dicatat.
- `blocked`: dependency, lisensi, atau batas platform menghalangi.

## Acceptance criteria

| Feature ID | Acceptance criteria BF Manager | Minimum test | Catatan |
|---|---|---|---|
| FM-01 | Browse tree, list/grid, breadcrumb, sort, empty/error/loading states | fake provider + instrumentation SAF | URI-based location |
| FM-02 | Multi-select; copy/move/delete/rename dengan report per item dan conflict policy | duplicate, read-only, cancel, partial failure | Tidak boleh silent overwrite |
| FM-03 | Buat file/folder dengan validasi nama provider-aware | Unicode, invalid name, collision | Batas nama provider-specific |
| FM-04 | Bookmark URI persistable, group/order, relink broken bookmark | restart, revoked grant, missing URI | Metadata lokal |
| FM-05 | Hidden entries dan recycle strategy tanpa klaim restore palsu | hidden toggle, restore/delete matrix | P1 |
| FM-06 | Search dengan scope, cancel, wildcard/regex opt-in, invalid pattern handling | empty query, large tree, cancel | Tidak block main thread |
| FM-07 | Sort stable, export list, metadata nullable | null size/time, locale, Unicode | Metadata provider bisa tidak lengkap |
| AR-01 | Inspect archive entries dan test integrity tanpa auto-extract | corrupt, encrypted, ZIP64 | Engine tunduk pada audit lisensi |
| AR-02 | Create archive, compression/password sesuai format | empty, large file, wrong password | Jangan log password |
| AR-03 | Extract dengan path traversal defense dan conflict policy | zip-slip, duplicate, disk full, cancel | Validasi tujuan |
| AR-04 | Password prompt/retry opsional | retry limit, cancellation | Tidak menyimpan password plaintext |
| AP-01 | Baca package/version/sdk/signature metadata APK | malformed APK, multi-signer | Parser/API terdokumentasi |
| AP-02 | Extract APK/icon dan optimasi dalam pipeline terdefinisi | malformed, large APK, output integrity | Jangan mengubah signing diam-diam |
| AP-03 | Sign dengan key pengguna dan tampilkan fingerprint | invalid key, wrong password, verify | Keystore sensitif; no upload |
| AP-04 | Install via system package installer; privilege opsional | user cancel, package conflict | Permission seperlunya |
| DX-01 | Inspect/edit DEX dengan validasi output dan backup | malformed DEX, multidex | P3 |
| DX-02 | Convert/deobfuscate berdasarkan input eksplisit | malformed DEX, resource exhaustion | P3; license review |
| RS-01 | Inspect/edit resource table tanpa merusak unknown chunks | round-trip fixture, unknown chunk | P3 |
| RS-02 | Parse/edit manifest XML dengan namespace preservation | malformed, round-trip, unknown attrs | P3 |
| RS-03 | Edit/render 9-patch tervalidasi | invalid chunk, density variants | P3 |
| ED-01 | Text editor encoding-aware, large-file mode, safe save | UTF-8/16, BOM, long line, crash recovery | Atomic save bila didukung |
| ED-02 | Hex view/edit dengan bounded memory dan explicit save | large file, offset boundary, cancel | VIP gate MT tidak diadopsi |
| VW-01 | Image/font preview dan unsupported fallback | corrupt/huge image, malformed font | Decode sampling |
| VW-02 | Audio/video playback lifecycle | rotate, background, codec unsupported | Media3 candidate |
| UT-01 | Checksum streaming dan diff dengan batas ukuran jelas | known digest, large files | Jangan load file penuh ke RAM |
| NW-01 | FTP server/client dengan auth dan lifecycle aman | reconnect, wrong auth, stop | Opt-in |
| NW-02 | HTTP/LAN transfer dengan explicit sharing/expiry | interrupted, unauthorized | Token/TLS policy |
| NW-03 | Remote storage adapter per protokol | protocol conformance | Jangan klaim semua provider |
| SY-01 | SAF flow, persisted grant, recovery saat revoked | revoke, provider unavailable | P0 |
| SY-02 | Root/Shizuku/Dhizuku adapter opsional dengan fallback | absent/denied/disconnected | P3 |
| SY-03 | Terminal/script process lifecycle dan sandbox | timeout, cancel, permission | P3; disabled by default |
| SY-04 | Activity record hanya setelah platform/use-case review | service lifecycle, permission denial | Bukan P0 |
| PL-01 | Plugin manifest, capability permissions, compatibility/versioning | invalid plugin fixture | P3 |
| BK-01 | Local backup/export; cloud adapters fase terpisah | restore, corrupt backup, migration | P0 hanya prefs/bookmark |

## Quality gates lintas fitur

1. Tidak ada data loss: failure/cancel tidak menghapus sumber sebelum tujuan tervalidasi.
2. Streaming: file besar tidak dibaca seluruhnya ke heap tanpa batas.
3. Unicode: nama, path, dan konten diuji dengan karakter non-ASCII.
4. Permissions: denial/revocation/provider unavailable mempunyai recovery UI.
5. Cancellation: operasi panjang menutup resource dan melaporkan status.
6. Security: path traversal, archive traversal, credential redaction, input malformed diuji.
7. Accessibility: kontrol mempunyai label dan target interaksi yang memadai.
8. Compatibility: Android version, device/emulator, provider, dan ABI dicatat.
9. Licensing: dependency/assets mempunyai provenance dan keputusan lisensi sebelum distribusi.
10. Evidence: perubahan status merujuk commit/test/log/fixture konkret.

## Traceability
Setiap implementasi dan issue wajib mencantumkan Feature ID. Jangan menandai `validated` hanya karena compile berhasil.


## Product-wide mandatory acceptance: complete parity, no VIP, no BF login

Seluruh fitur yang teridentifikasi pada referensi MT Manager adalah scope wajib. Prioritas P0/P1/P2/P3 hanya urutan pengerjaan; bukan fitur yang boleh dihilangkan atau ditunda permanen. Tidak boleh mengganti fitur dengan placeholder.

Semua fitur gratis: tanpa VIP, premium gate, paywall, subscription, IAP, payment, atau entitlement/license check. BF Manager tidak membutuhkan login akun. Credential protokol remote tetap boleh diminta sesuai autentikasi layanan remote.

### Permission/capability matrix wajib

Untuk setiap Feature ID dokumentasikan:
1. Android permission/API dan protection level.
2. Runtime permission flow atau Settings special access.
3. Privilege adapter yang diperlukan (root, Shizuku, Dhizuku, shell) dan fallback non-privileged.
4. Perilaku berdasarkan Android version/target SDK.
5. Penanganan denial, revocation, provider unavailable, dan perangkat unsupported.
6. Automated/instrumentation/manual test evidence.

Jangan menghilangkan fitur karena membutuhkan permission. Minta izin just-in-time. Jangan meminta izin yang tidak relevan saat onboarding. Manifest BF harus mencakup seluruh permission yang diperlukan implementasi BF.

Release tidak boleh disebut parity 1:1 sebelum seluruh Feature ID diimplementasikan dan diuji, termasuk archive, APK/signing/install, DEX, resources, editor, viewer, network, system integration, plugin, dan backup. Batasan platform harus spesifik pada perangkat/API dan disetujui; bukan alasan diam-diam menghapus fitur.


## Acceptance criteria tambahan MT Manager v2.26.11

| Feature ID | Acceptance criteria BF Manager | Minimum test | Catatan |
|---|---|---|---|
| AR-05 | Baca multi-part TAR secara streaming, urutkan part secara deterministik, dan laporkan part hilang/duplikat | complete set, missing part, duplicate part, wrong order, truncated last part, cancel | Tidak boleh menghasilkan ekstraksi sukses dari payload terpotong |
| ED-03 | HTML/Markdown preview mendukung search, file selection, root selection, dan konfigurasi ask/edit/preview per tipe file | malicious HTML, local file boundary, search, missing asset, mode persistence, rotate | Isolasi WebView dan file access wajib diuji |
| ED-04 | HEX comparator menampilkan dua file, diff offset/byte, synchronized navigation, edit, dan explicit save | identical, insertion/deletion, large files, overlapping edits, cancel, save failure | Hex editor tunggal tidak memenuhi comparator |
| SY-05 | Activity recorder dan layout inspector merekam event/hierarchy sesuai capability yang diberikan dan dapat berhenti/ekspor | permission denied/revoked, app switch, sensitive-window handling, lifecycle, export | Matriks Accessibility/Usage/Root/Shizuku harus ditentukan sebelum implementasi |
| AP-05 | User dapat memilih jalur instalasi sistem atau adapter Root/Shizuku yang tersedia; hasil install diverifikasi | no adapter, denied, user cancel, signature conflict, split APK, install failure | Jangan bypass konfirmasi sistem atau menyamarkan kegagalan |
| MCP-01 | MCP server memiliki start/stop eksplisit, tool schemas tervalidasi, scope capability, bounded file transfer, real-time logs dan redaction | malformed tool args, unauthorized call, large transfer, disconnect, concurrent request, log secret scan | Bind address dan authentication policy harus disetujui sebelum exposure jaringan |