package l;

/* JADX INFO: renamed from: l.᩹ۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8C4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23445 extends AbstractC4053 implements InterfaceC21207 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10764 f75883;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C4799 f75884;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13508 f75885;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13508 f75886;

    @Override // l.InterfaceC21207
    /* JADX INFO: renamed from: ۙ */
    public final void mo44242(int i) {
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2017() {
        double[] dArrM20606 = this.f75885.m20606();
        double[] dArrM20607 = this.f75886.m20606();
        double[] dArrM20608 = this.f75884.m20606();
        C10764 c10764 = this.f75883;
        double dM27434 = c10764.m27434();
        for (int i = 0; i < 8; i++) {
            try {
                double dM37661 = dArrM20606[i] * this.f13796.m37661();
                if (dM37661 > 1.0d) {
                    dM37661 = 1.0d;
                } else if (dM37661 < -1.0d) {
                    dM37661 = -1.0d;
                }
                dM27434 += dM37661;
                if (dM27434 >= 1.0d) {
                    dM27434 -= 2.0d;
                } else if (dM27434 < -1.0d) {
                    dM27434 += 2.0d;
                }
                double d = (dM27434 > 0.5d ? 1.0d - dM27434 : dM27434 < -0.5d ? (-1.0d) - dM27434 : dM27434) * 3.141592653589793d;
                double d2 = d * d;
                dArrM20608[i] = (((((((((((-2.505210838544172E-8d) * d2) + 2.7557319223985893E-6d) * d2) - 1.984126984126984E-4d) * d2) + 0.008333333333333333d) * d2) - 0.16666666666666666d) * d2) + 1.0d) * d * dArrM20607[i];
            } catch (NullPointerException unused) {
                throw new NullPointerException("Null Synth! You probably forgot to add this unit to the Synthesizer!");
            }
        }
        c10764.m27433(dM27434);
    }

    @Override // l.InterfaceC14493
    /* JADX INFO: renamed from: ᩸ */
    public final C4799 mo35005() {
        return this.f75884;
    }

    @Override // l.InterfaceC21207
    /* JADX INFO: renamed from: ۙ */
    public final void mo44243(C4930 c4930) {
        this.f75886.m33176(0.0d, c4930);
    }

    @Override // l.InterfaceC21207
    /* JADX INFO: renamed from: ۙ */
    public final void mo44241(double d, double d2, C4930 c4930) {
        this.f75885.m33176(d, c4930);
        this.f75886.m33176(d2, c4930);
    }
}
