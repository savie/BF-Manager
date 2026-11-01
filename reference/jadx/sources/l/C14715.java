package l;

/* JADX INFO: renamed from: l.ܳᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8CH */
/* JADX INFO: loaded from: classes5.dex */
public final class C14715 extends AbstractC5232 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f48126;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C20359 f48128;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public double f48129;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7659 f48131;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public double f48132;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f48130 = 0.0d;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f48127 = 1.0d;

    public C14715() {
        C7659 c7659 = new C7659("Time");
        this.f48131 = c7659;
        m3818(c7659);
        C20359 c20359 = new C20359("Current");
        this.f48128 = c20359;
        m3818(c20359);
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        double[] dArrM36893 = this.f18143.m36893();
        int i = 0;
        double d = this.f18144.m36893()[0];
        C20359 c20359 = this.f48128;
        double dM45936 = c20359.m45936();
        if (d != this.f48129) {
            this.f48132 = dM45936;
            this.f48126 = 0.0d;
            this.f48129 = d;
        }
        if (dM45936 == this.f48129) {
            while (i < 8) {
                dArrM36893[i] = dM45936;
                i++;
            }
        } else {
            double d2 = this.f48131.m36893()[0];
            if (d2 != this.f48130) {
                this.f48127 = d2 < this.f4666.m10097() ? 1.0d : this.f4666.m10098() / d2;
                this.f48130 = d2;
            }
            while (i < 8) {
                double d3 = this.f48126;
                if (d3 < 1.0d) {
                    double d4 = this.f48132;
                    double d5 = ((this.f48129 - d4) * d3) + d4;
                    this.f48126 = d3 + this.f48127;
                    dM45936 = d5;
                } else {
                    dM45936 = this.f48129;
                }
                dArrM36893[i] = dM45936;
                i++;
            }
        }
        c20359.m45937(dM45936);
    }
}
