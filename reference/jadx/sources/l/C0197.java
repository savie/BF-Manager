package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0197 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f1317;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object[] f1318;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f1319;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public char[] f1320;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long[] f1321;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long[] f1322;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f1323;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0197 f1324;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f1325;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C0197 f1326;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char[] f1327;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f1328;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f1329;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f1330;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f1331;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f1332;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f1333;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f1334;

    public C0197(int i) {
        this(i, true);
    }

    public C0197(int i, boolean z) {
        this.f1332 = 1;
        int iMax = Math.max(8, i);
        Object[] objArr = new Object[(iMax + 63) >>> 6];
        this.f1318 = objArr;
        this.f1333 = new int[objArr.length];
        if (z) {
            this.f1320 = new char[iMax];
        } else {
            this.f1323 = new int[iMax];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1573() {
        char[] cArr = this.f1320;
        return cArr != null ? cArr.length : this.f1323.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1575(int i) {
        int iM1573 = m1573();
        if (i <= iM1573) {
            return;
        }
        int iMin = Math.min(1024, Math.max(i, iM1573 * 2));
        int i2 = (iMin + 63) >>> 6;
        this.f1318 = Arrays.copyOf(this.f1318, i2);
        this.f1333 = Arrays.copyOf(this.f1333, i2);
        int i3 = iM1573 >>> 6;
        if ((iM1573 & 63) != 0 && this.f1318[i3] != null) {
            int iMin2 = Math.min(64, iMin - (i3 << 6));
            Object[] objArr = this.f1318;
            Object obj = objArr[i3];
            objArr[i3] = obj instanceof char[] ? Arrays.copyOf((char[]) obj, iMin2) : Arrays.copyOf((int[]) obj, iMin2);
        }
        char[] cArr = this.f1320;
        if (cArr != null) {
            this.f1320 = Arrays.copyOf(cArr, iMin);
        } else {
            this.f1323 = Arrays.copyOf(this.f1323, iMin);
        }
        int[] iArr = this.f1334;
        if (iArr != null) {
            this.f1334 = Arrays.copyOf(iArr, iMin);
        }
        long[] jArr = this.f1322;
        if (jArr != null) {
            this.f1322 = Arrays.copyOf(jArr, i2);
            this.f1327 = Arrays.copyOf(this.f1327, i2);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m1584(int i) {
        int i2 = i >>> 6;
        int i3 = i & 63;
        Object obj = this.f1318[i2];
        return this.f1333[i2] + (obj instanceof char[] ? ((char[]) obj)[i3] : ((int[]) obj)[i3]);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m1568(int i, int i2) {
        int i3 = i >>> 6;
        int i4 = i & 63;
        Object[] objArr = this.f1318;
        Object obj = objArr[i3];
        if (obj == null) {
            obj = new char[Math.min(64, m1573() - (i3 << 6))];
            objArr[i3] = obj;
            this.f1333[i3] = i2;
        }
        long j = ((long) i2) - ((long) this.f1333[i3]);
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            if (j >= 0 && j <= 65535) {
                cArr[i4] = (char) j;
                return;
            }
            int[] iArr = new int[cArr.length];
            for (int i5 = 0; i5 < cArr.length; i5++) {
                iArr[i5] = cArr[i5];
            }
            this.f1318[i3] = iArr;
            obj = iArr;
        }
        ((int[]) obj)[i4] = (int) j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m1580(int i) {
        int[] iArr = this.f1334;
        if (iArr != null) {
            return iArr[i];
        }
        long[] jArr = this.f1322;
        if (jArr == null) {
            return i * this.f1328;
        }
        int i2 = i >>> 6;
        return Long.bitCount(((-1) >>> (63 - (i & 63))) & jArr[i2]) + this.f1327[i2];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m1583(int i) {
        long[] jArr = this.f1321;
        return (jArr == null || (jArr[i >>> 6] & (1 << i)) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1578(int i, boolean z) {
        if (z) {
            if (this.f1321 == null) {
                this.f1321 = new long[16];
            }
            long[] jArr = this.f1321;
            int i2 = i >>> 6;
            jArr[i2] = (1 << i) | jArr[i2];
            return;
        }
        long[] jArr2 = this.f1321;
        if (jArr2 != null) {
            int i3 = i >>> 6;
            jArr2[i3] = (~(1 << i)) & jArr2[i3];
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m1581(int i, C14366 c14366) {
        int i2;
        int iM1580;
        m1568(i, c14366.f45295 - this.f1319);
        int i3 = c14366.f45294 - c14366.f45295;
        int i4 = 0;
        if (this.f1320 != null && ((-65536) & i3) != 0) {
            this.f1323 = new int[m1573()];
            for (int i5 = 0; i5 < this.f1330; i5++) {
                this.f1323[i5] = this.f1320[i5];
            }
            this.f1320 = null;
        }
        char[] cArr = this.f1320;
        if (cArr != null) {
            cArr[i] = (char) i3;
        } else {
            this.f1323[i] = i3;
        }
        int i6 = c14366.f45296;
        int i7 = this.f1330;
        if (i7 == 0) {
            this.f1317 = i6;
        }
        if (this.f1334 != null || ((i >= i7 && this.f1322 != null) || i6 != this.f1317 + m1580(i))) {
            if (this.f1334 == null && i == (i2 = this.f1330) && i2 > 0 && ((iM1580 = i6 - (this.f1317 + m1580(i2 - 1))) == 0 || iM1580 == 1)) {
                long[] jArr = this.f1322;
                if (jArr == null && this.f1330 == 1) {
                    this.f1328 = iM1580;
                } else {
                    if (jArr == null) {
                        Object[] objArr = this.f1318;
                        this.f1322 = new long[objArr.length];
                        this.f1327 = new char[objArr.length];
                        for (int i8 = 1; i8 < this.f1330; i8++) {
                            if (this.f1328 == 1) {
                                long[] jArr2 = this.f1322;
                                int i9 = i8 >>> 6;
                                jArr2[i9] = jArr2[i9] | (1 << i8);
                            }
                        }
                        int iBitCount = 0;
                        while (true) {
                            long[] jArr3 = this.f1322;
                            if (i4 >= jArr3.length) {
                                break;
                            }
                            this.f1327[i4] = (char) iBitCount;
                            iBitCount += Long.bitCount(jArr3[i4]);
                            i4++;
                        }
                    }
                    int i10 = i >>> 6;
                    if ((i & 63) == 0 && i10 > 0) {
                        char[] cArr2 = this.f1327;
                        int i11 = i10 - 1;
                        cArr2[i10] = (char) (Long.bitCount(this.f1322[i11]) + cArr2[i11]);
                    }
                    if (iM1580 == 1) {
                        long[] jArr4 = this.f1322;
                        jArr4[i10] = jArr4[i10] | (1 << i);
                    } else {
                        long[] jArr5 = this.f1322;
                        jArr5[i10] = jArr5[i10] & (~(1 << i));
                    }
                }
            } else {
                m1569();
                this.f1334[i] = i6 - this.f1317;
            }
        }
        m1578(i, c14366.m34803());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1582(int i, C14366 c14366) {
        int iM1584 = m1584(i) + this.f1319;
        char[] cArr = this.f1320;
        c14366.m34800(iM1584, (cArr != null ? cArr[i] : this.f1323[i]) + iM1584, m1580(i) + this.f1317);
        c14366.m34802(m1583(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1579(C14366 c14366) {
        m1575(this.f1330 + 1);
        m1581(this.f1330, c14366);
        int i = this.f1330 + 1;
        this.f1330 = i;
        this.f1331 = i;
        if (i == 1024) {
            m1570();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1577(int i, C14366 c14366) {
        int i2 = this.f1330;
        if (i == i2) {
            m1579(c14366);
            return;
        }
        m1575(i2 + 1);
        if (this.f1334 == null && (this.f1322 != null || this.f1328 != 0 || c14366.f45296 != this.f1317)) {
            m1569();
        }
        for (int i3 = this.f1330; i3 > i; i3--) {
            m1568(i3, m1584(i3 - 1));
        }
        char[] cArr = this.f1320;
        if (cArr != null) {
            System.arraycopy(cArr, i, cArr, i + 1, this.f1330 - i);
        } else {
            int[] iArr = this.f1323;
            System.arraycopy(iArr, i, iArr, i + 1, this.f1330 - i);
        }
        int[] iArr2 = this.f1334;
        if (iArr2 != null) {
            System.arraycopy(iArr2, i, iArr2, i + 1, this.f1330 - i);
        }
        for (int i4 = this.f1330; i4 > i; i4--) {
            m1578(i4, m1583(i4 - 1));
        }
        this.f1330++;
        m1581(i, c14366);
        m1572();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1576(int i, int i2, int i3, int i4) {
        if (i >= i2) {
            return;
        }
        if (i == 0 && i2 == this.f1330) {
            this.f1319 += i3;
            this.f1317 += i4;
            return;
        }
        if (i3 != 0) {
            for (int i5 = i >>> 6; i5 <= ((i2 - 1) >>> 6); i5++) {
                int i6 = i5 << 6;
                int iMin = Math.min(this.f1330, i6 + 64);
                if (i <= i6 && i2 >= iMin) {
                    int[] iArr = this.f1333;
                    iArr[i5] = iArr[i5] + i3;
                } else {
                    for (int iMax = Math.max(i, i6); iMax < Math.min(i2, iMin); iMax++) {
                        m1568(iMax, m1584(iMax) + i3);
                    }
                    m1571(i5, iMin - i6);
                }
            }
        }
        if (i4 != 0) {
            m1569();
            while (i < i2) {
                int[] iArr2 = this.f1334;
                iArr2[i] = iArr2[i] + i4;
                i++;
            }
            m1567();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m1569() {
        if (this.f1334 != null) {
            return;
        }
        int[] iArr = new int[m1573()];
        for (int i = 0; i < this.f1330; i++) {
            iArr[i] = m1580(i);
        }
        this.f1334 = iArr;
        this.f1322 = null;
        this.f1327 = null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m1567() {
        int[] iArr = this.f1334;
        if (iArr == null || this.f1330 == 0) {
            return;
        }
        int i = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int i5 = this.f1330;
            if (i3 < i5) {
                int[] iArr2 = this.f1334;
                int i6 = iArr2[i3] - iArr2[i3 - 1];
                if (i6 != 0 && i6 != 1) {
                    return;
                }
                i4 += i6;
                i3++;
            } else {
                if (i4 != 0 && i4 != i5 - 1) {
                    Object[] objArr = this.f1318;
                    this.f1322 = new long[objArr.length];
                    this.f1327 = new char[objArr.length];
                    for (int i7 = 1; i7 < this.f1330; i7++) {
                        int[] iArr3 = this.f1334;
                        if (iArr3[i7] != iArr3[i7 - 1]) {
                            long[] jArr = this.f1322;
                            int i8 = i7 >>> 6;
                            jArr[i8] = jArr[i8] | (1 << i7);
                        }
                    }
                    int iBitCount = 0;
                    while (true) {
                        long[] jArr2 = this.f1322;
                        if (i >= jArr2.length) {
                            break;
                        }
                        this.f1327[i] = (char) iBitCount;
                        iBitCount += Long.bitCount(jArr2[i]);
                        i++;
                    }
                } else {
                    this.f1328 = i4 != 0 ? 1 : 0;
                }
                this.f1317 += i2;
                this.f1334 = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m1572() {
        for (int i = 0; i < this.f1318.length; i++) {
            int iMin = Math.min(64, this.f1330 - (i << 6));
            if (iMin <= 0) {
                this.f1318[i] = null;
            } else {
                m1571(i, iMin);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m1571(int i, int i2) {
        Object obj = this.f1318[i];
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int iMax = iArr[0];
            int iMin = iMax;
            for (int i3 = 1; i3 < i2; i3++) {
                iMin = Math.min(iMin, iArr[i3]);
                iMax = Math.max(iMax, iArr[i3]);
            }
            if (((long) iMax) - ((long) iMin) > 65535) {
                return;
            }
            char[] cArr = new char[iArr.length];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = (char) (iArr[i4] - iMin);
            }
            int[] iArr2 = this.f1333;
            iArr2[i] = iArr2[i] + iMin;
            this.f1318[i] = cArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m1570() {
        m1572();
        m1567();
        if (this.f1323 == null) {
            return;
        }
        for (int i = 0; i < this.f1330; i++) {
            if ((this.f1323[i] & (-65536)) != 0) {
                return;
            }
        }
        this.f1320 = new char[m1573()];
        for (int i2 = 0; i2 < this.f1330; i2++) {
            this.f1320[i2] = (char) this.f1323[i2];
        }
        this.f1323 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0197 m1574(int i, int i2) {
        int i3 = i2 - i;
        C0197 c0197 = new C0197(i3, this.f1320 != null);
        c0197.f1331 = i3;
        c0197.f1330 = i3;
        c0197.f1319 = this.f1319;
        c0197.f1317 = this.f1317;
        c0197.f1328 = this.f1328;
        if (i == 0 && i2 == this.f1330) {
            int[] iArr = this.f1333;
            int[] iArr2 = c0197.f1333;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            for (int i4 = 0; i4 < c0197.f1318.length; i4++) {
                int iMin = Math.min(64, c0197.m1573() - (i4 << 6));
                Object obj = this.f1318[i4];
                c0197.f1318[i4] = obj instanceof char[] ? Arrays.copyOf((char[]) obj, iMin) : Arrays.copyOf((int[]) obj, iMin);
            }
        } else {
            for (int i5 = 0; i5 < c0197.f1330; i5++) {
                c0197.m1568(i5, m1584(i5 + i));
            }
        }
        char[] cArr = this.f1320;
        if (cArr != null) {
            System.arraycopy(cArr, i, c0197.f1320, 0, c0197.f1330);
        } else {
            System.arraycopy(this.f1323, i, c0197.f1323, 0, c0197.f1330);
        }
        if (this.f1334 == null && this.f1322 == null) {
            c0197.f1317 = (this.f1328 * i) + c0197.f1317;
        } else {
            long[] jArr = this.f1322;
            if (jArr != null && i == 0 && i2 == this.f1330) {
                c0197.f1322 = Arrays.copyOf(jArr, c0197.f1318.length);
                c0197.f1327 = Arrays.copyOf(this.f1327, c0197.f1318.length);
            } else {
                c0197.f1334 = new int[c0197.m1573()];
                for (int i6 = 0; i6 < c0197.f1330; i6++) {
                    c0197.f1334[i6] = m1580(i6 + i);
                }
            }
        }
        if (i != 0 || i2 != this.f1330) {
            c0197.m1570();
        }
        if (this.f1321 != null) {
            for (int i7 = i; i7 < i2; i7++) {
                c0197.m1578(i7 - i, m1583(i7));
            }
        }
        return c0197;
    }
}
