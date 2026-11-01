package l;

/* JADX INFO: renamed from: l.֨᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8DA */
/* JADX INFO: loaded from: classes3.dex */
public final class C1339 extends C16831 implements InterfaceC3820 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C7659 f5652;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2013 f5653;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C6643 f5654;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f5655;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C12577 f5656;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f5657;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6247 f5658;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23887 f5659;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22872 f5660;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7659 f5661;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7659 f5662;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C23213 f5663;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f5664;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6247 f5665;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C7659 f5666;

    public C1339(short[] sArr) {
        this.f5656 = new C12577(sArr);
        C2013 c2013 = new C2013();
        this.f5653 = c2013;
        C6643 c6643 = new C6643();
        this.f5654 = c6643;
        C22872 c22872 = new C22872();
        this.f5660 = c22872;
        C6247 c6247 = new C6247();
        this.f5658 = c6247;
        C6247 c6248 = new C6247();
        this.f5665 = c6248;
        C7659 c7659 = c6248.f21195;
        this.f5661 = c7659;
        C23887 c23887 = new C23887();
        C7659 c76510 = new C7659("Frequency");
        c23887.f77377 = c76510;
        c23887.m3818(c76510);
        c76510.m20211(40.0d, 400.0d, 6000.0d);
        C7659 c76511 = new C7659(1, "Amplitude", 1.0d);
        c23887.f77381 = c76511;
        c23887.m3818(c76511);
        C7659 c76512 = new C7659("Q");
        c23887.f77380 = c76512;
        c23887.m3818(c76512);
        c76512.m20211(0.1d, 1.0d, 10.0d);
        this.f5659 = c23887;
        C7659 c76513 = c2013.f9683;
        this.f5652 = c76513;
        C2013 c2014 = new C2013();
        C7659 c76514 = c2014.f9685;
        this.f5662 = c76514;
        C0602 c0602 = new C0602();
        C7659 c76515 = c0602.f9683;
        this.f5666 = c76515;
        C7659 c76516 = c2014.f9683;
        C2013 c2015 = new C2013();
        m39478(c2014);
        m39478(c2013);
        m39478(c2015);
        m39478(c6643);
        m39478(c22872);
        m39478(c6247);
        m39478(c6248);
        m39478(c23887);
        m39478(c0602);
        c6248.f72504.m47472(0, c0602.f9685, 0);
        c0602.f9684.m47472(0, c23887.f77377, 0);
        c2014.f9684.m47472(0, c6643.f22431, 0);
        c2013.f9684.m47472(0, c2015.f9685, 0);
        c2015.f9684.m47472(0, c6247.f21195, 0);
        m3817(c76513, "Amplitude");
        m3817(c76514, "Frequency");
        m3817(c76515, "Cutoff");
        m39479(c76515, "Timbre");
        m3817(c76516, "FreqScaler");
        m3817(c7659, "FilterEnvDepth");
        c6248.m17315(this, "Filter");
        c6247.m17315(this, "Amp");
        c76514.m20214(c6643.f22431);
        c76516.m20211(0.2d, 1.0d, 4.0d);
        c76515.m20214(c23887.f77377);
        c7659.m20211(-4000.0d, 2000.0d, 4000.0d);
        c6643.f22432.m20210(0.5d);
        c6247.f72505.m44784(this);
        c2015.f9683.m20211(1.0d, 1.0d, 4.0d);
        m39479(c2015.f9683, "Pressure");
        mo4745(0);
    }

    @Override // l.InterfaceC3820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4746(C15879 c15879) {
        if (this.f5663 == null) {
            return;
        }
        this.f5658.f72505.m44782(c15879);
        this.f5665.f72505.m44782(c15879);
        C23213 c23213 = this.f5663;
        c23213.getClass();
        int i = c23213.f75329;
        if ((i & 2) == 0 || (i & 1) == 0) {
            return;
        }
        int i2 = c23213.f75325;
        int i3 = i2 + 1;
        int i4 = this.f5664;
        if (i3 < i4) {
            int i5 = this.f5657 + i2;
            C18948 c18948 = this.f5654.f22424;
            c18948.m38175(c15879, c18948.m43647(this.f5656, i5, i4 - i5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    @Override // l.InterfaceC3820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4744(double d, double d2, C15879 c15879) {
        C23213 c23213;
        int i;
        C6643 c6643;
        C18948 c18948;
        C22872 c22872;
        int i2;
        C2013 c2013;
        int i3;
        C12577 c12577;
        int i4;
        int i5;
        double dM26027 = C10234.m26027(d);
        C23213 c23213M36980 = this.f5663;
        int i6 = (int) (0.5d + dM26027);
        if (c23213M36980 == null || c23213M36980.f75324 > i6 || c23213M36980.f75332 < i6) {
            int iM36979 = C15452.m36979(this.f5655);
            int i7 = iM36979;
            c23213M36980 = C15452.m36980(iM36979);
            while (true) {
                if ((c23213M36980.f75324 <= i6 && c23213M36980.f75332 >= i6) || (c23213M36980.f75329 & 32768) != 0) {
                    break;
                }
                i7++;
                c23213M36980 = C15452.m36980(i7);
            }
        }
        int i8 = c23213M36980.f75326;
        int i9 = c23213M36980.f75329 & 2;
        C6247 c6247 = this.f5665;
        C6247 c6248 = this.f5658;
        if (i9 == 0) {
            if (i8 >= 150) {
                c23213M36980 = null;
            } else {
                this.f5657 = C15452.m36975(i8);
                this.f5664 = C15452.m36978(i8);
            }
            c23213 = c23213M36980;
            this.f5663 = c23213;
            if (c23213 == null) {
                return;
            }
            i = c23213.f75329;
            double dPow = Math.pow(2.0d, C17745.m41305(c23213.f75330, 0.01d, dM26027, 12.0d)) * 22050.0d;
            double d3 = ((double) c23213.f75331) * 3.0517578125E-5d * d2 * d2 * 10.0d;
            this.f5662.m20212(dPow, c15879);
            this.f5652.m20212(d3, c15879);
            c6248.f72505.m44785(c15879);
            c6247.f72505.m44785(c15879);
            c6643 = this.f5654;
            C21064 c21064 = c6643.f22425;
            c18948 = c6643.f22424;
            c21064.m36891();
            c22872 = this.f5660;
            c22872.f74393.m36891();
            i2 = i & 2;
            c2013 = this.f5653;
            if (i2 != 0) {
                c22872.f74393.m47472(0, c2013.f9685, 0);
                return;
            }
            c6643.f22425.m47472(0, c2013.f9685, 0);
            c18948.m43648(c15879);
            i3 = i & 1;
            c12577 = this.f5656;
            if (i3 != 0) {
                i4 = this.f5657;
                i5 = c23213.f75328 + i4;
                int i10 = (c23213.f75325 + i4) - i5;
                if (i5 > i4) {
                    c18948.m38175(c15879, c18948.m43647(c12577, i4, i5 - i4));
                }
                c18948.m43649(c12577, i5, i10, c15879);
                return;
            }
            c18948.m38175(c15879, c18948.m43647(c12577, this.f5657, this.f5664));
        }
        this.f5657 = -1;
        this.f5664 = 0;
        C4161 c4161M36976 = C15452.m36976(c23213M36980.f75327);
        m4742(c4161M36976.f15203, c6248, c15879);
        m4742(c4161M36976.f15205, c6247, c15879);
        short s = c4161M36976.f15204;
        C7659 c7659 = this.f5666;
        if (s > 0) {
            c7659.m20210(C10234.m26028(((double) s) * 0.01d));
        } else {
            c7659.m20210(4000.0d);
        }
        c23213 = c23213M36980;
        this.f5663 = c23213;
        if (c23213 == null) {
            return;
        }
        i = c23213.f75329;
        double dPow2 = Math.pow(2.0d, C17745.m41305(c23213.f75330, 0.01d, dM26027, 12.0d)) * 22050.0d;
        double d4 = ((double) c23213.f75331) * 3.0517578125E-5d * d2 * d2 * 10.0d;
        this.f5662.m20212(dPow2, c15879);
        this.f5652.m20212(d4, c15879);
        c6248.f72505.m44785(c15879);
        c6247.f72505.m44785(c15879);
        c6643 = this.f5654;
        C21064 c21065 = c6643.f22425;
        c18948 = c6643.f22424;
        c21065.m36891();
        c22872 = this.f5660;
        c22872.f74393.m36891();
        i2 = i & 2;
        c2013 = this.f5653;
        if (i2 != 0) {
            c22872.f74393.m47472(0, c2013.f9685, 0);
            return;
        }
        c6643.f22425.m47472(0, c2013.f9685, 0);
        c18948.m43648(c15879);
        i3 = i & 1;
        c12577 = this.f5656;
        if (i3 != 0) {
            i4 = this.f5657;
            i5 = c23213.f75328 + i4;
            int i11 = (c23213.f75325 + i4) - i5;
            if (i5 > i4) {
                c18948.m38175(c15879, c18948.m43647(c12577, i4, i5 - i4));
            }
            c18948.m43649(c12577, i5, i11, c15879);
            return;
        }
        c18948.m38175(c15879, c18948.m43647(c12577, this.f5657, this.f5664));
    }

    @Override // l.InterfaceC12994
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21064 mo4743() {
        return this.f5658.f72504;
    }

    @Override // l.InterfaceC3820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4745(int i) {
        if (this.f5655 == i) {
            return;
        }
        C6247 c6247 = this.f5658;
        c6247.f21190.m20210(0.1d);
        c6247.f21201.m20210(0.9d);
        c6247.f21194.m20210(0.1d);
        c6247.f21192.m20210(0.1d);
        C6247 c6248 = this.f5665;
        c6248.f21190.m20210(0.01d);
        c6248.f21201.m20210(0.6d);
        c6248.f21194.m20210(0.4d);
        c6248.f21192.m20210(1.0d);
        C23887 c23887 = this.f5659;
        c23887.f77380.m20210(1.0d);
        C7659 c7659 = this.f5666;
        c7659.m20210(5000.0d);
        C7659 c76510 = this.f5661;
        c76510.m20210(500.0d);
        this.f5663 = null;
        this.f5655 = i;
        if (i == 0) {
            c6247.f21190.m20210(0.1d);
            c6247.f21201.m20210(0.9d);
            c6247.f21194.m20210(0.1d);
            c6247.f21192.m20210(0.1d);
            c7659.m20210(300.0d);
            c76510.m20210(500.0d);
            c23887.f77380.m20210(3.0d);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4742(C6984 c6984, C6247 c6247, C15879 c15879) {
        c6247.f21190.m20212(Math.max(0.005d, 4194304.0d / ((double) (c6984.f23491 * 22050))), c15879);
        c6247.f21201.m20212((Math.log(3.0517578125E-5d) * 128.0d) / (Math.log(((double) c6984.f23493) / 32768.0d) * 22050.0d), c15879);
        c6247.f21194.m20212(((double) c6984.f23490) * 3.0517578125E-5d, c15879);
        c6247.f21192.m20212(Math.max(0.02d, (Math.log(3.0517578125E-5d) * 128.0d) / (Math.log(((double) c6984.f23492) / 32768.0d) * 22050.0d)), c15879);
    }
}
