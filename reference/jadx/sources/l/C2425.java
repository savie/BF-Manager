package l;

/* JADX INFO: renamed from: l.ۖۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2589 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2425 extends AbstractC12384 implements InterfaceC17253 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f7760 = EnumC7011.Format23x;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f7761;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f7762;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f7763;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", v" + mo1541() + ", v" + mo8187();
    }

    public C2425(int i, int i2, int i3, EnumC22631 enumC22631) {
        super(enumC22631);
        C6544.m18435(i);
        this.f7763 = i;
        C6544.m18435(i2);
        this.f7761 = i2;
        C6544.m18435(i3);
        this.f7762 = i3;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f7763;
    }

    @Override // l.InterfaceC18109
    /* JADX INFO: renamed from: ۘ */
    public final int mo1541() {
        return this.f7761;
    }

    @Override // l.InterfaceC21093
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo8187() {
        return this.f7762;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f7760;
    }
}
