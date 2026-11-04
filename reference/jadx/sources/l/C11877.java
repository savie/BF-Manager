package l;

/* JADX INFO: renamed from: l.ۧ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4UE */
/* JADX INFO: loaded from: classes4.dex */
public final class C11877 extends AbstractC12384 implements InterfaceC7558, InterfaceC21839 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f38292 = EnumC7011.Format4rcc;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC10824 f38293;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f38294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC10824 f38295;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f38296;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " " + C24018.m53572(this) + ", " + getReference() + ", " + mo2769();
    }

    public C11877(EnumC22631 enumC22631, int i, int i2, InterfaceC10824 interfaceC10824, InterfaceC10824 interfaceC10825) {
        super(enumC22631);
        C6544.m18433(i);
        this.f38296 = i;
        C6544.m18436(i2);
        this.f38294 = i2;
        this.f38295 = interfaceC10824;
        this.f38293 = interfaceC10825;
    }

    @Override // l.InterfaceC24077
    /* JADX INFO: renamed from: ᩹ */
    public final int mo2772() {
        return this.f38296;
    }

    @Override // l.InterfaceC0210
    /* JADX INFO: renamed from: ۚ */
    public final int mo1655() {
        return this.f38294;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        return this.f38295;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f38295 = c8850.m23714(this.f38295);
        this.f38293 = c8850.m23714(this.f38293);
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        return this.f39756.f73513;
    }

    @Override // l.InterfaceC11396
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10824 mo2769() {
        return this.f38293;
    }

    @Override // l.InterfaceC11396
    /* JADX INFO: renamed from: ᩺ */
    public final int mo2773() {
        return this.f39756.f73510;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f38292;
    }
}
