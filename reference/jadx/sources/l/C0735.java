package l;

import android.content.pm.Signature;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֡᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V6WN */
/* JADX INFO: loaded from: classes2.dex */
public final class C0735 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3198(int i) {
        if (65 <= i && i <= 90) {
            return true;
        }
        if (97 <= i && i <= 122) {
            return true;
        }
        if ((48 <= i && i <= 57) || i == 36 || i == 45 || i == 95) {
            return true;
        }
        if (161 <= i && i <= 8191) {
            return true;
        }
        if (8208 <= i && i <= 8231) {
            return true;
        }
        if (8240 <= i && i <= 55295) {
            return true;
        }
        if (57344 <= i && i < 65279) {
            return true;
        }
        if (65279 >= i || i > 65519) {
            return 65536 <= i && i <= 1114111;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m3199(int i) {
        switch (i) {
            case 1:
                return d.O;
            case 2:
                return ClassTransform.INTEGER;
            case 3:
                return ClassTransform.FLOAT;
            case 4:
                return "string";
            case 5:
                return "iso8601";
            case 6:
                return "true";
            case 7:
                return "false";
            case 8:
                return "null";
            case 9:
                return "new";
            case 10:
                return MotionUtils.EASING_TYPE_FORMAT_START;
            case 11:
                return MotionUtils.EASING_TYPE_FORMAT_END;
            case 12:
                return "{";
            case 13:
                return l.d;
            case 14:
                return "[";
            case 15:
                return "]";
            case 16:
                return ",";
            case 17:
                return ":";
            case 18:
                return "ident";
            case 19:
            default:
                return "Unknown";
            case 20:
                return "EOF";
            case 21:
                return "Set";
            case 22:
                return "TreeSet";
            case 23:
                return "undefined";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3191(int i, String str) {
        int length = str.length();
        if (i >= length) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        char cCharAt = "E".charAt(0);
        int i2 = length - 1;
        while (i <= i2) {
            if (!m3197(str.charAt(i), cCharAt)) {
                do {
                    i++;
                    if (i > i2) {
                        break;
                    }
                } while (!m3197(str.charAt(i), cCharAt));
            }
            if (i <= i2) {
                int i3 = i + 1;
                int i4 = i + 1;
                for (int i5 = 1; i3 < i4 && m3197(str.charAt(i3), "E".charAt(i5)); i5++) {
                    i3++;
                }
                if (i3 == i4) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Signature m3192(String str) {
        try {
            C2455 c2455 = new C2455(str);
            try {
                for (C12107 c12107 : c2455.m7466()) {
                    String name = c12107.getName();
                    if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                        Signature signature = new Signature(new C2811(c2455.m7475(c12107, (C8516) null)).m8548()[0].getEncoded());
                        c2455.close();
                        return signature;
                    }
                }
                c2455.close();
                return null;
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m3194(C12731 c12731) {
        return m3195(c12731, JSON.NULL, c12731.f42471);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m3193(JSONObject jSONObject, JSONArray jSONArray) {
        return JSON.object().add("ok", true).add(e.m, jSONObject).add(d.O, JSON.NULL).add("nextActions", C10413.m26313(jSONArray));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m3195(C12731 c12731, JSONValue jSONValue, JSONArray jSONArray) {
        String str;
        JSONObject jSONObjectAdd = JSON.object().add("code", c12731.f42472).add("message", c12731.getMessage()).add("severity", c12731.f42475).add("recoverable", c12731.f42469).add("retrySameArguments", c12731.f42470);
        JSONObject jSONObject = c12731.f42468;
        JSONObject jSONObjectM28557 = C11445.m28557(jSONObject, "badValue", C11445.m28557(jSONObject, "argument", jSONObjectAdd, "argument"), "badValue");
        JSONValue jSONValue2 = c12731.f42474;
        if (jSONValue2 == null) {
            str = null;
        } else if (jSONValue2.isNull()) {
            str = "null";
        } else if (jSONValue2.isString()) {
            str = "string";
        } else if (jSONValue2.isNumber()) {
            str = "number";
        } else if (jSONValue2.isBoolean()) {
            str = ClassTransform.BOOLEAN;
        } else if (jSONValue2.isArray()) {
            str = "array";
        } else {
            str = jSONValue2.isObject() ? "object" : "unknown";
        }
        JSONObject jSONObjectAdd2 = jSONObjectM28557.add("badValueType", str);
        JSONArray jSONArray2 = jSONObject.getJSONArray("allowedValues");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray2 != null) {
            Iterator it = jSONArray2.iterator();
            while (it.hasNext()) {
                String strM26317 = C10413.m26317((JSONValue) it.next());
                if (strM26317 == null) {
                    strM26317 = "null";
                }
                jSONArrayArray.add(strM26317);
            }
        }
        JSONObject jSONObjectM28558 = C11445.m28557(jSONObject, "example", jSONObjectAdd2.add("allowedValues", jSONArrayArray), "example");
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return JSON.object().add("ok", false).add(e.m, JSON.NULL).add(d.O, jSONObjectM28558.add("diagnostics", jSONValue)).add("nextActions", C10413.m26313(jSONArray));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m3196(C23719 c23719) {
        JSONArray jSONArrayArray = JSON.array();
        JSONArray jSONArrayArray2 = JSON.array();
        ArrayList<C11019> arrayList = c23719.f76759;
        String str = c23719.f76757;
        String str2 = c23719.f76758;
        for (C11019 c11019 : arrayList) {
            String strConcat = "resource:".concat(c11019.f37463);
            JSONArray jSONArrayArray3 = JSON.array();
            for (C14547 c14547 : c11019.f37462) {
                jSONArrayArray3.add(JSON.object().add("variant", c14547.f47630).add("targetVersion", c14547.f47629));
                jSONArrayArray2.add(JSON.object().add("locator", strConcat).add("variant", c14547.f47630));
            }
            jSONArrayArray.add(JSON.object().add("index", c11019.f37461).add("locator", strConcat).add("values", jSONArrayArray3));
        }
        return m3193(C3184.m9603("workspaceId", str2, "editSessionId", str).add("results", jSONArrayArray), JSON.array().add(C11320.m28376(C3184.m9603("workspaceId", str2, "editSessionId", str).add("reads", jSONArrayArray2).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0), "mt_apk_resource_read", "inspect", "Read the newly added resource values")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3197(char c, char c2) {
        char upperCase;
        char upperCase2;
        if (c < 'a') {
            upperCase = c;
        } else {
            upperCase = c <= 'z' ? (char) (c - ' ') : Character.toUpperCase(c);
        }
        if (c2 < 'a') {
            upperCase2 = c2;
        } else {
            upperCase2 = c2 <= 'z' ? (char) (c2 - ' ') : Character.toUpperCase(c2);
        }
        return upperCase == upperCase2 || m3190(c) == m3190(c2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char m3190(char c) {
        if (c < 'A') {
            return c;
        }
        if (c < 'a' || c > 'z') {
            return c <= 'Z' ? (char) (c + ' ') : Character.toLowerCase(c);
        }
        return c;
    }
}
