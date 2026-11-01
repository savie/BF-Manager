package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.۫ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274X */
/* JADX INFO: loaded from: classes4.dex */
public final class C12486 implements InterfaceC7546 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f41649;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f41650;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f41651;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f41652;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f41653;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f41654;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f41655;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f41656;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f41657;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f41658;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f41659;

    public C12486(JSONObject jSONObject) {
        this.f41650 = jSONObject.getString("name", "");
        this.f41651 = jSONObject.getString("type", "");
        this.f41652 = jSONObject.getString("arch", "");
        this.f41654 = C1383.m4844(jSONObject, "vaddr", 0L);
        this.f41658 = C1383.m4844(jSONObject, "paddr", 0L);
        this.f41656 = C1383.m4844(jSONObject, "size", 0L);
        this.f41659 = C1383.m4844(jSONObject, "virtualSize", 0L);
        this.f41653 = C1383.m4844(jSONObject, "permissions", 0L);
        this.f41655 = C1383.m4844(jSONObject, "flags", 0L);
        this.f41657 = jSONObject.getBoolean(e.m, false);
        this.f41649 = jSONObject.getBoolean("segment", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12486 m31030(JSONObject jSONObject) {
        return new C12486(jSONObject);
    }
}
