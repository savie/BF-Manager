package l;

/* JADX INFO: renamed from: l.֡ۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0324 extends AbstractC4053 implements InterfaceC14493 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8527 f1763 = new C8527();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4799 f1764;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13508 f1765;

    public C0324() {
        C13508 c13508 = new C13508(1, "Amplitude", 1.0d);
        this.f1765 = c13508;
        m13040(c13508);
        C4799 c4799 = new C4799(0);
        this.f1764 = c4799;
        m13040(c4799);
    }

    @Override // l.AbstractC4053
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo2017() {
        double[] dArrM20606 = this.f1765.m20606();
        double[] dArrM20607 = this.f1764.m20606();
        for (int i = 0; i < 8; i++) {
            dArrM20607[i] = this.f1763.m22840() * dArrM20606[i];
        }
    }
}
