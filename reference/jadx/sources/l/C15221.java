package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 098S */
/* JADX INFO: loaded from: classes.dex */
public class C15221 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C15221 f49638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49639;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f49640;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f49641;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native long m36436(long j);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36441(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    static {
        ApplicationC6132.m17119(133);
        f49638 = new C15221(1);
    }

    public C15221() {
        this.f49641 = 0;
        this.f49640 = new int[1];
        this.f49639 = 0;
    }

    public C15221(int i) {
        this.f49641 = 0;
        this.f49640 = new int[]{i};
        this.f49639 = 1;
    }

    public C15221(int[] iArr) {
        this.f49641 = 0;
        this.f49640 = iArr;
        this.f49639 = iArr.length;
    }

    public C15221(C2519 c2519) {
        this.f49641 = 0;
        int[] iArr = c2519.f18448;
        int length = iArr.length;
        this.f49639 = length;
        this.f49640 = Arrays.copyOf(iArr, length);
    }

    public C15221(C15221 c15221) {
        this.f49641 = 0;
        int i = c15221.f49639;
        this.f49639 = i;
        int[] iArr = c15221.f49640;
        int i2 = c15221.f49641;
        this.f49640 = Arrays.copyOfRange(iArr, i2, i + i2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2519 m36449(int i) {
        int[] iArrCopyOfRange;
        int i2 = this.f49639;
        if (i2 != 0 && i != 0) {
            int i3 = this.f49641;
            if (i3 <= 0) {
                iArrCopyOfRange = this.f49640;
                if (iArrCopyOfRange.length != i2) {
                    iArrCopyOfRange = Arrays.copyOfRange(this.f49640, i3, i2 + i3);
                }
            } else {
                iArrCopyOfRange = Arrays.copyOfRange(this.f49640, i3, i2 + i3);
            }
            return new C2519(iArrCopyOfRange, i);
        }
        return C22276.f72804;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m36461(C15221 c15221) {
        int i = c15221.f49639;
        int i2 = this.f49639;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int[] iArr = c15221.f49640;
        int i3 = this.f49641;
        int i4 = c15221.f49641;
        while (i3 < this.f49639 + this.f49641) {
            int i5 = this.f49640[i3] - Integer.MIN_VALUE;
            int i6 = iArr[i4] - Integer.MIN_VALUE;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            i3++;
            i4++;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private final int m36442() {
        int i = this.f49639;
        if (i == 0) {
            return -1;
        }
        do {
            i--;
            if (i <= 0) {
                break;
            }
        } while (this.f49640[this.f49641 + i] == 0);
        int i2 = this.f49640[this.f49641 + i];
        if (i2 == 0) {
            return -1;
        }
        return Integer.numberOfTrailingZeros(i2) + (((this.f49639 - 1) - i) << 5);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36450() {
        int i = this.f49639;
        if (i == 0) {
            this.f49641 = 0;
            return;
        }
        int i2 = this.f49641;
        if (this.f49640[i2] != 0) {
            return;
        }
        int i3 = i + i2;
        do {
            i2++;
            if (i2 >= i3) {
                break;
            }
        } while (this.f49640[i2] == 0);
        int i4 = this.f49641;
        int i5 = i2 - i4;
        int i6 = this.f49639 - i5;
        this.f49639 = i6;
        this.f49641 = i6 != 0 ? i4 + i5 : 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36464(int i, C15221 c15221) {
        if (i == 1) {
            int i2 = this.f49639;
            if (c15221.f49640.length < i2) {
                c15221.f49640 = new int[i2];
            }
            System.arraycopy(this.f49640, this.f49641, c15221.f49640, 0, i2);
            c15221.f49639 = i2;
            c15221.f49641 = 0;
            return;
        }
        if (i == 0) {
            c15221.f49639 = 0;
            c15221.f49641 = 0;
            int length = c15221.f49640.length;
            for (int i3 = 0; i3 < length; i3++) {
                c15221.f49640[i3] = 0;
            }
            return;
        }
        long j = ((long) i) & 4294967295L;
        int[] iArr = c15221.f49640;
        int length2 = iArr.length;
        int i4 = this.f49639;
        int i5 = i4 + 1;
        if (length2 < i5) {
            iArr = new int[i5];
        }
        long j2 = 0;
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            long j3 = ((((long) this.f49640[this.f49641 + i6]) & 4294967295L) * j) + j2;
            iArr[i6 + 1] = (int) j3;
            j2 = j3 >>> 32;
        }
        if (j2 == 0) {
            c15221.f49641 = 1;
            c15221.f49639 = this.f49639;
        } else {
            c15221.f49641 = 0;
            c15221.f49639 = this.f49639 + 1;
            iArr[0] = (int) j2;
        }
        c15221.f49640 = iArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m36465() {
        return this.f49639 == 1 && this.f49640[this.f49641] == 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m36460() {
        return this.f49639 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36456() {
        int i = this.f49639;
        return i == 0 || (this.f49640[(this.f49641 + i) - 1] & 1) == 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15221 m36457(C15221 c15221) {
        if (!c15221.m36460() && (c15221.f49640[(c15221.f49641 + c15221.f49639) - 1] & 1) == 1) {
            return m36443(c15221);
        }
        if (m36456()) {
            throw new RuntimeException();
        }
        int iM36442 = c15221.m36442();
        C15221 c15222 = new C15221(c15221);
        c15222.m36459(iM36442);
        if (c15222.m36465()) {
            return m36462(iM36442);
        }
        C15221 c15221M36443 = m36443(c15222);
        C15221 c15221M36462 = m36462(iM36442);
        C15221 c15221M36438 = m36438(new C15221(1), new C15221(c15222), iM36442);
        C15221 c15221M36463 = c15222.m36462(iM36442);
        C15221 c15223 = new C15221();
        C15221 c15224 = new C15221();
        C15221 c15225 = new C15221();
        c15221M36443.m36453(iM36442);
        c15221M36443.m36451(c15221M36438, c15225);
        c15221M36462.m36451(c15222, c15223);
        c15223.m36451(c15221M36463, c15224);
        c15225.m36455(c15224);
        return c15225.m36452(c15221, c15223);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36459(int i) {
        int i2 = this.f49639;
        if (i2 == 0) {
            return;
        }
        int i3 = i >>> 5;
        int i4 = i & 31;
        this.f49639 = i2 - i3;
        if (i4 == 0) {
            return;
        }
        if (i4 >= 32 - Integer.numberOfLeadingZeros(this.f49640[this.f49641])) {
            m36445(32 - i4);
            this.f49639--;
        } else {
            m36447(i4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36453(int i) {
        int i2;
        if (this.f49639 == 0) {
            return;
        }
        int i3 = i >>> 5;
        int i4 = i & 31;
        int iNumberOfLeadingZeros = 32 - (32 - Integer.numberOfLeadingZeros(this.f49640[this.f49641]));
        if (i <= iNumberOfLeadingZeros) {
            m36445(i4);
            return;
        }
        int i5 = this.f49639 + i3;
        int i6 = i5 + 1;
        if (i4 > iNumberOfLeadingZeros) {
            i5 = i6;
        }
        int[] iArr = this.f49640;
        if (iArr.length < i5) {
            int[] iArr2 = new int[i5];
            for (int i7 = 0; i7 < this.f49639; i7++) {
                iArr2[i7] = this.f49640[this.f49641 + i7];
            }
            this.f49640 = iArr2;
            this.f49639 = i5;
            this.f49641 = 0;
        } else if (iArr.length - this.f49641 >= i5) {
            int i8 = 0;
            while (true) {
                int i9 = this.f49639;
                if (i8 >= i5 - i9) {
                    break;
                }
                this.f49640[this.f49641 + i9 + i8] = 0;
                i8++;
            }
        } else {
            int i10 = 0;
            while (true) {
                i2 = this.f49639;
                if (i10 >= i2) {
                    break;
                }
                int[] iArr3 = this.f49640;
                iArr3[i10] = iArr3[this.f49641 + i10];
                i10++;
            }
            while (i2 < i5) {
                this.f49640[i2] = 0;
                i2++;
            }
            this.f49641 = 0;
        }
        this.f49639 = i5;
        if (i4 == 0) {
            return;
        }
        if (i4 <= iNumberOfLeadingZeros) {
            m36445(i4);
        } else {
            m36447(32 - i4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36440(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i2 = length + i;
            long j2 = (((long) iArr[length]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j;
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m36434(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        long j = ((long) i) & 4294967295L;
        int i4 = i3 + i2;
        int i5 = i2 - 1;
        long j2 = 0;
        while (i5 >= 0) {
            long j3 = ((((long) iArr2[i5]) & 4294967295L) * j) + j2;
            long j4 = ((long) iArr[i4]) - j3;
            int i6 = i4 - 1;
            iArr[i4] = (int) j4;
            j2 = ((long) ((j4 & 4294967295L) > (((long) (~((int) j3))) & 4294967295L) ? 1 : 0)) + (j3 >>> 32);
            i5--;
            i4 = i6;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private final void m36447(int i) {
        int[] iArr = this.f49640;
        int i2 = 32 - i;
        int i3 = (this.f49641 + this.f49639) - 1;
        int i4 = iArr[i3];
        while (true) {
            int i5 = this.f49641;
            if (i3 > i5) {
                int i6 = iArr[i3 - 1];
                iArr[i3] = (i4 >>> i) | (i6 << i2);
                i3--;
                i4 = i6;
            } else {
                iArr[i5] = iArr[i5] >>> i;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private final void m36445(int i) {
        int[] iArr = this.f49640;
        int i2 = 32 - i;
        int i3 = this.f49641;
        int i4 = iArr[i3];
        int i5 = (this.f49639 + i3) - 1;
        while (i3 < i5) {
            int i6 = i3 + 1;
            int i7 = iArr[i6];
            iArr[i3] = (i4 << i) | (i7 >>> i2);
            i3 = i6;
            i4 = i7;
        }
        int i8 = (this.f49641 + this.f49639) - 1;
        iArr[i8] = iArr[i8] << i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36455(C15221 c15221) {
        int i = this.f49639;
        int i2 = c15221.f49639;
        int i3 = i > i2 ? i : i2;
        int[] iArr = this.f49640;
        if (iArr.length < i3) {
            iArr = new int[i3];
        }
        int length = iArr.length - 1;
        long j = 0;
        while (i > 0 && i2 > 0) {
            int i4 = i - 1;
            int i5 = i2 - 1;
            long j2 = (((long) this.f49640[this.f49641 + i4]) & 4294967295L) + (((long) c15221.f49640[c15221.f49641 + i5]) & 4294967295L) + j;
            iArr[length] = (int) j2;
            j = j2 >>> 32;
            length--;
            i = i4;
            i2 = i5;
        }
        while (i > 0) {
            i--;
            if (j == 0 && iArr == this.f49640 && length == this.f49641 + i) {
                return;
            }
            long j3 = (((long) this.f49640[this.f49641 + i]) & 4294967295L) + j;
            iArr[length] = (int) j3;
            length--;
            j = j3 >>> 32;
        }
        while (i2 > 0) {
            i2--;
            long j4 = (((long) c15221.f49640[c15221.f49641 + i2]) & 4294967295L) + j;
            iArr[length] = (int) j4;
            j = j4 >>> 32;
            length--;
        }
        if (j > 0) {
            i3++;
            if (iArr.length < i3) {
                int[] iArr2 = new int[i3];
                System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
                iArr2[0] = 1;
                iArr = iArr2;
            } else {
                iArr[length] = 1;
            }
        }
        this.f49640 = iArr;
        this.f49639 = i3;
        this.f49641 = iArr.length - i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36454(int i, C15221 c15221) {
        if (c15221.m36460()) {
            return;
        }
        int i2 = this.f49639;
        int i3 = c15221.f49639 + i;
        int i4 = i2 > i3 ? i2 : i3;
        int[] iArr = this.f49640;
        if (iArr.length < i4) {
            iArr = new int[i4];
        } else {
            Arrays.fill(iArr, this.f49641 + i2, iArr.length, 0);
        }
        int length = iArr.length;
        System.arraycopy(this.f49640, this.f49641, iArr, length - i2, i2);
        int i5 = i3 - i2;
        int i6 = (length - 1) - i2;
        int iMin = Math.min(i5, c15221.f49640.length - c15221.f49641);
        int i7 = i6 + 1;
        int i8 = i7 - i5;
        System.arraycopy(c15221.f49640, c15221.f49641, iArr, i8, iMin);
        for (int i9 = i8 + iMin; i9 < i7; i9++) {
            iArr[i9] = 0;
        }
        this.f49640 = iArr;
        this.f49639 = i4;
        this.f49641 = iArr.length - i4;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m36448(C15221 c15221) {
        C15221 c15222;
        C15221 c15223;
        int[] iArr = this.f49640;
        int iM36461 = m36461(c15221);
        if (iM36461 == 0) {
            this.f49639 = 0;
            this.f49641 = 0;
            return 0;
        }
        if (iM36461 < 0) {
            c15223 = c15221;
            c15222 = this;
        } else {
            c15222 = c15221;
            c15223 = this;
        }
        int i = c15223.f49639;
        if (iArr.length < i) {
            iArr = new int[i];
        }
        int i2 = c15222.f49639;
        int length = iArr.length - 1;
        long j = 0;
        int i3 = i;
        while (i2 > 0) {
            i3--;
            i2--;
            j = ((((long) c15223.f49640[c15223.f49641 + i3]) & 4294967295L) - (((long) c15222.f49640[c15222.f49641 + i2]) & 4294967295L)) - ((long) ((int) (-(j >> 32))));
            iArr[length] = (int) j;
            length--;
        }
        while (i3 > 0) {
            i3--;
            j = (((long) c15223.f49640[c15223.f49641 + i3]) & 4294967295L) - ((long) ((int) (-(j >> 32))));
            iArr[length] = (int) j;
            length--;
        }
        this.f49640 = iArr;
        this.f49639 = i;
        this.f49641 = iArr.length - i;
        m36450();
        return iM36461;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36451(C15221 c15221, C15221 c15222) {
        C15221 c15223 = this;
        C15221 c15224 = c15221;
        int i = c15223.f49639;
        int i2 = c15224.f49639;
        int i3 = i + i2;
        if (c15222.f49640.length < i3) {
            c15222.f49640 = new int[i3];
        }
        c15222.f49641 = 0;
        c15222.f49639 = i3;
        int i4 = i2 - 1;
        int i5 = i3 - 1;
        long j = 0;
        int i6 = i4;
        while (i6 >= 0) {
            long j2 = ((((long) c15224.f49640[c15224.f49641 + i6]) & 4294967295L) * (((long) c15223.f49640[(i - 1) + c15223.f49641]) & 4294967295L)) + j;
            c15222.f49640[i5] = (int) j2;
            j = j2 >>> 32;
            i6--;
            i5--;
        }
        c15222.f49640[i - 1] = (int) j;
        int i7 = i - 2;
        while (i7 >= 0) {
            int i8 = i2 + i7;
            long j3 = 0;
            int i9 = i4;
            while (i9 >= 0) {
                long j4 = (((long) c15224.f49640[c15224.f49641 + i9]) & 4294967295L) * (((long) c15223.f49640[c15223.f49641 + i7]) & 4294967295L);
                int[] iArr = c15222.f49640;
                long j5 = j4 + (((long) iArr[i8]) & 4294967295L) + j3;
                iArr[i8] = (int) j5;
                j3 = j5 >>> 32;
                i9--;
                i8--;
                c15223 = this;
                c15224 = c15221;
                i2 = i2;
            }
            c15222.f49640[i7] = (int) j3;
            i7--;
            c15223 = this;
            c15224 = c15221;
            i2 = i2;
        }
        c15222.m36450();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15221 m36452(C15221 c15221, C15221 c15222) {
        int i = c15221.f49639;
        if (i < 80 || this.f49639 - i < 40) {
            return m36458(c15221, c15222);
        }
        return m36463(c15221, c15222);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15221 m36458(C15221 c15221, C15221 c15222) {
        int i;
        int[] iArrCopyOfRange;
        C15221 c15223;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        C15221 c15224;
        int[] iArr;
        int i6;
        long j;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr2;
        int i13;
        int i14;
        int i15;
        int iMin;
        long j2;
        int i16;
        int i17;
        long j3;
        if (c15221.f49639 == 0) {
            throw new RuntimeException();
        }
        if (this.f49639 == 0) {
            c15222.f49641 = 0;
            c15222.f49639 = 0;
            return new C15221();
        }
        int iM36461 = m36461(c15221);
        if (iM36461 < 0) {
            c15222.f49641 = 0;
            c15222.f49639 = 0;
            return new C15221(this);
        }
        if (iM36461 != 0) {
            c15222.f49639 = 0;
            c15222.f49641 = 0;
            int length = c15222.f49640.length;
            for (int i18 = 0; i18 < length; i18++) {
                c15222.f49640[i18] = 0;
            }
            char c = ' ';
            if (c15221.f49639 == 1) {
                int i19 = c15221.f49640[c15221.f49641];
                long j4 = ((long) i19) & 4294967295L;
                int i20 = this.f49639;
                if (i20 == 1) {
                    long j5 = 4294967295L & ((long) this.f49640[this.f49641]);
                    int i21 = (int) (j5 / j4);
                    i16 = (int) (j5 - (((long) i21) * j4));
                    c15222.f49640[0] = i21;
                    c15222.f49639 = i21 == 0 ? 0 : 1;
                    c15222.f49641 = 0;
                } else {
                    if (c15222.f49640.length < i20) {
                        c15222.f49640 = new int[i20];
                    }
                    c15222.f49641 = 0;
                    c15222.f49639 = i20;
                    int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i19);
                    int i22 = this.f49640[this.f49641];
                    long j6 = ((long) i22) & 4294967295L;
                    if (j6 < j4) {
                        j2 = 0;
                        c15222.f49640[0] = 0;
                    } else {
                        int i23 = (int) (j6 / j4);
                        c15222.f49640[0] = i23;
                        i22 = (int) (j6 - (((long) i23) * j4));
                        j6 = ((long) i22) & 4294967295L;
                        j2 = 0;
                    }
                    int i24 = this.f49639;
                    while (true) {
                        int i25 = i24 - 1;
                        if (i25 <= 0) {
                            break;
                        }
                        int i26 = iNumberOfLeadingZeros;
                        long j7 = (((long) this.f49640[(this.f49641 + this.f49639) - i25]) & 4294967295L) | (j6 << c);
                        if (j7 >= j2) {
                            i17 = (int) (j7 / j4);
                            j3 = j7 - (((long) i17) * j4);
                        } else {
                            long jM36435 = m36435(i19, j7);
                            i17 = (int) (jM36435 & 4294967295L);
                            j3 = jM36435 >>> 32;
                        }
                        int i27 = (int) j3;
                        c15222.f49640[this.f49639 - i25] = i17;
                        j6 = ((long) i27) & 4294967295L;
                        iNumberOfLeadingZeros = i26;
                        i22 = i27;
                        i24 = i25;
                        c = ' ';
                    }
                    int i28 = iNumberOfLeadingZeros;
                    c15222.m36450();
                    i16 = i28 > 0 ? i22 % i19 : i22;
                }
                if (i16 == 0) {
                    return new C15221();
                }
                return new C15221(i16);
            }
            if (this.f49639 >= 6 && (iMin = Math.min(m36442(), c15221.m36442())) >= 96) {
                C15221 c15225 = new C15221(this);
                C15221 c15226 = new C15221(c15221);
                c15225.m36459(iMin);
                c15226.m36459(iMin);
                C15221 c15221M36458 = c15225.m36458(c15226, c15222);
                c15221M36458.m36453(iMin);
                return c15221M36458;
            }
            int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(c15221.f49640[c15221.f49641]);
            int i29 = c15221.f49639;
            if (iNumberOfLeadingZeros2 > 0) {
                int[] iArr3 = new int[i29];
                i = i29;
                m36439(c15221.f49641, i29, c15221.f49640, 0, iArr3, iNumberOfLeadingZeros2);
                if (Integer.numberOfLeadingZeros(this.f49640[this.f49641]) >= iNumberOfLeadingZeros2) {
                    int[] iArr4 = new int[this.f49639 + 1];
                    c15223 = new C15221(iArr4);
                    c15223.f49639 = this.f49639;
                    c15223.f49641 = 1;
                    m36439(this.f49641, this.f49639, this.f49640, 1, iArr4, iNumberOfLeadingZeros2);
                    iArrCopyOfRange = iArr3;
                } else {
                    int[] iArr5 = new int[this.f49639 + 2];
                    C15221 c15227 = new C15221(iArr5);
                    c15227.f49639 = this.f49639 + 1;
                    c15227.f49641 = 1;
                    int i30 = this.f49641;
                    int i31 = 32 - iNumberOfLeadingZeros2;
                    int i32 = 1;
                    int i33 = 0;
                    while (true) {
                        i15 = this.f49639 + 1;
                        if (i32 >= i15) {
                            break;
                        }
                        int i34 = this.f49640[i30];
                        iArr5[i32] = (i33 << iNumberOfLeadingZeros2) | (i34 >>> i31);
                        i32++;
                        i30++;
                        i33 = i34;
                    }
                    iArr5[i15] = i33 << iNumberOfLeadingZeros2;
                    iArrCopyOfRange = iArr3;
                    c15223 = c15227;
                }
            } else {
                i = i29;
                int[] iArr6 = c15221.f49640;
                int i35 = c15221.f49641;
                iArrCopyOfRange = Arrays.copyOfRange(iArr6, i35, i35 + i);
                int[] iArr7 = new int[this.f49639 + 1];
                c15223 = new C15221(iArr7);
                System.arraycopy(this.f49640, this.f49641, iArr7, 1, this.f49639);
                c15223.f49639 = this.f49639;
                c15223.f49641 = 1;
            }
            int i36 = c15223.f49639;
            int i37 = i36 - i;
            int i38 = i37 + 1;
            if (c15222.f49640.length < i38) {
                c15222.f49640 = new int[i38];
                c15222.f49641 = 0;
            }
            c15222.f49639 = i38;
            int[] iArr8 = c15222.f49640;
            int i39 = c15223.f49639;
            if (i39 == i36) {
                c15223.f49641 = 0;
                c15223.f49640[0] = 0;
                c15223.f49639 = i39 + 1;
            }
            int i40 = iArrCopyOfRange[0];
            int i41 = iNumberOfLeadingZeros2;
            long j8 = ((long) i40) & 4294967295L;
            int i42 = iArrCopyOfRange[1];
            int i43 = 0;
            while (i43 < i37) {
                int[] iArr9 = c15223.f49640;
                int i44 = c15223.f49641;
                int i45 = iArr9[i43 + i44];
                int i46 = i45 - Integer.MIN_VALUE;
                int i47 = i43 + 1;
                int i48 = iArr9[i47 + i44];
                if (i45 == i40) {
                    i7 = i45 + i48;
                    z2 = i7 + Integer.MIN_VALUE < i46;
                    i8 = -1;
                } else {
                    long j9 = (((long) i45) << 32) | (((long) i48) & 4294967295L);
                    if (j9 >= 0) {
                        i6 = (int) (j9 / j8);
                        j = j9 - (((long) i6) * j8);
                    } else {
                        long jM36436 = m36435(i40, j9);
                        i6 = (int) (jM36436 & 4294967295L);
                        j = jM36436 >>> 32;
                    }
                    int i49 = (int) j;
                    z2 = false;
                    int i50 = i6;
                    i7 = i49;
                    i8 = i50;
                }
                if (i8 == 0) {
                    i10 = i40;
                    i11 = i42;
                    i14 = i;
                    iArr2 = iArr8;
                    i13 = i41;
                } else {
                    if (z2) {
                        i9 = i46;
                        i10 = i40;
                        i11 = i42;
                        i12 = i;
                        iArr2 = iArr8;
                        i13 = i41;
                    } else {
                        long j10 = ((long) c15223.f49640[i43 + 2 + c15223.f49641]) & 4294967295L;
                        int[] iArr10 = iArr8;
                        i13 = i41;
                        long j11 = ((long) i7) & 4294967295L;
                        i9 = i46;
                        i10 = i40;
                        i12 = i;
                        long j12 = ((long) i42) & 4294967295L;
                        i11 = i42;
                        iArr2 = iArr10;
                        long j13 = (((long) i8) & 4294967295L) * j12;
                        if (m36441(j13, (j11 << 32) | j10)) {
                            long j14 = ((long) ((int) (j11 + j8))) & 4294967295L;
                            i8 = (j14 < j8 || !m36441(j13 - j12, (j14 << 32) | j10)) ? i8 - 1 : i8 - 2;
                        }
                    }
                    int[] iArr11 = c15223.f49640;
                    int i51 = c15223.f49641 + i43;
                    iArr11[i51] = 0;
                    i14 = i12;
                    if (m36434(i8, i14, iArr11, iArrCopyOfRange, i51) - Integer.MIN_VALUE > i9) {
                        m36440(i47 + c15223.f49641, iArrCopyOfRange, c15223.f49640);
                        i8--;
                    }
                    iArr2[i43] = i8;
                }
                i = i14;
                i43 = i47;
                i37 = i37;
                i38 = i38;
                i41 = i13;
                i40 = i10;
                i42 = i11;
                iArr8 = iArr2;
            }
            int i52 = i40;
            int i53 = i42;
            int i54 = i;
            int i55 = i37;
            int i56 = i38;
            int[] iArr12 = iArr8;
            int i57 = i41;
            int[] iArr13 = c15223.f49640;
            int i58 = c15223.f49641;
            int i59 = iArr13[i55 + i58];
            int i60 = i59 - Integer.MIN_VALUE;
            int i61 = iArr13[i56 + i58];
            if (i59 == i52) {
                i3 = i59 + i61;
                z = i3 + Integer.MIN_VALUE < i60;
                i4 = -1;
            } else {
                long j15 = (((long) i59) << 32) | (((long) i61) & 4294967295L);
                if (j15 >= 0) {
                    i2 = (int) (j15 / j8);
                    i3 = (int) (j15 - (((long) i2) * j8));
                } else {
                    long jM36437 = m36435(i52, j15);
                    i2 = (int) (jM36437 & 4294967295L);
                    i3 = (int) (jM36437 >>> 32);
                }
                i4 = i2;
                z = false;
            }
            if (i4 != 0) {
                if (z) {
                    i5 = i60;
                    c15224 = c15223;
                    iArr = iArrCopyOfRange;
                } else {
                    long j16 = ((long) c15223.f49640[i55 + 2 + c15223.f49641]) & 4294967295L;
                    long j17 = ((long) i3) & 4294967295L;
                    i5 = i60;
                    c15224 = c15223;
                    long j18 = ((long) i53) & 4294967295L;
                    iArr = iArrCopyOfRange;
                    long j19 = (((long) i4) & 4294967295L) * j18;
                    if (m36441(j19, (j17 << 32) | j16)) {
                        long j20 = ((long) ((int) (j17 + j8))) & 4294967295L;
                        i4 = (j20 < j8 || !m36441(j19 - j18, (j20 << 32) | j16)) ? i4 - 1 : i4 - 2;
                    }
                }
                c15223 = c15224;
                int[] iArr14 = c15223.f49640;
                int i62 = i55 + c15223.f49641;
                iArr14[i62] = 0;
                int[] iArr15 = iArr;
                if (m36434(i4, i54, iArr14, iArr15, i62) - Integer.MIN_VALUE > i5) {
                    m36440(i56 + c15223.f49641, iArr15, c15223.f49640);
                    i4--;
                }
                iArr12[i55] = i4;
            }
            if (i57 > 0) {
                c15223.m36459(i57);
            }
            c15223.m36450();
            c15222.m36450();
            return c15223;
        }
        int[] iArr16 = c15222.f49640;
        c15222.f49639 = 1;
        iArr16[0] = 1;
        c15222.f49641 = 0;
        return new C15221();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15221 m36463(C15221 c15221, C15221 c15222) {
        long jNumberOfLeadingZeros;
        char c;
        C15221 c15223;
        int i;
        C15221 c15224;
        long j;
        int i2 = this.f49639;
        int i3 = c15221.f49639;
        c15222.f49639 = 0;
        c15222.f49641 = 0;
        if (i2 < i3) {
            return this;
        }
        int i4 = 1;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i3 / 80));
        int i5 = (((i3 + iNumberOfLeadingZeros) - 1) / iNumberOfLeadingZeros) * iNumberOfLeadingZeros;
        long j2 = ((long) i5) * 32;
        int i6 = c15221.f49639;
        if (i6 == 0) {
            c = ' ';
            jNumberOfLeadingZeros = 0;
        } else {
            jNumberOfLeadingZeros = (((long) i6) * 32) - ((long) Integer.numberOfLeadingZeros(c15221.f49640[c15221.f49641]));
            c = ' ';
        }
        int iMax = (int) Math.max(0L, j2 - jNumberOfLeadingZeros);
        C15221 c15225 = new C15221(c15221);
        if (iMax > 0) {
            c15225.m36453(iMax);
        }
        C15221 c15226 = new C15221(this);
        if (iMax > 0) {
            c15226.m36453(iMax);
        }
        int i7 = c15226.f49639;
        int iNumberOfLeadingZeros2 = (int) (((i7 == 0 ? 0L : (((long) i7) * 32) - ((long) Integer.numberOfLeadingZeros(c15226.f49640[c15226.f49641]))) + j2) / j2);
        if (iNumberOfLeadingZeros2 < 2) {
            iNumberOfLeadingZeros2 = 2;
        }
        C15221 c15221M36437 = c15226.m36437(iNumberOfLeadingZeros2 - 1, iNumberOfLeadingZeros2, i5);
        int i8 = iNumberOfLeadingZeros2 - 2;
        C15221 c15221M36438 = c15226.m36437(i8, iNumberOfLeadingZeros2, i5);
        c15221M36438.m36454(i5, c15221M36437);
        C15221 c15227 = new C15221();
        while (i8 > 0) {
            C15221 c15221M36444 = c15221M36438.m36444(c15225, c15227);
            C15221 c15221M36439 = c15226.m36437(i8 - 1, iNumberOfLeadingZeros2, i5);
            c15221M36439.m36454(i5, c15221M36444);
            int i9 = i8 * i5;
            if (c15227.m36460()) {
                c15223 = c15226;
                i = i5;
                c15224 = c15221M36439;
            } else {
                int i10 = c15222.f49639;
                int i11 = c15227.f49639 + i9;
                int i12 = i10 > i11 ? i10 : i11;
                int[] iArr = c15222.f49640;
                if (iArr.length < i12) {
                    iArr = new int[i12];
                }
                int length = iArr.length - i4;
                long j3 = 0;
                while (i10 > 0 && i11 > 0) {
                    int i13 = i10 - 1;
                    i11--;
                    int i14 = c15227.f49641 + i11;
                    C15221 c15228 = c15226;
                    int[] iArr2 = c15227.f49640;
                    int i15 = i5;
                    long j4 = (((long) c15222.f49640[c15222.f49641 + i13]) & 4294967295L) + (((long) (i14 < iArr2.length ? iArr2[i14] : 0)) & 4294967295L) + j3;
                    iArr[length] = (int) j4;
                    j3 = j4 >>> c;
                    length--;
                    i5 = i15;
                    c15221M36439 = c15221M36439;
                    i10 = i13;
                    c15226 = c15228;
                }
                c15223 = c15226;
                i = i5;
                c15224 = c15221M36439;
                while (true) {
                    if (i10 > 0) {
                        i10--;
                        if (j3 != 0 || iArr != c15222.f49640 || length != c15222.f49641 + i10) {
                            long j5 = (((long) c15222.f49640[c15222.f49641 + i10]) & 4294967295L) + j3;
                            iArr[length] = (int) j5;
                            j3 = j5 >>> c;
                            length--;
                        }
                    } else {
                        while (i11 > 0) {
                            i11--;
                            int i16 = c15227.f49641 + i11;
                            int[] iArr3 = c15227.f49640;
                            long j6 = (((long) (i16 < iArr3.length ? iArr3[i16] : 0)) & 4294967295L) + j3;
                            iArr[length] = (int) j6;
                            j3 = j6 >>> c;
                            length--;
                        }
                        j = 0;
                        if (j3 > 0) {
                            i12++;
                            if (iArr.length < i12) {
                                int[] iArr4 = new int[i12];
                                System.arraycopy(iArr, 0, iArr4, 1, iArr.length);
                                iArr4[0] = 1;
                                iArr = iArr4;
                            } else {
                                iArr[length] = 1;
                            }
                        }
                        c15222.f49640 = iArr;
                        c15222.f49639 = i12;
                        c15222.f49641 = iArr.length - i12;
                        break;
                    }
                }
                i8--;
                c15226 = c15223;
                i5 = i;
                c15221M36438 = c15224;
                i4 = 1;
            }
            j = 0;
            i8--;
            c15226 = c15223;
            i5 = i;
            c15221M36438 = c15224;
            i4 = 1;
        }
        C15221 c15221M36445 = c15221M36438.m36444(c15225, c15227);
        c15222.m36455(c15227);
        c15221M36445.m36459(iMax);
        return c15221M36445;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C15221 m36444(C15221 c15221, C15221 c15222) {
        int i = c15221.f49639;
        if (i % 2 != 0 || i < 80) {
            return m36458(c15221, c15222);
        }
        C15221 c15223 = new C15221(this);
        int i2 = i / 2;
        int i3 = i2 * 32;
        if (i3 / 32 >= c15223.f49639) {
            c15223.f49639 = 0;
            c15223.f49641 = 0;
        } else {
            c15223.m36459(i3);
        }
        int i4 = this.f49639;
        if (i4 >= i2) {
            this.f49641 = (i4 - i2) + this.f49641;
            this.f49639 = i2;
        }
        C15221 c15224 = new C15221();
        m36454(i2, c15223.m36446(c15221, c15224));
        C15221 c15221M36446 = m36446(c15221, c15222);
        c15222.m36454(i2, c15224);
        return c15221M36446;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private C15221 m36446(C15221 c15221, C15221 c15222) {
        C2519 c2519;
        C15221 c15223;
        int i = c15221.f49639 / 2;
        C15221 c15224 = new C15221(this);
        int i2 = i * 32;
        int i3 = i2 / 32;
        if (i3 >= c15224.f49639) {
            c15224.f49639 = 0;
            c15224.f49641 = 0;
        } else {
            c15224.m36459(i2);
        }
        C15221 c15225 = new C15221(c15221);
        if (i3 >= c15225.f49639) {
            c15225.f49639 = 0;
            c15225.f49641 = 0;
        } else {
            c15225.m36459(i2);
        }
        if (c15221.m36460()) {
            c2519 = C22276.f72804;
        } else if (c15221.f49639 < i) {
            c2519 = c15221.m36449(1);
        } else {
            int i4 = i;
            while (i4 > 0 && c15221.f49640[(c15221.f49641 + c15221.f49639) - i4] == 0) {
                i4--;
            }
            int i5 = i4 > 0 ? 1 : 0;
            int[] iArr = c15221.f49640;
            int i6 = c15221.f49641 + c15221.f49639;
            c2519 = new C2519(Arrays.copyOfRange(iArr, i6 - i4, i6), i5);
        }
        int i7 = c15221.f49639;
        int i8 = this.f49639 - i;
        if (i8 >= i7) {
            if (i8 <= i7) {
                int[] iArr2 = c15221.f49640;
                int i9 = this.f49641;
                int i10 = c15221.f49641;
                while (true) {
                    if (i9 < this.f49641 + i8) {
                        int i11 = this.f49640[i9] - Integer.MIN_VALUE;
                        int i12 = iArr2[i10] - Integer.MIN_VALUE;
                        if (i11 < i12) {
                            c15224 = c15224.m36444(c15225, c15222);
                            c15222.m36450();
                            c15223 = new C15221(c15222.m36449(!c15222.m36460() ? 1 : 0).m7864(c2519));
                        } else if (i11 <= i12) {
                            i9++;
                            i10++;
                        }
                    }
                }
            }
            if (i > c15222.f49640.length) {
                c15222.f49640 = new int[i];
            }
            Arrays.fill(c15222.f49640, -1);
            c15222.f49641 = 0;
            c15222.f49639 = i;
            c15224.m36455(c15225);
            c15225.m36453(i2);
            c15224.m36448(c15225);
            c15223 = new C15221(c2519);
            c15223.m36453(i2);
            c15223.m36448(new C15221(c2519));
        } else {
            c15224 = c15224.m36444(c15225, c15222);
            c15222.m36450();
            c15223 = new C15221(c15222.m36449(!c15222.m36460() ? 1 : 0).m7864(c2519));
        }
        c15224.m36453(i2);
        C15221 c15226 = new C15221(this);
        int i13 = c15226.f49641 + c15226.f49639;
        if (i13 >= i) {
            c15226.f49641 = i13 - i;
            c15226.f49639 = i;
        }
        c15226.m36450();
        c15224.m36455(c15226);
        while (c15224.m36461(c15223) < 0) {
            c15224.m36455(c15221);
            c15222.m36448(f49638);
        }
        c15224.m36448(c15223);
        return c15224;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15221 m36437(int i, int i2, int i3) {
        int i4 = i * i3;
        int i5 = this.f49639;
        if (i4 >= i5) {
            return new C15221();
        }
        int i6 = i == i2 + (-1) ? i5 : (i + 1) * i3;
        if (i6 > i5) {
            return new C15221();
        }
        int[] iArr = this.f49640;
        int i7 = this.f49641;
        return new C15221(Arrays.copyOfRange(iArr, (i7 + i5) - i6, (i7 + i5) - i4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36439(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        int i5 = 32 - i4;
        int i6 = iArr[i];
        int i7 = 0;
        while (i7 < i2 - 1) {
            i++;
            int i8 = iArr[i];
            iArr2[i3 + i7] = (i6 << i4) | (i8 >>> i5);
            i7++;
            i6 = i8;
        }
        iArr2[(i3 + i2) - 1] = i6 << i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m36435(int i, long j) {
        long j2 = ((long) i) & 4294967295L;
        if (j2 == 1) {
            return ((long) ((int) j)) & 4294967295L;
        }
        long j3 = (j >>> 1) / (j2 >>> 1);
        long j4 = j - (j3 * j2);
        while (j4 < 0) {
            j4 += j2;
            j3--;
        }
        while (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        return (j4 << 32) | (j3 & 4294967295L);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15221 m36462(int i) {
        if (m36456()) {
            throw new RuntimeException();
        }
        if (i <= 64) {
            int[] iArr = this.f49640;
            int i2 = this.f49641;
            int i3 = this.f49639;
            int i4 = iArr[(i2 + i3) - 1];
            int iM38346 = C16236.m38346(i4, i4, 2, i4);
            int iM38347 = C16236.m38346(i4, iM38346, 2, iM38346);
            int iM38348 = C16236.m38346(i4, iM38347, 2, iM38347);
            int iM38349 = C16236.m38346(i4, iM38348, 2, iM38348);
            if (i < 33) {
                if (i != 32) {
                    iM38349 &= (1 << i) - 1;
                }
                return new C15221(iM38349);
            }
            int i5 = i2 + i3;
            long j = ((long) iArr[i5 - 1]) & 4294967295L;
            if (i3 > 1) {
                j |= ((long) iArr[i5 - 2]) << 32;
            }
            long j2 = ((long) iM38349) & 4294967295L;
            long j3 = (2 - (j * j2)) * j2;
            if (i != 64) {
                j3 &= (1 << i) - 1;
            }
            C15221 c15221 = new C15221(new int[]{(int) (j3 >>> 32), (int) j3});
            c15221.f49639 = 2;
            c15221.m36450();
            return c15221;
        }
        C15221 c15222 = new C15221(1);
        c15222.m36453(i);
        C15221 c15223 = new C15221(c15222);
        C15221 c15224 = new C15221(this);
        C15221 c15225 = new C15221();
        C15221 c15221M36452 = c15222.m36452(c15224, c15225);
        C15221 c15226 = new C15221(c15225);
        C15221 c15227 = new C15221(1);
        C15221 c15228 = new C15221();
        while (!c15221M36452.m36465()) {
            c15224 = c15224.m36452(c15221M36452, c15225);
            if (c15224.f49639 == 0) {
                throw new RuntimeException();
            }
            if (c15225.f49639 == 1) {
                c15226.m36464(c15225.f49640[c15225.f49641], c15228);
            } else {
                c15225.m36451(c15226, c15228);
            }
            c15227.m36455(c15228);
            if (c15224.m36465()) {
                return c15227;
            }
            c15221M36452 = c15221M36452.m36452(c15224, c15228);
            if (c15221M36452.f49639 == 0) {
                throw new RuntimeException();
            }
            if (c15228.f49639 == 1) {
                c15227.m36464(c15228.f49640[c15228.f49641], c15225);
            } else {
                c15228.m36451(c15227, c15225);
            }
            c15226.m36455(c15225);
        }
        c15223.m36448(c15226);
        return c15223;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C15221 m36443(C15221 c15221) {
        int iM36442;
        C15221 c15222 = new C15221(c15221);
        C15221 c15223 = new C15221(this);
        C15221 c15224 = new C15221(c15222);
        C18042 c18042 = new C18042(1);
        c18042.f57691 = 1;
        C18042 c18043 = new C18042();
        c18043.f57691 = 1;
        if (c15223.m36456()) {
            iM36442 = c15223.m36442();
            c15223.m36459(iM36442);
            c18043.m36453(iM36442);
        } else {
            iM36442 = 0;
        }
        while (!c15223.m36465()) {
            if (c15223.m36460()) {
                throw new RuntimeException();
            }
            if (c15223.m36461(c15224) < 0) {
                C15221 c15225 = c15224;
                c15224 = c15223;
                c15223 = c15225;
                C18042 c18044 = c18043;
                c18043 = c18042;
                c18042 = c18044;
            }
            if (((c15223.f49640[(c15223.f49641 + c15223.f49639) - 1] ^ c15224.f49640[(c15224.f49641 + c15224.f49639) - 1]) & 3) == 0) {
                c15223.m36448(c15224);
                int i = c18042.f57691;
                if (i == c18043.f57691) {
                    c18042.f57691 = i * c18042.m36448(c18043);
                } else {
                    c18042.m36455(c18043);
                }
            } else {
                c15223.m36455(c15224);
                int i2 = c18042.f57691;
                if (i2 == c18043.f57691) {
                    c18042.m36455(c18043);
                } else {
                    c18042.f57691 = i2 * c18042.m36448(c18043);
                }
            }
            int iM36443 = c15223.m36442();
            c15223.m36459(iM36443);
            c18043.m36453(iM36443);
            iM36442 += iM36443;
        }
        if (c18042.m36461(c15222) >= 0) {
            C15221 c15221M36452 = c18042.m36452(c15222, new C15221());
            int i3 = c15221M36452.f49639;
            if (c18042.f49640.length < i3) {
                c18042.f49640 = new int[i3];
            }
            System.arraycopy(c15221M36452.f49640, c15221M36452.f49641, c18042.f49640, 0, i3);
            c18042.f49639 = i3;
            c18042.f49641 = 0;
        }
        int i4 = c18042.f57691;
        if (i4 < 0) {
            if (i4 == 1) {
                c18042.m36455(c15222);
            } else {
                c18042.f57691 = i4 * c18042.m36448(c15222);
            }
        }
        return m36438(c18042, c15222, iM36442);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15221 m36438(C15221 c15221, C15221 c15222, int i) {
        C15221 c15223 = new C15221();
        int i2 = c15222.f49640[(c15222.f49641 + c15222.f49639) - 1];
        int iM38346 = C16236.m38346(i2, i2, 2, i2);
        int iM38347 = C16236.m38346(i2, iM38346, 2, iM38346);
        int iM38348 = C16236.m38346(i2, iM38347, 2, iM38347);
        int i3 = -C16236.m38346(i2, iM38348, 2, iM38348);
        int i4 = i >> 5;
        for (int i5 = 0; i5 < i4; i5++) {
            c15222.m36464(c15221.f49640[(c15221.f49641 + c15221.f49639) - 1] * i3, c15223);
            c15221.m36455(c15223);
            c15221.f49639--;
        }
        int i6 = i & 31;
        if (i6 != 0) {
            c15222.m36464((i3 * c15221.f49640[(c15221.f49641 + c15221.f49639) - 1]) & ((1 << i6) - 1), c15223);
            c15221.m36455(c15223);
            c15221.m36459(i6);
        }
        return c15221.m36461(c15222) >= 0 ? c15221.m36452(c15222, new C15221()) : c15221;
    }
}
