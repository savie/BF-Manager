package l;

/* JADX INFO: renamed from: l.ۚۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5545 extends AbstractC24191 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13508 f19268;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C13508 f19269;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13508 f19270;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C13508 f19271;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f19272;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC13002 f19273;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public double f19274;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13508 f19275;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13508 f19276;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public double f19277;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double f19278;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13508 f19279;

    public C5545() {
        C2322 c2322 = new C2322();
        this.f78338 = c2322;
        m13040(c2322);
        C4799 c4799 = new C4799(0);
        this.f78337 = c4799;
        m13040(c4799);
        this.f19273 = EnumC13002.IDLE;
        this.f19277 = 1.0d;
        C13508 c13508 = new C13508(1, "Delay", 0.0d);
        this.f19275 = c13508;
        m13040(c13508);
        c13508.m33175(0.0d, 0.0d, 2.0d);
        C13508 c13509 = new C13508(1, "Attack", 0.1d);
        this.f19268 = c13509;
        m13040(c13509);
        c13509.m33175(0.01d, 0.1d, 8.0d);
        C13508 c135010 = new C13508(1, "Hold", 0.0d);
        this.f19276 = c135010;
        m13040(c135010);
        c135010.m33175(0.0d, 0.0d, 2.0d);
        C13508 c135011 = new C13508(1, "Decay", 0.2d);
        this.f19279 = c135011;
        m13040(c135011);
        c135011.m33175(0.01d, 0.2d, 8.0d);
        C13508 c135012 = new C13508(1, "Sustain", 0.5d);
        this.f19271 = c135012;
        m13040(c135012);
        c135012.m33175(0.0d, 0.5d, 1.0d);
        C13508 c135013 = new C13508(1, "Release", 0.3d);
        this.f19269 = c135013;
        m13040(c135013);
        c135013.m33175(0.01d, 0.3d, 8.0d);
        C13508 c135014 = new C13508(1, "Amplitude", 1.0d);
        this.f19270 = c135014;
        m13040(c135014);
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2017() {
        double[] dArrM20606 = this.f19271.m20606();
        double[] dArrM20607 = this.f19270.m20606();
        double[] dArrM20608 = this.f78337.m20606();
        int i = 0;
        while (i < 8) {
            C2322 c2322 = this.f78338;
            boolean zM7828 = c2322.m7828(i);
            switch (C15239.f49722[this.f19273.ordinal()]) {
                case 1:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        dArrM20608[i] = this.f19278 * dArrM20607[i];
                        if (zM7828) {
                            m16463(i);
                        }
                        i++;
                        break;
                        break;
                    }
                    break;
                case 2:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        dArrM20608[i] = this.f19278 * dArrM20607[i];
                        if (c2322.m7829()) {
                            m16460(i);
                        }
                        double d = this.f19272 - 1.0d;
                        this.f19272 = d;
                        if (d <= 0.0d) {
                            m16462(i);
                        }
                        i++;
                        break;
                        break;
                        break;
                    }
                    break;
                case 3:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        double d2 = this.f19278 + this.f19274;
                        this.f19278 = d2;
                        if (d2 >= 1.0d) {
                            this.f19278 = 1.0d;
                            dArrM20608[i] = 1.0d * dArrM20607[i];
                            m16461(i);
                        } else {
                            dArrM20608[i] = d2 * dArrM20607[i];
                            if (c2322.m7829()) {
                                m16460(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 4:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        dArrM20608[i] = dArrM20607[i];
                        double d3 = this.f19272 - 1.0d;
                        this.f19272 = d3;
                        if (d3 <= 0.0d) {
                            m16459(i);
                        } else {
                            if (c2322.m7829()) {
                                m16460(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 5:
                    while (i < 8) {
                        double d4 = this.f19278;
                        dArrM20608[i] = dArrM20607[i] * d4;
                        double d5 = d4 * this.f19277;
                        this.f19278 = d5;
                        if (zM7828) {
                            m16463(i);
                        }
                        double d6 = dArrM20606[i];
                        if (d5 < d6) {
                            this.f19278 = d6;
                            this.f19273 = EnumC13002.SUSTAINING;
                        } else if (d5 < 1.5848931924611107E-5d) {
                            c2322.m7825();
                        } else {
                            if (c2322.m7829()) {
                                m16460(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 6:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        double d7 = dArrM20606[i];
                        this.f19278 = d7;
                        dArrM20608[i] = d7 * dArrM20607[i];
                        if (zM7828) {
                            m16463(i);
                        } else {
                            if (c2322.m7829()) {
                                m16460(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 7:
                    while (i < 8) {
                        double d8 = this.f19278;
                        dArrM20608[i] = dArrM20607[i] * d8;
                        double d9 = d8 * this.f19277;
                        this.f19278 = d9;
                        if (zM7828) {
                            m16463(i);
                        } else if (d9 < 1.5848931924611107E-5d) {
                            c2322.m7825();
                        } else {
                            i++;
                        }
                        break;
                    }
                    break;
                default:
                    continue;
            }
            this.f19273 = EnumC13002.IDLE;
            this.f19278 = 0.0d;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m16463(int i) {
        double d = this.f19275.m20606()[i];
        if (d <= 0.0d) {
            m16462(i);
        } else {
            this.f19272 = (int) (d * ((double) this.f13796.m37665()));
            this.f19273 = EnumC13002.DELAYING;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m16462(int i) {
        double d = this.f19268.m20606()[i];
        if (d < 1.0E-5d) {
            this.f19278 = 1.0d;
            m16461(i);
        } else {
            this.f19274 = this.f13796.m37658() / d;
            this.f19273 = EnumC13002.ATTACKING;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m16461(int i) {
        double d = this.f19276.m20606()[i];
        if (d <= 0.0d) {
            m16459(i);
        } else {
            this.f19272 = (int) (d * ((double) this.f13796.m37665()));
            this.f19273 = EnumC13002.HOLDING;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m16459(int i) {
        double d = this.f19279.m20606()[i];
        if (d >= 1.0E-5d) {
            this.f19277 = this.f13796.m37653(d);
            this.f19273 = EnumC13002.DECAYING;
        } else {
            this.f19273 = EnumC13002.SUSTAINING;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m16460(int i) {
        double d = this.f19269.m20606()[i];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        this.f19277 = this.f13796.m37653(d);
        this.f19273 = EnumC13002.RELEASING;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16464(C19715 c19715, String str) {
        StringBuilder sbM27333 = C10732.m27333(str);
        C13508 c13508 = this.f19268;
        sbM27333.append(c13508.m49675());
        c19715.m13037(c13508, sbM27333.toString());
        StringBuilder sbM27334 = C10732.m27333(str);
        C13508 c13509 = this.f19279;
        sbM27334.append(c13509.m49675());
        c19715.m13037(c13509, sbM27334.toString());
        StringBuilder sbM27335 = C10732.m27333(str);
        C13508 c135010 = this.f19271;
        sbM27335.append(c135010.m49675());
        c19715.m13037(c135010, sbM27335.toString());
        StringBuilder sbM27336 = C10732.m27333(str);
        C13508 c135011 = this.f19269;
        sbM27336.append(c135011.m49675());
        c19715.m13037(c135011, sbM27336.toString());
    }
}
