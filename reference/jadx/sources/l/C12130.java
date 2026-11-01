package l;

import java.io.File;

/* JADX INFO: renamed from: l.۫ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S76D */
/* JADX INFO: loaded from: classes3.dex */
public final class C12130 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C18129 f40606;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f40607;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f40608;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f40609;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f40610;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30187(String str, C18129 c18129, boolean z) {
        if (z) {
            if (!c18129.f57964.f70213) {
                this.f40606 = null;
                return;
            }
        }
        File file = new File(str);
        this.f40608 = str;
        this.f40607 = file.length();
        this.f40609 = file.lastModified();
        this.f40610 = z;
        this.f40606 = c18129;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C18129 m30186(String str, long j, boolean z, boolean z2) {
        if (this.f40606 != null && str.equals(this.f40608) && this.f40606.f57962 == z && this.f40610 == z2) {
            File file = new File(str);
            if (file.length() == this.f40607 && file.lastModified() == this.f40609) {
                C18129 c18129 = this.f40606;
                long j2 = c18129.f57970;
                long j3 = c18129.f57961;
                long j4 = j2 - j3;
                long j5 = c18129.f57968 - j3;
                if (j4 >= 0 && j5 >= 0) {
                    long j6 = c18129.f57972;
                    if (j6 >= 0) {
                        long j7 = z ? j4 : j5;
                        if (j >= j7 && j6 != 0 && C17492.FOREVER_NS - j7 >= j6) {
                            long j8 = j - j7;
                            if (j8 < j6 && C17492.FOREVER_NS - j4 >= j8 && C17492.FOREVER_NS - j5 >= j8) {
                                C21657 c21657M48368 = c18129.f57964;
                                if (z2) {
                                    if (c21657M48368.f70213) {
                                        long j9 = c21657M48368.f70212;
                                        if (j9 >= 0) {
                                            long j10 = c21657M48368.f70214;
                                            if (j10 > 0 && j9 <= C17492.FOREVER_NS - j10) {
                                                long j11 = j4 + j8;
                                                long j12 = j10 + j9;
                                                if (j11 >= j9 && j11 < j12) {
                                                    c21657M48368 = c21657M48368.m48368(j11 - j9);
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                    return null;
                                }
                                C21657 c21657 = c21657M48368;
                                C18129 c181210 = this.f40606;
                                return C18129.m42202(true, z, j, c181210.f57963, j4 + j8, j5 + j8, j8, c181210.f57972, c181210.f57966, c181210.f57971, c181210.f57965, c21657);
                            }
                            return null;
                        }
                        return null;
                    }
                }
                return null;
            }
            this.f40606 = null;
            return null;
        }
        return null;
    }
}
