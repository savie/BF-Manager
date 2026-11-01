package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۖۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E752 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2302 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public JSONObject f8213;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20212 f8214;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7845 f8215;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9308 f8216;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f8217;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_native_analyze_control_flow";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Build a bounded direct static control-flow graph within one ELF function. Use a symbol start from mt_apk_native_map_address or an instruction source from mt_apk_native_xref. An address inside a sized FUNC symbol resolves to that function; missing or unreliable symbols fall back to the requested executable address. Use outputMode=summary for triage, full for blocks and edges. Recommended budgets: maxAnalysisBytes=16384, maxBlocks=256, maxInstructions=2000. Calls are not followed or represented as CFG edges; indirect jumps and switch tables may remain unresolved. Shape hints describe only the analyzed subgraph, not the whole function. This tool does not paginate. When a budget stops analysis, nextActions may rerun with larger budgets; the new graph replaces the old one and must not be merged. Invalid instructions, indirect jumps, mode transitions, and non-executable targets cannot be resolved by increasing budgets. Use mt_apk_native_disassemble for exact bytes or patch context.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Analyze Native Control Flow";
    }

    public C2302(C7845 c7845) {
        C20212 c20212 = new C20212();
        C9308 c9308 = new C9308();
        this.f8215 = c7845;
        this.f8214 = c20212;
        this.f8216 = c9308;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f8217;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass an empty string for the base APK, or the id from mt_apk_session_create for the edited view.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for an ELF virtual address or file_offset for an ELF file offset inside the SO entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned function symbol address or address inside a function candidate. Accepts decimal or 0x/0X hex in 0..9223372036854775807.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode: auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from an odd virtual address; otherwise retry diagnostics offer explicit modes.\"\n  },\n  \"outputMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"full\", \"summary\"],\n    \"description\": \"Required output mode. Use full to populate blocks, edges, externalFlows, and unresolvedFlows. In summary mode, blocks, edges, externalFlows, and unresolvedFlows remain present as empty arrays while analysisSummary and observedGraphSummary retain observed counts.\"\n  },\n  \"maxAnalysisBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Unique successfully decoded instruction-byte budget. Recommended 16384; valid range 16..65536.\"\n  },\n  \"maxBlocks\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum basic-block candidates to examine. Recommended 256; valid range 1..4096. Rejected candidates count toward this limit.\"\n  },\n  \"maxInstructions\": {\n    \"type\": \"integer\",\n    \"description\": \"Unique successfully decoded instruction budget. Recommended 2000; valid range 1..10000.\"\n  }\n}\n");
        this.f8217 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f8213;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM16008 = C5831.m16008();
        this.f8213 = jSONObjectM16008;
        return jSONObjectM16008;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws Throwable {
        final C7896 c7896M38556;
        C7845 c7845 = this.f8215;
        try {
            c7896M38556 = C16363.m38556(jSONObject);
            try {
                String str = c7896M38556.f25956;
                InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
                try {
                    C17669 c17669 = new C17669((JSONObject) c7845.m20699(str, new InterfaceC14901() { // from class: l.ܰۙ۬
                        @Override // l.InterfaceC14901
                        /* JADX INFO: renamed from: ۙ */
                        public final JSONObject mo14279(C21956 c21956, C14952 c14952) {
                            return C2302.m7041(this.f44820, c7896M38556, c21956, c14952);
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
                if (c7896M38556 != null) {
                    c7845.m20720(c7896M38556.f25956);
                }
                int i2 = C23044.f74862;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c7896M38556 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m7041(final C2302 c2302, final C7896 c7896, C21956 c21956, C14952 c14952) {
        C9308 c9308 = c2302.f8216;
        String str = c7896.f25948;
        String str2 = c7896.f25951;
        InterfaceC1545 interfaceC1545 = new InterfaceC1545() { // from class: l.ۨۙ۬
            @Override // l.InterfaceC1545
            /* JADX INFO: renamed from: ۙ */
            public final Object mo5330(C2956 c2956) {
                return C4419.m12347(this.f38635.f8214, c2956, c7896);
            }
        };
        c9308.getClass();
        return (JSONObject) C9308.m23879(c21956, c14952, str, str2, interfaceC1545);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        JSONValue jSONValueM31950;
        if (C12887.m31962(c12731)) {
            jSONValueM31950 = C12887.m31950(c12731);
        } else {
            jSONValueM31950 = JSON.NULL;
        }
        return C0735.m3195(c12731, jSONValueM31950, c12731.f42471);
    }
}
