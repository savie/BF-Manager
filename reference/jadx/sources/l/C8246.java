package l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۟᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8246 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f27121;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f27122;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f27123;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f27124;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f27125;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16800[] f27126;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long[] f27127;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final long[] f27118 = new long[0];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final long[] f27119 = {0};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f27120 = {0};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f27117 = {-1};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m22172(int i, int i2) {
        return (i >>> i2) & 255;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long m22177(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public C8246(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, C16800[] c16800Arr) {
        long[] jArr;
        int i3;
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        if (i2 <= 0 || i2 > iArr.length || i2 > iArr2.length || i2 > iArr3.length || i2 > c16800Arr.length) {
            throw new IllegalArgumentException("Invalid syntax context column size");
        }
        this.f27123 = i;
        this.f27125 = i2;
        this.f27124 = iArr;
        this.f27121 = iArr2;
        this.f27122 = iArr3;
        this.f27126 = c16800Arr;
        if (iArr[0] == 0 && iArr2[0] == i) {
            int i4 = -1;
            if (iArr3[0] == -1 && c16800Arr[0] != null) {
                int i5 = 1;
                while (true) {
                    int i6 = this.f27125;
                    if (i5 >= i6) {
                        if (i == 0) {
                            this.f27127 = f27118;
                            return;
                        }
                        if (i2 == 1) {
                            this.f27127 = f27119;
                            return;
                        }
                        int i7 = this.f27123;
                        int[] iArr4 = this.f27124;
                        int[] iArr5 = this.f27122;
                        int[] iArr6 = this.f27121;
                        int i8 = 1;
                        int i9 = 0;
                        int i10 = 0;
                        int iM22170 = 0;
                        loop1: while (true) {
                            if (i8 >= i6) {
                                while (true) {
                                    if (i9 < 0) {
                                        if (i10 != i7) {
                                            break;
                                        }
                                        i4 = iM22170;
                                        break;
                                    } else {
                                        int i11 = iArr6[i9];
                                        if (i11 < i10) {
                                            break;
                                        }
                                        if (i11 > i10) {
                                            iM22170 = m22170(iM22170);
                                        }
                                        i10 = iArr6[i9];
                                        i9 = iArr5[i9];
                                    }
                                }
                            } else {
                                int i12 = iArr5[i8];
                                while (i9 != i12) {
                                    if (i9 == 0 || (i3 = iArr6[i9]) < i10) {
                                        break loop1;
                                    }
                                    if (i3 > i10) {
                                        iM22170 = m22170(iM22170);
                                    }
                                    i10 = iArr6[i9];
                                    i9 = iArr5[i9];
                                }
                                int i13 = iArr4[i8];
                                if (i13 < i10) {
                                    break;
                                }
                                if (i13 > i10) {
                                    iM22170 = m22170(iM22170);
                                }
                                i10 = iArr4[i8];
                                i9 = i8;
                                i8++;
                            }
                        }
                        if (i4 >= 0) {
                            jArr = new long[i4];
                            int i14 = 0;
                            int i15 = 0;
                            int i16 = 0;
                            for (int i17 = 1; i17 < i6; i17++) {
                                int i18 = iArr5[i17];
                                while (i16 != i18) {
                                    if (iArr6[i16] > i14) {
                                        jArr[i15] = m22177(i14, i16);
                                        i15++;
                                    }
                                    i14 = iArr6[i16];
                                    i16 = iArr5[i16];
                                }
                                if (iArr4[i17] > i14) {
                                    jArr[i15] = m22177(i14, i16);
                                    i15++;
                                }
                                i14 = iArr4[i17];
                                i16 = i17;
                            }
                            while (i16 >= 0) {
                                if (iArr6[i16] > i14) {
                                    jArr[i15] = m22177(i14, i16);
                                    i15++;
                                }
                                i14 = iArr6[i16];
                                i16 = iArr5[i16];
                            }
                            if (i15 != i4 || i14 != i7) {
                                throw new IllegalStateException("Ordered syntax context run count changed");
                            }
                        } else {
                            int[] iArr7 = new int[i6];
                            int[] iArr8 = new int[i6];
                            for (int i19 = 0; i19 < i6; i19++) {
                                iArr8[i19] = i19;
                                iArr7[i19] = i19;
                            }
                            m22163(iArr7, iArr4);
                            m22163(iArr8, iArr6);
                            C4517 c4517 = new C4517(i6);
                            int iM22161 = m22161(iArr7, iArr8, c4517, (long[]) null);
                            jArr = new long[iM22161];
                            c4517.m14242();
                            if (m22161(iArr7, iArr8, c4517, jArr) != iM22161 || iM22161 == 0 || ((int) (jArr[0] >>> 32)) != 0) {
                                throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                            }
                        }
                        this.f27127 = jArr;
                        return;
                    }
                    int i20 = iArr[i5];
                    int i21 = iArr2[i5];
                    int i22 = iArr3[i5];
                    if (i20 < 0 || i21 <= i20 || i21 > i || i22 < 0 || i22 >= i5 || i20 < iArr[i22] || i21 > iArr2[i22]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                throw new IllegalArgumentException(C13645.m33382(i5, "Invalid syntax context node: "));
            }
        }
        throw new IllegalArgumentException("Invalid syntax context root");
    }

    public C8246(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, C16800[] c16800Arr, long[] jArr) {
        this.f27123 = i;
        this.f27125 = i2;
        this.f27124 = iArr;
        this.f27121 = iArr2;
        this.f27122 = iArr3;
        this.f27126 = c16800Arr;
        this.f27127 = jArr;
    }

    public C8246(int i, C16800 c16800) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        this.f27123 = i;
        this.f27125 = 1;
        this.f27124 = f27120;
        this.f27121 = new int[]{i};
        this.f27122 = f27117;
        C17359.requireNonNull(c16800);
        this.f27126 = new C16800[]{c16800};
        if (i == 0) {
            this.f27127 = f27118;
        } else {
            this.f27127 = f27119;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C8246 m22173(int i, C16800 c16800) {
        return new C8246(i, c16800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22184(int i, C16800 c16800) {
        return this.f27123 == i && this.f27126[0] == c16800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22181() {
        return this.f27125;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m22191() {
        return this.f27123;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22182(int i) {
        C17359.checkIndex(i, this.f27123);
        return m22180(m22185(i));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m22185(int i) {
        C17359.checkIndex(i, this.f27123);
        long[] jArr = this.f27127;
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            if (((int) (jArr[i3] >>> 32)) <= i) {
                i2 = i3 + 1;
            } else {
                length = i3 - 1;
            }
        }
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Syntax context tree does not cover the offset");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22183(int i, int i2) {
        int[] iArr;
        C17359.checkFromToIndex(i, i2, this.f27123);
        if (i == i2) {
            throw new IllegalArgumentException("Empty syntax context range");
        }
        int iM22185 = m22185(i);
        int iM22180 = m22180(iM22185);
        do {
            iM22185++;
            if (iM22185 >= this.f27127.length || m22187(iM22185) >= i2) {
                break;
            }
            int iM22181 = m22180(iM22185);
            int iM22192 = m22192(iM22180);
            int iM22193 = m22192(iM22181);
            while (true) {
                iArr = this.f27122;
                if (iM22192 <= iM22193) {
                    break;
                }
                iM22180 = iArr[iM22180];
                iM22192--;
            }
            while (iM22193 > iM22192) {
                iM22181 = iArr[iM22181];
                iM22193--;
            }
            while (iM22180 != iM22181) {
                iM22180 = iArr[iM22180];
                iM22181 = iArr[iM22181];
            }
        } while (iM22180 != 0);
        return iM22180;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22180(int i) {
        long[] jArr = this.f27127;
        return (int) jArr[C17359.checkIndex(i, jArr.length)];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m22187(int i) {
        long[] jArr = this.f27127;
        return (int) (jArr[C17359.checkIndex(i, jArr.length)] >>> 32);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m22188(int i) {
        long[] jArr = this.f27127;
        int iCheckIndex = C17359.checkIndex(i, jArr.length) + 1;
        return iCheckIndex < jArr.length ? (int) (jArr[iCheckIndex] >>> 32) : this.f27123;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m22170(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new OutOfMemoryError("Syntax context run count exceeded");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22161(int[] iArr, int[] iArr2, C4517 c4517, long[] jArr) {
        int i = 0;
        int i2 = 0;
        int iM22170 = 0;
        int i3 = -1;
        while (true) {
            int i4 = this.f27125;
            if (i >= i4 && i2 >= i4) {
                break;
            }
            int[] iArr3 = this.f27124;
            long j = C25227.FOREVER_NS;
            long j2 = i < i4 ? iArr3[iArr[i]] : Long.MAX_VALUE;
            int[] iArr4 = this.f27121;
            int iMin = (int) Math.min(j2, i2 < i4 ? iArr4[iArr2[i2]] : Long.MAX_VALUE);
            while (i2 < i4) {
                int i5 = iArr2[i2];
                if (iArr4[i5] != iMin) {
                    break;
                }
                i2++;
                c4517.m14245(i5);
            }
            while (i < i4) {
                int i6 = iArr[i];
                if (iArr3[i6] != iMin) {
                    break;
                }
                i++;
                c4517.m14243(i6);
            }
            if (i == i4 && i2 == i4) {
                break;
            }
            long j3 = i < i4 ? iArr3[iArr[i]] : Long.MAX_VALUE;
            if (i2 < i4) {
                j = iArr4[iArr2[i2]];
            }
            if (Math.min(j3, j) > iMin) {
                int iM14244 = c4517.m14244();
                if (iM14244 < 0) {
                    throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                }
                if (iM14244 != i3) {
                    if (jArr != null) {
                        jArr[iM22170] = m22177(iMin, iM14244);
                    }
                    iM22170 = m22170(iM22170);
                    i3 = iM14244;
                }
            }
        }
        return iM22170;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22163(int[] iArr, int[] iArr2) {
        Class cls = Integer.TYPE;
        m22164(iArr, iArr2, 0, iArr.length, 24, 0, (int[][]) Array.newInstance((Class<?>) cls, 4, 256), (int[][]) Array.newInstance((Class<?>) cls, 4, 257), (int[][]) Array.newInstance((Class<?>) cls, 4, 256));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22164(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int[][] iArr3, int[][] iArr4, int[][] iArr5) {
        int i5 = i2 - i;
        if (i5 < 2) {
            return;
        }
        if (i5 <= 64) {
            m22174(i, i2, iArr, iArr2);
            return;
        }
        int[] iArr6 = iArr3[i4];
        int[] iArr7 = iArr4[i4];
        int[] iArr8 = iArr5[i4];
        int i6 = 0;
        Arrays.fill(iArr6, 0);
        for (int i7 = i; i7 < i2; i7++) {
            int i8 = (iArr2[iArr[i7]] >>> i3) & 255;
            iArr6[i8] = iArr6[i8] + 1;
        }
        iArr7[0] = i;
        int i9 = 0;
        while (i9 < 256) {
            int i10 = i9 + 1;
            iArr7[i10] = iArr7[i9] + iArr6[i9];
            iArr8[i9] = iArr7[i9];
            i9 = i10;
        }
        int i11 = 0;
        while (i11 < 256) {
            int i12 = i11 + 1;
            int i13 = iArr7[i12];
            while (true) {
                int i14 = iArr8[i11];
                if (i14 < i13) {
                    int i15 = (iArr2[iArr[i14]] >>> i3) & 255;
                    if (i15 == i11) {
                        iArr8[i11] = i14 + 1;
                    } else {
                        int i16 = iArr8[i15];
                        iArr8[i15] = i16 + 1;
                        int i17 = iArr[i14];
                        iArr[i14] = iArr[i16];
                        iArr[i16] = i17;
                    }
                }
            }
            i11 = i12;
        }
        if (i3 == 0) {
            return;
        }
        int i18 = i3 - 8;
        while (i6 < 256) {
            int i19 = iArr7[i6];
            int i20 = i6 + 1;
            int i21 = iArr7[i20];
            if (i21 - i19 > 1) {
                m22164(iArr, iArr2, i19, i21, i18, i4 + 1, iArr3, iArr4, iArr5);
            }
            i6 = i20;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22174(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i4];
            int i6 = i3;
            while (i6 > i) {
                int i7 = iArr[i6 - 1];
                if (iArr2[i7] <= i5) {
                    break;
                }
                iArr[i6] = i7;
                i6--;
            }
            iArr[i6] = i4;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m22186(int i) {
        return this.f27121[C17359.checkIndex(i, this.f27125)];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m22189(int i) {
        return this.f27124[C17359.checkIndex(i, this.f27125)];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m22190(int i) {
        return this.f27122[C17359.checkIndex(i, this.f27125)];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m22192(int i) {
        int iCheckIndex = C17359.checkIndex(i, this.f27125);
        int i2 = 0;
        while (true) {
            iCheckIndex = this.f27122[iCheckIndex];
            if (iCheckIndex == -1) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16800 m22193(int i) {
        return this.f27126[C17359.checkIndex(i, this.f27125)];
    }
}
