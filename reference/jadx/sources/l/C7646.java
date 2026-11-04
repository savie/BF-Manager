package l;

/* JADX INFO: renamed from: l.۟ۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7646 extends AbstractC12384 implements InterfaceC5321, InterfaceC21839 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f25210 = EnumC7011.Format22c;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f25211;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f25212;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC10824 f25213;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", v" + mo1541() + ", " + getReference();
    }

    public C7646(EnumC22631 enumC22631, int i, int i2, InterfaceC10824 interfaceC10824) {
        super(enumC22631);
        C6544.m18432(i);
        this.f25211 = i;
        C6544.m18432(i2);
        this.f25212 = i2;
        this.f25213 = interfaceC10824;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f25211;
    }

    @Override // l.InterfaceC18109
    /* JADX INFO: renamed from: ۘ */
    public final int mo1541() {
        return this.f25212;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        return this.f25213;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f25213 = c8850.m23714(this.f25213);
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        return this.f39756.f73513;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f25210;
    }
}
