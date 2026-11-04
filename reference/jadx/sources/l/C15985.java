package l;

import com.umeng.analytics.pro.i;

/* JADX INFO: renamed from: l.ܶۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8DT */
/* JADX INFO: loaded from: classes5.dex */
public final class C15985 extends AbstractC4053 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static double[] f51900 = new double[i.b];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4799 f51901;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13508 f51904;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public double f51903 = 0.0d;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f51902 = 1.0d;

    static {
        int i = 0;
        while (true) {
            double[] dArr = f51900;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = Math.pow(2.0d, ((double) i) / 2048.0d);
            i++;
        }
    }

    public C15985() {
        C13508 c13508 = new C13508("Input");
        this.f51904 = c13508;
        m13040(c13508);
        c13508.m33175(-8.0d, 0.0d, 8.0d);
        C4799 c4799 = new C4799(0);
        this.f51901 = c4799;
        m13040(c4799);
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2017() {
        double[] dArrM20606 = this.f51904.m20606();
        double[] dArrM20607 = this.f51901.m20606();
        for (int i = 0; i < 8; i++) {
            double d = dArrM20606[i];
            if (d == this.f51903) {
                dArrM20607[i] = this.f51902;
            } else {
                this.f51903 = d;
                int iFloor = (int) Math.floor(d);
                double d2 = (d - ((double) iFloor)) * 2048.0d;
                int i2 = (int) d2;
                double[] dArr = f51900;
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
                dArrM20607[i] = d4;
                this.f51902 = d4;
            }
        }
    }
}
