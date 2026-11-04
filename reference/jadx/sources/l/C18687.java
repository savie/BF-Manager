package l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18687 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f60759;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[][] f60760;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[][] f60761;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f60762;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f60763;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f60764;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f60765;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f60766;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f60767;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f60768;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[][] f60769;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f60770;

    public C18687(int[] iArr, int[] iArr2) {
        Class cls = Integer.TYPE;
        this.f60769 = (int[][]) Array.newInstance((Class<?>) cls, 4, 256);
        this.f60760 = (int[][]) Array.newInstance((Class<?>) cls, 4, 257);
        this.f60761 = (int[][]) Array.newInstance((Class<?>) cls, 4, 256);
        this.f60764 = new int[4];
        this.f60766 = new int[4];
        this.f60770 = new int[4];
        this.f60763 = new int[4];
        this.f60767 = new int[4];
        this.f60768 = new int[4];
        m43482(iArr, iArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43482(int[] iArr, int[] iArr2) {
        this.f60759 = iArr;
        this.f60762 = iArr2;
        this.f60765 = 0;
        this.f60764[0] = 0;
        this.f60766[0] = iArr.length;
        this.f60770[0] = 24;
        this.f60763[0] = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43483() {
        int i;
        int i2 = this.f60765;
        if (i2 >= 0) {
            int[] iArr = this.f60763;
            int i3 = iArr[i2];
            int[] iArr2 = this.f60767;
            int[][] iArr3 = this.f60769;
            int[] iArr4 = this.f60766;
            int[] iArr5 = this.f60764;
            if (i3 != 0) {
                int[] iArr6 = this.f60770;
                int[][] iArr7 = this.f60760;
                int[] iArr8 = this.f60768;
                if (i3 != 1) {
                    int[][] iArr9 = this.f60761;
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
                                int iM22172 = C8246.m22172(this.f60762[this.f60759[i9]], iArr6[i2]);
                                if (iM22172 == i6) {
                                    iArr9[i2][i6] = i9 + 1;
                                } else {
                                    int[] iArr11 = iArr9[i2];
                                    int i10 = iArr11[iM22172];
                                    iArr11[iM22172] = i10 + 1;
                                    int[] iArr12 = this.f60759;
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
                            this.f60765 = i2 - 1;
                        } else {
                            int i12 = i + 1;
                            iArr8[i2] = i12;
                            int[] iArr13 = iArr7[i2];
                            int i13 = iArr13[i];
                            int i14 = iArr13[i12];
                            if (i14 - i13 >= 2) {
                                int i15 = i2 + 1;
                                this.f60765 = i15;
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
                        int iM22173 = C8246.m22172(this.f60762[this.f60759[i16]], iArr6[i2]);
                        iArr14[iM22173] = iArr14[iM22173] + 1;
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
                    this.f60765 = i2 - 1;
                } else if (i19 <= 64) {
                    C8246.m22174(i18, i17, this.f60759, this.f60762);
                    this.f60765--;
                } else {
                    Arrays.fill(iArr3[i2], 0);
                    iArr2[i2] = iArr5[i2];
                    iArr[i2] = 1;
                }
            }
            if (this.f60765 >= 0) {
                return false;
            }
        }
        return true;
    }
}
