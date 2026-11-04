package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 776Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C2138 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f7062;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f7063;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f7064;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Find APK Resource Xrefs";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Find references to one resources.arsc resource id. Use scopes=[\"dex\",\"axml\",\"resource_table\"] and limit=50 for a broad check. DEX hits are instruction constants numerically equal to the id; inspect the containing method to confirm their use. R-field reads and dynamic resource lookups are not traced. No hits does not prove the resource is unused. AXML and resource_table scopes match explicit resource ids/references, not names, string values, or file paths. Each ref contains only fields applicable to its scope; inspect ref.scope and field presence.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_resource_xref";
    }

    public C2138(C1897 c1897) {
        this.f7063 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f7062;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to inspect the edited session; pass an empty string to inspect the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Resource locator string such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n  },\n  \"scopes\": {\n    \"type\": \"array\",\n    \"description\": \"Required non-empty scopes. Suggested value is [\\\"dex\\\",\\\"axml\\\",\\\"resource_table\\\"].\",\n    \"items\": {\n      \"type\": \"string\",\n      \"enum\": [\n        \"dex\",\n        \"axml\",\n        \"resource_table\"\n      ]\n    }\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum refs on this page. Suggested value is 50; allowed range is 1..200.\"\n  }\n}\n");
        this.f7062 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f7064;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_resource_xref.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id.")).add("editSessionId", C10932.m27743("string", "Edit session id.")).add("targetLocator", C10932.m27743("string", "Target resource locator.")).add("refs", C22121.m50076("type", "array", "description", "Resource matches; DEX constant matches require checking their use in the containing method.").add("items", JSON.object().add("description", "One resource match, with fields determined by scope.").add("anyOf", JSON.array().add(C22783.m51386(JSON.object().add("scope", C10932.m27738("Scope that produced the hit.", "dex", "axml")).add("matchKind", C10932.m27738("Equal resource-id value; a DEX constant match alone does not establish resource use.", "resource_id")).add("sourceLocator", C10932.m27740("string", "Non-null dex_method or axml locator. Reuse data.workspaceId and data.editSessionId. For dex_method logic, first pass this value to mt_apk_dex_read_pseudocode.locator; for axml, pass it to mt_apk_read_text.locator.")), "string", "Source snippet; empty string when unavailable.", "snippet", "Dex or decoded AXML resource-id reference.")).add(C22783.m51386(m7383(Name.REFER, "parent_reference").add("sourceType", C10932.m27740("string", "Source resource type.")).add("sourceName", C10932.m27740("string", "Source resource name.")), "string", "Source resource variant. Use this as mt_apk_resource_read.reads[].variant.", "sourceVariant", "Top-level value or parent reference from the resource table.")).add(C10932.m27731(m7383(Name.REFER).add("sourceType", C10932.m27740("string", "Source resource type.")).add("sourceName", C10932.m27740("string", "Source resource name.")).add("sourceVariant", C10932.m27740("string", "Source resource variant. Use this as mt_apk_resource_read.reads[].variant.")).add("itemKey", C10932.m27743("string", "Source bag item key, or null for a default item.")).add("itemKeyLocator", C10932.m27743("string", "Resource locator for the source item key when addressable; null for default or non-resource keys.")).add("itemValueKind", C10932.m27738("Value kind of the source bag item, not of the xref target.", TextBundle.TEXT_ENTRY, "styled_text", "number", ClassTransform.BOOLEAN, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimension", "fraction", Name.REFER, AnnotationHandler.ATTRIBUTE, "file_path", "null_value", "unparsed")), "Reference from one resource-table bag item."))))).add("pagination", C10932.m27739(C10932.m27736("Number of refs returned.", "Maximum accepted xref limit.", "Total available count when known, or null."))), "Successful mt_apk_resource_xref data."), C10932.m27741(C10932.m27731(JSON.object(), "No tool-specific diagnostics.")), C10932.m27737("Continuation or retry actions.", C10932.m27732(C16237.m38540(), "mt_apk_continue", "continue"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
        this.f7064 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36729(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            return m7388(m7390(jSONObject), (String) null);
        } finally {
            int i = C24294.f78630;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m7391(C14596 c14596, JSONObject jSONObject) throws C10186 {
        int i = c14596.f45983;
        int i2 = c14596.f45979;
        String string = jSONObject.getString("workspaceId", null);
        String string2 = jSONObject.getString("editSessionId", "");
        JSONValue jSONValue = jSONObject.get("limit");
        if (jSONValue == null) {
            throw C10186.m26301("Missing parameter: limit", "limit", (JSONValue) null, JSON.array(), JSON.object().add("limit", i));
        }
        if (jSONValue.isNull() || !jSONValue.isNumber()) {
            throw C10186.m26301("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        }
        try {
            int iM31240 = C12556.m31240(jSONValue);
            if (iM31240 >= 1) {
                JSONObject jSONObject2 = c14596.f45982;
                if (iM31240 <= i2) {
                    try {
                        return m7388(new C4706(string, string2, m7385(jSONObject2.getString("targetLocator", null), jSONObject.get("nextCursor")), m7386(jSONObject2.getJSONArray("scopes"), jSONObject.get("nextCursor")), iM31240, C6723.m18765(c14596.f45980, jSONObject.get("nextCursor"))), jSONObject.getString("nextCursor", null));
                    } catch (C10186 unused) {
                        throw C10186.m26301("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                    }
                }
            }
            throw C10186.m26301("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw C10186.m26301("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C4706 m7390(JSONObject jSONObject) throws C10186 {
        String[] strArr = {"workspaceId", "editSessionId", "locator", "scopes", "limit"};
        Iterator it = jSONObject.names().iterator();
        while (true) {
            if (!it.hasNext()) {
                String[] strArr2 = {"workspaceId", "editSessionId", "locator", "scopes", "limit"};
                for (int i = 0; i < 5; i++) {
                    String str = strArr2[i];
                    if (!jSONObject.contains(str)) {
                        throw C10186.m26301(C25272.m56409("Missing parameter: ", str), str, (JSONValue) null, JSON.array(), JSON.object().add(str, "<required>"));
                    }
                }
                String strM7384 = m7384(jSONObject, "workspaceId", false);
                String strM7385 = m7384(jSONObject, "editSessionId", true);
                JSONValue jSONValue = jSONObject.get("locator");
                if (jSONValue == null || !jSONValue.isString()) {
                    throw C10186.m26301("Invalid locator", "locator", jSONObject.get("locator"), JSON.array("resource"), JSON.object().add("locator", C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
                }
                String strAsString = jSONValue.asString();
                if (!"resource".equals(C4375.m13947(strAsString)) || C4375.m13943(strAsString) == null) {
                    throw C10186.m26301("Invalid locator", "locator", jSONObject.get("locator"), JSON.array("resource"), JSON.object().add("locator", C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
                }
                String strM7386 = m7385(strAsString, jSONObject.get("locator"));
                ArrayList arrayListM7386 = m7386(jSONObject.getJSONArray("scopes"), jSONObject.get("scopes"));
                JSONValue jSONValue2 = jSONObject.get("limit");
                if (jSONValue2 == null || !jSONValue2.isNumber()) {
                    throw C10186.m26301("Invalid limit", "limit", jSONValue2, JSON.array(1, 200), JSON.object().add("limit", 50));
                }
                try {
                    int iM31240 = C12556.m31240(jSONValue2);
                    if (iM31240 < 1 || iM31240 > 200) {
                        throw C10186.m26301("Invalid limit", "limit", JSON.value(iM31240), JSON.array(1, 200), JSON.object().add("limit", 50));
                    }
                    return new C4706(strM7384, strM7385, strM7386, arrayListM7386, iM31240, new C6723(0, 0, 0, 0, 0, 0));
                } catch (ArithmeticException | NumberFormatException unused) {
                    throw C10186.m26301("Invalid limit", "limit", jSONValue2, JSON.array(1, 200), JSON.object().add("limit", 50));
                }
            }
            String str2 = (String) it.next();
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    JSONValue jSONValue3 = jSONObject.get(str2);
                    JSONArray jSONArrayArray = JSON.array();
                    for (int i3 = 0; i3 < 5; i3++) {
                        jSONArrayArray.add(strArr[i3]);
                    }
                    throw C10186.m26301("Invalid resource_xref argument", str2, jSONValue3, jSONArrayArray, JSON.object());
                }
                if (strArr[i2].equals(str2)) {
                    break;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1238 m7388(C4706 c4706, String str) throws Exception {
        String str2 = c4706.f16609;
        C1897 c1897 = this.f7063;
        c1897.m6558(str2);
        InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
        try {
            C1238 c1238 = (C1238) c1897.m6532(str2, c4706.f16607, str, new C12958(this, c4706));
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
    public static l.C1238 m7387(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
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
    public static String m7384(JSONObject jSONObject, String str, boolean z) throws C10186 {
        if (!jSONObject.get(str).isString()) {
            throw C10186.m26301("Invalid ".concat(str), str, jSONObject.get(str), JSON.array(), JSON.object().add(str, z ? "" : "<value>"));
        }
        String string = jSONObject.getString(str, null);
        if (z || !string.isEmpty()) {
            return string;
        }
        throw C10186.m26301("Invalid ".concat(str), str, JSON.value(string), JSON.array(), JSON.object().add(str, "<value>"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7386(JSONArray jSONArray, JSONValue jSONValue) throws C10186 {
        if (jSONArray == 0 || jSONArray.size() == 0) {
            throw C10186.m26301("Invalid scopes", "scopes", jSONArray, JSON.array("dex", "axml", "resource_table"), JSON.object().add("scopes", JSON.array("dex", "axml", "resource_table")));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONValue jSONValue2 = jSONArray.get(i);
            if (jSONValue2 == null || !jSONValue2.isString()) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m7389(jSONArray);
            }
            String strAsString = jSONValue2.asString();
            if (!"dex".equals(strAsString) && !"axml".equals(strAsString) && !"resource_table".equals(strAsString)) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m7389(jSONArray);
            }
            if (!hashSet.add(strAsString)) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m7389(jSONArray);
            }
            arrayList.add(strAsString);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m7389(JSONValue jSONValue) {
        return C10186.m26301("Invalid scopes", "scopes", jSONValue, JSON.array("dex", "axml", "resource_table"), JSON.object().add("scopes", JSON.array("dex", "axml", "resource_table")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7385(String str, JSONValue jSONValue) throws C10186 {
        try {
            return C7972.m21735(C4375.m13943(str), "locator");
        } catch (C10186 unused) {
            throw C10186.m26301("Invalid locator", "locator", jSONValue, JSON.array("0x00000000..0xffffffff"), JSON.object().add("locator", C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m7383(String... strArr) {
        return JSON.object().add("scope", C10932.m27738("Scope that produced the hit.", "resource_table")).add("matchKind", C10932.m27738("Exact resource-table reference kind.", strArr)).add("sourceLocator", C10932.m27740("string", "Non-null source resource locator. Reuse data.workspaceId and data.editSessionId and pass this value to mt_apk_resource_read.reads[].locator, use sourceVariant as reads[].variant, and provide the required budget fields.")).add("snippet", C10932.m27740("string", "Source snippet; empty string when unavailable."));
    }
}
