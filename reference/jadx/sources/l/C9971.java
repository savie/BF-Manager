package l;

import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O75H */
/* JADX INFO: loaded from: classes3.dex */
public final class C9971 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f32052;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f32053;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f32054;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f32055;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2514 f32056;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f32057;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f32058;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f32059;

    public C9971(JSONObject jSONObject) {
        this.f32055 = C21160.m48263(jSONObject, "sourceVirtualAddress", -1L);
        this.f32054 = C21160.m48263(jSONObject, "sourceFileOffset", -1L);
        this.f32059 = jSONObject.getString("sourceKind", "");
        this.f32057 = jSONObject.getInt("sourceSize", 0);
        this.f32056 = C2514.m8401(jSONObject.getJSONObject("sourceSymbol"));
        this.f32052 = jSONObject.getString("bytes", "");
        this.f32053 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
        this.f32058 = jSONObject.getString("referenceKind", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9971 m25814(JSONObject jSONObject) {
        return new C9971(jSONObject);
    }
}
