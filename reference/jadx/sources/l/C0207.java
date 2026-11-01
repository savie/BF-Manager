package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.֡ۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E6L4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0207 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f1366;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f1367;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f1368;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo1545() {
        return "mt_apk_resource_add";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo1551() {
        return "Add new resources or missing variants to an APK edit session. Use kind=resource to allocate a new ID in an existing package, or kind=variant to add values to an existing resource locator. Requires an existing resources.arsc; missing types and configurations can be created. The whole batch succeeds or leaves the session unchanged. For kind=resource, an existing name in the selected package/type is a conflict; for kind=variant, an existing configuration on the target is a conflict, even when values match. Use mt_apk_resource_edit to change existing values. Adding attr resources or their variants is unsupported. IDs already present are preserved. File resource values only add resource-table records; add the corresponding ZIP entries separately. Follow the returned mt_apk_resource_read action to inspect the new values.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo1552() {
        return "Add APK Resource";
    }

    public C0207(C7845 c7845) {
        this.f1367 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f1366;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"kind\": {\n    \"type\": \"string\",\n    \"enum\": [\"resource\"],\n    \"description\": \"Create a new resource with an automatically allocated ID. Its name must be absent from the selected package/type; put all of its configurations in this values array.\"\n  },\n  \"packageId\": {\n    \"type\": \"string\",\n    \"description\": \"Existing package ID as 0x plus two hex digits, in 0x01..0xff. It is the first byte of a resource ID: resource:0x7f010000 belongs to package 0x7f. Use mt_apk_list with view=resource_table to discover resource locators.\"\n  }\n}\n");
        JSONObject jSONObjectM42598 = C18342.m42597("{\n  \"kind\": {\n    \"type\": \"string\",\n    \"enum\": [\"variant\"],\n    \"description\": \"Add missing configurations to a resource already present before this call.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Locator of a resource already present before this call, such as resource:0x7f010000. Each requested configuration must be absent on this resource.\"\n  }\n}\n");
        jSONObjectM42597.getJSONObject("properties").add("values", m1544("All values must use the same new name and resource type. The name starts with an ASCII letter or underscore, followed by ASCII letters, digits, underscores or dots. Roots bool, color, dimen, float, fraction, id, integer, plurals, string and style determine the type; array, string-array and integer-array use type array. For example: <string name='welcome_message'>Welcome</string> or <id name='new_id'/>. Roots path, reference, dynamic-reference, attribute, dynamic-attribute and complex require type='resource type', for example <path type='drawable' name='icon'>res/drawable/icon.png</path>. An explicit type on other roots must agree with the inferred type. A type supplied for a generic root uses lowercase ASCII letters, digits or underscores, starts with a letter or underscore, and cannot end with a digit; custom types are supported."));
        jSONObjectM42597.getJSONArray(AnnotationHandler.REQUIRED).add("values");
        jSONObjectM42598.getJSONObject("properties").add("values", m1544("Read an existing configuration with mt_apk_resource_read and use its valueXml as a template. Keep the root name attribute unchanged. The resource type is inherited from the target; the root tag only determines the value format, so a drawable color value uses <color>. Any explicit type must match the target resource type."));
        jSONObjectM42598.getJSONArray(AnnotationHandler.REQUIRED).add("values");
        JSONObject jSONObjectM42599 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace ID returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session ID returned by mt_apk_session_create.\"\n  }\n}\n");
        this.f1366 = jSONObjectM42599;
        jSONObjectM42599.getJSONObject("properties").add("adds", C3184.m9603("type", "array", "description", "Non-empty atomic batch. Across all adds, values must total 1..200; around 20 is recommended. Where app name references are supported, values can reference resources added elsewhere in this batch.").add("items", JSON.object().add("anyOf", JSON.array().add(jSONObjectM42597).add(jSONObjectM42598))));
        this.f1366.getJSONArray(AnnotationHandler.REQUIRED).add("adds");
        return this.f1366;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo1547(C12731 c12731) {
        JSONObject jSONObject = c12731.f42468;
        JSONObject jSONObjectM28557 = C11445.m28557(jSONObject, "editSessionId", C11445.m28557(jSONObject, "workspaceId", JSON.object(), "workspaceId"), "editSessionId");
        JSONValue jSONValue = jSONObject.get("failedAddIndex");
        if (jSONValue == null || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM28557.add("failedAddIndex", jSONValue);
        JSONValue jSONValue2 = jSONObject.get("failedValueIndex");
        if (jSONValue2 == null || !jSONValue2.isNumber()) {
            jSONValue2 = JSON.NULL;
        }
        JSONObject jSONObjectAdd2 = C11445.m28557(jSONObject, "variant", jSONObjectAdd.add("failedValueIndex", jSONValue2).add("locator", C10413.m26320(jSONObject.get("locator"))), "variant").add("availablePackageIds", jSONObject.getJSONArray("availablePackageIds") == null ? JSON.array() : new JSONArray(jSONObject.getJSONArray("availablePackageIds")));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c12731.f42471.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("purpose", null);
            String string2 = jSONObjectAsObject.getString("tool", null);
            if (("mt_apk_resource_read".equals(string2) && ("inspect".equals(string) || "retry".equals(string))) || ("mt_apk_workspace_open".equals(string2) && "retry".equals(string))) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C0735.m3195(c12731, jSONObjectAdd2, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m1544(String str) {
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"variant\": {\n    \"type\": \"string\",\n    \"description\": \"Concrete configuration: default or canonical Android qualifiers with a leading hyphen, such as -en, -fr or -land. Do not pass *; equivalent aliases are rejected.\"\n  },\n  \"valueXml\": {\n    \"type\": \"string\"\n  }\n}\n");
        jSONObjectM42597.getJSONObject("properties").getJSONObject("valueXml").put("description", "Complete single-entry XML in the valueXml format returned by mt_apk_resource_read, at most 1048576 UTF-16 code units. Do not use a resources wrapper or an item root. " + str + " On name-confused tables, use eight-digit hex IDs for app references and style attribute names; android: names remain accepted.");
        return JSON.object().add("type", "array").add("description", "One or more new configurations for this resource, with no duplicate variants.").add("items", jSONObjectM42597);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo1549() {
        if (this.f1368 == null) {
            this.f1368 = C4969.m13780("Result for mt_apk_resource_add.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace ID for follow-up calls.")).add("editSessionId", C4969.m13786("string", "Keep this non-empty session ID for reads, edits and build.")).add("results", JSON.object().add("type", "array").add("items", C4969.m13777(JSON.object().add("index", C4969.m13786("integer", "0-based input adds[] index.")).add("locator", C4969.m13786("string", "Resource locator to use for subsequent read, edit or xref calls.")).add("values", JSON.object().add("type", "array").add("items", C18828.m43457(JSON.object().add("variant", C4969.m13786("string", "Canonical variant; same order as input values[].")), "string", "Version after the whole batch. Copy unchanged when editing this locator and variant in the same session.", "targetVersion", "One newly added resource configuration."))), "One input add result."))), "Committed additions, in input adds[] order."), C4969.m13787(C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace ID when known.")).add("editSessionId", C4969.m13789("string", "Edit session ID when known.")).add("failedAddIndex", C4969.m13789("integer", "0-based adds[] index, or null for an error not tied to one add.")).add("failedValueIndex", C4969.m13789("integer", "0-based values[] index within the failed add, or null if no specific value failed.")).add("locator", C4969.m13789("string", "Requested target or existing conflicting resource locator, when known; a requested target may be missing. Uncommitted new resources have no usable locator, so this field is null.")).add("variant", C4969.m13789("string", "Rejected variant when known.")).add("availablePackageIds", C3184.m9603("type", "array", "description", "Existing package IDs for correcting a missing package, otherwise empty.").add("items", C4969.m13786("string", "Package ID such as 0x7f."))), "A failed batch leaves the session unchanged.")), C4969.m13783("Success returns one action to read every added value; conflicts may offer a read of the existing resource.", C4969.m13778(C13530.m33060(), "mt_apk_resource_read", "inspect"), C4969.m13778(C13530.m33060(), "mt_apk_resource_read", "retry"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
        }
        return this.f1368;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 mo1548(JSONObject jSONObject) {
        int i;
        try {
            C11755.m29361();
            return new C17669(C0735.m3196(this.f1367.m20719(C19964.m45254(jSONObject))));
        } finally {
            i = C23044.f74862;
        }
    }
}
