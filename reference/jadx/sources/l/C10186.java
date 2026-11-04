package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۢܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z79J */
/* JADX INFO: loaded from: classes3.dex */
public final class C10186 extends Exception {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f32597;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f32598;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final JSONArray f32599;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f32600;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f32601;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final JSONObject f32602;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final JSONValue f32603;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f32604;

    public C10186(String str, boolean z, String str2, boolean z2, boolean z3, String str3, JSONArray jSONArray, JSONObject jSONObject, JSONValue jSONValue) {
        super(str);
        this.f32597 = z;
        this.f32601 = str2;
        this.f32600 = z2;
        this.f32598 = z3;
        this.f32604 = str3;
        this.f32599 = jSONArray == null ? JSON.array() : jSONArray;
        this.f32602 = jSONObject == null ? JSON.object() : jSONObject;
        this.f32603 = jSONValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m26301(String str, String str2, JSONValue jSONValue, JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObjectAdd = JSON.object().add("argument", str2).add("badValue", jSONValue == null ? JSON.NULL : jSONValue);
        if (jSONArray == null) {
            jSONArray = JSON.array();
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("allowedValues", jSONArray);
        if (jSONObject == null) {
            jSONObject = JSON.object();
        }
        return new C10186(str, true, "INVALID_ARGUMENT", true, false, "warning", null, jSONObjectAdd2.add("example", jSONObject), jSONValue);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10186 m26307(JSONArray jSONArray) {
        return new C10186(getMessage(), this.f32597, this.f32601, this.f32600, this.f32598, this.f32604, jSONArray, this.f32602, this.f32603);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m26305(String str, String str2) {
        return m26303(str, str2, false, false, m26297(str), null, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m26304(JSONArray jSONArray, String str, String str2, String str3) {
        return m26303(str, str2, false, false, str3, jSONArray, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m26306(String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return m26303(str, str2, false, false, str3, jSONArray, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m26300(String str, String str2) {
        return m26303(str, str2, true, false, m26297(str), null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m26298(JSONArray jSONArray, String str, String str2, String str3) {
        return m26303(str, str2, true, false, str3, jSONArray, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m26302(String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return m26303(str, str2, true, false, str3, jSONArray, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m26299(JSONObject jSONObject) {
        return m26303("FILE_SEARCH_CANCELED", "Text search canceled. Retry the same arguments after cancellation has cleared.", true, true, "warning", null, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m26303(String str, String str2, boolean z, boolean z2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return new C10186(str2, false, str, z, z2, str3, jSONArray, jSONObject, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26297(String str) {
        return ("PATH_NOT_FOUND".equals(str) || "APK_CHANGED".equals(str) || "ENTRY_READ_FAILED".equals(str) || "AXML_DECODE_FAILED".equals(str) || "DEX_READ_FAILED".equals(str) || "SMALI_READ_FAILED".equals(str) || "RESOURCE_TABLE_PARSE_FAILED".equals(str)) ? "warning" : "fatal";
    }
}
