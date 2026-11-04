package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩹ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6YK */
/* JADX INFO: loaded from: classes.dex */
public final class C23264 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f75408;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f75409;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f75410;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Delete APK Target";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Delete one exact locator from an APK edit session identified by a non-empty editSessionId without first calling mt_apk_read_text. Pass workspaceId and editSessionId from mt_apk_session_create plus a locator returned by list, search, or class outline. The tool accepts dex_class:, dex_method:, axml:, and zip_entry:; dex_field: is read-only. It has no targetVersion parameter and deletes the latest visible target without a stale-version check. zip_entry: deletes ordinary text, oversized text, binary, or AXML entry payloads without decoding them as text; axml: requires the current entry to be AXML. Standard classes*.dex entries, resources.arsc, ZIP directory entries, wildcard/batch targets, and the base workspace are rejected. A missing or already deleted target is an error, not an idempotent success. The source APK is never modified; mt_apk_build omits the deleted target from the generated APK. This tool is destructive within the edit session and is available without a VIP membership.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_delete_target";
    }

    public C23264(C1897 c1897) {
        this.f75409 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c10186.f32602;
        JSONObject jSONObjectM21874 = C8008.m21874(jSONObject, "editSessionId", C8008.m21874(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId");
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || !jSONValue.isString()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM21874.add("locator", jSONValue);
        JSONArray jSONArray = c10186.f32599;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_list_entries".equals(string) || "mt_apk_dex_list_classes".equals(string) || "mt_apk_resource_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string) || "mt_apk_workspace_open".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C15300.m36730(c10186, jSONObjectAdd, jSONArrayArray);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f75408;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class:, dex_method:, axml:, or zip_entry: locator to delete. A prior mt_apk_read_text call and targetVersion are not required. zip_entry: may identify text, binary, oversized, or AXML content, but not resources.arsc, a standard classes*.dex entry, or a ZIP directory entry.\"\n  }\n}\n");
        this.f75408 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f75410;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_delete_target. Successful data identifies the one deleted locator. Errors may suggest listing classes, reading a class outline, or reopening a corrupt workspace.", C22783.m51386(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id containing the modified edit session.")).add("editSessionId", C10932.m27743("string", "Non-empty edit session id that was modified.")).add("locator", C10932.m27743("string", "Exact locator removed from the edit session view.")), ClassTransform.BOOLEAN, "Always true for a successful deletion.", "deleted", "Successful mt_apk_delete_target data."), C10932.m27741(C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id, or null for an argument error.")).add("editSessionId", C10932.m27743("string", "Edit session id, or null for an argument error.")).add("locator", C10932.m27743("string", "Rejected normalized locator, or null when it could not be parsed.")), "mt_apk_delete_target diagnostics.")), C10932.m27737("Successful deletion returns no next action. Missing class or method errors may suggest the matching session list or outline, and a corrupt workspace may suggest mt_apk_workspace_open.", C10932.m27732(C16237.m38543(), "mt_apk_dex_list_classes", "verify_workspace"), C10932.m27732(C16237.m38542(), "mt_apk_dex_read_class_outline", "verify_workspace"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
        this.f75410 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            C12337 c12337M13949 = C4375.m13949(jSONObject);
            try {
                C23352 c23352M6555 = this.f75409.m6555(c12337M13949, new C4156());
                int i = C24294.f78630;
                return new C1238(C8485.m22801(c23352M6555));
            } catch (C10186 e) {
                e.f32602.put("workspaceId", c12337M13949.f39622).put("editSessionId", c12337M13949.f39619).put("locator", C4375.m13905(c12337M13949.f39620, c12337M13949.f39621));
                throw e;
            }
        } catch (Throwable th) {
            int i2 = C24294.f78630;
            throw th;
        }
    }
}
