package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۖ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75J */
/* JADX INFO: loaded from: classes2.dex */
public final class C2514 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f8042;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f8043;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f8044;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f8045;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f8046;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f8047;

    public C2514(JSONObject jSONObject) {
        this.f8046 = jSONObject.getString("name", "");
        this.f8042 = jSONObject.getString("demangledName", "");
        this.f8044 = C21160.m48263(jSONObject, "startVirtualAddress", -1L);
        this.f8045 = C21160.m48263(jSONObject, "startPhysicalAddress", -1L);
        this.f8043 = C21160.m48263(jSONObject, "offset", -1L);
        this.f8047 = C21160.m48263(jSONObject, "size", 0L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2514 m8401(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C2514(jSONObject);
    }
}
