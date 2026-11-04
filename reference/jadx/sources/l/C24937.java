package l;

/* JADX INFO: renamed from: l.᩻ۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8CH */
/* JADX INFO: loaded from: classes.dex */
public final class C24937 extends AbstractC6291 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f80706;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10764 f80707;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double f80710;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13508 f80711;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f80712;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public double f80709 = 0.0d;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f80708 = 1.0d;

    public C24937() {
        C13508 c13508 = new C13508("Time");
        this.f80711 = c13508;
        m13040(c13508);
        C10764 c10764 = new C10764("Current");
        this.f80707 = c10764;
        m13040(c10764);
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2017() {
        double[] dArrM20606 = this.f21356.m20606();
        int i = 0;
        double d = this.f21357.m20606()[0];
        C10764 c10764 = this.f80707;
        double dM27434 = c10764.m27434();
        if (d != this.f80710) {
            this.f80712 = dM27434;
            this.f80706 = 0.0d;
            this.f80710 = d;
        }
        if (dM27434 == this.f80710) {
            while (i < 8) {
                dArrM20606[i] = dM27434;
                i++;
            }
        } else {
            double d2 = this.f80711.m20606()[0];
            if (d2 != this.f80709) {
                this.f80708 = d2 < this.f13796.m37661() ? 1.0d : this.f13796.m37658() / d2;
                this.f80709 = d2;
            }
            while (i < 8) {
                double d3 = this.f80706;
                if (d3 < 1.0d) {
                    double d4 = this.f80712;
                    double d5 = ((this.f80710 - d4) * d3) + d4;
                    this.f80706 = d3 + this.f80708;
                    dM27434 = d5;
                } else {
                    dM27434 = this.f80710;
                }
                dArrM20606[i] = dM27434;
                i++;
            }
        }
        c10764.m27433(dM27434);
    }
}
