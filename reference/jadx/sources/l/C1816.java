package l;

/* JADX INFO: renamed from: l.֫ۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68CW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1816 extends AbstractC6291 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10764 f6163;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13508 f6166;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f6168;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public double f6167 = 0.0d;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f6165 = 1.0d;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f6164 = 1.0E-5d;

    public C1816() {
        C13508 c13508 = new C13508("Time");
        this.f6166 = c13508;
        m13040(c13508);
        this.f21357.m33175(1.0E-5d, 1.0d, 1.0d);
        C10764 c10764 = new C10764();
        this.f6163 = c10764;
        m13040(c10764);
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2017() {
        double[] dArrM20606 = this.f21356.m20606();
        int i = 0;
        double d = this.f21357.m20606()[0];
        double d2 = this.f6166.m20606()[0];
        C10764 c10764 = this.f6163;
        double dM27434 = c10764.m27434();
        double d3 = this.f6164;
        double dMax = Math.max(d3, d);
        double dMax2 = Math.max(d3, dM27434);
        if (d2 != this.f6167) {
            this.f6165 = Math.pow(dMax / dMax2, 1.0d / (((double) this.f13796.m37665()) * d2));
            this.f6167 = d2;
        }
        if (dMax != this.f6168) {
            this.f6165 = Math.pow(dMax / dMax2, 1.0d / (d2 * ((double) this.f13796.m37665())));
            this.f6168 = dMax;
        }
        double d4 = this.f6168;
        if (dMax2 < d4) {
            while (i < 8) {
                dMax2 *= this.f6165;
                double d5 = this.f6168;
                if (dMax2 > d5) {
                    this.f6165 = 1.0d;
                    dMax2 = d5;
                }
                dArrM20606[i] = dMax2;
                i++;
            }
        } else if (dMax2 > d4) {
            while (i < 8) {
                dMax2 *= this.f6165;
                double d6 = this.f6168;
                if (dMax2 < d6) {
                    this.f6165 = 1.0d;
                    dMax2 = d6;
                }
                dArrM20606[i] = dMax2;
                i++;
            }
        } else if (dMax2 == d4) {
            while (i < 8) {
                dArrM20606[i] = this.f6168;
                i++;
            }
        }
        c10764.m27433(dMax2);
    }
}
