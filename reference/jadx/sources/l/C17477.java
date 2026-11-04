package l;

/* JADX INFO: renamed from: l.ܽۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8DC */
/* JADX INFO: loaded from: classes5.dex */
public final class C17477 extends AbstractC4053 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13508 f56814;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4799 f56815;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13508 f56816;

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2017() {
        double[] dArrM20606 = this.f56816.m20606();
        double[] dArrM20607 = this.f56814.m20606();
        C4799 c4799 = this.f56815;
        double[] dArrM20605 = c4799.m20605(0);
        double[] dArrM20608 = c4799.m20605(1);
        for (int i = 0; i < 8; i++) {
            double d = (dArrM20607[i] * 0.5d) + 0.5d;
            double d2 = dArrM20606[i];
            dArrM20605[i] = (1.0d - d) * d2;
            dArrM20608[i] = d2 * d;
        }
    }
}
