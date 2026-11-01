package l;

/* JADX INFO: renamed from: l.᩺۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22872 extends AbstractC0998 implements InterfaceC12994 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C21064 f74393;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8761 f74394 = new C8761();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7659 f74395;

    public C22872() {
        C7659 c7659 = new C7659(1, "Amplitude", 1.0d);
        this.f74395 = c7659;
        m3818(c7659);
        C21064 c21064 = new C21064(0);
        this.f74393 = c21064;
        m3818(c21064);
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        double[] dArrM36893 = this.f74395.m36893();
        double[] dArrM36894 = this.f74393.m36893();
        for (int i = 0; i < 8; i++) {
            dArrM36894[i] = this.f74394.m22765() * dArrM36893[i];
        }
    }
}
