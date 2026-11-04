package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩻۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75S */
/* JADX INFO: loaded from: classes.dex */
public final class C24890 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f80525;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f80526;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f80527;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f80528;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f80529;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f80530;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f80531;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f80532;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f80533;

    public C24890(JSONObject jSONObject) {
        this.f80531 = m55421(jSONObject, "neededLibraries");
        this.f80529 = m55421(jSONObject, "sections");
        this.f80527 = m55421(jSONObject, "segments");
        this.f80528 = m55421(jSONObject, "imports");
        this.f80525 = m55421(jSONObject, "symbols");
        this.f80526 = m55421(jSONObject, "entries");
        this.f80533 = m55421(jSONObject, "initArray");
        this.f80532 = m55421(jSONObject, "finiArray");
        this.f80530 = m55421(jSONObject, "relocations");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24890 m55422(JSONObject jSONObject) {
        return new C24890(jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m55421(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.getInt(str, 0);
    }
}
