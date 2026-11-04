package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.am;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۛ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A768 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6745 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5033 f22467;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25391 f22468;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1897 f22469;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f22470;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public JSONObject f22471;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Inspect Native ELF";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Start here for an overview of a zip_entry ELF in the base APK or edited session view. Returns summary metadata and complete unfiltered item counts, not detail lists. Copy a nextActions call to mt_apk_native_list_items for details. Use mt_apk_native_map_address for address conversion, mt_apk_native_disassemble for instruction text, and mt_apk_read_bytes for raw entry bytes.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_native_inspect";
    }

    public C6745(C1897 c1897) {
        C5033 c5033 = new C5033();
        C25391 c25391 = new C25391();
        this.f22469 = c1897;
        this.f22467 = c5033;
        this.f22468 = c25391;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f22470;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to inspect the edited session view; pass an empty string to inspect the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  }\n}\n");
        this.f22470 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f22471;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id, or empty string for base APK.")).add("locator", C10932.m27740("string", "zip_entry locator.")).add("type", C10932.m27740("string", "ELF binary type.")).add("arch", C10932.m27740("string", "ELF architecture.")).add(am.w, C10932.m27740("string", "ELF CPU name.")).add("machine", C10932.m27740("string", "ELF machine name.")).add("abi", C10932.m27740("string", "ELF ABI.")).add(am.x, C10932.m27740("string", "Target OS.")).add("subsystem", C10932.m27740("string", "Subsystem.")).add("interpreter", C10932.m27740("string", "ELF interpreter path from metadata, or empty string.")).add("archBits", C10932.m27740("integer", "ELF class/ABI bit width. ARM32 ELF reports 32 even when Thumb instructions use 16-bit mode.")).add("hasVirtualAddress", C10932.m27740(ClassTransform.BOOLEAN, "Whether virtual addresses are present.")).add("positionIndependent", C10932.m27740(ClassTransform.BOOLEAN, "Whether the ELF is position independent.")).add("nx", C10932.m27740(ClassTransform.BOOLEAN, "Whether NX is enabled.")).add("canary", C10932.m27740(ClassTransform.BOOLEAN, "Whether a stack canary was detected.")).add("baseAddress", C10932.m27743("string", "ELF base address, or null.")).add("entryVirtualAddress", C10932.m27743("string", "Entry virtual address, or null.")).add("entryFileOffset", C10932.m27743("string", "Entry ELF file offset within the zip_entry bytes, or null.")).add("initVirtualAddress", C10932.m27743("string", "Init virtual address, or null.")).add("finiVirtualAddress", C10932.m27743("string", "Fini virtual address, or null."));
        JSONObject jSONObjectObject = JSON.object();
        String[] strArr = {"neededLibraries", "sections", "segments", "imports", "symbols", "entries", "initArray", "finiArray", "relocations"};
        for (int i = 0; i < 9; i++) {
            String str = strArr[i];
            jSONObjectObject.add(str, C10932.m27740("integer", "Complete " + str + " count."));
        }
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_native_inspect. ELF summary metadata and unfiltered counts. Use nextActions for detail lists.", C10932.m27731(jSONObjectAdd.add("counts", C10932.m27731(jSONObjectObject, "Complete ELF detail counts. Use mt_apk_native_list_items to read exactly one itemKind list; entries counts all loader-recognized ELF entry point records, including program, init, fini, and preinit entries when present. initArray and finiArray separately count .init_array/.fini_array pointer slots and may describe the same lifecycle target with slot metadata.")), "ELF summary metadata for a ZIP entry. Detail lists are available only through mt_apk_native_list_items."), C10932.m27741(C10932.m27731(JSON.object(), "No tool-specific diagnostics.")), C10932.m27737("First-page native detail reads. Copy one action's arguments to mt_apk_native_list_items; each action already selects an itemKind with count > 0.", C10932.m27732(C22783.m51386(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C10932.m27740("string", "ZIP entry locator for the native ELF.")).add("itemKind", C10932.m27738("ELF list to read; copy unchanged.", "neededLibraries", "sections", "segments", "imports", "symbols", "entries", "initArray", "finiArray", "relocations")).add("namePrefix", C10932.m27740("string", "Case-sensitive prefix of the raw item name; empty means no filter.")).add("demangle", C10932.m27740(ClassTransform.BOOLEAN, "Whether to include readable C++ names; filtering still uses raw names.")), "integer", "First page size; suggested value is 100 and maximum is 500.", "limit", "Arguments for mt_apk_native_list_items."), "mt_apk_native_list_items", "inspect")));
        this.f22471 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws Throwable {
        final C1129 c1129M28272;
        C1897 c1897 = this.f22469;
        try {
            c1129M28272 = C11218.m28272(jSONObject);
            try {
                String str = c1129M28272.f4206;
                InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
                try {
                    C1238 c1238 = new C1238((JSONObject) c1897.m6534(str, new InterfaceC19796() { // from class: l.᩵᩻ۚ
                        @Override // l.InterfaceC19796
                        /* JADX INFO: renamed from: ۙ */
                        public final JSONObject mo5413(C14069 c14069, C18282 c18282) {
                            return C6745.m18847(this.f66934, c1129M28272, c14069, c18282);
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
                if (c1129M28272 != null) {
                    c1897.m6556(c1129M28272.f4206);
                }
                int i2 = C24294.f78630;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c1129M28272 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m18847(final C6745 c6745, final C1129 c1129, C14069 c14069, C18282 c18282) {
        C25391 c25391 = c6745.f22468;
        String str = c1129.f4203;
        String str2 = c1129.f4205;
        InterfaceC11964 interfaceC11964 = new InterfaceC11964() { // from class: l.ۨ᩻ۚ
            @Override // l.InterfaceC11964
            /* JADX INFO: renamed from: ۙ */
            public final Object mo7002(C17185 c17185) {
                return C6745.m18848(this.f40700, c1129, c17185);
            }
        };
        c25391.getClass();
        return (JSONObject) C25391.m56749(c14069, c18282, str, str2, interfaceC11964);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m18848(C6745 c6745, C1129 c1129, C17185 c17185) throws C10186 {
        String str = c17185.f56010;
        try {
            c6745.f22467.getClass();
            return C15451.m36971(c1129, C9752.m25420(str));
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
