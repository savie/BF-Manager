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

/* JADX INFO: renamed from: l.ᩴ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 776Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C19050 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f61609;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f61610;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f61611;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_resource_xref";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Find stable references to one resources.arsc resource id. All input fields are required; use scopes=[\"dex\",\"axml\",\"resource_table\"] and limit=50 for a broad check. This tool reports only exact resource id/reference matches, not resource names, string values, or file-path weak matches. Each ref contains only fields applicable to its scope; inspect ref.scope and field presence.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Find APK Resource Xrefs";
    }

    public C19050(C7845 c7845) {
        this.f61610 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f61609;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to inspect the edited session; pass an empty string to inspect the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Resource locator string such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n  },\n  \"scopes\": {\n    \"type\": \"array\",\n    \"description\": \"Required non-empty scopes. Suggested value is [\\\"dex\\\",\\\"axml\\\",\\\"resource_table\\\"].\",\n    \"items\": {\n      \"type\": \"string\",\n      \"enum\": [\n        \"dex\",\n        \"axml\",\n        \"resource_table\"\n      ]\n    }\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum refs on this page. Suggested value is 50; allowed range is 1..200.\"\n  }\n}\n");
        this.f61609 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f61611;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_resource_xref.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id.")).add("editSessionId", C4969.m13789("string", "Edit session id.")).add("targetLocator", C4969.m13789("string", "Target resource locator.")).add("refs", C3184.m9603("type", "array", "description", "Exact resource references.").add("items", JSON.object().add("description", "One exact resource xref hit. The branch is selected by scope and item field presence.").add("anyOf", JSON.array().add(C18828.m43457(JSON.object().add("scope", C4969.m13784("Scope that produced the hit.", "dex", "axml")).add("matchKind", C4969.m13784("Exact resource-id match.", "resource_id")).add("sourceLocator", C4969.m13786("string", "Non-null dex_method or axml locator. Reuse data.workspaceId and data.editSessionId and pass this value to mt_apk_read_text.locator.")), "string", "Source snippet; empty string when unavailable.", "snippet", "Dex or decoded AXML resource-id reference.")).add(C18828.m43457(m43788(Name.REFER, "parent_reference").add("sourceType", C4969.m13786("string", "Source resource type.")).add("sourceName", C4969.m13786("string", "Source resource name.")), "string", "Source resource variant. Use this as mt_apk_resource_read.reads[].variant.", "sourceVariant", "Top-level value or parent reference from the resource table.")).add(C4969.m13777(m43788(Name.REFER).add("sourceType", C4969.m13786("string", "Source resource type.")).add("sourceName", C4969.m13786("string", "Source resource name.")).add("sourceVariant", C4969.m13786("string", "Source resource variant. Use this as mt_apk_resource_read.reads[].variant.")).add("itemKey", C4969.m13789("string", "Source bag item key, or null for a default item.")).add("itemKeyLocator", C4969.m13789("string", "Resource locator for the source item key when addressable; null for default or non-resource keys.")).add("itemValueKind", C4969.m13784("Value kind of the source bag item, not of the xref target.", TextBundle.TEXT_ENTRY, "styled_text", "number", ClassTransform.BOOLEAN, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimension", "fraction", Name.REFER, AnnotationHandler.ATTRIBUTE, "file_path", "null_value", "unparsed")), "Reference from one resource-table bag item."))))).add("pagination", C4969.m13785(C4969.m13782("Number of refs returned.", "Maximum accepted xref limit.", "Total available count when known, or null."))), "Successful mt_apk_resource_xref data."), C4969.m13787(C4969.m13777(JSON.object(), "No tool-specific diagnostics.")), C4969.m13783("Continuation or retry actions.", C4969.m13778(C13530.m33061(), "mt_apk_continue", "continue"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
        this.f61611 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3194(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            return m43793(m43795(jSONObject), (String) null);
        } finally {
            int i = C23044.f74862;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m43796(C21632 c21632, JSONObject jSONObject) throws C12731 {
        int i = c21632.f70152;
        int i2 = c21632.f70153;
        String string = jSONObject.getString("workspaceId", null);
        String string2 = jSONObject.getString("editSessionId", "");
        JSONValue jSONValue = jSONObject.get("limit");
        if (jSONValue == null) {
            throw C12731.m31626("Missing parameter: limit", "limit", (JSONValue) null, JSON.array(), JSON.object().add("limit", i));
        }
        if (jSONValue.isNull() || !jSONValue.isNumber()) {
            throw C12731.m31626("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        }
        try {
            int iM26321 = C10413.m26321(jSONValue);
            if (iM26321 >= 1) {
                JSONObject jSONObject2 = c21632.f70156;
                if (iM26321 <= i2) {
                    try {
                        return m43793(new C5373(string, string2, m43790(jSONObject2.getString("targetLocator", null), jSONObject.get("nextCursor")), m43791(jSONObject2.getJSONArray("scopes"), jSONObject.get("nextCursor")), iM26321, C15689.m37382(c21632.f70155, jSONObject.get("nextCursor"))), jSONObject.getString("nextCursor", null));
                    } catch (C12731 unused) {
                        throw C12731.m31626("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                    }
                }
            }
            throw C12731.m31626("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw C12731.m31626("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C5373 m43795(JSONObject jSONObject) throws C12731 {
        String[] strArr = {"workspaceId", "editSessionId", "locator", "scopes", "limit"};
        Iterator it = jSONObject.names().iterator();
        while (true) {
            if (!it.hasNext()) {
                String[] strArr2 = {"workspaceId", "editSessionId", "locator", "scopes", "limit"};
                for (int i = 0; i < 5; i++) {
                    String str = strArr2[i];
                    if (!jSONObject.contains(str)) {
                        throw C12731.m31626(C0252.m1693("Missing parameter: ", str), str, (JSONValue) null, JSON.array(), JSON.object().add(str, "<required>"));
                    }
                }
                String strM43789 = m43789(jSONObject, "workspaceId", false);
                String strM437810 = m43789(jSONObject, "editSessionId", true);
                JSONValue jSONValue = jSONObject.get("locator");
                if (jSONValue == null || !jSONValue.isString()) {
                    throw C12731.m31626("Invalid locator", "locator", jSONObject.get("locator"), JSON.array("resource"), JSON.object().add("locator", C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
                }
                String strAsString = jSONValue.asString();
                if (!"resource".equals(C17638.m41108(strAsString)) || C17638.m41017(strAsString) == null) {
                    throw C12731.m31626("Invalid locator", "locator", jSONObject.get("locator"), JSON.array("resource"), JSON.object().add("locator", C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
                }
                String strM43790 = m43790(strAsString, jSONObject.get("locator"));
                ArrayList arrayListM43791 = m43791(jSONObject.getJSONArray("scopes"), jSONObject.get("scopes"));
                JSONValue jSONValue2 = jSONObject.get("limit");
                if (jSONValue2 == null || !jSONValue2.isNumber()) {
                    throw C12731.m31626("Invalid limit", "limit", jSONValue2, JSON.array(1, 200), JSON.object().add("limit", 50));
                }
                try {
                    int iM26321 = C10413.m26321(jSONValue2);
                    if (iM26321 < 1 || iM26321 > 200) {
                        throw C12731.m31626("Invalid limit", "limit", JSON.value(iM26321), JSON.array(1, 200), JSON.object().add("limit", 50));
                    }
                    return new C5373(strM43789, strM437810, strM43790, arrayListM43791, iM26321, new C15689(0, 0, 0, 0, 0, 0));
                } catch (ArithmeticException | NumberFormatException unused) {
                    throw C12731.m31626("Invalid limit", "limit", jSONValue2, JSON.array(1, 200), JSON.object().add("limit", 50));
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
                    throw C12731.m31626("Invalid resource_xref argument", str2, jSONValue3, jSONArrayArray, JSON.object());
                }
                if (strArr[i2].equals(str2)) {
                    break;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17669 m43793(C5373 c5373, String str) throws Exception {
        String str2 = c5373.f18570;
        C7845 c7845 = this.f61610;
        c7845.m20722(str2);
        InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
        try {
            C17669 c17669 = (C17669) c7845.m20698(str2, c5373.f18566, str, new C18344(this, c5373));
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
    public static l.C17669 m43794(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
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
    public static String m43789(JSONObject jSONObject, String str, boolean z) throws C12731 {
        if (!jSONObject.get(str).isString()) {
            throw C12731.m31626("Invalid ".concat(str), str, jSONObject.get(str), JSON.array(), JSON.object().add(str, z ? "" : "<value>"));
        }
        String string = jSONObject.getString(str, null);
        if (z || !string.isEmpty()) {
            return string;
        }
        throw C12731.m31626("Invalid ".concat(str), str, JSON.value(string), JSON.array(), JSON.object().add(str, "<value>"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m43791(JSONArray jSONArray, JSONValue jSONValue) throws C12731 {
        if (jSONArray == 0 || jSONArray.size() == 0) {
            throw C12731.m31626("Invalid scopes", "scopes", jSONArray, JSON.array("dex", "axml", "resource_table"), JSON.object().add("scopes", JSON.array("dex", "axml", "resource_table")));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONValue jSONValue2 = jSONArray.get(i);
            if (jSONValue2 == null || !jSONValue2.isString()) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m43792(jSONArray);
            }
            String strAsString = jSONValue2.asString();
            if (!"dex".equals(strAsString) && !"axml".equals(strAsString) && !"resource_table".equals(strAsString)) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m43792(jSONArray);
            }
            if (!hashSet.add(strAsString)) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m43792(jSONArray);
            }
            arrayList.add(strAsString);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m43792(JSONValue jSONValue) {
        return C12731.m31626("Invalid scopes", "scopes", jSONValue, JSON.array("dex", "axml", "resource_table"), JSON.object().add("scopes", JSON.array("dex", "axml", "resource_table")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43790(String str, JSONValue jSONValue) throws C12731 {
        try {
            return C22703.m50304(C17638.m41017(str), "locator");
        } catch (C12731 unused) {
            throw C12731.m31626("Invalid locator", "locator", jSONValue, JSON.array("0x00000000..0xffffffff"), JSON.object().add("locator", C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m43788(String... strArr) {
        return JSON.object().add("scope", C4969.m13784("Scope that produced the hit.", "resource_table")).add("matchKind", C4969.m13784("Exact resource-table reference kind.", strArr)).add("sourceLocator", C4969.m13786("string", "Non-null source resource locator. Reuse data.workspaceId and data.editSessionId and pass this value to mt_apk_resource_read.reads[].locator, use sourceVariant as reads[].variant, and provide the required budget fields.")).add("snippet", C4969.m13786("string", "Source snippet; empty string when unavailable."));
    }
}
