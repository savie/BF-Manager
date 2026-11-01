package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۛ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6PH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5701 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C5701 f19439 = new C5701("", "");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f19440;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f19441;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f19442;

    public C5701(String str, String str2) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
                throw new IllegalArgumentException("Base indent must contain only spaces or tabs");
            }
        }
        if (!str2.isEmpty() && !str2.equals("\n") && !str2.equals("\r\n") && !str2.equals("\r")) {
            throw new IllegalArgumentException("Unsupported line ending");
        }
        this.f19441 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
        this.f19440 = str;
        this.f19442 = str2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m15728() {
        return this.f19441;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m15727() {
        return this.f19440;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m15729() {
        return this.f19442;
    }
}
