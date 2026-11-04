package l;

/* JADX INFO: renamed from: l.ܶܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA04 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16142 implements InterfaceC16888, InterfaceC17634 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f52428;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f52429;

    @Override // l.InterfaceC16888, l.InterfaceC17634
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo38322() {
        return 1;
    }

    public C16142(byte[] bArr, int[] iArr) {
        this.f52428 = iArr;
        this.f52429 = bArr;
    }

    public C16142() {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] m38323() {
        return this.f52428;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ */
    public final int mo10573(int i, byte[] bArr) {
        int[] iArr = this.f52428;
        C0481.m2319(iArr != null ? iArr.length : 0L, i, bArr);
        byte[] bArr2 = this.f52429;
        C0481.m2319(bArr2 != null ? bArr2.length : 0L, i + 2, bArr);
        int length = i + 4;
        int[] iArr2 = this.f52428;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                C0481.m2319(i2, length, bArr);
                length += 2;
            }
        }
        byte[] bArr3 = this.f52429;
        if (bArr3 != null) {
            System.arraycopy(bArr3, 0, bArr, length, bArr3.length);
            length += this.f52429.length;
        }
        return length - i;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        int iM2318 = C0481.m2318(i, bArr);
        int iM2319 = C0481.m2318(i + 2, bArr);
        int i3 = i + 4;
        this.f52428 = new int[iM2318];
        for (int i4 = 0; i4 < iM2318; i4++) {
            this.f52428[i4] = C0481.m2318(i3, bArr);
            i3 += 2;
        }
        byte[] bArr2 = new byte[iM2319];
        this.f52429 = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, iM2319);
        return (i3 + iM2319) - i;
    }

    @Override // l.InterfaceC17064
    public final int size() {
        int[] iArr = this.f52428;
        int length = (iArr != null ? iArr.length * 2 : 0) + 4;
        byte[] bArr = this.f52429;
        return length + (bArr != null ? bArr.length : 0);
    }
}
