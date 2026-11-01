package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۗܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes2.dex */
public final class C3312 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f12233;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f12234;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f12235;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f12236;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f12237;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f12238;

    public C3312(JSONObject jSONObject) {
        this.f12235 = C1383.m4844(jSONObject, "startVirtualAddress", -1L);
        this.f12233 = C1383.m4844(jSONObject, "startPhysicalAddress", -1L);
        this.f12236 = C1383.m4844(jSONObject, "size", 0L);
        this.f12237 = jSONObject.getInt("instructionCount", 0);
        this.f12238 = jSONObject.getString("terminator", "");
        this.f12234 = jSONObject.getString("assemblyText", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3312 m9815(JSONObject jSONObject) {
        return new C3312(jSONObject);
    }
}
