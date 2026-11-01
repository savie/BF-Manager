package l;

/* JADX INFO: renamed from: l.ۧܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X5BD */
/* JADX INFO: loaded from: classes4.dex */
public final class C11107 extends AbstractC4300 implements InterfaceC3594, InterfaceC2183 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f37692 = new C6167();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f37693;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f37694;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f37695;

    public C11107(EnumC0772 enumC0772, short s, short s2, byte b) {
        super(enumC0772);
        if (s >= 256 || s2 >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f37694 = (byte) s;
        this.f37693 = (byte) s2;
        this.f37695 = b;
    }

    public C11107(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f37694 = bArr[i + 1];
        this.f37693 = bArr[i + 2];
        this.f37695 = bArr[i + 3];
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f37694);
        c4651.m12841(this.f37693);
        c4651.m12841(this.f37695);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format22b;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f37694 & 255;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m28008() {
        return this.f37693 & 255;
    }

    @Override // l.InterfaceC2183
    /* JADX INFO: renamed from: ۬ */
    public final long mo6779() {
        return this.f37695;
    }
}
