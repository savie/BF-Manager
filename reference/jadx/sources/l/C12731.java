package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.۫᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z79J */
/* JADX INFO: loaded from: classes3.dex */
public final class C12731 extends Exception {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final JSONObject f42468;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f42469;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f42470;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final JSONArray f42471;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f42472;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f42473;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final JSONValue f42474;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f42475;

    public C12731(String str, boolean z, String str2, boolean z2, boolean z3, String str3, JSONArray jSONArray, JSONObject jSONObject, JSONValue jSONValue) {
        super(str);
        this.f42473 = z;
        this.f42472 = str2;
        this.f42469 = z2;
        this.f42470 = z3;
        this.f42475 = str3;
        this.f42471 = jSONArray == null ? JSON.array() : jSONArray;
        this.f42468 = jSONObject == null ? JSON.object() : jSONObject;
        this.f42474 = jSONValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m31626(String str, String str2, JSONValue jSONValue, JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObjectAdd = JSON.object().add("argument", str2).add("badValue", jSONValue == null ? JSON.NULL : jSONValue);
        if (jSONArray == null) {
            jSONArray = JSON.array();
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("allowedValues", jSONArray);
        if (jSONObject == null) {
            jSONObject = JSON.object();
        }
        return new C12731(str, true, "INVALID_ARGUMENT", true, false, "warning", null, jSONObjectAdd2.add("example", jSONObject), jSONValue);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12731 m31632(JSONArray jSONArray) {
        return new C12731(getMessage(), this.f42473, this.f42472, this.f42469, this.f42470, this.f42475, jSONArray, this.f42468, this.f42474);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m31630(String str, String str2) {
        return m31628(str, str2, false, false, m31622(str), null, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m31629(JSONArray jSONArray, String str, String str2, String str3) {
        return m31628(str, str2, false, false, str3, jSONArray, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m31631(String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return m31628(str, str2, false, false, str3, jSONArray, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m31625(String str, String str2) {
        return m31628(str, str2, true, false, m31622(str), null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m31623(JSONArray jSONArray, String str, String str2, String str3) {
        return m31628(str, str2, true, false, str3, jSONArray, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m31627(String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return m31628(str, str2, true, false, str3, jSONArray, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m31624(JSONObject jSONObject) {
        return m31628("FILE_SEARCH_CANCELED", "Text search canceled. Retry the same arguments after cancellation has cleared.", true, true, "warning", null, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m31628(String str, String str2, boolean z, boolean z2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return new C12731(str2, false, str, z, z2, str3, jSONArray, jSONObject, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31622(String str) {
        return ("PATH_NOT_FOUND".equals(str) || "APK_CHANGED".equals(str) || "ENTRY_READ_FAILED".equals(str) || "AXML_DECODE_FAILED".equals(str) || "DEX_READ_FAILED".equals(str) || "SMALI_READ_FAILED".equals(str) || "RESOURCE_TABLE_PARSE_FAILED".equals(str)) ? "warning" : "fatal";
    }
}
