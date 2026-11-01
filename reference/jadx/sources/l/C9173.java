package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۡ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H7AC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9173 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f31215;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f31216;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f31217;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_search";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Search when the APK target is unknown. First call: target=overview, queryType=literal, caseSensitive=false, matchMode=contains, prefix=\"\", includeMatchOffsets=false, limit=50, snippetMaxChars=240; pass editSessionId=\"\" for the base APK. overview covers ZIP paths, decoded AXML, resource ids/names/values, dex names, and dex strings when available. Read notSearchedTargets and filterHint before treating zero hits as absence; select smali, native_symbols, native_strings, or resource_table_file_paths explicitly when needed. For native targets, prefix filters the SO entry path, not symbol names. Copy data.hits[i].locator for follow-up calls. Native parameters come from data.hits[i].hit.nativeLocation; follow its field descriptions to map values to tool arguments. Use mt_apk_native_list_items for symbol details, and mt_apk_read_bytes or mt_apk_native_xref for strings; snippet is context, not an address source. If xrefAddressKind and xrefAddress are present, use them for xref; strings use scanKind=data, referenceKinds=[\"data\"], instructionMode=auto, while functions use both and [\"call\",\"jump\",\"data\"]. ARM32 errors may provide thumb/arm retry actions. Imports may lack an xref address; inspect same-name relocations or non-imported symbols. Relocation references concern the slot, not a complete caller graph. Continue with mt_apk_continue when pagination.hasMore=true; totalAvailableCount=null means unknown. Narrow query or prefix to reduce scan work; limit only controls page size.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Search APK";
    }

    public C9173(C7845 c7845) {
        this.f31216 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f31215;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to search the edited session; pass an empty string to search the base workspace.\"\n  },\n  \"target\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"overview\",\n      \"files\",\n      \"resource_table_names\",\n      \"resource_table_values\",\n      \"resource_table_file_paths\",\n      \"dex_names\",\n      \"dex_strings\",\n      \"dex_string_members\",\n      \"smali\",\n      \"native_symbols\",\n      \"native_strings\"\n    ],\n    \"description\": \"Search target. Use overview when the target is unknown; it searches ZIP entry paths, decoded AXML, resource ids/names/decoded values, dex names, and dex strings when available, but not smali, native_symbols, native_strings, or the dedicated resource_table_file_paths target. Use files for ZIP entry paths and decoded AXML text, resource_table_names for resource ids/names, resource_table_values for decoded resource values, resource_table_file_paths only when specifically looking for resource values that point to APK ZIP entry paths, dex_names for class/field/method names, dex_strings for dex string values/literals grouped by class, dex_string_members for dex string values/literals grouped by field or method, smali for disassembled class text, native_symbols for raw and C++ demangled ELF import/symbol/relocation names plus raw entry names in lib/**/*.so, and native_strings for printable strings reported from ELF files.\"\n  },\n  \"query\": {\n    \"type\": \"string\",\n    \"description\": \"Text or regex pattern to search. queryType selects literal vs regex; caseSensitive and matchMode control matching.\"\n  },\n  \"queryType\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"literal\",\n      \"regex\"\n    ],\n    \"description\": \"Controls how query is interpreted.\"\n  },\n  \"caseSensitive\": {\n    \"type\": \"boolean\",\n    \"description\": \"Whether query matching is case-sensitive. Applies to literal and regex query matching only; prefix filtering is always literal and case-sensitive.\"\n  },\n  \"matchMode\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"contains\",\n      \"exact\"\n    ],\n    \"description\": \"Controls whether query can match a substring or must match an entire searchable value. Use contains by default. exact is invalid when target=smali.\"\n  },\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Required candidate prefix filter; pass \\\"\\\" for no filter. overview requires \\\"\\\". For files, this is an APK ZIP entry path prefix like res/layout/. For native_symbols and native_strings, this is the SO ZIP entry path prefix such as lib/arm64-v8a/; it is not a symbol or string text prefix. For resource_table_* targets, match resource locator targets like 0x7f010000, type/name, or name; only 0x resource ids are case-insensitive. For dex_names, dex_strings, dex_string_members, and smali, this is a dex class owner prefix; pass a Java package, slash prefix, L-prefix, or full descriptor.\"\n  },\n  \"includeMatchOffsets\": {\n    \"type\": \"boolean\",\n    \"description\": \"When true, include hit.matchOffsets and matchedStrings[].matchOffsets. Offsets are zero-based UTF-16 positions in the original searched candidate, with end exclusive. Each text preview has a textStartOffset; subtract it from start/end to locate the match within the preview. Long matches may extend beyond the preview. Name candidates may use decoded or normalized aliases, so offsets are not byte offsets or edit ranges. Use data.hits[i].hit.nativeLocation.name as the raw native namePrefix source. Pass false normally, or true to inspect exact match spans.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum hits on this first page. Recommended value is 50; maximum 200 is enforced at runtime. Use mt_apk_continue for later pages.\"\n  },\n  \"snippetMaxChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum snippet length per hit. Recommended value is 240; maximum 1000 is enforced at runtime. Use 0 to disable snippets. For native hits, snippet is readable context only; data.hits[i].hit.nativeLocation remains available for follow-up parameters even when snippets are disabled or suppressed.\"\n  }\n}\n");
        this.f31215 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f31217;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM20424 = C7761.m20424();
        this.f31217 = jSONObjectM20424;
        return jSONObjectM20424;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C7761.m20419(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            C0704 c0704M41070 = C17638.m41070(jSONObject);
            return m23583(C17638.m41048(c0704M41070, this.f31216.m20696(c0704M41070.f2970)), new C15283(), (String) null);
        } finally {
            int i = C23044.f74862;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m23585(C21632 c21632, JSONObject jSONObject, C15283 c15283) {
        return m23583(C17638.m41021(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c21632, jSONObject), c15283, jSONObject.getString("nextCursor", null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17669 m23583(C1139 c1139, C15283 c15283, String str) throws Exception {
        String str2 = c1139.f5123;
        C7845 c7845 = this.f31216;
        InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
        try {
            C17669 c17669 = (C17669) c7845.m20698(str2, c1139.f5124, str, new C3048(this, c1139, c15283));
            c7845.m20720(str2);
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

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C17669 m23584(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m23582(long j) {
        if (j < 0) {
            return JSON.NULL;
        }
        return JSON.value("0x" + Long.toHexString(j));
    }
}
