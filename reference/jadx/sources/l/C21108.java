package l;

/* JADX INFO: renamed from: l.᩷᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J5ZU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21108 extends AbstractC4300 implements InterfaceC11812 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f68754 = new C7703();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte f68755;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f68756;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte f68757;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f68758;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f68759;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public short f68760;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte f68761;

    public C21108(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        int i2 = i + 1;
        this.f68756 = C14611.m35076(bArr[i2]);
        this.f68758 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f68757 = (byte) (b & 15);
        this.f68761 = C14611.m35076(b);
        byte b2 = bArr[i + 5];
        this.f68755 = (byte) (b2 & 15);
        this.f68759 = C14611.m35076(b2);
        this.f68760 = (short) C14611.m35087(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841((this.f68756 << 4) | this.f68758);
        c4651.m12833(this.f68760);
        c4651.m12841((this.f68761 << 4) | this.f68757);
        c4651.m12841((this.f68759 << 4) | this.f68755);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format35ms;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ֨ */
    public final byte mo26663() {
        return this.f68756;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ۙ */
    public final byte mo26664() {
        return this.f68758;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ۨ */
    public final byte mo26666() {
        return this.f68757;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ᩹ */
    public final byte mo26668() {
        return this.f68761;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ۚ */
    public final byte mo26665() {
        return this.f68755;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ܰ */
    public final byte mo26667() {
        return this.f68759;
    }
}
