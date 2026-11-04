package l;

/* JADX INFO: renamed from: l.ܰۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB34 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14529 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f45704;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public double f45705;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f45706;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public double f45707;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f45708;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16021 f45709;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f45710;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f45711;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f45712;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f45713;

    public C14529() {
        this.f45706 = Math.sqrt(1500.0d);
        this.f45712 = 0.5d;
        this.f45710 = false;
        this.f45707 = Double.MAX_VALUE;
        this.f45709 = new C16021();
    }

    public C14529(float f) {
        this.f45706 = Math.sqrt(1500.0d);
        this.f45712 = 0.5d;
        this.f45710 = false;
        this.f45709 = new C16021();
        this.f45707 = f;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m35073(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f45706 = Math.sqrt(f);
        this.f45710 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35071(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f45712 = f;
        this.f45710 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35074(float f) {
        this.f45707 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m35068() {
        return (float) this.f45707;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35072(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f45708 && ((double) Math.abs(f - ((float) this.f45707))) < this.f45704;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16021 m35069(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.f45710) {
            if (this.f45707 == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f45712;
            if (d3 > 1.0d) {
                double d4 = this.f45706;
                this.f45711 = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f45712;
                double d6 = this.f45706;
                this.f45713 = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f45705 = Math.sqrt(1.0d - (d3 * d3)) * this.f45706;
            }
            this.f45710 = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f45707;
        double d9 = this.f45712;
        if (d9 > 1.0d) {
            double d10 = this.f45713;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f45711);
            double d12 = d8 - d11;
            dPow = (Math.pow(2.718281828459045d, this.f45711 * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f45713;
            double dPow2 = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f45711;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow2;
        } else if (d9 == 1.0d) {
            double d15 = this.f45706;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow3 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f45706) * d7) * d17;
            double d18 = -this.f45706;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow4 * d18);
            dPow = dPow3;
        } else {
            double d19 = 1.0d / this.f45705;
            double d20 = this.f45706;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            double dSin = ((Math.sin(this.f45705 * d7) * d21) + (Math.cos(this.f45705 * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f45706;
            double d23 = this.f45712;
            double d24 = (-d22) * dSin * d23;
            double dPow5 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f45705;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f45705;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow5) + d24;
            dPow = dSin;
        }
        float f = (float) (dPow + this.f45707);
        C16021 c16021 = this.f45709;
        c16021.f51972 = f;
        c16021.f51973 = (float) dCos;
        return c16021;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35070(double d) {
        double dAbs = Math.abs(d);
        this.f45704 = dAbs;
        this.f45708 = dAbs * 62.5d;
    }
}
