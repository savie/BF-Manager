package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֨֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C755 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0804 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f2846;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f2847;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f2848;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f2849;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f2850;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f2851;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f2852;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f2853;

    public C0804(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f2852 = jSONObject.getBoolean("found", false);
        this.f2853 = jSONObject.getString("name", "");
        this.f2846 = jSONObject.getString("demangledName", "");
        this.f2848 = jSONObject.getString("instructionMode", "");
        this.f2847 = C21160.m48263(jSONObject, "startVirtualAddress", 0L);
        this.f2849 = C21160.m48263(jSONObject, "startPhysicalAddress", 0L);
        this.f2851 = C21160.m48263(jSONObject, "offset", 0L);
        this.f2850 = C21160.m48263(jSONObject, "size", 0L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0804 m3222() {
        return new C0804(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0804 m3224(String str, String str2, String str3, long j, long j2, long j3, long j4) {
        return new C0804(new JSONObject().add("found", true).add("name", str).add("demangledName", str2).add("instructionMode", str3).add("startVirtualAddress", j).add("startPhysicalAddress", j2).add("offset", j3).add("size", j4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0804 m3225(long j) {
        if (!this.f2852) {
            return m3222();
        }
        return m3224(this.f2853, this.f2846, this.f2848, this.f2847, this.f2849, j, this.f2850);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0804 m3223(JSONObject jSONObject) {
        return new C0804(jSONObject);
    }
}
