package l;

/* JADX INFO: renamed from: l.᩻ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8CV */
/* JADX INFO: loaded from: classes.dex */
public final class C23887 extends AbstractC5232 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f77374;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f77375;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public double f77376;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7659 f77377;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double f77378;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public double f77379;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7659 f77380;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7659 f77381;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double f77382;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f77383;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f77384;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public double f77385;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public double f77386;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f77387;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f77388;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public double f77389;

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        double d = this.f77377.m36893()[0];
        double d2 = this.f77380.m36893()[0];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        if (d2 < 1.0E-5d) {
            d2 = 1.0E-5d;
        }
        if (d != this.f77378 || d2 != this.f77379) {
            this.f77378 = d;
            this.f77379 = d2;
            double dM10098 = this.f4666.m10098() * d;
            if (dM10098 >= 0.499d) {
                dM10098 = 0.499d;
            }
            double d3 = dM10098 * 6.283185307179586d;
            this.f77385 = d3;
            this.f77384 = Math.cos(d3);
            double dSin = Math.sin(this.f77385) / (d2 * 2.0d);
            double d4 = 1.0d / (dSin + 1.0d);
            double d5 = this.f77384;
            double d6 = 1.0d - d5;
            double d7 = 0.5d * d6 * d4;
            this.f77374 = d7;
            this.f77375 = d6 * d4;
            this.f77389 = d7;
            this.f77388 = d5 * (-2.0d) * d4;
            this.f77383 = (1.0d - dSin) * d4;
        }
        double[] dArrM36893 = this.f18144.m36893();
        double[] dArrM36894 = this.f77381.m36893();
        double[] dArrM36895 = this.f18143.m36893();
        double d8 = this.f77376;
        double d9 = this.f77387;
        double d10 = this.f77382;
        double d11 = this.f77386;
        double d12 = this.f77374;
        double d13 = this.f77375;
        double d14 = this.f77389;
        double d15 = this.f77388;
        double d16 = d10;
        double d17 = this.f77383;
        int i = 0;
        double d18 = d9;
        double d19 = d11;
        double d20 = d8;
        while (i < 8) {
            double d21 = dArrM36893[i];
            d19 = (((d18 * d14) + ((d13 * d20) + (d12 * d21))) - (d15 * d16)) - (d19 * d17);
            dArrM36895[i] = dArrM36894[i] * d19;
            int i2 = i + 1;
            double d22 = dArrM36893[i2];
            d16 = (((d20 * d14) + ((d13 * d21) + (d12 * d22))) - (d15 * d19)) - (d16 * d17);
            dArrM36895[i2] = dArrM36894[i2] * d16;
            i += 2;
            d18 = d21;
            d20 = d22;
        }
        this.f77376 = d20;
        this.f77387 = d18;
        this.f77382 = d16 + 1.0E-26d;
        this.f77386 = d19 - 1.0E-26d;
    }
}
