package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 577G */
/* JADX INFO: loaded from: classes4.dex */
public final class C14815 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m35667() {
        return C10932.m27731(JSON.object(), "No tool-specific diagnostics.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m35666(JSONArray jSONArray) {
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                JSONValue jSONValue = jSONObjectAsObject.get("line");
                JSONValue jSONValue2 = jSONObjectAsObject.get("column");
                jSONArrayArray.add(JSON.object().add("locator", m35668(jSONObjectAsObject)).add("className", jSONObjectAsObject.getString("className", null)).add("errorCode", jSONObjectAsObject.getString("errorCode", null)).add("message", jSONObjectAsObject.getString("message", null)).add("line", (jSONValue == null || jSONValue.isNull()) ? JSON.NULL : JSON.value(jSONObjectAsObject.getInt("line", -1))).add("column", (jSONValue2 == null || jSONValue2.isNull()) ? JSON.NULL : JSON.value(jSONObjectAsObject.getInt("column", -1))));
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m35668(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue != null && !jSONValue.isNull()) {
            return C12556.m31239(jSONValue);
        }
        return C4375.m13967(jSONObject.getString("targetType", null), jSONObject.getString("target", null));
    }
}
