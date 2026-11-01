package l;

/* JADX INFO: renamed from: l.ۗ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6ZU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3498 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2357 f12816;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12817;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7027 f12818;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7027 f12819;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f12820;

    public C3498(C7027 c7027, C7027 c7028, C2357 c2357, int i, int i2) {
        this.f12819 = c7027;
        if (i != -1 && i2 != -1) {
            C13638.checkFromToIndex(i, i2, c7027.m18860());
            if (c7028 == null || c7028.m18860() != i2 - i) {
                throw new IllegalArgumentException("Window style coverage differs");
            }
            if (c2357 != null && c2357.m7174() != c7028.m18860()) {
                throw new IllegalArgumentException("Window context coverage differs");
            }
        } else {
            if (i != -1 || i2 != -1) {
                throw new IllegalArgumentException("Incomplete unknown syntax coverage sentinel");
            }
            if (c7028 != null || c2357 != null) {
                throw new IllegalArgumentException("Unknown syntax coverage cannot retain window state");
            }
        }
        this.f12818 = c7028;
        this.f12816 = c2357;
        this.f12820 = i;
        this.f12817 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3498 m10281(int i, int i2, C7027 c7027, C2357 c2357, C15682 c15682) {
        C13638.requireNonNull(c7027, "windowStyles");
        C13638.requireNonNull(c15682, "defaultStyle");
        long jM18860 = ((long) i2) + ((long) c7027.m18860());
        int i3 = (int) jM18860;
        if (jM18860 != i3) {
            throw new ArithmeticException();
        }
        C13638.checkFromToIndex(i2, i3, i);
        return new C3498(m10282(i2, c15682).m18862(c7027).m18862(m10282(i - i3, c15682)), c7027, c2357, i2, i3);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7027 m10291() {
        return this.f12819;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7027 m10290() {
        return this.f12818;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2357 m10285() {
        return this.f12816;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m10284() {
        return this.f12820 != -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m10292() {
        return this.f12820;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10286() {
        return this.f12817;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3498 m10283(int i, C15682 c15682) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative provisional syntax length");
        }
        C13638.requireNonNull(c15682, "defaultStyle");
        return new C3498(m10282(i, c15682), null, null, -1, -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10289(int i, int i2) {
        C13638.checkFromToIndex(i, i2, this.f12819.m18860());
        return m10284() && this.f12820 <= i && i2 <= this.f12817;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m10293() {
        return m10284() && this.f12816 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9850 m10288(int i, int i2, int i3, int i4, int i5, C15682 c15682) {
        C13638.requireNonNull(c15682, "defaultStyle");
        C7027 c7027 = this.f12819;
        int iM18860 = c7027.m18860();
        if (i < 0 || i2 < 0 || i3 < 0 || ((long) i) + ((long) i2) > iM18860) {
            throw new IndexOutOfBoundsException("Invalid syntax projection edit range");
        }
        C13638.checkFromToIndex(i4, i5, iM18860);
        if (i2 == 0 && i3 == 0) {
            return new C9850(this, i4, i5);
        }
        long j = ((long) (iM18860 - i2)) + ((long) i3);
        int i6 = (int) j;
        if (j != i6) {
            throw new ArithmeticException();
        }
        C7027 c7027M18861 = c7027.m18861(i, i + i2, m10282(i3, (i <= 0 || i3 <= 0) ? c15682 : c7027.m18863(i - 1)));
        if (c7027M18861.m18860() != i6) {
            throw new AssertionError("Edited syntax projection length differs");
        }
        long jM10280 = m10280(iM18860, i, i2, i3, i4, i5);
        int i7 = (int) (jM10280 >>> 32);
        int i8 = (int) jM10280;
        if (c7027M18861.m18865() > (((long) i8) - ((long) i7)) + 2) {
            c7027M18861 = m10282(i6, c15682);
        }
        return new C9850(new C3498(c7027M18861, null, null, -1, -1), i7, i8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2087 m10287(C3498 c3498) {
        int iMax;
        int iMin;
        int i = this.f12820;
        int i2 = this.f12817;
        if (c3498 != null) {
            int i3 = c3498.f12820;
            C7027 c7027 = c3498.f12819;
            int i4 = c3498.f12817;
            int iM18860 = c7027.m18860();
            C7027 c7028 = this.f12819;
            if (iM18860 != c7028.m18860()) {
                throw new IllegalArgumentException("Window projection text length differs");
            }
            if (!m10284() || !c3498.m10284()) {
                return C2087.m6618(i3, i4, i, i2);
            }
            if (i3 == i && i4 == i2) {
                C22550 c22550M18867 = c7027.m18867(c7028);
                C2087 c2087 = C2087.f7716;
                return (c22550M18867 != null && (iMax = Math.max(i, c22550M18867.m50065())) < (iMin = Math.min(i2, c22550M18867.m50064()))) ? C2087.m6618(-1, -1, iMax, iMin) : c2087;
            }
            return C2087.m6618(i3, i4, i, i2);
        }
        return C2087.m6618(-1, -1, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7027 m10282(int i, C15682 c15682) {
        if (i == 0) {
            return C7027.m18855();
        }
        return C7027.m18851(i, c15682, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m10280(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 >= 0 && i3 >= 0 && i4 >= 0) {
            long j = i2;
            long j2 = i3;
            long j3 = j + j2;
            if (j3 <= i) {
                C13638.checkFromToIndex(i5, i6, i);
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
