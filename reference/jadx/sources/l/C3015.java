package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۖ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T761 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3015 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5033 f9787;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25391 f9788;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1897 f9789;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f9790;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public JSONObject f9791;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Map Native Address";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Map an ELF virtual address to a file offset, or the reverse, inside a zip_entry shared object. file_offset refers to SO bytes, not APK container offsets. Check data.found and data.mapping.isLoaded before treating an address as loaded; only disassemble when data.mapping.isExecutable=true. data.mapping.enclosingSymbol provides best-effort symbol context and follow-up hints for mt_apk_native_analyze_control_flow. A miss returns data.found=false rather than an error. See mapping fields for symbol and instruction-mode limitations.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_native_map_address";
    }

    public C3015(C1897 c1897) {
        C5033 c5033 = new C5033();
        C25391 c25391 = new C25391();
        this.f9789 = c1897;
        this.f9787 = c5033;
        this.f9788 = c25391;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f9790;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to map the edited session view; pass an empty string to map the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  }\n}\n");
        this.f9790 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f9791;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM36997 = C15451.m36997();
        this.f9791 = jSONObjectM36997;
        return jSONObjectM36997;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws Throwable {
        final C9331 c9331M28279;
        C1897 c1897 = this.f9789;
        try {
            c9331M28279 = C11218.m28279(jSONObject);
            try {
                String str = c9331M28279.f30337;
                InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
                try {
                    C1238 c1238 = new C1238((JSONObject) c1897.m6534(str, new InterfaceC19796() { // from class: l.֨᩻ۚ
                        @Override // l.InterfaceC19796
                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final JSONObject mo5413(C14069 c14069, C18282 c18282) {
                            return C3015.m9824(this.f5305, c9331M28279, c14069, c18282);
                        }
                    }));
                    interfaceC18854M6559.close();
                    c1897.m6556(str);
                    int i = C24294.f78630;
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
                th = th3;
                if (c9331M28279 != null) {
                    c1897.m6556(c9331M28279.f30337);
                }
                int i2 = C24294.f78630;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c9331M28279 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m9824(final C3015 c3015, final C9331 c9331, C14069 c14069, C18282 c18282) {
        C25391 c25391 = c3015.f9788;
        String str = c9331.f30341;
        String str2 = c9331.f30339;
        InterfaceC11964 interfaceC11964 = new InterfaceC11964() { // from class: l.ۡ᩻ۚ
            @Override // l.InterfaceC11964
            /* JADX INFO: renamed from: ۙ */
            public final Object mo7002(C17185 c17185) {
                return C3015.m9825(this.f31377, c9331, c17185);
            }
        };
        c25391.getClass();
        return (JSONObject) C25391.m56749(c14069, c18282, str, str2, interfaceC11964);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9825(C3015 c3015, C9331 c9331, C17185 c17185) throws C10186 {
        String str = c17185.f56010;
        try {
            C5033 c5033 = c3015.f9787;
            long j = c9331.f30335;
            boolean zEquals = "virtual".equals(c9331.f30336);
            c5033.getClass();
            return C15451.m36974(c9331, C9752.m25418(str, j, zEquals, true));
        } catch (RuntimeException unused) {
            throw C10186.m26305("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36730(c10186, JSON.NULL, JSON.array());
    }
}
