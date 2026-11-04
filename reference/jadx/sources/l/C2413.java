package l;

/* JADX INFO: renamed from: l.ۖۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9X3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2413 extends AbstractC20313 implements InterfaceC23297 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public byte[] f7738;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC17395 f7739;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public byte f7740;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public byte f7741;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C2413(InterfaceC5878 interfaceC5878) {
        this(interfaceC5878, C6143.f20968);
    }

    public C2413(InterfaceC5878 interfaceC5878, byte[] bArr) {
        super(interfaceC5878, 17);
        this.f7738 = bArr;
    }

    @Override // l.InterfaceC23297
    /* JADX INFO: renamed from: ۙ */
    public final void mo3727(byte[] bArr) {
        this.f7738 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8156(InterfaceC17395 interfaceC17395) {
        this.f7740 = (byte) 1;
        this.f7741 = interfaceC17395.mo10574();
        this.f7739 = interfaceC17395;
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C8379(interfaceC23032.mo2875());
    }

    @Override // l.InterfaceC21299
    public final int size() {
        return AbstractC3159.m10300(this.f7739.size() + 96);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        C0481.m2319(33L, i, bArr);
        bArr[i + 2] = this.f7740;
        bArr[i + 3] = this.f7741;
        C0481.m2323(0, i + 12, bArr);
        System.arraycopy(this.f7738, 0, bArr, i + 16, 16);
        int i2 = i + 32;
        C0481.m2319(i2 - m10327(), i + 8, bArr);
        int iMo10573 = this.f7739.mo10573(i2, bArr);
        C0481.m2323(iMo10573, i + 4, bArr);
        return (i2 + iMo10573) - i;
    }
}
