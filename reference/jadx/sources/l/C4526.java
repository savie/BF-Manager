package l;

/* JADX INFO: renamed from: l.ۙ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8C4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4526 extends AbstractC0998 implements InterfaceC3820 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C7659 f16112;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C20359 f16113;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21064 f16114;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7659 f16115;

    @Override // l.InterfaceC3820
    /* JADX INFO: renamed from: ۙ */
    public final void mo4745(int i) {
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        double[] dArrM36893 = this.f16112.m36893();
        double[] dArrM36894 = this.f16115.m36893();
        double[] dArrM36895 = this.f16114.m36893();
        C20359 c20359 = this.f16113;
        double dM45936 = c20359.m45936();
        for (int i = 0; i < 8; i++) {
            try {
                double dM10097 = dArrM36893[i] * this.f4666.m10097();
                if (dM10097 > 1.0d) {
                    dM10097 = 1.0d;
                } else if (dM10097 < -1.0d) {
                    dM10097 = -1.0d;
                }
                dM45936 += dM10097;
                if (dM45936 >= 1.0d) {
                    dM45936 -= 2.0d;
                } else if (dM45936 < -1.0d) {
                    dM45936 += 2.0d;
                }
                double d = (dM45936 > 0.5d ? 1.0d - dM45936 : dM45936 < -0.5d ? (-1.0d) - dM45936 : dM45936) * 3.141592653589793d;
                double d2 = d * d;
                dArrM36895[i] = (((((((((((-2.505210838544172E-8d) * d2) + 2.7557319223985893E-6d) * d2) - 1.984126984126984E-4d) * d2) + 0.008333333333333333d) * d2) - 0.16666666666666666d) * d2) + 1.0d) * d * dArrM36894[i];
            } catch (NullPointerException unused) {
                throw new NullPointerException("Null Synth! You probably forgot to add this unit to the Synthesizer!");
            }
        }
        c20359.m45937(dM45936);
    }

    @Override // l.InterfaceC12994
    /* JADX INFO: renamed from: ۖ */
    public final C21064 mo4743() {
        return this.f16114;
    }

    @Override // l.InterfaceC3820
    /* JADX INFO: renamed from: ۙ */
    public final void mo4746(C15879 c15879) {
        this.f16115.m20212(0.0d, c15879);
    }

    @Override // l.InterfaceC3820
    /* JADX INFO: renamed from: ۙ */
    public final void mo4744(double d, double d2, C15879 c15879) {
        this.f16112.m20212(d, c15879);
        this.f16115.m20212(d2, c15879);
    }
}
