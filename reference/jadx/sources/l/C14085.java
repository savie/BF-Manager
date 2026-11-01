package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܰ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes3.dex */
public final class C14085 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f46250;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f46251;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f46252;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f46253;

    public C14085(JSONObject jSONObject) {
        this.f46252 = C1383.m4844(jSONObject, "sourceVirtualAddress", -1L);
        this.f46251 = jSONObject.getString("flowKind", "");
        this.f46250 = C1383.m4844(jSONObject, "targetVirtualAddress", -1L);
        this.f46253 = jSONObject.getString("reason", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14085 m34075(JSONObject jSONObject) {
        return new C14085(jSONObject);
    }
}
