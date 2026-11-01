package l;

/* JADX INFO: renamed from: l.᩶᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P5YG */
/* JADX INFO: loaded from: classes5.dex */
public final class C20403 extends AbstractC11357 implements InterfaceC11812 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f66100 = new C16170();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte f66101;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f66102;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte f66103;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f66104;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f66105;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte f66106;

    public C20403(C12063 c12063, EnumC0772 enumC0772, byte[] bArr, int i) {
        super(c12063, enumC0772, bArr, i);
        if (this.f66102 > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        int i2 = i + 1;
        this.f66102 = C14611.m35076(bArr[i2]);
        this.f66104 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f66103 = (byte) (b & 15);
        this.f66106 = C14611.m35076(b);
        byte b2 = bArr[i + 5];
        this.f66101 = (byte) (b2 & 15);
        this.f66105 = C14611.m35076(b2);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841((this.f66102 << 4) | this.f66104);
        c4651.m12833(m28439().m23325());
        c4651.m12841((this.f66106 << 4) | this.f66103);
        c4651.m12841((this.f66105 << 4) | this.f66101);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format35s;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ֨ */
    public final byte mo26663() {
        return this.f66102;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ۙ */
    public final byte mo26664() {
        return this.f66104;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ۨ */
    public final byte mo26666() {
        return this.f66103;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ᩹ */
    public final byte mo26668() {
        return this.f66106;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ۚ */
    public final byte mo26665() {
        return this.f66101;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ܰ */
    public final byte mo26667() {
        return this.f66105;
    }
}
