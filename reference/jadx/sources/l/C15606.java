package l;

/* JADX INFO: renamed from: l.ܳ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5T1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15606 extends AbstractC12384 implements InterfaceC14269, InterfaceC21839 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f50716 = EnumC7011.Format3rc;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f50717;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f50718;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC10824 f50719;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " " + C24018.m53572(this) + ", " + getReference();
    }

    public C15606(EnumC22631 enumC22631, int i, int i2, InterfaceC10824 interfaceC10824) {
        super(enumC22631);
        C6544.m18433(i);
        this.f50718 = i;
        C6544.m18436(i2);
        this.f50717 = i2;
        this.f50719 = interfaceC10824;
    }

    @Override // l.InterfaceC24077
    /* JADX INFO: renamed from: ᩹ */
    public final int mo2772() {
        return this.f50718;
    }

    @Override // l.InterfaceC0210
    /* JADX INFO: renamed from: ۚ */
    public final int mo1655() {
        return this.f50717;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        return this.f50719;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f50719 = c8850.m23714(this.f50719);
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        return this.f39756.f73513;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f50716;
    }
}
