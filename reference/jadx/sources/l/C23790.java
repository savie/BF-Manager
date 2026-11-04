package l;

/* JADX INFO: renamed from: l.᩹᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4XQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23790 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f77061 = new int[10];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f77062 = new int[10];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f77063 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m53067(int i, int i2, int[] iArr) {
        int i3 = -1;
        int i4 = i;
        while (i4 - i3 > 1) {
            int i5 = (i4 + i3) / 2;
            if (iArr[i5] < i2) {
                i3 = i5;
            } else {
                i4 = i5;
            }
        }
        if (i4 == i) {
            return ~i;
        }
        return iArr[i4] == i2 ? i4 : ~i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m53068(int i) {
        int iM53067 = m53067(this.f77063, i, this.f77061);
        if (iM53067 < 0) {
            return -1;
        }
        return this.f77062[iM53067];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53069() {
        this.f77063 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53070(int i, int i2) {
        int i3 = this.f77063;
        if (i3 != 0) {
            int[] iArr = this.f77061;
            if (i <= iArr[i3 - 1]) {
                int iM53067 = m53067(i3, i, iArr);
                if (iM53067 >= 0) {
                    this.f77062[iM53067] = i2;
                    return;
                }
                int i4 = ~iM53067;
                int i5 = this.f77063;
                int[] iArr2 = this.f77061;
                if (i5 >= iArr2.length) {
                    int iMax = Math.max(i5 + 1, iArr2.length * 2);
                    int[] iArr3 = new int[iMax];
                    int[] iArr4 = new int[iMax];
                    int[] iArr5 = this.f77061;
                    System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
                    int[] iArr6 = this.f77062;
                    System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
                    this.f77061 = iArr3;
                    this.f77062 = iArr4;
                }
                int i6 = this.f77063 - i4;
                if (i6 != 0) {
                    int[] iArr7 = this.f77061;
                    int i7 = i4 + 1;
                    System.arraycopy(iArr7, i4, iArr7, i7, i6);
                    int[] iArr8 = this.f77062;
                    System.arraycopy(iArr8, i4, iArr8, i7, this.f77063 - i4);
                }
                this.f77061[i4] = i;
                this.f77062[i4] = i2;
                this.f77063++;
                return;
            }
        }
        int[] iArr9 = this.f77061;
        if (i3 >= iArr9.length) {
            int iMax2 = Math.max(i3 + 1, iArr9.length * 2);
            int[] iArr10 = new int[iMax2];
            int[] iArr11 = new int[iMax2];
            int[] iArr12 = this.f77061;
            System.arraycopy(iArr12, 0, iArr10, 0, iArr12.length);
            int[] iArr13 = this.f77062;
            System.arraycopy(iArr13, 0, iArr11, 0, iArr13.length);
            this.f77061 = iArr10;
            this.f77062 = iArr11;
        }
        this.f77061[i3] = i;
        this.f77062[i3] = i2;
        this.f77063 = i3 + 1;
    }
}
