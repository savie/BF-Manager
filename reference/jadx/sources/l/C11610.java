package l;

/* JADX INFO: renamed from: l.ۧ۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11610 implements InterfaceC1916 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ C11610(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        switch (this.a) {
            case 0:
                int i = interfaceC1235.i(EnumC8692.DAY_OF_WEEK);
                int i2 = this.b;
                if (i == i2) {
                    return interfaceC1235;
                }
                int i3 = i - i2;
                return interfaceC1235.c(i3 >= 0 ? 7 - i3 : -i3, EnumC10183.DAYS);
            default:
                int i4 = interfaceC1235.i(EnumC8692.DAY_OF_WEEK);
                int i5 = this.b;
                if (i4 == i5) {
                    return interfaceC1235;
                }
                int i6 = i5 - i4;
                return interfaceC1235.z(i6 >= 0 ? 7 - i6 : -i6, EnumC10183.DAYS);
        }
    }
}
