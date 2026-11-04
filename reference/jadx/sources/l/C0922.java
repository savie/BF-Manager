package l;

import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JA04 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0922 extends AbstractC20313 implements InterfaceC23297 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public byte[] f3432;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public byte f3433;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f3434;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public byte f3435;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C0922(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, 16);
        C14826 c14826 = (C14826) interfaceC5878;
        this.f3434 = (Math.min(c14826.m35703(), c14826.m35728()) - 72) & (-8);
        this.f3432 = C6143.f20968;
    }

    @Override // l.InterfaceC23297
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3727(byte[] bArr) {
        this.f3432 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3726(byte b) {
        this.f3433 = (byte) 2;
        this.f3435 = b;
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C9124(interfaceC23032.mo2875(), this.f3433, this.f3435);
    }

    @Override // l.InterfaceC21299
    public final int size() {
        return AbstractC3159.m10300(IShizukuService.Stub.TRANSACTION_isHidden);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        C0481.m2319(41L, i, bArr);
        bArr[i + 2] = this.f3433;
        bArr[i + 3] = this.f3435;
        C0481.m2323(this.f3434, i + 4, bArr);
        long j = 0;
        C0481.m2323(j, i + 16, bArr);
        C0481.m2323(j, i + 20, bArr);
        System.arraycopy(this.f3432, 0, bArr, i + 24, 16);
        C0481.m2319(0L, i + 8, bArr);
        C0481.m2323(0L, i + 12, bArr);
        return (i + 40) - i;
    }
}
