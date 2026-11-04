package l;

/* JADX INFO: renamed from: l.᩶ۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5ND */
/* JADX INFO: loaded from: classes5.dex */
public final class C21071 extends AbstractC12384 implements InterfaceC19491 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f67322 = EnumC7011.Format21s;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f67323;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f67324;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", " + mo1545();
    }

    public C21071(EnumC22631 enumC22631, int i, int i2) {
        super(enumC22631);
        C6544.m18435(i);
        this.f67323 = i;
        C6544.m18434(i2);
        this.f67324 = i2;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f67323;
    }

    @Override // l.InterfaceC3193
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1546() {
        return this.f67324;
    }

    @Override // l.InterfaceC18855
    /* JADX INFO: renamed from: ܰ */
    public final long mo1545() {
        return this.f67324;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f67322;
    }
}
