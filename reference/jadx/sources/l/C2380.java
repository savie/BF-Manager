package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۖۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z76Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C2380 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f7657;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f7658;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f7659;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Patch APK Bytes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Patch raw bytes in one zip_entry inside an APK edit session identified by a non-empty editSessionId; the base workspace cannot be modified. Use it as the deliberate raw-byte fallback for equal-length in-place replacement only. For executable ELF instructions, prefer mt_apk_native_patch_instructions so ELF mapping, instruction mode, alignment, assembly, and replacement length are validated; do not hand-encode machine instructions for this tool when the change can be expressed through mt_apk_native_patch_instructions.replacementAssembly. Use this tool for ELF code only when exact raw machine bytes are intentionally required or the semantic instruction tool does not apply. Each patches[] item provides byteOffset, expectedHex, and replacementHex; expectedHex is checked against the entry view at the start of the call before any bytes are written. Runtime accepts 1..200 items, each 1..4096 bytes, total 1..65536 bytes; ranges must not overlap, adjacent ranges are valid, and replacementHex equal to expectedHex is a valid no-op counted in bytesPatched. expectedHex/replacementHex are case-insensitive hex without separators and must have the same byte count. This tool accepts only zip_entry: locators and rejects dex, resources.arsc, AXML, directories, missing, or deleted entries. Text entries may be patched as raw bytes; afterward read_text/edit_text works only if the bytes still decode, and old read_text targetVersion values are stale. For SO/ELF entries, no ELF semantics are checked; verify with mt_apk_read_bytes or native read/disassemble/xref tools after patching.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_patch_bytes";
    }

    public C2380(C1897 c1897) {
        this.f7658 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f7657;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: is accepted.\"\n  },\n  \"patches\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic byte replacements for this one locator. Runtime requires 1..200 items, no overlapping byte ranges, max 4096 bytes per item and 65536 total bytes.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"byteOffset\": {\n          \"type\": \"integer\",\n          \"description\": \"0-based byte offset inside the ZIP entry. Runtime accepts 0..2147483647.\"\n        },\n        \"expectedHex\": {\n          \"type\": \"string\",\n          \"description\": \"Current bytes expected at byteOffset, as non-empty even-length hex without spaces. Case-insensitive input.\"\n        },\n        \"replacementHex\": {\n          \"type\": \"string\",\n          \"description\": \"Replacement bytes, as non-empty even-length hex without spaces. It must have the same byte count as expectedHex. For executable ELF instructions, prefer mt_apk_native_patch_instructions instead of hand-encoding machine instructions here.\"\n        }\n      },\n      \"required\": [\n        \"byteOffset\",\n        \"expectedHex\",\n        \"replacementHex\"\n      ]\n    }\n  }\n}\n");
        this.f7657 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f7659;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM14324 = C4560.m14324();
        this.f7659 = jSONObjectM14324;
        return jSONObjectM14324;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C4560.m14314(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        C1897 c1897 = this.f7658;
        try {
            C16834.m39750();
            C9353 c9353M13961 = C4375.m13961(jSONObject);
            InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
            try {
                C0231 c0231M6536 = c1897.m6536(c9353M13961);
                int i = C24294.f78630;
                C1238 c1238 = new C1238(C4560.m14313(c0231M6536));
                interfaceC18854M6559.close();
                return c1238;
            } catch (Throwable th) {
                try {
                    interfaceC18854M6559.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            int i2 = C24294.f78630;
            throw th3;
        }
    }
}
