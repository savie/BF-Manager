package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C755 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18129 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f57961;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f57962;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f57963;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21657 f57964;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f57965;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f57966;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f57967;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f57968;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f57969;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f57970;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f57971;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f57972;

    public C18129(JSONObject jSONObject) {
        this.f57969 = jSONObject.getBoolean("found", false);
        this.f57962 = jSONObject.getBoolean("inputVirtual", false);
        this.f57967 = C1383.m4844(jSONObject, "inputAddress", 0L);
        this.f57963 = jSONObject.getString("sectionName", "");
        this.f57970 = C1383.m4844(jSONObject, "virtualAddress", 0L);
        this.f57968 = C1383.m4844(jSONObject, "physicalAddress", 0L);
        this.f57961 = C1383.m4844(jSONObject, "offset", 0L);
        this.f57972 = C1383.m4844(jSONObject, "size", 0L);
        this.f57971 = jSONObject.getBoolean("isLoaded", false);
        this.f57965 = jSONObject.getBoolean("isExecutable", false);
        this.f57966 = jSONObject.getBoolean("segment", false);
        this.f57964 = C21657.m48366(jSONObject.getJSONObject("enclosingSymbol"));
    }

    public C18129(boolean z, boolean z2, long j, String str, long j2, long j3, long j4, long j5, boolean z3, boolean z4, boolean z5, C21657 c21657) {
        this.f57969 = z;
        this.f57962 = z2;
        this.f57967 = j;
        this.f57963 = str;
        this.f57970 = j2;
        this.f57968 = j3;
        this.f57961 = j4;
        this.f57972 = j5;
        this.f57971 = z3;
        this.f57965 = z4;
        this.f57966 = z5;
        this.f57964 = c21657;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18129 m42200(long j) {
        return m42202(false, false, j, "", 0L, 0L, 0L, 0L, false, false, false, C21657.m48365());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18129 m42202(boolean z, boolean z2, long j, String str, long j2, long j3, long j4, long j5, boolean z3, boolean z4, boolean z5, C21657 c21657) {
        return new C18129(z, z2, j, str, j2, j3, j4, j5, z4, z5, z3, c21657 != null ? c21657 : C21657.m48365());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18129 m42201(JSONObject jSONObject) {
        return new C18129(jSONObject);
    }
}
