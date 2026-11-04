package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.۬֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K75F */
/* JADX INFO: loaded from: classes4.dex */
public final class C13482 implements InterfaceC21906 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f42889;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f42890;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f42891;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f42892;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f42893;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f42894;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f42895;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f42896;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f42897;

    public C13482(JSONObject jSONObject) {
        this.f42893 = jSONObject.getString("name", "");
        this.f42892 = jSONObject.getString("demangledName", "");
        this.f42894 = jSONObject.getString("library", "");
        this.f42890 = jSONObject.getString("bind", "");
        this.f42889 = jSONObject.getString("type", "");
        this.f42896 = jSONObject.getString("className", "");
        this.f42897 = jSONObject.getString("descriptor", "");
        this.f42891 = C21160.m48263(jSONObject, "ordinal", 0L);
        this.f42895 = jSONObject.getBoolean("inSectionHeader", false);
        jSONObject.getBoolean("imported", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13482 m33161(JSONObject jSONObject) {
        return new C13482(jSONObject);
    }
}
