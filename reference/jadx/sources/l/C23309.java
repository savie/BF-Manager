package l;

/* JADX INFO: renamed from: l.᩹ۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C23309 extends AbstractC12384 implements InterfaceC2447 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f75507 = EnumC7011.Format11n;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f75508;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f75509;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", " + mo1545();
    }

    public C23309(EnumC22631 enumC22631, int i, int i2) {
        super(enumC22631);
        C6544.m18432(i);
        this.f75508 = i;
        if (i2 >= -8 && i2 <= 7) {
            this.f75509 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -8 and 7, inclusive.", Integer.valueOf(i2)));
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f75508;
    }

    @Override // l.InterfaceC3193
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1546() {
        return this.f75509;
    }

    @Override // l.InterfaceC18855
    /* JADX INFO: renamed from: ܰ */
    public final long mo1545() {
        return this.f75509;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f75507;
    }
}
