package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۛ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes3.dex */
public final class C6244 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f21196;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f21197;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f21198;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f21199;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f21200;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f21201;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f21202;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f21203;

    public C6244(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f21199 = C21160.m48263(jSONObject, "startVirtualAddress", -1L);
        this.f21201 = C21160.m48263(jSONObject, "startPhysicalAddress", -1L);
        this.f21203 = jSONObject.getString("name", "");
        this.f21198 = jSONObject.getString("demangledName", "");
        this.f21197 = C21160.m48263(jSONObject, "symbolSize", 0L);
        this.f21200 = jSONObject.getString("startSource", "");
        this.f21202 = jSONObject.getString("boundarySource", "");
        this.f21196 = C21160.m48263(jSONObject, "boundaryEndVirtualAddress", -1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6244 m17873(JSONObject jSONObject) {
        return new C6244(jSONObject);
    }
}
