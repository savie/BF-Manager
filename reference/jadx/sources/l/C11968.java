package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۨ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes3.dex */
public final class C11968 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f40103;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f40104;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f40105;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f40106;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f40107;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f40108;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f40109;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f40110;

    public C11968(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f40103 = C1383.m4844(jSONObject, "startVirtualAddress", -1L);
        this.f40106 = C1383.m4844(jSONObject, "startPhysicalAddress", -1L);
        this.f40104 = jSONObject.getString("name", "");
        this.f40107 = jSONObject.getString("demangledName", "");
        this.f40108 = C1383.m4844(jSONObject, "symbolSize", 0L);
        this.f40110 = jSONObject.getString("startSource", "");
        this.f40109 = jSONObject.getString("boundarySource", "");
        this.f40105 = C1383.m4844(jSONObject, "boundaryEndVirtualAddress", -1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11968 m29780(JSONObject jSONObject) {
        return new C11968(jSONObject);
    }
}
