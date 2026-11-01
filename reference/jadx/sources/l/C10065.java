package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۤۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: T761 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10065 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public JSONObject f34389;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20212 f34390;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7845 f34391;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9308 f34392;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f34393;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_native_map_address";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Map an ELF virtual address to a file offset, or the reverse, inside a zip_entry shared object. file_offset refers to SO bytes, not APK container offsets. Check data.found and data.mapping.isLoaded before treating an address as loaded; only disassemble when data.mapping.isExecutable=true. data.mapping.enclosingSymbol provides best-effort symbol context and follow-up hints for mt_apk_native_analyze_control_flow. A miss returns data.found=false rather than an error. See mapping fields for symbol and instruction-mode limitations.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Map Native Address";
    }

    public C10065(C7845 c7845) {
        C20212 c20212 = new C20212();
        C9308 c9308 = new C9308();
        this.f34391 = c7845;
        this.f34390 = c20212;
        this.f34392 = c9308;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f34393;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to map the edited session view; pass an empty string to map the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  }\n}\n");
        this.f34393 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f34389;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM16048 = C5831.m16048();
        this.f34389 = jSONObjectM16048;
        return jSONObjectM16048;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws Throwable {
        final C8602 c8602M38538;
        C7845 c7845 = this.f34391;
        try {
            c8602M38538 = C16363.m38538(jSONObject);
            try {
                String str = c8602M38538.f29705;
                InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
                try {
                    C17669 c17669 = new C17669((JSONObject) c7845.m20699(str, new InterfaceC14901() { // from class: l.᩵ۙ۬
                        @Override // l.InterfaceC14901
                        /* JADX INFO: renamed from: ۙ */
                        public final JSONObject mo14279(C21956 c21956, C14952 c14952) {
                            return C10065.m25475(this.f62173, c8602M38538, c21956, c14952);
                        }
                    }));
                    interfaceC7855M20724.close();
                    c7845.m20720(str);
                    int i = C23044.f74862;
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
                th = th3;
                if (c8602M38538 != null) {
                    c7845.m20720(c8602M38538.f29705);
                }
                int i2 = C23044.f74862;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c8602M38538 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m25475(final C10065 c10065, final C8602 c8602, C21956 c21956, C14952 c14952) {
        C9308 c9308 = c10065.f34392;
        String str = c8602.f29706;
        String str2 = c8602.f29708;
        InterfaceC1545 interfaceC1545 = new InterfaceC1545() { // from class: l.ۡۙ۬
            @Override // l.InterfaceC1545
            /* JADX INFO: renamed from: ۙ */
            public final Object mo5330(C2956 c2956) {
                return C10065.m25474(this.f29833, c8602, c2956);
            }
        };
        c9308.getClass();
        return (JSONObject) C9308.m23879(c21956, c14952, str, str2, interfaceC1545);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m25474(C10065 c10065, C8602 c8602, C2956 c2956) throws C12731 {
        String str = c2956.f11082;
        try {
            C20212 c20212 = c10065.f34390;
            long j = c8602.f29707;
            boolean zEquals = "virtual".equals(c8602.f29709);
            c20212.getClass();
            return C5831.m16018(c8602, C15308.m36656(str, j, zEquals, true));
        } catch (RuntimeException unused) {
            throw C12731.m31630("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3195(c12731, JSON.NULL, JSON.array());
    }
}
