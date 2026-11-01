package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۡܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K75F */
/* JADX INFO: loaded from: classes3.dex */
public final class C8958 implements InterfaceC7546 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f30688;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f30689;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f30690;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f30691;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f30692;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f30693;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f30694;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f30695;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f30696;

    public C8958(JSONObject jSONObject) {
        this.f30688 = jSONObject.getString("name", "");
        this.f30693 = jSONObject.getString("demangledName", "");
        this.f30696 = jSONObject.getString("library", "");
        this.f30691 = jSONObject.getString("bind", "");
        this.f30690 = jSONObject.getString("type", "");
        this.f30695 = jSONObject.getString("className", "");
        this.f30689 = jSONObject.getString("descriptor", "");
        this.f30694 = C1383.m4844(jSONObject, "ordinal", 0L);
        this.f30692 = jSONObject.getBoolean("inSectionHeader", false);
        jSONObject.getBoolean("imported", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8958 m23254(JSONObject jSONObject) {
        return new C8958(jSONObject);
    }
}
