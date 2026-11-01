package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۧ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E79W */
/* JADX INFO: loaded from: classes3.dex */
public final class C11320 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m28378(C17669 c17669) {
        return m28377(c17669.f56138, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m28375(JSONObject jSONObject) {
        return m28377(jSONObject, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m28376(JSONObject jSONObject, String str, String str2, String str3) {
        return C3184.m9603("tool", str, "purpose", str2).add("description", str3).add("arguments", jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m28377(JSONObject jSONObject, boolean z) {
        return JSON.object().add("content", JSON.array().add(JSON.object().add("type", TextBundle.TEXT_ENTRY).add(TextBundle.TEXT_ENTRY, jSONObject.toString()))).add("structuredContent", jSONObject).add("isError", z);
    }
}
