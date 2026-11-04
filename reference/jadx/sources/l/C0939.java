package l;

import java.util.Arrays;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.֨ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FIQP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f3462 = new int[256];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f3463;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f3464;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[][] f3465;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f3466;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f3467;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3759(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, boolean z) {
        int iMax = z ? Math.max(0, i2 - 256) : i4;
        if (z) {
            i4 = Math.min(i4, i2 + 256);
        }
        if (iMax <= i4) {
            int[] iArr = this.f3462;
            Arrays.fill(iArr, 0);
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = bArr[i + i5] & 255;
                iArr[i6] = iArr[i6] + 1;
            }
            for (int i7 = 0; i7 < iMax; i7++) {
                int i8 = bArr2[i3 + i7] & 255;
                iArr[i8] = iArr[i8] - 1;
            }
            int iAbs = 0;
            for (int i9 : iArr) {
                iAbs += Math.abs(i9);
            }
            if (iAbs > 256) {
                while (iMax < i4) {
                    int i10 = bArr2[i3 + iMax] & 255;
                    int i11 = iArr[i10];
                    iArr[i10] = i11 - 1;
                    iAbs += i11 > 0 ? -1 : 1;
                    if (iAbs > 256) {
                        iMax++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3760(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, boolean z, BooleanSupplier booleanSupplier) throws C9446 {
        C13616.m33366(booleanSupplier);
        if (i2 + i4 > 770) {
            int iMax = z ? Math.max(0, i2 - 256) : i4;
            if (z) {
                i4 = Math.min(i4, i2 + 256);
            }
            if (iMax <= i4) {
                int[] iArr = this.f3467;
                if (iArr == null) {
                    this.f3467 = new int[1024];
                } else {
                    Arrays.fill(iArr, 0);
                }
                for (int i5 = 1; i5 < i2; i5++) {
                    if ((i5 & 1023) == 0) {
                        C13616.m33366(booleanSupplier);
                    }
                    int[] iArr2 = this.f3467;
                    int iM3751 = m3751(i + i5, bArr);
                    iArr2[iM3751] = iArr2[iM3751] + 1;
                }
                for (int i6 = 1; i6 < iMax; i6++) {
                    if ((i6 & 1023) == 0) {
                        C13616.m33366(booleanSupplier);
                    }
                    int[] iArr3 = this.f3467;
                    int iM3752 = m3751(i3 + i6, bArr2);
                    iArr3[iM3752] = iArr3[iM3752] - 1;
                }
                int iAbs = 0;
                for (int i7 : this.f3467) {
                    iAbs += Math.abs(i7);
                }
                if (iAbs > 768) {
                    while (iMax < i4) {
                        if ((iMax & 1023) == 0) {
                            C13616.m33366(booleanSupplier);
                        }
                        if (iMax > 0) {
                            int[] iArr4 = this.f3467;
                            int iM3753 = m3751(i3 + iMax, bArr2);
                            int i8 = iArr4[iM3753];
                            iArr4[iM3753] = i8 - 1;
                            iAbs += i8 > 0 ? -1 : 1;
                        }
                        if (iAbs > 768) {
                            iMax++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3751(int i, byte[] bArr) {
        int i2 = (bArr[i] & 255) | ((bArr[i - 1] & 255) << 8);
        return (i2 ^ (i2 >>> 6)) & 1023;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3758() {
        int[] iArr = this.f3464;
        if (iArr == null) {
            this.f3464 = new int[515];
            this.f3465 = new int[256][];
        } else {
            Arrays.fill(iArr, 0);
        }
    }
}
