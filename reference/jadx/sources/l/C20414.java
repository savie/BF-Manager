package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩵۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes5.dex */
public final class C20414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f65417;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f65418;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f65419;

    public C20414(JSONObject jSONObject) {
        this.f65417 = C21160.m48263(jSONObject, "fromVirtualAddress", -1L);
        this.f65418 = C21160.m48263(jSONObject, "toVirtualAddress", -1L);
        this.f65419 = jSONObject.getString("kind", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20414 m46825(JSONObject jSONObject) {
        return new C20414(jSONObject);
    }
}
