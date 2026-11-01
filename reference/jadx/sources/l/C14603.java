package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܳܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D75Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C14603 implements InterfaceC7546 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f47785;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f47786;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f47787;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f47788;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f47789;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f47790;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f47791;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f47792;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f47793;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f47794;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f47795;

    public C14603(JSONObject jSONObject) {
        this.f47785 = jSONObject.getString("name", "");
        this.f47786 = jSONObject.getString("demangledName", "");
        this.f47791 = jSONObject.getString("className", "");
        this.f47794 = jSONObject.getString("library", "");
        this.f47788 = jSONObject.getString("bind", "");
        this.f47790 = jSONObject.getString("type", "");
        this.f47789 = jSONObject.getBoolean("imported", false);
        this.f47795 = C1383.m4844(jSONObject, "vaddr", 0L);
        this.f47792 = C1383.m4844(jSONObject, "paddr", 0L);
        this.f47787 = C1383.m4844(jSONObject, "size", 0L);
        this.f47793 = jSONObject.getInt("bits", 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14603 m35075(JSONObject jSONObject) {
        return new C14603(jSONObject);
    }
}
