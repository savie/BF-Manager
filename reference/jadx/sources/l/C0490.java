package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֡ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75H */
/* JADX INFO: loaded from: classes2.dex */
public final class C0490 implements InterfaceC7546 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f2169;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f2170;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f2171;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f2172;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f2173;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f2174;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f2175;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f2176;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f2177;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f2178;

    public C0490(JSONObject jSONObject) {
        this.f2178 = jSONObject.getString("name", "");
        this.f2175 = jSONObject.getString("demangledName", "");
        this.f2173 = jSONObject.getString("library", "");
        this.f2171 = C1383.m4844(jSONObject, "type", 0L);
        this.f2169 = C1383.m4844(jSONObject, "numericType", 0L);
        this.f2174 = C1383.m4844(jSONObject, "vaddr", 0L);
        this.f2176 = C1383.m4844(jSONObject, "paddr", 0L);
        this.f2172 = C1383.m4844(jSONObject, "addend", 0L);
        this.f2177 = jSONObject.getBoolean("additive", false);
        this.f2170 = jSONObject.getBoolean("ifunc", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0490 m2366(JSONObject jSONObject) {
        return new C0490(jSONObject);
    }
}
