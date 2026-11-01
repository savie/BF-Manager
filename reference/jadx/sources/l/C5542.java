package l;

/* JADX INFO: renamed from: l.ۚᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78BU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5542 extends C13304 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public double f19004;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double[] f19005;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7659 f19006;

    public C5542(C7659 c7659, double d) {
        super(c7659, d);
        this.f19005 = new double[8];
        this.f19006 = c7659;
    }

    @Override // l.C13304
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final double mo15279() {
        return this.f19004;
    }

    @Override // l.C13304
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15280(double d) {
        this.f19004 = d;
        super.mo15280(d);
    }

    @Override // l.C13304
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final double[] mo15281() {
        double[] dArrMo15281;
        int i;
        double[] dArr;
        double[] dArrMo15282;
        int iM32793 = m32793();
        if (iM32793 == 0) {
            dArrMo15282 = super.mo15281();
        } else {
            if (this.f19006.m20215()) {
                dArrMo15281 = super.mo15281();
                i = 0;
            } else {
                dArrMo15281 = m32790(0).mo15281();
                i = 1;
            }
            int i2 = 0;
            while (true) {
                dArr = this.f19005;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArrMo15281[i2];
                i2++;
            }
            while (i < iM32793) {
                double[] dArrMo15283 = m32790(i).mo15281();
                for (int i3 = 0; i3 < dArr.length; i3++) {
                    dArr[i3] = dArr[i3] + dArrMo15283[i3];
                }
                i++;
            }
            dArrMo15282 = dArr;
        }
        this.f19004 = dArrMo15282[0];
        return dArrMo15282;
    }
}
