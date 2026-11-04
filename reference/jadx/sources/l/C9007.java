package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۡ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C755 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9007 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f29342;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0804 f29343;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f29344;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f29345;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f29346;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f29347;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f29348;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f29349;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f29350;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f29351;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f29352;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f29353;

    public C9007(JSONObject jSONObject) {
        this.f29351 = jSONObject.getBoolean("found", false);
        this.f29352 = jSONObject.getBoolean("inputVirtual", false);
        this.f29345 = C21160.m48263(jSONObject, "inputAddress", 0L);
        this.f29342 = jSONObject.getString("sectionName", "");
        this.f29349 = C21160.m48263(jSONObject, "virtualAddress", 0L);
        this.f29344 = C21160.m48263(jSONObject, "physicalAddress", 0L);
        this.f29347 = C21160.m48263(jSONObject, "offset", 0L);
        this.f29353 = C21160.m48263(jSONObject, "size", 0L);
        this.f29348 = jSONObject.getBoolean("isLoaded", false);
        this.f29350 = jSONObject.getBoolean("isExecutable", false);
        this.f29346 = jSONObject.getBoolean("segment", false);
        this.f29343 = C0804.m3223(jSONObject.getJSONObject("enclosingSymbol"));
    }

    public C9007(boolean z, boolean z2, long j, String str, long j2, long j3, long j4, long j5, boolean z3, boolean z4, boolean z5, C0804 c0804) {
        this.f29351 = z;
        this.f29352 = z2;
        this.f29345 = j;
        this.f29342 = str;
        this.f29349 = j2;
        this.f29344 = j3;
        this.f29347 = j4;
        this.f29353 = j5;
        this.f29348 = z3;
        this.f29350 = z4;
        this.f29346 = z5;
        this.f29343 = c0804;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9007 m24041(long j) {
        return m24043(false, false, j, "", 0L, 0L, 0L, 0L, false, false, false, C0804.m3222());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9007 m24043(boolean z, boolean z2, long j, String str, long j2, long j3, long j4, long j5, boolean z3, boolean z4, boolean z5, C0804 c0804) {
        return new C9007(z, z2, j, str, j2, j3, j4, j5, z4, z5, z3, c0804 != null ? c0804 : C0804.m3222());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9007 m24042(JSONObject jSONObject) {
        return new C9007(jSONObject);
    }
}
