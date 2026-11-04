package l;

/* JADX INFO: renamed from: l.ܿۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8DV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18223 extends AbstractC4053 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0830 f59480;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public double f59481;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f59482;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4799 f59483;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public double f59484;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13508 f59485;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public double f59486;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f59487;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13508 f59488;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f59489;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f59490;

    public C18223() {
        C0830 c0830 = new C0830();
        this.f59480 = c0830;
        m13040(c0830);
        C13508 c13508 = new C13508(1, "Amplitude", 1.0d);
        this.f59485 = c13508;
        m13040(c13508);
        C13508 c13509 = new C13508(1, "Rate", 1.0d);
        this.f59488 = c13509;
        m13040(c13509);
        C4799 c4799 = new C4799(0);
        this.f59483 = c4799;
        m13040(c4799);
        this.f59489 = true;
        this.f59484 = 1.0d;
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2017() {
        C0830 c0830;
        double[] dArrM20606 = this.f59485.m20606();
        double[] dArrM20607 = this.f59488.m20606();
        double[] dArrM20608 = this.f59483.m20606();
        int i = 0;
        while (true) {
            c0830 = this.f59480;
            if (i >= 8) {
                break;
            }
            if (this.f59490 >= 1.0d) {
                while (true) {
                    double d = this.f59490;
                    if (d >= 1.0d) {
                        this.f59486 = this.f59481;
                        this.f59490 = d - 1.0d;
                        this.f59484 = m42389();
                    }
                }
            } else if (i == 0 && (this.f59489 || !c0830.m3328())) {
                double d2 = this.f59482;
                this.f59481 = d2;
                this.f59486 = d2;
                this.f59490 = 0.0d;
                this.f59484 = m42389();
            }
            double d3 = this.f59481;
            double d4 = this.f59486;
            double d5 = this.f59490;
            double d6 = ((d3 - d4) * d5) + d4;
            this.f59482 = d6;
            dArrM20608[i] = d6 * dArrM20606[i];
            this.f59490 = (this.f59484 * dArrM20607[i]) + d5;
            i++;
        }
        if (this.f59487) {
            this.f59487 = false;
            c0830.getClass();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private double m42389() {
        C0830 c0830 = this.f59480;
        c0830.m3331();
        if (c0830.m3329()) {
            this.f59489 = false;
            this.f59481 = c0830.m3324(this.f13796.m37658());
            return c0830.m3330() * this.f13796.m37658();
        }
        this.f59489 = true;
        this.f59487 = true;
        this.f59490 = 0.0d;
        return 0.0d;
    }
}
