package l;

/* JADX INFO: renamed from: l.ۢܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4U4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10187 extends AbstractC1239 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f32605 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f32606;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f32607;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24975 f32608;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8565 f32609;

    public C10187(C24975 c24975, int i) {
        this.f32607 = -1;
        this.f32608 = c24975;
        C8565 c8565M8724 = c24975.m55818().m8724(i);
        this.f32609 = c8565M8724;
        int iM22996 = c8565M8724.m22996();
        this.f32606 = iM22996;
        if (this.f32605 >= iM22996) {
            this.f32607 = c8565M8724.m23001();
            c8565M8724.m22995();
        }
    }

    @Override // l.AbstractC1239
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC16791 mo4476() {
        int i = this.f32605;
        int i2 = this.f32606;
        if (i >= i2) {
            return null;
        }
        this.f32605 = i + 1;
        C24975 c24975 = this.f32608;
        C8565 c8565 = this.f32609;
        InterfaceC16791 interfaceC16791M49710 = AbstractC21976.m49710(c24975, c8565);
        if (this.f32605 >= i2) {
            this.f32607 = c8565.m23001();
            c8565.m22995();
        }
        return interfaceC16791M49710;
    }

    @Override // l.AbstractC1239
    /* JADX INFO: renamed from: ᩸ */
    public final void mo4477() {
        int i = this.f32605;
        int i2 = this.f32606;
        if (i < i2) {
            this.f32605 = i + 1;
            C8565 c8565 = this.f32609;
            AbstractC21976.m49711(c8565);
            if (this.f32605 >= i2) {
                this.f32607 = c8565.m23001();
                c8565.m22995();
            }
        }
    }

    @Override // l.AbstractC1239
    /* JADX INFO: renamed from: ۤ */
    public final int mo4475() {
        int i = this.f32607;
        return i == -1 ? this.f32609.m23001() : i;
    }

    @Override // l.AbstractC1239
    /* JADX INFO: renamed from: ۙ */
    public final int mo4474() {
        return this.f32606;
    }
}
