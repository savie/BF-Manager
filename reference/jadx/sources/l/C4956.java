package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۙܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O9XY */
/* JADX INFO: loaded from: classes3.dex */
public final class C4956 extends AbstractC20313 implements InterfaceC23297 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public byte[] f17249;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public long f17250;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f17251;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public byte[] f17252;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f17253;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f17254;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C4956(InterfaceC5878 interfaceC5878, byte[] bArr) {
        super(interfaceC5878, 9);
        this.f17252 = bArr;
    }

    @Override // l.InterfaceC23297
    /* JADX INFO: renamed from: ۙ */
    public final void mo3727(byte[] bArr) {
        this.f17252 = bArr;
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C22110(interfaceC23032.mo2875());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15159(int i, int i2, byte[] bArr) {
        this.f17249 = bArr;
        this.f17251 = i;
        this.f17254 = i2;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m15158(int i) {
        this.f17253 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m15160(long j) {
        this.f17250 = j;
    }

    @Override // l.InterfaceC21299
    public final int size() {
        return AbstractC3159.m10300(this.f17254 + UMErrorCode.E_UM_BE_DEFLATE_FAILED);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        C0481.m2319(49L, i, bArr);
        C0481.m2323(this.f17254, i + 4, bArr);
        C0481.m2321(this.f17250, i + 8, bArr);
        System.arraycopy(this.f17252, 0, bArr, i + 16, 16);
        long j = 0;
        C0481.m2323(j, i + 32, bArr);
        C0481.m2323(this.f17253, i + 36, bArr);
        C0481.m2319(0L, i + 40, bArr);
        C0481.m2319(0L, i + 42, bArr);
        C0481.m2323(j, i + 44, bArr);
        int i2 = i + 48;
        C0481.m2319(i2 - m10327(), i + 2, bArr);
        int i3 = this.f17254;
        if (i2 + i3 > bArr.length) {
            throw new IllegalArgumentException(String.format("Data exceeds buffer size ( remain buffer: %d data length: %d)", Integer.valueOf(bArr.length - i2), Integer.valueOf(this.f17254)));
        }
        System.arraycopy(this.f17249, this.f17251, bArr, i2, i3);
        return (i2 + this.f17254) - i;
    }
}
