package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۙ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4911 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f17229;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f17230;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f17231;

    public C4911(JSONObject jSONObject) {
        this.f17229 = C1383.m4844(jSONObject, "fromVirtualAddress", -1L);
        this.f17230 = C1383.m4844(jSONObject, "toVirtualAddress", -1L);
        this.f17231 = jSONObject.getString("kind", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4911 m13669(JSONObject jSONObject) {
        return new C4911(jSONObject);
    }
}
