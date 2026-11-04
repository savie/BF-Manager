package l;

/* JADX INFO: renamed from: l.ۧۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8CV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11510 extends AbstractC6291 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f36210;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C13508 f36211;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f36212;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13508 f36213;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public double f36214;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f36215;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public double f36216;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public double f36217;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public double f36218;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13508 f36219;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public double f36220;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public double f36221;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public double f36222;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double f36223;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public double f36224;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f36225;

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2017() {
        double d = this.f36211.m20606()[0];
        double d2 = this.f36213.m20606()[0];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        if (d2 < 1.0E-5d) {
            d2 = 1.0E-5d;
        }
        if (d != this.f36216 || d2 != this.f36214) {
            this.f36216 = d;
            this.f36214 = d2;
            double dM37658 = this.f13796.m37658() * d;
            if (dM37658 >= 0.499d) {
                dM37658 = 0.499d;
            }
            double d3 = dM37658 * 6.283185307179586d;
            this.f36221 = d3;
            this.f36223 = Math.cos(d3);
            double dSin = Math.sin(this.f36221) / (d2 * 2.0d);
            double d4 = 1.0d / (dSin + 1.0d);
            double d5 = this.f36223;
            double d6 = 1.0d - d5;
            double d7 = 0.5d * d6 * d4;
            this.f36210 = d7;
            this.f36215 = d6 * d4;
            this.f36225 = d7;
            this.f36220 = d5 * (-2.0d) * d4;
            this.f36218 = (1.0d - dSin) * d4;
        }
        double[] dArrM20606 = this.f21357.m20606();
        double[] dArrM20607 = this.f36219.m20606();
        double[] dArrM20608 = this.f21356.m20606();
        double d8 = this.f36224;
        double d9 = this.f36212;
        double d10 = this.f36217;
        double d11 = this.f36222;
        double d12 = this.f36210;
        double d13 = this.f36215;
        double d14 = this.f36225;
        double d15 = this.f36220;
        double d16 = d10;
        double d17 = this.f36218;
        int i = 0;
        double d18 = d9;
        double d19 = d11;
        double d20 = d8;
        while (i < 8) {
            double d21 = dArrM20606[i];
            d19 = (((d18 * d14) + ((d13 * d20) + (d12 * d21))) - (d15 * d16)) - (d19 * d17);
            dArrM20608[i] = dArrM20607[i] * d19;
            int i2 = i + 1;
            double d22 = dArrM20606[i2];
            d16 = (((d20 * d14) + ((d13 * d21) + (d12 * d22))) - (d15 * d19)) - (d16 * d17);
            dArrM20608[i2] = dArrM20607[i2] * d16;
            i += 2;
            d18 = d21;
            d20 = d22;
        }
        this.f36224 = d20;
        this.f36212 = d18;
        this.f36217 = d16 + 1.0E-26d;
        this.f36222 = d19 - 1.0E-26d;
    }
}
