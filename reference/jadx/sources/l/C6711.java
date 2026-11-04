package l;

/* JADX INFO: renamed from: l.ۛ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6ZU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6711 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f22322;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1270 f22323;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1270 f22324;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f22325;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8246 f22326;

    public C6711(C1270 c1270, C1270 c1271, C8246 c8246, int i, int i2) {
        this.f22323 = c1270;
        if (i != -1 && i2 != -1) {
            C17359.checkFromToIndex(i, i2, c1270.m4628());
            if (c1271 == null || c1271.m4628() != i2 - i) {
                throw new IllegalArgumentException("Window style coverage differs");
            }
            if (c8246 != null && c8246.m22191() != c1271.m4628()) {
                throw new IllegalArgumentException("Window context coverage differs");
            }
        } else {
            if (i != -1 || i2 != -1) {
                throw new IllegalArgumentException("Incomplete unknown syntax coverage sentinel");
            }
            if (c1271 != null || c8246 != null) {
                throw new IllegalArgumentException("Unknown syntax coverage cannot retain window state");
            }
        }
        this.f22324 = c1271;
        this.f22326 = c8246;
        this.f22325 = i;
        this.f22322 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6711 m18736(int i, int i2, C1270 c1270, C8246 c8246, C11974 c11974) {
        C17359.requireNonNull(c1270, "windowStyles");
        C17359.requireNonNull(c11974, "defaultStyle");
        long jM4628 = ((long) i2) + ((long) c1270.m4628());
        int i3 = (int) jM4628;
        if (jM4628 != i3) {
            throw new ArithmeticException();
        }
        C17359.checkFromToIndex(i2, i3, i);
        return new C6711(m18735(i2, c11974).m4630(c1270).m4630(m18735(i - i3, c11974)), c1270, c8246, i2, i3);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1270 m18742() {
        return this.f22323;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1270 m18745() {
        return this.f22324;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8246 m18747() {
        return this.f22326;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m18743() {
        return this.f22325 != -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m18746() {
        return this.f22325;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18738() {
        return this.f22322;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6711 m18737(int i, C11974 c11974) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative provisional syntax length");
        }
        C17359.requireNonNull(c11974, "defaultStyle");
        return new C6711(m18735(i, c11974), null, null, -1, -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18741(int i, int i2) {
        C17359.checkFromToIndex(i, i2, this.f22323.m4628());
        return m18743() && this.f22325 <= i && i2 <= this.f22322;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m18744() {
        return m18743() && this.f22326 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12676 m18739(int i, int i2, int i3, int i4, int i5, C11974 c11974) {
        C17359.requireNonNull(c11974, "defaultStyle");
        C1270 c1270 = this.f22323;
        int iM4628 = c1270.m4628();
        if (i < 0 || i2 < 0 || i3 < 0 || ((long) i) + ((long) i2) > iM4628) {
            throw new IndexOutOfBoundsException("Invalid syntax projection edit range");
        }
        C17359.checkFromToIndex(i4, i5, iM4628);
        if (i2 == 0 && i3 == 0) {
            return new C12676(this, i4, i5);
        }
        long j = ((long) (iM4628 - i2)) + ((long) i3);
        int i6 = (int) j;
        if (j != i6) {
            throw new ArithmeticException();
        }
        C1270 c1270M4629 = c1270.m4629(i, i + i2, m18735(i3, (i <= 0 || i3 <= 0) ? c11974 : c1270.m4631(i - 1)));
        if (c1270M4629.m4628() != i6) {
            throw new AssertionError("Edited syntax projection length differs");
        }
        long jM18734 = m18734(iM4628, i, i2, i3, i4, i5);
        int i7 = (int) (jM18734 >>> 32);
        int i8 = (int) jM18734;
        if (c1270M4629.m4633() > (((long) i8) - ((long) i7)) + 2) {
            c1270M4629 = m18735(i6, c11974);
        }
        return new C12676(new C6711(c1270M4629, null, null, -1, -1), i7, i8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20881 m18740(C6711 c6711) {
        int iMax;
        int iMin;
        int i = this.f22325;
        int i2 = this.f22322;
        if (c6711 != null) {
            int i3 = c6711.f22325;
            C1270 c1270 = c6711.f22323;
            int i4 = c6711.f22322;
            int iM4628 = c1270.m4628();
            C1270 c1271 = this.f22323;
            if (iM4628 != c1271.m4628()) {
                throw new IllegalArgumentException("Window projection text length differs");
            }
            if (!m18743() || !c6711.m18743()) {
                return C20881.m47717(i3, i4, i, i2);
            }
            if (i3 == i && i4 == i2) {
                C0524 c0524M4634 = c1270.m4634(c1271);
                C20881 c20881 = C20881.f66829;
                return (c0524M4634 != null && (iMax = Math.max(i, c0524M4634.m2487())) < (iMin = Math.min(i2, c0524M4634.m2486()))) ? C20881.m47717(-1, -1, iMax, iMin) : c20881;
            }
            return C20881.m47717(i3, i4, i, i2);
        }
        return C20881.m47717(-1, -1, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1270 m18735(int i, C11974 c11974) {
        if (i == 0) {
            return C1270.m4622();
        }
        return C1270.m4615(i, c11974, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m18734(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 >= 0 && i3 >= 0 && i4 >= 0) {
            long j = i2;
            long j2 = i3;
            long j3 = j + j2;
            if (j3 <= i) {
                C17359.checkFromToIndex(i5, i6, i);
                long j4 = i4;
                long j5 = ((long) (i - i3)) + j4;
                int i7 = (int) j5;
                long j6 = i7;
                if (j5 != j6) {
                    throw new ArithmeticException();
                }
                long j7 = j + j4;
                long j8 = j4 - j2;
                if (i5 <= i2) {
                    j = i5;
                } else {
                    long j9 = i5;
                    if (j9 >= j3) {
                        j = j9 + j8;
                    }
                }
                long jMin = Math.min(i6 - i5, i7);
                long j10 = j6 - jMin;
                long jMax = Math.max(0L, Math.min(j, j10));
                if (i2 <= i6 && j3 >= i5) {
                    if (j7 >= jMax) {
                        j7 = j7 > jMax + jMin ? j7 - jMin : jMax;
                    }
                    jMax = Math.max(0L, Math.min(j7, j10));
                }
                long j11 = (int) jMax;
                if (jMax != j11) {
                    throw new ArithmeticException();
                }
                long j12 = jMin + j11;
                long j13 = (int) j12;
                if (j12 == j13) {
                    return (j11 << 32) | (4294967295L & j13);
                }
                throw new ArithmeticException();
            }
        }
        throw new IndexOutOfBoundsException("Invalid syntax target edit range");
    }
}
