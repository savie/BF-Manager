package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۖܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: J75M */
/* JADX INFO: loaded from: classes2.dex */
public final class C2571 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public JSONObject f10131;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20212 f10132;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7845 f10133;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9308 f10134;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f10135;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_native_patch_string";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Patch one UTF-8 string in an ELF shared object using a non-empty editSessionId. expectedText guards against stale content. Choose paddingMode for equal-length, NUL-terminated, or space-padded text; growth can only consume existing padding. The complete patch window is limited to 4096 UTF-8 bytes. This tool does not resize entries, update length fields, rewrite pointers, or relocate references. Use mt_apk_patch_bytes for raw bytes or embedded NUL. Success returns beforeHex/afterHex and an mt_apk_read_bytes action to inspect the patched window.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Patch Native UTF-8 String";
    }

    public C2571(C7845 c7845) {
        C20212 c20212 = new C20212();
        C9308 c9308 = new C9308();
        this.f10133 = c7845;
        this.f10132 = c20212;
        this.f10134 = c9308;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f10135;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: ELF entries are accepted.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. virtual maps an ELF virtual address to file-backed bytes. file_offset uses an ELF file offset within the SO zip_entry bytes; it is not an APK container offset and does not require a loaded mapping.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or SO file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  },\n  \"expectedText\": {\n    \"type\": \"string\",\n    \"description\": \"Current UTF-8 text at the target address. This is the stale-view guard; copy it from native_strings context or decoded bytes. Must be non-empty, valid for strict UTF-8 encoding, and contain no NUL. See paddingMode for the patch window and byte limit.\"\n  },\n  \"replacementText\": {\n    \"type\": \"string\",\n    \"description\": \"Replacement UTF-8 text. Empty string is allowed for null_pad or space_pad; none still requires equal UTF-8 byte length. Must be valid for strict UTF-8 encoding and contain no NUL. See paddingMode for the patch window and byte limit.\"\n  },\n  \"paddingMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"none\", \"null_pad\", \"space_pad\"],\n    \"description\": \"All lengths below are UTF-8 byte lengths. none requires equal lengths and patches exactly expectedText bytes. null_pad is for NUL-terminated C strings: the window is max(expectedText bytes, replacementText bytes)+1, and growth requires existing zero padding plus a final NUL. space_pad is for fixed-width visible strings: the window is max(expectedText bytes, replacementText bytes), and growth requires existing ASCII spaces. Both padded modes verify the padding they consume. The complete window limit is 4096 UTF-8 bytes; null_pad includes its final NUL, so its longest text is 4095 UTF-8 bytes.\"\n  }\n}\n");
        this.f10135 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f10131;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM16009 = C5831.m16009();
        this.f10131 = jSONObjectM16009;
        return jSONObjectM16009;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C5831.m16045(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        C7845 c7845 = this.f10133;
        final C20596 c20596M38558 = null;
        try {
            C11755.m29361();
            c20596M38558 = C16363.m38558(jSONObject);
            String str = c20596M38558.f67107;
            InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
            try {
                JSONObject jSONObject2 = (JSONObject) c7845.m20700(str, new InterfaceC21250() { // from class: l.ܰܰ۬
                    @Override // l.InterfaceC21250
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final JSONObject mo33699(C21956 c21956, C14952 c14952) {
                        return C2571.m8021(c14952, c20596M38558, this.f45701, c21956);
                    }
                });
                int i = C23044.f74862;
                C17669 c17669 = new C17669(jSONObject2);
                interfaceC7855M20724.close();
                c7845.m20720(str);
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
            if (c20596M38558 != null) {
                c7845.m20720(c20596M38558.f67107);
            }
            int i2 = C23044.f74862;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m8021(final C14952 c14952, final C20596 c20596, final C2571 c2571, final C21956 c21956) {
        C9308 c9308 = c2571.f10134;
        String str = c20596.f67098;
        String str2 = c20596.f67101;
        InterfaceC1545 interfaceC1545 = new InterfaceC1545() { // from class: l.ۨܰ۬
            @Override // l.InterfaceC1545
            /* JADX INFO: renamed from: ۙ */
            public final Object mo5330(C2956 c2956) {
                return C5831.m16019(C4688.m12994(c21956, c14952, c2571.f10132, c2956, c20596));
            }
        };
        c9308.getClass();
        return (JSONObject) C9308.m23879(c21956, c14952, str, str2, interfaceC1545);
    }
}
