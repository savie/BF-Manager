package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۧܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75S */
/* JADX INFO: loaded from: classes3.dex */
public final class C11075 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f37594;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f37595;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f37596;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f37597;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f37598;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f37599;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f37600;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f37601;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f37602;

    public C11075(JSONObject jSONObject) {
        this.f37598 = m27924(jSONObject, "neededLibraries");
        this.f37594 = m27924(jSONObject, "sections");
        this.f37600 = m27924(jSONObject, "segments");
        this.f37599 = m27924(jSONObject, "imports");
        this.f37596 = m27924(jSONObject, "symbols");
        this.f37597 = m27924(jSONObject, "entries");
        this.f37595 = m27924(jSONObject, "initArray");
        this.f37601 = m27924(jSONObject, "finiArray");
        this.f37602 = m27924(jSONObject, "relocations");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11075 m27925(JSONObject jSONObject) {
        return new C11075(jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27924(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.getInt(str, 0);
    }
}
