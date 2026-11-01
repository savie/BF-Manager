package l;

/* JADX INFO: renamed from: l.ۡ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9I4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9220 implements InterfaceC8657 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f31337 = {-4, 83, 77, 66};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31338;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31339;

    @Override // l.InterfaceC8657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4333(C19240 c19240) throws C17271 {
        this.f31338 = c19240.m27402();
        C1186.m4322(c19240, f31337);
        c19240.m27378();
        EnumC18120 enumC18120 = (EnumC18120) C20799.m46783(c19240.m27375(), EnumC18120.class, null);
        if (!((enumC18120 == null || enumC18120 == EnumC18120.NONE) ? false : true)) {
            throw new IllegalStateException("The CompressionAlgorithm field of the SMB2_COMPRESSION_TRANSFORM_HEADER should contain a valid value.");
        }
        c19240.m27389(2);
        c19240.m27378();
        this.f31339 = c19240.m27400();
    }

    @Override // l.InterfaceC8657
    /* JADX INFO: renamed from: ۙ */
    public final int mo4329() {
        return this.f31338;
    }

    @Override // l.InterfaceC8657
    /* JADX INFO: renamed from: ܰ */
    public final int mo4342() {
        return this.f31339;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23735(byte[] bArr) {
        return C1186.m4324(bArr, f31337);
    }
}
