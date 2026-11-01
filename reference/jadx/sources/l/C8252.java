package l;

import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.۠ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8252 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28705;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f28706;

    public C8252(JSONObject jSONObject) {
        C1383.m4844(jSONObject, "address", 0L);
        this.f28705 = jSONObject.getInt("size", 0);
        jSONObject.getString("bytes", "");
        this.f28706 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
    }
}
