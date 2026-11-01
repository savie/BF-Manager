package l;

import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩺᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O75H */
/* JADX INFO: loaded from: classes.dex */
public final class C23257 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f75446;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f75447;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f75448;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f75449;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f75450;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f75451;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f75452;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18317 f75453;

    public C23257(JSONObject jSONObject) {
        this.f75446 = C1383.m4844(jSONObject, "sourceVirtualAddress", -1L);
        this.f75450 = C1383.m4844(jSONObject, "sourceFileOffset", -1L);
        this.f75447 = jSONObject.getString("sourceKind", "");
        this.f75449 = jSONObject.getInt("sourceSize", 0);
        this.f75453 = C18317.m42552(jSONObject.getJSONObject("sourceSymbol"));
        this.f75448 = jSONObject.getString("bytes", "");
        this.f75451 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
        this.f75452 = jSONObject.getString("referenceKind", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23257 m51328(JSONObject jSONObject) {
        return new C23257(jSONObject);
    }
}
