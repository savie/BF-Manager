package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3400 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f12548;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13427 f12549;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f12550;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_create_directory";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Create an allowed local directory with fixed mkdir -p behavior, including every missing parent directory. An existing directory succeeds with changed=false; any existing non-directory component fails. Paths may be absolute or relative to the Home captured at call start. Creating multiple levels is not atomic; a failure may leave created parent directories, with partial progress reported in error diagnostics.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Create Local Directory";
    }

    public C3400(C13427 c13427) {
        this.f12549 = c13427;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f12548 == null) {
            this.f12548 = C18828.m43457(JSON.object(), "string", "Non-empty absolute path or path relative to the Home captured at call start.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_create_directory; parent creation is always enabled.");
        }
        return this.f12548;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f12550 == null) {
            this.f12550 = C4969.m13780("Result for mt_file_create_directory.", C4969.m13777(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute target directory path.")).add("changed", C4969.m13786(ClassTransform.BOOLEAN, "Whether at least one directory was created.")).add("warnings", C3184.m9603("type", "array", "description", "Non-fatal directory change notification degradation.").add("items", C4969.m13786("string", "One warning message."))), "Successful mkdir -p operation."), C12123.m30172("mt_file_create_directory"), C4969.m13779("mt_file_create_directory has no automatic follow-up action."));
        }
        return this.f12550;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_create_directory", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C9752(), "Invalid directory create argument", MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C12731.m31626("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "parent/child"));
        }
        C1431 c1431M32919 = this.f12549.m32919(jSONValue.asString());
        return new C17669(C0735.m3193(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c1431M32919.f5884).add("changed", c1431M32919.f5883).add("warnings", new JSONArray(c1431M32919.f5882)), JSON.array()));
    }
}
