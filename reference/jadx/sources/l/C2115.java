package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D77Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C2115 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f7767;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f7768;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f7769;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_dex_xref";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Use when you have a dex_method locator, dex_field locator, or dex_class locator and need incoming instruction references. All input fields are required; for dex_method use methodResolution=dispatch and limit=50 unless the user asks otherwise; for dex_field or dex_class use methodResolution=not_applicable. exact matches bytecode MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target implementation or method contract. Field and class xrefs are exact instruction references only. Results are read-only; to inspect the containing method, pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator as mt_apk_read_text.locator.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Find APK Dex Xrefs";
    }

    public C2115(C7845 c7845) {
        this.f7768 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f7767;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to xref the edited session; pass an empty string to xref the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Target locator string. Accepted prefixes: dex_method:, dex_field:, dex_class:. For dex_method use a full smali method reference such as dex_method:Lcom/example/Foo;->bar()V; for dex_field use a smali field reference such as dex_field:Lcom/example/Foo;->flag:Z; for dex_class use a class descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"methodResolution\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"exact\",\n      \"slot\",\n      \"dispatch\",\n      \"not_applicable\"\n    ],\n    \"description\": \"Required. For dex_method use dispatch unless the user asks for exact bytecode references or slot override family; exact matches MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target. For dex_field and dex_class use not_applicable.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Required page size. Use 50 unless the user asks otherwise; maximum 200 is enforced at runtime. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f7767 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f7769;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM20423 = C7761.m20423();
        this.f7769 = jSONObjectM20423;
        return jSONObjectM20423;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C7761.m20429(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            return m6662(C17638.m41104(jSONObject), false, (String) null);
        } finally {
            int i = C23044.f74862;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m6663(C21632 c21632, JSONObject jSONObject) {
        return m6662(C17638.m41065(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c21632, jSONObject), true, jSONObject.getString("nextCursor", null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17669 m6662(C6784 c6784, boolean z, String str) throws Exception {
        String str2 = c6784.f22906;
        C7845 c7845 = this.f7768;
        c7845.m20722(str2);
        try {
            InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
            try {
                C17669 c17669 = (C17669) c7845.m20698(str2, c6784.f22907, str, new C14817(this, c6784));
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
        } catch (OutOfMemoryError e) {
            try {
                C0577.m2744("MT MCP xref out of memory: workspaceId=" + str2 + ", methodResolution=" + c6784.f22904 + ", continuation=" + z + ", error=" + e.getMessage());
            } catch (OutOfMemoryError unused) {
            }
            throw C2664.m8203();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17669 m6661(C2115 c2115, C6784 c6784, int i) {
        String str;
        String str2 = c6784.f22907;
        C21332 c21332M20715 = c2115.f7768.m20715(c6784, new C15283());
        int i2 = C23044.f74862;
        String str3 = c21332M20715.f69436;
        ArrayList arrayList = c21332M20715.f69437;
        C4481 c4481 = c21332M20715.f69438;
        String strM41078 = C17638.m41078(str3, c21332M20715.f69434, c21332M20715.f69439);
        if ("dex_field".equals(str3)) {
            str = "field_access";
        } else {
            str = "dex_class".equals(str3) ? "type_reference" : "method_call";
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c21332M20715.f69433);
        int i3 = c6784.f22905;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("editSessionId", str2).add("targetLocator", strM41078).add("referenceKind", str).add("methodResolution", c21332M20715.f69435);
        JSONArray jSONArrayArray = JSON.array();
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            C14983 c14983 = (C14983) it.next();
            jSONArrayArray.add(JSON.object().add("sourceLocator", C17638.m41044("dex_method", (String) null, c14983.f48898, c14983.f48892, (String) null, (String) null)).add("referenceOperand", c14983.f48895).add("matchKind", c14983.f48896).add("dispatchCertainty", c14983.f48894).add("opcode", c14983.f48893).add("instructionIndex", c14983.f48897));
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add(e.m, jSONArrayArray).add("nextActions", JSON.array());
        JSONObject jSONObjectAdd4 = JSON.object().add("hasMore", c4481 != null).add("returnedCount", arrayList.size()).add("limitMax", 200).add("totalAvailableCount", (String) null);
        if (c4481 != null) {
            String strM43390 = C18810.m43390("xref", c21332M20715.f69433, c6784.f22907, i, JSON.object().add("targetLocator", C17638.m41078(c6784.f22901, c6784.f22903, c6784.f22902)).add("methodResolution", c6784.f22904).add("recommendedLimit", i3).add("limitMax", 200), JSON.object().add("classIndex", c4481.f15949).add("memberIndex", c4481.f15950).add("instructionIndex", c4481.f15951));
            jSONObjectAdd4.add("nextCursor", strM43390);
            jSONObjectAdd3.getJSONArray("nextActions").add(C11320.m28376(C17638.m41034(c6784.f22906, i3, str2, strM43390), "mt_apk_continue", "continue", "Continue xref next page"));
        }
        jSONObjectAdd3.add("pagination", jSONObjectAdd4);
        return new C17669(C7761.m20425(jSONObjectAdd3));
    }
}
