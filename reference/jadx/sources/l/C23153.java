package l;

import java.io.File;

/* JADX INFO: renamed from: l.᩸᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S76D */
/* JADX INFO: loaded from: classes.dex */
public final class C23153 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f75042;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f75043;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f75044;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f75045;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9007 f75046;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52073(String str, C9007 c9007, boolean z) {
        if (z) {
            if (!c9007.f29343.f2852) {
                this.f75046 = null;
                return;
            }
        }
        File file = new File(str);
        this.f75044 = str;
        this.f75042 = file.length();
        this.f75043 = file.lastModified();
        this.f75045 = z;
        this.f75046 = c9007;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9007 m52072(String str, long j, boolean z, boolean z2) {
        if (this.f75046 != null && str.equals(this.f75044) && this.f75046.f29352 == z && this.f75045 == z2) {
            File file = new File(str);
            if (file.length() == this.f75042 && file.lastModified() == this.f75043) {
                C9007 c9007 = this.f75046;
                long j2 = c9007.f29349;
                long j3 = c9007.f29347;
                long j4 = j2 - j3;
                long j5 = c9007.f29344 - j3;
                if (j4 >= 0 && j5 >= 0) {
                    long j6 = c9007.f29353;
                    if (j6 >= 0) {
                        long j7 = z ? j4 : j5;
                        if (j >= j7 && j6 != 0 && C25227.FOREVER_NS - j7 >= j6) {
                            long j8 = j - j7;
                            if (j8 < j6 && C25227.FOREVER_NS - j4 >= j8 && C25227.FOREVER_NS - j5 >= j8) {
                                C0804 c0804M3225 = c9007.f29343;
                                if (z2) {
                                    if (c0804M3225.f2852) {
                                        long j9 = c0804M3225.f2847;
                                        if (j9 >= 0) {
                                            long j10 = c0804M3225.f2850;
                                            if (j10 > 0 && j9 <= C25227.FOREVER_NS - j10) {
                                                long j11 = j4 + j8;
                                                long j12 = j10 + j9;
                                                if (j11 >= j9 && j11 < j12) {
                                                    c0804M3225 = c0804M3225.m3225(j11 - j9);
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                    return null;
                                }
                                C0804 c0804 = c0804M3225;
                                C9007 c9008 = this.f75046;
                                return C9007.m24043(true, z, j, c9008.f29342, j4 + j8, j5 + j8, j8, c9008.f29353, c9008.f29346, c9008.f29348, c9008.f29350, c0804);
                            }
                            return null;
                        }
                        return null;
                    }
                }
                return null;
            }
            this.f75046 = null;
            return null;
        }
        return null;
    }
}
