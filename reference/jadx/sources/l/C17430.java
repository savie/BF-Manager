package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܽ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D75Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C17430 implements InterfaceC21906 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f56685;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f56686;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f56687;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f56688;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f56689;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f56690;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f56691;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f56692;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f56693;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f56694;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f56695;

    public C17430(JSONObject jSONObject) {
        this.f56690 = jSONObject.getString("name", "");
        this.f56694 = jSONObject.getString("demangledName", "");
        this.f56688 = jSONObject.getString("className", "");
        this.f56691 = jSONObject.getString("library", "");
        this.f56686 = jSONObject.getString("bind", "");
        this.f56689 = jSONObject.getString("type", "");
        this.f56692 = jSONObject.getBoolean("imported", false);
        this.f56695 = C21160.m48263(jSONObject, "vaddr", 0L);
        this.f56687 = C21160.m48263(jSONObject, "paddr", 0L);
        this.f56685 = C21160.m48263(jSONObject, "size", 0L);
        this.f56693 = jSONObject.getInt("bits", 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17430 m40932(JSONObject jSONObject) {
        return new C17430(jSONObject);
    }
}
