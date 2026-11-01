package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۚ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 16LA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5560 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19341 f19070;

    /* JADX INFO: renamed from: ֨ */
    public abstract JSONObject mo8345();

    /* JADX INFO: renamed from: ۬ */
    public String[] mo8347() {
        return new String[0];
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract JSONObject mo8348(JSONObject jSONObject);

    public AbstractC5560(C19341 c19341) {
        this.f19070 = c19341;
    }

    /* JADX INFO: renamed from: ۙ */
    public JSONArray mo8346(JSONObject jSONObject, JSONObject jSONObject2) {
        return JSON.array();
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObjectM13783;
        String str;
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13789("string", "Normalized archive path when available.")).add("entryPath", C4969.m13789("string", "Affected ZIP entry when available; empty for the archive."));
        String[] strArrMo8347 = mo8347();
        int length = strArrMo8347.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str2 = strArrMo8347[i];
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
                jSONObjectAdd.add(str2, C4969.m13789("integer", str));
                i++;
            } else {
                if (this instanceof C22494) {
                    jSONObjectM13783 = C4969.m13779("No automatic follow-up action.");
                } else {
                    jSONObjectM13783 = C4969.m13783("Executable continuation; list cursor errors may provide a restart.", C4969.m13778(mo1550(), mo1545(), "continue"), C4969.m13778(mo1550(), mo1545(), "retry"));
                }
                return C4969.m13780("Result for " + mo1545() + ".", mo8345(), C4969.m13787(C4969.m13777(jSONObjectAdd, "ZIP read diagnostics.")), jSONObjectM13783);
            }
        }
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c12731.f42468;
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
        for (String str : mo8347()) {
            JSONValue jSONValue3 = jSONObject.get(str);
            if (jSONValue3 == null) {
                jSONValue3 = JSON.NULL;
            }
            jSONObjectAdd2.add(str, jSONValue3);
        }
        return C0735.m3195(c12731, jSONObjectAdd2, c12731.f42471);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        try {
            JSONObject jSONObjectMo8348 = mo8348(jSONObject);
            return new C17669(C0735.m3193(jSONObjectMo8348, mo8346(jSONObject, jSONObjectMo8348)));
        } catch (C12731 e) {
            if ((this instanceof C14028) && "ZIP_INVALID_CURSOR".equals(e.f42472)) {
                throw e.m31632(JSON.array().add(C11320.m28376(new JSONObject(jSONObject).put("cursor", "").put(MotionUtils.EASING_TYPE_PATH, e.f42468.getString(MotionUtils.EASING_TYPE_PATH)), "mt_zip_list", "retry", "Discard earlier pages and restart the ZIP listing.")));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m15346(boolean z) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Absolute or Home-relative ZIP file path; split archives are not supported."));
        if (z) {
            jSONObjectAdd.add("password", C4969.m13786("string", "Password for the selected entry; pass an empty string if that entry is unencrypted, even when other entries are encrypted."));
        }
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static JSONObject m15345() {
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute archive path.")).add("entryPath", C4969.m13786("string", "Exact case-sensitive path inside the ZIP."));
    }
}
