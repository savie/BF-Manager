package l;

/* JADX INFO: renamed from: l.۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13910 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C13910 f44121;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44122;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f44123;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f44124;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13910 m33893() {
        if (f44121 == null) {
            f44121 = new C13910();
        }
        return f44121;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33894(double d, double d2, long j) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (f - 9.0E-4f)) - d4) + 9.0E-4f)) + d4;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.f44122 = 1;
            this.f44123 = -1L;
            this.f44124 = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f44122 = 0;
                this.f44123 = -1L;
                this.f44124 = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f44123 = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f44124 = jRound;
            if (jRound < j && this.f44123 > j) {
                this.f44122 = 0;
            } else {
                this.f44122 = 1;
            }
        }
    }
}
