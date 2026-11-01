package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۛᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N6XW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6244 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f21180;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1201 f21181;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f21182;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_stat";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Inspect an allowed local path: absolute path, type, byte size, modified time, and current access. Ordinary files also return targetVersion for later writes. Links and other special nodes are reported but are not followed.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Stat Local File";
    }

    public C6244(C1201 c1201) {
        this.f21181 = c1201;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f21180 == null) {
            this.f21180 = C18828.m43457(JSON.object(), "string", "Non-empty absolute or Home-relative local path. URI forms are not accepted.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat.");
        }
        return this.f21180;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f21182 == null) {
            this.f21182 = C4969.m13780("Result for mt_file_stat.", C4969.m13777(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute identity of the requested path.")).add("type", C4969.m13786("string", "file, directory, link, or other.")).add("size", C4969.m13789("integer", "Ordinary file length in bytes, or null when not applicable or unknown.")).add("modifiedAt", C4969.m13789("string", "ISO 8601 local timestamp, or null when the backend cannot provide one.")).add(am.Q, C4969.m13786("string", "Current read_only or read_write MCP access for this path.")).add("targetVersion", C4969.m13789("string", "Whole-file version token of 16 lowercase hex digits, or null for non-files.")), "Local file metadata."), C12123.m30172("mt_file_stat"), C4969.m13779("mt_file_stat has no automatic follow-up action."));
        }
        return this.f21182;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_stat", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        List listAsList = Arrays.asList(MotionUtils.EASING_TYPE_PATH);
        HashSet hashSet = new HashSet();
        for (String str : jSONObject.names()) {
            if (!listAsList.contains(str) || !hashSet.add(str)) {
                throw C12731.m31626("Invalid mt_file_stat argument", str, jSONObject.get(str), JSON.array(MotionUtils.EASING_TYPE_PATH), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
            }
        }
        if (!hashSet.contains(MotionUtils.EASING_TYPE_PATH)) {
            throw C12731.m31626("Invalid path", MotionUtils.EASING_TYPE_PATH, (JSONValue) null, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
        }
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C12731.m31626("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
        }
        C22369 c22369M4396 = this.f21181.m4396(jSONValue.asString());
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c22369M4396.f73046).add("type", c22369M4396.f73048);
        Long l2 = c22369M4396.f73043;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("size", l2 == null ? JSON.NULL : JSON.value(l2.longValue()));
        String str2 = c22369M4396.f73047;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("modifiedAt", str2 == null ? JSON.NULL : JSON.value(str2)).add(am.Q, c22369M4396.f73044);
        String str3 = c22369M4396.f73045;
        return new C17669(C0735.m3193(jSONObjectAdd3.add("targetVersion", str3 == null ? JSON.NULL : JSON.value(str3)), JSON.array()));
    }
}
