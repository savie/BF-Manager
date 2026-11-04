package l;

/* JADX INFO: renamed from: l.֨ۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: N539 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0934 extends AbstractC6419 implements InterfaceC24713 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f3457 = EnumC7011.Format22t;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f3458;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f3459;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", v" + mo1541() + ", " + mo11703();
    }

    public C0934(EnumC22631 enumC22631, int i, int i2, C21335 c21335) {
        super(enumC22631, c21335);
        C6544.m18432(i);
        this.f3458 = i;
        C6544.m18432(i2);
        this.f3459 = i2;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f3458;
    }

    @Override // l.InterfaceC18109
    /* JADX INFO: renamed from: ۘ */
    public final int mo1541() {
        return this.f3459;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f3457;
    }
}
