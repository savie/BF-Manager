package l;

/* JADX INFO: renamed from: l.ۗ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25GH */
/* JADX INFO: loaded from: classes3.dex */
public final class C3064 extends AbstractC14490 implements InterfaceC10015 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f9933 = new C23202();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f9934;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f9935;

    public C3064(EnumC7779 enumC7779, byte b, byte b2, AbstractC10739 abstractC10739) {
        super(enumC7779, abstractC10739);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f9934 = b;
        this.f9935 = b2;
    }

    public C3064(C24738 c24738, EnumC7779 enumC7779, byte[] bArr, int i) {
        super(c24738, enumC7779, bArr, i);
        byte b = bArr[i + 1];
        this.f9934 = (byte) (b & 15);
        this.f9935 = C12556.m31232(b);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138((this.f9935 << 4) | this.f9934);
        c24166.m54139(m35002().m27353());
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format22c;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo9996() {
        return this.f9934;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m9997() {
        return this.f9935;
    }
}
