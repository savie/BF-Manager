package l;

import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܿܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J76B */
/* JADX INFO: loaded from: classes4.dex */
public final class C17424 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f55435;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f55436;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f55437;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f55438;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f55439;

    public C17424(JSONObject jSONObject) {
        this.f55435 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
        this.f55438 = C1383.m4844(jSONObject, "size", 0L);
        this.f55436 = C1383.m4844(jSONObject, "paddr", -1L);
        this.f55437 = C1383.m4844(jSONObject, "vaddr", -1L);
        this.f55439 = jSONObject.getString("sectionName", "");
        jSONObject.getString("type", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17424 m40620(JSONObject jSONObject) {
        return new C17424(jSONObject);
    }
}
