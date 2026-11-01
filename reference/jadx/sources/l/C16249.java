package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.u0.b;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.ܺ᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M6Y4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16249 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m38376(JSONObject jSONObject, String str, long j, long j2) throws C12731 {
        if (j < 0 || j2 > 9007199254740991L || j > j2) {
            throw new IllegalArgumentException("Invalid safe integer range");
        }
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isNumber()) {
            throw m38378(str, jSONValue, j, j2);
        }
        try {
            long jLongValueExact = new BigDecimal(jSONValue.toString()).longValueExact();
            if (jLongValueExact < j || jLongValueExact > j2) {
                throw m38378(str, jSONValue, j, j2);
            }
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m38378(str, jSONValue, j, j2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m38377(String str, long j, long j2) throws C12731 {
        if (j < 0 || j2 < 0 || j > 9007199254740991L - j2) {
            throw C12731.m31627("FILE_OFFSET_OUT_OF_RANGE", "Byte offset exceeds the supported JSON integer range.", "warning", (JSONArray) null, JSON.object().add("argument", str).add(b.d, j).add("increment", j2).add("maximum", 9007199254740991L));
        }
        return j + j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m38378(String str, JSONValue jSONValue, long j, long j2) {
        return C12731.m31626("Invalid integer argument", str, jSONValue, JSON.array().add(j + ".." + j2), JSON.object().add(str, j));
    }
}
