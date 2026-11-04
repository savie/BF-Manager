package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.CRC32;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܳۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5UU */
/* JADX INFO: loaded from: classes5.dex */
public final class C15300 implements InterfaceC22760 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ExecutorService f50011;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized Executor m36732() {
        if (f50011 == null) {
            String str = C7116.f23455;
            f50011 = Executors.newSingleThreadExecutor(new ThreadFactoryC2641("ExoPlayer:BackgroundExecutor"));
        }
        return f50011;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36731(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public void mo1200(C19929 c19929) {
        C14270 c14270 = new C14270();
        CRC32 crc32 = new CRC32();
        crc32.update((byte[]) ((C14270) c19929.m45858()).m34634());
        c14270.m34619(crc32.getValue());
        c19929.m45857(c14270);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36729(C10186 c10186) {
        return m36730(c10186, JSON.NULL, c10186.f32599);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m36733(String str) {
        return m36731(str).trim();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36728(JSONObject jSONObject, JSONArray jSONArray) {
        return JSON.object().add("ok", true).add(e.m, jSONObject).add(d.O, JSON.NULL).add("nextActions", C12556.m31234(jSONArray));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36730(C10186 c10186, JSONValue jSONValue, JSONArray jSONArray) {
        String str;
        JSONObject jSONObjectAdd = JSON.object().add("code", c10186.f32601).add("message", c10186.getMessage()).add("severity", c10186.f32604).add("recoverable", c10186.f32600).add("retrySameArguments", c10186.f32598);
        JSONObject jSONObject = c10186.f32602;
        JSONObject jSONObjectM21874 = C8008.m21874(jSONObject, "badValue", C8008.m21874(jSONObject, "argument", jSONObjectAdd, "argument"), "badValue");
        JSONValue jSONValue2 = c10186.f32603;
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
        JSONObject jSONObjectAdd2 = jSONObjectM21874.add("badValueType", str);
        JSONArray jSONArray2 = jSONObject.getJSONArray("allowedValues");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray2 != null) {
            Iterator it = jSONArray2.iterator();
            while (it.hasNext()) {
                String strM31237 = C12556.m31237((JSONValue) it.next());
                if (strM31237 == null) {
                    strM31237 = "null";
                }
                jSONArrayArray.add(strM31237);
            }
        }
        JSONObject jSONObjectM21875 = C8008.m21874(jSONObject, "example", jSONObjectAdd2.add("allowedValues", jSONArrayArray), "example");
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return JSON.object().add("ok", false).add(e.m, JSON.NULL).add(d.O, jSONObjectM21875.add("diagnostics", jSONValue)).add("nextActions", C12556.m31234(jSONArray));
    }
}
