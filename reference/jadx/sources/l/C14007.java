package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14007 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f46025;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19777 f46026;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f46027;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_delete_directory";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Permanently delete one allowed local directory. Use recursive=false for an empty directory, or recursive=true to remove the entire tree. The root path must be a real directory; symbolic links are rejected as roots. During recursive deletion, recognized links inside the tree are unlinked without following their targets. Access roots and trees containing them are rejected. Recursive deletion is not atomic; a failure may leave a partially deleted tree. Inspect error diagnostics for partial progress and whether retrying is safe.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Delete Local Directory";
    }

    public C14007(C19777 c19777) {
        this.f46026 = c19777;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f46025 == null) {
            this.f46025 = C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Non-empty absolute path or path relative to the Home captured at call start. Must identify a real directory, not a symbolic link.")), ClassTransform.BOOLEAN, "False deletes only an empty directory; true permanently deletes the checked tree.", "recursive", "Arguments for mt_file_delete_directory.");
        }
        return this.f46025;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f46027 == null) {
            this.f46027 = C4969.m13780("Result for mt_file_delete_directory.", C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute directory path fixed for this call.")).add("warnings", C3184.m9603("type", "array", "description", "Non-fatal backend or directory change notification degradation.").add("items", C4969.m13786("string", "One warning message."))).add("deletedFiles", C4969.m13786("integer", "Number of regular files and recognized links confirmed deleted.")), "integer", "Number of directories confirmed deleted, including the root.", "deletedDirectories", "Successful permanent directory deletion."), C12123.m30172("mt_file_delete_directory"), C4969.m13779("mt_file_delete_directory has no automatic follow-up action."));
        }
        return this.f46027;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_delete_directory", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C4833(), "Invalid directory delete argument", MotionUtils.EASING_TYPE_PATH, "recursive");
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue2 = jSONObject.get("recursive");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m33855(jSONValue, "Invalid path", MotionUtils.EASING_TYPE_PATH);
        }
        if (jSONValue2 == null || !jSONValue2.isBoolean()) {
            throw m33855(jSONValue2, "Invalid recursive flag", "recursive");
        }
        C8488 c8488M44989 = this.f46026.m44989(jSONValue.asString(), jSONValue2.asBoolean());
        return new C17669(C0735.m3193(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c8488M44989.f29414).add("warnings", new JSONArray(c8488M44989.f29412)).add("deletedFiles", c8488M44989.f29415).add("deletedDirectories", c8488M44989.f29413), JSON.array()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m33855(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "directory").add("recursive", false));
    }
}
