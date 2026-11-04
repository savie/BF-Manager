package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes.dex */
public final class C24766 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f80150;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC19544 f80151;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f80152;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f80153;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f80154;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f80155;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f80156;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12831[] f80157;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f80158;

    public C24766(C1645 c1645, EnumC19544 enumC19544) {
        this.f80154 = c1645.f5716;
        int[] iArrCopyOf = Arrays.copyOf(c1645.f5715, c1645.f5714);
        this.f80156 = iArrCopyOf;
        this.f80157 = (C12831[]) Arrays.copyOf(c1645.f5713, c1645.f5714);
        this.f80151 = enumC19544;
        int[] iArrCopyOf2 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length + 1);
        iArrCopyOf2[iArrCopyOf.length] = 0;
        Arrays.sort(iArrCopyOf2);
        int i = 0;
        for (int i2 : iArrCopyOf2) {
            if (i == 0 || iArrCopyOf2[i - 1] != i2) {
                iArrCopyOf2[i] = i2;
                i++;
            }
        }
        this.f80153 = Arrays.copyOf(iArrCopyOf2, i);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (C12831 c12831 : this.f80157) {
            i3 = c12831.m31848() != -1 ? i3 + 1 : i3;
            i4 = c12831.m31860() ? i4 + 1 : i4;
            if (c12831.m31854() != EnumC19544.COMPLETE) {
                i5++;
            }
        }
        long[] jArr = new long[i3];
        this.f80158 = new int[i4];
        this.f80152 = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            C12831[] c12831Arr = this.f80157;
            if (i6 >= c12831Arr.length) {
                break;
            }
            C12831 c12832 = c12831Arr[i6];
            if (c12832.m31848() != -1) {
                jArr[i7] = (((long) Math.min(this.f80156[i6], this.f80157[i6].m31848())) << 32) | (((long) i6) & 4294967295L);
                i7++;
            }
            if (c12832.m31860()) {
                this.f80158[i8] = i6;
                i8++;
            }
            if (c12832.m31854() != EnumC19544.COMPLETE) {
                this.f80152[i9] = i6;
                i9++;
            }
            i6++;
        }
        Arrays.sort(jArr);
        this.f80150 = new int[i7];
        this.f80155 = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            this.f80150[i10] = (int) jArr[i10];
        }
        m55269(0, i7);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m55269(int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = (i + i2) >>> 1;
        int i4 = this.f80150[i3];
        int iMax = Math.max(Math.max(Math.max(this.f80156[i4], this.f80157[i4].m31853()), m55269(i, i3)), m55269(i3 + 1, i2));
        this.f80155[i3] = iMax;
        return iMax;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m55277(C24766 c24766, int i) {
        return Math.min(c24766.f80156[i], c24766.f80157[i].m31848());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m55270(C24766 c24766, int i) {
        return Math.max(c24766.f80156[i], c24766.f80157[i].m31853());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m55283() {
        return this.f80154;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55280() {
        return this.f80157.length;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m55285(int i) {
        return this.f80156[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12831 m55284(int i) {
        return this.f80157[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m55282(int i) {
        C17359.checkFromToIndex(i, i, this.f80154);
        int[] iArr = this.f80153;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return iArr[iBinarySearch];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55281(int i) {
        C17359.checkFromToIndex(i, i, this.f80154);
        int[] iArr = this.f80153;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        if (iBinarySearch < iArr.length) {
            return iArr[iBinarySearch];
        }
        return -1;
    }
}
