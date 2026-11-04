package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۜۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9XY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6888 extends AbstractC20313 implements InterfaceC23297 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public byte[] f22848;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f22849;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f22850;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final int f22851;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f22852;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public long f22853;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C6888(InterfaceC5878 interfaceC5878, byte[] bArr, byte[] bArr2, int i) {
        super(interfaceC5878, 8);
        this.f22848 = bArr;
        this.f22850 = bArr2;
        this.f22851 = i;
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C13599(this.f22851, interfaceC23032.mo2875(), this.f22850);
    }

    @Override // l.InterfaceC23297
    /* JADX INFO: renamed from: ۙ */
    public final void mo3727(byte[] bArr) {
        this.f22848 = bArr;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m19150(int i) {
        this.f22849 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m19152(long j) {
        this.f22853 = j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19151(int i) {
        this.f22852 = i;
    }

    @Override // l.InterfaceC21299
    public final int size() {
        return AbstractC3159.m10300(UMErrorCode.E_UM_BE_RAW_OVERSIZE);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        C0481.m2319(49L, i, bArr);
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        C0481.m2323(this.f22849, i + 4, bArr);
        C0481.m2321(this.f22853, i + 8, bArr);
        System.arraycopy(this.f22848, 0, bArr, i + 16, 16);
        long j = 0;
        C0481.m2323(j, i + 32, bArr);
        C0481.m2323(j, i + 36, bArr);
        C0481.m2323(this.f22852, i + 40, bArr);
        C0481.m2319(0L, i + 44, bArr);
        C0481.m2319(0L, i + 46, bArr);
        bArr[i + 48] = 0;
        return (i + 49) - i;
    }
}
