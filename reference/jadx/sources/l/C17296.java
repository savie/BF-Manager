package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܽۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W76J */
/* JADX INFO: loaded from: classes5.dex */
public final class C17296 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f56326;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f56327;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f56328;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Delete APK Workspace";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Delete an APK workspace and all associated state, including edit sessions. Delete temporary workspaces opened with mt_apk_workspace_open temporary=true after they are no longer needed. Keep ordinary non-temporary workspaces because they are intended for reuse and later analysis; delete one only when the user explicitly asks or clearly confirms it is no longer needed.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_workspace_delete";
    }

    public C17296(C1897 c1897) {
        this.f56327 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f56326;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open. Delete temporary=true workspaces after they are no longer needed. Keep ordinary non-temporary workspaces because they are reusable; delete an ordinary workspace only when the user explicitly asks or clearly confirms it is no longer needed. This deletes the workspace and associated state, including edit sessions.\"\n  }\n}\n");
        this.f56326 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f56328;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_workspace_delete. data confirms that a workspace and all state under it were closed and deleted; temporary identifies the deleted workspace type; nextActions is always empty.", C22783.m51386(JSON.object().add("workspaceId", C10932.m27740("string", "Closed workspace id.")).add("temporary", C10932.m27740(ClassTransform.BOOLEAN, "Whether the closed workspace was temporary.")).add("closed", C10932.m27740(ClassTransform.BOOLEAN, "Whether the workspace was closed.")), ClassTransform.BOOLEAN, "Whether the workspace directory and all state under it were deleted.", "deleted", "Successful mt_apk_workspace_delete data."), C10932.m27741(C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Requested workspace id after argument parsing, or null when the argument was missing or not a string.")).add("temporary", C10932.m27743(ClassTransform.BOOLEAN, "Whether the workspace was temporary when known, or null when it could not be confirmed.")), "mt_apk_workspace_delete diagnostics.")), C10932.m27733("mt_apk_workspace_delete has no follow-up actions."));
        this.f56328 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        int i;
        try {
            C16638 c16638M6550 = this.f56327.m6550(C4375.m13977(jSONObject));
            return new C1238(C15300.m36728(JSON.object().add("workspaceId", c16638M6550.f53782).add("temporary", c16638M6550.f53781).add("closed", true).add("deleted", true), JSON.array()));
        } finally {
            i = C24294.f78630;
        }
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        JSONObject jSONObject = c10186.f32602;
        JSONValue jSONValue = jSONObject.get("temporary");
        return C15300.m36730(c10186, C8008.m21874(jSONObject, "workspaceId", JSON.object(), "workspaceId").add("temporary", (jSONValue == null || !jSONValue.isBoolean()) ? JSON.NULL : JSON.value(jSONValue.asBoolean())), JSON.array());
    }
}
