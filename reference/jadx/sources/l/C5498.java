package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.ۚ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274X */
/* JADX INFO: loaded from: classes3.dex */
public final class C5498 implements InterfaceC21906 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f19118;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f19119;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f19120;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f19121;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f19122;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f19123;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f19124;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f19125;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f19126;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f19127;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f19128;

    public C5498(JSONObject jSONObject) {
        this.f19127 = jSONObject.getString("name", "");
        this.f19118 = jSONObject.getString("type", "");
        this.f19119 = jSONObject.getString("arch", "");
        this.f19122 = C21160.m48263(jSONObject, "vaddr", 0L);
        this.f19124 = C21160.m48263(jSONObject, "paddr", 0L);
        this.f19120 = C21160.m48263(jSONObject, "size", 0L);
        this.f19128 = C21160.m48263(jSONObject, "virtualSize", 0L);
        this.f19125 = C21160.m48263(jSONObject, "permissions", 0L);
        this.f19121 = C21160.m48263(jSONObject, "flags", 0L);
        this.f19126 = jSONObject.getBoolean(e.m, false);
        this.f19123 = jSONObject.getBoolean("segment", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5498 m16325(JSONObject jSONObject) {
        return new C5498(jSONObject);
    }
}
