package l;

/* JADX INFO: renamed from: l.ۙ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 05H4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4880 extends AbstractC4300 implements InterfaceC3594, InterfaceC2183 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f17159 = new C3344();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f17160;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f17161;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public short f17162;

    public C4880(EnumC0772 enumC0772, byte b, byte b2, short s) {
        super(enumC0772);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f17161 = b;
        this.f17160 = b2;
        this.f17162 = s;
    }

    public C4880(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        byte b = bArr[i + 1];
        this.f17161 = (byte) (b & 15);
        this.f17160 = C14611.m35076(b);
        this.f17162 = C14611.m35089(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841((this.f17160 << 4) | this.f17161);
        c4651.m12833(this.f17162);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format22s;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f17161;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m13589() {
        return this.f17160;
    }

    @Override // l.InterfaceC2183
    /* JADX INFO: renamed from: ۬ */
    public final long mo6779() {
        return this.f17162;
    }
}
