package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14913 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f48699;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20661 f48700;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f48701;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12831[] f48702;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12831[] f48703;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f48704;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int[] f48698 = new int[0];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C12831[] f48697 = new C12831[0];

    public /* synthetic */ C14913(C20661 c20661, int i, int[] iArr, C12831[] c12831Arr, int[] iArr2, C12831[] c12831Arr2, int i2) {
        this(c20661, i, iArr, c12831Arr, iArr2, c12831Arr2);
    }

    public C14913(C20661 c20661, int i, int[] iArr, C12831[] c12831Arr, int[] iArr2, C12831[] c12831Arr2) {
        C17359.requireNonNull(c20661, "program");
        this.f48700 = c20661;
        C17359.requireNonNull(iArr, "offsets");
        this.f48699 = iArr;
        C17359.requireNonNull(c12831Arr, "prefixes");
        this.f48703 = c12831Arr;
        this.f48704 = iArr2;
        this.f48702 = c12831Arr2;
        if (i < 0 || iArr.length > 1024 || c12831Arr.length != iArr.length || iArr2.length != iArr.length || c12831Arr2.length != iArr.length) {
            throw new IllegalArgumentException("Invalid syntax window restart index");
        }
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            if (i4 <= i3 || i4 >= i) {
                throw new IllegalArgumentException("Invalid syntax window restart offset");
            }
            i2++;
            i3 = i4;
        }
        this.f48701 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14913 m35875(C20661 c20661, int i) {
        int[] iArr = f48698;
        C12831[] c12831Arr = f48697;
        return new C14913(c20661, i, iArr, c12831Arr, iArr, c12831Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20661 m35882() {
        return this.f48700;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m35884() {
        return this.f48701;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35878(C20661 c20661, int i) {
        C17359.requireNonNull(c20661, "expectedProgram");
        if (this.f48700 != c20661) {
            return -1;
        }
        C17359.checkFromToIndex(i, i, this.f48701);
        int[] iArr = this.f48699;
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            if (iArr[i3] <= i) {
                i2 = i3 + 1;
            } else {
                length = i3 - 1;
            }
        }
        if (length < 0) {
            return -1;
        }
        return iArr[length];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12831 m35880(int i) {
        C12831 c12831;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f48699;
            if (i2 >= iArr.length) {
                return null;
            }
            if (iArr[i2] >= i && (c12831 = this.f48703[i2]) != null) {
                return c12831;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14913 m35881(C22528 c22528) {
        int iM50762 = c22528.m50762();
        int iM50764 = this.f48701;
        if (iM50762 != iM50764) {
            throw new IllegalArgumentException("Restart index and edit lengths differ");
        }
        int[] iArr = this.f48699;
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        C12831[] c12831Arr = new C12831[iArr.length];
        C12831[] c12831Arr2 = new C12831[iArr.length];
        if (!c22528.m50760()) {
            iM50764 = c22528.m50764();
        }
        int i = 0;
        for (int i2 = 0; i2 < iArr.length && iArr[i2] < iM50764; i2++) {
            C12831 c12831 = this.f48703[i2];
            if (c12831 != null && c12831.m31854() == EnumC19544.COMPLETE && !c12831.m31852(c22528)) {
                try {
                    c12831Arr2[i] = c12831.m31859(c22528);
                    iArr3[i] = this.f48704[i2];
                    C12831 c12832 = this.f48702[i2];
                    if (c12832 != null) {
                        try {
                            c12831Arr[i] = c12832.m31859(c22528);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    int i3 = i + 1;
                    try {
                        iArr2[i] = iArr[i2];
                    } catch (IllegalArgumentException unused2) {
                    }
                    i = i3;
                } catch (IllegalArgumentException unused3) {
                }
            }
        }
        return new C14913(this.f48700, c22528.m50767(), Arrays.copyOf(iArr2, i), (C12831[]) Arrays.copyOf(c12831Arr2, i), Arrays.copyOf(iArr3, i), (C12831[]) Arrays.copyOf(c12831Arr, i));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35885(C22528 c22528) {
        if (c22528.m50760()) {
            return false;
        }
        int[] iArr = this.f48699;
        return iArr.length != 0 && iArr[iArr.length - 1] > c22528.m50768(c22528.m50761() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35879(C22528 c22528, int i) {
        int iM50756;
        int iBinarySearch;
        if (c22528.m50760() || i <= c22528.m50765(c22528.m50761() - 1) || (iBinarySearch = Arrays.binarySearch(this.f48699, (iM50756 = c22528.m50756(i, EnumC21782.AFTER)))) < 0 || iM50756 <= c22528.m50768(c22528.m50761() - 1)) {
            return -1;
        }
        return iBinarySearch;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24611 m35883(C22528 c22528, int i, C14913 c14913, C12831 c12831, int i2, C12831 c12832) {
        C12831 c12833;
        int[] iArr;
        int i3;
        int[] iArr2 = this.f48699;
        int i4 = iArr2[i];
        C4473 c4473 = new C4473(this.f48700, c22528.m50767(), 0, c14913);
        C15068 c15068 = new C15068(c22528.m50767());
        c15068.m36324(c12831);
        c4473.m14174(c22528.m50766(i4, EnumC21782.AFTER), c12831, i2, c12832);
        int i5 = i4;
        for (int i6 = i + 1; i6 < iArr2.length && (c12833 = this.f48702[i6]) != null && (i3 = (iArr = this.f48704)[i6]) >= i4 && i3 <= i5; i6++) {
            try {
                C12831 c12831M31850 = c12833.m31850(c22528, i3);
                int i7 = iArr[i6];
                EnumC21782 enumC21782 = EnumC21782.AFTER;
                int iM50766 = c22528.m50766(i7, enumC21782);
                int iM50767 = c22528.m50766(iArr2[i6], enumC21782);
                c15068.m36324(c12831M31850);
                c4473.m14174(iM50767, c15068.m36327(), iM50766, c12831M31850);
                i5 = iArr2[i6];
            } catch (IllegalArgumentException unused) {
            }
        }
        return new C24611(c4473.m14178(), i4, i5);
    }
}
