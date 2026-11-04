package l;

import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.۠֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8262 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f27199;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f27200;

    public C8262(JSONObject jSONObject) {
        C21160.m48263(jSONObject, "address", 0L);
        this.f27199 = jSONObject.getInt("size", 0);
        jSONObject.getString("bytes", "");
        this.f27200 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
    }
}
