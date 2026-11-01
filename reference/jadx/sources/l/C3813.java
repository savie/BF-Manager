package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۘ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9XY */
/* JADX INFO: loaded from: classes3.dex */
public final class C3813 extends AbstractC17529 implements InterfaceC16824 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public byte[] f14147;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f14148;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f14149;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f14150;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int f14151;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public long f14152;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C3813(InterfaceC10601 interfaceC10601, byte[] bArr, byte[] bArr2, int i) {
        super(interfaceC10601, 8);
        this.f14147 = bArr;
        this.f14148 = bArr2;
        this.f14151 = i;
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C6636(this.f14151, interfaceC19067.mo29449(), this.f14148);
    }

    @Override // l.InterfaceC16824
    /* JADX INFO: renamed from: ۙ */
    public final void mo3798(byte[] bArr) {
        this.f14147 = bArr;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m11104(int i) {
        this.f14149 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m11103(long j) {
        this.f14152 = j;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m11105(int i) {
        this.f14150 = i;
    }

    @Override // l.InterfaceC3314
    public final int size() {
        return AbstractC12591.m31337(UMErrorCode.E_UM_BE_RAW_OVERSIZE);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        C4850.m13546(49L, i, bArr);
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        C4850.m13550(this.f14149, i + 4, bArr);
        C4850.m13548(this.f14152, i + 8, bArr);
        System.arraycopy(this.f14147, 0, bArr, i + 16, 16);
        long j = 0;
        C4850.m13550(j, i + 32, bArr);
        C4850.m13550(j, i + 36, bArr);
        C4850.m13550(this.f14150, i + 40, bArr);
        C4850.m13546(0L, i + 44, bArr);
        C4850.m13546(0L, i + 46, bArr);
        bArr[i + 48] = 0;
        return (i + 49) - i;
    }
}
