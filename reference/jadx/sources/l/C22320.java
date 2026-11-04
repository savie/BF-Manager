package l;

/* JADX INFO: renamed from: l.᩷᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05TY */
/* JADX INFO: loaded from: classes2.dex */
public final class C22320 extends AbstractC12384 implements InterfaceC12032 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f72247 = EnumC7011.Format32x;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f72248;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f72249;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", v" + mo1541();
    }

    public C22320(EnumC22631 enumC22631, int i, int i2) {
        super(enumC22631);
        C6544.m18433(i);
        this.f72249 = i;
        C6544.m18433(i2);
        this.f72248 = i2;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f72249;
    }

    @Override // l.InterfaceC18109
    /* JADX INFO: renamed from: ۘ */
    public final int mo1541() {
        return this.f72248;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f72247;
    }
}
