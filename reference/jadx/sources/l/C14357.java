package l;

/* JADX INFO: renamed from: l.ܰۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5Q7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14357 extends AbstractC12384 implements InterfaceC22475 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f45273 = EnumC7011.Format21lh;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f45274;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f45275;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509 + " v" + mo1542() + ", " + mo1545();
    }

    public C14357(EnumC22631 enumC22631, int i, long j) {
        super(enumC22631);
        C6544.m18435(i);
        this.f45274 = i;
        if ((281474976710655L & j) == 0) {
            this.f45275 = j;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 48 bits must be zeroed out.", Long.valueOf(j)));
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f45274;
    }

    @Override // l.InterfaceC18855
    /* JADX INFO: renamed from: ܰ */
    public final long mo1545() {
        return this.f45275;
    }

    @Override // l.InterfaceC17363
    /* JADX INFO: renamed from: ۟ */
    public final short mo12624() {
        return (short) (this.f45275 >>> 48);
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f45273;
    }
}
