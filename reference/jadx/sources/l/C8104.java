package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C8104 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f26762;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f26763;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f26764;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Find APK Dex Xrefs";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Use when you have a dex_method locator, dex_field locator, or dex_class locator and need incoming instruction references. All input fields are required; for dex_method use methodResolution=dispatch and limit=50 unless the user asks otherwise; for dex_field or dex_class use methodResolution=not_applicable. exact matches bytecode MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target implementation or method contract. Field and class xrefs are exact instruction references only. Results are read-only. To understand the containing method, first pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator to mt_apk_dex_read_pseudocode. Use mt_apk_read_text only when exact instructions or editing are needed, pseudocode generation fails, or the logic remains unclear after reading the relevant pseudocode pages.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_dex_xref";
    }

    public C8104(C1897 c1897) {
        this.f26763 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f26762;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to xref the edited session; pass an empty string to xref the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Target locator string. Accepted prefixes: dex_method:, dex_field:, dex_class:. For dex_method use a full smali method reference such as dex_method:Lcom/example/Foo;->bar()V; for dex_field use a smali field reference such as dex_field:Lcom/example/Foo;->flag:Z; for dex_class use a class descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"methodResolution\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"exact\",\n      \"slot\",\n      \"dispatch\",\n      \"not_applicable\"\n    ],\n    \"description\": \"Required. For dex_method use dispatch unless the user asks for exact bytecode references or slot override family; exact matches MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target. For dex_field and dex_class use not_applicable.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Required page size. Use 50 unless the user asks otherwise; maximum 200 is enforced at runtime. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f26762 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f26764;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM38683 = C16307.m38683();
        this.f26764 = jSONObjectM38683;
        return jSONObjectM38683;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C16307.m38692(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            return m21983(C4375.m13962(jSONObject), false, (String) null);
        } finally {
            int i = C24294.f78630;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m21984(C14596 c14596, JSONObject jSONObject) {
        return m21983(C4375.m13976(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c14596, jSONObject), true, jSONObject.getString("nextCursor", null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1238 m21983(C15146 c15146, boolean z, String str) throws Exception {
        String str2 = c15146.f49415;
        C1897 c1897 = this.f26763;
        c1897.m6558(str2);
        try {
            InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
            try {
                C1238 c1238 = (C1238) c1897.m6532(str2, c15146.f49420, str, new C0646(this, c15146));
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
        } catch (OutOfMemoryError e) {
            try {
                C20653.m47269("MT MCP xref out of memory: workspaceId=" + str2 + ", methodResolution=" + c15146.f49419 + ", continuation=" + z + ", error=" + e.getMessage());
            } catch (OutOfMemoryError unused) {
            }
            throw C18723.m43530();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1238 m21982(C8104 c8104, C15146 c15146, int i) {
        String str;
        String str2 = c15146.f49420;
        C11942 c11942M6547 = c8104.f26763.m6547(c15146, new C4156());
        int i2 = C24294.f78630;
        String str3 = c11942M6547.f38463;
        ArrayList arrayList = c11942M6547.f38460;
        C8959 c8959 = c11942M6547.f38464;
        String strM13933 = C4375.m13933(str3, c11942M6547.f38465, c11942M6547.f38462);
        if ("dex_field".equals(str3)) {
            str = "field_access";
        } else {
            str = "dex_class".equals(str3) ? "type_reference" : "method_call";
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c11942M6547.f38461);
        int i3 = c15146.f49416;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("editSessionId", str2).add("targetLocator", strM13933).add("referenceKind", str).add("methodResolution", c11942M6547.f38459);
        JSONArray jSONArrayArray = JSON.array();
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            C2248 c2248 = (C2248) it.next();
            jSONArrayArray.add(JSON.object().add("sourceLocator", C4375.m13906("dex_method", (String) null, c2248.f7352, c2248.f7351, (String) null, (String) null)).add("referenceOperand", c2248.f7353).add("matchKind", c2248.f7350).add("dispatchCertainty", c2248.f7349).add("opcode", c2248.f7355).add("instructionIndex", c2248.f7354));
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add(e.m, jSONArrayArray).add("nextActions", JSON.array());
        JSONObject jSONObjectAdd4 = JSON.object().add("hasMore", c8959 != null).add("returnedCount", arrayList.size()).add("limitMax", 200).add("totalAvailableCount", (String) null);
        if (c8959 != null) {
            String strM42757 = C18326.m42757("xref", c11942M6547.f38461, c15146.f49420, i, JSON.object().add("targetLocator", C4375.m13933(c15146.f49417, c15146.f49414, c15146.f49421)).add("methodResolution", c15146.f49419).add("recommendedLimit", i3).add("limitMax", 200), JSON.object().add("classIndex", c8959.f29221).add("memberIndex", c8959.f29222).add("instructionIndex", c8959.f29223));
            jSONObjectAdd4.add("nextCursor", strM42757);
            jSONObjectAdd3.getJSONArray("nextActions").add(C2729.m9064(C4375.m13896(c15146.f49415, i3, str2, strM42757), "mt_apk_continue", "continue", "Continue xref next page"));
        }
        jSONObjectAdd3.add("pagination", jSONObjectAdd4);
        return new C1238(C16307.m38685(jSONObjectAdd3));
    }
}
