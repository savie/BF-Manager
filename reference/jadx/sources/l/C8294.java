package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۠ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6OE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8294 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C8294 f28808 = new C8294("", "");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f28809;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f28810;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f28811;

    public C8294(String str, String str2) {
        if (!str2.isEmpty() && !str2.equals("\n") && !str2.equals("\r\n") && !str2.equals("\r")) {
            throw new IllegalArgumentException("Unsupported line ending");
        }
        this.f28811 = str2;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
                throw new IllegalArgumentException("Base indent must contain only spaces or tabs");
            }
        }
        this.f28810 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
        this.f28809 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m21731() {
        return this.f28811;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m21730() {
        return this.f28810;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m21729() {
        return this.f28809;
    }
}
