package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11376 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f38360;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38361;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f38362;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f38363;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f38364;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f38365;

    public C11376(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        this.f38363 = iArr;
        this.f38360 = iArr2;
        this.f38362 = i;
        this.f38365 = i3;
        this.f38361 = i2;
        this.f38364 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[][] m28479() {
        int i;
        int i2;
        int i3 = this.f38361;
        int i4 = this.f38364;
        C10672 c10672 = new C10672(i3 + i4, 0);
        int[] iArr = new int[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.f38362 + i5;
            int[] iArr2 = this.f38363;
            int i7 = c10672.get(iArr2[i6]);
            if (i7 != -1) {
                if (i7 == 0) {
                    c10672.mo26878(iArr2[i6], i5 + 1);
                } else {
                    c10672.mo26878(iArr2[i6], -1);
                }
            }
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            int i10 = this.f38365 + i9;
            int[] iArr3 = this.f38360;
            int i11 = c10672.get(iArr3[i10]);
            if (i11 != 0 && i11 != -1) {
                int i12 = i11 - 1;
                if (iArr[i12] == 0) {
                    iArr[i12] = i9 + 1;
                    i8++;
                } else {
                    iArr[i12] = 0;
                    c10672.mo26878(iArr3[i10], -1);
                    i8--;
                }
            }
        }
        if (i8 == 0) {
            return null;
        }
        int[] iArr4 = new int[i8];
        int[] iArr5 = new int[i8];
        int[] iArr6 = new int[i3];
        int i13 = 0;
        for (int i14 = 0; i14 < i3; i14++) {
            int i15 = iArr[i14];
            if (i15 != 0 && ((i2 = (i = -Arrays.binarySearch(iArr4, 0, i13, i15)) - 1) == i13 || iArr[i14] < iArr4[i2])) {
                iArr4[i2] = iArr[i14];
                iArr5[i2] = i14;
                iArr6[i14] = i2 > 0 ? iArr5[i - 2] : -1;
                if (i2 == i13) {
                    i13++;
                }
            }
        }
        int[][] iArr7 = {new int[i13], new int[i13]};
        int i16 = i13 - 1;
        for (int i17 = iArr5[i16]; i17 != -1; i17 = iArr6[i17]) {
            iArr7[0][i16] = i17;
            iArr7[1][i16] = iArr[i17] - 1;
            i16--;
        }
        return iArr7;
    }
}
