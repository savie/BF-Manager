package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩹᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Z76Q */
/* JADX INFO: loaded from: classes.dex */
public final class C22578 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f73589;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f73590;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f73591;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_patch_bytes";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Patch raw bytes in one zip_entry inside an APK edit session identified by a non-empty editSessionId; the base workspace cannot be modified. Use it as the deliberate raw-byte fallback for equal-length in-place replacement only. For executable ELF instructions, prefer mt_apk_native_patch_instructions so ELF mapping, instruction mode, alignment, assembly, and replacement length are validated; do not hand-encode machine instructions for this tool when the change can be expressed through mt_apk_native_patch_instructions.replacementAssembly. Use this tool for ELF code only when exact raw machine bytes are intentionally required or the semantic instruction tool does not apply. Each patches[] item provides byteOffset, expectedHex, and replacementHex; expectedHex is checked against the entry view at the start of the call before any bytes are written. Runtime accepts 1..200 items, each 1..4096 bytes, total 1..65536 bytes; ranges must not overlap, adjacent ranges are valid, and replacementHex equal to expectedHex is a valid no-op counted in bytesPatched. expectedHex/replacementHex are case-insensitive hex without separators and must have the same byte count. This tool accepts only zip_entry: locators and rejects dex, resources.arsc, AXML, directories, missing, or deleted entries. Text entries may be patched as raw bytes; afterward read_text/edit_text works only if the bytes still decode, and old read_text targetVersion values are stale. For SO/ELF entries, no ELF semantics are checked; verify with mt_apk_read_bytes or native read/disassemble/xref tools after patching.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Patch APK Bytes";
    }

    public C22578(C7845 c7845) {
        this.f73590 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f73589;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: is accepted.\"\n  },\n  \"patches\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic byte replacements for this one locator. Runtime requires 1..200 items, no overlapping byte ranges, max 4096 bytes per item and 65536 total bytes.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"byteOffset\": {\n          \"type\": \"integer\",\n          \"description\": \"0-based byte offset inside the ZIP entry. Runtime accepts 0..2147483647.\"\n        },\n        \"expectedHex\": {\n          \"type\": \"string\",\n          \"description\": \"Current bytes expected at byteOffset, as non-empty even-length hex without spaces. Case-insensitive input.\"\n        },\n        \"replacementHex\": {\n          \"type\": \"string\",\n          \"description\": \"Replacement bytes, as non-empty even-length hex without spaces. It must have the same byte count as expectedHex. For executable ELF instructions, prefer mt_apk_native_patch_instructions instead of hand-encoding machine instructions here.\"\n        }\n      },\n      \"required\": [\n        \"byteOffset\",\n        \"expectedHex\",\n        \"replacementHex\"\n      ]\n    }\n  }\n}\n");
        this.f73589 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f73591;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM35088 = C14611.m35088();
        this.f73591 = jSONObjectM35088;
        return jSONObjectM35088;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C14611.m35081(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        C7845 c7845 = this.f73590;
        try {
            C11755.m29361();
            C2905 c2905M41101 = C17638.m41101(jSONObject);
            InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
            try {
                C6079 c6079M20704 = c7845.m20704(c2905M41101);
                int i = C23044.f74862;
                C17669 c17669 = new C17669(C14611.m35080(c6079M20704));
                interfaceC7855M20724.close();
                return c17669;
            } catch (Throwable th) {
                try {
                    interfaceC7855M20724.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            int i2 = C23044.f74862;
            throw th3;
        }
    }
}
