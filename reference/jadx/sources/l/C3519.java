package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۗܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J75M */
/* JADX INFO: loaded from: classes3.dex */
public final class C3519 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5033 f12096;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25391 f12097;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1897 f12098;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f12099;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public JSONObject f12100;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Patch Native UTF-8 String";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Patch one UTF-8 string in an ELF shared object using a non-empty editSessionId. expectedText guards against stale content. Choose paddingMode for equal-length, NUL-terminated, or space-padded text; growth can only consume existing padding. The complete patch window is limited to 4096 UTF-8 bytes. This tool does not resize entries, update length fields, rewrite pointers, or relocate references. Use mt_apk_patch_bytes for raw bytes or embedded NUL. Success returns beforeHex/afterHex and an mt_apk_read_bytes action to inspect the patched window.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_native_patch_string";
    }

    public C3519(C1897 c1897) {
        C5033 c5033 = new C5033();
        C25391 c25391 = new C25391();
        this.f12098 = c1897;
        this.f12096 = c5033;
        this.f12097 = c25391;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f12099;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: ELF entries are accepted.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. virtual maps an ELF virtual address to file-backed bytes. file_offset uses an ELF file offset within the SO zip_entry bytes; it is not an APK container offset and does not require a loaded mapping.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or SO file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  },\n  \"expectedText\": {\n    \"type\": \"string\",\n    \"description\": \"Current UTF-8 text at the target address. This is the stale-view guard; copy it from native_strings context or decoded bytes. Must be non-empty, valid for strict UTF-8 encoding, and contain no NUL. See paddingMode for the patch window and byte limit.\"\n  },\n  \"replacementText\": {\n    \"type\": \"string\",\n    \"description\": \"Replacement UTF-8 text. Empty string is allowed for null_pad or space_pad; none still requires equal UTF-8 byte length. Must be valid for strict UTF-8 encoding and contain no NUL. See paddingMode for the patch window and byte limit.\"\n  },\n  \"paddingMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"none\", \"null_pad\", \"space_pad\"],\n    \"description\": \"All lengths below are UTF-8 byte lengths. none requires equal lengths and patches exactly expectedText bytes. null_pad is for NUL-terminated C strings: the window is max(expectedText bytes, replacementText bytes)+1, and growth requires existing zero padding plus a final NUL. space_pad is for fixed-width visible strings: the window is max(expectedText bytes, replacementText bytes), and growth requires existing ASCII spaces. Both padded modes verify the padding they consume. The complete window limit is 4096 UTF-8 bytes; null_pad includes its final NUL, so its longest text is 4095 UTF-8 bytes.\"\n  }\n}\n");
        this.f12099 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f12100;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM36963 = C15451.m36963();
        this.f12100 = jSONObjectM36963;
        return jSONObjectM36963;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15451.m37001(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        C1897 c1897 = this.f12098;
        final C7095 c7095M28275 = null;
        try {
            C16834.m39750();
            c7095M28275 = C11218.m28275(jSONObject);
            String str = c7095M28275.f23413;
            InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
            try {
                JSONObject jSONObject2 = (JSONObject) c1897.m6533(str, new InterfaceC15320() { // from class: l.ܶܺۚ
                    @Override // l.InterfaceC15320
                    /* JADX INFO: renamed from: ۙ */
                    public final JSONObject mo16829(C14069 c14069, C18282 c18282) {
                        return C3519.m11527(c18282, c7095M28275, this.f52578, c14069);
                    }
                });
                int i = C24294.f78630;
                C1238 c1238 = new C1238(jSONObject2);
                interfaceC18854M6559.close();
                c1897.m6556(str);
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
            if (c7095M28275 != null) {
                c1897.m6556(c7095M28275.f23413);
            }
            int i2 = C24294.f78630;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m11527(final C18282 c18282, final C7095 c7095, final C3519 c3519, final C14069 c14069) {
        C25391 c25391 = c3519.f12097;
        String str = c7095.f23412;
        String str2 = c7095.f23410;
        InterfaceC11964 interfaceC11964 = new InterfaceC11964() { // from class: l.᩹ܺۚ
            @Override // l.InterfaceC11964
            /* JADX INFO: renamed from: ۙ */
            public final Object mo7002(C17185 c17185) {
                return C15451.m36980(C17689.m41398(c14069, c18282, c3519.f12096, c17185, c7095));
            }
        };
        c25391.getClass();
        return (JSONObject) C25391.m56749(c14069, c18282, str, str2, interfaceC11964);
    }
}
