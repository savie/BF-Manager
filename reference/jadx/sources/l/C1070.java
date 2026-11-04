package l;

/* JADX INFO: renamed from: l.֨ۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes2.dex */
public final class C1070 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f3834;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C24937 f3836;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9272 f3837;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2561 f3838;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f3839;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15985 f3840;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C1816 f3841;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16731 f3843;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17477 f3844;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f3845;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23445 f3846;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C24937 f3847;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public double f3835 = 0.16666666666666666d;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC22503 f3842 = new C10018(this);

    public C1070(C2561 c2561, int i) {
        this.f3838 = c2561;
        this.f3845 = i;
        if (i == 9) {
            this.f3834 = true;
            this.f3839 = 128;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4014(C9272 c9272) {
        this.f3837 = c9272;
        C2561 c2561 = this.f3838;
        InterfaceC19475 interfaceC19475 = c2561.f8231;
        C15985 c15985 = new C15985();
        this.f3840 = c15985;
        ((C15745) interfaceC19475).m37655(c15985);
        InterfaceC19475 interfaceC19476 = c2561.f8231;
        C23445 c23445 = new C23445();
        C13508 c13508 = new C13508("Frequency");
        c23445.f75885 = c13508;
        c23445.m13040(c13508);
        c13508.m33175(40.0d, 440.0d, 8000.0d);
        C13508 c13509 = new C13508(1, "Amplitude", 1.0d);
        c23445.f75886 = c13509;
        c23445.m13040(c13509);
        C10764 c10764 = new C10764("Phase");
        c23445.f75883 = c10764;
        c23445.m13040(c10764);
        C4799 c4799 = new C4799(0);
        c23445.f75884 = c4799;
        c23445.m13040(c4799);
        this.f3846 = c23445;
        ((C15745) interfaceC19476).m37655(c23445);
        InterfaceC19475 interfaceC19477 = c2561.f8231;
        C24937 c24937 = new C24937();
        this.f3847 = c24937;
        ((C15745) interfaceC19477).m37655(c24937);
        this.f3847.f80711.m33174(0.02d);
        InterfaceC19475 interfaceC19478 = c2561.f8231;
        C24937 c24938 = new C24937();
        this.f3836 = c24938;
        ((C15745) interfaceC19478).m37655(c24938);
        this.f3836.f80711.m33174(0.02d);
        InterfaceC19475 interfaceC19479 = c2561.f8231;
        C1816 c1816 = new C1816();
        this.f3841 = c1816;
        ((C15745) interfaceC19479).m37655(c1816);
        this.f3841.f21357.m33174(1.0d);
        this.f3841.f6166.m33174(0.02d);
        InterfaceC19475 interfaceC194710 = c2561.f8231;
        C16731 c16731 = new C16731();
        this.f3843 = c16731;
        ((C15745) interfaceC194710).m37655(c16731);
        InterfaceC19475 interfaceC194711 = c2561.f8231;
        C17477 c17477 = new C17477();
        C13508 c135010 = new C13508("Input");
        c17477.f56816 = c135010;
        c17477.m13040(c135010);
        C13508 c135011 = new C13508("Pan");
        c17477.f56814 = c135011;
        c17477.m13040(c135011);
        c135011.m33175(-1.0d, 0.0d, 1.0d);
        C4799 c47910 = new C4799("Output");
        c17477.f56815 = c47910;
        c17477.m13040(c47910);
        this.f3844 = c17477;
        ((C15745) interfaceC194711).m37655(c17477);
        this.f3840.f51904.m33173();
        this.f3846.f75884.m14825(0, this.f3840.f51904, 0);
        this.f3846.f75886.m33174(0.0d);
        this.f3846.f75885.m33174(5.0d);
        this.f3841.f21356.m14825(0, this.f3843.f39422, 0);
        this.f3843.f39421.m14825(0, this.f3844.f56816, 0);
        this.f3844.f56815.m14825(0, c2561.f8232.f65558, 0);
        this.f3844.f56815.m14825(1, c2561.f8232.f65557, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4010(C1070 c1070, InterfaceC21207 interfaceC21207) {
        AbstractC4053 abstractC4053 = (AbstractC4053) interfaceC21207;
        C13508 c13508 = (C13508) abstractC4053.mo13034("FreqScaler");
        if (c13508 != null) {
            c13508.m20607();
            c1070.f3840.f51901.m14825(0, c13508, 0);
        }
        C13508 c13509 = (C13508) abstractC4053.mo13034("Timbre");
        if (c13509 != null) {
            c13509.m20607();
            c1070.f3847.f21356.m14825(0, c13509, 0);
            c1070.f3847.f21357.m33177(c13509);
        }
        C13508 c135010 = (C13508) abstractC4053.mo13034("Pressure");
        if (c135010 != null) {
            c135010.m20607();
            c1070.f3836.f21356.m14825(0, c135010, 0);
            c1070.f3836.f21357.m33177(c135010);
        }
        interfaceC21207.mo35005().m20607();
        interfaceC21207.mo35005().m14825(0, c1070.f3843.f39423, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4020(int i) {
        if (this.f3834) {
            return;
        }
        int iM27029 = i % this.f3837.f30168.m27029();
        String str = this.f3837.f30168.m27028()[iM27029];
        this.f3839 = iM27029;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4012(int i) {
        C4930 c4930M37654 = ((C15745) this.f3838.f8231).m37654();
        C21757 c21757 = this.f3837.f30166;
        int i2 = (this.f3845 << 8) + i;
        ((C15745) c21757.m49314()).m37656(c4930M37654, new C13747(c21757, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4013(int i, double d) {
        C4930 c4930M37654 = ((C15745) this.f3838.f8231).m37654();
        double dM22734 = C8462.m22734(i);
        C21757 c21757 = this.f3837.f30166;
        ((C15745) c21757.m49314()).m37656(c4930M37654, new C7036(c21757, (this.f3845 << 8) + i, this.f3842, dM22734, d));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4015(double d) {
        this.f3840.f51904.m33174(this.f3835 * d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4011(double d) {
        this.f3835 = d / 12.0d;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m4017(double d) {
        this.f3846.f75886.m33174(d);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m4016(double d) {
        this.f3841.f21357.m33174(Math.pow(63095.73444801944d, d) * 1.5848931924611107E-5d);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4019(double d) {
        this.f3844.f56814.m33174(d);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m4018(double d) {
        double dM33179 = this.f3847.f21357.m33179();
        this.f3847.f21357.m33174(((this.f3847.f21357.m33180() - dM33179) * d) + dM33179);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m4021(double d) {
        double dM33179 = this.f3836.f21357.m33179();
        this.f3836.f21357.m33174(Math.pow(this.f3836.f21357.m33180() / dM33179, d) * dM33179);
    }
}
