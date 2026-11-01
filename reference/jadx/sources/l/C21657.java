package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩸ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C755 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21657 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f70207;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f70208;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f70209;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f70210;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f70211;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f70212;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f70213;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f70214;

    public C21657(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f70213 = jSONObject.getBoolean("found", false);
        this.f70208 = jSONObject.getString("name", "");
        this.f70209 = jSONObject.getString("demangledName", "");
        this.f70211 = jSONObject.getString("instructionMode", "");
        this.f70212 = C1383.m4844(jSONObject, "startVirtualAddress", 0L);
        this.f70207 = C1383.m4844(jSONObject, "startPhysicalAddress", 0L);
        this.f70210 = C1383.m4844(jSONObject, "offset", 0L);
        this.f70214 = C1383.m4844(jSONObject, "size", 0L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21657 m48365() {
        return new C21657(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21657 m48367(String str, String str2, String str3, long j, long j2, long j3, long j4) {
        return new C21657(new JSONObject().add("found", true).add("name", str).add("demangledName", str2).add("instructionMode", str3).add("startVirtualAddress", j).add("startPhysicalAddress", j2).add("offset", j3).add("size", j4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21657 m48368(long j) {
        if (!this.f70213) {
            return m48365();
        }
        return m48367(this.f70208, this.f70209, this.f70211, this.f70212, this.f70207, j, this.f70214);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21657 m48366(JSONObject jSONObject) {
        return new C21657(jSONObject);
    }
}
