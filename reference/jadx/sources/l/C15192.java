package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܳ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75H */
/* JADX INFO: loaded from: classes5.dex */
public final class C15192 implements InterfaceC21906 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f49594;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f49595;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f49596;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f49597;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f49598;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f49599;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f49600;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f49601;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f49602;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f49603;

    public C15192(JSONObject jSONObject) {
        this.f49600 = jSONObject.getString("name", "");
        this.f49597 = jSONObject.getString("demangledName", "");
        this.f49601 = jSONObject.getString("library", "");
        this.f49594 = C21160.m48263(jSONObject, "type", 0L);
        this.f49599 = C21160.m48263(jSONObject, "numericType", 0L);
        this.f49598 = C21160.m48263(jSONObject, "vaddr", 0L);
        this.f49596 = C21160.m48263(jSONObject, "paddr", 0L);
        this.f49595 = C21160.m48263(jSONObject, "addend", 0L);
        this.f49602 = jSONObject.getBoolean("additive", false);
        this.f49603 = jSONObject.getBoolean("ifunc", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15192 m36542(JSONObject jSONObject) {
        return new C15192(jSONObject);
    }
}
