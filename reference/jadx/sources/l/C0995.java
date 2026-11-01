package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0995 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f4648;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f4649;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f4650;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C5229 f4651;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f4652;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final JSONArray f4653 = JSON.array();

    public C0995(String str) {
        this.f4650 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3807(JSONArray jSONArray) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            JSONArray jSONArray2 = this.f4653;
            Iterator it2 = jSONArray2.iterator();
            do {
                if (!it2.hasNext()) {
                    jSONArray2.add(jSONValue);
                    break;
                }
            } while (!((JSONValue) it2.next()).equals(jSONValue));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3808(C12731 c12731) {
        JSONObject jSONObject = c12731.f42468;
        JSONValue jSONValue = jSONObject.get("createdDirectories");
        int iAsInt = this.f4652 + ((jSONValue == null || !jSONValue.isNumber()) ? 0 : jSONValue.asInt());
        JSONValue jSONValue2 = jSONObject.get("warnings");
        if (jSONValue2 != null && jSONValue2.isArray()) {
            m3807(jSONValue2.asArray());
        }
        JSONValue jSONValue3 = jSONObject.get("changed");
        JSONValue jSONValue4 = jSONObject.get("stateKnown");
        jSONObject.put(MotionUtils.EASING_TYPE_PATH, this.f4650).put("completedFiles", this.f4649).put("createdDirectories", iAsInt).put("changed", this.f4649 > 0 || iAsInt > 0 || (jSONValue3 != null && jSONValue3.isBoolean() && jSONValue3.asBoolean())).put("stateKnown", jSONValue4 == null || !jSONValue4.isBoolean() || jSONValue4.asBoolean()).put("operationMode", "non_atomic").put("warnings", new JSONArray(this.f4653));
        if (jSONObject.get("entryPaths") == null) {
            C5229 c5229 = this.f4651;
            jSONObject.put("entryPaths", c5229 == null ? JSON.array() : JSON.array(c5229.f18130));
        }
        if (jSONObject.get("operationIndexes") == null) {
            C5229 c52210 = this.f4651;
            jSONObject.put("operationIndexes", c52210 == null ? JSON.array() : JSON.array(c52210.f18132));
        }
        if (jSONObject.get("destinationPath") == null) {
            C5229 c52211 = this.f4651;
            jSONObject.put("destinationPath", c52211 == null ? JSON.NULL : JSON.value(c52211.f18131));
        }
    }
}
