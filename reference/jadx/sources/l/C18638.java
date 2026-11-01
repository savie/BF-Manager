package l;

/* JADX INFO: renamed from: l.ᩴ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18638 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f60419;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4526 f60420;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f60421;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9776 f60423;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19344 f60424;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C8055 f60425;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C14715 f60426;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f60427;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11187 f60429;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2013 f60430;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3424 f60431;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C14715 f60432;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public double f60422 = 0.16666666666666666d;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC0293 f60428 = new C17932(this);

    public C18638(C19344 c19344, int i) {
        this.f60424 = c19344;
        this.f60427 = i;
        if (i == 9) {
            this.f60421 = true;
            this.f60419 = 128;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43115(C8055 c8055) {
        this.f60425 = c8055;
        C19344 c19344 = this.f60424;
        InterfaceC16810 interfaceC16810 = c19344.f62380;
        C3424 c3424 = new C3424();
        this.f60431 = c3424;
        ((C3403) interfaceC16810).m10095(c3424);
        InterfaceC16810 interfaceC16811 = c19344.f62380;
        C4526 c4526 = new C4526();
        C7659 c7659 = new C7659("Frequency");
        c4526.f16112 = c7659;
        c4526.m3818(c7659);
        c7659.m20211(40.0d, 440.0d, 8000.0d);
        C7659 c76510 = new C7659(1, "Amplitude", 1.0d);
        c4526.f16115 = c76510;
        c4526.m3818(c76510);
        C20359 c20359 = new C20359("Phase");
        c4526.f16113 = c20359;
        c4526.m3818(c20359);
        C21064 c21064 = new C21064(0);
        c4526.f16114 = c21064;
        c4526.m3818(c21064);
        this.f60420 = c4526;
        ((C3403) interfaceC16811).m10095(c4526);
        InterfaceC16810 interfaceC16812 = c19344.f62380;
        C14715 c14715 = new C14715();
        this.f60432 = c14715;
        ((C3403) interfaceC16812).m10095(c14715);
        this.f60432.f48131.m20210(0.02d);
        InterfaceC16810 interfaceC16813 = c19344.f62380;
        C14715 c14716 = new C14715();
        this.f60426 = c14716;
        ((C3403) interfaceC16813).m10095(c14716);
        this.f60426.f48131.m20210(0.02d);
        InterfaceC16810 interfaceC16814 = c19344.f62380;
        C11187 c11187 = new C11187();
        this.f60429 = c11187;
        ((C3403) interfaceC16814).m10095(c11187);
        this.f60429.f18144.m20210(1.0d);
        this.f60429.f37887.m20210(0.02d);
        InterfaceC16810 interfaceC16815 = c19344.f62380;
        C2013 c2013 = new C2013();
        this.f60430 = c2013;
        ((C3403) interfaceC16815).m10095(c2013);
        InterfaceC16810 interfaceC16816 = c19344.f62380;
        C9776 c9776 = new C9776();
        C7659 c76511 = new C7659("Input");
        c9776.f33475 = c76511;
        c9776.m3818(c76511);
        C7659 c76512 = new C7659("Pan");
        c9776.f33474 = c76512;
        c9776.m3818(c76512);
        c76512.m20211(-1.0d, 0.0d, 1.0d);
        C21064 c21065 = new C21064("Output");
        c9776.f33473 = c21065;
        c9776.m3818(c21065);
        this.f60423 = c9776;
        ((C3403) interfaceC16816).m10095(c9776);
        this.f60431.f12638.m20209();
        this.f60420.f16114.m47472(0, this.f60431.f12638, 0);
        this.f60420.f16115.m20210(0.0d);
        this.f60420.f16112.m20210(5.0d);
        this.f60429.f18143.m47472(0, this.f60430.f9683, 0);
        this.f60430.f9684.m47472(0, this.f60423.f33475, 0);
        this.f60423.f33473.m47472(0, c19344.f62381.f38946, 0);
        this.f60423.f33473.m47472(1, c19344.f62381.f38944, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43109(C18638 c18638, InterfaceC3820 interfaceC3820) {
        AbstractC0998 abstractC0998 = (AbstractC0998) interfaceC3820;
        C7659 c7659 = (C7659) abstractC0998.mo3813("FreqScaler");
        if (c7659 != null) {
            c7659.m36891();
            c18638.f60431.f12636.m47472(0, c7659, 0);
        }
        C7659 c76510 = (C7659) abstractC0998.mo3813("Timbre");
        if (c76510 != null) {
            c76510.m36891();
            c18638.f60432.f18143.m47472(0, c76510, 0);
            c18638.f60432.f18144.m20214(c76510);
        }
        C7659 c76511 = (C7659) abstractC0998.mo3813("Pressure");
        if (c76511 != null) {
            c76511.m36891();
            c18638.f60426.f18143.m47472(0, c76511, 0);
            c18638.f60426.f18144.m20214(c76511);
        }
        interfaceC3820.mo4743().m36891();
        interfaceC3820.mo4743().m47472(0, c18638.f60430.f9685, 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43119(int i) {
        if (this.f60421) {
            return;
        }
        int iM45414 = i % this.f60425.f28210.m45414();
        String str = this.f60425.f28210.m45413()[iM45414];
        this.f60419 = iM45414;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43113(int i) {
        C15879 c15879M10094 = ((C3403) this.f60424.f62380).m10094();
        C15817 c15817 = this.f60425.f28208;
        int i2 = (this.f60427 << 8) + i;
        ((C3403) c15817.m37596()).m10096(c15879M10094, new C7349(c15817, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43114(int i, double d) {
        C15879 c15879M10094 = ((C3403) this.f60424.f62380).m10094();
        double dM26028 = C10234.m26028(i);
        C15817 c15817 = this.f60425.f28208;
        ((C3403) c15817.m37596()).m10096(c15879M10094, new C10172(c15817, (this.f60427 << 8) + i, this.f60428, dM26028, d));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m43117(double d) {
        this.f60431.f12638.m20210(this.f60422 * d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43112(double d) {
        this.f60422 = d / 12.0d;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m43120(double d) {
        this.f60420.f16115.m20210(d);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m43110(double d) {
        this.f60429.f18144.m20210(Math.pow(63095.73444801944d, d) * 1.5848931924611107E-5d);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43118(double d) {
        this.f60423.f33474.m20210(d);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m43116(double d) {
        double dM20208 = this.f60432.f18144.m20208();
        this.f60432.f18144.m20210(((this.f60432.f18144.m20217() - dM20208) * d) + dM20208);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m43111(double d) {
        double dM20208 = this.f60426.f18144.m20208();
        this.f60426.f18144.m20210(Math.pow(this.f60426.f18144.m20217() / dM20208, d) * dM20208);
    }
}
