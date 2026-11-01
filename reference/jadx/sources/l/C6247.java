package l;

/* JADX INFO: renamed from: l.ۛᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6247 extends AbstractC22166 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C7659 f21190;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f21191;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7659 f21192;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public EnumC17536 f21193;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7659 f21194;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7659 f21195;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7659 f21196;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f21197;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f21198;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public double f21199;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7659 f21200;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C7659 f21201;

    public C6247() {
        C19654 c19654 = new C19654();
        this.f72505 = c19654;
        m3818(c19654);
        C21064 c21064 = new C21064(0);
        this.f72504 = c21064;
        m3818(c21064);
        this.f21193 = EnumC17536.IDLE;
        this.f21199 = 1.0d;
        C7659 c7659 = new C7659(1, "Delay", 0.0d);
        this.f21196 = c7659;
        m3818(c7659);
        c7659.m20211(0.0d, 0.0d, 2.0d);
        C7659 c76510 = new C7659(1, "Attack", 0.1d);
        this.f21190 = c76510;
        m3818(c76510);
        c76510.m20211(0.01d, 0.1d, 8.0d);
        C7659 c76511 = new C7659(1, "Hold", 0.0d);
        this.f21200 = c76511;
        m3818(c76511);
        c76511.m20211(0.0d, 0.0d, 2.0d);
        C7659 c76512 = new C7659(1, "Decay", 0.2d);
        this.f21201 = c76512;
        m3818(c76512);
        c76512.m20211(0.01d, 0.2d, 8.0d);
        C7659 c76513 = new C7659(1, "Sustain", 0.5d);
        this.f21194 = c76513;
        m3818(c76513);
        c76513.m20211(0.0d, 0.5d, 1.0d);
        C7659 c76514 = new C7659(1, "Release", 0.3d);
        this.f21192 = c76514;
        m3818(c76514);
        c76514.m20211(0.01d, 0.3d, 8.0d);
        C7659 c76515 = new C7659(1, "Amplitude", 1.0d);
        this.f21195 = c76515;
        m3818(c76515);
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        double[] dArrM36893 = this.f21194.m36893();
        double[] dArrM36894 = this.f21195.m36893();
        double[] dArrM36895 = this.f72504.m36893();
        int i = 0;
        while (i < 8) {
            C19654 c19654 = this.f72505;
            boolean zM44786 = c19654.m44786(i);
            switch (C12598.f42105[this.f21193.ordinal()]) {
                case 1:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        dArrM36895[i] = this.f21198 * dArrM36894[i];
                        if (zM44786) {
                            m17310(i);
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
                        dArrM36895[i] = this.f21198 * dArrM36894[i];
                        if (c19654.m44787()) {
                            m17314(i);
                        }
                        double d = this.f21191 - 1.0d;
                        this.f21191 = d;
                        if (d <= 0.0d) {
                            m17313(i);
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
                        double d2 = this.f21198 + this.f21197;
                        this.f21198 = d2;
                        if (d2 >= 1.0d) {
                            this.f21198 = 1.0d;
                            dArrM36895[i] = 1.0d * dArrM36894[i];
                            m17311(i);
                        } else {
                            dArrM36895[i] = d2 * dArrM36894[i];
                            if (c19654.m44787()) {
                                m17314(i);
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
                        dArrM36895[i] = dArrM36894[i];
                        double d3 = this.f21191 - 1.0d;
                        this.f21191 = d3;
                        if (d3 <= 0.0d) {
                            m17312(i);
                        } else {
                            if (c19654.m44787()) {
                                m17314(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 5:
                    while (i < 8) {
                        double d4 = this.f21198;
                        dArrM36895[i] = dArrM36894[i] * d4;
                        double d5 = d4 * this.f21199;
                        this.f21198 = d5;
                        if (zM44786) {
                            m17310(i);
                        }
                        double d6 = dArrM36893[i];
                        if (d5 < d6) {
                            this.f21198 = d6;
                            this.f21193 = EnumC17536.SUSTAINING;
                        } else if (d5 < 1.5848931924611107E-5d) {
                            c19654.m44783();
                        } else {
                            if (c19654.m44787()) {
                                m17314(i);
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
                        double d7 = dArrM36893[i];
                        this.f21198 = d7;
                        dArrM36895[i] = d7 * dArrM36894[i];
                        if (zM44786) {
                            m17310(i);
                        } else {
                            if (c19654.m44787()) {
                                m17314(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 7:
                    while (i < 8) {
                        double d8 = this.f21198;
                        dArrM36895[i] = dArrM36894[i] * d8;
                        double d9 = d8 * this.f21199;
                        this.f21198 = d9;
                        if (zM44786) {
                            m17310(i);
                        } else if (d9 < 1.5848931924611107E-5d) {
                            c19654.m44783();
                        } else {
                            i++;
                        }
                        break;
                    }
                    break;
                default:
                    continue;
            }
            this.f21193 = EnumC17536.IDLE;
            this.f21198 = 0.0d;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m17310(int i) {
        double d = this.f21196.m36893()[i];
        if (d <= 0.0d) {
            m17313(i);
        } else {
            this.f21191 = (int) (d * ((double) this.f4666.m10091()));
            this.f21193 = EnumC17536.DELAYING;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m17313(int i) {
        double d = this.f21190.m36893()[i];
        if (d < 1.0E-5d) {
            this.f21198 = 1.0d;
            m17311(i);
        } else {
            this.f21197 = this.f4666.m10098() / d;
            this.f21193 = EnumC17536.ATTACKING;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m17311(int i) {
        double d = this.f21200.m36893()[i];
        if (d <= 0.0d) {
            m17312(i);
        } else {
            this.f21191 = (int) (d * ((double) this.f4666.m10091()));
            this.f21193 = EnumC17536.HOLDING;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m17312(int i) {
        double d = this.f21201.m36893()[i];
        if (d >= 1.0E-5d) {
            this.f21199 = this.f4666.m10093(d);
            this.f21193 = EnumC17536.DECAYING;
        } else {
            this.f21193 = EnumC17536.SUSTAINING;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m17314(int i) {
        double d = this.f21192.m36893()[i];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        this.f21199 = this.f4666.m10093(d);
        this.f21193 = EnumC17536.RELEASING;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17315(C16831 c16831, String str) {
        StringBuilder sbM23356 = C9023.m23356(str);
        C7659 c7659 = this.f21190;
        sbM23356.append(c7659.m38171());
        c16831.m3817(c7659, sbM23356.toString());
        StringBuilder sbM23357 = C9023.m23356(str);
        C7659 c76510 = this.f21201;
        sbM23357.append(c76510.m38171());
        c16831.m3817(c76510, sbM23357.toString());
        StringBuilder sbM23358 = C9023.m23356(str);
        C7659 c76511 = this.f21194;
        sbM23358.append(c76511.m38171());
        c16831.m3817(c76511, sbM23358.toString());
        StringBuilder sbM23359 = C9023.m23356(str);
        C7659 c76512 = this.f21192;
        sbM23359.append(c76512.m38171());
        c16831.m3817(c76512, sbM23359.toString());
    }
}
