package l;

/* JADX INFO: renamed from: l.۟ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7378 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f24469;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24470;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C8790 f24471;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f24472;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f24473;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f24474;

    public C7378(C8790 c8790, int i, int i2) {
        this.f24471 = c8790;
        this.f24470 = i;
        this.f24474 = i2;
        this.f24472 = new int[c8790.f30213.length + 1];
        for (int i3 = 0; i3 < c8790.f30212; i3++) {
            if (i3 < i || i3 >= i2) {
                int i4 = i3 + 1;
                int iM22865 = c8790.m22865(i3) - c8790.m22867(i3);
                int[] iArr = this.f24472;
                iArr[i3] = iArr[i3] + iM22865;
                iArr[i4] = iArr[i4] - iM22865;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19643() {
        int iM22865;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C8790 c8790 = this.f24471;
            int i4 = c8790.f30212;
            int[] iArr = this.f24472;
            if (i >= i4) {
                iArr[i4] = i2;
                if (i2 == 0) {
                    return;
                }
                this.f24473 = new char[i2];
                this.f24469 = (int[]) iArr.clone();
                for (int i5 = 0; i5 < c8790.f30212; i5++) {
                    if ((i5 < this.f24470 || i5 >= this.f24474) && (iM22865 = c8790.m22865(i5) - c8790.m22867(i5)) != 0) {
                        System.arraycopy(c8790.f30215, c8790.m22867(i5), this.f24473, iArr[i5], iM22865);
                    }
                }
                return;
            }
            i3 += iArr[i];
            iArr[i] = i2;
            long j = ((long) i2) + ((long) i3);
            i2 = (int) j;
            if (j != i2) {
                throw new ArithmeticException();
            }
            i++;
        }
    }
}
