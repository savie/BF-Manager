package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۚ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X7AT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5644 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f19303;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f19304;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f19305;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_dex_read_class_outline";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Read one dex class outline from an opened APK workspace. Copy one exact dex_class locator, such as dex_class:Lcom/example/Foo;, from mt_apk_list or mt_apk_search into locator. Java names such as com.example.Foo are invalid. This is not a prefix search; use mt_apk_list with view=dex_classes and prefix to discover classes first. Returned field and method locators can be passed with the same workspaceId and editSessionId to mt_apk_read_text. Continue pages via nextActions.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Outline APK Dex Class";
    }

    public C5644(C7845 c7845) {
        this.f19304 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f19303;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to outline the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class locator to outline, such as dex_class:Lcom/example/Foo;. Copy the full locator from mt_apk_list or mt_apk_search. Java names, package prefixes, search queries, dex_method:, and dex_field: are invalid.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum fields plus methods to return on this page. Pass 200 by default unless you need a smaller page; maximum 1000. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f19303 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f19305;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_dex_read_class_outline. data returns class metadata plus paged fields[] and methods[] locators for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and the member locator with follow-up reads; nextActions carries continuation or recovery calls.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id used for this outline result.")).add("editSessionId", C4969.m13789("string", "Edit session id used for this outline result; pass this value together with data.workspaceId for member read calls.")).add("locator", C4969.m13789("string", "dex_class locator for this outline result.")).add("javaName", C4969.m13789("string", "Java-style class name.")).add("classHeader", C4969.m13789("string", "Raw .class header line, or null.")).add("super", C4969.m13789("string", "Superclass descriptor, or null.")).add("implements", C4969.m13788("Implemented interfaces.")).add("source", C4969.m13789("string", "Smali .source debug file name, or null; not a ZIP entry locator.")).add("fields", C3184.m9603("type", "array", "description", "Current class-outline field page; pass data.workspaceId, data.editSessionId, and fields[i].locator to mt_apk_read_text to read the member.").add("items", C18828.m43457(JSON.object().add("locator", C4969.m13786("string", "dex_field locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator.")).add("name", C4969.m13786("string", "Field name.")).add("sig", C4969.m13786("string", "Field signature.")).add(am.Q, C4969.m13786("string", "Smali access flags text.")).add("constantValue", C4969.m13789("string", "Static final dex initial value preview, or null.")), ClassTransform.BOOLEAN, "Whether constantValue was truncated.", "constantValueTruncated", "One field outline item."))).add("methods", C3184.m9603("type", "array", "description", "Current class-outline method page with method features; pass data.workspaceId, data.editSessionId, and methods[i].locator to mt_apk_read_text to read the member.").add("items", C4969.m13777(JSON.object().add("locator", C4969.m13786("string", "dex_method locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator.")).add("name", C4969.m13786("string", "Method name.")).add("sig", C4969.m13786("string", "Method signature.")).add(am.Q, C4969.m13786("string", "Smali access flags text.")).add("instructionCount", C4969.m13786("integer", "Instruction count.")).add("stringRefCount", C4969.m13786("integer", "String reference count.")).add("resourceRefCount", C4969.m13786("integer", "Resource reference count.")).add("invokeCount", C4969.m13786("integer", "Invoke count.")).add("interestingStrings", C4969.m13788("Interesting string previews.")).add("interestingInvokes", C4969.m13788("Interesting invoke previews.")), "One method outline item."))).add("pagination", C4969.m13785(C4969.m13782("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_dex_read_class_outline data."), C4969.m13787(C6349.m17455()), C4969.m13783("Executable continue or recovery actions; copy arguments directly.", C4969.m13778(C13530.m33061(), "mt_apk_continue", "continue"), C4969.m13778(C13530.m33058(), "mt_apk_list", "verify_workspace"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
        this.f19305 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            C14196 c14196M41099 = C17638.m41099(jSONObject);
            C15283 c15283 = new C15283();
            C7845 c7845 = this.f19304;
            String str = c14196M41099.f46551;
            C17669 c17669 = (C17669) c7845.m20698(str, c14196M41099.f46556, (String) null, new C2434(this, c14196M41099, c15283));
            c7845.m20720(str);
            return c17669;
        } finally {
            int i = C23044.f74862;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m15531(C21632 c21632, JSONObject jSONObject, C15283 c15283) throws C12731 {
        C14196 c14196M41092 = C17638.m41092(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c21632, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = c14196M41092.f46551;
        String str2 = c14196M41092.f46556;
        C2434 c2434 = new C2434(this, c14196M41092, c15283);
        C7845 c7845 = this.f19304;
        C17669 c17669 = (C17669) c7845.m20698(str, str2, string, c2434);
        c7845.m20720(str);
        return c17669;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17669 m15530(C5644 c5644, C14196 c14196, C15283 c15283, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        C0434 c0434M20701 = c5644.f19304.m20701(c14196, c15283);
        int i2 = C23044.f74862;
        String str2 = c14196.f46556;
        JSONObject jSONObjectObject = JSON.object();
        String str3 = c0434M20701.f2003;
        JSONObject jSONObjectAdd = jSONObjectObject.add("workspaceId", str3).add("editSessionId", str2).add("locator", C17638.m41044("dex_class", (String) null, c0434M20701.f1999, (String) null, (String) null, (String) null)).add("javaName", c0434M20701.f1996);
        C12089 c12089 = c0434M20701.f2007;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("classHeader", c12089.f40450).add("super", c12089.f40451).add("implements", C10413.m26314(c12089.f40453)).add("source", c12089.f40449);
        String str4 = c0434M20701.f1999;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("fields", m15529(str4, c0434M20701.f2012)).add("methods", m15529(str4, c0434M20701.f1998)).add("nextActions", JSON.array());
        JSONObject jSONObjectObject2 = JSON.object();
        boolean z = c0434M20701.f2002;
        int i3 = c0434M20701.f2005;
        JSONObject jSONObjectAdd4 = jSONObjectObject2.add("hasMore", z).add("returnedCount", c0434M20701.f2004).add("limitMax", 1000).add("totalAvailableCount", c0434M20701.f2009);
        if (z) {
            str = "classHeader";
            jSONObject2 = jSONObjectAdd3;
            jSONObject = jSONObjectAdd4;
            String strM43390 = C18810.m43390("outline_class", c0434M20701.f2003, str2, i, JSON.object().add("locator", C17638.m41044("dex_class", (String) null, c0434M20701.f1999, (String) null, (String) null, (String) null)).add("recommendedLimit", i3).add("limitMax", 1000), JSON.object().add("memberOffset", c0434M20701.f2001));
            jSONObject.add("nextCursor", strM43390);
            jSONObject2.getJSONArray("nextActions").add(C11320.m28376(C17638.m41034(str3, i3, str2, strM43390), "mt_apk_continue", "continue", "Continue class outline next page"));
        } else {
            jSONObject = jSONObjectAdd4;
            jSONObject2 = jSONObjectAdd3;
            str = "classHeader";
        }
        jSONObject2.add("pagination", jSONObject);
        String str5 = str;
        JSONObject jSONObjectAdd5 = JSON.object().add("workspaceId", jSONObject2.getString("workspaceId", null)).add("editSessionId", jSONObject2.getString("editSessionId", "")).add("locator", C10413.m26320(jSONObject2.get("locator"))).add("javaName", jSONObject2.getString("javaName", null)).add(str5, jSONObject2.getString(str5, null)).add("super", jSONObject2.getString("super", null)).add("implements", C10413.m26313(jSONObject2.getJSONArray(r8))).add("source", jSONObject2.getString("source", null));
        JSONArray jSONArray = jSONObject2.getJSONArray("fields");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                jSONArrayArray.add(JSON.object().add("locator", C10413.m26320(jSONObjectAsObject.get("locator"))).add("name", jSONObjectAsObject.getString("name", null)).add("sig", jSONObjectAsObject.getString("sig", null)).add(am.Q, jSONObjectAsObject.getString(am.Q, null)).add("constantValue", jSONObjectAsObject.getString("constantValue", null)).add("constantValueTruncated", jSONObjectAsObject.getBoolean("constantValueTruncated", false)));
            }
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("fields", jSONArrayArray);
        JSONArray jSONArray2 = jSONObject2.getJSONArray("methods");
        JSONArray jSONArrayArray2 = JSON.array();
        if (jSONArray2 != null) {
            Iterator it2 = jSONArray2.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObjectAsObject2 = ((JSONValue) it2.next()).asObject();
                jSONArrayArray2.add(JSON.object().add("locator", C10413.m26320(jSONObjectAsObject2.get("locator"))).add("name", jSONObjectAsObject2.getString("name", null)).add("sig", jSONObjectAsObject2.getString("sig", null)).add(am.Q, jSONObjectAsObject2.getString(am.Q, null)).add("instructionCount", C10413.m26312(jSONObjectAsObject2.get("instructionCount"))).add("stringRefCount", C10413.m26312(jSONObjectAsObject2.get("stringRefCount"))).add("resourceRefCount", C10413.m26312(jSONObjectAsObject2.get("resourceRefCount"))).add("invokeCount", C10413.m26312(jSONObjectAsObject2.get("invokeCount"))).add("interestingStrings", C10413.m26313(jSONObjectAsObject2.getJSONArray("interestingStrings"))).add("interestingInvokes", C10413.m26313(jSONObjectAsObject2.getJSONArray("interestingInvokes"))));
            }
        }
        return new C17669(C0735.m3193(jSONObjectAdd6.add("methods", jSONArrayArray2).add("pagination", C10413.m26315(jSONObject2.getJSONObject("pagination"))), jSONObject2.getJSONArray("nextActions")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m15529(String str, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0093 c0093 = (C0093) it.next();
            String str2 = "field".equals(c0093.f1011) ? "dex_field" : "dex_method";
            JSONObject jSONObjectAdd = JSON.object().add("name", c0093.f1017).add("sig", c0093.f1010).add(am.Q, c0093.f1012);
            if ("dex_field".equals(str2)) {
                jSONObjectAdd.add("locator", C17638.m41044(str2, (String) null, str, (String) null, c0093.f1010, (String) null));
                C15617 c15617 = c0093.f1016;
                if (c15617 != null) {
                    jSONObjectAdd.add("constantValue", c15617.f50784).add("constantValueTruncated", c0093.f1016.f50783);
                }
            } else {
                C16322 c16322 = c0093.f1013;
                jSONObjectAdd.add("instructionCount", c16322.f52556).add("stringRefCount", c16322.f52560).add("resourceRefCount", c16322.f52557).add("invokeCount", c16322.f52555).add("interestingStrings", C10413.m26314(c16322.f52558)).add("interestingInvokes", C10413.m26314(c16322.f52559));
                jSONObjectAdd.add("locator", C17638.m41044(str2, (String) null, str, c0093.f1010, (String) null, (String) null));
            }
            jSONArrayArray.add(jSONObjectAdd);
        }
        return jSONArrayArray;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3194(c12731);
    }
}
