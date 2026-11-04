package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩷۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6XN */
/* JADX INFO: loaded from: classes.dex */
public final class C21903 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f70749;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12402 f70750;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f70751;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Delete Local File";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Permanently delete exactly one allowed regular local file. The deletion does not use a recycle bin, does not follow or remove recognized symbolic links, does not accept directories or wildcards, and does not use targetVersion. Paths may be absolute or relative to Home. If deletion fails, inspect error diagnostics before retrying.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_delete";
    }

    public C21903(C12402 c12402) {
        this.f70750 = c12402;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f70749 == null) {
            this.f70749 = C22783.m51386(JSON.object(), "string", "Non-empty absolute path or path relative to the Home captured at call start.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_delete.");
        }
        return this.f70749;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f70751 == null) {
            this.f70751 = C10932.m27734("Result for mt_file_delete.", C10932.m27731(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute path fixed for this call.")).add("warnings", C22121.m50076("type", "array", "description", "Non-fatal file change notification degradation.").add("items", C10932.m27740("string", "One warning message."))), "Successful permanent file deletion."), C5596.m16576("mt_file_delete"), C10932.m27733("mt_file_delete has no automatic follow-up action."));
        }
        return this.f70751;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_delete", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C4749(), "Invalid file delete argument", MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C10186.m26301("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "file.bin"));
        }
        C20607 c20607M30879 = this.f70750.m30879(jSONValue.asString());
        return new C1238(C15300.m36728(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c20607M30879.f66032).add("warnings", new JSONArray(c20607M30879.f66033)), JSON.array()));
    }
}
