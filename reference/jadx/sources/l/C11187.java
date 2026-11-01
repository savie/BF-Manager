package l;

/* JADX INFO: renamed from: l.ۧᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68CW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11187 extends AbstractC5232 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C20359 f37884;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7659 f37887;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public double f37889;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f37888 = 0.0d;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f37885 = 1.0d;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public double f37886 = 1.0E-5d;

    public C11187() {
        C7659 c7659 = new C7659("Time");
        this.f37887 = c7659;
        m3818(c7659);
        this.f18144.m20211(1.0E-5d, 1.0d, 1.0d);
        C20359 c20359 = new C20359();
        this.f37884 = c20359;
        m3818(c20359);
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        double[] dArrM36893 = this.f18143.m36893();
        int i = 0;
        double d = this.f18144.m36893()[0];
        double d2 = this.f37887.m36893()[0];
        C20359 c20359 = this.f37884;
        double dM45936 = c20359.m45936();
        double d3 = this.f37886;
        double dMax = Math.max(d3, d);
        double dMax2 = Math.max(d3, dM45936);
        if (d2 != this.f37888) {
            this.f37885 = Math.pow(dMax / dMax2, 1.0d / (((double) this.f4666.m10091()) * d2));
            this.f37888 = d2;
        }
        if (dMax != this.f37889) {
            this.f37885 = Math.pow(dMax / dMax2, 1.0d / (d2 * ((double) this.f4666.m10091())));
            this.f37889 = dMax;
        }
        double d4 = this.f37889;
        if (dMax2 < d4) {
            while (i < 8) {
                dMax2 *= this.f37885;
                double d5 = this.f37889;
                if (dMax2 > d5) {
                    this.f37885 = 1.0d;
                    dMax2 = d5;
                }
                dArrM36893[i] = dMax2;
                i++;
            }
        } else if (dMax2 > d4) {
            while (i < 8) {
                dMax2 *= this.f37885;
                double d6 = this.f37889;
                if (dMax2 < d6) {
                    this.f37885 = 1.0d;
                    dMax2 = d6;
                }
                dArrM36893[i] = dMax2;
                i++;
            }
        } else if (dMax2 == d4) {
            while (i < 8) {
                dArrM36893[i] = this.f37889;
                i++;
            }
        }
        c20359.m45937(dMax2);
    }
}
