package l;

/* JADX INFO: renamed from: l.ۡۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: S53J */
/* JADX INFO: loaded from: classes4.dex */
public final class C9136 extends AbstractC12384 implements InterfaceC16507 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f29694 = EnumC7011.Format22x;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f29695;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f29696;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", v" + mo1541();
    }

    public C9136(EnumC22631 enumC22631, int i, int i2) {
        super(enumC22631);
        C6544.m18435(i);
        this.f29696 = i;
        C6544.m18433(i2);
        this.f29695 = i2;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f29696;
    }

    @Override // l.InterfaceC18109
    /* JADX INFO: renamed from: ۘ */
    public final int mo1541() {
        return this.f29695;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f29694;
    }
}
