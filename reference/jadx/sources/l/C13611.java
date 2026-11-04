package l;

/* JADX INFO: renamed from: l.۬ۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R53J */
/* JADX INFO: loaded from: classes4.dex */
public final class C13611 extends AbstractC12384 implements InterfaceC3083 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f43235 = EnumC7011.Format31i;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f43236;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f43237;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", " + mo1545();
    }

    public C13611(EnumC22631 enumC22631, int i, int i2) {
        super(enumC22631);
        C6544.m18435(i);
        this.f43236 = i;
        this.f43237 = i2;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f43236;
    }

    @Override // l.InterfaceC3193
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1546() {
        return this.f43237;
    }

    @Override // l.InterfaceC18855
    /* JADX INFO: renamed from: ܰ */
    public final long mo1545() {
        return this.f43237;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f43235;
    }
}
