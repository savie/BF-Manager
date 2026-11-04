package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۖܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E79W */
/* JADX INFO: loaded from: classes2.dex */
public final class C2729 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9066(C1238 c1238) {
        return m9065(c1238.f4488, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9063(JSONObject jSONObject) {
        return m9065(jSONObject, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9064(JSONObject jSONObject, String str, String str2, String str3) {
        return C22121.m50076("tool", str, "purpose", str2).add("description", str3).add("arguments", jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9065(JSONObject jSONObject, boolean z) {
        return JSON.object().add("content", JSON.array().add(JSON.object().add("type", TextBundle.TEXT_ENTRY).add(TextBundle.TEXT_ENTRY, jSONObject.toString()))).add("structuredContent", jSONObject).add("isError", z);
    }
}
