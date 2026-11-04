package l;

/* JADX INFO: renamed from: l.ᩳܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8DA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19114 extends C19715 implements InterfaceC21207 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13508 f61863;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f61864;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f61865;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5545 f61866;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f61867;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16731 f61868;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14999 f61869;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0324 f61870;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C13508 f61871;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11510 f61872;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5545 f61873;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C2706 f61874;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13508 f61875;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C18223 f61876;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13508 f61877;

    public C19114(short[] sArr) {
        this.f61869 = new C14999(sArr);
        C16731 c16731 = new C16731();
        this.f61868 = c16731;
        C18223 c18223 = new C18223();
        this.f61876 = c18223;
        C0324 c0324 = new C0324();
        this.f61870 = c0324;
        C5545 c5545 = new C5545();
        this.f61866 = c5545;
        C5545 c5546 = new C5545();
        this.f61873 = c5546;
        C13508 c13508 = c5546.f19270;
        this.f61871 = c13508;
        C11510 c11510 = new C11510();
        C13508 c13509 = new C13508("Frequency");
        c11510.f36211 = c13509;
        c11510.m13040(c13509);
        c13509.m33175(40.0d, 400.0d, 6000.0d);
        C13508 c135010 = new C13508(1, "Amplitude", 1.0d);
        c11510.f36219 = c135010;
        c11510.m13040(c135010);
        C13508 c135011 = new C13508("Q");
        c11510.f36213 = c135011;
        c11510.m13040(c135011);
        c135011.m33175(0.1d, 1.0d, 10.0d);
        this.f61872 = c11510;
        C13508 c135012 = c16731.f39422;
        this.f61863 = c135012;
        C16731 c16732 = new C16731();
        C13508 c135013 = c16732.f39423;
        this.f61875 = c135013;
        C22699 c22699 = new C22699();
        C13508 c135014 = c22699.f39422;
        this.f61877 = c135014;
        C13508 c135015 = c16732.f39422;
        C16731 c16733 = new C16731();
        m45408(c16732);
        m45408(c16731);
        m45408(c16733);
        m45408(c18223);
        m45408(c0324);
        m45408(c5545);
        m45408(c5546);
        m45408(c11510);
        m45408(c22699);
        c5546.f78337.m14825(0, c22699.f39423, 0);
        c22699.f39421.m14825(0, c11510.f36211, 0);
        c16732.f39421.m14825(0, c18223.f59488, 0);
        c16731.f39421.m14825(0, c16733.f39423, 0);
        c16733.f39421.m14825(0, c5545.f19270, 0);
        m13037(c135012, "Amplitude");
        m13037(c135013, "Frequency");
        m13037(c135014, "Cutoff");
        m45409(c135014, "Timbre");
        m13037(c135015, "FreqScaler");
        m13037(c13508, "FilterEnvDepth");
        c5546.m16464(this, "Filter");
        c5545.m16464(this, "Amp");
        c135013.m33177(c18223.f59488);
        c135015.m33175(0.2d, 1.0d, 4.0d);
        c135014.m33177(c11510.f36211);
        c13508.m33175(-4000.0d, 2000.0d, 4000.0d);
        c18223.f59485.m33174(0.5d);
        c5545.f78338.m7826(this);
        c16733.f39422.m33175(1.0d, 1.0d, 4.0d);
        m45409(c16733.f39422, "Pressure");
        mo44242(0);
    }

    @Override // l.InterfaceC21207
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo44243(C4930 c4930) {
        if (this.f61874 == null) {
            return;
        }
        this.f61866.f78338.m7824(c4930);
        this.f61873.f78338.m7824(c4930);
        C2706 c2706 = this.f61874;
        c2706.getClass();
        int i = c2706.f8600;
        if ((i & 2) == 0 || (i & 1) == 0) {
            return;
        }
        int i2 = c2706.f8605;
        int i3 = i2 + 1;
        int i4 = this.f61865;
        if (i3 < i4) {
            int i5 = this.f61867 + i2;
            C0830 c0830 = this.f61876.f59480;
            c0830.m49678(c4930, c0830.m3325(this.f61869, i5, i4 - i5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    @Override // l.InterfaceC21207
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo44241(double d, double d2, C4930 c4930) {
        C2706 c2706;
        int i;
        C18223 c18223;
        C0830 c0830;
        C0324 c0324;
        int i2;
        C16731 c16731;
        int i3;
        C14999 c14999;
        int i4;
        int i5;
        double dM22733 = C8462.m22733(d);
        C2706 c2706M23356 = this.f61874;
        int i6 = (int) (0.5d + dM22733);
        if (c2706M23356 == null || c2706M23356.f8601 > i6 || c2706M23356.f8602 < i6) {
            int iM23354 = C8672.m23354(this.f61864);
            int i7 = iM23354;
            c2706M23356 = C8672.m23356(iM23354);
            while (true) {
                if ((c2706M23356.f8601 <= i6 && c2706M23356.f8602 >= i6) || (c2706M23356.f8600 & 32768) != 0) {
                    break;
                }
                i7++;
                c2706M23356 = C8672.m23356(i7);
            }
        }
        int i8 = c2706M23356.f8597;
        int i9 = c2706M23356.f8600 & 2;
        C5545 c5545 = this.f61873;
        C5545 c5546 = this.f61866;
        if (i9 == 0) {
            if (i8 >= 150) {
                c2706M23356 = null;
            } else {
                this.f61867 = C8672.m23357(i8);
                this.f61865 = C8672.m23355(i8);
            }
            c2706 = c2706M23356;
            this.f61874 = c2706;
            if (c2706 == null) {
                return;
            }
            i = c2706.f8600;
            double dPow = Math.pow(2.0d, C22972.m51847(c2706.f8599, 0.01d, dM22733, 12.0d)) * 22050.0d;
            double d3 = ((double) c2706.f8604) * 3.0517578125E-5d * d2 * d2 * 10.0d;
            this.f61875.m33176(dPow, c4930);
            this.f61863.m33176(d3, c4930);
            c5546.f78338.m7827(c4930);
            c5545.f78338.m7827(c4930);
            c18223 = this.f61876;
            C4799 c4799 = c18223.f59483;
            c0830 = c18223.f59480;
            c4799.m20607();
            c0324 = this.f61870;
            c0324.f1764.m20607();
            i2 = i & 2;
            c16731 = this.f61868;
            if (i2 != 0) {
                c0324.f1764.m14825(0, c16731.f39423, 0);
                return;
            }
            c18223.f59483.m14825(0, c16731.f39423, 0);
            c0830.m3326(c4930);
            i3 = i & 1;
            c14999 = this.f61869;
            if (i3 != 0) {
                i4 = this.f61867;
                i5 = c2706.f8603 + i4;
                int i10 = (c2706.f8605 + i4) - i5;
                if (i5 > i4) {
                    c0830.m49678(c4930, c0830.m3325(c14999, i4, i5 - i4));
                }
                c0830.m3327(c14999, i5, i10, c4930);
                return;
            }
            c0830.m49678(c4930, c0830.m3325(c14999, this.f61867, this.f61865));
        }
        this.f61867 = -1;
        this.f61865 = 0;
        C1215 c1215M23352 = C8672.m23352(c2706M23356.f8598);
        m44240(c1215M23352.f4448, c5546, c4930);
        m44240(c1215M23352.f4450, c5545, c4930);
        short s = c1215M23352.f4449;
        C13508 c13508 = this.f61877;
        if (s > 0) {
            c13508.m33174(C8462.m22734(((double) s) * 0.01d));
        } else {
            c13508.m33174(4000.0d);
        }
        c2706 = c2706M23356;
        this.f61874 = c2706;
        if (c2706 == null) {
            return;
        }
        i = c2706.f8600;
        double dPow2 = Math.pow(2.0d, C22972.m51847(c2706.f8599, 0.01d, dM22733, 12.0d)) * 22050.0d;
        double d4 = ((double) c2706.f8604) * 3.0517578125E-5d * d2 * d2 * 10.0d;
        this.f61875.m33176(dPow2, c4930);
        this.f61863.m33176(d4, c4930);
        c5546.f78338.m7827(c4930);
        c5545.f78338.m7827(c4930);
        c18223 = this.f61876;
        C4799 c47910 = c18223.f59483;
        c0830 = c18223.f59480;
        c47910.m20607();
        c0324 = this.f61870;
        c0324.f1764.m20607();
        i2 = i & 2;
        c16731 = this.f61868;
        if (i2 != 0) {
            c0324.f1764.m14825(0, c16731.f39423, 0);
            return;
        }
        c18223.f59483.m14825(0, c16731.f39423, 0);
        c0830.m3326(c4930);
        i3 = i & 1;
        c14999 = this.f61869;
        if (i3 != 0) {
            i4 = this.f61867;
            i5 = c2706.f8603 + i4;
            int i11 = (c2706.f8605 + i4) - i5;
            if (i5 > i4) {
                c0830.m49678(c4930, c0830.m3325(c14999, i4, i5 - i4));
            }
            c0830.m3327(c14999, i5, i11, c4930);
            return;
        }
        c0830.m49678(c4930, c0830.m3325(c14999, this.f61867, this.f61865));
    }

    @Override // l.InterfaceC14493
    /* JADX INFO: renamed from: ᩸ */
    public final C4799 mo35005() {
        return this.f61866.f78337;
    }

    @Override // l.InterfaceC21207
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo44242(int i) {
        if (this.f61864 == i) {
            return;
        }
        C5545 c5545 = this.f61866;
        c5545.f19268.m33174(0.1d);
        c5545.f19279.m33174(0.9d);
        c5545.f19271.m33174(0.1d);
        c5545.f19269.m33174(0.1d);
        C5545 c5546 = this.f61873;
        c5546.f19268.m33174(0.01d);
        c5546.f19279.m33174(0.6d);
        c5546.f19271.m33174(0.4d);
        c5546.f19269.m33174(1.0d);
        C11510 c11510 = this.f61872;
        c11510.f36213.m33174(1.0d);
        C13508 c13508 = this.f61877;
        c13508.m33174(5000.0d);
        C13508 c13509 = this.f61871;
        c13509.m33174(500.0d);
        this.f61874 = null;
        this.f61864 = i;
        if (i == 0) {
            c5545.f19268.m33174(0.1d);
            c5545.f19279.m33174(0.9d);
            c5545.f19271.m33174(0.1d);
            c5545.f19269.m33174(0.1d);
            c13508.m33174(300.0d);
            c13509.m33174(500.0d);
            c11510.f36213.m33174(3.0d);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44240(C9417 c9417, C5545 c5545, C4930 c4930) {
        c5545.f19268.m33176(Math.max(0.005d, 4194304.0d / ((double) (c9417.f30554 * 22050))), c4930);
        c5545.f19279.m33176((Math.log(3.0517578125E-5d) * 128.0d) / (Math.log(((double) c9417.f30556) / 32768.0d) * 22050.0d), c4930);
        c5545.f19271.m33176(((double) c9417.f30557) * 3.0517578125E-5d, c4930);
        c5545.f19269.m33176(Math.max(0.02d, (Math.log(3.0517578125E-5d) * 128.0d) / (Math.log(((double) c9417.f30555) / 32768.0d) * 22050.0d)), c4930);
    }
}
