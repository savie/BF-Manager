package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.۫᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: CIS3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13324 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f42501;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f42502;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f42503;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Delete APK Resources";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Delete resources.arsc content from an APK edit session: all values of one resource ID, one value at a specific variant, or a whole type's variant table. Use mt_apk_resource_list with view=resource_table to find resource locators, or view=resource_table_variants to find packageId, typeId and variant for a whole table. The batch deletes the latest session content without targetVersion. Any failure leaves the session unchanged. Deleting individual resources or values keeps emptied tables; type_variant removes the table itself, including an already empty table. ZIP files and references to deleted resources are unchanged. Use mt_apk_build to generate the edited APK.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_resource_delete";
    }

    public C13324(C1897 c1897) {
        this.f42502 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f42501;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"kind\": {\"type\": \"string\", \"enum\": [\"resource\"], \"description\": \"Delete all values of one resource ID.\"},\n  \"locator\": {\"type\": \"string\", \"description\": \"Exact resource locator, such as resource:0x7f010000.\"}\n}\n");
        JSONObject jSONObjectM192010 = C6929.m19209("{\n  \"kind\": {\"type\": \"string\", \"enum\": [\"variant\"], \"description\": \"Delete one resource's value at the specified variant.\"},\n  \"locator\": {\"type\": \"string\", \"description\": \"Exact resource locator, such as resource:0x7f010000.\"}\n}\n");
        JSONObject jSONObjectM192011 = C6929.m19209("{\n  \"kind\": {\"type\": \"string\", \"enum\": [\"type_variant\"], \"description\": \"Delete the whole table for one package, type ID and variant, including all its resource values.\"},\n  \"packageId\": {\"type\": \"string\", \"description\": \"Package ID copied from resource_table_variants, as 0x plus two hex digits in 0x01..0xff.\"},\n  \"typeId\": {\"type\": \"string\", \"description\": \"Type ID copied from resource_table_variants, as 0x plus two hex digits in 0x01..0xff. Use the ID because type names may repeat.\"}\n}\n");
        m32892(jSONObjectM192010);
        m32892(jSONObjectM192011);
        JSONObject jSONObjectM192012 = C6929.m19209("{\n  \"workspaceId\": {\"type\": \"string\", \"description\": \"Workspace ID returned by mt_apk_workspace_open.\"},\n  \"editSessionId\": {\"type\": \"string\", \"description\": \"Non-empty edit session ID returned by mt_apk_session_create.\"}\n}\n");
        this.f42501 = jSONObjectM192012;
        jSONObjectM192012.getJSONObject("properties").add("deletes", C22121.m50076("type", "array", "description", "Batch of 1..200 exact targets. Every target must exist and be unambiguous. Wildcards, duplicates and overlaps are rejected.").add("items", JSON.object().add("anyOf", JSON.array().add(jSONObjectM19209).add(jSONObjectM192010).add(jSONObjectM192011))));
        this.f42501.getJSONArray(AnnotationHandler.REQUIRED).add("deletes");
        return this.f42501;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        JSONObject jSONObject = c10186.f32602;
        JSONValue jSONValue = jSONObject.get("failedDeleteIndex");
        JSONValue jSONValue2 = jSONObject.get("deleteTarget");
        JSONObject jSONObjectObject = JSON.object();
        if (jSONValue == null || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectObject.add("failedDeleteIndex", jSONValue).add("target", (jSONValue2 == null || !jSONValue2.isObject()) ? JSON.NULL : jSONValue2);
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c10186.f32599.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            if ("mt_apk_workspace_open".equals(jSONObjectAsObject.getString("tool", null)) && "retry".equals(jSONObjectAsObject.getString("purpose", null))) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        String string = jSONObject.getString("workspaceId", null);
        String string2 = jSONObject.getString("editSessionId", null);
        if (string != null && string2 != null) {
            String str = c10186.f32601;
            if ("RESOURCE_NOT_FOUND".equals(str) || "RESOURCE_VARIANT_NOT_FOUND".equals(str) || "RESOURCE_TYPE_VARIANT_NOT_FOUND".equals(str) || "RESOURCE_TARGET_AMBIGUOUS".equals(str)) {
                jSONArrayArray.add(C2729.m9064(C22121.m50076("workspaceId", string, "editSessionId", string2).add("view", jSONValue2 != null && jSONValue2.isObject() && "type_variant".equals(jSONValue2.asObject().getString("kind", null)) ? "resource_table_variants" : "resource_table").add("typeName", "*").add("variant", "*").add("limit", 200), "mt_apk_resource_list", "inspect", "Inspect the current resource table"));
            }
        }
        return C15300.m36730(c10186, jSONObjectAdd, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m32892(JSONObject jSONObject) {
        jSONObject.getJSONObject("properties").add("variant", C22121.m50076("type", "string", "description", "Exact variant copied from the resource list: default for no qualifiers, or a value with a leading hyphen such as -zh-rCN. No wildcard or fallback matching."));
        jSONObject.getJSONArray(AnnotationHandler.REQUIRED).add("variant");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f42503 == null) {
            this.f42503 = C10932.m27734("Result for mt_apk_resource_delete.", C22783.m51386(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace containing the modified session.")).add("editSessionId", C10932.m27740("string", "Edit session to use for further reads, edits and build.")).add("deletedResourceCount", C10932.m27740("integer", "Number of distinct resource IDs that lost their last value in this batch.")).add("deletedValueCount", C10932.m27740("integer", "Number of resource values removed, counting each resource ID and variant pair once.")), "integer", "Number of tables removed by type_variant targets, including empty tables.", "deletedTypeVariantCount", "Committed deletion counts for the entire batch."), C10932.m27741(C10932.m27731(JSON.object().add("failedDeleteIndex", C10932.m27743("integer", "0-based deletes[] index, or null when no single target caused the error.")).add("target", C10932.m27739(C10932.m27731(JSON.object().add("kind", C10932.m27743("string", "resource, variant or type_variant.")).add("locator", C10932.m27743("string", "Resource locator for resource or variant.")).add("packageId", C10932.m27743("string", "Package ID for type_variant.")).add("typeId", C10932.m27743("string", "Type ID for type_variant.")).add("variant", C10932.m27743("string", "Exact variant for variant or type_variant.")), "Rejected normalized target; fields not used by its kind are null."))), "A failed batch leaves the session unchanged.")), C10932.m27737("Success returns no action. A missing or ambiguous target may offer a resource list to inspect the same session.", C10932.m27732(C16237.m38547(), "mt_apk_resource_list", "inspect"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
        }
        return this.f42503;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            C24272 c24272M13944 = C4375.m13944(jSONObject);
            try {
                C15892 c15892M6549 = this.f42502.m6549(c24272M13944);
                int i = C24294.f78630;
                return new C1238(C15561.m37285(c15892M6549));
            } catch (C10186 e) {
                C15561.m37286(e, c24272M13944, -1);
                throw e;
            }
        } catch (Throwable th) {
            int i2 = C24294.f78630;
            throw th;
        }
    }
}
