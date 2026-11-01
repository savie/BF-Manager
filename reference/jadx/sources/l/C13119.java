package l;

/* JADX INFO: renamed from: l.۬۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F4XQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13119 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f43693;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f43694;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f43695;

    public C13119() {
        this(10);
    }

    public C13119(int i) {
        this.f43693 = new int[i];
        this.f43694 = new int[i];
        this.f43695 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32474(int i, int i2) {
        int[] iArr = this.f43693;
        int i3 = this.f43695;
        int i4 = -1;
        int i5 = i3;
        while (i5 - i4 > 1) {
            int i6 = (i5 + i4) / 2;
            if (iArr[i6] < i) {
                i4 = i6;
            } else {
                i5 = i6;
            }
        }
        if (i5 == i3) {
            i5 = ~i3;
        } else if (iArr[i5] != i) {
            i5 = ~i5;
        }
        if (i5 >= 0) {
            this.f43694[i5] = i2;
            return;
        }
        int i7 = ~i5;
        int i8 = this.f43695;
        int[] iArr2 = this.f43693;
        if (i8 >= iArr2.length) {
            int iMax = Math.max(i8 + 1, iArr2.length * 2);
            int[] iArr3 = new int[iMax];
            int[] iArr4 = new int[iMax];
            int[] iArr5 = this.f43693;
            System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
            int[] iArr6 = this.f43694;
            System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
            this.f43693 = iArr3;
            this.f43694 = iArr4;
        }
        int i9 = this.f43695;
        if (i9 - i7 != 0) {
            int[] iArr7 = this.f43693;
            int i10 = i7 + 1;
            System.arraycopy(iArr7, i7, iArr7, i10, i9 - i7);
            int[] iArr8 = this.f43694;
            System.arraycopy(iArr8, i7, iArr8, i10, this.f43695 - i7);
        }
        this.f43693[i7] = i;
        this.f43694[i7] = i2;
        this.f43695++;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] m32476() {
        int i = this.f43695;
        int[] iArr = new int[i];
        System.arraycopy(this.f43693, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] m32472() {
        int i = this.f43695;
        int[] iArr = new int[i];
        System.arraycopy(this.f43694, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m32475() {
        return this.f43695;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32473() {
        return this.f43693[0];
    }
}
