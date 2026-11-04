package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܽۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16LA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17492 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0602 f56851;

    /* JADX INFO: renamed from: ۚ */
    public String[] mo38135() {
        return new String[0];
    }

    /* JADX INFO: renamed from: ۫ */
    public abstract JSONObject mo29017();

    /* JADX INFO: renamed from: ᩷ */
    public abstract JSONObject mo29018(JSONObject jSONObject);

    public AbstractC17492(C0602 c0602) {
        this.f56851 = c0602;
    }

    /* JADX INFO: renamed from: ۙ */
    public JSONArray mo29016(JSONObject jSONObject, JSONObject jSONObject2) {
        return JSON.array();
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObjectM27737;
        String str;
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27743("string", "Normalized archive path when available.")).add("entryPath", C10932.m27743("string", "Affected ZIP entry when available; empty for the archive."));
        String[] strArrMo38135 = mo38135();
        int length = strArrMo38135.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str2 = strArrMo38135[i];
                str2.getClass();
                switch (str2) {
                    case "size":
                        str = "Observed uncompressed entry length in bytes for an offset error.";
                        break;
                    case "finalLine":
                        str = "Zero-based logical line at the observed entry EOF.";
                        break;
                    case "finalColumn":
                        str = "Zero-based Unicode code-point column at the observed entry EOF.";
                        break;
                    default:
                        str = "Number of ordinary entries fully validated before testing stopped.";
                        break;
                }
                jSONObjectAdd.add(str2, C10932.m27743("integer", str));
                i++;
            } else {
                if (this instanceof C16000) {
                    jSONObjectM27737 = C10932.m27733("No automatic follow-up action.");
                } else {
                    jSONObjectM27737 = C10932.m27737("Executable continuation; list cursor errors may provide a restart.", C10932.m27732(mo1808(), mo1812(), "continue"), C10932.m27732(mo1808(), mo1812(), "retry"));
                }
                return C10932.m27734("Result for " + mo1812() + ".", mo29017(), C10932.m27741(C10932.m27731(jSONObjectAdd, "ZIP read diagnostics.")), jSONObjectM27737);
            }
        }
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c10186.f32602;
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectObject.add(MotionUtils.EASING_TYPE_PATH, jSONValue);
        JSONValue jSONValue2 = jSONObject.get("entryPath");
        if (jSONValue2 == null) {
            jSONValue2 = JSON.NULL;
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entryPath", jSONValue2);
        for (String str : mo38135()) {
            JSONValue jSONValue3 = jSONObject.get(str);
            if (jSONValue3 == null) {
                jSONValue3 = JSON.NULL;
            }
            jSONObjectAdd2.add(str, jSONValue3);
        }
        return C15300.m36730(c10186, jSONObjectAdd2, c10186.f32599);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        try {
            JSONObject jSONObjectMo29018 = mo29018(jSONObject);
            return new C1238(C15300.m36728(jSONObjectMo29018, mo29016(jSONObject, jSONObjectMo29018)));
        } catch (C10186 e) {
            if ((this instanceof C11525) && "ZIP_INVALID_CURSOR".equals(e.f32601)) {
                throw e.m26307(JSON.array().add(C2729.m9064(new JSONObject(jSONObject).put("cursor", "").put(MotionUtils.EASING_TYPE_PATH, e.f32602.getString(MotionUtils.EASING_TYPE_PATH)), "mt_zip_list", "retry", "Discard earlier pages and restart the ZIP listing.")));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41000(boolean z) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Absolute or Home-relative ZIP file path; split archives are not supported."));
        if (z) {
            jSONObjectAdd.add("password", C10932.m27740("string", "Password for the selected entry; pass an empty string if that entry is unencrypted, even when other entries are encrypted."));
        }
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m40999() {
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute archive path.")).add("entryPath", C10932.m27740("string", "Exact case-sensitive path inside the ZIP."));
    }
}
