package l;

/* JADX INFO: renamed from: l.۬ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5L5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13766 extends AbstractC24188 implements InterfaceC10015 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f43692 = new C7055();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte f43693;

    public C13766(EnumC7779 enumC7779, short s) {
        super(enumC7779);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f43693 = (byte) s;
    }

    public C13766(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f43693 = (byte) (bArr[i + 1] & 255);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f43693);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format11x;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f43693 & 255;
    }
}
