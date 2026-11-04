package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T753 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19668 implements InterfaceC21906 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f63349;

    public C19668(JSONObject jSONObject) {
        this.f63349 = jSONObject.getString("name", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19668 m45338(JSONObject jSONObject) {
        return new C19668(jSONObject);
    }
}
