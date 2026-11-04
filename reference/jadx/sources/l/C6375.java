package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7HX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6375 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21529 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final long[] f21530;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f21531;

    static {
        long[] jArr = new long[1024];
        f21530 = jArr;
        Arrays.fill(jArr, -1L);
        for (int i = 0; i <= 31; i++) {
            m18117(i);
        }
        for (int i2 = 33; i2 <= 35; i2++) {
            m18117(i2);
        }
        for (int i3 = 37; i3 <= 44; i3++) {
            m18117(i3);
        }
        m18117(46);
        for (int i4 = 58; i4 <= 64; i4++) {
            m18117(i4);
        }
        for (int i5 = 91; i5 <= 94; i5++) {
            m18117(i5);
        }
        m18117(96);
        for (int i6 = 123; i6 <= 127; i6++) {
            m18117(i6);
        }
        for (int i7 = 56320; i7 <= 57343; i7++) {
            m18117(i7);
        }
        m18117(8232);
        m18117(65520);
        m18117(65528);
        f21531 = new char[]{'-', '>'};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18117(int i) {
        int i2 = i >>> 6;
        long[] jArr = f21530;
        jArr[i2] = jArr[i2] & (~(1 << (i & 63)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18113(int i, int i2, int i3, char[] cArr, char[] cArr2) {
        if (i3 < 0) {
            i3 = 0;
        }
        if (i2 == 0) {
            return i3;
        }
        if (i3 + i2 > i) {
            return -1;
        }
        char c = cArr2[0];
        int i4 = i - i2;
        while (i3 <= i4) {
            if (cArr[i3] != c) {
                do {
                    i3++;
                    if (i3 > i4) {
                        break;
                    }
                } while (cArr[i3] != c);
            }
            if (i3 <= i4) {
                int i5 = i3 + 1;
                int i6 = i3 + i2;
                for (int i7 = 1; i5 < i6 && cArr[i5] == cArr2[i7]; i7++) {
                    i5++;
                }
                if (i5 == i6) {
                    return i3;
                }
            }
            i3++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m18118(int i, int i2, int i3, char[] cArr, char[] cArr2) {
        if (i2 < 0 || i2 + i3 > i) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (cArr[i2 + i4] != cArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m18114(char[] cArr, int i, char[] cArr2, int i2, char[] cArr3, int i3) {
        int iM18113;
        int i4;
        int i5;
        char c;
        char c2;
        char c3;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (arrayList.size() < 500 && (iM18113 = m18113(i, 2, i6, cArr, f21531)) != -1) {
            int i7 = iM18113 - 1;
            while (i7 >= 0 && ((c3 = cArr[i7]) == ' ' || c3 == '\t')) {
                i7--;
            }
            if (i7 >= 0) {
                if (i7 >= 0 && cArr[i7] == ';') {
                    i4 = -1;
                    for (int i8 = i7 - 1; i8 >= 0; i8--) {
                        char c4 = cArr[i8];
                        if (c4 == 'L') {
                            i4 = i8;
                        }
                        if ((f21530[c4 >>> 6] & (1 << (c4 & '?'))) == 0) {
                            break;
                        }
                    }
                } else {
                    i4 = -1;
                }
                if (i4 != -1) {
                    int i9 = iM18113 + 2;
                    while (i9 < i) {
                        char c5 = cArr[i9];
                        if (c5 != ' ' && c5 != '\t') {
                            break;
                        }
                        i9++;
                    }
                    if (m18118(i, i9, i2, cArr, cArr2) && ((i5 = i9 + i2) >= i || (c2 = cArr[i5]) == ' ' || c2 == '\t' || c2 == ':')) {
                        while (i5 < i) {
                            char c6 = cArr[i5];
                            if (c6 != ' ' && c6 != '\t') {
                                break;
                            }
                            i5++;
                        }
                        if (i5 < i && cArr[i5] == ':') {
                            while (true) {
                                i5++;
                                if (i5 >= i || ((c = cArr[i5]) != ' ' && c != '\t')) {
                                    break;
                                }
                            }
                            if (m18118(i, i5, i3, cArr, cArr3)) {
                                arrayList.add(new Object[]{new int[]{i4, i5 + i3}, new String(cArr, i4, (i7 + 1) - i4)});
                            }
                        }
                    }
                }
            }
            i6 = iM18113 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m18116(char[] cArr, int i, char[] cArr2, int i2, char[] cArr3, int i3, char[] cArr4, int i4, char[] cArr5, int i5) {
        int iM18113;
        int i6;
        char c;
        char c2;
        char c3;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (arrayList.size() < 500 && (iM18113 = m18113(i, i3, i7, cArr, cArr3)) != -1) {
            int i8 = iM18113 - 1;
            while (i8 >= 0 && ((c3 = cArr[i8]) == ' ' || c3 == '\t')) {
                i8--;
            }
            if (i8 >= 0 && (i6 = (i8 + 1) - i2) >= 0) {
                if (m18118(i, i6, i2, cArr, cArr2)) {
                    if (i6 > 0 && (c2 = cArr[i6 - 1]) != ' ' && c2 != '\t') {
                        if ((f21530[c2 >>> 6] & (1 << (c2 & '?'))) != 0) {
                        }
                    }
                    int i9 = iM18113 + i3;
                    while (i9 < i) {
                        char c4 = cArr[i9];
                        if (c4 != ' ' && c4 != '\t') {
                            break;
                        }
                        i9++;
                    }
                    if (m18118(i, i9, i4, cArr, cArr4)) {
                        int i10 = i9 + i4;
                        while (i10 < i) {
                            char c5 = cArr[i10];
                            if (c5 != ' ' && c5 != '\t') {
                                break;
                            }
                            i10++;
                        }
                        if (i10 < i && cArr[i10] == ')') {
                            while (true) {
                                i10++;
                                if (i10 >= i || ((c = cArr[i10]) != ' ' && c != '\t')) {
                                    break;
                                }
                            }
                            if (m18118(i, i10, i5, cArr, cArr5)) {
                                arrayList.add(new int[]{i6, i10 + i5});
                            }
                        }
                    }
                }
                i7 = iM18113 + 1;
            }
            i7 = iM18113 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m18115(char[] cArr, int i, char[] cArr2, int i2, char[] cArr3, int i3, char[] cArr4, int i4, C24604 c24604, C18037 c18037, ConcurrentMapC17249 concurrentMapC17249) {
        int iM18113;
        int i5;
        char c;
        char c2;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (arrayList.size() < 500 && (iM18113 = m18113(i, i2, i6, cArr, cArr2)) != -1) {
            int i7 = iM18113 - 1;
            while (i7 >= 0 && ((c2 = cArr[i7]) == ' ' || c2 == '\t')) {
                i7--;
            }
            if (i7 >= 0) {
                if (i7 >= 0 && cArr[i7] == ';') {
                    i5 = -1;
                    for (int i8 = i7 - 1; i8 >= 0; i8--) {
                        char c3 = cArr[i8];
                        if (c3 == 'L') {
                            i5 = i8;
                        }
                        if ((f21530[c3 >>> 6] & (1 << (c3 & '?'))) == 0) {
                            break;
                        }
                    }
                } else {
                    i5 = -1;
                }
                if (i5 != -1) {
                    String str = new String(cArr, i5, (i7 + 1) - i5);
                    int i9 = iM18113 + i2;
                    while (i9 < i) {
                        char c4 = cArr[i9];
                        if (c4 != ' ' && c4 != '\t') {
                            break;
                        }
                        i9++;
                    }
                    if (m18118(i, i9, i3, cArr, cArr3)) {
                        int i10 = i9 + i3;
                        while (i10 < i) {
                            char c5 = cArr[i10];
                            if (c5 != ' ' && c5 != '\t') {
                                break;
                            }
                            i10++;
                        }
                        if (i10 < i && cArr[i10] == ')') {
                            while (true) {
                                i10++;
                                if (i10 >= i || ((c = cArr[i10]) != ' ' && c != '\t')) {
                                    break;
                                }
                            }
                            if (m18118(i, i10, i4, cArr, cArr4)) {
                                int i11 = i10 + i4;
                                if (C14818.m35688(c24604, c18037, str, concurrentMapC17249)) {
                                    arrayList.add(new int[]{i5, i11});
                                }
                            }
                        }
                    }
                }
            }
            i6 = iM18113 + 1;
        }
        return arrayList;
    }
}
