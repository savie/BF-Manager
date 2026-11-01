package l;

import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: JA04 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5225 extends AbstractC17529 implements InterfaceC16824 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public byte[] f18123;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public byte f18124;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f18125;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public byte f18126;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C5225(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, 16);
        C9895 c9895 = (C9895) interfaceC10601;
        this.f18125 = (Math.min(c9895.m25057(), c9895.m25070()) - 72) & (-8);
        this.f18123 = C11180.f37872;
    }

    @Override // l.InterfaceC16824
    /* JADX INFO: renamed from: ۙ */
    public final void mo3798(byte[] bArr) {
        this.f18123 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14409(byte b) {
        this.f18124 = (byte) 2;
        this.f18126 = b;
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C22159(interfaceC19067.mo29449(), this.f18124, this.f18126);
    }

    @Override // l.InterfaceC3314
    public final int size() {
        return AbstractC12591.m31337(IShizukuService.Stub.TRANSACTION_isHidden);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        C4850.m13546(41L, i, bArr);
        bArr[i + 2] = this.f18124;
        bArr[i + 3] = this.f18126;
        C4850.m13550(this.f18125, i + 4, bArr);
        long j = 0;
        C4850.m13550(j, i + 16, bArr);
        C4850.m13550(j, i + 20, bArr);
        System.arraycopy(this.f18123, 0, bArr, i + 24, 16);
        C4850.m13546(0L, i + 8, bArr);
        C4850.m13550(0L, i + 12, bArr);
        return (i + 40) - i;
    }
}
