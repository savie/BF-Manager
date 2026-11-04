package l;

/* JADX INFO: renamed from: l.᩵ۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84PD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20325 extends AbstractC12384 implements InterfaceC6922 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f65215 = EnumC7011.Format12x;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f65216;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f65217;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", v" + mo1541();
    }

    public C20325(EnumC22631 enumC22631, int i, int i2) {
        super(enumC22631);
        C6544.m18432(i);
        this.f65217 = i;
        C6544.m18432(i2);
        this.f65216 = i2;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f65217;
    }

    @Override // l.InterfaceC18109
    /* JADX INFO: renamed from: ۘ */
    public final int mo1541() {
        return this.f65216;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f65215;
    }
}
