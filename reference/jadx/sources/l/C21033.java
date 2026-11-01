package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J703 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21033 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f68502;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f68503;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f68504;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f68505;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f68506;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f68507;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f68508;

    public C21033(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z) {
        this.f68508 = i;
        this.f68506 = i2;
        this.f68502 = iArr;
        this.f68505 = iArr2;
        this.f68503 = iArr3;
        this.f68507 = iArr4;
        this.f68504 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21033 m47414(int i, C7628... c7628Arr) {
        int i2;
        C7628[] c7628Arr2 = c7628Arr;
        if (i < 0) {
            throw new IllegalArgumentException("Old length must not be negative");
        }
        C13638.requireNonNull(c7628Arr2, "edits");
        long j = i;
        int i3 = 0;
        int i4 = -1;
        boolean z = false;
        for (C7628 c7628 : c7628Arr2) {
            m47415(c7628, i);
            if (c7628.f25186 != c7628.f25187 || c7628.f25185 != 0) {
                if (c7628.f25186 < i4) {
                    throw new IllegalArgumentException("Edits must be ordered and non-overlapping");
                }
                if (c7628.f25186 != i4) {
                    i3++;
                }
                i4 = c7628.f25187;
                long j2 = (((long) c7628.f25185) - ((long) (c7628.f25187 - c7628.f25186))) + j;
                z = (c7628.f25187 == i) | z;
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
        int length = c7628Arr2.length;
        int i5 = 0;
        int i6 = -1;
        while (i5 < length) {
            C7628 c7629 = c7628Arr2[i5];
            if (c7629.f25186 == c7629.f25187 && c7629.f25185 == 0) {
                i2 = length;
            } else {
                long j4 = ((long) c7629.f25186) + j3;
                long j5 = ((long) c7629.f25185) + j4;
                if (i6 >= 0) {
                    i2 = length;
                    if (iArr2[i6] == c7629.f25186) {
                        iArr2[i6] = c7629.f25187;
                        iArr4[i6] = (int) j5;
                    }
                    j3 = (((long) c7629.f25185) - ((long) (c7629.f25187 - c7629.f25186))) + j3;
                } else {
                    i2 = length;
                }
                i6++;
                iArr[i6] = c7629.f25186;
                iArr2[i6] = c7629.f25187;
                iArr3[i6] = (int) j4;
                iArr4[i6] = (int) j5;
                j3 = (((long) c7629.f25185) - ((long) (c7629.f25187 - c7629.f25186))) + j3;
            }
            i5++;
            c7628Arr2 = c7628Arr;
            z = z;
            j = j;
            length = i2;
        }
        long j6 = j;
        boolean z2 = z;
        for (int i7 = 0; i7 < i3 && !z2; i7++) {
            z2 = iArr2[i7] - iArr[i7] != iArr4[i7] - iArr3[i7];
        }
        return new C21033(i, (int) j6, iArr, iArr2, iArr3, iArr4, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21033 m47420(C7628 c7628) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int iM47419;
        int iM474110;
        int i = this.f68506;
        m47415(c7628, i);
        if ((((long) i) + ((long) c7628.f25185)) - ((long) (c7628.f25187 - c7628.f25186)) > 2147483647L) {
            throw new IllegalArgumentException("New length exceeds the supported range");
        }
        if (c7628.f25186 == c7628.f25187 && c7628.f25185 == 0) {
            return m47412();
        }
        int i2 = 0;
        while (true) {
            iArr = this.f68502;
            int length = iArr.length;
            iArr2 = this.f68507;
            if (i2 >= length || iArr2[i2] >= c7628.f25186) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        while (true) {
            int length2 = iArr.length;
            iArr3 = this.f68503;
            if (i3 >= length2 || iArr3[i3] > c7628.f25187) {
                break;
            }
            i3++;
        }
        int iMin = c7628.f25186;
        int iMax = c7628.f25187;
        int[] iArr4 = this.f68505;
        if (i2 < i3) {
            iMin = Math.min(iMin, iArr3[i2]);
            int i4 = i3 - 1;
            iMax = Math.max(iMax, iArr2[i4]);
            iM47419 = Math.min(iArr[i2], m47419(iMin, EnumC10451.BEFORE));
            iM474110 = Math.max(iArr4[i4], m47419(iMax, EnumC10451.AFTER));
        } else {
            iM47419 = m47419(iMin, EnumC10451.BEFORE);
            iM474110 = m47419(iMax, EnumC10451.AFTER);
        }
        long j = ((((long) iMax) - ((long) iMin)) - ((long) (c7628.f25187 - c7628.f25186))) + ((long) c7628.f25185);
        int i5 = (int) j;
        if (j != i5) {
            throw new ArithmeticException();
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        for (int i6 = 0; i6 < i2; i6++) {
            arrayList.add(new C7628(iArr[i6], iArr4[i6], iArr2[i6] - iArr3[i6]));
        }
        arrayList.add(new C7628(iM47419, iM474110, i5));
        while (i3 < iArr.length) {
            arrayList.add(new C7628(iArr[i3], iArr4[i3], iArr2[i3] - iArr3[i3]));
            i3++;
        }
        return m47414(this.f68508, (C7628[]) arrayList.toArray(new C7628[0])).m47412();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m47422() {
        return this.f68508;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m47416() {
        return this.f68506;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C21033 m47412() {
        int[] iArr = this.f68502;
        if (iArr.length <= 64) {
            return this;
        }
        int length = iArr.length - 1;
        return m47414(this.f68508, new C7628(iArr[0], this.f68505[length], this.f68507[length] - this.f68503[0]));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m47429() {
        return this.f68502.length;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m47425() {
        return this.f68502.length == 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m47426() {
        int[] iArr = this.f68502;
        if (iArr.length == 0) {
            return -1;
        }
        return iArr[0];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m47423(int i) {
        return this.f68502[i];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m47417(int i) {
        return this.f68505[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47418(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f68505, i);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m47424(int i) {
        return this.f68503[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m47427(int i) {
        return this.f68507[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m47428(int i, EnumC10451 enumC10451) {
        return m47413(i, enumC10451, this.f68508, this.f68502, this.f68505, this.f68503, this.f68507);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47419(int i, EnumC10451 enumC10451) {
        return m47413(i, enumC10451, this.f68506, this.f68503, this.f68507, this.f68502, this.f68505);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47421() {
        return this.f68504;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47415(C7628 c7628, int i) {
        C13638.requireNonNull(c7628, "edit");
        if (c7628.f25186 < 0 || c7628.f25187 < c7628.f25186 || c7628.f25187 > i) {
            throw new IllegalArgumentException("Edit range is outside the old document");
        }
        if (c7628.f25185 < 0) {
            throw new IllegalArgumentException("Replacement length must not be negative");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47413(int i, EnumC10451 enumC10451, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        C13638.requireNonNull(enumC10451, "affinity");
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "Offset outside document: "));
        }
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch >= 0) {
            return (iArr[iBinarySearch] == iArr2[iBinarySearch] && enumC10451 == EnumC10451.AFTER) ? iArr4[iBinarySearch] : iArr3[iBinarySearch];
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
