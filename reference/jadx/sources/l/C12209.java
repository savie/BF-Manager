package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۨ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes3.dex */
public final class C12209 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f39238;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f39239;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f39240;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f39241;

    public C12209(JSONObject jSONObject) {
        this.f39239 = C21160.m48263(jSONObject, "sourceVirtualAddress", -1L);
        this.f39238 = jSONObject.getString("flowKind", "");
        this.f39241 = C21160.m48263(jSONObject, "targetVirtualAddress", -1L);
        this.f39240 = jSONObject.getString("reason", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12209 m30482(JSONObject jSONObject) {
        return new C12209(jSONObject);
    }
}
