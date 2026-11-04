package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩺۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes.dex */
public final class C24144 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f78150;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f78151;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f78152;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f78153;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f78154;

    public C24144(JSONObject jSONObject) {
        this.f78154 = C21160.m48263(jSONObject, "sourceVirtualAddress", -1L);
        this.f78150 = jSONObject.getString("flowKind", "");
        boolean zContains = jSONObject.contains("targetVirtualAddress");
        this.f78153 = zContains;
        this.f78152 = zContains ? C21160.m48263(jSONObject, "targetVirtualAddress", -1L) : -1L;
        this.f78151 = jSONObject.getString("reason", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24144 m54113(JSONObject jSONObject) {
        return new C24144(jSONObject);
    }
}
