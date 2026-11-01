package l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13648 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f45004;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[][] f45005;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f45006;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[][] f45007;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f45008;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f45009;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f45010;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[][] f45011;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f45012;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int[] f45013;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f45014;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int[] f45015;

    public C13648(int[] iArr, int[] iArr2) {
        Class cls = Integer.TYPE;
        this.f45005 = (int[][]) Array.newInstance((Class<?>) cls, 4, 256);
        this.f45007 = (int[][]) Array.newInstance((Class<?>) cls, 4, 257);
        this.f45011 = (int[][]) Array.newInstance((Class<?>) cls, 4, 256);
        this.f45004 = new int[4];
        this.f45013 = new int[4];
        this.f45015 = new int[4];
        this.f45009 = new int[4];
        this.f45008 = new int[4];
        this.f45012 = new int[4];
        m33346(iArr, iArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33346(int[] iArr, int[] iArr2) {
        this.f45006 = iArr;
        this.f45010 = iArr2;
        this.f45014 = 0;
        this.f45004[0] = 0;
        this.f45013[0] = iArr.length;
        this.f45015[0] = 24;
        this.f45009[0] = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33347() {
        int i;
        int i2 = this.f45014;
        if (i2 >= 0) {
            int[] iArr = this.f45009;
            int i3 = iArr[i2];
            int[] iArr2 = this.f45008;
            int[][] iArr3 = this.f45005;
            int[] iArr4 = this.f45013;
            int[] iArr5 = this.f45004;
            if (i3 != 0) {
                int[] iArr6 = this.f45015;
                int[][] iArr7 = this.f45007;
                int[] iArr8 = this.f45012;
                if (i3 != 1) {
                    int[][] iArr9 = this.f45011;
                    if (i3 == 2) {
                        int i4 = iArr8[i2];
                        if (i4 < 256) {
                            int[] iArr10 = iArr7[i2];
                            int i5 = i4 + 1;
                            iArr10[i5] = iArr10[i4] + iArr3[i2][i4];
                            iArr9[i2][i4] = iArr10[i4];
                            iArr8[i2] = i5;
                        } else {
                            iArr8[i2] = 0;
                            iArr[i2] = 3;
                        }
                    } else if (i3 == 3) {
                        int i6 = iArr8[i2];
                        if (i6 >= 256) {
                            iArr8[i2] = 0;
                            iArr[i2] = 4;
                        } else {
                            int i7 = i6 + 1;
                            int i8 = iArr7[i2][i7];
                            int i9 = iArr9[i2][i6];
                            if (i9 >= i8) {
                                iArr8[i2] = i7;
                            } else {
                                int iM7156 = C2357.m7156(this.f45010[this.f45006[i9]], iArr6[i2]);
                                if (iM7156 == i6) {
                                    iArr9[i2][i6] = i9 + 1;
                                } else {
                                    int[] iArr11 = iArr9[i2];
                                    int i10 = iArr11[iM7156];
                                    iArr11[iM7156] = i10 + 1;
                                    int[] iArr12 = this.f45006;
                                    int i11 = iArr12[i9];
                                    iArr12[i9] = iArr12[i10];
                                    iArr12[i10] = i11;
                                }
                            }
                        }
                    } else {
                        if (i3 != 4) {
                            throw new IllegalStateException("Invalid syntax context sort phase");
                        }
                        if (iArr6[i2] == 0 || (i = iArr8[i2]) >= 256) {
                            this.f45014 = i2 - 1;
                        } else {
                            int i12 = i + 1;
                            iArr8[i2] = i12;
                            int[] iArr13 = iArr7[i2];
                            int i13 = iArr13[i];
                            int i14 = iArr13[i12];
                            if (i14 - i13 >= 2) {
                                int i15 = i2 + 1;
                                this.f45014 = i15;
                                iArr5[i15] = i13;
                                iArr4[i15] = i14;
                                iArr6[i15] = iArr6[i2] - 8;
                                iArr[i15] = 0;
                            }
                        }
                    }
                } else {
                    int i16 = iArr2[i2];
                    if (i16 < iArr4[i2]) {
                        int[] iArr14 = iArr3[i2];
                        int iM7157 = C2357.m7156(this.f45010[this.f45006[i16]], iArr6[i2]);
                        iArr14[iM7157] = iArr14[iM7157] + 1;
                        iArr2[i2] = i16 + 1;
                    } else {
                        iArr7[i2][0] = iArr5[i2];
                        iArr8[i2] = 0;
                        iArr[i2] = 2;
                    }
                }
            } else {
                int i17 = iArr4[i2];
                int i18 = iArr5[i2];
                int i19 = i17 - i18;
                if (i19 < 2) {
                    this.f45014 = i2 - 1;
                } else if (i19 <= 64) {
                    C2357.m7158(i18, i17, this.f45006, this.f45010);
                    this.f45014--;
                } else {
                    Arrays.fill(iArr3[i2], 0);
                    iArr2[i2] = iArr5[i2];
                    iArr[i2] = 1;
                }
            }
            if (this.f45014 >= 0) {
                return false;
            }
        }
        return true;
    }
}
