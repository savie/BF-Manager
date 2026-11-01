package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 56ZH */
/* JADX INFO: loaded from: classes.dex */
public final class C23989 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f77747;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f77748;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f77749;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_workspace_list";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "List saved non-temporary APK workspaces that can be reopened. Pass data.items[].path to mt_apk_workspace_open.path with temporary=false. sourcePath is the recorded absolute source path and may no longer exist; do not pass sourcePath to mt_apk_workspace_open. Results are sorted by lastAccessedAt descending. Corrupt or unavailable saved workspaces are skipped and counted in data.unavailableCount.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "List APK Workspaces";
    }

    public C23989(C7845 c7845) {
        this.f77748 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f77747;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{}");
        this.f77747 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f77749;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_workspace_list. data.items[] contains saved non-temporary APK workspaces; pass items[i].path to mt_apk_workspace_open.path with temporary=false. sourcePath is informational and may no longer exist; nextActions is always empty.", C18828.m43457(JSON.object().add("items", C3184.m9603("type", "array", "description", "Saved non-temporary APK workspaces sorted by lastAccessedAt descending.").add("items", C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id used by MT MCP tools after opening.")).add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Workspace URI beginning with mt://workspace/ to pass directly to mt_apk_workspace_open.path with temporary=false.")).add("sourcePath", C4969.m13789("string", "Absolute source APK path recorded when the workspace was created. It is informational, may no longer exist, and must not be passed to mt_apk_workspace_open; pass path instead.")).add("sourceExists", C4969.m13786(ClassTransform.BOOLEAN, "Whether sourcePath currently points to an ordinary file.")).add("temporary", C4969.m13786(ClassTransform.BOOLEAN, "Always false because this tool excludes temporary workspaces.")).add("apkFileName", C4969.m13789("string", "Source APK file name when available.")).add("appLabel", C4969.m13789("string", "Resolved or raw application label when available.")).add("packageName", C4969.m13789("string", "Manifest package name when available.")).add("versionName", C4969.m13789("string", "Manifest versionName when available.")).add("versionCode", C4969.m13789("integer", "Manifest versionCode when available.")).add("createdAt", C4969.m13786("integer", "Workspace creation time as epoch milliseconds.")).add("lastAccessedAt", C4969.m13786("integer", "Last recorded workspace access time as epoch milliseconds.")).add("manifestAvailable", C4969.m13786(ClassTransform.BOOLEAN, "Whether AndroidManifest.xml was parsed successfully.")).add("manifestError", C4969.m13789("string", "Manifest parse error, or null.")), "Existing non-temporary APK workspace."))).add("returnedCount", C4969.m13786("integer", "Number of non-temporary workspaces returned.")), "integer", "Number of saved workspaces skipped because their data was unavailable or corrupt.", "unavailableCount", "Successful mt_apk_workspace_list data."), C4969.m13787(C6349.m17455()), C4969.m13779("No follow-up action is required; use data.items[].path directly with mt_apk_workspace_open."));
        this.f77749 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3194(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        int i;
        Iterator it = jSONObject.names().iterator();
        if (!it.hasNext()) {
            try {
                return new C17669(C11289.m28273(this.f77748.m20710()));
            } finally {
                i = C23044.f74862;
            }
        }
        String str = (String) it.next();
        throw C12731.m31626("Invalid list_workspaces argument", str, jSONObject.get(str), JSON.array(), JSON.object());
    }
}
