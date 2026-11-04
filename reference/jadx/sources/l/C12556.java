package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.math.BigDecimal;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66WC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12556 implements InterfaceC13530 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m31232(byte b) {
        return (byte) ((b & 255) >>> 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m31235(Iterable iterable) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m31234(JSONArray jSONArray) {
        return jSONArray == null ? JSON.array() : new JSONArray(jSONArray);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static JSONValue m31242(JSONValue jSONValue) {
        return (jSONValue == null || jSONValue.isNull()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m31240(JSONValue jSONValue) {
        return new BigDecimal(jSONValue.toString()).intValueExact();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m31236(JSONObject jSONObject) {
        if (jSONObject == null) {
            return JSON.NULL;
        }
        return JSON.object().add("hasMore", jSONObject.getBoolean("hasMore", false)).add("nextCursor", jSONObject.getString("nextCursor", null)).add("returnedCount", jSONObject.getInt("returnedCount", 0)).add("limitMax", jSONObject.getInt("limitMax", 0)).add("totalAvailableCount", m31242(jSONObject.get("totalAvailableCount")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31237(JSONValue jSONValue) {
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return jSONValue.isString() ? jSONValue.asString() : jSONValue.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static short m31241(int i, byte[] bArr) {
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static JSONValue m31239(JSONValue jSONValue) {
        if (jSONValue == null || jSONValue.isNull()) {
            return JSON.NULL;
        }
        if (jSONValue.isString()) {
            return JSON.value(jSONValue.asString());
        }
        if (jSONValue.isObject()) {
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            String string = jSONObjectAsObject.getString("kind", null);
            String string2 = jSONObjectAsObject.getString("target", null);
            if (string == null || string2 == null) {
                return JSON.NULL;
            }
            return JSON.value(string + ':' + string2);
        }
        return JSON.NULL;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m31238(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31233(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }
}
