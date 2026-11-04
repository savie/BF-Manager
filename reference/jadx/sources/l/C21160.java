package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.᩶۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I764 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21160 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m48264(String str) {
        try {
            return JSON.parse(str).asObject();
        } catch (RuntimeException e) {
            throw new C15938("Unable to parse radare2 native response", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m48263(JSONObject jSONObject, String str, long j) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            return j;
        }
        if (!jSONValue.isNumber()) {
            return jSONValue.asLong();
        }
        String string = jSONValue.toString();
        try {
            return Long.parseLong(string, 10);
        } catch (NumberFormatException e) {
            try {
                return C8947.m23916(string);
            } catch (NumberFormatException unused) {
                throw e;
            }
        }
    }
}
