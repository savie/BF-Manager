package l;

/* JADX INFO: renamed from: l.ۨۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 65QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C11667 extends AbstractC3384 implements InterfaceC7508 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f39207 = EnumC18057.Format21ih;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f39208;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f39209;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", " + mo4062();
    }

    public C11667(EnumC10297 enumC10297, int i, int i2) {
        super(enumC10297);
        C13530.m33075(i);
        this.f39209 = i;
        if ((65535 & i2) == 0) {
            this.f39208 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 16 bits must be zeroed out.", Integer.valueOf(i2)));
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f39209;
    }

    @Override // l.InterfaceC9357
    /* JADX INFO: renamed from: ᩺ */
    public final int mo4063() {
        return this.f39208;
    }

    @Override // l.InterfaceC6802
    /* JADX INFO: renamed from: ܺ */
    public final long mo4062() {
        return this.f39208;
    }

    @Override // l.InterfaceC23468
    /* JADX INFO: renamed from: ۫ */
    public final short mo7625() {
        return (short) (this.f39208 >>> 16);
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f39207;
    }
}
