package l;

/* JADX INFO: renamed from: l.ܿ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17351 implements InterfaceC12413 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ C17351(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        switch (this.a) {
            case 0:
                int iL = interfaceC15235.l(EnumC18762.DAY_OF_WEEK);
                int i = this.b;
                if (iL == i) {
                    return interfaceC15235;
                }
                int i2 = iL - i;
                return interfaceC15235.d(i2 >= 0 ? 7 - i2 : -i2, EnumC22996.DAYS);
            default:
                int iL2 = interfaceC15235.l(EnumC18762.DAY_OF_WEEK);
                int i3 = this.b;
                if (iL2 == i3) {
                    return interfaceC15235;
                }
                int i4 = i3 - iL2;
                return interfaceC15235.w(i4 >= 0 ? 7 - i4 : -i4, EnumC22996.DAYS);
        }
    }
}
