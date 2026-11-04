package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۢۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7AT */
/* JADX INFO: loaded from: classes4.dex */
public final class C9837 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f31662;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f31663;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f31664;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Outline APK Dex Class";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Read one dex class outline from an opened APK workspace. Copy one exact dex_class locator, such as dex_class:Lcom/example/Foo;, from mt_apk_dex_list_classes or mt_apk_search into locator. Java names such as com.example.Foo are invalid. This is not a prefix search; use mt_apk_dex_list_classes with prefix to discover classes first. Returned field and method locators use the same workspaceId and editSessionId. For class or method logic, first use mt_apk_dex_read_pseudocode; use mt_apk_read_text only when exact instructions or editing are needed, pseudocode generation fails, or the logic remains unclear after reading the relevant pseudocode pages. Read fields directly with mt_apk_read_text. Continue pages via nextActions.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_dex_read_class_outline";
    }

    public C9837(C1897 c1897) {
        this.f31663 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f31662;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to outline the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class locator to outline, such as dex_class:Lcom/example/Foo;. Copy the full locator from mt_apk_dex_list_classes or mt_apk_search. Java names, package prefixes, search queries, dex_method:, and dex_field: are invalid.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum fields plus methods to return on this page. Pass 200 by default unless you need a smaller page; maximum 1000. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f31662 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f31664;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_dex_read_class_outline. data returns class metadata plus paged fields[] and methods[] locators. For class or method logic, first use mt_apk_dex_read_pseudocode; read fields directly with mt_apk_read_text; pass data.workspaceId, data.editSessionId, and the member locator with follow-up reads; nextActions carries continuation or recovery calls.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id used for this outline result.")).add("editSessionId", C10932.m27743("string", "Edit session id used for this outline result; pass this value together with data.workspaceId for member read calls.")).add("locator", C10932.m27743("string", "dex_class locator for this outline result.")).add("javaName", C10932.m27743("string", "Java-style class name.")).add("classHeader", C10932.m27743("string", "Raw .class header line, or null.")).add("super", C10932.m27743("string", "Superclass descriptor, or null.")).add("implements", C10932.m27742("Implemented interfaces.")).add("source", C10932.m27743("string", "Smali .source debug file name, or null; not a ZIP entry locator.")).add("fields", C22121.m50076("type", "array", "description", "Current class-outline field page; pass data.workspaceId, data.editSessionId, and fields[i].locator to mt_apk_read_text to read the member.").add("items", C22783.m51386(JSON.object().add("locator", C10932.m27740("string", "dex_field locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator.")).add("name", C10932.m27740("string", "Field name.")).add("sig", C10932.m27740("string", "Field signature.")).add(am.Q, C10932.m27740("string", "Smali access flags text.")).add("constantValue", C10932.m27743("string", "Static final dex initial value preview, or null.")), ClassTransform.BOOLEAN, "Whether constantValue was truncated.", "constantValueTruncated", "One field outline item."))).add("methods", C22121.m50076("type", "array", "description", "Current class-outline method page with method features; first pass data.workspaceId, data.editSessionId, and methods[i].locator to mt_apk_dex_read_pseudocode to understand the method.").add("items", C10932.m27731(JSON.object().add("locator", C10932.m27740("string", "dex_method locator. First pass data.workspaceId, data.editSessionId, and this locator to mt_apk_dex_read_pseudocode for method logic. Use mt_apk_read_text only when exact instructions or editing are needed, pseudocode generation fails, or the logic remains unclear after reading the relevant pseudocode pages.")).add("name", C10932.m27740("string", "Method name.")).add("sig", C10932.m27740("string", "Method signature.")).add(am.Q, C10932.m27740("string", "Smali access flags text.")).add("instructionCount", C10932.m27740("integer", "Instruction count.")).add("stringRefCount", C10932.m27740("integer", "String reference count.")).add("resourceRefCount", C10932.m27740("integer", "Resource reference count.")).add("invokeCount", C10932.m27740("integer", "Invoke count.")).add("interestingStrings", C10932.m27742("Interesting string previews.")).add("interestingInvokes", C10932.m27742("Interesting invoke previews.")), "One method outline item."))).add("pagination", C10932.m27739(C10932.m27736("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_dex_read_class_outline data."), C10932.m27741(C14815.m35667()), C10932.m27737("Executable continue or recovery actions; copy arguments directly.", C10932.m27732(C16237.m38540(), "mt_apk_continue", "continue"), C10932.m27732(C16237.m38549(), "mt_apk_list_entries", "verify_workspace"), C10932.m27732(C16237.m38543(), "mt_apk_dex_list_classes", "verify_workspace"), C10932.m27732(C16237.m38547(), "mt_apk_resource_list", "verify_workspace"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
        this.f31664 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            C19050 c19050M13888 = C4375.m13888(jSONObject);
            C4156 c4156 = new C4156();
            C1897 c1897 = this.f31663;
            String str = c19050M13888.f61740;
            C1238 c1238 = (C1238) c1897.m6532(str, c19050M13888.f61738, (String) null, new C18788(this, c19050M13888, c4156));
            c1897.m6556(str);
            return c1238;
        } finally {
            int i = C24294.f78630;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m25617(C14596 c14596, JSONObject jSONObject, C4156 c4156) throws C10186 {
        C19050 c19050M13915 = C4375.m13915(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c14596, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = c19050M13915.f61740;
        String str2 = c19050M13915.f61738;
        C18788 c18788 = new C18788(this, c19050M13915, c4156);
        C1897 c1897 = this.f31663;
        C1238 c1238 = (C1238) c1897.m6532(str, str2, string, c18788);
        c1897.m6556(str);
        return c1238;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1238 m25616(C9837 c9837, C19050 c19050, C4156 c4156, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        C3960 c3960M6537 = c9837.f31663.m6537(c19050, c4156);
        int i2 = C24294.f78630;
        String str2 = c19050.f61738;
        JSONObject jSONObjectObject = JSON.object();
        String str3 = c3960M6537.f13531;
        JSONObject jSONObjectAdd = jSONObjectObject.add("workspaceId", str3).add("editSessionId", str2).add("locator", C4375.m13906("dex_class", (String) null, c3960M6537.f13527, (String) null, (String) null, (String) null)).add("javaName", c3960M6537.f13532);
        C22474 c22474 = c3960M6537.f13535;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("classHeader", c22474.f72712).add("super", c22474.f72714).add("implements", C12556.m31235(c22474.f72715)).add("source", c22474.f72716);
        String str4 = c3960M6537.f13527;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("fields", m25615(str4, c3960M6537.f13533)).add("methods", m25615(str4, c3960M6537.f13525)).add("nextActions", JSON.array());
        JSONObject jSONObjectObject2 = JSON.object();
        boolean z = c3960M6537.f13526;
        int i3 = c3960M6537.f13528;
        JSONObject jSONObjectAdd4 = jSONObjectObject2.add("hasMore", z).add("returnedCount", c3960M6537.f13529).add("limitMax", 1000).add("totalAvailableCount", c3960M6537.f13541);
        if (z) {
            str = "classHeader";
            jSONObject2 = jSONObjectAdd3;
            jSONObject = jSONObjectAdd4;
            String strM42757 = C18326.m42757("outline_class", c3960M6537.f13531, str2, i, JSON.object().add("locator", C4375.m13906("dex_class", (String) null, c3960M6537.f13527, (String) null, (String) null, (String) null)).add("recommendedLimit", i3).add("limitMax", 1000), JSON.object().add("memberOffset", c3960M6537.f13530));
            jSONObject.add("nextCursor", strM42757);
            jSONObject2.getJSONArray("nextActions").add(C2729.m9064(C4375.m13896(str3, i3, str2, strM42757), "mt_apk_continue", "continue", "Continue class outline next page"));
        } else {
            jSONObject = jSONObjectAdd4;
            jSONObject2 = jSONObjectAdd3;
            str = "classHeader";
        }
        jSONObject2.add("pagination", jSONObject);
        String str5 = str;
        JSONObject jSONObjectAdd5 = JSON.object().add("workspaceId", jSONObject2.getString("workspaceId", null)).add("editSessionId", jSONObject2.getString("editSessionId", "")).add("locator", C12556.m31239(jSONObject2.get("locator"))).add("javaName", jSONObject2.getString("javaName", null)).add(str5, jSONObject2.getString(str5, null)).add("super", jSONObject2.getString("super", null)).add("implements", C12556.m31234(jSONObject2.getJSONArray(r8))).add("source", jSONObject2.getString("source", null));
        JSONArray jSONArray = jSONObject2.getJSONArray("fields");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                jSONArrayArray.add(JSON.object().add("locator", C12556.m31239(jSONObjectAsObject.get("locator"))).add("name", jSONObjectAsObject.getString("name", null)).add("sig", jSONObjectAsObject.getString("sig", null)).add(am.Q, jSONObjectAsObject.getString(am.Q, null)).add("constantValue", jSONObjectAsObject.getString("constantValue", null)).add("constantValueTruncated", jSONObjectAsObject.getBoolean("constantValueTruncated", false)));
            }
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("fields", jSONArrayArray);
        JSONArray jSONArray2 = jSONObject2.getJSONArray("methods");
        JSONArray jSONArrayArray2 = JSON.array();
        if (jSONArray2 != null) {
            Iterator it2 = jSONArray2.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObjectAsObject2 = ((JSONValue) it2.next()).asObject();
                jSONArrayArray2.add(JSON.object().add("locator", C12556.m31239(jSONObjectAsObject2.get("locator"))).add("name", jSONObjectAsObject2.getString("name", null)).add("sig", jSONObjectAsObject2.getString("sig", null)).add(am.Q, jSONObjectAsObject2.getString(am.Q, null)).add("instructionCount", C12556.m31242(jSONObjectAsObject2.get("instructionCount"))).add("stringRefCount", C12556.m31242(jSONObjectAsObject2.get("stringRefCount"))).add("resourceRefCount", C12556.m31242(jSONObjectAsObject2.get("resourceRefCount"))).add("invokeCount", C12556.m31242(jSONObjectAsObject2.get("invokeCount"))).add("interestingStrings", C12556.m31234(jSONObjectAsObject2.getJSONArray("interestingStrings"))).add("interestingInvokes", C12556.m31234(jSONObjectAsObject2.getJSONArray("interestingInvokes"))));
            }
        }
        return new C1238(C15300.m36728(jSONObjectAdd6.add("methods", jSONArrayArray2).add("pagination", C12556.m31236(jSONObject2.getJSONObject("pagination"))), jSONObject2.getJSONArray("nextActions")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m25615(String str, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4574 c4574 = (C4574) it.next();
            String str2 = "field".equals(c4574.f16284) ? "dex_field" : "dex_method";
            JSONObject jSONObjectAdd = JSON.object().add("name", c4574.f16281).add("sig", c4574.f16280).add(am.Q, c4574.f16277);
            if ("dex_field".equals(str2)) {
                jSONObjectAdd.add("locator", C4375.m13906(str2, (String) null, str, (String) null, c4574.f16280, (String) null));
                C6921 c6921 = c4574.f16283;
                if (c6921 != null) {
                    jSONObjectAdd.add("constantValue", c6921.f22922).add("constantValueTruncated", c4574.f16283.f22921);
                }
            } else {
                C21728 c21728 = c4574.f16282;
                jSONObjectAdd.add("instructionCount", c21728.f69329).add("stringRefCount", c21728.f69331).add("resourceRefCount", c21728.f69332).add("invokeCount", c21728.f69334).add("interestingStrings", C12556.m31235(c21728.f69330)).add("interestingInvokes", C12556.m31235(c21728.f69333));
                jSONObjectAdd.add("locator", C4375.m13906(str2, (String) null, str, c4574.f16280, (String) null, (String) null));
            }
            jSONArrayArray.add(jSONObjectAdd);
        }
        return jSONArrayArray;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36729(c10186);
    }
}
