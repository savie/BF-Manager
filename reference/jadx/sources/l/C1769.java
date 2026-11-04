package l;

import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.֫۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J76B */
/* JADX INFO: loaded from: classes2.dex */
public final class C1769 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f6075;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f6076;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f6077;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f6078;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f6079;

    public C1769(JSONObject jSONObject) {
        this.f6079 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
        this.f6076 = C21160.m48263(jSONObject, "size", 0L);
        this.f6075 = C21160.m48263(jSONObject, "paddr", -1L);
        this.f6077 = C21160.m48263(jSONObject, "vaddr", -1L);
        this.f6078 = jSONObject.getString("sectionName", "");
        jSONObject.getString("type", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1769 m6220(JSONObject jSONObject) {
        return new C1769(jSONObject);
    }
}
