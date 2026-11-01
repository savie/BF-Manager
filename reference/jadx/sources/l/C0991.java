package l;

/* JADX INFO: renamed from: l.֨۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D9X3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0991 extends AbstractC17529 implements InterfaceC16824 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public byte[] f4639;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC20436 f4640;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public byte f4641;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public byte f4642;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C0991(InterfaceC10601 interfaceC10601) {
        this(interfaceC10601, C11180.f37872);
    }

    public C0991(InterfaceC10601 interfaceC10601, byte[] bArr) {
        super(interfaceC10601, 17);
        this.f4639 = bArr;
    }

    @Override // l.InterfaceC16824
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3798(byte[] bArr) {
        this.f4639 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3797(InterfaceC20436 interfaceC20436) {
        this.f4641 = (byte) 1;
        this.f4642 = interfaceC20436.mo3043();
        this.f4640 = interfaceC20436;
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C12987(interfaceC19067.mo29449());
    }

    @Override // l.InterfaceC3314
    public final int size() {
        return AbstractC12591.m31337(this.f4640.size() + 96);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo3796(int i, byte[] bArr) {
        C4850.m13546(33L, i, bArr);
        bArr[i + 2] = this.f4641;
        bArr[i + 3] = this.f4642;
        C4850.m13550(0, i + 12, bArr);
        System.arraycopy(this.f4639, 0, bArr, i + 16, 16);
        int i2 = i + 32;
        C4850.m13546(i2 - m31366(), i + 8, bArr);
        int iMo1806 = this.f4640.mo1806(i2, bArr);
        C4850.m13550(iMo1806, i + 4, bArr);
        return (i2 + iMo1806) - i;
    }
}
