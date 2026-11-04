package l;

/* JADX INFO: renamed from: l.۠֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K69S */
/* JADX INFO: loaded from: classes4.dex */
public final class C8285 extends AbstractC24188 implements InterfaceC10015, InterfaceC21204 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f27243 = new C2319();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f27244;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f27245;

    public C8285(EnumC7779 enumC7779, short s, int i) {
        super(enumC7779);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f27244 = (byte) s;
        this.f27245 = i;
    }

    public C8285(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f27244 = (byte) (bArr[i + 1] & 255);
        this.f27245 = C12556.m31233(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f27244);
        c24166.m54134(this.f27245);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format31i;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f27244 & 255;
    }

    @Override // l.InterfaceC21204
    /* JADX INFO: renamed from: ᩴ */
    public final long mo15898() {
        return this.f27245;
    }
}
