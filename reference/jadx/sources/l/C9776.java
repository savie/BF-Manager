package l;

/* JADX INFO: renamed from: l.ۢᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9776 extends AbstractC0998 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C21064 f33473;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7659 f33474;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7659 f33475;

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        double[] dArrM36893 = this.f33475.m36893();
        double[] dArrM36894 = this.f33474.m36893();
        C21064 c21064 = this.f33473;
        double[] dArrM36892 = c21064.m36892(0);
        double[] dArrM36895 = c21064.m36892(1);
        for (int i = 0; i < 8; i++) {
            double d = (dArrM36894[i] * 0.5d) + 0.5d;
            double d2 = dArrM36893[i];
            dArrM36892[i] = (1.0d - d) * d2;
            dArrM36895[i] = d2 * d;
        }
    }
}
