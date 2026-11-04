package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۬ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FIQP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13616 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f43253;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f43254;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4933 f43256;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f43257;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f43259;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C8396 f43255 = new C8396(this);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9887 f43258 = new C9887(this);

    public C13616(C4933 c4933) {
        this.f43256 = c4933;
        this.f43253 = c4933 != null && c4933.f17206;
        this.f43259 = c4933 == null ? 0L : c4933.f17208;
        this.f43254 = c4933 == null ? 0 : c4933.f17199;
        this.f43257 = c4933 != null ? c4933.f17204 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33367(long j) {
        C4933 c4933 = this.f43256;
        if (c4933 == null) {
            return -1;
        }
        if (j < 0) {
            c4933.getClass();
        } else if (j < c4933.f17208) {
            int i = 0;
            while (true) {
                C4933 c4934 = c4933.f17200;
                if (c4934 == null) {
                    return i;
                }
                long j2 = c4934.f17208;
                if (j < j2) {
                    c4933 = c4934;
                } else {
                    j -= j2;
                    i += c4934.f17198;
                    c4933 = c4933.f17202;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33368(long j, boolean z) {
        C4933 c4933 = this.f43256;
        if (c4933 == null) {
            return -1;
        }
        if (j < 0) {
            c4933.getClass();
            return -1;
        }
        if (j < c4933.f17208) {
            int i = 0;
            while (true) {
                C4933 c4934 = c4933.f17200;
                if (c4934 == null) {
                    break;
                }
                long j2 = c4934.f17208;
                if (j < j2) {
                    c4933 = c4934;
                } else {
                    j -= j2;
                    i += z ? c4934.f17199 : c4934.f17204;
                    c4933 = c4933.f17202;
                }
            }
            if (j < (z ? c4933.f17199 : c4933.f17204)) {
                return i + ((int) j);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m33369(int i, boolean z) {
        C4933 c4933 = this.f43256;
        if (c4933 == null) {
            return 0L;
        }
        return c4933.m15141(i, z);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01df  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13616 m33361(InterfaceC22808 interfaceC22808, InterfaceC22808 interfaceC22809, BooleanSupplier booleanSupplier) throws C12893, C9446 {
        int i;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C6905 c6905;
        int i7;
        int[] iArrM33365;
        C6905 c6906;
        byte[] bArr4;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        byte[] bArr5;
        C7651 c7651 = new C7651();
        int length = interfaceC22808.length();
        int length2 = interfaceC22809.length();
        int i11 = 16384;
        byte[] bArr6 = new byte[16384];
        C6905 c6907 = new C6905(interfaceC22808, booleanSupplier);
        C6905 c6908 = new C6905(interfaceC22809, booleanSupplier);
        int i12 = 0;
        int i13 = length;
        long j = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z = false;
        int i16 = length2;
        byte[] bArr7 = new byte[16384];
        while (true) {
            ArrayList arrayList = c7651.f25219;
            if (i15 < i13 || i14 < i16) {
                m33366(booleanSupplier);
                if (arrayList.size() >= 100000) {
                    c7651.m20865(4, i15, i14, i13 - i15, i16 - i14);
                } else {
                    int i17 = i13 - i15;
                    int iMin = Math.min(i11, i17);
                    int i18 = i16 - i14;
                    int iMin2 = Math.min(i11, i18);
                    if (iMin == 0 || iMin2 == 0) {
                        int i19 = i14;
                        i = 0;
                        c7651.m20865(iMin == 0 ? 3 : 2, i15, i19, i17, i18);
                    } else {
                        c6907.m19157(i15, iMin, bArr7);
                        c6908.m19157(i14, iMin2, bArr6);
                        int i20 = 0;
                        while (true) {
                            if (i20 >= Math.min(iMin, iMin2)) {
                                bArr = bArr7;
                                break;
                            }
                            bArr = bArr7;
                            if (bArr7[i20] != bArr6[i20]) {
                                break;
                            }
                            i20++;
                            bArr7 = bArr;
                        }
                        if (i20 > 0) {
                            int i21 = i20;
                            bArr2 = bArr6;
                            bArr3 = bArr;
                            c7651.m20865(0, i15, i14, i21, i21);
                            i15 += i21;
                            i14 += i21;
                            i11 = 16384;
                        } else {
                            bArr2 = bArr6;
                            bArr3 = bArr;
                            if (!z) {
                                int iMin3 = Math.min(i17, i18);
                                int i22 = 0;
                                byte[] bArr8 = bArr2;
                                byte[] bArr9 = bArr3;
                                while (i22 < iMin3) {
                                    m33366(booleanSupplier);
                                    int iMin4 = Math.min(i22 == 0 ? 16384 : 262144, iMin3 - i22);
                                    if (bArr9.length < iMin4) {
                                        bArr8 = new byte[iMin4];
                                        bArr9 = new byte[iMin4];
                                    }
                                    c6907.m19158((i13 - i22) - iMin4, iMin4, bArr9);
                                    c6908.m19158((i16 - i22) - iMin4, iMin4, bArr8);
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 >= iMin4) {
                                            i10 = iMin3;
                                            bArr5 = bArr9;
                                            break;
                                        }
                                        m33366(booleanSupplier);
                                        int iMin5 = Math.min(iMin4, i23 + 16384);
                                        while (true) {
                                            if (i23 >= iMin5) {
                                                i10 = iMin3;
                                                bArr5 = bArr9;
                                                break;
                                            }
                                            int i24 = (iMin4 - i23) - 1;
                                            i10 = iMin3;
                                            bArr5 = bArr9;
                                            if (bArr9[i24] != bArr8[i24]) {
                                                break;
                                            }
                                            i23++;
                                            iMin3 = i10;
                                            bArr9 = bArr5;
                                        }
                                        if (i23 != iMin5) {
                                            break;
                                        }
                                        iMin3 = i10;
                                        bArr9 = bArr5;
                                    }
                                    i22 += i23;
                                    if (i23 != iMin4) {
                                        break;
                                    }
                                    iMin3 = i10;
                                    bArr9 = bArr5;
                                }
                                i12 = i22;
                                i13 -= i12;
                                i16 -= i12;
                                i11 = 16384;
                                z = true;
                            } else {
                                C0193 c0193 = c7651.f25216;
                                if (c0193 == null || !c0193.m1555(i15, iMin, i14, iMin2)) {
                                    i2 = iMin;
                                    i3 = i16;
                                    i4 = i17;
                                    i5 = i13;
                                    i6 = iMin2;
                                    c6905 = c6908;
                                    int[] iArrM33366 = m33365(c7651, bArr3, Math.min(iMin, 512), bArr2, Math.min(iMin2, 512), booleanSupplier);
                                    if (iArrM33366 != null || (i2 <= 512 && i6 <= 512)) {
                                        i7 = 2048;
                                    } else {
                                        i7 = 2048;
                                        iArrM33366 = m33365(c7651, bArr3, Math.min(i2, 2048), bArr2, Math.min(i6, 2048), booleanSupplier);
                                    }
                                    iArrM33365 = iArrM33366;
                                    if (iArrM33365 == null && (i2 > i7 || i6 > i7)) {
                                        iArrM33365 = m33365(c7651, bArr3, i2, bArr2, i6, booleanSupplier);
                                    }
                                } else {
                                    iArrM33365 = null;
                                    i2 = iMin;
                                    i3 = i16;
                                    i5 = i13;
                                    c6905 = c6908;
                                    i4 = i17;
                                    i6 = iMin2;
                                }
                                if (iArrM33365 != null || (i4 <= 16384 && i18 <= 16384)) {
                                    c6906 = c6905;
                                    bArr4 = bArr3;
                                    iArr = iArrM33365;
                                } else {
                                    long j2 = ((long) i14) + ((long) i15);
                                    if (j2 >= j) {
                                        if (bArr3.length < 262144) {
                                            bArr2 = new byte[262144];
                                            bArr4 = new byte[262144];
                                        } else {
                                            bArr4 = bArr3;
                                        }
                                        int iMin6 = Math.min(262144, i4);
                                        int iMin7 = Math.min(262144, i18);
                                        c6907.m19157(i15, iMin6, bArr4);
                                        C6905 c6909 = c6905;
                                        c6909.m19157(i14, iMin7, bArr2);
                                        c6906 = c6909;
                                        iArrM33365 = m33365(c7651, bArr4, iMin6, bArr2, iMin7, booleanSupplier);
                                        if (iArrM33365 == null) {
                                            long j3 = j2 + 262144;
                                            C0193 c0194 = c7651.f25216;
                                            if (c0194 != null && c0194.f1296) {
                                                c0194.m1554(i15, iMin6, i14, iMin7);
                                            }
                                            iArr = iArrM33365;
                                            j = j3;
                                        }
                                    } else {
                                        c6906 = c6905;
                                        bArr4 = bArr3;
                                    }
                                    iArr = iArrM33365;
                                }
                                if (iArr != null) {
                                    m33363(c7651, bArr4, iArr[0], bArr2, iArr[1], i15, i14, booleanSupplier);
                                    i15 += iArr[0];
                                    i14 += iArr[1];
                                    i9 = i3;
                                } else {
                                    int i25 = i3;
                                    int i26 = i14;
                                    int i27 = i15 + i2;
                                    int i28 = i5;
                                    if (i27 == i28 && i26 + i6 == i25) {
                                        i5 = i28;
                                        m33363(c7651, bArr4, i2, bArr2, i6, i15, i26, booleanSupplier);
                                        i8 = i6;
                                        i9 = i25;
                                    } else {
                                        i5 = i28;
                                        i8 = i6;
                                        int i29 = i15;
                                        i9 = i25;
                                        int[] iArrM33364 = m33364(c7651, bArr4, 0, Math.min(i2, 2048), bArr2, 0, Math.min(i6, 2048), i15, i26, true, booleanSupplier);
                                        if (iArrM33364 != null) {
                                            i15 = i29 + iArrM33364[0];
                                            i14 = i26 + iArrM33364[1];
                                        } else {
                                            c7651.m20865(4, i29, i26, i2, i8);
                                        }
                                    }
                                    i14 = i26 + i8;
                                    i15 = i27;
                                }
                                i11 = 16384;
                                bArr6 = bArr2;
                                bArr7 = bArr4;
                                c6908 = c6906;
                                i13 = i5;
                                i16 = i9;
                            }
                        }
                        bArr6 = bArr2;
                        bArr7 = bArr3;
                    }
                }
                c7651.m20865(0, i13, i16, i12, i12);
                m33366(booleanSupplier);
                if (interfaceC22808.mo2792() || !interfaceC22809.mo2792()) {
                    throw new C12893();
                }
                int length3 = interfaceC22808.length();
                int length4 = interfaceC22809.length();
                C13616 c13616 = new C13616(C4933.m15131(i, arrayList.size(), arrayList));
                if (c13616.f43254 == length3 && c13616.f43257 == length4) {
                    return c13616;
                }
                throw new IllegalStateException("Alignment coverage mismatch");
            }
            i = 0;
            c7651.m20865(0, i13, i16, i12, i12);
            m33366(booleanSupplier);
            if (interfaceC22808.mo2792()) {
            }
            throw new C12893();
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x016b  */
    /* JADX WARN: Code duplicated, block: B:86:0x017e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m33365(C7651 c7651, byte[] bArr, int i, byte[] bArr2, int i2, BooleanSupplier booleanSupplier) throws C9446 {
        char c;
        long j;
        int[] iArr;
        int[] iArr2;
        long j2;
        long[] jArr;
        int i3 = 32;
        if (i < 32 || i2 < 32) {
            return null;
        }
        if (c7651.f25216 == null) {
            c7651.f25216 = new C0193();
        }
        C0193 c0193 = c7651.f25216;
        c0193.f1296 = true;
        int[] iArr3 = c0193.f1297;
        Arrays.fill(iArr3, -1);
        int i4 = (i / 32) + 1;
        int[] iArr4 = c0193.f1295;
        if (iArr4 == null || iArr4.length < i4) {
            c0193.f1295 = new int[i4];
            c0193.f1299 = new long[i4];
        }
        if (i > 16384) {
            long[] jArr2 = c0193.f1300;
            if (jArr2 == null) {
                c0193.f1300 = new long[iArr3.length];
            } else {
                Arrays.fill(jArr2, 0L);
            }
        }
        int[] iArr5 = c0193.f1295;
        long[] jArr3 = c0193.f1299;
        long[] jArr4 = i > 16384 ? c0193.f1300 : null;
        long j3 = 1;
        for (int i5 = 1; i5 < 32; i5++) {
            j3 *= 257;
        }
        int i6 = ((i - 32) / 32) * 32;
        while (true) {
            c = ':';
            if (i6 < 0) {
                break;
            }
            if ((i6 & 1023) == 0) {
                m33366(booleanSupplier);
            }
            long j4 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                j4 = (j4 * 257) + ((long) (bArr[i6 + i7] & 255));
            }
            int i8 = i6 / 32;
            int length = ((int) (j4 ^ (j4 >>> i3))) & (iArr3.length - 1);
            jArr3[i8] = j4;
            iArr5[i8] = iArr3[length];
            iArr3[length] = i8;
            if (jArr4 != null) {
                jArr = jArr4;
                jArr[length] = (1 << ((int) (j4 >>> 58))) | jArr4[length];
            } else {
                jArr = jArr4;
            }
            i6 -= 32;
            i3 = 32;
            jArr4 = jArr;
        }
        long[] jArr5 = jArr4;
        char c2 = ' ';
        long j5 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            j5 = (j5 * 257) + ((long) (bArr2[i9] & 255));
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            int i14 = i11 + 32;
            if (i14 > i2 || i11 >= i10) {
                break;
            }
            int i15 = i10;
            if ((i11 & 1023) == 0) {
                m33366(booleanSupplier);
            }
            int i16 = i12;
            int i17 = i13;
            int length2 = ((int) ((j5 >>> c2) ^ j5)) & (iArr3.length - 1);
            if (jArr5 != null) {
                j = j3;
                if ((jArr5[length2] & (1 << ((int) (j5 >>> c)))) == 0) {
                    i12 = i16;
                    i13 = i17;
                    iArr = iArr3;
                    i10 = i15;
                }
                if (i14 < i2) {
                    j2 = 257;
                    j5 = ((j5 - (((long) (bArr2[i11] & 255)) * j)) * 257) + ((long) (bArr2[i14] & 255));
                } else {
                    j2 = 257;
                }
                i11++;
                c2 = ' ';
                j3 = j;
                iArr3 = iArr;
                c = ':';
            } else {
                j = j3;
            }
            int i18 = iArr3[length2];
            int i19 = 0;
            int i20 = i16;
            int i21 = i17;
            int i22 = i15;
            while (i18 >= 0) {
                int i23 = i19 + 1;
                int i24 = 32;
                if (i19 >= 32) {
                    break;
                }
                int i25 = i18 * 32;
                int i26 = i25 + i11;
                if (i26 >= i22 || jArr3[i18] != j5) {
                    iArr2 = iArr3;
                } else {
                    int i27 = 0;
                    while (true) {
                        if (i27 >= i24) {
                            iArr2 = iArr3;
                            break;
                        }
                        iArr2 = iArr3;
                        if (bArr[i25 + i27] != bArr2[i11 + i27]) {
                            i24 = 32;
                            break;
                        }
                        i27++;
                        i24 = 32;
                        iArr3 = iArr2;
                    }
                    if (i27 == i24) {
                        i21 = i11;
                        i20 = i25;
                        i22 = i26;
                    }
                    i18 = iArr5[i18];
                    i19 = i23;
                    iArr3 = iArr2;
                }
                i22 = i22;
                i18 = iArr5[i18];
                i19 = i23;
                iArr3 = iArr2;
            }
            int i28 = i22;
            iArr = iArr3;
            if (i18 >= 0) {
                c0193.f1296 = false;
            }
            i12 = i20;
            i13 = i21;
            i10 = i28;
            if (i14 < i2) {
                j2 = 257;
                j5 = ((j5 - (((long) (bArr2[i11] & 255)) * j)) * 257) + ((long) (bArr2[i14] & 255));
            } else {
                j2 = 257;
            }
            i11++;
            c2 = ' ';
            j3 = j;
            iArr3 = iArr;
            c = ':';
        }
        int i29 = i12;
        int i30 = i13;
        if (i29 < 0) {
            return null;
        }
        int i31 = i29;
        int i32 = i30;
        while (i31 > 0 && i32 > 0 && bArr[i31 - 1] == bArr2[i32 - 1]) {
            i31--;
            i32--;
        }
        return new int[]{i31, i32};
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076 A[PHI: r5
      0x0076: PHI (r5v1 int[]) = (r5v0 int[]), (r5v3 int[]), (r5v3 int[]) binds: [B:12:0x002a, B:18:0x0051, B:21:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33363(C7651 c7651, byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, BooleanSupplier booleanSupplier) throws C9446 {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i5 <= 0 && i6 <= 0) {
                return;
            }
            m33366(booleanSupplier);
            if (i5 == 0 || i6 == 0) {
                c7651.m20865(1, i7, i8, i5, i6);
                return;
            }
            int[] iArrM33364 = null;
            if (c7651.f25219.size() < 100000) {
                if (i5 + i6 <= 8192 && Math.abs(i5 - i6) <= 256) {
                    iArrM33364 = m33364(c7651, bArr, i9, i5, bArr2, i10, i6, i7, i8, false, booleanSupplier);
                }
                if (iArrM33364 == null && (i5 > 2048 || i6 > 2048)) {
                    iArrM33364 = m33364(c7651, bArr, i9, Math.min(i5, 2048), bArr2, i10, Math.min(i6, 2048), i7, i8, true, booleanSupplier);
                }
            }
            if (iArrM33364 == null) {
                c7651.m20865(4, i7, i8, i5, i6);
                return;
            }
            int i11 = iArrM33364[0];
            i9 += i11;
            int i12 = iArrM33364[1];
            i10 += i12;
            i7 += i11;
            i8 += i12;
            i5 -= i11;
            i6 -= i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m33364(C7651 c7651, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, int i5, int i6, boolean z, BooleanSupplier booleanSupplier) throws C9446 {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        m33366(booleanSupplier);
        if (c7651.f25217 == null) {
            c7651.f25217 = new C0939();
        }
        C0939 c0939 = c7651.f25217;
        if (!c0939.m3759(bArr, i, i2, bArr2, i3, i4, z) && (!z || !c0939.m3759(bArr2, i3, i4, bArr, i, i2, true))) {
            return null;
        }
        if (!c0939.m3760(bArr, i, i2, bArr2, i3, i4, z, booleanSupplier) && (!z || !c0939.m3760(bArr2, i3, i4, bArr, i, i2, true, booleanSupplier))) {
            return null;
        }
        c0939.m3758();
        int[] iArr = c0939.f3464;
        int[][] iArr2 = c0939.f3465;
        int i12 = 0;
        loop0: while (true) {
            if (i12 > 256) {
                i12 = -1;
                i7 = i2;
                i8 = i4;
                break;
            }
            m33366(booleanSupplier);
            int i13 = -i12;
            int i14 = i13;
            while (i14 <= i12) {
                i7 = (i14 == i13 || (i14 != i12 && iArr[i14 + 256] < iArr[i14 + 258])) ? iArr[i14 + 258] : iArr[i14 + 256] + 1;
                i8 = i7 - i14;
                while (i7 < i2 && i8 < i4 && bArr[i + i7] == bArr2[i3 + i8]) {
                    i7++;
                    i8++;
                }
                iArr[i14 + 257] = i7;
                if (!z) {
                    if (i7 >= i2 && i8 >= i4) {
                        break loop0;
                    }
                    i14 += 2;
                } else {
                    if (i7 >= i2 || i8 >= i4) {
                        break loop0;
                    }
                    i14 += 2;
                }
            }
            if (i12 < 256) {
                if (iArr2[i12] == null) {
                    iArr2[i12] = new int[(i12 * 2) + 1];
                }
                System.arraycopy(iArr, 257 - i12, iArr2[i12], 0, (i12 * 2) + 1);
            }
            i12++;
        }
        if (i12 < 0) {
            return null;
        }
        int iMin = Math.min(i2, i4);
        if (c0939.f3466 == null || c0939.f3466.length < iMin) {
            c0939.f3466 = new int[iMin];
            c0939.f3463 = new int[iMin];
        }
        int[] iArr3 = c0939.f3466;
        int[] iArr4 = c0939.f3463;
        int i15 = 0;
        int i16 = i7;
        int i17 = i8;
        while (i12 > 0) {
            int i18 = i12 - 1;
            int[] iArr5 = iArr2[i18];
            int i19 = i16 - i17;
            if (i19 == (-i12)) {
                i11 = i19 + 1;
            } else {
                if (i19 != i12) {
                    int i20 = i18 + i19;
                    if (iArr5[i20 - 1] < iArr5[i20 + 1]) {
                        i11 = i19 + 1;
                    }
                }
                i11 = i19 - 1;
            }
            int i21 = iArr5[i18 + i11];
            int i22 = i21 - i11;
            while (i16 > i21 && i17 > i22) {
                i16--;
                iArr3[i15] = i16;
                i17--;
                iArr4[i15] = i17;
                i15++;
            }
            i12--;
            i16 = i21;
            i17 = i22;
        }
        while (i16 > 0 && i17 > 0) {
            i16--;
            iArr3[i15] = i16;
            i17--;
            iArr4[i15] = i17;
            i15++;
        }
        int i23 = 0;
        if (z) {
            while (true) {
                i10 = i23 + 8;
                if (i10 > i15) {
                    break;
                }
                if (iArr3[i23] < i2 - 256 && iArr4[i23] < i4 - 256) {
                    int i24 = 1;
                    while (i24 < 8) {
                        int i25 = i23 + i24;
                        if (iArr3[i25] != iArr3[i23] - i24 || iArr4[i25] != iArr4[i23] - i24) {
                            break;
                        }
                        i24++;
                    }
                    if (i24 == 8) {
                        break;
                    }
                }
                i23++;
            }
            if (i10 > i15) {
                return null;
            }
            i7 = iArr3[i23] + 1;
            i8 = iArr4[i23] + 1;
        }
        int i26 = i15 - 1;
        int i27 = 0;
        int i28 = 0;
        while (i26 >= i23) {
            int i29 = 1;
            while (true) {
                i9 = i26 - i29;
                if (i9 < i23 || iArr3[i9] != iArr3[i26] + i29 || iArr4[i9] != iArr4[i26] + i29) {
                    break;
                }
                i29++;
            }
            c7651.m20865(1, i5 + i27, i6 + i28, iArr3[i26] - i27, iArr4[i26] - i28);
            c7651.m20865(0, i5 + iArr3[i26], i6 + iArr4[i26], i29, i29);
            i27 = iArr3[i26] + i29;
            i28 = iArr4[i26] + i29;
            i26 = i9;
        }
        c7651.m20865(1, i5 + i27, i6 + i28, i7 - i27, i8 - i28);
        return new int[]{i7, i8};
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m33366(BooleanSupplier booleanSupplier) throws C9446 {
        if (booleanSupplier.getAsBoolean()) {
            throw new C9446();
        }
    }
}
