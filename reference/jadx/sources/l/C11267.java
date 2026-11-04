package l;

/* JADX INFO: renamed from: l.ۧ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5OD */
/* JADX INFO: loaded from: classes4.dex */
public final class C11267 extends AbstractC24188 implements InterfaceC10015, InterfaceC21204 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f35563 = new C1573();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f35564;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f35565;

    public C11267(EnumC7779 enumC7779, short s, short s2) {
        super(enumC7779);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f35564 = (byte) s;
        this.f35565 = s2;
    }

    public C11267(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f35564 = bArr[i + 1];
        this.f35565 = C12556.m31241(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f35564);
        c24166.m54139(this.f35565);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format21s;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f35564 & 255;
    }

    @Override // l.InterfaceC21204
    /* JADX INFO: renamed from: ᩴ */
    public final long mo15898() {
        return this.f35565;
    }
}
