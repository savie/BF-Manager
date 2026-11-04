package l;

/* JADX INFO: renamed from: l.ۜۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: B58A */
/* JADX INFO: loaded from: classes3.dex */
public final class C6900 extends AbstractC12384 implements InterfaceC23221, InterfaceC21839 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f22876 = EnumC7011.Format31c;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f22877;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC10824 f22878;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", " + getReference();
    }

    public C6900(EnumC22631 enumC22631, int i, InterfaceC10824 interfaceC10824) {
        super(enumC22631);
        C6544.m18435(i);
        this.f22877 = i;
        this.f22878 = interfaceC10824;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f22877;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        return this.f22878;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f22878 = c8850.m23714(this.f22878);
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        return this.f39756.f73513;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f22876;
    }
}
