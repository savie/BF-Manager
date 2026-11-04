package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܿ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56ZH */
/* JADX INFO: loaded from: classes5.dex */
public final class C18545 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f60262;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f60263;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f60264;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "List APK Workspaces";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "List saved non-temporary APK workspaces that can be reopened. Pass data.items[].path to mt_apk_workspace_open.path with temporary=false. sourcePath is the recorded absolute source path and may no longer exist; do not pass sourcePath to mt_apk_workspace_open. Results are sorted by lastAccessedAt descending. Corrupt or unavailable saved workspaces are skipped and counted in data.unavailableCount.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_workspace_list";
    }

    public C18545(C1897 c1897) {
        this.f60263 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f60262;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{}");
        this.f60262 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f60264;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_workspace_list. data.items[] contains saved non-temporary APK workspaces; pass items[i].path to mt_apk_workspace_open.path with temporary=false. sourcePath is informational and may no longer exist; nextActions is always empty.", C22783.m51386(JSON.object().add("items", C22121.m50076("type", "array", "description", "Saved non-temporary APK workspaces sorted by lastAccessedAt descending.").add("items", C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id used by MT MCP tools after opening.")).add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Workspace URI beginning with mt://workspace/ to pass directly to mt_apk_workspace_open.path with temporary=false.")).add("sourcePath", C10932.m27743("string", "Absolute source APK path recorded when the workspace was created. It is informational, may no longer exist, and must not be passed to mt_apk_workspace_open; pass path instead.")).add("sourceExists", C10932.m27740(ClassTransform.BOOLEAN, "Whether sourcePath currently points to an ordinary file.")).add("temporary", C10932.m27740(ClassTransform.BOOLEAN, "Always false because this tool excludes temporary workspaces.")).add("apkFileName", C10932.m27743("string", "Source APK file name when available.")).add("appLabel", C10932.m27743("string", "Resolved or raw application label when available.")).add("packageName", C10932.m27743("string", "Manifest package name when available.")).add("versionName", C10932.m27743("string", "Manifest versionName when available.")).add("versionCode", C10932.m27743("integer", "Manifest versionCode when available.")).add("createdAt", C10932.m27740("integer", "Workspace creation time as epoch milliseconds.")).add("lastAccessedAt", C10932.m27740("integer", "Last recorded workspace access time as epoch milliseconds.")).add("manifestAvailable", C10932.m27740(ClassTransform.BOOLEAN, "Whether AndroidManifest.xml was parsed successfully.")).add("manifestError", C10932.m27743("string", "Manifest parse error, or null.")), "Existing non-temporary APK workspace."))).add("returnedCount", C10932.m27740("integer", "Number of non-temporary workspaces returned.")), "integer", "Number of saved workspaces skipped because their data was unavailable or corrupt.", "unavailableCount", "Successful mt_apk_workspace_list data."), C10932.m27741(C14815.m35667()), C10932.m27733("No follow-up action is required; use data.items[].path directly with mt_apk_workspace_open."));
        this.f60264 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36729(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        int i;
        Iterator it = jSONObject.names().iterator();
        if (!it.hasNext()) {
            try {
                return new C1238(C21529.m48973(this.f60263.m6545()));
            } finally {
                i = C24294.f78630;
            }
        }
        String str = (String) it.next();
        throw C10186.m26301("Invalid list_workspaces argument", str, jSONObject.get(str), JSON.array(), JSON.object());
    }
}
