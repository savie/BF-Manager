package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۖᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6XN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2716 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f10453;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21187 f10454;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f10455;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_delete";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Permanently delete exactly one allowed regular local file. The deletion does not use a recycle bin, does not follow or remove recognized symbolic links, does not accept directories or wildcards, and does not use targetVersion. Paths may be absolute or relative to Home. If deletion fails, inspect error diagnostics before retrying.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Delete Local File";
    }

    public C2716(C21187 c21187) {
        this.f10454 = c21187;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f10453 == null) {
            this.f10453 = C18828.m43457(JSON.object(), "string", "Non-empty absolute path or path relative to the Home captured at call start.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_delete.");
        }
        return this.f10453;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f10455 == null) {
            this.f10455 = C4969.m13780("Result for mt_file_delete.", C4969.m13777(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute path fixed for this call.")).add("warnings", C3184.m9603("type", "array", "description", "Non-fatal file change notification degradation.").add("items", C4969.m13786("string", "One warning message."))), "Successful permanent file deletion."), C12123.m30172("mt_file_delete"), C4969.m13779("mt_file_delete has no automatic follow-up action."));
        }
        return this.f10455;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_delete", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C11890(), "Invalid file delete argument", MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C12731.m31626("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "file.bin"));
        }
        C7782 c7782M47638 = this.f10454.m47638(jSONValue.asString());
        return new C17669(C0735.m3193(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c7782M47638.f25646).add("warnings", new JSONArray(c7782M47638.f25647)), JSON.array()));
    }
}
