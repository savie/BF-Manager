package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۧۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W76J */
/* JADX INFO: loaded from: classes4.dex */
public final class C10792 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f36756;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f36757;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f36758;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_workspace_delete";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Delete an APK workspace and all associated state, including edit sessions. Delete temporary workspaces opened with mt_apk_workspace_open temporary=true after they are no longer needed. Keep ordinary non-temporary workspaces because they are intended for reuse and later analysis; delete one only when the user explicitly asks or clearly confirms it is no longer needed.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Delete APK Workspace";
    }

    public C10792(C7845 c7845) {
        this.f36757 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f36756;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open. Delete temporary=true workspaces after they are no longer needed. Keep ordinary non-temporary workspaces because they are reusable; delete an ordinary workspace only when the user explicitly asks or clearly confirms it is no longer needed. This deletes the workspace and associated state, including edit sessions.\"\n  }\n}\n");
        this.f36756 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f36758;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_workspace_delete. data confirms that a workspace and all state under it were closed and deleted; temporary identifies the deleted workspace type; nextActions is always empty.", C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Closed workspace id.")).add("temporary", C4969.m13786(ClassTransform.BOOLEAN, "Whether the closed workspace was temporary.")).add("closed", C4969.m13786(ClassTransform.BOOLEAN, "Whether the workspace was closed.")), ClassTransform.BOOLEAN, "Whether the workspace directory and all state under it were deleted.", "deleted", "Successful mt_apk_workspace_delete data."), C4969.m13787(C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Requested workspace id after argument parsing, or null when the argument was missing or not a string.")).add("temporary", C4969.m13789(ClassTransform.BOOLEAN, "Whether the workspace was temporary when known, or null when it could not be confirmed.")), "mt_apk_workspace_delete diagnostics.")), C4969.m13779("mt_apk_workspace_delete has no follow-up actions."));
        this.f36758 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        int i;
        try {
            C8196 c8196M20705 = this.f36757.m20705(C17638.m41066(jSONObject));
            return new C17669(C0735.m3193(JSON.object().add("workspaceId", c8196M20705.f28555).add("temporary", c8196M20705.f28554).add("closed", true).add("deleted", true), JSON.array()));
        } finally {
            i = C23044.f74862;
        }
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        JSONObject jSONObject = c12731.f42468;
        JSONValue jSONValue = jSONObject.get("temporary");
        return C0735.m3195(c12731, C11445.m28557(jSONObject, "workspaceId", JSON.object(), "workspaceId").add("temporary", (jSONValue == null || !jSONValue.isBoolean()) ? JSON.NULL : JSON.value(jSONValue.asBoolean())), JSON.array());
    }
}
