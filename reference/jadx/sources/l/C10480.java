package l;

/* JADX INFO: renamed from: l.ۢ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K50I */
/* JADX INFO: loaded from: classes3.dex */
public final class C10480 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f33350 = new int[32];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f33351;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f33352;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m26916() {
        this.f33352 = 0;
        this.f33351 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26918(int i) {
        int i2 = 0;
        if (this.f33352 != 0 && i >= 0) {
            int i3 = this.f33351;
            if (i > i3) {
                i = i3;
            }
            int iM31436 = 0;
            while (i != 0) {
                int i4 = this.f33350[iM31436];
                i2 += i4;
                iM31436 = C12669.m31436(i4, 2, 2, iM31436);
                i--;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26913(int i, int i2) {
        if (this.f33351 == 0) {
            m26915();
        }
        int[] iArr = this.f33350;
        int length = iArr.length;
        int i3 = this.f33352;
        int i4 = length - i3;
        if (i4 <= 2) {
            int[] iArr2 = new int[(iArr.length + i4) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f33350 = iArr2;
        }
        int i5 = this.f33352;
        int i6 = i5 - 1;
        int[] iArr3 = this.f33350;
        int i7 = iArr3[i6];
        int i8 = (i5 - 2) - (i7 * 2);
        int i9 = i7 + 1;
        iArr3[i8] = i9;
        iArr3[i6] = i;
        iArr3[i5] = i2;
        iArr3[i5 + 1] = i9;
        this.f33352 = i5 + 2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m26920() {
        int[] iArr;
        int i;
        int i2 = this.f33352;
        if (i2 == 0 || (i = (iArr = this.f33350)[i2 - 1]) == 0) {
            return;
        }
        int i3 = i - 1;
        int i4 = i2 - 3;
        iArr[i4] = i3;
        iArr[i4 - ((i3 * 2) + 1)] = i3;
        this.f33352 = i2 - 2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m26914(int i) {
        return m26910(i, true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m26919(int i) {
        return m26910(i, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26917() {
        return this.f33351;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26912() {
        int i = this.f33352;
        if (i == 0) {
            return;
        }
        int i2 = this.f33350[i - 1] * 2;
        if ((i - 2) - i2 == 0) {
            return;
        }
        this.f33352 = i - (i2 + 2);
        this.f33351--;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m26915() {
        int[] iArr = this.f33350;
        int length = iArr.length;
        int i = this.f33352;
        int i2 = length - i;
        if (i2 <= 2) {
            int[] iArr2 = new int[(iArr.length + i2) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f33350 = iArr2;
        }
        int i3 = this.f33352;
        int[] iArr3 = this.f33350;
        iArr3[i3] = 0;
        iArr3[i3 + 1] = 0;
        this.f33352 = i3 + 2;
        this.f33351++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26911(int i) {
        int i2 = this.f33352;
        if (i2 == 0) {
            return -1;
        }
        int i3 = i2 - 1;
        for (int i4 = this.f33351; i4 != 0; i4--) {
            i3 -= 2;
            for (int i5 = this.f33350[i3]; i5 != 0; i5--) {
                int[] iArr = this.f33350;
                if (iArr[i3 + 1] == i) {
                    return iArr[i3];
                }
                i3 -= 2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final int m26910(int i, boolean z) {
        if (this.f33352 == 0 || i < 0) {
            return -1;
        }
        int iM31436 = 0;
        for (int i2 = this.f33351; i2 != 0; i2--) {
            int[] iArr = this.f33350;
            int i3 = iArr[iM31436];
            if (i < i3) {
                int iM31437 = C12669.m31436(i, 2, 1, iM31436);
                if (!z) {
                    iM31437++;
                }
                return iArr[iM31437];
            }
            i -= i3;
            iM31436 = C12669.m31436(i3, 2, 2, iM31436);
        }
        return -1;
    }
}
