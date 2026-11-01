package l;

/* JADX INFO: renamed from: l.֡۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QA04 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0286 implements InterfaceC15810, InterfaceC20043 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f1597;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f1598;

    @Override // l.InterfaceC15810, l.InterfaceC20043
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1804() {
        return 1;
    }

    public C0286(byte[] bArr, int[] iArr) {
        this.f1597 = iArr;
        this.f1598 = bArr;
    }

    public C0286() {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] m1807() {
        return this.f1597;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1806(int i, byte[] bArr) {
        int[] iArr = this.f1597;
        C4850.m13546(iArr != null ? iArr.length : 0L, i, bArr);
        byte[] bArr2 = this.f1598;
        C4850.m13546(bArr2 != null ? bArr2.length : 0L, i + 2, bArr);
        int length = i + 4;
        int[] iArr2 = this.f1597;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                C4850.m13546(i2, length, bArr);
                length += 2;
            }
        }
        byte[] bArr3 = this.f1598;
        if (bArr3 != null) {
            System.arraycopy(bArr3, 0, bArr, length, bArr3.length);
            length += this.f1598.length;
        }
        return length - i;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1805(int i, int i2, byte[] bArr) {
        int iM13545 = C4850.m13545(i, bArr);
        int iM13546 = C4850.m13545(i + 2, bArr);
        int i3 = i + 4;
        this.f1597 = new int[iM13545];
        for (int i4 = 0; i4 < iM13545; i4++) {
            this.f1597[i4] = C4850.m13545(i3, bArr);
            i3 += 2;
        }
        byte[] bArr2 = new byte[iM13546];
        this.f1598 = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, iM13546);
        return (i3 + iM13546) - i;
    }

    @Override // l.InterfaceC20478
    public final int size() {
        int[] iArr = this.f1597;
        int length = (iArr != null ? iArr.length * 2 : 0) + 4;
        byte[] bArr = this.f1598;
        return length + (bArr != null ? bArr.length : 0);
    }
}
