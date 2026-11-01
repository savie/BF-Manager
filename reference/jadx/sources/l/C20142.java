package l;

/* JADX INFO: renamed from: l.᩶ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB34 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20142 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C18730 f65390;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public double f65391;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f65392;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public double f65393;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f65394;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f65395;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public double f65396;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public double f65397;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public double f65398;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f65399;

    public C20142() {
        this.f65397 = Math.sqrt(1500.0d);
        this.f65398 = 0.5d;
        this.f65399 = false;
        this.f65396 = Double.MAX_VALUE;
        this.f65390 = new C18730();
    }

    public C20142(float f) {
        this.f65397 = Math.sqrt(1500.0d);
        this.f65398 = 0.5d;
        this.f65399 = false;
        this.f65390 = new C18730();
        this.f65396 = f;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45503(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f65397 = Math.sqrt(f);
        this.f65399 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45501(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f65398 = f;
        this.f65399 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45504(float f) {
        this.f65396 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m45498() {
        return (float) this.f65396;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45502(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f65395 && ((double) Math.abs(f - ((float) this.f65396))) < this.f65392;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18730 m45499(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.f65399) {
            if (this.f65396 == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f65398;
            if (d3 > 1.0d) {
                double d4 = this.f65397;
                this.f65394 = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f65398;
                double d6 = this.f65397;
                this.f65391 = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f65393 = Math.sqrt(1.0d - (d3 * d3)) * this.f65397;
            }
            this.f65399 = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f65396;
        double d9 = this.f65398;
        if (d9 > 1.0d) {
            double d10 = this.f65391;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f65394);
            double d12 = d8 - d11;
            dPow = (Math.pow(2.718281828459045d, this.f65394 * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f65391;
            double dPow2 = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f65394;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow2;
        } else if (d9 == 1.0d) {
            double d15 = this.f65397;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow3 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f65397) * d7) * d17;
            double d18 = -this.f65397;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow4 * d18);
            dPow = dPow3;
        } else {
            double d19 = 1.0d / this.f65393;
            double d20 = this.f65397;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            double dSin = ((Math.sin(this.f65393 * d7) * d21) + (Math.cos(this.f65393 * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f65397;
            double d23 = this.f65398;
            double d24 = (-d22) * dSin * d23;
            double dPow5 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f65393;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f65393;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow5) + d24;
            dPow = dSin;
        }
        float f = (float) (dPow + this.f65396);
        C18730 c18730 = this.f65390;
        c18730.f60749 = f;
        c18730.f60750 = (float) dCos;
        return c18730;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45500(double d) {
        double dAbs = Math.abs(d);
        this.f65392 = dAbs;
        this.f65395 = dAbs * 62.5d;
    }
}
