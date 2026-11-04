package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۗ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes2.dex */
public final class C3260 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f10594;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f10595;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f10596;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f10597;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f10598;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f10599;

    public C3260(JSONObject jSONObject) {
        this.f10597 = C21160.m48263(jSONObject, "startVirtualAddress", -1L);
        this.f10599 = C21160.m48263(jSONObject, "startPhysicalAddress", -1L);
        this.f10595 = C21160.m48263(jSONObject, "size", 0L);
        this.f10598 = jSONObject.getInt("instructionCount", 0);
        this.f10596 = jSONObject.getString("terminator", "");
        this.f10594 = jSONObject.getString("assemblyText", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3260 m10646(JSONObject jSONObject) {
        return new C3260(jSONObject);
    }
}
