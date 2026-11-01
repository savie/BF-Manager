package l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2357 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f8313;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long[] f8314;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f8315;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f8316;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f8317;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20889[] f8318;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f8319;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final long[] f8311 = new long[0];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final long[] f8310 = {0};

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int[] f8312 = {0};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int[] f8309 = {-1};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long m7145(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m7156(int i, int i2) {
        return (i >>> i2) & 255;
    }

    public C2357(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, C20889[] c20889Arr) {
        long[] jArr;
        int i3;
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        if (i2 <= 0 || i2 > iArr.length || i2 > iArr2.length || i2 > iArr3.length || i2 > c20889Arr.length) {
            throw new IllegalArgumentException("Invalid syntax context column size");
        }
        this.f8313 = i;
        this.f8316 = i2;
        this.f8319 = iArr;
        this.f8315 = iArr2;
        this.f8317 = iArr3;
        this.f8318 = c20889Arr;
        if (iArr[0] == 0 && iArr2[0] == i) {
            int i4 = -1;
            if (iArr3[0] == -1 && c20889Arr[0] != null) {
                int i5 = 1;
                while (true) {
                    int i6 = this.f8316;
                    if (i5 >= i6) {
                        if (i == 0) {
                            this.f8314 = f8311;
                            return;
                        }
                        if (i2 == 1) {
                            this.f8314 = f8310;
                            return;
                        }
                        int i7 = this.f8313;
                        int[] iArr4 = this.f8319;
                        int[] iArr5 = this.f8317;
                        int[] iArr6 = this.f8315;
                        int i8 = 1;
                        int i9 = 0;
                        int i10 = 0;
                        int iM7160 = 0;
                        loop1: while (true) {
                            if (i8 >= i6) {
                                while (true) {
                                    if (i9 < 0) {
                                        if (i10 != i7) {
                                            break;
                                        }
                                        i4 = iM7160;
                                        break;
                                    } else {
                                        int i11 = iArr6[i9];
                                        if (i11 < i10) {
                                            break;
                                        }
                                        if (i11 > i10) {
                                            iM7160 = m7160(iM7160);
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
                                        iM7160 = m7160(iM7160);
                                    }
                                    i10 = iArr6[i9];
                                    i9 = iArr5[i9];
                                }
                                int i13 = iArr4[i8];
                                if (i13 < i10) {
                                    break;
                                }
                                if (i13 > i10) {
                                    iM7160 = m7160(iM7160);
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
                                        jArr[i15] = m7145(i14, i16);
                                        i15++;
                                    }
                                    i14 = iArr6[i16];
                                    i16 = iArr5[i16];
                                }
                                if (iArr4[i17] > i14) {
                                    jArr[i15] = m7145(i14, i16);
                                    i15++;
                                }
                                i14 = iArr4[i17];
                                i16 = i17;
                            }
                            while (i16 >= 0) {
                                if (iArr6[i16] > i14) {
                                    jArr[i15] = m7145(i14, i16);
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
                            m7149(iArr7, iArr4);
                            m7149(iArr8, iArr6);
                            C9332 c9332 = new C9332(i6);
                            int iM7147 = m7147(iArr7, iArr8, c9332, (long[]) null);
                            jArr = new long[iM7147];
                            c9332.m23991();
                            if (m7147(iArr7, iArr8, c9332, jArr) != iM7147 || iM7147 == 0 || ((int) (jArr[0] >>> 32)) != 0) {
                                throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                            }
                        }
                        this.f8314 = jArr;
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
                throw new IllegalArgumentException(C8479.m22141(i5, "Invalid syntax context node: "));
            }
        }
        throw new IllegalArgumentException("Invalid syntax context root");
    }

    public C2357(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, C20889[] c20889Arr, long[] jArr) {
        this.f8313 = i;
        this.f8316 = i2;
        this.f8319 = iArr;
        this.f8315 = iArr2;
        this.f8317 = iArr3;
        this.f8318 = c20889Arr;
        this.f8314 = jArr;
    }

    public C2357(int i, C20889 c20889) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        this.f8313 = i;
        this.f8316 = 1;
        this.f8319 = f8312;
        this.f8315 = new int[]{i};
        this.f8317 = f8309;
        C13638.requireNonNull(c20889);
        this.f8318 = new C20889[]{c20889};
        if (i == 0) {
            this.f8314 = f8311;
        } else {
            this.f8314 = f8310;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C2357 m7157(int i, C20889 c20889) {
        return new C2357(i, c20889);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7169(int i, C20889 c20889) {
        return this.f8313 == i && this.f8318[0] == c20889;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7166() {
        return this.f8316;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m7174() {
        return this.f8313;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7167(int i) {
        C13638.checkIndex(i, this.f8313);
        return m7165(m7173(i));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m7173(int i) {
        C13638.checkIndex(i, this.f8313);
        long[] jArr = this.f8314;
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
    public final int m7168(int i, int i2) {
        int[] iArr;
        C13638.checkFromToIndex(i, i2, this.f8313);
        if (i == i2) {
            throw new IllegalArgumentException("Empty syntax context range");
        }
        int iM7173 = m7173(i);
        int iM7165 = m7165(iM7173);
        do {
            iM7173++;
            if (iM7173 >= this.f8314.length || m7171(iM7173) >= i2) {
                break;
            }
            int iM7166 = m7165(iM7173);
            int iM7175 = m7175(iM7165);
            int iM7176 = m7175(iM7166);
            while (true) {
                iArr = this.f8317;
                if (iM7175 <= iM7176) {
                    break;
                }
                iM7165 = iArr[iM7165];
                iM7175--;
            }
            while (iM7176 > iM7175) {
                iM7166 = iArr[iM7166];
                iM7176--;
            }
            while (iM7165 != iM7166) {
                iM7165 = iArr[iM7165];
                iM7166 = iArr[iM7166];
            }
        } while (iM7165 != 0);
        return iM7165;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m7163(int i) {
        long[] jArr = this.f8314;
        int iCheckIndex = C13638.checkIndex(i, jArr.length) + 1;
        return iCheckIndex < jArr.length ? (int) (jArr[iCheckIndex] >>> 32) : this.f8313;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m7165(int i) {
        long[] jArr = this.f8314;
        return (int) jArr[C13638.checkIndex(i, jArr.length)];
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m7171(int i) {
        long[] jArr = this.f8314;
        return (int) (jArr[C13638.checkIndex(i, jArr.length)] >>> 32);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static int m7160(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new OutOfMemoryError("Syntax context run count exceeded");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m7147(int[] iArr, int[] iArr2, C9332 c9332, long[] jArr) {
        int i = 0;
        int i2 = 0;
        int iM7160 = 0;
        int i3 = -1;
        while (true) {
            int i4 = this.f8316;
            if (i >= i4 && i2 >= i4) {
                break;
            }
            int[] iArr3 = this.f8319;
            long j = C17492.FOREVER_NS;
            long j2 = i < i4 ? iArr3[iArr[i]] : Long.MAX_VALUE;
            int[] iArr4 = this.f8315;
            int iMin = (int) Math.min(j2, i2 < i4 ? iArr4[iArr2[i2]] : Long.MAX_VALUE);
            while (i2 < i4) {
                int i5 = iArr2[i2];
                if (iArr4[i5] != iMin) {
                    break;
                }
                i2++;
                c9332.m23994(i5);
            }
            while (i < i4) {
                int i6 = iArr[i];
                if (iArr3[i6] != iMin) {
                    break;
                }
                i++;
                c9332.m23992(i6);
            }
            if (i == i4 && i2 == i4) {
                break;
            }
            long j3 = i < i4 ? iArr3[iArr[i]] : Long.MAX_VALUE;
            if (i2 < i4) {
                j = iArr4[iArr2[i2]];
            }
            if (Math.min(j3, j) > iMin) {
                int iM23993 = c9332.m23993();
                if (iM23993 < 0) {
                    throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                }
                if (iM23993 != i3) {
                    if (jArr != null) {
                        jArr[iM7160] = m7145(iMin, iM23993);
                    }
                    iM7160 = m7160(iM7160);
                    i3 = iM23993;
                }
            }
        }
        return iM7160;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7149(int[] iArr, int[] iArr2) {
        Class cls = Integer.TYPE;
        m7150(iArr, iArr2, 0, iArr.length, 24, 0, (int[][]) Array.newInstance((Class<?>) cls, 4, 256), (int[][]) Array.newInstance((Class<?>) cls, 4, 257), (int[][]) Array.newInstance((Class<?>) cls, 4, 256));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7150(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int[][] iArr3, int[][] iArr4, int[][] iArr5) {
        int i5 = i2 - i;
        if (i5 < 2) {
            return;
        }
        if (i5 <= 64) {
            m7158(i, i2, iArr, iArr2);
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
                m7150(iArr, iArr2, i19, i21, i18, i4 + 1, iArr3, iArr4, iArr5);
            }
            i6 = i20;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m7158(int i, int i2, int[] iArr, int[] iArr2) {
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20889 m7164(int i) {
        return this.f8318[C13638.checkIndex(i, this.f8316)];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m7170(int i) {
        return this.f8317[C13638.checkIndex(i, this.f8316)];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m7172(int i) {
        return this.f8315[C13638.checkIndex(i, this.f8316)];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m7175(int i) {
        int iCheckIndex = C13638.checkIndex(i, this.f8316);
        int i2 = 0;
        while (true) {
            iCheckIndex = this.f8317[iCheckIndex];
            if (iCheckIndex == -1) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m7176(int i) {
        return this.f8319[C13638.checkIndex(i, this.f8316)];
    }
}
