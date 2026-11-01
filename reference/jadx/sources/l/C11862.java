package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11862 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int[] f39794 = new int[0];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C0571[] f39795 = new C0571[0];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f39796;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f39797;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0571[] f39798;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1900 f39799;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0571[] f39800;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f39801;

    public /* synthetic */ C11862(C1900 c1900, int i, int[] iArr, C0571[] c0571Arr, int[] iArr2, C0571[] c0571Arr2, int i2) {
        this(c1900, i, iArr, c0571Arr, iArr2, c0571Arr2);
    }

    public C11862(C1900 c1900, int i, int[] iArr, C0571[] c0571Arr, int[] iArr2, C0571[] c0571Arr2) {
        C13638.requireNonNull(c1900, "program");
        this.f39799 = c1900;
        C13638.requireNonNull(iArr, "offsets");
        this.f39797 = iArr;
        C13638.requireNonNull(c0571Arr, "prefixes");
        this.f39800 = c0571Arr;
        this.f39796 = iArr2;
        this.f39798 = c0571Arr2;
        if (i < 0 || iArr.length > 1024 || c0571Arr.length != iArr.length || iArr2.length != iArr.length || c0571Arr2.length != iArr.length) {
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
        this.f39801 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C11862 m29559(C1900 c1900, int i) {
        int[] iArr = f39794;
        C0571[] c0571Arr = f39795;
        return new C11862(c1900, i, iArr, c0571Arr, iArr, c0571Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1900 m29565() {
        return this.f39799;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m29568() {
        return this.f39801;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29562(C1900 c1900, int i) {
        C13638.requireNonNull(c1900, "expectedProgram");
        if (this.f39799 != c1900) {
            return -1;
        }
        C13638.checkFromToIndex(i, i, this.f39801);
        int[] iArr = this.f39797;
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
    public final C0571 m29564(int i) {
        C0571 c0571;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f39797;
            if (i2 >= iArr.length) {
                return null;
            }
            if (iArr[i2] >= i && (c0571 = this.f39800[i2]) != null) {
                return c0571;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11862 m29567(C21033 c21033) {
        int iM47422 = c21033.m47422();
        int iM47426 = this.f39801;
        if (iM47422 != iM47426) {
            throw new IllegalArgumentException("Restart index and edit lengths differ");
        }
        int[] iArr = this.f39797;
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        C0571[] c0571Arr = new C0571[iArr.length];
        C0571[] c0571Arr2 = new C0571[iArr.length];
        if (!c21033.m47425()) {
            iM47426 = c21033.m47426();
        }
        int i = 0;
        for (int i2 = 0; i2 < iArr.length && iArr[i2] < iM47426; i2++) {
            C0571 c0571 = this.f39800[i2];
            if (c0571 != null && c0571.m2689() == EnumC16095.COMPLETE && !c0571.m2687(c21033)) {
                try {
                    c0571Arr2[i] = c0571.m2692(c21033);
                    iArr3[i] = this.f39796[i2];
                    C0571 c0572 = this.f39798[i2];
                    if (c0572 != null) {
                        try {
                            c0571Arr[i] = c0572.m2692(c21033);
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
        return new C11862(this.f39799, c21033.m47416(), Arrays.copyOf(iArr2, i), (C0571[]) Arrays.copyOf(c0571Arr2, i), Arrays.copyOf(iArr3, i), (C0571[]) Arrays.copyOf(c0571Arr, i));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m29569(C21033 c21033) {
        if (c21033.m47425()) {
            return false;
        }
        int[] iArr = this.f39797;
        return iArr.length != 0 && iArr[iArr.length - 1] > c21033.m47417(c21033.m47429() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29563(C21033 c21033, int i) {
        int iM47419;
        int iBinarySearch;
        if (c21033.m47425() || i <= c21033.m47427(c21033.m47429() - 1) || (iBinarySearch = Arrays.binarySearch(this.f39797, (iM47419 = c21033.m47419(i, EnumC10451.AFTER)))) < 0 || iM47419 <= c21033.m47417(c21033.m47429() - 1)) {
            return -1;
        }
        return iBinarySearch;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4805 m29566(C21033 c21033, int i, C11862 c11862, C0571 c0571, int i2, C0571 c0572) {
        C0571 c0573;
        int[] iArr;
        int i3;
        int[] iArr2 = this.f39797;
        int i4 = iArr2[i];
        C13979 c13979 = new C13979(this.f39799, c21033.m47416(), 0, c11862);
        C20328 c20328 = new C20328(c21033.m47416());
        c20328.m45884(c0571);
        c13979.m33822(c21033.m47428(i4, EnumC10451.AFTER), c0571, i2, c0572);
        int i5 = i4;
        for (int i6 = i + 1; i6 < iArr2.length && (c0573 = this.f39798[i6]) != null && (i3 = (iArr = this.f39796)[i6]) >= i4 && i3 <= i5; i6++) {
            try {
                C0571 c0571M2685 = c0573.m2685(c21033, i3);
                int i7 = iArr[i6];
                EnumC10451 enumC10451 = EnumC10451.AFTER;
                int iM47428 = c21033.m47428(i7, enumC10451);
                int iM47429 = c21033.m47428(iArr2[i6], enumC10451);
                c20328.m45884(c0571M2685);
                c13979.m33822(iM47429, c20328.m45887(), iM47428, c0571M2685);
                i5 = iArr2[i6];
            } catch (IllegalArgumentException unused) {
            }
        }
        return new C4805(c13979.m33826(), i4, i5);
    }
}
