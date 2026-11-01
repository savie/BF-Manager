package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.᩷ܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M75X */
/* JADX INFO: loaded from: classes5.dex */
public final class C20917 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public JSONObject f67953;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20212 f67954;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7845 f67955;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9308 f67956;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f67957;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_native_xref";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Find best-effort direct static references to an ELF address; this is not a complete caller graph or data-flow proof. file_offset is inside the SO entry, not the APK. For functions start with scanKind=both and referenceKinds=[\"call\",\"jump\",\"data\"]; for strings, vtables, JNI tables, or function pointers use scanKind=data, referenceKinds=[\"data\"], instructionMode=auto. Recommended maxScanBytes=1048576 and limit=50. ARM32 code/both scans require an explicit arm or thumb source mode; follow retry actions if needed. Executable ARM32 targets also match Thumb function pointers. Read scanSummary.meaning, completionReason, and warning before interpreting refs, especially empty results. targetMapped=false means no usable loaded file-backed target mapping; loaded data targets can still have references. Continue with mt_apk_continue when pagination.hasMore=true, including empty pages; totalAvailableCount=null means unknown. To change the target or scan settings, start a new call. For instruction refs, inspect sourceSymbol.startVirtualAddress with mt_apk_native_analyze_control_flow when available, otherwise sourceVirtualAddress, and copy resolvedInstructionMode; choose outputMode=summary for triage or full for details. For data refs, sourceSymbol identifies the slot owner, not a caller. Use mt_apk_native_disassemble for exact instruction bytes.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Find Native Xrefs";
    }

    public C20917(C7845 c7845) {
        C20212 c20212 = new C20212();
        C9308 c9308 = new C9308();
        this.f67955 = c7845;
        this.f67954 = c20212;
        this.f67956 = c9308;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f67957;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to scan the edited session view; pass an empty string to scan the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the SO zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned target address string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807. ARM32 odd virtual targets are mapped exactly first; bit0 is cleared only for an executable mapping, while loaded non-executable odd targets stay exact.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. scanKind=data requires auto and ignores instruction decoding; non-ARM code/both requires auto; ARM32 code/both requires explicit thumb or arm. Odd ARM32 target virtual addresses do not choose the source scan mode.\"\n  },\n  \"scanKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"code\", \"data\", \"both\"],\n    \"description\": \"Scan domain. Use code for instruction references, data for relocation slots and aligned data pointers, or both for code first then data. For data use referenceKinds=[\\\"data\\\"]; for both include data in referenceKinds.\"\n  },\n  \"referenceKinds\": {\n    \"type\": \"array\",\n    \"description\": \"Reference kinds to return. Use [\\\"call\\\",\\\"jump\\\",\\\"data\\\"] with scanKind=both for symbol/function targets, [\\\"call\\\",\\\"jump\\\"] with scanKind=code for only call and branch/jump references, and [\\\"data\\\"] with scanKind=data for native strings, vtables, JNI tables, or function pointer arrays. Valid strings are call, jump, data, and unknown; jump covers branch/jump instructions.\",\n    \"items\": {\n      \"type\": \"string\",\n      \"enum\": [\"call\", \"jump\", \"data\", \"unknown\"]\n    }\n  },\n  \"maxScanBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum code/data-pointer bytes to consume on this xref page. Recommended first call: 1048576. This field is required; valid range is 16..4194304. Relocation scanning uses a separate fixed per-page item budget. Continue keeps the original scan budget.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum refs to return on this page. Recommended first call: 50. This field is required; valid range is 1..200. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f67957 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f67953;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM16038 = C5831.m16038();
        this.f67953 = jSONObjectM16038;
        return jSONObjectM16038;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws Throwable {
        C19891 c19891M38555;
        C7845 c7845 = this.f67955;
        try {
            c19891M38555 = C16363.m38555(jSONObject);
            try {
                C17669 c17669M47024 = m47024(c19891M38555, false, jSONObject.get("nextCursor"));
                c7845.m20720(c19891M38555.f63778);
                int i = C23044.f74862;
                return c17669M47024;
            } catch (Throwable th) {
                th = th;
                if (c19891M38555 != null) {
                    c7845.m20720(c19891M38555.f63778);
                }
                int i2 = C23044.f74862;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c19891M38555 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m47028(C21632 c21632, JSONObject jSONObject) throws Throwable {
        C7845 c7845 = this.f67955;
        C7845 c7846 = "address";
        String string = jSONObject.getString("workspaceId", "");
        String string2 = jSONObject.getString("editSessionId", "");
        try {
            int iM47026 = m47026(c21632, jSONObject);
            JSONObject jSONObject2 = c21632.f70155;
            JSONObject jSONObject3 = c21632.f70156;
            String strM47027 = m47027(c21632, "locator", jSONObject.get("nextCursor"));
            try {
                if (!strM47027.startsWith("zip_entry:") || strM47027.length() == 10) {
                    throw m47023(jSONObject.get("nextCursor"));
                }
                try {
                    String strSubstring = strM47027.substring(10);
                    String strM47028 = m47027(c21632, "addressKind", jSONObject.get("nextCursor"));
                    long jM47020 = m47020(jSONObject3, jSONObject.get("nextCursor"), "address");
                    String strM38542 = C16363.m38542(m47020(jSONObject3, jSONObject.get("nextCursor"), "address"));
                    try {
                        try {
                            String strM47029 = m47027(c21632, "instructionMode", jSONObject.get("nextCursor"));
                            String strM470210 = m47027(c21632, "scanKind", jSONObject.get("nextCursor"));
                            JSONValue jSONValue = jSONObject.get("nextCursor");
                            try {
                                C19891 c19891 = new C19891(string, string2, strM47027, strSubstring, strM47028, jM47020, strM38542, strM47029, strM470210, C21845.m48622(m47019(c21632, "referenceKindMask", jSONValue)), m47019(c21632, "maxScanBytes", jSONObject.get("nextCursor")), iM47026, jSONObject2.getInt("phaseIndex", -1), jSONObject2.getInt("rangeIndex", -1), m47020(jSONObject2, jSONObject.get("nextCursor"), "byteOffsetInRange"), jSONObject2.getInt("relocationIndex", -1), m47020(jSONObject3, jSONObject.get("nextCursor"), "entrySize"), m47020(jSONObject3, jSONObject.get("nextCursor"), "entryCrc"), m47020(jSONObject3, jSONObject.get("nextCursor"), "targetVirtualAddress"), m47027(c21632, "resolvedInstructionMode", jSONObject.get("nextCursor")), m47019(c21632, "bits", jSONObject.get("nextCursor")), m47027(c21632, "arch", jSONObject.get("nextCursor")));
                                m47025(c19891, jSONObject.get("nextCursor"));
                                C17669 c17669M47024 = m47024(c19891, true, jSONObject.get("nextCursor"));
                                if (!string.isEmpty()) {
                                    c7845.m20720(string);
                                }
                                int i = C23044.f74862;
                                return c17669M47024;
                            } catch (RuntimeException unused) {
                                try {
                                    throw m47023(jSONValue);
                                } catch (RuntimeException unused2) {
                                    throw m47023(jSONObject.get("nextCursor"));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            c7846 = c7845;
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
            c7846 = c7845;
        }
        if (!string.isEmpty()) {
            c7846.m20720(string);
        }
        int i2 = C23044.f74862;
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17669 m47024(final C19891 c19891, final boolean z, final JSONValue jSONValue) throws Exception {
        if (c19891.f63776 < 0 || c19891.f63767 < 0 || c19891.f63781 < 0 || c19891.f63769 < 0) {
            if (z) {
                throw m47023(jSONValue);
            }
            throw m47023((JSONValue) null);
        }
        C7845 c7845 = this.f67955;
        InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
        try {
            C17669 c17669 = new C17669((JSONObject) c7845.m20699(c19891.f63778, new InterfaceC14901() { // from class: l.ۤܰ۬
                @Override // l.InterfaceC14901
                /* JADX INFO: renamed from: ۙ */
                public final JSONObject mo14279(C21956 c21956, C14952 c14952) {
                    return C20917.m47021(this.f35437, c19891, z, jSONValue, c21956, c14952);
                }
            }));
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
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m47021(final C20917 c20917, final C19891 c19891, final boolean z, final JSONValue jSONValue, C21956 c21956, C14952 c14952) throws C12731 {
        String str = c19891.f63762;
        final int iM35888 = c14952.m35888(c21956, str);
        if (z) {
            C18810.m43393(jSONValue.asString(), iM35888, c19891.f63778, str);
        }
        C9308 c9308 = c20917.f67956;
        String str2 = c19891.f63765;
        InterfaceC1545 interfaceC1545 = new InterfaceC1545() { // from class: l.۟ܰ۬
            @Override // l.InterfaceC1545
            /* JADX INFO: renamed from: ۙ */
            public final Object mo5330(C2956 c2956) {
                return C20917.m47022(this.f24991, z, c19891, jSONValue, iM35888, c2956);
            }
        };
        c9308.getClass();
        return (JSONObject) C9308.m23879(c21956, c14952, str, str2, interfaceC1545);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m47022(C20917 c20917, boolean z, C19891 c19891, JSONValue jSONValue, int i, C2956 c2956) throws C12731 {
        String strM43390;
        String str = c19891.f63762;
        long j = c2956.f11081;
        long j2 = c2956.f11084;
        if (!z || !str.isEmpty() || (c19891.f63771 == j2 && c19891.f63760 == j)) {
            C8217 c8217M23213 = C8923.m23213(c20917.f67954, c2956, c19891, z, jSONValue);
            C18129 c18129 = c8217M23213.f28606;
            C15496 c15496 = c8217M23213.f28598;
            if (c15496.f50490) {
                strM43390 = null;
            } else {
                String str2 = c19891.f63778;
                JSONObject jSONObjectAdd = JSON.object().add("locator", c19891.f63780).add("addressKind", c19891.f63770).add("address", c19891.f63763).add("instructionMode", c19891.f63782).add("scanKind", c19891.f63779).add("referenceKindMask", c19891.f63777).add("resolvedInstructionMode", c8217M23213.f28604).add("targetVirtualAddress", c18129.f57970).add("arch", c8217M23213.f28601).add("bits", c8217M23213.f28603).add("maxScanBytes", c19891.f63775);
                if (!str.isEmpty()) {
                    j2 = 0;
                }
                JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entrySize", j2);
                if (!str.isEmpty()) {
                    j = 0;
                }
                strM43390 = C18810.m43390("native_xref", str2, str, i, jSONObjectAdd2.add("entryCrc", j).add("recommendedLimit", c19891.f63773).add("limitMax", 200), JSON.object().add("phaseIndex", c15496.f50485).add("rangeIndex", c15496.f50488).add("byteOffsetInRange", c15496.f50489).add("relocationIndex", c15496.f50492));
            }
            return C5831.m16026(c19891, c8217M23213.f28604, c8217M23213.f28600, c18129, c8217M23213.f28601, c8217M23213.f28605, c8217M23213.f28599, c8217M23213.f28602, c15496, strM43390);
        }
        throw m47023(jSONValue);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47025(C19891 c19891, JSONValue jSONValue) throws C12731 {
        int i;
        int i2;
        String str = c19891.f63770;
        String str2 = c19891.f63779;
        if (!"virtual".equals(str) && !"file_offset".equals(str)) {
            throw m47023(jSONValue);
        }
        String str3 = c19891.f63782;
        if ("auto".equals(str3) || "arm".equals(str3) || "thumb".equals(str3)) {
            String str4 = c19891.f63766;
            if (("auto".equals(str4) || "arm".equals(str4) || "thumb".equals(str4)) && c19891.f63774 >= 0 && c19891.f63764 > 0 && !c19891.f63761.isEmpty() && (("code".equals(str2) || e.m.equals(str2) || "both".equals(str2)) && (i = c19891.f63777) != 0 && (i2 = c19891.f63775) >= 16 && i2 <= 4194304 && c19891.f63776 >= 0 && c19891.f63767 >= 0 && c19891.f63781 >= 0 && c19891.f63769 >= 0)) {
                try {
                    C17886.m41514(i, str2);
                    return;
                } catch (IllegalArgumentException unused) {
                    throw m47023(jSONValue);
                }
            }
        }
        throw m47023(jSONValue);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m47027(C21632 c21632, String str, JSONValue jSONValue) throws C12731 {
        JSONValue jSONValue2 = c21632.f70156.get(str);
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m47023(jSONValue);
        }
        return jSONValue2.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m47020(JSONObject jSONObject, JSONValue jSONValue, String str) throws C12731 {
        try {
            long j = jSONObject.getLong(str, -1L);
            if (j >= 0) {
                return j;
            }
            throw m47023(jSONValue);
        } catch (RuntimeException unused) {
            throw m47023(jSONValue);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47019(C21632 c21632, String str, JSONValue jSONValue) throws C12731 {
        try {
            int i = c21632.f70156.getInt(str, -1);
            if (i >= 0) {
                return i;
            }
            throw m47023(jSONValue);
        } catch (RuntimeException unused) {
            throw m47023(jSONValue);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m47026(C21632 c21632, JSONObject jSONObject) throws C12731 {
        int i = c21632.f70153;
        JSONValue jSONValue = jSONObject.get("limit");
        if (jSONValue == null || !jSONValue.isNumber()) {
            throw C12731.m31626("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
        try {
            int iM26321 = C10413.m26321(jSONValue);
            if (iM26321 >= 1 && iM26321 <= i) {
                return iM26321;
            }
            throw C12731.m31626("Invalid limit", "limit", JSON.value(iM26321), JSON.array("1.." + i), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw C12731.m31626("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m47023(JSONValue jSONValue) {
        return C12731.m31626("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        JSONValue jSONValueM31957;
        if (C12887.m31962(c12731)) {
            jSONValueM31957 = C12887.m31957(c12731);
        } else {
            jSONValueM31957 = JSON.NULL;
        }
        return C0735.m3195(c12731, jSONValueM31957, c12731.f42471);
    }
}
