package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܳۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: C6YK */
/* JADX INFO: loaded from: classes4.dex */
public final class C14320 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f46906;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f46907;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f46908;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_delete_target";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Delete one exact locator from an APK edit session identified by a non-empty editSessionId without first calling mt_apk_read_text. Pass workspaceId and editSessionId from mt_apk_session_create plus a locator returned by list, search, or class outline. The tool accepts dex_class:, dex_method:, axml:, and zip_entry:; dex_field: is read-only. It has no targetVersion parameter and deletes the latest visible target without a stale-version check. zip_entry: deletes ordinary text, oversized text, binary, or AXML entry payloads without decoding them as text; axml: requires the current entry to be AXML. Standard classes*.dex entries, resources.arsc, ZIP directory entries, wildcard/batch targets, and the base workspace are rejected. A missing or already deleted target is an error, not an idempotent success. The source APK is never modified; mt_apk_build omits the deleted target from the generated APK. This tool is destructive within the edit session and is available without a VIP membership.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Delete APK Target";
    }

    public C14320(C7845 c7845) {
        this.f46907 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c12731.f42468;
        JSONObject jSONObjectM28557 = C11445.m28557(jSONObject, "editSessionId", C11445.m28557(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId");
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || !jSONValue.isString()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM28557.add("locator", jSONValue);
        JSONArray jSONArray = c12731.f42471;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string) || "mt_apk_workspace_open".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C0735.m3195(c12731, jSONObjectAdd, jSONArrayArray);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f46906;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class:, dex_method:, axml:, or zip_entry: locator to delete. A prior mt_apk_read_text call and targetVersion are not required. zip_entry: may identify text, binary, oversized, or AXML content, but not resources.arsc, a standard classes*.dex entry, or a ZIP directory entry.\"\n  }\n}\n");
        this.f46906 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f46908;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_delete_target. Successful data identifies the one deleted locator. Errors may suggest listing classes, reading a class outline, or reopening a corrupt workspace.", C18828.m43457(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id containing the modified edit session.")).add("editSessionId", C4969.m13789("string", "Non-empty edit session id that was modified.")).add("locator", C4969.m13789("string", "Exact locator removed from the edit session view.")), ClassTransform.BOOLEAN, "Always true for a successful deletion.", "deleted", "Successful mt_apk_delete_target data."), C4969.m13787(C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id, or null for an argument error.")).add("editSessionId", C4969.m13789("string", "Edit session id, or null for an argument error.")).add("locator", C4969.m13789("string", "Rejected normalized locator, or null when it could not be parsed.")), "mt_apk_delete_target diagnostics.")), C4969.m13783("Successful deletion returns no next action. Missing class or method errors may suggest the matching session list or outline, and a corrupt workspace may suggest mt_apk_workspace_open.", C4969.m13778(C13530.m33058(), "mt_apk_list", "verify_workspace"), C4969.m13778(C13530.m33057(), "mt_apk_dex_read_class_outline", "verify_workspace"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
        this.f46908 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            C0083 c0083M41018 = C17638.m41018(jSONObject);
            try {
                C8902 c8902M20706 = this.f46907.m20706(c0083M41018, new C15283());
                int i = C23044.f74862;
                return new C17669(C2664.m8194(c8902M20706));
            } catch (C12731 e) {
                e.f42468.put("workspaceId", c0083M41018.f990).put("editSessionId", c0083M41018.f991).put("locator", C17638.m41043(c0083M41018.f992, c0083M41018.f993));
                throw e;
            }
        } catch (Throwable th) {
            int i2 = C23044.f74862;
            throw th;
        }
    }
}
