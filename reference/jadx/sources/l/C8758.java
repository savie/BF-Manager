package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۡ۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8758 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22721(JSONObject jSONObject, String... strArr) throws C12731 {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        HashSet hashSet2 = new HashSet();
        for (String str : jSONObject.names()) {
            if (!hashSet.contains(str) || !hashSet2.add(str)) {
                throw m22719(jSONObject.get(str), str, "Unexpected or repeated argument");
            }
        }
        for (String str2 : strArr) {
            if (!hashSet2.contains(str2)) {
                throw m22719((JSONValue) null, str2, "Missing argument");
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m22723(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m22719(jSONValue, str, "Expected a string");
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m22724(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m22719(jSONValue, str, "Expected a boolean");
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22714(JSONObject jSONObject, String str, int i, int i2) throws C12731 {
        int iM26321;
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue != null) {
            try {
                if (jSONValue.isNumber() && (iM26321 = C10413.m26321(jSONValue)) >= i && iM26321 <= i2) {
                    return iM26321;
                }
            } catch (ArithmeticException | NumberFormatException unused) {
            }
        }
        throw m22719(jSONValue, str, "Integer is outside the allowed range");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m22715(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isArray() || jSONValue.asArray().isEmpty()) {
            throw m22719(jSONValue, str, "Expected a non-empty array");
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m22716(String str, JSONValue jSONValue) throws C12731 {
        if (jSONValue == null || !jSONValue.isObject()) {
            throw m22719(jSONValue, str, "Expected an object");
        }
        return jSONValue.asObject();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22722(String str, String str2, boolean z) throws C12731 {
        if (str.isEmpty()) {
            if (!z) {
                throw m22719(JSON.value(str), str2, "The ZIP root cannot be modified");
            }
            return;
        }
        if (str.indexOf(92) < 0) {
            if (str.indexOf(0) < 0) {
                int i = str.charAt(0) == '/' ? 1 : 0;
                int i2 = i;
                while (i <= str.length()) {
                    if (i >= str.length() || str.charAt(i) == '/') {
                        if (i == str.length() && i2 == i) {
                            return;
                        }
                        if (str.substring(i2, i).isEmpty()) {
                            throw m22719(JSON.value(str), str2, "ZIP path contains an empty segment");
                        }
                        i2 = i + 1;
                    }
                    i++;
                }
                return;
            }
        }
        throw m22719(JSON.value(str), str2, "Expected a ZIP entry name using forward slashes without NUL");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5928 m22717(C2800 c2800, String str, boolean z) throws C12731 {
        C5928 c5928M8503 = c2800.m8503(str);
        EnumC12279 enumC12279M16196 = c5928M8503.m16196();
        if (enumC12279M16196 == EnumC12279.MISSING) {
            throw m22718(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "FILE_NOT_FOUND", "The source path does not exist");
        }
        if (enumC12279M16196 == EnumC12279.LINK || enumC12279M16196 == EnumC12279.OTHER) {
            throw C12731.m31631("FILE_UNSUPPORTED_TYPE", "Links and special nodes cannot be used as ZIP content sources", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (enumC12279M16196 == (z ? EnumC12279.DIRECTORY : EnumC12279.REGULAR)) {
            return c5928M8503;
        }
        throw m22718(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_PATH_TYPE_MISMATCH", "The path suffix does not match the source type");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m22719(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str2, str, jSONValue, JSON.array(), (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m22718(JSONObject jSONObject, String str, String str2) {
        return C12731.m31627(str, str2, "warning", (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22720() throws C12731 {
        if (Thread.currentThread().isInterrupted()) {
            throw m22718(JSON.object(), "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
        }
    }
}
