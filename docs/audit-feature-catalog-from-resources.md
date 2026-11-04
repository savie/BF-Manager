# Audit Katalog Fitur Lanjutan MT Manager dari Resource

Tanggal: 2026-11-04  
Referensi: `master/reference/apktool/res/values/strings.xml`  
Blob SHA: `0da8dbaeb6b451e6ce8fe10e7dad459df30cccff`  
Evidence level: E2 (resource/UI evidence), bukan bukti implementasi end-to-end.

## 1. Tujuan dan batas

Dokumen ini mencatat kelompok fitur yang teridentifikasi dari resource string MT Manager. Resource string berguna untuk menemukan fitur, opsi, dan alur error yang harus ditelusuri ke Smali. String tidak membuktikan bahwa semua opsi tersedia pada semua versi Android atau bahwa suatu operasi berhasil di runtime.

Semua fitur yang teridentifikasi tetap masuk scope BF Manager. Penanda VIP/premium pada referensi MT tidak menjadi gate di BF.

## 2. Katalog fitur baru yang teridentifikasi

### 2.1 APK / package engineering
- APK viewer dan APK functions.
- APK decompile, compile, optimize, sign, verify signature/version.
- APK workspace, retain/reopen workspace, temporary workspace.
- APK clone, quick rename, data multiplexing/embedded APK optimization.
- APK/APKS/XAPK installation and installer selection.
- Signing key generation, import/export, JKS/keystore, signature configuration.
- Manifest/resource/AXML editing, resource ID mapping and missing entry definitions.
- APK compare/AXML compare/ARSC compare.
- Batch XML replacement/search.
- Package-specific signing options and automatic signing.

### 2.2 DEX / Java bytecode / Smali
- DEX viewer, DEX editor, DEX functions.
- DEX to JAR and DEX to Smali conversion.
- DEX anti-obfuscation / symbol renaming with mapping and recovery mode.
- DEX string decryption, custom decryption methods, class scoping, enhanced algorithm.
- DEX comparator (added/changed/removed classes).
- Class/method/field browser and signature/code copy helpers.
- Register analysis and Smali syntax-aware editing.
- Secure sandbox option for decryption execution.
- Method-count / multidex constraints surfaced in compile errors.

### 2.3 ArsC / Android resources / XML
- ARSC editor and ARSC comparator.
- Resource entry ID/name/value editing and ID-to-name mapping.
- AXML editor and comparator.
- Decompiled Android XML viewer/editor.
- XML batch replacement and search.
- Nine-patch editor.
- Resource generation/repair workflow for missing entry definitions.

### 2.4 File manager and operations
- Batch rename, batch import/export/grant/remove.
- Copy/move conflict policies: replace, keep both, cover/overwrite.
- Delete, recycle-bin behavior, high-speed delete option, delete confirmation.
- Backup source before editing; .bak generation.
- Hidden files and hide selected files.
- File type/extension identification.
- File compare, directory compare, changed/added/moved/removed/unchanged result categories.
- File history and editor reload checks when external modifications/deletions occur.
- Search, advanced search, search result management, path/history navigation.
- Bookmarks, bookmark groups, ordering (top/bottom), swipe position-aware pane navigation.
- Local storage records/groups and network storage groups.
- Batch folder permission grant (Android 13+ resource text explicitly notes per-folder grants in a directory).

### 2.5 Editors and viewers
- Text/code editor: syntax, completion, indentation, soft wrap, large-file smooth mode, history, auto indent, auto sign integration.
- Hex editor and Hex comparator, typed numeric/string interpretation, address/length range, search, large-file read-only behavior.
- Image viewer, image details, EXIF metadata, location/camera metadata.
- Font viewer and custom font selection.
- Audio/music player and video player.
- Archive viewer and archive test/validation.
- SVG viewer/functions, web viewer/functions, XML functions.
- File metadata and checksum.
- Clipboard import and text/byte conversion utilities.

### 2.6 Archive and password workflows
- Archive test with duplicate-running guard and changed-during-test detection.
- Password manager for common archive passwords, ordered automatic retry, latest successful match record.
- Import/export password list format with password and remark records.
- Archive extraction conflict policy.
- Archive create/extract and supported-format matrix still need Smali call-site audit.

### 2.7 Network and cloud
- Network storages, FTP server, FTP active/passive transfer mode.
- FTP encryption mode (explicit/implicit).
- Upload modified remote files.
- Jump host and target server connection workflow.
- AWS S3 generic, Cloudflare R2-style account configuration, Huawei Cloud OBS, Alibaba Cloud OSS.
- Cloud backup and restore, merge restore preserving local bookmarks/network storage.
- Download workflow, save directory, temporary file retention after save/cleanup failure.
- WebView preview and website root directory selection.

### 2.8 Terminal, script, plugin and system integrations
- Terminal session as root option.
- Custom `su` command configuration.
- Script executor.
- MT plugin viewer, plugin protocol/developer workflow strings, publish/update/review/suspend/delete plugin actions.
- Shortcut creation and launcher permission messaging.
- Floating window/overlay setting.
- Battery optimization exemption messaging.
- Clipboard and keyboard shortcut helpers.
- Translation and automatic translation.
- Update check, activity record, preferences, theme/day mode and UI customization.

### 2.9 Bookmarks and persistence details newly visible
Resource strings specifically expose:
- Add new bookmarks to top/bottom of selected group.
- Bookmark swipe gesture can select left/right pane based on touch position.
- Delete group can move its bookmarks to default group rather than deleting them.
- Import modes: keep existing/create groups, merge same-name groups, or replace existing data.
- Cloud merge restore explicitly preserves current bookmarks and network storages.
- Local/network storage group deletion may move items into default group.
These are stronger UI semantics than the earlier basic add-bookmark strings, but persistence schema, serialization format, stable IDs, and crash consistency remain unknown.

## 3. Feature acceptance and architecture implications

| Domain | BF subsystem candidate | Key acceptance requirements |
|---|---|---|
| APK toolchain | ApkWorkspace, ApkDecode/Build, ApkSign, ApkInstall | Reopen workspace, deterministic build, signing verification, structured failure states |
| DEX/Smali | DexEngine, SmaliEditor, DexDiff, Deobfuscation | Multidex, 64K limits, mapping round-trip, malformed input handling |
| Android resources | ResourceTable, AxmlEngine, ArscEditor | ID consistency, unknown chunks preservation, compile/decompile round-trip |
| File operations | FileOperationEngine | Provider-aware copy/move/delete, conflict policies, cancellation, partial failures |
| Editors | EditorHost + format modules | Encoding, large-file bounds, atomic save/backup, external change detection |
| Archive | ArchiveEngine | Format matrix, encryption/password retry, path traversal defenses, archive integrity tests |
| Network | RemoteStorageProvider | FTP/SFTP/WebDAV/S3-compatible adapter coverage, reconnect, partial upload, credential storage |
| Cloud backup | BackupEngine + CloudAdapter | versioned schema, encryption, merge/replace semantics, interrupted transfer recovery |
| Terminal/scripts | TerminalSession + PrivilegeAdapter | explicit root/non-root profile, process lifecycle, cancellation, output streaming |
| Plugins | PluginRuntime | protocol compatibility, permission isolation, signature/trust policy, lifecycle |
| Viewers/media | ViewerRegistry | MIME routing, streaming, metadata handling, unsupported-format fallback |
| Bookmarks | BookmarkRepository | group semantics, ordering, pane-aware navigation, import/export/merge, stable URI grants |

Subsystem names are architectural proposals, not existing implementation.

## 4. Permission and capability mapping leads

Resource evidence suggests these feature-to-capability dependencies to verify in Smali:
- Batch folder grant: SAF tree URI, persisted URI permission; Android 13+ per-child folder selection constraints.
- Root terminal/custom su: Root adapter, shell process lifecycle; unavailable on non-root profile.
- FTP server/network storage/cloud: INTERNET, network state, foreground service where long-running transfer requires it; Wi-Fi multicast only if discovery implementation uses it.
- Overlay/floating window: SYSTEM_ALERT_WINDOW special access.
- Battery optimization exemption: REQUEST_IGNORE_BATTERY_OPTIMIZATIONS flow (only where justified by long-running work).
- Shortcut creation: launcher-specific pin shortcut API or legacy install shortcut permission, depending Android version.
- APK install: REQUEST_INSTALL_PACKAGES/system installer flow or Shizuku/Dhizuku/Root adapter; package visibility for preflight checks.
- Clipboard: platform clipboard APIs; no broad storage permission implied.
- EXIF GPS display: metadata read from file; location permission is not implied merely by reading embedded EXIF.
- Cloud backup: network access and secure local credential/key storage; remote provider account credentials are not BF account login.

Manifest declarations alone do not prove usage. Each dependency must be connected to call-site and API behavior before manifest decisions.

## 5. Audit status

| Evidence target | Status |
|---|---|
| Resource feature discovery | Expanded; E2 |
| Menu/resource ID to UI handler mapping | Incomplete |
| UI handler to domain operation | Incomplete |
| Permission declaration to runtime request/call-site | Incomplete |
| Network protocol semantics | Incomplete |
| Bookmark serialization and migration | Incomplete |
| APK/DEX/ARSC compiler pipeline | Incomplete |
| Runtime tests | Not performed |
| BF implementation | Not started |

## 6. Next audit sequence

1. Extract all string resources and cluster feature names systematically; map resource IDs to Smali references.
2. Trace the highest-impact workflows: file operations, archive, APK build/install, DEX/Smali editor.
3. Trace bookmark repository and import/export/backup serialization.
4. Trace network storage protocol implementations and credential handling.
5. Trace terminal/root/shell and plugin execution boundaries.
6. Build a feature-by-feature parity matrix with evidence file, method, expected behavior, test case, and status.
