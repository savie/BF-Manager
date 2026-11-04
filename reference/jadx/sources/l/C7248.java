package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.ۜܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M75X */
/* JADX INFO: loaded from: classes4.dex */
public final class C7248 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5033 f23900;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25391 f23901;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1897 f23902;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f23903;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public JSONObject f23904;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Find Native Xrefs";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Find best-effort direct static references to an ELF address; this is not a complete caller graph or data-flow proof. file_offset is inside the SO entry, not the APK. For functions start with scanKind=both and referenceKinds=[\"call\",\"jump\",\"data\"]; for strings, vtables, JNI tables, or function pointers use scanKind=data, referenceKinds=[\"data\"], instructionMode=auto. Recommended maxScanBytes=1048576 and limit=50. ARM32 code/both scans require an explicit arm or thumb source mode; follow retry actions if needed. Executable ARM32 targets also match Thumb function pointers. Read scanSummary.meaning, completionReason, and warning before interpreting refs, especially empty results. targetMapped=false means no usable loaded file-backed target mapping; loaded data targets can still have references. Continue with mt_apk_continue when pagination.hasMore=true, including empty pages; totalAvailableCount=null means unknown. To change the target or scan settings, start a new call. For instruction refs, inspect sourceSymbol.startVirtualAddress with mt_apk_native_analyze_control_flow when available, otherwise sourceVirtualAddress, and copy resolvedInstructionMode; choose outputMode=summary for triage or full for details. For data refs, sourceSymbol identifies the slot owner, not a caller. Use mt_apk_native_disassemble for exact instruction bytes.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_native_xref";
    }

    public C7248(C1897 c1897) {
        C5033 c5033 = new C5033();
        C25391 c25391 = new C25391();
        this.f23902 = c1897;
        this.f23900 = c5033;
        this.f23901 = c25391;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f23903;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to scan the edited session view; pass an empty string to scan the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the SO zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned target address string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807. ARM32 odd virtual targets are mapped exactly first; bit0 is cleared only for an executable mapping, while loaded non-executable odd targets stay exact.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. scanKind=data requires auto and ignores instruction decoding; non-ARM code/both requires auto; ARM32 code/both requires explicit thumb or arm. Odd ARM32 target virtual addresses do not choose the source scan mode.\"\n  },\n  \"scanKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"code\", \"data\", \"both\"],\n    \"description\": \"Scan domain. Use code for instruction references, data for relocation slots and aligned data pointers, or both for code first then data. For data use referenceKinds=[\\\"data\\\"]; for both include data in referenceKinds.\"\n  },\n  \"referenceKinds\": {\n    \"type\": \"array\",\n    \"description\": \"Reference kinds to return. Use [\\\"call\\\",\\\"jump\\\",\\\"data\\\"] with scanKind=both for symbol/function targets, [\\\"call\\\",\\\"jump\\\"] with scanKind=code for only call and branch/jump references, and [\\\"data\\\"] with scanKind=data for native strings, vtables, JNI tables, or function pointer arrays. Valid strings are call, jump, data, and unknown; jump covers branch/jump instructions.\",\n    \"items\": {\n      \"type\": \"string\",\n      \"enum\": [\"call\", \"jump\", \"data\", \"unknown\"]\n    }\n  },\n  \"maxScanBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum code/data-pointer bytes to consume on this xref page. Recommended first call: 1048576. This field is required; valid range is 16..4194304. Relocation scanning uses a separate fixed per-page item budget. Continue keeps the original scan budget.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum refs to return on this page. Recommended first call: 50. This field is required; valid range is 1..200. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f23903 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f23904;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM36995 = C15451.m36995();
        this.f23904 = jSONObjectM36995;
        return jSONObjectM36995;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws Throwable {
        C5253 c5253M28271;
        C1897 c1897 = this.f23902;
        try {
            c5253M28271 = C11218.m28271(jSONObject);
            try {
                C1238 c1238M19887 = m19887(c5253M28271, false, jSONObject.get("nextCursor"));
                c1897.m6556(c5253M28271.f18518);
                int i = C24294.f78630;
                return c1238M19887;
            } catch (Throwable th) {
                th = th;
                if (c5253M28271 != null) {
                    c1897.m6556(c5253M28271.f18518);
                }
                int i2 = C24294.f78630;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c5253M28271 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m19892(C14596 c14596, JSONObject jSONObject) throws Throwable {
        C1897 c1897 = this.f23902;
        C1897 c1898 = "address";
        String string = jSONObject.getString("workspaceId", "");
        String string2 = jSONObject.getString("editSessionId", "");
        try {
            int iM19890 = m19890(c14596, jSONObject);
            JSONObject jSONObject2 = c14596.f45980;
            JSONObject jSONObject3 = c14596.f45982;
            String strM19891 = m19891(c14596, "locator", jSONObject.get("nextCursor"));
            try {
                if (!strM19891.startsWith("zip_entry:") || strM19891.length() == 10) {
                    throw m19888(jSONObject.get("nextCursor"));
                }
                try {
                    String strSubstring = strM19891.substring(10);
                    String strM19892 = m19891(c14596, "addressKind", jSONObject.get("nextCursor"));
                    long jM19884 = m19884(jSONObject3, jSONObject.get("nextCursor"), "address");
                    String strM28261 = C11218.m28261(m19884(jSONObject3, jSONObject.get("nextCursor"), "address"));
                    try {
                        try {
                            String strM19893 = m19891(c14596, "instructionMode", jSONObject.get("nextCursor"));
                            String strM19894 = m19891(c14596, "scanKind", jSONObject.get("nextCursor"));
                            JSONValue jSONValue = jSONObject.get("nextCursor");
                            try {
                                C5253 c5253 = new C5253(string, string2, strM19891, strSubstring, strM19892, jM19884, strM28261, strM19893, strM19894, C9225.m24406(m19883(c14596, "referenceKindMask", jSONValue)), m19883(c14596, "maxScanBytes", jSONObject.get("nextCursor")), iM19890, jSONObject2.getInt("phaseIndex", -1), jSONObject2.getInt("rangeIndex", -1), m19884(jSONObject2, jSONObject.get("nextCursor"), "byteOffsetInRange"), jSONObject2.getInt("relocationIndex", -1), m19884(jSONObject3, jSONObject.get("nextCursor"), "entrySize"), m19884(jSONObject3, jSONObject.get("nextCursor"), "entryCrc"), m19884(jSONObject3, jSONObject.get("nextCursor"), "targetVirtualAddress"), m19891(c14596, "resolvedInstructionMode", jSONObject.get("nextCursor")), m19883(c14596, "bits", jSONObject.get("nextCursor")), m19891(c14596, "arch", jSONObject.get("nextCursor")));
                                m19889(c5253, jSONObject.get("nextCursor"));
                                C1238 c1238M19887 = m19887(c5253, true, jSONObject.get("nextCursor"));
                                if (!string.isEmpty()) {
                                    c1897.m6556(string);
                                }
                                int i = C24294.f78630;
                                return c1238M19887;
                            } catch (RuntimeException unused) {
                                try {
                                    throw m19888(jSONValue);
                                } catch (RuntimeException unused2) {
                                    throw m19888(jSONObject.get("nextCursor"));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            c1898 = c1897;
                        }
                    } catch (RuntimeException unused3) {
                    }
                } catch (RuntimeException unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            c1898 = c1897;
        }
        if (!string.isEmpty()) {
            c1898.m6556(string);
        }
        int i2 = C24294.f78630;
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1238 m19887(final C5253 c5253, final boolean z, final JSONValue jSONValue) throws Exception {
        if (c5253.f18521 < 0 || c5253.f18502 < 0 || c5253.f18512 < 0 || c5253.f18506 < 0) {
            if (z) {
                throw m19888(jSONValue);
            }
            throw m19888((JSONValue) null);
        }
        C1897 c1897 = this.f23902;
        InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
        try {
            C1238 c1238 = new C1238((JSONObject) c1897.m6534(c5253.f18518, new InterfaceC19796() { // from class: l.ۖܺۚ
                @Override // l.InterfaceC19796
                /* JADX INFO: renamed from: ۙ */
                public final JSONObject mo5413(C14069 c14069, C18282 c18282) {
                    return C7248.m19885(this.f9148, c5253, z, jSONValue, c14069, c18282);
                }
            }));
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
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m19885(final C7248 c7248, final C5253 c5253, final boolean z, final JSONValue jSONValue, C14069 c14069, C18282 c18282) throws C10186 {
        String str = c5253.f18501;
        final int iM42610 = c18282.m42610(c14069, str);
        if (z) {
            C18326.m42760(jSONValue.asString(), iM42610, c5253.f18518, str);
        }
        C25391 c25391 = c7248.f23901;
        String str2 = c5253.f18508;
        InterfaceC11964 interfaceC11964 = new InterfaceC11964() { // from class: l.۠ܺۚ
            @Override // l.InterfaceC11964
            /* JADX INFO: renamed from: ۙ */
            public final Object mo7002(C17185 c17185) {
                return C7248.m19886(this.f28420, z, c5253, jSONValue, iM42610, c17185);
            }
        };
        c25391.getClass();
        return (JSONObject) C25391.m56749(c14069, c18282, str, str2, interfaceC11964);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m19886(C7248 c7248, boolean z, C5253 c5253, JSONValue jSONValue, int i, C17185 c17185) throws C10186 {
        String strM42757;
        String str = c5253.f18501;
        long j = c17185.f56012;
        long j2 = c17185.f56015;
        if (!z || !str.isEmpty() || (c5253.f18505 == j2 && c5253.f18510 == j)) {
            C10230 c10230M24866 = C9484.m24866(c7248.f23900, c17185, c5253, z, jSONValue);
            C9007 c9007 = c10230M24866.f32688;
            C1023 c1023 = c10230M24866.f32687;
            if (c1023.f3698) {
                strM42757 = null;
            } else {
                String str2 = c5253.f18518;
                JSONObject jSONObjectAdd = JSON.object().add("locator", c5253.f18515).add("addressKind", c5253.f18507).add("address", c5253.f18504).add("instructionMode", c5253.f18523).add("scanKind", c5253.f18503).add("referenceKindMask", c5253.f18517).add("resolvedInstructionMode", c10230M24866.f32685).add("targetVirtualAddress", c9007.f29349).add("arch", c10230M24866.f32684).add("bits", c10230M24866.f32686).add("maxScanBytes", c5253.f18513);
                if (!str.isEmpty()) {
                    j2 = 0;
                }
                JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entrySize", j2);
                if (!str.isEmpty()) {
                    j = 0;
                }
                strM42757 = C18326.m42757("native_xref", str2, str, i, jSONObjectAdd2.add("entryCrc", j).add("recommendedLimit", c5253.f18514).add("limitMax", 200), JSON.object().add("phaseIndex", c1023.f3704).add("rangeIndex", c1023.f3702).add("byteOffsetInRange", c1023.f3699).add("relocationIndex", c1023.f3701));
            }
            return C15451.m36972(c5253, c10230M24866.f32685, c10230M24866.f32683, c9007, c10230M24866.f32684, c10230M24866.f32690, c10230M24866.f32691, c10230M24866.f32689, c1023, strM42757);
        }
        throw m19888(jSONValue);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19889(C5253 c5253, JSONValue jSONValue) throws C10186 {
        int i;
        int i2;
        String str = c5253.f18507;
        String str2 = c5253.f18503;
        if (!"virtual".equals(str) && !"file_offset".equals(str)) {
            throw m19888(jSONValue);
        }
        String str3 = c5253.f18523;
        if ("auto".equals(str3) || "arm".equals(str3) || "thumb".equals(str3)) {
            String str4 = c5253.f18522;
            if (("auto".equals(str4) || "arm".equals(str4) || "thumb".equals(str4)) && c5253.f18511 >= 0 && c5253.f18516 > 0 && !c5253.f18520.isEmpty() && (("code".equals(str2) || e.m.equals(str2) || "both".equals(str2)) && (i = c5253.f18517) != 0 && (i2 = c5253.f18513) >= 16 && i2 <= 4194304 && c5253.f18521 >= 0 && c5253.f18502 >= 0 && c5253.f18512 >= 0 && c5253.f18506 >= 0)) {
                try {
                    C11972.m30020(i, str2);
                    return;
                } catch (IllegalArgumentException unused) {
                    throw m19888(jSONValue);
                }
            }
        }
        throw m19888(jSONValue);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m19891(C14596 c14596, String str, JSONValue jSONValue) throws C10186 {
        JSONValue jSONValue2 = c14596.f45982.get(str);
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m19888(jSONValue);
        }
        return jSONValue2.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m19884(JSONObject jSONObject, JSONValue jSONValue, String str) throws C10186 {
        try {
            long j = jSONObject.getLong(str, -1L);
            if (j >= 0) {
                return j;
            }
            throw m19888(jSONValue);
        } catch (RuntimeException unused) {
            throw m19888(jSONValue);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19883(C14596 c14596, String str, JSONValue jSONValue) throws C10186 {
        try {
            int i = c14596.f45982.getInt(str, -1);
            if (i >= 0) {
                return i;
            }
            throw m19888(jSONValue);
        } catch (RuntimeException unused) {
            throw m19888(jSONValue);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m19890(C14596 c14596, JSONObject jSONObject) throws C10186 {
        int i = c14596.f45979;
        JSONValue jSONValue = jSONObject.get("limit");
        if (jSONValue == null || !jSONValue.isNumber()) {
            throw C10186.m26301("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
        try {
            int iM31240 = C12556.m31240(jSONValue);
            if (iM31240 >= 1 && iM31240 <= i) {
                return iM31240;
            }
            throw C10186.m26301("Invalid limit", "limit", JSON.value(iM31240), JSON.array("1.." + i), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw C10186.m26301("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m19888(JSONValue jSONValue) {
        return C10186.m26301("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        JSONValue jSONValueM54995;
        if (C24645.m55000(c10186)) {
            jSONValueM54995 = C24645.m54995(c10186);
        } else {
            jSONValueM54995 = JSON.NULL;
        }
        return C15300.m36730(c10186, jSONValueM54995, c10186.f32599);
    }
}
