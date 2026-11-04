package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۙ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0IQU */
/* JADX INFO: loaded from: classes2.dex */
public final class C4933 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17195;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f17196;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f17197;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f17198;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f17199;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C4933 f17200;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f17201;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C4933 f17202;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f17203;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17204;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f17205;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f17206;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f17207;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f17208;

    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    public C4933(int i, int i2, int i3, int i4) {
        int i5;
        if (i3 < 0 || i4 < 0 || (i3 == 0 && i4 == 0)) {
            throw new IllegalArgumentException("Invalid alignment extent");
        }
        if (i == 5) {
            i5 = i;
        } else if (i3 == 0) {
            i5 = 3;
        } else if (i4 == 0) {
            i5 = 2;
        } else {
            i5 = i;
        }
        this.f17195 = i5;
        if (i5 == 0 && i3 != i4) {
            throw new IllegalArgumentException("Unequal SAME extent");
        }
        i2 = i != 5 ? i5 : i2;
        this.f17201 = i2;
        this.f17199 = i3;
        this.f17204 = i4;
        this.f17208 = Math.max(i3, i4);
        boolean z = true;
        this.f17197 = 1;
        this.f17198 = 1;
        this.f17207 = i5 == 0 ? 0 : 1;
        this.f17205 = i2 == 0 ? 0 : 1;
        boolean z2 = i5 == 5;
        this.f17196 = z2;
        this.f17203 = z2;
        if (i5 != 4 && !z2) {
            z = false;
        }
        this.f17206 = z;
        this.f17202 = null;
        this.f17200 = null;
    }

    public C4933(C4933 c4933, C4933 c4934) {
        this.f17200 = c4933;
        this.f17202 = c4934;
        long j = ((long) c4933.f17199) + ((long) c4934.f17199);
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        this.f17199 = i;
        long j2 = ((long) c4933.f17204) + ((long) c4934.f17204);
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        this.f17204 = i2;
        this.f17208 = c4933.f17208 + c4934.f17208;
        this.f17198 = c4933.f17198 + c4934.f17198;
        this.f17207 = c4933.f17207 + c4934.f17207;
        this.f17205 = c4933.f17205 + c4934.f17205;
        this.f17197 = Math.max(c4933.f17197, c4934.f17197) + 1;
        this.f17206 = c4933.f17206 || c4934.f17206;
        this.f17203 = c4933.f17203 || c4934.f17203;
        this.f17196 = c4933.f17196 && c4934.f17196;
        this.f17201 = -1;
        this.f17195 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4933 m15130(int i, int i2, int i3) {
        int i4;
        if (i2 == 0 && i3 == 0) {
            return null;
        }
        if (i2 == 0) {
            i4 = 3;
        } else {
            i4 = i3 == 0 ? 2 : i;
        }
        return new C4933(i, i4, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4933 m15131(int i, int i2, List list) {
        if (i == i2) {
            return null;
        }
        if (i2 - i == 1) {
            C9141 c9141 = (C9141) list.get(i);
            return m15130(c9141.f29712, c9141.f29713, c9141.f29710);
        }
        int i3 = (i + i2) >>> 1;
        return new C4933(m15131(i, i3, list), m15131(i3, i2, list));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4933 m15132(C4933 c4933, long j, long j2) {
        if (j >= 0 && j2 >= j) {
            if (j2 <= (c4933 == null ? 0L : c4933.f17208)) {
                if (j == j2) {
                    return null;
                }
                if (j == 0 && j2 == c4933.f17208) {
                    return c4933;
                }
                C4933 c4934 = c4933.f17200;
                C4933 c4935 = c4933.f17202;
                int i = c4933.f17204;
                int i2 = c4933.f17199;
                if (c4934 == null) {
                    long j3 = i2;
                    long j4 = i;
                    return new C4933(c4933.f17195, c4933.f17201, (int) (Math.min(j2, j3) - Math.min(j, j3)), (int) (Math.min(j2, j4) - Math.min(j, j4)));
                }
                long j5 = c4934.f17208;
                if (j2 <= j5) {
                    return m15132(c4934, j, j2);
                }
                if (j >= j5) {
                    return m15132(c4935, j - j5, j2 - j5);
                }
                return m15135(m15132(c4934, j, j5), m15132(c4935, 0L, j2 - j5));
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C4933 m15135(C4933 c4933, C4933 c4934) {
        if (c4933 == null) {
            return c4934;
        }
        if (c4934 == null) {
            return c4933;
        }
        int i = c4933.f17197;
        int i2 = c4934.f17197;
        if (i > i2 + 1) {
            return m15133(c4933.f17200, m15135(c4933.f17202, c4934));
        }
        if (i2 > i + 1) {
            return m15133(m15135(c4933, c4934.f17200), c4934.f17202);
        }
        return new C4933(c4933, c4934);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C4933 m15136(C4933 c4933, C4933 c4934) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (c4933 == null || c4934 == null) {
            return m15135(c4933, c4934);
        }
        C4933 c4935 = c4933;
        while (true) {
            C4933 c4936 = c4935.f17202;
            i = c4935.f17204;
            i2 = c4935.f17199;
            if (c4936 == null) {
                break;
            }
            c4935 = c4936;
        }
        C4933 c4937 = c4934;
        while (true) {
            C4933 c4938 = c4937.f17200;
            i3 = c4937.f17204;
            i4 = c4937.f17199;
            if (c4938 == null) {
                break;
            }
            c4937 = c4938;
        }
        int i6 = c4935.f17195;
        if (i6 != c4937.f17195 || (i5 = c4935.f17201) != c4937.f17201 || (i6 != 0 && i6 != 2 && i6 != 3 && (i2 != i || i4 != i3))) {
            return m15135(c4933, c4934);
        }
        long j = ((long) i2) + ((long) i4);
        int i7 = (int) j;
        if (j != i7) {
            throw new ArithmeticException();
        }
        long j2 = ((long) i) + ((long) i3);
        int i8 = (int) j2;
        if (j2 == i8) {
            return m15135(m15135(m15132(c4933, 0L, c4933.f17208 - c4935.f17208), new C4933(i6, i5, i7, i8)), m15132(c4934, c4937.f17208, c4934.f17208));
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m15140(long j) {
        if (!this.f17203 || j >= this.f17208) {
            return -1L;
        }
        C4933 c4933 = this.f17200;
        if (c4933 == null) {
            return Math.max(0L, j);
        }
        if (j < c4933.f17208) {
            long jM15140 = c4933.m15140(j);
            if (jM15140 >= 0) {
                return jM15140;
            }
        }
        long jM15141 = this.f17202.m15140(Math.max(0L, j - c4933.f17208));
        if (jM15141 < 0) {
            return -1L;
        }
        return c4933.f17208 + jM15141;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4933 m15134(C4933 c4933, boolean z) {
        if (c4933 == null) {
            return null;
        }
        C4933 c4934 = c4933.f17200;
        if (c4934 == null) {
            return new C4933(5, z ? 1 : c4933.f17201, c4933.f17199, c4933.f17204);
        }
        return m15135(m15134(c4934, z), m15134(c4933.f17202, z));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m15142(long j) {
        if (this.f17196 || j >= this.f17208) {
            return -1L;
        }
        C4933 c4933 = this.f17200;
        if (c4933 == null) {
            return Math.max(0L, j);
        }
        if (j < c4933.f17208) {
            long jM15142 = c4933.m15142(j);
            if (jM15142 >= 0) {
                return jM15142;
            }
        }
        long jM15143 = this.f17202.m15142(Math.max(0L, j - c4933.f17208));
        if (jM15143 < 0) {
            return -1L;
        }
        return c4933.f17208 + jM15143;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15138(long j, boolean z) {
        if (j >= 0) {
            long j2 = this.f17208;
            if (j <= j2) {
                if (j == j2) {
                    return z ? this.f17199 : this.f17204;
                }
                int i = 0;
                C4933 c4933 = this;
                while (true) {
                    C4933 c4934 = c4933.f17200;
                    if (c4934 == null) {
                        break;
                    }
                    long j3 = c4934.f17208;
                    if (j < j3) {
                        c4933 = c4934;
                    } else {
                        j -= j3;
                        i += z ? c4934.f17199 : c4934.f17204;
                        c4933 = c4933.f17202;
                    }
                }
                return i + ((int) Math.min(j, z ? c4933.f17199 : c4933.f17204));
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4933 m15133(C4933 c4933, C4933 c4934) {
        int i = c4933.f17197;
        C4933 c4935 = c4933.f17202;
        int i2 = c4934.f17197;
        C4933 c4936 = c4934.f17200;
        C4933 c4937 = c4934.f17202;
        if (i > i2 + 1) {
            C4933 c4938 = c4933.f17200;
            if (c4938.f17197 >= c4935.f17197) {
                return new C4933(c4938, new C4933(c4935, c4934));
            }
            return new C4933(new C4933(c4938, c4935.f17200), new C4933(c4935.f17202, c4934));
        }
        if (i2 > i + 1) {
            if (c4937.f17197 >= c4936.f17197) {
                return new C4933(new C4933(c4933, c4936), c4937);
            }
            return new C4933(new C4933(c4933, c4936.f17200), new C4933(c4936.f17202, c4937));
        }
        return new C4933(c4933, c4934);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15137(int i, boolean z) {
        if (i >= 0) {
            if (i < (z ? this.f17205 : this.f17207)) {
                int i2 = 0;
                C4933 c4933 = this;
                while (true) {
                    C4933 c4934 = c4933.f17200;
                    if (c4934 == null) {
                        return i2;
                    }
                    int i3 = z ? c4934.f17205 : c4934.f17207;
                    if (i < i3) {
                        c4933 = c4934;
                    } else {
                        i -= i3;
                        i2 += c4934.f17198;
                        c4933 = c4933.f17202;
                    }
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15139(long j, boolean z, boolean z2) {
        int i = 0;
        if (j < 0) {
            return 0;
        }
        if (j >= this.f17208) {
            return z2 ? this.f17205 : this.f17207;
        }
        int i2 = 0;
        C4933 c4933 = this;
        while (true) {
            C4933 c4934 = c4933.f17200;
            if (c4934 == null) {
                break;
            }
            long j2 = c4934.f17208;
            if (j < j2) {
                c4933 = c4934;
            } else {
                j -= j2;
                i2 += z2 ? c4934.f17205 : c4934.f17207;
                c4933 = c4933.f17202;
            }
        }
        if ((z2 ? c4933.f17205 : c4933.f17207) != 0 && (z || j >= c4933.f17208)) {
            i = 1;
        }
        return i2 + i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m15141(int i, boolean z) {
        if (i >= (z ? this.f17199 : this.f17204)) {
            return this.f17208;
        }
        long j = 0;
        if (i < 0) {
            return 0L;
        }
        C4933 c4933 = this;
        while (true) {
            C4933 c4934 = c4933.f17200;
            if (c4934 == null) {
                return j + ((long) i);
            }
            int i2 = z ? c4934.f17199 : c4934.f17204;
            if (i < i2) {
                c4933 = c4934;
            } else {
                i -= i2;
                j += c4934.f17208;
                c4933 = c4933.f17202;
            }
        }
    }
}
