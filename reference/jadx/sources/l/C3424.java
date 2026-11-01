package l;

import com.umeng.analytics.pro.i;

/* JADX INFO: renamed from: l.ۗᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8DT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3424 extends AbstractC0998 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static double[] f12634 = new double[i.b];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C21064 f12636;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7659 f12638;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double f12635 = 0.0d;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public double f12637 = 1.0d;

    static {
        int i = 0;
        while (true) {
            double[] dArr = f12634;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = Math.pow(2.0d, ((double) i) / 2048.0d);
            i++;
        }
    }

    public C3424() {
        C7659 c7659 = new C7659("Input");
        this.f12638 = c7659;
        m3818(c7659);
        c7659.m20211(-8.0d, 0.0d, 8.0d);
        C21064 c21064 = new C21064(0);
        this.f12636 = c21064;
        m3818(c21064);
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        double[] dArrM36893 = this.f12638.m36893();
        double[] dArrM36894 = this.f12636.m36893();
        for (int i = 0; i < 8; i++) {
            double d = dArrM36893[i];
            if (d == this.f12635) {
                dArrM36894[i] = this.f12637;
            } else {
                this.f12635 = d;
                int iFloor = (int) Math.floor(d);
                double d2 = (d - ((double) iFloor)) * 2048.0d;
                int i2 = (int) d2;
                double[] dArr = f12634;
                double d3 = dArr[i2];
                double d4 = ((dArr[i2 + 1] - d3) * (d2 - ((double) i2))) + d3;
                while (iFloor > 0) {
                    iFloor--;
                    d4 *= 2.0d;
                }
                while (iFloor < 0) {
                    iFloor++;
                    d4 *= 0.5d;
                }
                dArrM36894[i] = d4;
                this.f12637 = d4;
            }
        }
    }
}
