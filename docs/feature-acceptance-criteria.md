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
