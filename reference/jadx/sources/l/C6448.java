package l;

/* JADX INFO: renamed from: l.ۛܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8A3D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6448 extends AbstractC20313 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f21687;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f21688;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public byte[] f21689;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public long f21690;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C6448(InterfaceC23032 interfaceC23032, int i, int i2, long j, byte[] bArr) {
        super(interfaceC23032.mo2875(), 1);
        this.f21688 = i;
        this.f21687 = i2;
        this.f21690 = j;
        this.f21689 = bArr;
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C24348(interfaceC23032.mo2875());
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10313(AbstractC3159 abstractC3159) {
        abstractC3159.mo10336(-1L);
        return super.mo10313(abstractC3159);
    }

    @Override // l.InterfaceC21299
    public final int size() {
        byte[] bArr = this.f21689;
        return AbstractC3159.m10300((bArr != null ? bArr.length : 0) + 88);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        C0481.m2319(25L, i, bArr);
        bArr[i + 2] = (byte) 0;
        bArr[i + 3] = (byte) this.f21688;
        C0481.m2323(this.f21687, i + 4, bArr);
        C0481.m2323(0L, i + 8, bArr);
        int i2 = i + 12;
        int i3 = i + 14;
        byte[] bArr2 = this.f21689;
        C0481.m2319(bArr2 != null ? bArr2.length : 0L, i3, bArr);
        C0481.m2321(this.f21690, i + 16, bArr);
        int i4 = i + 24;
        C0481.m2319(i4 - m10327(), i2, bArr);
        int iM10324 = i4 + m10324(i4);
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, iM10324, bArr2.length);
            iM10324 += bArr2.length;
        }
        return iM10324 - i;
    }
}
