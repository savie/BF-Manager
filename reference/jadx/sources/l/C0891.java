package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.am;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֨ۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A768 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0891 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public JSONObject f3593;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20212 f3594;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7845 f3595;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9308 f3596;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f3597;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_native_inspect";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Start here for an overview of a zip_entry ELF in the base APK or edited session view. Returns summary metadata and complete unfiltered item counts, not detail lists. Copy a nextActions call to mt_apk_native_list_items for details. Use mt_apk_native_map_address for address conversion, mt_apk_native_disassemble for instruction text, and mt_apk_read_bytes for raw entry bytes.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Inspect Native ELF";
    }

    public C0891(C7845 c7845) {
        C20212 c20212 = new C20212();
        C9308 c9308 = new C9308();
        this.f3595 = c7845;
        this.f3594 = c20212;
        this.f3596 = c9308;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f3597;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to inspect the edited session view; pass an empty string to inspect the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  }\n}\n");
        this.f3597 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f3593;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id, or empty string for base APK.")).add("locator", C4969.m13786("string", "zip_entry locator.")).add("type", C4969.m13786("string", "ELF binary type.")).add("arch", C4969.m13786("string", "ELF architecture.")).add(am.w, C4969.m13786("string", "ELF CPU name.")).add("machine", C4969.m13786("string", "ELF machine name.")).add("abi", C4969.m13786("string", "ELF ABI.")).add(am.x, C4969.m13786("string", "Target OS.")).add("subsystem", C4969.m13786("string", "Subsystem.")).add("interpreter", C4969.m13786("string", "ELF interpreter path from metadata, or empty string.")).add("archBits", C4969.m13786("integer", "ELF class/ABI bit width. ARM32 ELF reports 32 even when Thumb instructions use 16-bit mode.")).add("hasVirtualAddress", C4969.m13786(ClassTransform.BOOLEAN, "Whether virtual addresses are present.")).add("positionIndependent", C4969.m13786(ClassTransform.BOOLEAN, "Whether the ELF is position independent.")).add("nx", C4969.m13786(ClassTransform.BOOLEAN, "Whether NX is enabled.")).add("canary", C4969.m13786(ClassTransform.BOOLEAN, "Whether a stack canary was detected.")).add("baseAddress", C4969.m13789("string", "ELF base address, or null.")).add("entryVirtualAddress", C4969.m13789("string", "Entry virtual address, or null.")).add("entryFileOffset", C4969.m13789("string", "Entry ELF file offset within the zip_entry bytes, or null.")).add("initVirtualAddress", C4969.m13789("string", "Init virtual address, or null.")).add("finiVirtualAddress", C4969.m13789("string", "Fini virtual address, or null."));
        JSONObject jSONObjectObject = JSON.object();
        String[] strArr = {"neededLibraries", "sections", "segments", "imports", "symbols", "entries", "initArray", "finiArray", "relocations"};
        for (int i = 0; i < 9; i++) {
            String str = strArr[i];
            jSONObjectObject.add(str, C4969.m13786("integer", "Complete " + str + " count."));
        }
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_native_inspect. ELF summary metadata and unfiltered counts. Use nextActions for detail lists.", C4969.m13777(jSONObjectAdd.add("counts", C4969.m13777(jSONObjectObject, "Complete ELF detail counts. Use mt_apk_native_list_items to read exactly one itemKind list; entries counts all loader-recognized ELF entry point records, including program, init, fini, and preinit entries when present. initArray and finiArray separately count .init_array/.fini_array pointer slots and may describe the same lifecycle target with slot metadata.")), "ELF summary metadata for a ZIP entry. Detail lists are available only through mt_apk_native_list_items."), C4969.m13787(C4969.m13777(JSON.object(), "No tool-specific diagnostics.")), C4969.m13783("First-page native detail reads. Copy one action's arguments to mt_apk_native_list_items; each action already selects an itemKind with count > 0.", C4969.m13778(C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C4969.m13786("string", "ZIP entry locator for the native ELF.")).add("itemKind", C4969.m13784("ELF list to read; copy unchanged.", "neededLibraries", "sections", "segments", "imports", "symbols", "entries", "initArray", "finiArray", "relocations")).add("namePrefix", C4969.m13786("string", "Case-sensitive prefix of the raw item name; empty means no filter.")).add("demangle", C4969.m13786(ClassTransform.BOOLEAN, "Whether to include readable C++ names; filtering still uses raw names.")), "integer", "First page size; suggested value is 100 and maximum is 500.", "limit", "Arguments for mt_apk_native_list_items."), "mt_apk_native_list_items", "inspect")));
        this.f3593 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws Throwable {
        final C19185 c19185M38554;
        C7845 c7845 = this.f3595;
        try {
            c19185M38554 = C16363.m38554(jSONObject);
            try {
                String str = c19185M38554.f61956;
                InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
                try {
                    C17669 c17669 = new C17669((JSONObject) c7845.m20699(str, new InterfaceC14901() { // from class: l.ۚۙ۬
                        @Override // l.InterfaceC14901
                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final JSONObject mo14279(C21956 c21956, C14952 c14952) {
                            return C0891.m3565(this.f17835, c19185M38554, c21956, c14952);
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
                if (c19185M38554 != null) {
                    c7845.m20720(c19185M38554.f61956);
                }
                int i2 = C23044.f74862;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c19185M38554 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m3565(final C0891 c0891, final C19185 c19185, C21956 c21956, C14952 c14952) {
        C9308 c9308 = c0891.f3596;
        String str = c19185.f61957;
        String str2 = c19185.f61959;
        InterfaceC1545 interfaceC1545 = new InterfaceC1545() { // from class: l.᩹ۙ۬
            @Override // l.InterfaceC1545
            /* JADX INFO: renamed from: ۙ */
            public final Object mo5330(C2956 c2956) {
                return C0891.m3564(this.f71480, c19185, c2956);
            }
        };
        c9308.getClass();
        return (JSONObject) C9308.m23879(c21956, c14952, str, str2, interfaceC1545);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m3564(C0891 c0891, C19185 c19185, C2956 c2956) throws C12731 {
        String str = c2956.f11082;
        try {
            c0891.f3594.getClass();
            return C5831.m16025(c19185, C15308.m36659(str));
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
