package l;

/* JADX INFO: renamed from: l.ۢۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q574 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9882 extends AbstractC12384 implements InterfaceC11286 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f31788 = EnumC7011.Format22s;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f31789;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f31790;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f31791;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", v" + mo1541() + ", " + mo1545();
    }

    public C9882(int i, int i2, int i3, EnumC22631 enumC22631) {
        super(enumC22631);
        C6544.m18432(i);
        this.f31789 = i;
        C6544.m18432(i2);
        this.f31790 = i2;
        C6544.m18434(i3);
        this.f31791 = i3;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f31789;
    }

    @Override // l.InterfaceC18109
    /* JADX INFO: renamed from: ۘ */
    public final int mo1541() {
        return this.f31790;
    }

    @Override // l.InterfaceC3193
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1546() {
        return this.f31791;
    }

    @Override // l.InterfaceC18855
    /* JADX INFO: renamed from: ܰ */
    public final long mo1545() {
        return this.f31791;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f31788;
    }
}
