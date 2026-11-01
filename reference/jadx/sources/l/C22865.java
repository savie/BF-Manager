package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩺۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O9XY */
/* JADX INFO: loaded from: classes2.dex */
public final class C22865 extends AbstractC17529 implements InterfaceC16824 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public byte[] f74369;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f74370;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public long f74371;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f74372;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f74373;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f74374;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C22865(InterfaceC10601 interfaceC10601, byte[] bArr) {
        super(interfaceC10601, 9);
        this.f74373 = bArr;
    }

    @Override // l.InterfaceC16824
    /* JADX INFO: renamed from: ۙ */
    public final void mo3798(byte[] bArr) {
        this.f74373 = bArr;
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C15104(interfaceC19067.mo29449());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50613(int i, int i2, byte[] bArr) {
        this.f74369 = bArr;
        this.f74370 = i;
        this.f74374 = i2;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m50614(int i) {
        this.f74372 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m50612(long j) {
        this.f74371 = j;
    }

    @Override // l.InterfaceC3314
    public final int size() {
        return AbstractC12591.m31337(this.f74374 + UMErrorCode.E_UM_BE_DEFLATE_FAILED);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        C4850.m13546(49L, i, bArr);
        C4850.m13550(this.f74374, i + 4, bArr);
        C4850.m13548(this.f74371, i + 8, bArr);
        System.arraycopy(this.f74373, 0, bArr, i + 16, 16);
        long j = 0;
        C4850.m13550(j, i + 32, bArr);
        C4850.m13550(this.f74372, i + 36, bArr);
        C4850.m13546(0L, i + 40, bArr);
        C4850.m13546(0L, i + 42, bArr);
        C4850.m13550(j, i + 44, bArr);
        int i2 = i + 48;
        C4850.m13546(i2 - m31366(), i + 2, bArr);
        int i3 = this.f74374;
        if (i2 + i3 > bArr.length) {
            throw new IllegalArgumentException(String.format("Data exceeds buffer size ( remain buffer: %d data length: %d)", Integer.valueOf(bArr.length - i2), Integer.valueOf(this.f74374)));
        }
        System.arraycopy(this.f74369, this.f74370, bArr, i2, i3);
        return (i2 + this.f74374) - i;
    }
}
