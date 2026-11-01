package l;

/* JADX INFO: renamed from: l.ۜ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6643 extends AbstractC0998 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double f22423;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C18948 f22424;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21064 f22425;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public double f22426;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public double f22427;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f22428;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f22429;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f22430;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7659 f22431;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7659 f22432;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public double f22433;

    public C6643() {
        C18948 c18948 = new C18948();
        this.f22424 = c18948;
        m3818(c18948);
        C7659 c7659 = new C7659(1, "Amplitude", 1.0d);
        this.f22432 = c7659;
        m3818(c7659);
        C7659 c76510 = new C7659(1, "Rate", 1.0d);
        this.f22431 = c76510;
        m3818(c76510);
        C21064 c21064 = new C21064(0);
        this.f22425 = c21064;
        m3818(c21064);
        this.f22430 = true;
        this.f22423 = 1.0d;
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        C18948 c18948;
        double[] dArrM36893 = this.f22432.m36893();
        double[] dArrM36894 = this.f22431.m36893();
        double[] dArrM36895 = this.f22425.m36893();
        int i = 0;
        while (true) {
            c18948 = this.f22424;
            if (i >= 8) {
                break;
            }
            if (this.f22433 >= 1.0d) {
                while (true) {
                    double d = this.f22433;
                    if (d >= 1.0d) {
                        this.f22429 = this.f22426;
                        this.f22433 = d - 1.0d;
                        this.f22423 = m18012();
                    }
                }
            } else if (i == 0 && (this.f22430 || !c18948.m43651())) {
                double d2 = this.f22427;
                this.f22426 = d2;
                this.f22429 = d2;
                this.f22433 = 0.0d;
                this.f22423 = m18012();
            }
            double d3 = this.f22426;
            double d4 = this.f22429;
            double d5 = this.f22433;
            double d6 = ((d3 - d4) * d5) + d4;
            this.f22427 = d6;
            dArrM36895[i] = d6 * dArrM36893[i];
            this.f22433 = (this.f22423 * dArrM36894[i]) + d5;
            i++;
        }
        if (this.f22428) {
            this.f22428 = false;
            c18948.getClass();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private double m18012() {
        C18948 c18948 = this.f22424;
        c18948.m43650();
        if (c18948.m43644()) {
            this.f22430 = false;
            this.f22426 = c18948.m43646(this.f4666.m10098());
            return c18948.m43652() * this.f4666.m10098();
        }
        this.f22430 = true;
        this.f22428 = true;
        this.f22433 = 0.0d;
        return 0.0d;
    }
}
