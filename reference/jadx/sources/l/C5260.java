package l;

/* JADX INFO: renamed from: l.ۙ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9I4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5260 implements InterfaceC14164 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final byte[] f18534 = {-4, 83, 77, 66};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f18535;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f18536;

    @Override // l.InterfaceC14164
    /* JADX INFO: renamed from: ۙ */
    public final void mo4192(C7453 c7453) throws C2013 {
        this.f18535 = c7453.m56029();
        C18684.m43448(c7453, f18534);
        c7453.m56002();
        EnumC3022 enumC3022 = (EnumC3022) C10961.m27793(c7453.m56017(), EnumC3022.class, null);
        if (!((enumC3022 == null || enumC3022 == EnumC3022.NONE) ? false : true)) {
            throw new IllegalStateException("The CompressionAlgorithm field of the SMB2_COMPRESSION_TRANSFORM_HEADER should contain a valid value.");
        }
        c7453.m56021(2);
        c7453.m56002();
        this.f18536 = c7453.m56019();
    }

    @Override // l.InterfaceC14164
    /* JADX INFO: renamed from: ۙ */
    public final int mo4190() {
        return this.f18535;
    }

    @Override // l.InterfaceC14164
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4193() {
        return this.f18536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15830(byte[] bArr) {
        return C18684.m43450(bArr, f18534);
    }
}
