package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75J */
/* JADX INFO: loaded from: classes4.dex */
public final class C18317 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f58428;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f58429;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f58430;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f58431;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f58432;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f58433;

    public C18317(JSONObject jSONObject) {
        this.f58432 = jSONObject.getString("name", "");
        this.f58429 = jSONObject.getString("demangledName", "");
        this.f58433 = C1383.m4844(jSONObject, "startVirtualAddress", -1L);
        this.f58430 = C1383.m4844(jSONObject, "startPhysicalAddress", -1L);
        this.f58431 = C1383.m4844(jSONObject, "offset", -1L);
        this.f58428 = C1383.m4844(jSONObject, "size", 0L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18317 m42552(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C18317(jSONObject);
    }
}
