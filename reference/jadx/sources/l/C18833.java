package l;

/* JADX INFO: renamed from: l.ᩳۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5O2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18833 extends AbstractC12384 implements InterfaceC1592 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f61187 = EnumC7011.Format22cs;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f61188;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f61189;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f61190;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", v" + mo1541() + ", " + mo17032();
    }

    public C18833(int i, int i2, int i3, EnumC22631 enumC22631) {
        super(enumC22631);
        C6544.m18432(i);
        this.f61188 = i;
        C6544.m18432(i2);
        this.f61189 = i2;
        this.f61190 = i3;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f61188;
    }

    @Override // l.InterfaceC18109
    /* JADX INFO: renamed from: ۘ */
    public final int mo1541() {
        return this.f61189;
    }

    @Override // l.InterfaceC24823
    /* JADX INFO: renamed from: ܺ */
    public final int mo17032() {
        return this.f61190;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f61187;
    }
}
