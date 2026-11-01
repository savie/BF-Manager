package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes2.dex */
public final class C6216 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f21112;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f21113;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int[] f21114;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC16095 f21115;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f21116;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f21117;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] f21118;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0571[] f21119;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f21120;

    public C6216(C12567 c12567, EnumC16095 enumC16095) {
        this.f21112 = c12567.f42027;
        int[] iArrCopyOf = Arrays.copyOf(c12567.f42030, c12567.f42029);
        this.f21116 = iArrCopyOf;
        this.f21119 = (C0571[]) Arrays.copyOf(c12567.f42028, c12567.f42029);
        this.f21115 = enumC16095;
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
        this.f21117 = Arrays.copyOf(iArrCopyOf2, i);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (C0571 c0571 : this.f21119) {
            i3 = c0571.m2683() != -1 ? i3 + 1 : i3;
            i4 = c0571.m2682() ? i4 + 1 : i4;
            if (c0571.m2689() != EnumC16095.COMPLETE) {
                i5++;
            }
        }
        long[] jArr = new long[i3];
        this.f21113 = new int[i4];
        this.f21118 = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            C0571[] c0571Arr = this.f21119;
            if (i6 >= c0571Arr.length) {
                break;
            }
            C0571 c0572 = c0571Arr[i6];
            if (c0572.m2683() != -1) {
                jArr[i7] = (((long) Math.min(this.f21116[i6], this.f21119[i6].m2683())) << 32) | (((long) i6) & 4294967295L);
                i7++;
            }
            if (c0572.m2682()) {
                this.f21113[i8] = i6;
                i8++;
            }
            if (c0572.m2689() != EnumC16095.COMPLETE) {
                this.f21118[i9] = i6;
                i9++;
            }
            i6++;
        }
        Arrays.sort(jArr);
        this.f21114 = new int[i7];
        this.f21120 = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            this.f21114[i10] = (int) jArr[i10];
        }
        m17221(0, i7);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m17221(int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = (i + i2) >>> 1;
        int i4 = this.f21114[i3];
        int iMax = Math.max(Math.max(Math.max(this.f21116[i4], this.f21119[i4].m2690()), m17221(i, i3)), m17221(i3 + 1, i2));
        this.f21120[i3] = iMax;
        return iMax;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m17227(C6216 c6216, int i) {
        return Math.min(c6216.f21116[i], c6216.f21119[i].m2683());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m17222(C6216 c6216, int i) {
        return Math.max(c6216.f21116[i], c6216.f21119[i].m2690());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m17234() {
        return this.f21112;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17231() {
        return this.f21119.length;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m17230(int i) {
        return this.f21116[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0571 m17235(int i) {
        return this.f21119[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m17233(int i) {
        C13638.checkFromToIndex(i, i, this.f21112);
        int[] iArr = this.f21117;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return iArr[iBinarySearch];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17232(int i) {
        C13638.checkFromToIndex(i, i, this.f21112);
        int[] iArr = this.f21117;
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
