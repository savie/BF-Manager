package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6M7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12821 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31786(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11071. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C23526 m31789(bin.mt.json.JSONObject r37) {
        /*
            Method dump skipped, instruction units count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12821.m31789(bin.mt.json.JSONObject):l.᩹ۨۚ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m31787(JSONObject jSONObject, String str, String str2) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isArray() || jSONValue.asArray().size() == 0) {
            throw m31788(jSONValue, "Expected a non-empty array", str2);
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m31791(JSONObject jSONObject, String str, String str2) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString() || jSONValue.asString().trim().isEmpty()) {
            throw m31788(jSONValue, "Expected a non-empty string", str2);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31790(JSONObject jSONObject, String str, String... strArr) throws C10186 {
        List listAsList = Arrays.asList(strArr);
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2)) {
                throw m31788(jSONObject.get(str2), "Invalid mt_apk_resource_add argument", str.isEmpty() ? str2 : C20196.m46451(str, ".", str2));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m31788(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), (JSONObject) null);
    }
}
