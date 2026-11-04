package l;

/* JADX INFO: renamed from: l.ۚ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5CD */
/* JADX INFO: loaded from: classes3.dex */
public final class C5302 extends AbstractC24188 implements InterfaceC10015, InterfaceC21204 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f18673 = new C12759();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f18674;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f18675;

    public C5302(EnumC7779 enumC7779, short s, short s2) {
        super(enumC7779);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f18674 = (byte) s;
        this.f18675 = s2;
    }

    public C5302(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f18674 = bArr[i + 1];
        this.f18675 = C12556.m31241(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f18674);
        c24166.m54139(this.f18675);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format21h;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f18674 & 255;
    }

    @Override // l.InterfaceC21204
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long mo15898() {
        return this.f18675;
    }
}
