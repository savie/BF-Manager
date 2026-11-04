package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۟ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8060 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21954(JSONObject jSONObject, String... strArr) {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        HashSet hashSet2 = new HashSet();
        for (String str : jSONObject.names()) {
            if (!hashSet.contains(str) || !hashSet2.add(str)) {
                throw m21952(jSONObject.get(str), str, "Unexpected or repeated argument");
            }
        }
        for (String str2 : strArr) {
            if (!hashSet2.contains(str2)) {
                throw m21952((JSONValue) null, str2, "Missing argument");
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m21956(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m21952(jSONValue, str, "Expected a string");
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m21957(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m21952(jSONValue, str, "Expected a boolean");
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21947(JSONObject jSONObject, String str, int i, int i2) {
        int iM31240;
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue != null) {
            try {
                if (jSONValue.isNumber() && (iM31240 = C12556.m31240(jSONValue)) >= i && iM31240 <= i2) {
                    return iM31240;
                }
            } catch (ArithmeticException | NumberFormatException unused) {
            }
        }
        throw m21952(jSONValue, str, "Integer is outside the allowed range");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m21948(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isArray() || jSONValue.asArray().isEmpty()) {
            throw m21952(jSONValue, str, "Expected a non-empty array");
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21949(String str, JSONValue jSONValue) throws C10186 {
        if (jSONValue == null || !jSONValue.isObject()) {
            throw m21952(jSONValue, str, "Expected an object");
        }
        return jSONValue.asObject();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21955(String str, String str2, boolean z) {
        if (str.isEmpty()) {
            if (!z) {
                throw m21952(JSON.value(str), str2, "The ZIP root cannot be modified");
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
                            throw m21952(JSON.value(str), str2, "ZIP path contains an empty segment");
                        }
                        i2 = i + 1;
                    }
                    i++;
                }
                return;
            }
        }
        throw m21952(JSON.value(str), str2, "Expected a ZIP entry name using forward slashes without NUL");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1907 m21950(C22209 c22209, String str, boolean z) throws C10186 {
        c22209.m50230(c22209.m50232(str));
        C1907 c1907M50234 = c22209.m50234(str);
        EnumC13093 enumC13093M6567 = c1907M50234.m6567();
        if (enumC13093M6567 == EnumC13093.MISSING) {
            throw m21951(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "FILE_NOT_FOUND", "The source path does not exist");
        }
        if (enumC13093M6567 == EnumC13093.LINK || enumC13093M6567 == EnumC13093.OTHER) {
            throw C10186.m26306("FILE_UNSUPPORTED_TYPE", "Links and special nodes cannot be used as ZIP content sources", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (enumC13093M6567 == (z ? EnumC13093.DIRECTORY : EnumC13093.REGULAR)) {
            return c1907M50234;
        }
        throw m21951(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_PATH_TYPE_MISMATCH", "The path suffix does not match the source type");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m21952(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str2, str, jSONValue, JSON.array(), (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m21951(JSONObject jSONObject, String str, String str2) {
        return C10186.m26302(str, str2, "warning", (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21953() {
        if (Thread.currentThread().isInterrupted()) {
            throw m21951(JSON.object(), "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
        }
    }
}
