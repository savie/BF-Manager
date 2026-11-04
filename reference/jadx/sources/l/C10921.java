package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۤܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10921 extends AbstractC20313 implements InterfaceC23297 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final int f34568;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f34569;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f34570;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC17064 f34571;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f34572;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f34573;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C10921(InterfaceC5878 interfaceC5878, int i) {
        this(i, interfaceC5878, C6143.f20968);
    }

    public C10921(int i, InterfaceC5878 interfaceC5878, byte[] bArr) {
        super(interfaceC5878, 11);
        this.f34568 = i;
        this.f34573 = bArr;
        this.f34569 = ((C14826) interfaceC5878).m35717() & (-8);
        this.f34572 = null;
    }

    @Override // l.InterfaceC23297
    /* JADX INFO: renamed from: ۙ */
    public final void mo3727(byte[] bArr) {
        this.f34573 = bArr;
    }

    public C10921(InterfaceC5878 interfaceC5878, byte[] bArr, byte[] bArr2) {
        super(interfaceC5878, 11);
        this.f34568 = 1163287;
        this.f34573 = bArr;
        this.f34572 = bArr2;
        this.f34569 = bArr2.length;
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C22856(this.f34568, interfaceC23032.mo2875(), this.f34572);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final void m27717() {
        this.f34570 = 1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m27718(int i) {
        this.f34569 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27716(InterfaceC17064 interfaceC17064) {
        this.f34571 = interfaceC17064;
    }

    @Override // l.InterfaceC21299
    public final int size() {
        InterfaceC17064 interfaceC17064 = this.f34571;
        return AbstractC3159.m10300((interfaceC17064 != null ? interfaceC17064.size() : 0) + UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        C0481.m2319(57L, i, bArr);
        C0481.m2323(this.f34568, i + 4, bArr);
        System.arraycopy(this.f34573, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        int i3 = i + 28;
        C0481.m2323(0, i + 32, bArr);
        int i4 = i + 36;
        int i5 = i + 40;
        C0481.m2323(this.f34569, i + 44, bArr);
        C0481.m2323(this.f34570, i + 48, bArr);
        int i6 = i + 56;
        if (this.f34571 != null) {
            C0481.m2323(i6 - m10327(), i2, bArr);
            int iMo10573 = this.f34571.mo10573(i6, bArr);
            C0481.m2323(iMo10573, i3, bArr);
            i6 += iMo10573;
        } else {
            C0481.m2323(0L, i2, bArr);
            C0481.m2323(0L, i3, bArr);
        }
        C0481.m2323(0L, i4, bArr);
        C0481.m2323(0L, i5, bArr);
        return i6 - i;
    }
}
