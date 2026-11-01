package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۖ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes2.dex */
public final class C2794 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f10646;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f10647;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f10648;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f10649;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f10650;

    public C2794(JSONObject jSONObject) {
        this.f10646 = C1383.m4844(jSONObject, "sourceVirtualAddress", -1L);
        this.f10647 = jSONObject.getString("flowKind", "");
        boolean zContains = jSONObject.contains("targetVirtualAddress");
        this.f10650 = zContains;
        this.f10648 = zContains ? C1383.m4844(jSONObject, "targetVirtualAddress", -1L) : -1L;
        this.f10649 = jSONObject.getString("reason", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2794 m8494(JSONObject jSONObject) {
        return new C2794(jSONObject);
    }
}
