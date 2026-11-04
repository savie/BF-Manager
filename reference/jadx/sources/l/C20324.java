package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 098S */
/* JADX INFO: loaded from: classes.dex */
public class C20324 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C20324 f65211;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f65212;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f65213;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f65214;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native long m46668(long j);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46673(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    static {
        ApplicationC23172.m52091(143);
        f65211 = new C20324(1);
    }

    public C20324() {
        this.f65214 = 0;
        this.f65213 = new int[1];
        this.f65212 = 0;
    }

    public C20324(int i) {
        this.f65214 = 0;
        this.f65213 = new int[]{i};
        this.f65212 = 1;
    }

    public C20324(int[] iArr) {
        this.f65214 = 0;
        this.f65213 = iArr;
        this.f65212 = iArr.length;
    }

    public C20324(C5408 c5408) {
        this.f65214 = 0;
        int[] iArr = c5408.f5785;
        int length = iArr.length;
        this.f65212 = length;
        this.f65213 = Arrays.copyOf(iArr, length);
    }

    public C20324(C20324 c20324) {
        this.f65214 = 0;
        int i = c20324.f65212;
        this.f65212 = i;
        int[] iArr = c20324.f65213;
        int i2 = c20324.f65214;
        this.f65213 = Arrays.copyOfRange(iArr, i2, i + i2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5408 m46695(int i) {
        int[] iArrCopyOfRange;
        int i2 = this.f65212;
        if (i2 != 0 && i != 0) {
            int i3 = this.f65214;
            if (i3 <= 0) {
                iArrCopyOfRange = this.f65213;
                if (iArrCopyOfRange.length != i2) {
                    iArrCopyOfRange = Arrays.copyOfRange(this.f65213, i3, i2 + i3);
                }
            } else {
                iArrCopyOfRange = Arrays.copyOfRange(this.f65213, i3, i2 + i3);
            }
            return new C5408(iArrCopyOfRange, i);
        }
        return C11373.f35800;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m46689(C20324 c20324) {
        int i = c20324.f65212;
        int i2 = this.f65212;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int[] iArr = c20324.f65213;
        int i3 = this.f65214;
        int i4 = c20324.f65214;
        while (i3 < this.f65212 + this.f65214) {
            int i5 = this.f65213[i3] - Integer.MIN_VALUE;
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private final int m46676() {
        int i = this.f65212;
        if (i == 0) {
            return -1;
        }
        do {
            i--;
            if (i <= 0) {
                break;
            }
        } while (this.f65213[this.f65214 + i] == 0);
        int i2 = this.f65213[this.f65214 + i];
        if (i2 == 0) {
            return -1;
        }
        return Integer.numberOfTrailingZeros(i2) + (((this.f65212 - 1) - i) << 5);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m46696() {
        int i = this.f65212;
        if (i == 0) {
            this.f65214 = 0;
            return;
        }
        int i2 = this.f65214;
        if (this.f65213[i2] != 0) {
            return;
        }
        int i3 = i + i2;
        do {
            i2++;
            if (i2 >= i3) {
                break;
            }
        } while (this.f65213[i2] == 0);
        int i4 = this.f65214;
        int i5 = i2 - i4;
        int i6 = this.f65212 - i5;
        this.f65212 = i6;
        this.f65214 = i6 != 0 ? i4 + i5 : 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46692(int i, C20324 c20324) {
        if (i == 1) {
            int i2 = this.f65212;
            if (c20324.f65213.length < i2) {
                c20324.f65213 = new int[i2];
            }
            System.arraycopy(this.f65213, this.f65214, c20324.f65213, 0, i2);
            c20324.f65212 = i2;
            c20324.f65214 = 0;
            return;
        }
        if (i == 0) {
            c20324.f65212 = 0;
            c20324.f65214 = 0;
            int length = c20324.f65213.length;
            for (int i3 = 0; i3 < length; i3++) {
                c20324.f65213[i3] = 0;
            }
            return;
        }
        long j = ((long) i) & 4294967295L;
        int[] iArr = c20324.f65213;
        int length2 = iArr.length;
        int i4 = this.f65212;
        int i5 = i4 + 1;
        if (length2 < i5) {
            iArr = new int[i5];
        }
        long j2 = 0;
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            long j3 = ((((long) this.f65213[this.f65214 + i6]) & 4294967295L) * j) + j2;
            iArr[i6 + 1] = (int) j3;
            j2 = j3 >>> 32;
        }
        if (j2 == 0) {
            c20324.f65214 = 1;
            c20324.f65212 = this.f65212;
        } else {
            c20324.f65214 = 0;
            c20324.f65212 = this.f65212 + 1;
            iArr[0] = (int) j2;
        }
        c20324.f65213 = iArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46693() {
        return this.f65212 == 1 && this.f65213[this.f65214] == 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m46688() {
        return this.f65212 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46684() {
        int i = this.f65212;
        return i == 0 || (this.f65213[(this.f65214 + i) - 1] & 1) == 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20324 m46685(C20324 c20324) {
        if (!c20324.m46688() && (c20324.f65213[(c20324.f65214 + c20324.f65212) - 1] & 1) == 1) {
            return m46677(c20324);
        }
        if (m46684()) {
            throw new RuntimeException();
        }
        int iM46676 = c20324.m46676();
        C20324 c20325 = new C20324(c20324);
        c20325.m46687(iM46676);
        if (c20325.m46693()) {
            return m46690(iM46676);
        }
        C20324 c20324M46677 = m46677(c20325);
        C20324 c20324M46690 = m46690(iM46676);
        C20324 c20324M46670 = m46670(new C20324(1), new C20324(c20325), iM46676);
        C20324 c20324M46691 = c20325.m46690(iM46676);
        C20324 c20326 = new C20324();
        C20324 c20327 = new C20324();
        C20324 c20328 = new C20324();
        c20324M46677.m46681(iM46676);
        c20324M46677.m46697(c20324M46670, c20328);
        c20324M46690.m46697(c20325, c20326);
        c20326.m46697(c20324M46691, c20327);
        c20328.m46683(c20327);
        return c20328.m46680(c20324, c20326);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m46687(int i) {
        int i2 = this.f65212;
        if (i2 == 0) {
            return;
        }
        int i3 = i >>> 5;
        int i4 = i & 31;
        this.f65212 = i2 - i3;
        if (i4 == 0) {
            return;
        }
        if (i4 >= 32 - Integer.numberOfLeadingZeros(this.f65213[this.f65214])) {
            m46679(32 - i4);
            this.f65212--;
        } else {
            m46675(i4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46681(int i) {
        int i2;
        if (this.f65212 == 0) {
            return;
        }
        int i3 = i >>> 5;
        int i4 = i & 31;
        int iNumberOfLeadingZeros = 32 - (32 - Integer.numberOfLeadingZeros(this.f65213[this.f65214]));
        if (i <= iNumberOfLeadingZeros) {
            m46679(i4);
            return;
        }
        int i5 = this.f65212 + i3;
        int i6 = i5 + 1;
        if (i4 > iNumberOfLeadingZeros) {
            i5 = i6;
        }
        int[] iArr = this.f65213;
        if (iArr.length < i5) {
            int[] iArr2 = new int[i5];
            for (int i7 = 0; i7 < this.f65212; i7++) {
                iArr2[i7] = this.f65213[this.f65214 + i7];
            }
            this.f65213 = iArr2;
            this.f65212 = i5;
            this.f65214 = 0;
        } else if (iArr.length - this.f65214 >= i5) {
            int i8 = 0;
            while (true) {
                int i9 = this.f65212;
                if (i8 >= i5 - i9) {
                    break;
                }
                this.f65213[this.f65214 + i9 + i8] = 0;
                i8++;
            }
        } else {
            int i10 = 0;
            while (true) {
                i2 = this.f65212;
                if (i10 >= i2) {
                    break;
                }
                int[] iArr3 = this.f65213;
                iArr3[i10] = iArr3[this.f65214 + i10];
                i10++;
            }
            while (i2 < i5) {
                this.f65213[i2] = 0;
                i2++;
            }
            this.f65214 = 0;
        }
        this.f65212 = i5;
        if (i4 == 0) {
            return;
        }
        if (i4 <= iNumberOfLeadingZeros) {
            m46679(i4);
        } else {
            m46675(32 - i4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46672(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i2 = length + i;
            long j2 = (((long) iArr[length]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j;
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46666(int i, int i2, int[] iArr, int[] iArr2, int i3) {
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

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private final void m46675(int i) {
        int[] iArr = this.f65213;
        int i2 = 32 - i;
        int i3 = (this.f65214 + this.f65212) - 1;
        int i4 = iArr[i3];
        while (true) {
            int i5 = this.f65214;
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private final void m46679(int i) {
        int[] iArr = this.f65213;
        int i2 = 32 - i;
        int i3 = this.f65214;
        int i4 = iArr[i3];
        int i5 = (this.f65212 + i3) - 1;
        while (i3 < i5) {
            int i6 = i3 + 1;
            int i7 = iArr[i6];
            iArr[i3] = (i4 << i) | (i7 >>> i2);
            i3 = i6;
            i4 = i7;
        }
        int i8 = (this.f65214 + this.f65212) - 1;
        iArr[i8] = iArr[i8] << i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46683(C20324 c20324) {
        int i = this.f65212;
        int i2 = c20324.f65212;
        int i3 = i > i2 ? i : i2;
        int[] iArr = this.f65213;
        if (iArr.length < i3) {
            iArr = new int[i3];
        }
        int length = iArr.length - 1;
        long j = 0;
        while (i > 0 && i2 > 0) {
            int i4 = i - 1;
            int i5 = i2 - 1;
            long j2 = (((long) this.f65213[this.f65214 + i4]) & 4294967295L) + (((long) c20324.f65213[c20324.f65214 + i5]) & 4294967295L) + j;
            iArr[length] = (int) j2;
            j = j2 >>> 32;
            length--;
            i = i4;
            i2 = i5;
        }
        while (i > 0) {
            i--;
            if (j == 0 && iArr == this.f65213 && length == this.f65214 + i) {
                return;
            }
            long j3 = (((long) this.f65213[this.f65214 + i]) & 4294967295L) + j;
            iArr[length] = (int) j3;
            length--;
            j = j3 >>> 32;
        }
        while (i2 > 0) {
            i2--;
            long j4 = (((long) c20324.f65213[c20324.f65214 + i2]) & 4294967295L) + j;
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
        this.f65213 = iArr;
        this.f65212 = i3;
        this.f65214 = iArr.length - i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46682(int i, C20324 c20324) {
        if (c20324.m46688()) {
            return;
        }
        int i2 = this.f65212;
        int i3 = c20324.f65212 + i;
        int i4 = i2 > i3 ? i2 : i3;
        int[] iArr = this.f65213;
        if (iArr.length < i4) {
            iArr = new int[i4];
        } else {
            Arrays.fill(iArr, this.f65214 + i2, iArr.length, 0);
        }
        int length = iArr.length;
        System.arraycopy(this.f65213, this.f65214, iArr, length - i2, i2);
        int i5 = i3 - i2;
        int i6 = (length - 1) - i2;
        int iMin = Math.min(i5, c20324.f65213.length - c20324.f65214);
        int i7 = i6 + 1;
        int i8 = i7 - i5;
        System.arraycopy(c20324.f65213, c20324.f65214, iArr, i8, iMin);
        for (int i9 = i8 + iMin; i9 < i7; i9++) {
            iArr[i9] = 0;
        }
        this.f65213 = iArr;
        this.f65212 = i4;
        this.f65214 = iArr.length - i4;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m46694(C20324 c20324) {
        C20324 c20325;
        C20324 c20326;
        int[] iArr = this.f65213;
        int iM46689 = m46689(c20324);
        if (iM46689 == 0) {
            this.f65212 = 0;
            this.f65214 = 0;
            return 0;
        }
        if (iM46689 < 0) {
            c20326 = c20324;
            c20325 = this;
        } else {
            c20325 = c20324;
            c20326 = this;
        }
        int i = c20326.f65212;
        if (iArr.length < i) {
            iArr = new int[i];
        }
        int i2 = c20325.f65212;
        int length = iArr.length - 1;
        long j = 0;
        int i3 = i;
        while (i2 > 0) {
            i3--;
            i2--;
            j = ((((long) c20326.f65213[c20326.f65214 + i3]) & 4294967295L) - (((long) c20325.f65213[c20325.f65214 + i2]) & 4294967295L)) - ((long) ((int) (-(j >> 32))));
            iArr[length] = (int) j;
            length--;
        }
        while (i3 > 0) {
            i3--;
            j = (((long) c20326.f65213[c20326.f65214 + i3]) & 4294967295L) - ((long) ((int) (-(j >> 32))));
            iArr[length] = (int) j;
            length--;
        }
        this.f65213 = iArr;
        this.f65212 = i;
        this.f65214 = iArr.length - i;
        m46696();
        return iM46689;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m46697(C20324 c20324, C20324 c20325) {
        C20324 c20326 = this;
        C20324 c20327 = c20324;
        int i = c20326.f65212;
        int i2 = c20327.f65212;
        int i3 = i + i2;
        if (c20325.f65213.length < i3) {
            c20325.f65213 = new int[i3];
        }
        c20325.f65214 = 0;
        c20325.f65212 = i3;
        int i4 = i2 - 1;
        int i5 = i3 - 1;
        long j = 0;
        int i6 = i4;
        while (i6 >= 0) {
            long j2 = ((((long) c20327.f65213[c20327.f65214 + i6]) & 4294967295L) * (((long) c20326.f65213[(i - 1) + c20326.f65214]) & 4294967295L)) + j;
            c20325.f65213[i5] = (int) j2;
            j = j2 >>> 32;
            i6--;
            i5--;
        }
        c20325.f65213[i - 1] = (int) j;
        int i7 = i - 2;
        while (i7 >= 0) {
            int i8 = i2 + i7;
            long j3 = 0;
            int i9 = i4;
            while (i9 >= 0) {
                long j4 = (((long) c20327.f65213[c20327.f65214 + i9]) & 4294967295L) * (((long) c20326.f65213[c20326.f65214 + i7]) & 4294967295L);
                int[] iArr = c20325.f65213;
                long j5 = j4 + (((long) iArr[i8]) & 4294967295L) + j3;
                iArr[i8] = (int) j5;
                j3 = j5 >>> 32;
                i9--;
                i8--;
                c20326 = this;
                c20327 = c20324;
                i2 = i2;
            }
            c20325.f65213[i7] = (int) j3;
            i7--;
            c20326 = this;
            c20327 = c20324;
            i2 = i2;
        }
        c20325.m46696();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20324 m46680(C20324 c20324, C20324 c20325) {
        int i = c20324.f65212;
        if (i < 80 || this.f65212 - i < 40) {
            return m46686(c20324, c20325);
        }
        return m46691(c20324, c20325);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20324 m46686(C20324 c20324, C20324 c20325) {
        int i;
        int[] iArrCopyOfRange;
        C20324 c20326;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        C20324 c20327;
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
        if (c20324.f65212 == 0) {
            throw new RuntimeException();
        }
        if (this.f65212 == 0) {
            c20325.f65214 = 0;
            c20325.f65212 = 0;
            return new C20324();
        }
        int iM46689 = m46689(c20324);
        if (iM46689 < 0) {
            c20325.f65214 = 0;
            c20325.f65212 = 0;
            return new C20324(this);
        }
        if (iM46689 != 0) {
            c20325.f65212 = 0;
            c20325.f65214 = 0;
            int length = c20325.f65213.length;
            for (int i18 = 0; i18 < length; i18++) {
                c20325.f65213[i18] = 0;
            }
            char c = ' ';
            if (c20324.f65212 == 1) {
                int i19 = c20324.f65213[c20324.f65214];
                long j4 = ((long) i19) & 4294967295L;
                int i20 = this.f65212;
                if (i20 == 1) {
                    long j5 = 4294967295L & ((long) this.f65213[this.f65214]);
                    int i21 = (int) (j5 / j4);
                    i16 = (int) (j5 - (((long) i21) * j4));
                    c20325.f65213[0] = i21;
                    c20325.f65212 = i21 == 0 ? 0 : 1;
                    c20325.f65214 = 0;
                } else {
                    if (c20325.f65213.length < i20) {
                        c20325.f65213 = new int[i20];
                    }
                    c20325.f65214 = 0;
                    c20325.f65212 = i20;
                    int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i19);
                    int i22 = this.f65213[this.f65214];
                    long j6 = ((long) i22) & 4294967295L;
                    if (j6 < j4) {
                        j2 = 0;
                        c20325.f65213[0] = 0;
                    } else {
                        int i23 = (int) (j6 / j4);
                        c20325.f65213[0] = i23;
                        i22 = (int) (j6 - (((long) i23) * j4));
                        j6 = ((long) i22) & 4294967295L;
                        j2 = 0;
                    }
                    int i24 = this.f65212;
                    while (true) {
                        int i25 = i24 - 1;
                        if (i25 <= 0) {
                            break;
                        }
                        int i26 = iNumberOfLeadingZeros;
                        long j7 = (((long) this.f65213[(this.f65214 + this.f65212) - i25]) & 4294967295L) | (j6 << c);
                        if (j7 >= j2) {
                            i17 = (int) (j7 / j4);
                            j3 = j7 - (((long) i17) * j4);
                        } else {
                            long jM46667 = m46667(i19, j7);
                            i17 = (int) (jM46667 & 4294967295L);
                            j3 = jM46667 >>> 32;
                        }
                        int i27 = (int) j3;
                        c20325.f65213[this.f65212 - i25] = i17;
                        j6 = ((long) i27) & 4294967295L;
                        iNumberOfLeadingZeros = i26;
                        i22 = i27;
                        i24 = i25;
                        c = ' ';
                    }
                    int i28 = iNumberOfLeadingZeros;
                    c20325.m46696();
                    i16 = i28 > 0 ? i22 % i19 : i22;
                }
                if (i16 == 0) {
                    return new C20324();
                }
                return new C20324(i16);
            }
            if (this.f65212 >= 6 && (iMin = Math.min(m46676(), c20324.m46676())) >= 96) {
                C20324 c20328 = new C20324(this);
                C20324 c20329 = new C20324(c20324);
                c20328.m46687(iMin);
                c20329.m46687(iMin);
                C20324 c20324M46686 = c20328.m46686(c20329, c20325);
                c20324M46686.m46681(iMin);
                return c20324M46686;
            }
            int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(c20324.f65213[c20324.f65214]);
            int i29 = c20324.f65212;
            if (iNumberOfLeadingZeros2 > 0) {
                int[] iArr3 = new int[i29];
                i = i29;
                m46671(c20324.f65214, i29, c20324.f65213, 0, iArr3, iNumberOfLeadingZeros2);
                if (Integer.numberOfLeadingZeros(this.f65213[this.f65214]) >= iNumberOfLeadingZeros2) {
                    int[] iArr4 = new int[this.f65212 + 1];
                    c20326 = new C20324(iArr4);
                    c20326.f65212 = this.f65212;
                    c20326.f65214 = 1;
                    m46671(this.f65214, this.f65212, this.f65213, 1, iArr4, iNumberOfLeadingZeros2);
                    iArrCopyOfRange = iArr3;
                } else {
                    int[] iArr5 = new int[this.f65212 + 2];
                    C20324 c203210 = new C20324(iArr5);
                    c203210.f65212 = this.f65212 + 1;
                    c203210.f65214 = 1;
                    int i30 = this.f65214;
                    int i31 = 32 - iNumberOfLeadingZeros2;
                    int i32 = 1;
                    int i33 = 0;
                    while (true) {
                        i15 = this.f65212 + 1;
                        if (i32 >= i15) {
                            break;
                        }
                        int i34 = this.f65213[i30];
                        iArr5[i32] = (i33 << iNumberOfLeadingZeros2) | (i34 >>> i31);
                        i32++;
                        i30++;
                        i33 = i34;
                    }
                    iArr5[i15] = i33 << iNumberOfLeadingZeros2;
                    iArrCopyOfRange = iArr3;
                    c20326 = c203210;
                }
            } else {
                i = i29;
                int[] iArr6 = c20324.f65213;
                int i35 = c20324.f65214;
                iArrCopyOfRange = Arrays.copyOfRange(iArr6, i35, i35 + i);
                int[] iArr7 = new int[this.f65212 + 1];
                c20326 = new C20324(iArr7);
                System.arraycopy(this.f65213, this.f65214, iArr7, 1, this.f65212);
                c20326.f65212 = this.f65212;
                c20326.f65214 = 1;
            }
            int i36 = c20326.f65212;
            int i37 = i36 - i;
            int i38 = i37 + 1;
            if (c20325.f65213.length < i38) {
                c20325.f65213 = new int[i38];
                c20325.f65214 = 0;
            }
            c20325.f65212 = i38;
            int[] iArr8 = c20325.f65213;
            int i39 = c20326.f65212;
            if (i39 == i36) {
                c20326.f65214 = 0;
                c20326.f65213[0] = 0;
                c20326.f65212 = i39 + 1;
            }
            int i40 = iArrCopyOfRange[0];
            int i41 = iNumberOfLeadingZeros2;
            long j8 = ((long) i40) & 4294967295L;
            int i42 = iArrCopyOfRange[1];
            int i43 = 0;
            while (i43 < i37) {
                int[] iArr9 = c20326.f65213;
                int i44 = c20326.f65214;
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
                        long jM46668 = m46667(i40, j9);
                        i6 = (int) (jM46668 & 4294967295L);
                        j = jM46668 >>> 32;
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
                        long j10 = ((long) c20326.f65213[i43 + 2 + c20326.f65214]) & 4294967295L;
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
                        if (m46673(j13, (j11 << 32) | j10)) {
                            long j14 = ((long) ((int) (j11 + j8))) & 4294967295L;
                            i8 = (j14 < j8 || !m46673(j13 - j12, (j14 << 32) | j10)) ? i8 - 1 : i8 - 2;
                        }
                    }
                    int[] iArr11 = c20326.f65213;
                    int i51 = c20326.f65214 + i43;
                    iArr11[i51] = 0;
                    i14 = i12;
                    if (m46666(i8, i14, iArr11, iArrCopyOfRange, i51) - Integer.MIN_VALUE > i9) {
                        m46672(i47 + c20326.f65214, iArrCopyOfRange, c20326.f65213);
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
            int[] iArr13 = c20326.f65213;
            int i58 = c20326.f65214;
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
                    long jM46669 = m46667(i52, j15);
                    i2 = (int) (jM46669 & 4294967295L);
                    i3 = (int) (jM46669 >>> 32);
                }
                i4 = i2;
                z = false;
            }
            if (i4 != 0) {
                if (z) {
                    i5 = i60;
                    c20327 = c20326;
                    iArr = iArrCopyOfRange;
                } else {
                    long j16 = ((long) c20326.f65213[i55 + 2 + c20326.f65214]) & 4294967295L;
                    long j17 = ((long) i3) & 4294967295L;
                    i5 = i60;
                    c20327 = c20326;
                    long j18 = ((long) i53) & 4294967295L;
                    iArr = iArrCopyOfRange;
                    long j19 = (((long) i4) & 4294967295L) * j18;
                    if (m46673(j19, (j17 << 32) | j16)) {
                        long j20 = ((long) ((int) (j17 + j8))) & 4294967295L;
                        i4 = (j20 < j8 || !m46673(j19 - j18, (j20 << 32) | j16)) ? i4 - 1 : i4 - 2;
                    }
                }
                c20326 = c20327;
                int[] iArr14 = c20326.f65213;
                int i62 = i55 + c20326.f65214;
                iArr14[i62] = 0;
                int[] iArr15 = iArr;
                if (m46666(i4, i54, iArr14, iArr15, i62) - Integer.MIN_VALUE > i5) {
                    m46672(i56 + c20326.f65214, iArr15, c20326.f65213);
                    i4--;
                }
                iArr12[i55] = i4;
            }
            if (i57 > 0) {
                c20326.m46687(i57);
            }
            c20326.m46696();
            c20325.m46696();
            return c20326;
        }
        int[] iArr16 = c20325.f65213;
        c20325.f65212 = 1;
        iArr16[0] = 1;
        c20325.f65214 = 0;
        return new C20324();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20324 m46691(C20324 c20324, C20324 c20325) {
        long jNumberOfLeadingZeros;
        char c;
        C20324 c20326;
        int i;
        C20324 c20327;
        long j;
        int i2 = this.f65212;
        int i3 = c20324.f65212;
        c20325.f65212 = 0;
        c20325.f65214 = 0;
        if (i2 < i3) {
            return this;
        }
        int i4 = 1;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i3 / 80));
        int i5 = (((i3 + iNumberOfLeadingZeros) - 1) / iNumberOfLeadingZeros) * iNumberOfLeadingZeros;
        long j2 = ((long) i5) * 32;
        int i6 = c20324.f65212;
        if (i6 == 0) {
            c = ' ';
            jNumberOfLeadingZeros = 0;
        } else {
            jNumberOfLeadingZeros = (((long) i6) * 32) - ((long) Integer.numberOfLeadingZeros(c20324.f65213[c20324.f65214]));
            c = ' ';
        }
        int iMax = (int) Math.max(0L, j2 - jNumberOfLeadingZeros);
        C20324 c20328 = new C20324(c20324);
        if (iMax > 0) {
            c20328.m46681(iMax);
        }
        C20324 c20329 = new C20324(this);
        if (iMax > 0) {
            c20329.m46681(iMax);
        }
        int i7 = c20329.f65212;
        int iNumberOfLeadingZeros2 = (int) (((i7 == 0 ? 0L : (((long) i7) * 32) - ((long) Integer.numberOfLeadingZeros(c20329.f65213[c20329.f65214]))) + j2) / j2);
        if (iNumberOfLeadingZeros2 < 2) {
            iNumberOfLeadingZeros2 = 2;
        }
        C20324 c20324M46669 = c20329.m46669(iNumberOfLeadingZeros2 - 1, iNumberOfLeadingZeros2, i5);
        int i8 = iNumberOfLeadingZeros2 - 2;
        C20324 c20324M466610 = c20329.m46669(i8, iNumberOfLeadingZeros2, i5);
        c20324M466610.m46682(i5, c20324M46669);
        C20324 c203210 = new C20324();
        while (i8 > 0) {
            C20324 c20324M46678 = c20324M466610.m46678(c20328, c203210);
            C20324 c20324M466611 = c20329.m46669(i8 - 1, iNumberOfLeadingZeros2, i5);
            c20324M466611.m46682(i5, c20324M46678);
            int i9 = i8 * i5;
            if (c203210.m46688()) {
                c20326 = c20329;
                i = i5;
                c20327 = c20324M466611;
            } else {
                int i10 = c20325.f65212;
                int i11 = c203210.f65212 + i9;
                int i12 = i10 > i11 ? i10 : i11;
                int[] iArr = c20325.f65213;
                if (iArr.length < i12) {
                    iArr = new int[i12];
                }
                int length = iArr.length - i4;
                long j3 = 0;
                while (i10 > 0 && i11 > 0) {
                    int i13 = i10 - 1;
                    i11--;
                    int i14 = c203210.f65214 + i11;
                    C20324 c203211 = c20329;
                    int[] iArr2 = c203210.f65213;
                    int i15 = i5;
                    long j4 = (((long) c20325.f65213[c20325.f65214 + i13]) & 4294967295L) + (((long) (i14 < iArr2.length ? iArr2[i14] : 0)) & 4294967295L) + j3;
                    iArr[length] = (int) j4;
                    j3 = j4 >>> c;
                    length--;
                    i5 = i15;
                    c20324M466611 = c20324M466611;
                    i10 = i13;
                    c20329 = c203211;
                }
                c20326 = c20329;
                i = i5;
                c20327 = c20324M466611;
                while (true) {
                    if (i10 > 0) {
                        i10--;
                        if (j3 != 0 || iArr != c20325.f65213 || length != c20325.f65214 + i10) {
                            long j5 = (((long) c20325.f65213[c20325.f65214 + i10]) & 4294967295L) + j3;
                            iArr[length] = (int) j5;
                            j3 = j5 >>> c;
                            length--;
                        }
                    } else {
                        while (i11 > 0) {
                            i11--;
                            int i16 = c203210.f65214 + i11;
                            int[] iArr3 = c203210.f65213;
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
                        c20325.f65213 = iArr;
                        c20325.f65212 = i12;
                        c20325.f65214 = iArr.length - i12;
                        break;
                    }
                }
                i8--;
                c20329 = c20326;
                i5 = i;
                c20324M466610 = c20327;
                i4 = 1;
            }
            j = 0;
            i8--;
            c20329 = c20326;
            i5 = i;
            c20324M466610 = c20327;
            i4 = 1;
        }
        C20324 c20324M46679 = c20324M466610.m46678(c20328, c203210);
        c20325.m46683(c203210);
        c20324M46679.m46687(iMax);
        return c20324M46679;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C20324 m46678(C20324 c20324, C20324 c20325) {
        int i = c20324.f65212;
        if (i % 2 != 0 || i < 80) {
            return m46686(c20324, c20325);
        }
        C20324 c20326 = new C20324(this);
        int i2 = i / 2;
        int i3 = i2 * 32;
        if (i3 / 32 >= c20326.f65212) {
            c20326.f65212 = 0;
            c20326.f65214 = 0;
        } else {
            c20326.m46687(i3);
        }
        int i4 = this.f65212;
        if (i4 >= i2) {
            this.f65214 = (i4 - i2) + this.f65214;
            this.f65212 = i2;
        }
        C20324 c20327 = new C20324();
        m46682(i2, c20326.m46674(c20324, c20327));
        C20324 c20324M46674 = m46674(c20324, c20325);
        c20325.m46682(i2, c20327);
        return c20324M46674;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C20324 m46674(C20324 c20324, C20324 c20325) {
        C5408 c5408;
        C20324 c20326;
        int i = c20324.f65212 / 2;
        C20324 c20327 = new C20324(this);
        int i2 = i * 32;
        int i3 = i2 / 32;
        if (i3 >= c20327.f65212) {
            c20327.f65212 = 0;
            c20327.f65214 = 0;
        } else {
            c20327.m46687(i2);
        }
        C20324 c20328 = new C20324(c20324);
        if (i3 >= c20328.f65212) {
            c20328.f65212 = 0;
            c20328.f65214 = 0;
        } else {
            c20328.m46687(i2);
        }
        if (c20324.m46688()) {
            c5408 = C11373.f35800;
        } else if (c20324.f65212 < i) {
            c5408 = c20324.m46695(1);
        } else {
            int i4 = i;
            while (i4 > 0 && c20324.f65213[(c20324.f65214 + c20324.f65212) - i4] == 0) {
                i4--;
            }
            int i5 = i4 > 0 ? 1 : 0;
            int[] iArr = c20324.f65213;
            int i6 = c20324.f65214 + c20324.f65212;
            c5408 = new C5408(Arrays.copyOfRange(iArr, i6 - i4, i6), i5);
        }
        int i7 = c20324.f65212;
        int i8 = this.f65212 - i;
        if (i8 >= i7) {
            if (i8 <= i7) {
                int[] iArr2 = c20324.f65213;
                int i9 = this.f65214;
                int i10 = c20324.f65214;
                while (true) {
                    if (i9 < this.f65214 + i8) {
                        int i11 = this.f65213[i9] - Integer.MIN_VALUE;
                        int i12 = iArr2[i10] - Integer.MIN_VALUE;
                        if (i11 < i12) {
                            c20327 = c20327.m46678(c20328, c20325);
                            c20325.m46696();
                            c20326 = new C20324(c20325.m46695(!c20325.m46688() ? 1 : 0).m16116(c5408));
                        } else if (i11 <= i12) {
                            i9++;
                            i10++;
                        }
                    }
                }
            }
            if (i > c20325.f65213.length) {
                c20325.f65213 = new int[i];
            }
            Arrays.fill(c20325.f65213, -1);
            c20325.f65214 = 0;
            c20325.f65212 = i;
            c20327.m46683(c20328);
            c20328.m46681(i2);
            c20327.m46694(c20328);
            c20326 = new C20324(c5408);
            c20326.m46681(i2);
            c20326.m46694(new C20324(c5408));
        } else {
            c20327 = c20327.m46678(c20328, c20325);
            c20325.m46696();
            c20326 = new C20324(c20325.m46695(!c20325.m46688() ? 1 : 0).m16116(c5408));
        }
        c20327.m46681(i2);
        C20324 c20329 = new C20324(this);
        int i13 = c20329.f65214 + c20329.f65212;
        if (i13 >= i) {
            c20329.f65214 = i13 - i;
            c20329.f65212 = i;
        }
        c20329.m46696();
        c20327.m46683(c20329);
        while (c20327.m46689(c20326) < 0) {
            c20327.m46683(c20324);
            c20325.m46694(f65211);
        }
        c20327.m46694(c20326);
        return c20327;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20324 m46669(int i, int i2, int i3) {
        int i4 = i * i3;
        int i5 = this.f65212;
        if (i4 >= i5) {
            return new C20324();
        }
        int i6 = i == i2 + (-1) ? i5 : (i + 1) * i3;
        if (i6 > i5) {
            return new C20324();
        }
        int[] iArr = this.f65213;
        int i7 = this.f65214;
        return new C20324(Arrays.copyOfRange(iArr, (i7 + i5) - i6, (i7 + i5) - i4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46671(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
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
    public static long m46667(int i, long j) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20324 m46690(int i) {
        if (m46684()) {
            throw new RuntimeException();
        }
        if (i <= 64) {
            int[] iArr = this.f65213;
            int i2 = this.f65214;
            int i3 = this.f65212;
            int i4 = iArr[(i2 + i3) - 1];
            int iM55770 = C24966.m55770(i4, i4, 2, i4);
            int iM55771 = C24966.m55770(i4, iM55770, 2, iM55770);
            int iM55772 = C24966.m55770(i4, iM55771, 2, iM55771);
            int iM55773 = C24966.m55770(i4, iM55772, 2, iM55772);
            if (i < 33) {
                if (i != 32) {
                    iM55773 &= (1 << i) - 1;
                }
                return new C20324(iM55773);
            }
            int i5 = i2 + i3;
            long j = ((long) iArr[i5 - 1]) & 4294967295L;
            if (i3 > 1) {
                j |= ((long) iArr[i5 - 2]) << 32;
            }
            long j2 = ((long) iM55773) & 4294967295L;
            long j3 = (2 - (j * j2)) * j2;
            if (i != 64) {
                j3 &= (1 << i) - 1;
            }
            C20324 c20324 = new C20324(new int[]{(int) (j3 >>> 32), (int) j3});
            c20324.f65212 = 2;
            c20324.m46696();
            return c20324;
        }
        C20324 c20325 = new C20324(1);
        c20325.m46681(i);
        C20324 c20326 = new C20324(c20325);
        C20324 c20327 = new C20324(this);
        C20324 c20328 = new C20324();
        C20324 c20324M46680 = c20325.m46680(c20327, c20328);
        C20324 c20329 = new C20324(c20328);
        C20324 c203210 = new C20324(1);
        C20324 c203211 = new C20324();
        while (!c20324M46680.m46693()) {
            c20327 = c20327.m46680(c20324M46680, c20328);
            if (c20327.f65212 == 0) {
                throw new RuntimeException();
            }
            if (c20328.f65212 == 1) {
                c20329.m46692(c20328.f65213[c20328.f65214], c203211);
            } else {
                c20328.m46697(c20329, c203211);
            }
            c203210.m46683(c203211);
            if (c20327.m46693()) {
                return c203210;
            }
            c20324M46680 = c20324M46680.m46680(c20327, c203211);
            if (c20324M46680.f65212 == 0) {
                throw new RuntimeException();
            }
            if (c203211.f65212 == 1) {
                c203210.m46692(c203211.f65213[c203211.f65214], c20328);
            } else {
                c203211.m46697(c203210, c20328);
            }
            c20329.m46683(c20328);
        }
        c20326.m46694(c20329);
        return c20326;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C20324 m46677(C20324 c20324) {
        int iM46676;
        C20324 c20325 = new C20324(c20324);
        C20324 c20326 = new C20324(this);
        C20324 c20327 = new C20324(c20325);
        C6154 c6154 = new C6154(1);
        c6154.f20984 = 1;
        C6154 c6155 = new C6154();
        c6155.f20984 = 1;
        if (c20326.m46684()) {
            iM46676 = c20326.m46676();
            c20326.m46687(iM46676);
            c6155.m46681(iM46676);
        } else {
            iM46676 = 0;
        }
        while (!c20326.m46693()) {
            if (c20326.m46688()) {
                throw new RuntimeException();
            }
            if (c20326.m46689(c20327) < 0) {
                C20324 c20328 = c20327;
                c20327 = c20326;
                c20326 = c20328;
                C6154 c6156 = c6155;
                c6155 = c6154;
                c6154 = c6156;
            }
            if (((c20326.f65213[(c20326.f65214 + c20326.f65212) - 1] ^ c20327.f65213[(c20327.f65214 + c20327.f65212) - 1]) & 3) == 0) {
                c20326.m46694(c20327);
                int i = c6154.f20984;
                if (i == c6155.f20984) {
                    c6154.f20984 = i * c6154.m46694(c6155);
                } else {
                    c6154.m46683(c6155);
                }
            } else {
                c20326.m46683(c20327);
                int i2 = c6154.f20984;
                if (i2 == c6155.f20984) {
                    c6154.m46683(c6155);
                } else {
                    c6154.f20984 = i2 * c6154.m46694(c6155);
                }
            }
            int iM46677 = c20326.m46676();
            c20326.m46687(iM46677);
            c6155.m46681(iM46677);
            iM46676 += iM46677;
        }
        if (c6154.m46689(c20325) >= 0) {
            C20324 c20324M46680 = c6154.m46680(c20325, new C20324());
            int i3 = c20324M46680.f65212;
            if (c6154.f65213.length < i3) {
                c6154.f65213 = new int[i3];
            }
            System.arraycopy(c20324M46680.f65213, c20324M46680.f65214, c6154.f65213, 0, i3);
            c6154.f65212 = i3;
            c6154.f65214 = 0;
        }
        int i4 = c6154.f20984;
        if (i4 < 0) {
            if (i4 == 1) {
                c6154.m46683(c20325);
            } else {
                c6154.f20984 = i4 * c6154.m46694(c20325);
            }
        }
        return m46670(c6154, c20325, iM46676);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20324 m46670(C20324 c20324, C20324 c20325, int i) {
        C20324 c20326 = new C20324();
        int i2 = c20325.f65213[(c20325.f65214 + c20325.f65212) - 1];
        int iM55770 = C24966.m55770(i2, i2, 2, i2);
        int iM55771 = C24966.m55770(i2, iM55770, 2, iM55770);
        int iM55772 = C24966.m55770(i2, iM55771, 2, iM55771);
        int i3 = -C24966.m55770(i2, iM55772, 2, iM55772);
        int i4 = i >> 5;
        for (int i5 = 0; i5 < i4; i5++) {
            c20325.m46692(c20324.f65213[(c20324.f65214 + c20324.f65212) - 1] * i3, c20326);
            c20324.m46683(c20326);
            c20324.f65212--;
        }
        int i6 = i & 31;
        if (i6 != 0) {
            c20325.m46692((i3 * c20324.f65213[(c20324.f65214 + c20324.f65212) - 1]) & ((1 << i6) - 1), c20326);
            c20324.m46683(c20326);
            c20324.m46687(i6);
        }
        return c20324.m46689(c20325) >= 0 ? c20324.m46680(c20325, new C20324()) : c20324;
    }
}
