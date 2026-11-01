package l;

/* JADX INFO: renamed from: l.ܳۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 64OZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14345 extends AbstractC3384 implements InterfaceC18091 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f46975 = EnumC18057.Format11n;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f46976;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f46977;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", " + mo4062();
    }

    public C14345(EnumC10297 enumC10297, int i, int i2) {
        super(enumC10297);
        C13530.m33071(i);
        this.f46977 = i;
        if (i2 >= -8 && i2 <= 7) {
            this.f46976 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -8 and 7, inclusive.", Integer.valueOf(i2)));
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f46977;
    }

    @Override // l.InterfaceC9357
    /* JADX INFO: renamed from: ᩺ */
    public final int mo4063() {
        return this.f46976;
    }

    @Override // l.InterfaceC6802
    /* JADX INFO: renamed from: ܺ */
    public final long mo4062() {
        return this.f46976;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f46975;
    }
}
