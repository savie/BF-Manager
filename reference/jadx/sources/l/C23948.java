package l;

/* JADX INFO: renamed from: l.᩺֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05H4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23948 extends AbstractC24188 implements InterfaceC10015, InterfaceC21204 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f77515 = new C6048();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f77516;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f77517;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f77518;

    public C23948(EnumC7779 enumC7779, byte b, byte b2, short s) {
        super(enumC7779);
        if (b >= 16 || b2 >= 16) {
            throw new RuntimeException("The register number must be less than v16");
        }
        this.f77516 = b;
        this.f77518 = b2;
        this.f77517 = s;
    }

    public C23948(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        byte b = bArr[i + 1];
        this.f77516 = (byte) (b & 15);
        this.f77518 = C12556.m31232(b);
        this.f77517 = C12556.m31241(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138((this.f77518 << 4) | this.f77516);
        c24166.m54139(this.f77517);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format22s;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f77516;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m53475() {
        return this.f77518;
    }

    @Override // l.InterfaceC21204
    /* JADX INFO: renamed from: ᩴ */
    public final long mo15898() {
        return this.f77517;
    }
}
