package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6ZU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20881 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C20881 f66829 = new C20881(new int[0]);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f66830;

    public C20881(int[] iArr) {
        this.f66830 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20881 m47716(C20881 c20881, int i, int i2) {
        C17359.requireNonNull(c20881, "old");
        return c20881.m47714(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20881 m47720(C20881 c20881) {
        int i;
        int[] iArr;
        C17359.requireNonNull(c20881, "other");
        int[] iArr2 = c20881.f66830;
        int[] iArr3 = this.f66830;
        if (iArr3.length == 0) {
            return c20881;
        }
        if (iArr2.length == 0) {
            return this;
        }
        long length = ((long) iArr3.length) + ((long) iArr2.length);
        int i2 = (int) length;
        if (length != i2) {
            throw new ArithmeticException();
        }
        int[] iArr4 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        int iM47713 = 0;
        while (true) {
            if (i3 >= iArr3.length && i4 >= iArr2.length) {
                return m47715(iM47713, iArr4);
            }
            if (i4 >= iArr2.length || (i3 < iArr3.length && iArr3[i3] <= iArr2[i4])) {
                i = i3 + 2;
                iArr = iArr3;
            } else {
                iArr = iArr2;
                i = i3;
                i3 = i4;
                i4 += 2;
            }
            iM47713 = m47713(iM47713, iArr[i3], iArr[i3 + 1], iArr4);
            i3 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20881 m47719(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i3 >= 0 && i4 >= 0) {
            long j = i3;
            long j2 = ((long) i2) + j;
            if (j2 <= i) {
                int[] iArr = this.f66830;
                if (iArr.length != 0 && iArr[iArr.length - 1] > i) {
                    throw new IndexOutOfBoundsException("Syntax dirty range exceeds old text");
                }
                if (iArr.length == 0 || (i3 == 0 && i4 == 0)) {
                    return this;
                }
                long j3 = ((long) i4) - j;
                long length = ((long) iArr.length) + ((long) 2);
                int i5 = (int) length;
                if (length != i5) {
                    throw new ArithmeticException();
                }
                int[] iArr2 = new int[i5];
                int iM47713 = 0;
                for (int i6 = 0; i6 < iArr.length; i6 += 2) {
                    int i7 = iArr[i6];
                    int i8 = iArr[i6 + 1];
                    if (i8 <= i2) {
                        iM47713 = m47713(iM47713, i7, i8, iArr2);
                    } else {
                        long j4 = i7;
                        if (j4 >= j2) {
                            long j5 = j4 + j3;
                            int i9 = (int) j5;
                            if (j5 != i9) {
                                throw new ArithmeticException();
                            }
                            long j6 = ((long) i8) + j3;
                            int i10 = (int) j6;
                            if (j6 != i10) {
                                throw new ArithmeticException();
                            }
                            iM47713 = m47713(iM47713, i9, i10, iArr2);
                        } else {
                            if (i7 < i2) {
                                iM47713 = m47713(iM47713, i7, Math.min(i8, i2), iArr2);
                            }
                            int i11 = (int) j2;
                            if (j2 != i11) {
                                throw new ArithmeticException();
                            }
                            int iMax = Math.max(i7, i11);
                            if (iMax < i8) {
                                long j7 = ((long) iMax) + j3;
                                int i12 = (int) j7;
                                if (j7 != i12) {
                                    throw new ArithmeticException();
                                }
                                long j8 = ((long) i8) + j3;
                                int i13 = (int) j8;
                                if (j8 != i13) {
                                    throw new ArithmeticException();
                                }
                                iM47713 = m47713(iM47713, i12, i13, iArr2);
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return iM47713 == 0 ? f66829 : m47715(iM47713, iArr2);
            }
        }
        throw new IndexOutOfBoundsException("Invalid syntax dirty-range edit");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0524 m47723() {
        if (this.f66830.length == 0) {
            return null;
        }
        return m47718(0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m47722() {
        return this.f66830.length / 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0524 m47718(int i) {
        C17359.checkIndex(i, m47722());
        int i2 = i * 2;
        int[] iArr = this.f66830;
        return new C0524(iArr[i2], iArr[i2 + 1]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m47721() {
        return this.f66830;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C20881 m47717(int i, int i2, int i3, int i4) {
        C20881 c20881;
        if (i < 0 || i >= i2) {
            c20881 = f66829;
        } else {
            c20881 = new C20881(new int[]{i, i2});
        }
        return c20881.m47714(i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20881 m47714(int i, int i2) {
        if (i < 0 || i >= i2) {
            return this;
        }
        int[] iArr = this.f66830;
        int[] iArr2 = new int[iArr.length + 2];
        boolean z = false;
        int iM47713 = 0;
        for (int i3 = 0; i3 < iArr.length; i3 += 2) {
            int i4 = iArr[i3];
            int i5 = iArr[i3 + 1];
            if (i5 < i) {
                iM47713 = m47713(iM47713, i4, i5, iArr2);
            } else if (i2 < i4) {
                if (!z) {
                    iM47713 = m47713(iM47713, i, i2, iArr2);
                    z = true;
                }
                iM47713 = m47713(iM47713, i4, i5, iArr2);
            } else {
                i = Math.min(i, i4);
                i2 = Math.max(i2, i5);
            }
        }
        if (!z) {
            iM47713 = m47713(iM47713, i, i2, iArr2);
        }
        return m47715(iM47713, iArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20881 m47715(int i, int[] iArr) {
        if (i == 0) {
            return f66829;
        }
        while (i > 64) {
            long j = ((long) iArr[2]) - ((long) iArr[1]);
            int i2 = 2;
            for (int i3 = 4; i3 < i; i3 += 2) {
                long j2 = ((long) iArr[i3]) - ((long) iArr[i3 - 1]);
                if (j2 < j) {
                    i2 = i3;
                    j = j2;
                }
            }
            iArr[i2 - 1] = iArr[i2 + 1];
            System.arraycopy(iArr, i2 + 2, iArr, i2, (i - i2) - 2);
            i -= 2;
        }
        if (i != iArr.length) {
            iArr = Arrays.copyOf(iArr, i);
        }
        return new C20881(iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47713(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        if (i2 >= i3) {
            return i;
        }
        if (i >= 2 && i2 <= (i5 = iArr[(i4 = i - 1)])) {
            iArr[i4] = Math.max(i5, i3);
            return i;
        }
        iArr[i] = i2;
        iArr[i + 1] = i3;
        return i + 2;
    }
}
