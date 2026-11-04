package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۚۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6L4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5364 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f18808;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f18809;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f18810;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Add APK Resource";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Add new resources or missing variants to an APK edit session. Use kind=resource to allocate a new ID in an existing package, or kind=variant to add values to an existing resource locator. Requires an existing resources.arsc; missing types and configurations can be created. The whole batch succeeds or leaves the session unchanged. For kind=resource, an existing name in the selected package/type is a conflict; for kind=variant, an existing configuration on the target is a conflict, even when values match. Use mt_apk_resource_edit to change existing values. Adding attr resources or their variants is unsupported. IDs already present are preserved. File resource values only add resource-table records; add the corresponding ZIP entries separately. Follow the returned mt_apk_resource_read action to inspect the new values.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_resource_add";
    }

    public C5364(C1897 c1897) {
        this.f18809 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f18808;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"kind\": {\n    \"type\": \"string\",\n    \"enum\": [\"resource\"],\n    \"description\": \"Create a new resource with an automatically allocated ID. Its name must be absent from the selected package/type; put all of its configurations in this values array.\"\n  },\n  \"packageId\": {\n    \"type\": \"string\",\n    \"description\": \"Existing package ID as 0x plus two hex digits, in 0x01..0xff. It is the first byte of a resource ID: resource:0x7f010000 belongs to package 0x7f. Use mt_apk_resource_list with view=resource_table to discover resource locators.\"\n  }\n}\n");
        JSONObject jSONObjectM192010 = C6929.m19209("{\n  \"kind\": {\n    \"type\": \"string\",\n    \"enum\": [\"variant\"],\n    \"description\": \"Add missing configurations to a resource already present before this call.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Locator of a resource already present before this call, such as resource:0x7f010000. Each requested configuration must be absent on this resource.\"\n  }\n}\n");
        jSONObjectM19209.getJSONObject("properties").add("values", m16023("All values must use the same new name and resource type. The name starts with an ASCII letter or underscore, followed by ASCII letters, digits, underscores or dots. Roots bool, color, dimen, float, fraction, id, integer, plurals, string and style determine the type; array, string-array and integer-array use type array. For example: <string name='welcome_message'>Welcome</string> or <id name='new_id'/>. Roots path, reference, dynamic-reference, attribute, dynamic-attribute and complex require type='resource type', for example <path type='drawable' name='icon'>res/drawable/icon.png</path>. An explicit type on other roots must agree with the inferred type. A type supplied for a generic root uses lowercase ASCII letters, digits or underscores, starts with a letter or underscore, and cannot end with a digit; custom types are supported."));
        jSONObjectM19209.getJSONArray(AnnotationHandler.REQUIRED).add("values");
        jSONObjectM192010.getJSONObject("properties").add("values", m16023("Read an existing configuration with mt_apk_resource_read and use its valueXml as a template. Keep the root name attribute unchanged. The resource type is inherited from the target; the root tag only determines the value format, so a drawable color value uses <color>. Any explicit type must match the target resource type."));
        jSONObjectM192010.getJSONArray(AnnotationHandler.REQUIRED).add("values");
        JSONObject jSONObjectM192011 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace ID returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session ID returned by mt_apk_session_create.\"\n  }\n}\n");
        this.f18808 = jSONObjectM192011;
        jSONObjectM192011.getJSONObject("properties").add("adds", C22121.m50076("type", "array", "description", "Non-empty atomic batch. Across all adds, values must total 1..200; around 20 is recommended. Where app name references are supported, values can reference resources added elsewhere in this batch.").add("items", JSON.object().add("anyOf", JSON.array().add(jSONObjectM19209).add(jSONObjectM192010))));
        this.f18808.getJSONArray(AnnotationHandler.REQUIRED).add("adds");
        return this.f18808;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        JSONObject jSONObject = c10186.f32602;
        JSONObject jSONObjectM21874 = C8008.m21874(jSONObject, "editSessionId", C8008.m21874(jSONObject, "workspaceId", JSON.object(), "workspaceId"), "editSessionId");
        JSONValue jSONValue = jSONObject.get("failedAddIndex");
        if (jSONValue == null || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM21874.add("failedAddIndex", jSONValue);
        JSONValue jSONValue2 = jSONObject.get("failedValueIndex");
        if (jSONValue2 == null || !jSONValue2.isNumber()) {
            jSONValue2 = JSON.NULL;
        }
        JSONObject jSONObjectAdd2 = C8008.m21874(jSONObject, "variant", jSONObjectAdd.add("failedValueIndex", jSONValue2).add("locator", C12556.m31239(jSONObject.get("locator"))), "variant").add("availablePackageIds", jSONObject.getJSONArray("availablePackageIds") == null ? JSON.array() : new JSONArray(jSONObject.getJSONArray("availablePackageIds")));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c10186.f32599.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("purpose", null);
            String string2 = jSONObjectAsObject.getString("tool", null);
            if (("mt_apk_resource_read".equals(string2) && ("inspect".equals(string) || "retry".equals(string))) || ("mt_apk_workspace_open".equals(string2) && "retry".equals(string))) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C15300.m36730(c10186, jSONObjectAdd2, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16023(String str) {
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"variant\": {\n    \"type\": \"string\",\n    \"description\": \"Concrete configuration: default or canonical Android qualifiers with a leading hyphen, such as -en, -fr or -land. Do not pass *; equivalent aliases are rejected.\"\n  },\n  \"valueXml\": {\n    \"type\": \"string\"\n  }\n}\n");
        jSONObjectM19209.getJSONObject("properties").getJSONObject("valueXml").put("description", "Complete single-entry XML in the valueXml format returned by mt_apk_resource_read, at most 1048576 UTF-16 code units. Do not use a resources wrapper or an item root. " + str + " On name-confused tables, use eight-digit hex IDs for app references and style attribute names; android: names remain accepted.");
        return JSON.object().add("type", "array").add("description", "One or more new configurations for this resource, with no duplicate variants.").add("items", jSONObjectM19209);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f18810 == null) {
            this.f18810 = C10932.m27734("Result for mt_apk_resource_add.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace ID for follow-up calls.")).add("editSessionId", C10932.m27740("string", "Keep this non-empty session ID for reads, edits and build.")).add("results", JSON.object().add("type", "array").add("items", C10932.m27731(JSON.object().add("index", C10932.m27740("integer", "0-based input adds[] index.")).add("locator", C10932.m27740("string", "Resource locator to use for subsequent read, edit or xref calls.")).add("values", JSON.object().add("type", "array").add("items", C22783.m51386(JSON.object().add("variant", C10932.m27740("string", "Canonical variant; same order as input values[].")), "string", "Version after the whole batch. Copy unchanged when editing this locator and variant in the same session.", "targetVersion", "One newly added resource configuration."))), "One input add result."))), "Committed additions, in input adds[] order."), C10932.m27741(C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace ID when known.")).add("editSessionId", C10932.m27743("string", "Edit session ID when known.")).add("failedAddIndex", C10932.m27743("integer", "0-based adds[] index, or null for an error not tied to one add.")).add("failedValueIndex", C10932.m27743("integer", "0-based values[] index within the failed add, or null if no specific value failed.")).add("locator", C10932.m27743("string", "Requested target or existing conflicting resource locator, when known; a requested target may be missing. Uncommitted new resources have no usable locator, so this field is null.")).add("variant", C10932.m27743("string", "Rejected variant when known.")).add("availablePackageIds", C22121.m50076("type", "array", "description", "Existing package IDs for correcting a missing package, otherwise empty.").add("items", C10932.m27740("string", "Package ID such as 0x7f."))), "A failed batch leaves the session unchanged.")), C10932.m27737("Success returns one action to read every added value; conflicts may offer a read of the existing resource.", C10932.m27732(C16237.m38544(), "mt_apk_resource_read", "inspect"), C10932.m27732(C16237.m38544(), "mt_apk_resource_read", "retry"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
        }
        return this.f18810;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        int i;
        try {
            C16834.m39750();
            return new C1238(C11109.m28058(this.f18809.m6551(C12821.m31789(jSONObject))));
        } finally {
            i = C24294.f78630;
        }
    }
}
