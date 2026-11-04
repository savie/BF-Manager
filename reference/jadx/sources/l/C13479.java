package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13479 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f42881;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16131 f42882;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f42883;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Delete Local Directory";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Permanently delete one allowed local directory. Use recursive=false for an empty directory, or recursive=true to remove the entire tree. The root path must be a real directory; symbolic links are rejected as roots. During recursive deletion, recognized links inside the tree are unlinked without following their targets. Access roots and trees containing them are rejected. Recursive deletion is not atomic; a failure may leave a partially deleted tree. Inspect error diagnostics for partial progress and whether retrying is safe.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_delete_directory";
    }

    public C13479(C16131 c16131) {
        this.f42882 = c16131;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f42881 == null) {
            this.f42881 = C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Non-empty absolute path or path relative to the Home captured at call start. Must identify a real directory, not a symbolic link.")), ClassTransform.BOOLEAN, "False deletes only an empty directory; true permanently deletes the checked tree.", "recursive", "Arguments for mt_file_delete_directory.");
        }
        return this.f42881;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f42883 == null) {
            this.f42883 = C10932.m27734("Result for mt_file_delete_directory.", C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute directory path fixed for this call.")).add("warnings", C22121.m50076("type", "array", "description", "Deletion completed with warnings: an entry was confirmed absent despite a reported storage error, or file views may not have refreshed. Do not repeat deletion solely because notification failed.").add("items", C10932.m27740("string", "One warning message."))).add("deletedFiles", C10932.m27740("integer", "Number of regular files and recognized links confirmed deleted.")), "integer", "Number of directories confirmed deleted, including the root.", "deletedDirectories", "Successful permanent directory deletion."), C5596.m16576("mt_file_delete_directory"), C10932.m27733("mt_file_delete_directory has no automatic follow-up action."));
        }
        return this.f42883;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_delete_directory", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C6768(), "Invalid directory delete argument", MotionUtils.EASING_TYPE_PATH, "recursive");
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue2 = jSONObject.get("recursive");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m33160(jSONValue, "Invalid path", MotionUtils.EASING_TYPE_PATH);
        }
        if (jSONValue2 == null || !jSONValue2.isBoolean()) {
            throw m33160(jSONValue2, "Invalid recursive flag", "recursive");
        }
        C17623 c17623M38310 = this.f42882.m38310(jSONValue.asString(), jSONValue2.asBoolean());
        return new C1238(C15300.m36728(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c17623M38310.f57966).add("warnings", new JSONArray(c17623M38310.f57968)).add("deletedFiles", c17623M38310.f57967).add("deletedDirectories", c17623M38310.f57965), JSON.array()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m33160(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "directory").add("recursive", false));
    }
}
