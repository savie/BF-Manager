package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ܺ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7AC */
/* JADX INFO: loaded from: classes5.dex */
public final class C17053 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f55711;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f55712;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f55713;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Search APK";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Search when the APK target is unknown. First call: target=overview, queryType=literal, caseSensitive=false, matchMode=contains, prefix=\"\", includeMatchOffsets=false, limit=50, snippetMaxChars=240; pass editSessionId=\"\" for the base APK. overview covers ZIP paths, decoded AXML, resource ids/names/values, dex names, and dex strings when available. Read notSearchedTargets and filterHint before treating zero hits as absence; select smali, native_symbols, native_strings, or resource_table_file_paths explicitly when needed. For native targets, prefix filters the SO entry path, not symbol names. Copy data.hits[i].locator for follow-up calls. Use mt_apk_dex_read_pseudocode for Java pseudocode of dex_class and dex_method targets; use mt_apk_read_text for Smali verification or editing. For native follow-up calls, use data.hits[i].hit.nativeLocation and its field descriptions; snippet is readable context only. Continue with mt_apk_continue when pagination.hasMore=true; totalAvailableCount=null means unknown. Narrow query or prefix to reduce scan work; limit only controls page size.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_search";
    }

    public C17053(C1897 c1897) {
        this.f55712 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f55711;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to search the edited session; pass an empty string to search the base workspace.\"\n  },\n  \"target\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"overview\",\n      \"files\",\n      \"resource_table_names\",\n      \"resource_table_values\",\n      \"resource_table_file_paths\",\n      \"dex_names\",\n      \"dex_strings\",\n      \"dex_string_members\",\n      \"smali\",\n      \"native_symbols\",\n      \"native_strings\"\n    ],\n    \"description\": \"Search target. Use overview when the target is unknown; it searches ZIP entry paths, decoded AXML, resource ids/names/decoded values, dex names, and dex strings when available, but not smali, native_symbols, native_strings, or the dedicated resource_table_file_paths target. Use files for ZIP entry paths and decoded AXML text, resource_table_names for resource ids/names, resource_table_values for decoded resource values, resource_table_file_paths only when specifically looking for resource values that point to APK ZIP entry paths, dex_names for class/field/method names, dex_strings for dex string values/literals grouped by class, dex_string_members for dex string values/literals grouped by field or method, smali for disassembled class text, native_symbols for raw and C++ demangled ELF import/symbol/relocation names plus raw entry names in lib/**/*.so, and native_strings for printable strings reported from ELF files. dex_strings and dex_string_members do not search the entire DEX string pool or symbol names/signatures unless they occur as string values; use dex_names for names and smali for signatures.\"\n  },\n  \"query\": {\n    \"type\": \"string\",\n    \"description\": \"Text or regex pattern to search. queryType selects literal vs regex; caseSensitive and matchMode control matching.\"\n  },\n  \"queryType\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"literal\",\n      \"regex\"\n    ],\n    \"description\": \"Controls how query is interpreted.\"\n  },\n  \"caseSensitive\": {\n    \"type\": \"boolean\",\n    \"description\": \"Whether query matching is case-sensitive. Applies to literal and regex query matching only; prefix filtering is always literal and case-sensitive.\"\n  },\n  \"matchMode\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"contains\",\n      \"exact\"\n    ],\n    \"description\": \"Controls whether query can match a substring or must match an entire searchable value. Use contains by default. exact is invalid when target=smali.\"\n  },\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Required candidate prefix filter; pass \\\"\\\" for no filter. overview requires \\\"\\\". For files, this is an APK ZIP entry path prefix like res/layout/. For native_symbols and native_strings, this is the SO ZIP entry path prefix such as lib/arm64-v8a/; it is not a symbol or string text prefix. For resource_table_* targets, match resource locator targets like 0x7f010000, type/name, or name; only 0x resource ids are case-insensitive. For dex_names, dex_strings, dex_string_members, and smali, this is a dex class owner prefix; pass a Java package, slash prefix, L-prefix, or full descriptor.\"\n  },\n  \"includeMatchOffsets\": {\n    \"type\": \"boolean\",\n    \"description\": \"When true, include hit.matchOffsets and matchedStrings[].matchOffsets. Offsets are zero-based UTF-16 positions in the original searched candidate, with end exclusive. Each text preview has a textStartOffset; subtract it from start/end to locate the match within the preview. Long matches may extend beyond the preview. Name candidates may use decoded or normalized aliases, so offsets are not byte offsets or edit ranges. Use data.hits[i].hit.nativeLocation.name as the raw native namePrefix source. Pass false normally, or true to inspect exact match spans.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum hits on this first page. Recommended value is 50; maximum 200 is enforced at runtime. Use mt_apk_continue for later pages.\"\n  },\n  \"snippetMaxChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum snippet length per hit. Recommended value is 240; maximum 1000 is enforced at runtime. Use 0 to disable snippets. For native hits, snippet is readable context only; data.hits[i].hit.nativeLocation remains available for follow-up parameters even when snippets are disabled or suppressed.\"\n  }\n}\n");
        this.f55711 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f55713;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM38687 = C16307.m38687();
        this.f55713 = jSONObjectM38687;
        return jSONObjectM38687;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C16307.m38679(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            C12578 c12578M13945 = C4375.m13945(jSONObject);
            C24601 c24601M14156 = C4463.m14156(jSONObject.getString("target", ""));
            try {
                C1238 c1238M40178 = m40178(C4375.m13914(c12578M13945, this.f55712.m6561(c12578M13945.f40374)), new C4156(), (String) null);
                c24601M14156.close();
                int i = C24294.f78630;
                return c1238M40178;
            } catch (Throwable th) {
                try {
                    c24601M14156.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            int i2 = C24294.f78630;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m40180(C14596 c14596, JSONObject jSONObject, C4156 c4156) throws C10186 {
        C10671 c10671M13934 = C4375.m13934(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c14596, jSONObject);
        String str = c10671M13934.f33866;
        C10801.m27525(str);
        C24601 c24601M14156 = C4463.m14156(str);
        try {
            C1238 c1238M40178 = m40178(c10671M13934, c4156, jSONObject.getString("nextCursor", null));
            c24601M14156.close();
            return c1238M40178;
        } catch (Throwable th) {
            try {
                c24601M14156.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1238 m40178(C10671 c10671, C4156 c4156, String str) throws Exception {
        String str2 = c10671.f33859;
        C1897 c1897 = this.f55712;
        InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
        try {
            C1238 c1238 = (C1238) c1897.m6532(str2, c10671.f33862, str, new C5501(this, c10671, c4156));
            c1897.m6556(str2);
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

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C1238 m40179(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m40177(long j) {
        if (j < 0) {
            return JSON.NULL;
        }
        return JSON.value("0x" + Long.toHexString(j));
    }
}
