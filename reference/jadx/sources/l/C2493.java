package l;

/* JADX INFO: renamed from: l.ۖۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U5Q7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2493 extends AbstractC3384 implements InterfaceC20914 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f9895 = EnumC18057.Format21lh;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f9896;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f9897;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", " + mo4062();
    }

    public C2493(EnumC10297 enumC10297, int i, long j) {
        super(enumC10297);
        C13530.m33075(i);
        this.f9897 = i;
        if ((281474976710655L & j) == 0) {
            this.f9896 = j;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 48 bits must be zeroed out.", Long.valueOf(j)));
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f9897;
    }

    @Override // l.InterfaceC6802
    /* JADX INFO: renamed from: ܺ */
    public final long mo4062() {
        return this.f9896;
    }

    @Override // l.InterfaceC23468
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final short mo7625() {
        return (short) (this.f9896 >>> 48);
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f9895;
    }
}
