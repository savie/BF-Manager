package l;

/* JADX INFO: renamed from: l.ܿۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17072 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f54489;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2516 f54490;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f54491;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f54492;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f54493;

    public C17072(C2516 c2516, int i, int i2, boolean z, long j) {
        this.f54490 = c2516;
        this.f54493 = c2516.m7808();
        this.f54491 = i;
        if (z) {
            long j2 = ((long) i2) + 1;
            int i3 = (int) j2;
            if (j2 != i3) {
                throw new ArithmeticException();
            }
            i = i3;
        }
        this.f54492 = i;
        this.f54489 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39857(C13026 c13026) {
        return c13026.f43452.m33452(this.f54490, this.f54493, this.f54489);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17072 m39856(C13026 c13026) {
        C2516 c2516M33458 = c13026.f43452.m33458();
        C13732 c13732 = c13026.f43452;
        int iM33443 = c13732.m33443();
        int iM33465 = c13732.m33465();
        boolean zM33475 = c13732.m33475();
        long jM33472 = c13732.m33472();
        if (iM33443 < 0 || iM33465 < iM33443) {
            return null;
        }
        if (zM33475 && iM33465 >= c2516M33458.length()) {
            return null;
        }
        if (zM33475 || (iM33443 == iM33465 && iM33443 <= c2516M33458.length())) {
            return new C17072(c2516M33458, iM33443, iM33465, zM33475, jM33472);
        }
        return null;
    }
}
