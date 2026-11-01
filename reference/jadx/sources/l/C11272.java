package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6CC8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11272 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final long[] f38094 = new long[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long[] f38093 = new long[0];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m28250(long[] jArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            long j = jArr[i];
            jArr[i] = jArr[i2];
            jArr[i2] = j;
            i4++;
            i++;
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28245(long[] jArr, int i, int i2, int i3, InterfaceC4816 interfaceC4816) {
        int iMo13375 = interfaceC4816.mo13375(jArr[i], jArr[i2]);
        int iMo13376 = interfaceC4816.mo13375(jArr[i], jArr[i3]);
        int iMo13377 = interfaceC4816.mo13375(jArr[i2], jArr[i3]);
        if (iMo13375 < 0) {
            if (iMo13377 >= 0) {
                if (iMo13376 < 0) {
                    return i3;
                }
                return i;
            }
            return i2;
        }
        if (iMo13377 <= 0) {
            if (iMo13376 > 0) {
                return i3;
            }
            return i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28248(long[] jArr, int i, int i2, InterfaceC4816 interfaceC4816) {
        int iM28245;
        int iM28246;
        int i3 = i2 - i;
        if (i3 < 16) {
            while (i < i2 - 1) {
                int i4 = i + 1;
                int i5 = i;
                for (int i6 = i4; i6 < i2; i6++) {
                    if (interfaceC4816.mo13375(jArr[i6], jArr[i5]) < 0) {
                        i5 = i6;
                    }
                }
                if (i5 != i) {
                    long j = jArr[i];
                    jArr[i] = jArr[i5];
                    jArr[i5] = j;
                }
                i = i4;
            }
            return;
        }
        int iM28247 = (i3 / 2) + i;
        int i7 = i2 - 1;
        if (i3 > 128) {
            int i8 = i3 / 8;
            int i9 = i8 * 2;
            iM28245 = m28245(jArr, i, i + i8, i + i9, interfaceC4816);
            iM28247 = m28245(jArr, iM28247 - i8, iM28247, iM28247 + i8, interfaceC4816);
            iM28246 = m28245(jArr, i7 - i9, i7 - i8, i7, interfaceC4816);
        } else {
            iM28245 = i;
            iM28246 = i7;
        }
        long j2 = jArr[m28245(jArr, iM28245, iM28247, iM28246, interfaceC4816)];
        int i10 = i;
        int i11 = i10;
        int i12 = i7;
        while (true) {
            if (i10 <= i7) {
                int iMo13375 = interfaceC4816.mo13375(jArr[i10], j2);
                if (iMo13375 <= 0) {
                    if (iMo13375 == 0) {
                        long j3 = jArr[i11];
                        jArr[i11] = jArr[i10];
                        jArr[i10] = j3;
                        i11++;
                    }
                    i10++;
                }
            }
            while (i7 >= i10) {
                int iMo13376 = interfaceC4816.mo13375(jArr[i7], j2);
                if (iMo13376 < 0) {
                    break;
                }
                if (iMo13376 == 0) {
                    long j4 = jArr[i7];
                    jArr[i7] = jArr[i12];
                    jArr[i12] = j4;
                    i12--;
                }
                i7--;
            }
            if (i10 > i7) {
                break;
            }
            long j5 = jArr[i10];
            jArr[i10] = jArr[i7];
            jArr[i7] = j5;
            i10++;
            i7--;
        }
        int i13 = i10 - i11;
        int iMin = Math.min(i11 - i, i13);
        m28250(jArr, i, i10 - iMin, iMin);
        int i14 = i12 - i7;
        int iMin2 = Math.min(i14, (i2 - i12) - 1);
        m28250(jArr, i10, i2 - iMin2, iMin2);
        if (i13 > 1) {
            m28248(jArr, i, i13 + i, interfaceC4816);
        }
        if (i14 > 1) {
            m28248(jArr, i2 - i14, i2, interfaceC4816);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28249(long[] jArr, int i, int i2, InterfaceC4816 interfaceC4816, long[] jArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (jArr2 == null) {
                jArr2 = Arrays.copyOf(jArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            m28249(jArr2, i, i4, interfaceC4816, jArr);
            m28249(jArr2, i4, i2, interfaceC4816, jArr);
            if (interfaceC4816.mo13375(jArr2[i4 - 1], jArr2[i4]) <= 0) {
                System.arraycopy(jArr2, i, jArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && interfaceC4816.mo13375(jArr2[i5], jArr2[i6]) <= 0)) {
                    jArr[i] = jArr2[i5];
                    i5++;
                } else {
                    jArr[i] = jArr2[i6];
                    i6++;
                }
                i++;
            }
            return;
        }
        int i7 = i;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= i2) {
                return;
            }
            long j = jArr[i8];
            long j2 = jArr[i7];
            int i9 = i8;
            while (interfaceC4816.mo13375(j, j2) < 0) {
                jArr[i9] = j2;
                if (i == i9 - 1) {
                    i9--;
                    break;
                }
                long j3 = jArr[i9 - 2];
                i9--;
                j2 = j3;
            }
            jArr[i9] = j;
            i7 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28244(long[] jArr, int i, int i2, int i3) {
        int iCompare = Long.compare(jArr[i], jArr[i2]);
        int iCompare2 = Long.compare(jArr[i], jArr[i3]);
        int iCompare3 = Long.compare(jArr[i2], jArr[i3]);
        if (iCompare < 0) {
            if (iCompare3 >= 0) {
                if (iCompare2 < 0) {
                    return i3;
                }
                return i;
            }
            return i2;
        }
        if (iCompare3 <= 0) {
            if (iCompare2 > 0) {
                return i3;
            }
            return i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28246(int i, int i2, long[] jArr) {
        int iM28244;
        int iM28245;
        int i3 = i2 - i;
        if (i3 < 16) {
            while (i < i2 - 1) {
                int i4 = i + 1;
                int i5 = i;
                for (int i6 = i4; i6 < i2; i6++) {
                    if (jArr[i6] < jArr[i5]) {
                        i5 = i6;
                    }
                }
                if (i5 != i) {
                    long j = jArr[i];
                    jArr[i] = jArr[i5];
                    jArr[i5] = j;
                }
                i = i4;
            }
            return;
        }
        int iM28246 = (i3 / 2) + i;
        int i7 = i2 - 1;
        if (i3 > 128) {
            int i8 = i3 / 8;
            int i9 = i8 * 2;
            iM28244 = m28244(jArr, i, i + i8, i + i9);
            iM28246 = m28244(jArr, iM28246 - i8, iM28246, iM28246 + i8);
            iM28245 = m28244(jArr, i7 - i9, i7 - i8, i7);
        } else {
            iM28244 = i;
            iM28245 = i7;
        }
        long j2 = jArr[m28244(jArr, iM28244, iM28246, iM28245)];
        int i10 = i;
        int i11 = i10;
        int i12 = i7;
        while (true) {
            if (i10 <= i7) {
                int iCompare = Long.compare(jArr[i10], j2);
                if (iCompare <= 0) {
                    if (iCompare == 0) {
                        long j3 = jArr[i11];
                        jArr[i11] = jArr[i10];
                        jArr[i10] = j3;
                        i11++;
                    }
                    i10++;
                }
            }
            while (i7 >= i10) {
                int iCompare2 = Long.compare(jArr[i7], j2);
                if (iCompare2 < 0) {
                    break;
                }
                if (iCompare2 == 0) {
                    long j4 = jArr[i7];
                    jArr[i7] = jArr[i12];
                    jArr[i12] = j4;
                    i12--;
                }
                i7--;
            }
            if (i10 > i7) {
                break;
            }
            long j5 = jArr[i10];
            jArr[i10] = jArr[i7];
            jArr[i7] = j5;
            i10++;
            i7--;
        }
        int i13 = i10 - i11;
        int iMin = Math.min(i11 - i, i13);
        m28250(jArr, i, i10 - iMin, iMin);
        int i14 = i12 - i7;
        int iMin2 = Math.min(i14, (i2 - i12) - 1);
        m28250(jArr, i10, i2 - iMin2, iMin2);
        if (i13 > 1) {
            m28246(i, i13 + i, jArr);
        }
        if (i14 > 1) {
            m28246(i2 - i14, i2, jArr);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28247(int i, long[] jArr) {
        int i2;
        if (i < 4000) {
            m28246(0, i, jArr);
            return;
        }
        if (i < 1024) {
            m28246(0, i, jArr);
            return;
        }
        int[] iArr = new int[1786];
        int[] iArr2 = new int[1786];
        int[] iArr3 = new int[1786];
        iArr[0] = 0;
        iArr2[0] = i;
        iArr3[0] = 0;
        int i3 = 256;
        int[] iArr4 = new int[256];
        int[] iArr5 = new int[256];
        int i4 = 1;
        int i5 = 1;
        long[] jArr2 = jArr;
        while (i5 > 0) {
            int i6 = i5 - 1;
            int i7 = iArr[i6];
            int i8 = iArr2[i6];
            int i9 = iArr3[i6];
            int i10 = i9 % 8;
            int i11 = i10 == 0 ? 128 : 0;
            int i12 = (7 - i10) * 8;
            int i13 = i8 + i7;
            int i14 = i13;
            while (true) {
                int i15 = i14 - 1;
                if (i14 == i7) {
                    break;
                }
                long[] jArr3 = jArr2;
                int i16 = (int) (((jArr2[i15] >>> i12) & 255) ^ ((long) i11));
                iArr4[i16] = iArr4[i16] + i4;
                jArr2 = jArr3;
                i14 = i15;
                i6 = i6;
            }
            int i17 = i6;
            long[] jArr4 = jArr2;
            int i18 = -1;
            int i19 = i7;
            for (int i20 = 0; i20 < i3; i20++) {
                int i21 = iArr4[i20];
                if (i21 != 0) {
                    i18 = i20;
                }
                i19 += i21;
                iArr5[i20] = i19;
            }
            int i22 = i13 - iArr4[i18];
            jArr2 = jArr4;
            i5 = i17;
            while (i7 <= i22) {
                long j = jArr2[i7];
                int[] iArr6 = iArr;
                int[] iArr7 = iArr2;
                long j2 = i11;
                int i23 = i11;
                int i24 = (int) (((j >>> i12) & 255) ^ j2);
                if (i7 < i22) {
                    long j3 = j;
                    while (true) {
                        int i25 = iArr5[i24] - 1;
                        iArr5[i24] = i25;
                        if (i25 <= i7) {
                            break;
                        }
                        long j4 = jArr[i25];
                        jArr[i25] = j3;
                        i24 = (int) (((j4 >>> i12) & 255) ^ j2);
                        j3 = j4;
                    }
                    jArr[i7] = j3;
                }
                if (i9 < 7 && (i2 = iArr4[i24]) > 1) {
                    if (i2 < 1024) {
                        m28246(i7, i2 + i7, jArr);
                    } else {
                        iArr6[i5] = i7;
                        iArr7[i5] = iArr4[i24];
                        iArr3[i5] = i9 + 1;
                        i5++;
                    }
                }
                i7 += iArr4[i24];
                iArr4[i24] = 0;
                i3 = 256;
                i4 = 1;
                jArr2 = jArr;
                iArr = iArr6;
                iArr2 = iArr7;
                i11 = i23;
            }
        }
    }
}
