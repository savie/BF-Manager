package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17124 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final char[] f54609 = new char[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f54608 = new char[0];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m39987(int i, int i2, char[] cArr, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            char c = cArr[i];
            cArr[i] = cArr[i2];
            cArr[i2] = c;
            i4++;
            i++;
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39982(char[] cArr, int i, int i2, int i3, InterfaceC4692 interfaceC4692) {
        int iMo12999 = interfaceC4692.mo12999(cArr[i], cArr[i2]);
        int iMo129910 = interfaceC4692.mo12999(cArr[i], cArr[i3]);
        int iMo129911 = interfaceC4692.mo12999(cArr[i2], cArr[i3]);
        if (iMo12999 < 0) {
            if (iMo129911 >= 0) {
                if (iMo129910 < 0) {
                    return i3;
                }
                return i;
            }
            return i2;
        }
        if (iMo129911 <= 0) {
            if (iMo129910 > 0) {
                return i3;
            }
            return i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39985(char[] cArr, int i, int i2, InterfaceC4692 interfaceC4692) {
        int iM39982;
        int iM39983;
        int i3 = i2 - i;
        if (i3 < 16) {
            while (i < i2 - 1) {
                int i4 = i + 1;
                int i5 = i;
                for (int i6 = i4; i6 < i2; i6++) {
                    if (interfaceC4692.mo12999(cArr[i6], cArr[i5]) < 0) {
                        i5 = i6;
                    }
                }
                if (i5 != i) {
                    char c = cArr[i];
                    cArr[i] = cArr[i5];
                    cArr[i5] = c;
                }
                i = i4;
            }
            return;
        }
        int iM39984 = (i3 / 2) + i;
        int i7 = i2 - 1;
        if (i3 > 128) {
            int i8 = i3 / 8;
            int i9 = i8 * 2;
            iM39982 = m39982(cArr, i, i + i8, i + i9, interfaceC4692);
            iM39984 = m39982(cArr, iM39984 - i8, iM39984, iM39984 + i8, interfaceC4692);
            iM39983 = m39982(cArr, i7 - i9, i7 - i8, i7, interfaceC4692);
        } else {
            iM39982 = i;
            iM39983 = i7;
        }
        char c2 = cArr[m39982(cArr, iM39982, iM39984, iM39983, interfaceC4692)];
        int i10 = i;
        int i11 = i10;
        int i12 = i7;
        while (true) {
            if (i10 <= i7) {
                int iMo12999 = interfaceC4692.mo12999(cArr[i10], c2);
                if (iMo12999 <= 0) {
                    if (iMo12999 == 0) {
                        char c3 = cArr[i11];
                        cArr[i11] = cArr[i10];
                        cArr[i10] = c3;
                        i11++;
                    }
                    i10++;
                }
            }
            while (i7 >= i10) {
                int iMo129910 = interfaceC4692.mo12999(cArr[i7], c2);
                if (iMo129910 < 0) {
                    break;
                }
                if (iMo129910 == 0) {
                    char c4 = cArr[i7];
                    cArr[i7] = cArr[i12];
                    cArr[i12] = c4;
                    i12--;
                }
                i7--;
            }
            if (i10 > i7) {
                break;
            }
            char c5 = cArr[i10];
            cArr[i10] = cArr[i7];
            cArr[i7] = c5;
            i10++;
            i7--;
        }
        int i13 = i11 - i;
        int i14 = i10 - i11;
        int iMin = Math.min(i13, i14);
        m39987(i, i10 - iMin, cArr, iMin);
        int i15 = i12 - i7;
        int iMin2 = Math.min(i15, (i2 - i12) - 1);
        m39987(i10, i2 - iMin2, cArr, iMin2);
        if (i14 > 1) {
            m39985(cArr, i, i14 + i, interfaceC4692);
        }
        if (i15 > 1) {
            m39985(cArr, i2 - i15, i2, interfaceC4692);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39986(char[] cArr, int i, int i2, InterfaceC4692 interfaceC4692, char[] cArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (cArr2 == null) {
                cArr2 = Arrays.copyOf(cArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            m39986(cArr2, i, i4, interfaceC4692, cArr);
            m39986(cArr2, i4, i2, interfaceC4692, cArr);
            if (interfaceC4692.mo12999(cArr2[i4 - 1], cArr2[i4]) <= 0) {
                System.arraycopy(cArr2, i, cArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && interfaceC4692.mo12999(cArr2[i5], cArr2[i6]) <= 0)) {
                    cArr[i] = cArr2[i5];
                    i5++;
                } else {
                    cArr[i] = cArr2[i6];
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
            char c = cArr[i8];
            char c2 = cArr[i7];
            int i9 = i8;
            while (interfaceC4692.mo12999(c, c2) < 0) {
                cArr[i9] = c2;
                if (i == i9 - 1) {
                    i9--;
                    break;
                }
                int i10 = i9 - 1;
                char c3 = cArr[i9 - 2];
                i9 = i10;
                c2 = c3;
            }
            cArr[i9] = c;
            i7 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39981(int i, int i2, char[] cArr, int i3) {
        int iCompare = Character.compare(cArr[i], cArr[i2]);
        int iCompare2 = Character.compare(cArr[i], cArr[i3]);
        int iCompare3 = Character.compare(cArr[i2], cArr[i3]);
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
    public static void m39984(char[] cArr, int i, int i2) {
        int iM39981;
        int iM39982;
        int i3 = i2 - i;
        if (i3 < 16) {
            while (i < i2 - 1) {
                int i4 = i + 1;
                int i5 = i;
                for (int i6 = i4; i6 < i2; i6++) {
                    if (cArr[i6] < cArr[i5]) {
                        i5 = i6;
                    }
                }
                if (i5 != i) {
                    char c = cArr[i];
                    cArr[i] = cArr[i5];
                    cArr[i5] = c;
                }
                i = i4;
            }
            return;
        }
        int iM39983 = (i3 / 2) + i;
        int i7 = i2 - 1;
        if (i3 > 128) {
            int i8 = i3 / 8;
            int i9 = i8 * 2;
            iM39981 = m39981(i, i + i8, cArr, i + i9);
            iM39983 = m39981(iM39983 - i8, iM39983, cArr, iM39983 + i8);
            iM39982 = m39981(i7 - i9, i7 - i8, cArr, i7);
        } else {
            iM39981 = i;
            iM39982 = i7;
        }
        char c2 = cArr[m39981(iM39981, iM39983, cArr, iM39982)];
        int i10 = i;
        int i11 = i10;
        int i12 = i7;
        while (true) {
            if (i10 <= i7) {
                int iCompare = Character.compare(cArr[i10], c2);
                if (iCompare <= 0) {
                    if (iCompare == 0) {
                        char c3 = cArr[i11];
                        cArr[i11] = cArr[i10];
                        cArr[i10] = c3;
                        i11++;
                    }
                    i10++;
                }
            }
            while (i7 >= i10) {
                int iCompare2 = Character.compare(cArr[i7], c2);
                if (iCompare2 < 0) {
                    break;
                }
                if (iCompare2 == 0) {
                    char c4 = cArr[i7];
                    cArr[i7] = cArr[i12];
                    cArr[i12] = c4;
                    i12--;
                }
                i7--;
            }
            if (i10 > i7) {
                break;
            }
            char c5 = cArr[i10];
            cArr[i10] = cArr[i7];
            cArr[i7] = c5;
            i10++;
            i7--;
        }
        int i13 = i11 - i;
        int i14 = i10 - i11;
        int iMin = Math.min(i13, i14);
        m39987(i, i10 - iMin, cArr, iMin);
        int i15 = i12 - i7;
        int iMin2 = Math.min(i15, (i2 - i12) - 1);
        m39987(i10, i2 - iMin2, cArr, iMin2);
        if (i14 > 1) {
            m39984(cArr, i, i14 + i);
        }
        if (i15 > 1) {
            m39984(cArr, i2 - i15, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39983(char[] cArr, int i) {
        int i2;
        int i3 = 0;
        if (i < 2000) {
            m39984(cArr, 0, i);
            return;
        }
        if (i < 1024) {
            m39984(cArr, 0, i);
            return;
        }
        int i4 = 256;
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        int[] iArr3 = new int[256];
        iArr[0] = 0;
        iArr2[0] = i;
        iArr3[0] = 0;
        int[] iArr4 = new int[256];
        int[] iArr5 = new int[256];
        int i5 = 1;
        while (i5 > 0) {
            i5--;
            int i6 = iArr[i5];
            int i7 = iArr2[i5];
            int i8 = iArr3[i5];
            int i9 = (1 - (i8 % 2)) * 8;
            int i10 = i7 + i6;
            int i11 = i10;
            while (true) {
                int i12 = i11 - 1;
                if (i11 == i6) {
                    break;
                }
                int i13 = (cArr[i12] >>> i9) & 255;
                iArr4[i13] = iArr4[i13] + 1;
                i11 = i12;
            }
            int i14 = -1;
            int i15 = i6;
            while (i3 < i4) {
                int i16 = iArr4[i3];
                if (i16 != 0) {
                    i14 = i3;
                }
                i15 += i16;
                iArr5[i3] = i15;
                i3++;
            }
            int i17 = i10 - iArr4[i14];
            while (i6 <= i17) {
                char c = cArr[i6];
                int i18 = (c >>> i9) & 255;
                if (i6 < i17) {
                    while (true) {
                        int i19 = iArr5[i18] - 1;
                        iArr5[i18] = i19;
                        if (i19 <= i6) {
                            break;
                        }
                        char c2 = cArr[i19];
                        cArr[i19] = c;
                        i18 = (c2 >>> i9) & 255;
                        c = c2;
                    }
                    cArr[i6] = c;
                }
                if (i8 < 1 && (i2 = iArr4[i18]) > 1) {
                    if (i2 < 1024) {
                        m39984(cArr, i6, i2 + i6);
                    } else {
                        iArr[i5] = i6;
                        iArr2[i5] = iArr4[i18];
                        iArr3[i5] = i8 + 1;
                        i5++;
                    }
                }
                i6 += iArr4[i18];
                iArr4[i18] = 0;
                i4 = 256;
            }
            i3 = 0;
        }
    }
}
