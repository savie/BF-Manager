package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.۟۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6XW */
/* JADX INFO: loaded from: classes4.dex */
public final class C7732 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f25473;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23043 f25474;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f25475;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Stat Local File";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Inspect an allowed local path: absolute path, type, byte size, modified time, and current access. Ordinary files also return targetVersion for later writes. Links and other special nodes are reported but are not followed.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_stat";
    }

    public C7732(C23043 c23043) {
        this.f25474 = c23043;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f25473 == null) {
            this.f25473 = C22783.m51386(JSON.object(), "string", "Non-empty absolute or Home-relative local path. URI forms are not accepted.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat.");
        }
        return this.f25473;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f25475 == null) {
            this.f25475 = C10932.m27734("Result for mt_file_stat.", C10932.m27731(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute identity of the requested path.")).add("type", C10932.m27740("string", "file, directory, link, or other.")).add("size", C10932.m27743("integer", "Ordinary file length in bytes, or null when not applicable or unknown.")).add("modifiedAt", C10932.m27743("string", "ISO 8601 local timestamp, or null when the backend cannot provide one.")).add(am.Q, C10932.m27740("string", "Current read_only or read_write MCP access for this path.")).add("targetVersion", C10932.m27743("string", "Whole-file version token of 16 lowercase hex digits, or null for non-files.")), "Local file metadata."), C5596.m16576("mt_file_stat"), C10932.m27733("mt_file_stat has no automatic follow-up action."));
        }
        return this.f25475;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_stat", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        List listAsList = Arrays.asList(MotionUtils.EASING_TYPE_PATH);
        HashSet hashSet = new HashSet();
        for (String str : jSONObject.names()) {
            if (!listAsList.contains(str) || !hashSet.add(str)) {
                throw C10186.m26301("Invalid mt_file_stat argument", str, jSONObject.get(str), JSON.array(MotionUtils.EASING_TYPE_PATH), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
            }
        }
        if (!hashSet.contains(MotionUtils.EASING_TYPE_PATH)) {
            throw C10186.m26301("Invalid path", MotionUtils.EASING_TYPE_PATH, (JSONValue) null, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
        }
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C10186.m26301("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "/absolute/or/home-relative/path"));
        }
        C11108 c11108M51950 = this.f25474.m51950(jSONValue.asString());
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c11108M51950.f35021).add("type", c11108M51950.f35022);
        Long l2 = c11108M51950.f35025;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("size", l2 == null ? JSON.NULL : JSON.value(l2.longValue()));
        String str2 = c11108M51950.f35024;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("modifiedAt", str2 == null ? JSON.NULL : JSON.value(str2)).add(am.Q, c11108M51950.f35020);
        String str3 = c11108M51950.f35023;
        return new C1238(C15300.m36728(jSONObjectAdd3.add("targetVersion", str3 == null ? JSON.NULL : JSON.value(str3)), JSON.array()));
    }
}
