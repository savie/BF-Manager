package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes.dex */
public final class C23723 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f76911;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17755 f76912;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final JSONArray f76913 = JSON.array();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f76914;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f76915;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f76916;

    public C23723(String str) {
        this.f76914 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52994(JSONArray jSONArray) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            JSONArray jSONArray2 = this.f76913;
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
    public final void m52995(C10186 c10186) {
        JSONObject jSONObject = c10186.f32602;
        JSONValue jSONValue = jSONObject.get("createdDirectories");
        int iAsInt = this.f76915 + ((jSONValue == null || !jSONValue.isNumber()) ? 0 : jSONValue.asInt());
        JSONValue jSONValue2 = jSONObject.get("warnings");
        if (jSONValue2 != null && jSONValue2.isArray()) {
            m52994(jSONValue2.asArray());
        }
        JSONValue jSONValue3 = jSONObject.get("changed");
        JSONValue jSONValue4 = jSONObject.get("stateKnown");
        jSONObject.put(MotionUtils.EASING_TYPE_PATH, this.f76914).put("completedFiles", this.f76911).put("createdDirectories", iAsInt).put("changed", this.f76911 > 0 || iAsInt > 0 || (jSONValue3 != null && jSONValue3.isBoolean() && jSONValue3.asBoolean())).put("stateKnown", jSONValue4 == null || !jSONValue4.isBoolean() || jSONValue4.asBoolean()).put("operationMode", "non_atomic").put("warnings", new JSONArray(this.f76913));
        if (jSONObject.get("entryPaths") == null) {
            C17755 c17755 = this.f76912;
            jSONObject.put("entryPaths", c17755 == null ? JSON.array() : JSON.array(c17755.f58313));
        }
        if (jSONObject.get("operationIndexes") == null) {
            C17755 c17756 = this.f76912;
            jSONObject.put("operationIndexes", c17756 == null ? JSON.array() : JSON.array(c17756.f58311));
        }
        if (jSONObject.get("destinationPath") == null) {
            C17755 c17757 = this.f76912;
            jSONObject.put("destinationPath", c17757 == null ? JSON.NULL : JSON.value(c17757.f58309));
        }
    }
}
