package l;

/* JADX INFO: renamed from: l.۠ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5L0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8546 extends AbstractC24188 implements InterfaceC10015, InterfaceC21204 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f27904 = new C2580();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f27905;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte f27906;

    public C8546(EnumC7779 enumC7779, byte b, byte b2) {
        super(enumC7779);
        if (b >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        if (b2 < -8 || b2 >= 8) {
            throw new RuntimeException("The literal value must be between -8 and 7 inclusive");
        }
        this.f27905 = b;
        this.f27906 = b2;
    }

    public C8546(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        byte b = bArr[i + 1];
        this.f27905 = (byte) (b & 15);
        this.f27906 = (byte) (b >> 4);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138((this.f27906 << 4) | this.f27905);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format11n;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f27905;
    }

    @Override // l.InterfaceC21204
    /* JADX INFO: renamed from: ᩴ */
    public final long mo15898() {
        return this.f27906;
    }
}
