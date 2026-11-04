package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J703 */
/* JADX INFO: loaded from: classes.dex */
public final class C22528 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f72868;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f72869;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f72870;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f72871;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f72872;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f72873;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f72874;

    public C22528(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z) {
        this.f72871 = i;
        this.f72869 = i2;
        this.f72870 = iArr;
        this.f72872 = iArr2;
        this.f72874 = iArr3;
        this.f72873 = iArr4;
        this.f72868 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22528 m50752(int i, C10593... c10593Arr) {
        int i2;
        C10593[] c10593Arr2 = c10593Arr;
        if (i < 0) {
            throw new IllegalArgumentException("Old length must not be negative");
        }
        C17359.requireNonNull(c10593Arr2, "edits");
        long j = i;
        int i3 = 0;
        int i4 = -1;
        boolean z = false;
        for (C10593 c10593 : c10593Arr2) {
            m50753(c10593, i);
            if (c10593.f33625 != c10593.f33626 || c10593.f33624 != 0) {
                if (c10593.f33625 < i4) {
                    throw new IllegalArgumentException("Edits must be ordered and non-overlapping");
                }
                if (c10593.f33625 != i4) {
                    i3++;
                }
                i4 = c10593.f33626;
                long j2 = (((long) c10593.f33624) - ((long) (c10593.f33626 - c10593.f33625))) + j;
                z = (c10593.f33626 == i) | z;
                j = j2;
            }
        }
        long j3 = 0;
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("New length exceeds the supported range");
        }
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int length = c10593Arr2.length;
        int i5 = 0;
        int i6 = -1;
        while (i5 < length) {
            C10593 c10594 = c10593Arr2[i5];
            if (c10594.f33625 == c10594.f33626 && c10594.f33624 == 0) {
                i2 = length;
            } else {
                long j4 = ((long) c10594.f33625) + j3;
                long j5 = ((long) c10594.f33624) + j4;
                if (i6 >= 0) {
                    i2 = length;
                    if (iArr2[i6] == c10594.f33625) {
                        iArr2[i6] = c10594.f33626;
                        iArr4[i6] = (int) j5;
                    }
                    j3 = (((long) c10594.f33624) - ((long) (c10594.f33626 - c10594.f33625))) + j3;
                } else {
                    i2 = length;
                }
                i6++;
                iArr[i6] = c10594.f33625;
                iArr2[i6] = c10594.f33626;
                iArr3[i6] = (int) j4;
                iArr4[i6] = (int) j5;
                j3 = (((long) c10594.f33624) - ((long) (c10594.f33626 - c10594.f33625))) + j3;
            }
            i5++;
            c10593Arr2 = c10593Arr;
            z = z;
            j = j;
            length = i2;
        }
        long j6 = j;
        boolean z2 = z;
        for (int i7 = 0; i7 < i3 && !z2; i7++) {
            z2 = iArr2[i7] - iArr[i7] != iArr4[i7] - iArr3[i7];
        }
        return new C22528(i, (int) j6, iArr, iArr2, iArr3, iArr4, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22528 m50757(C10593 c10593) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int iM50756;
        int iM50757;
        int i = this.f72869;
        m50753(c10593, i);
        if ((((long) i) + ((long) c10593.f33624)) - ((long) (c10593.f33626 - c10593.f33625)) > 2147483647L) {
            throw new IllegalArgumentException("New length exceeds the supported range");
        }
        if (c10593.f33625 == c10593.f33626 && c10593.f33624 == 0) {
            return m50754();
        }
        int i2 = 0;
        while (true) {
            iArr = this.f72870;
            int length = iArr.length;
            iArr2 = this.f72873;
            if (i2 >= length || iArr2[i2] >= c10593.f33625) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        while (true) {
            int length2 = iArr.length;
            iArr3 = this.f72874;
            if (i3 >= length2 || iArr3[i3] > c10593.f33626) {
                break;
            }
            i3++;
        }
        int iMin = c10593.f33625;
        int iMax = c10593.f33626;
        int[] iArr4 = this.f72872;
        if (i2 < i3) {
            iMin = Math.min(iMin, iArr3[i2]);
            int i4 = i3 - 1;
            iMax = Math.max(iMax, iArr2[i4]);
            iM50756 = Math.min(iArr[i2], m50756(iMin, EnumC21782.BEFORE));
            iM50757 = Math.max(iArr4[i4], m50756(iMax, EnumC21782.AFTER));
        } else {
            iM50756 = m50756(iMin, EnumC21782.BEFORE);
            iM50757 = m50756(iMax, EnumC21782.AFTER);
        }
        long j = ((((long) iMax) - ((long) iMin)) - ((long) (c10593.f33626 - c10593.f33625))) + ((long) c10593.f33624);
        int i5 = (int) j;
        if (j != i5) {
            throw new ArithmeticException();
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        for (int i6 = 0; i6 < i2; i6++) {
            arrayList.add(new C10593(iArr[i6], iArr4[i6], iArr2[i6] - iArr3[i6]));
        }
        arrayList.add(new C10593(iM50756, iM50757, i5));
        while (i3 < iArr.length) {
            arrayList.add(new C10593(iArr[i3], iArr4[i3], iArr2[i3] - iArr3[i3]));
            i3++;
        }
        return m50752(this.f72871, (C10593[]) arrayList.toArray(new C10593[0])).m50754();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m50762() {
        return this.f72871;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m50767() {
        return this.f72869;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C22528 m50754() {
        int[] iArr = this.f72870;
        if (iArr.length <= 64) {
            return this;
        }
        int length = iArr.length - 1;
        return m50752(this.f72871, new C10593(iArr[0], this.f72872[length], this.f72873[length] - this.f72874[0]));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m50761() {
        return this.f72870.length;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m50760() {
        return this.f72870.length == 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m50764() {
        int[] iArr = this.f72870;
        if (iArr.length == 0) {
            return -1;
        }
        return iArr[0];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m50763(int i) {
        return this.f72870[i];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m50768(int i) {
        return this.f72872[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50755(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f72872, i);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m50759(int i) {
        return this.f72874[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m50765(int i) {
        return this.f72873[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m50766(int i, EnumC21782 enumC21782) {
        return m50751(i, enumC21782, this.f72871, this.f72870, this.f72872, this.f72874, this.f72873);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50756(int i, EnumC21782 enumC21782) {
        return m50751(i, enumC21782, this.f72869, this.f72874, this.f72873, this.f72870, this.f72872);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50758() {
        return this.f72868;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50753(C10593 c10593, int i) {
        C17359.requireNonNull(c10593, "edit");
        if (c10593.f33625 < 0 || c10593.f33626 < c10593.f33625 || c10593.f33626 > i) {
            throw new IllegalArgumentException("Edit range is outside the old document");
        }
        if (c10593.f33624 < 0) {
            throw new IllegalArgumentException("Replacement length must not be negative");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50751(int i, EnumC21782 enumC21782, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        C17359.requireNonNull(enumC21782, "affinity");
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C13645.m33382(i, "Offset outside document: "));
        }
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch >= 0) {
            return (iArr[iBinarySearch] == iArr2[iBinarySearch] && enumC21782 == EnumC21782.AFTER) ? iArr4[iBinarySearch] : iArr3[iBinarySearch];
        }
        int i3 = (-iBinarySearch) - 2;
        if (i3 < 0) {
            return i;
        }
        int i4 = iArr2[i3];
        if (i < i4) {
            return -1;
        }
        return (i - i4) + iArr4[i3];
    }
}
