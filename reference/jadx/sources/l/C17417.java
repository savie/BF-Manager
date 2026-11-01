package l;

/* JADX INFO: renamed from: l.ܿܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K50I */
/* JADX INFO: loaded from: classes4.dex */
public final class C17417 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f55420 = new int[32];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f55421;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f55422;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m40587() {
        this.f55422 = 0;
        this.f55421 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m40591(int i) {
        int i2 = 0;
        if (this.f55422 != 0 && i >= 0) {
            int i3 = this.f55421;
            if (i > i3) {
                i = i3;
            }
            int iM5620 = 0;
            while (i != 0) {
                int i4 = this.f55420[iM5620];
                i2 += i4;
                iM5620 = C1694.m5620(i4, 2, 2, iM5620);
                i--;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40586(int i, int i2) {
        if (this.f55421 == 0) {
            m40589();
        }
        int[] iArr = this.f55420;
        int length = iArr.length;
        int i3 = this.f55422;
        int i4 = length - i3;
        if (i4 <= 2) {
            int[] iArr2 = new int[(iArr.length + i4) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f55420 = iArr2;
        }
        int i5 = this.f55422;
        int i6 = i5 - 1;
        int[] iArr3 = this.f55420;
        int i7 = iArr3[i6];
        int i8 = (i5 - 2) - (i7 * 2);
        int i9 = i7 + 1;
        iArr3[i8] = i9;
        iArr3[i6] = i;
        iArr3[i5] = i2;
        iArr3[i5 + 1] = i9;
        this.f55422 = i5 + 2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m40583() {
        int[] iArr;
        int i;
        int i2 = this.f55422;
        if (i2 == 0 || (i = (iArr = this.f55420)[i2 - 1]) == 0) {
            return;
        }
        int i3 = i - 1;
        int i4 = i2 - 3;
        iArr[i4] = i3;
        iArr[i4 - ((i3 * 2) + 1)] = i3;
        this.f55422 = i2 - 2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m40588(int i) {
        return m40581(i, true);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m40582(int i) {
        return m40581(i, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m40590() {
        return this.f55421;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40585() {
        int i = this.f55422;
        if (i == 0) {
            return;
        }
        int i2 = this.f55420[i - 1] * 2;
        if ((i - 2) - i2 == 0) {
            return;
        }
        this.f55422 = i - (i2 + 2);
        this.f55421--;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40589() {
        int[] iArr = this.f55420;
        int length = iArr.length;
        int i = this.f55422;
        int i2 = length - i;
        if (i2 <= 2) {
            int[] iArr2 = new int[(iArr.length + i2) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f55420 = iArr2;
        }
        int i3 = this.f55422;
        int[] iArr3 = this.f55420;
        iArr3[i3] = 0;
        iArr3[i3 + 1] = 0;
        this.f55422 = i3 + 2;
        this.f55421++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40584(int i) {
        int i2 = this.f55422;
        if (i2 == 0) {
            return -1;
        }
        int i3 = i2 - 1;
        for (int i4 = this.f55421; i4 != 0; i4--) {
            i3 -= 2;
            for (int i5 = this.f55420[i3]; i5 != 0; i5--) {
                int[] iArr = this.f55420;
                if (iArr[i3 + 1] == i) {
                    return iArr[i3];
                }
                i3 -= 2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final int m40581(int i, boolean z) {
        if (this.f55422 == 0 || i < 0) {
            return -1;
        }
        int iM5620 = 0;
        for (int i2 = this.f55421; i2 != 0; i2--) {
            int[] iArr = this.f55420;
            int i3 = iArr[iM5620];
            if (i < i3) {
                int iM5621 = C1694.m5620(i, 2, 1, iM5620);
                if (!z) {
                    iM5621++;
                }
                return iArr[iM5621];
            }
            i -= i3;
            iM5620 = C1694.m5620(i3, 2, 2, iM5620);
        }
        return -1;
    }
}
