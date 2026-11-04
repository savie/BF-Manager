package l;

/* JADX INFO: renamed from: l.ۛ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78BU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6051 extends C14253 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13508 f20698;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double[] f20699;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f20700;

    public C6051(C13508 c13508, double d) {
        super(c13508, d);
        this.f20699 = new double[8];
        this.f20698 = c13508;
    }

    @Override // l.C14253
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final double mo17566() {
        return this.f20700;
    }

    @Override // l.C14253
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17564(double d) {
        this.f20700 = d;
        super.mo17564(d);
    }

    @Override // l.C14253
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final double[] mo17565() {
        double[] dArrMo17565;
        int i;
        double[] dArr;
        double[] dArrMo17566;
        int iM34597 = m34597();
        if (iM34597 == 0) {
            dArrMo17566 = super.mo17565();
        } else {
            if (this.f20698.m33178()) {
                dArrMo17565 = super.mo17565();
                i = 0;
            } else {
                dArrMo17565 = m34594(0).mo17565();
                i = 1;
            }
            int i2 = 0;
            while (true) {
                dArr = this.f20699;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArrMo17565[i2];
                i2++;
            }
            while (i < iM34597) {
                double[] dArrMo17567 = m34594(i).mo17565();
                for (int i3 = 0; i3 < dArr.length; i3++) {
                    dArr[i3] = dArr[i3] + dArrMo17567[i3];
                }
                i++;
            }
            dArrMo17566 = dArr;
        }
        this.f20700 = dArrMo17566[0];
        return dArrMo17566;
    }
}
