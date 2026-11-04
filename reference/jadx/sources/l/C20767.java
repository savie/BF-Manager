package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes5.dex */
public final class C20767 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m47496(int i) {
        return (i + 63) >>> 6;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m47503(long j, long j2) {
        long j3 = j2 + j;
        return (j3 < 0 || j3 < j) ? C25227.FOREVER_NS : j3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17037 m47504(int i, boolean z) {
        if (i == 0) {
            return null;
        }
        return m47483(i, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17037 m47486(C17037 c17037, int i, int i2) {
        C13921.m33904(c17037 == null ? 0 : c17037.f55675, i, i2);
        if (i2 == 0) {
            return null;
        }
        return m47491(m47491(c17037, i).f76979, i2).f76978;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17037 m47487(C17037 c17037, int i, int i2, int i3) {
        int i4 = c17037 == null ? 0 : c17037.f55675;
        if (i < 0 || i2 < i || i2 > i4 || i3 < 0) {
            StringBuilder sbM5126 = C1402.m5126("start=", i, ", end=", ", replacementLength=", i2);
            sbM5126.append(i3);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        if (i2 - i == i3 && i3 != 0) {
            return m47490(c17037, new int[]{i}, 1, i3);
        }
        C23751 c23751M47491 = m47491(c17037, i);
        return m47498(m47498(c23751M47491.f76978, m47504(i3, true)), m47491(c23751M47491.f76979, i2 - i).f76979);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17037 m47490(C17037 c17037, int[] iArr, int i, int i2) {
        int i3 = c17037 == null ? 0 : c17037.f55675;
        if (i2 <= 0 || i < 0 || i > iArr.length) {
            throw new IllegalArgumentException("Invalid dirty batch");
        }
        int i4 = -1;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = iArr[i5];
            long j = ((long) i6) + ((long) i2);
            if (i6 < 0 || i6 < i4 || j > i3) {
                throw new IndexOutOfBoundsException(C13645.m33382(i6, "Invalid dirty match offset "));
            }
            i4 = (int) j;
        }
        return i == 0 ? c17037 : m47488(c17037, 0, iArr, 0, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47493(C17037 c17037, int i, boolean[] zArr, int i2) {
        C13921.m33904(c17037 == null ? 0 : c17037.f55675, i, i2);
        C13921.m33902(zArr.length, 0, i2);
        if (i2 == 0) {
            return;
        }
        m47494(c17037, i, zArr, 0, i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m47500(C17037 c17037) {
        if (c17037 == null) {
            return 0L;
        }
        return c17037.f55674;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m47481(long j) {
        if (j < 0 || j > 2147483647L) {
            return C25227.FOREVER_NS;
        }
        long j2 = (j + 65535) / 65536;
        if (j2 == 0) {
            return 0L;
        }
        return ((j2 * 2) - 1) * 48;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47494(C17037 c17037, int i, boolean[] zArr, int i2, int i3) {
        boolean zM40149 = c17037.m40149();
        C17037 c17038 = c17037.f55676;
        int i4 = 0;
        if (zM40149) {
            if (c17037.m40147()) {
                long[] jArr = c17037.f55677;
                int i5 = i3 + i;
                while (i < i5) {
                    int i6 = i & 63;
                    int iMin = Math.min(i5 - i, 64 - i6);
                    long j = jArr[i >>> 6] >>> i6;
                    int i7 = 0;
                    while (i7 < iMin) {
                        int i8 = i2 + 1;
                        zArr[i2] = ((1 << i7) & j) != 0;
                        i7++;
                        i2 = i8;
                    }
                    i += iMin;
                }
                return;
            }
            Arrays.fill(zArr, i2, i3 + i2, c17037.f55670);
            return;
        }
        int i9 = c17038.f55675;
        if (i < i9) {
            int iMin2 = Math.min(i3, i9 - i);
            m47494(c17038, i, zArr, i2, iMin2);
            i2 += iMin2;
            i3 -= iMin2;
        } else {
            i4 = i - i9;
        }
        if (i3 > 0) {
            m47494(c17037.f55672, i4, zArr, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17037 m47488(C17037 c17037, int i, int[] iArr, int i2, int i3, int i4) {
        long j = i;
        int i5 = c17037.f55675;
        C17037 c17038 = c17037.f55676;
        long j2 = ((long) i5) + j;
        long j3 = i4;
        long j4 = 1;
        int iM47480 = m47480(i2, (j - j3) + 1, iArr, i3);
        int iM47481 = m47480(iM47480, j2, iArr, i3);
        if (iM47480 < iM47481 && (!c17037.m40148() || !c17037.f55670)) {
            if (!c17037.m40149()) {
                C17037 c17037M47488 = m47488(c17037.f55676, i, iArr, iM47480, iM47481, i4);
                C17037 c17037M47489 = m47488(c17037.f55672, c17038.f55675 + i, iArr, iM47480, iM47481, i4);
                if (c17037M47488 != c17038 || c17037M47489 != c17037.f55672) {
                    return m47498(c17037M47488, c17037M47489);
                }
            } else {
                int i6 = iM47480;
                int i7 = iM47481;
                if (c17037.m40147()) {
                    long[] jArr = (long[]) c17037.f55677.clone();
                    m47495(jArr, i, c17037.f55675, iArr, i6, i7, i4);
                    return m47497(c17037.f55675, jArr);
                }
                int iMax = Math.max(i, iArr[i6]);
                long jMin = Math.min(j2, ((long) iArr[i7 - 1]) + j3);
                long jMax = Math.max(j, (((long) iMax) / 65536) * 65536);
                long jMin2 = Math.min(j2, ((jMin + 65535) / 65536) * 65536);
                C17037 c17037M47504 = j < jMax ? m47504((int) (jMax - j), false) : null;
                while (jMax < jMin2) {
                    int iMin = (int) (Math.min(jMin2, ((jMax / 65536) + j4) * 65536) - jMax);
                    long[] jArr2 = new long[m47496(iMin)];
                    C17037 c17039 = c17037M47504;
                    int iM47482 = m47480(i6, (jMax - j3) + j4, iArr, i7);
                    long j5 = jMin2;
                    long j6 = ((long) iMin) + jMax;
                    m47495(jArr2, (int) jMax, iMin, iArr, iM47482, m47480(iM47482, j6, iArr, i7), i4);
                    c17037M47504 = m47498(c17039, m47497(iMin, jArr2));
                    i7 = i7;
                    i6 = i6;
                    jMin2 = j5;
                    jMax = j6;
                    j4 = 1;
                }
                C17037 c170310 = c17037M47504;
                long j7 = jMin2;
                return j7 < j2 ? m47498(c170310, m47504((int) (j2 - j7), false)) : c170310;
            }
        }
        return c17037;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47495(long[] jArr, int i, int i2, int[] iArr, int i3, int i4, int i5) {
        long j = ((long) i) + ((long) i2);
        while (i3 < i4) {
            int iMax = Math.max(i, iArr[i3]);
            int iMin = (int) Math.min(j, ((long) iArr[i3]) + ((long) i5));
            if (iMax < iMin) {
                m47507(iMax - i, iMin - i, jArr);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m47507(int i, int i2, long[] jArr) {
        int i3 = i >>> 6;
        int i4 = i2 - 1;
        int i5 = i4 >>> 6;
        long j = (-1) << (i & 63);
        long j2 = (-1) >>> (63 - (i4 & 63));
        if (i3 == i5) {
            jArr[i3] = (j2 & j) | jArr[i3];
        } else {
            jArr[i3] = j | jArr[i3];
            Arrays.fill(jArr, i3 + 1, i5, -1L);
            jArr[i5] = j2 | jArr[i5];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47480(int i, long j, int[] iArr, int i2) {
        while (i < i2) {
            int i3 = (i + i2) >>> 1;
            if (iArr[i3] < j) {
                i = i3 + 1;
            } else {
                i2 = i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m47502(int i) {
        if (i <= 0 || i > 65536) {
            throw new IllegalArgumentException("Invalid dirty bitmap length");
        }
        return m47496(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m47508(C17037 c17037) {
        m47499(c17037);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C25243 m47499(C17037 c17037) {
        if (c17037 == null) {
            return new C25243(0, 0, false, false, false, 0L, 0L);
        }
        C17037 c17038 = c17037.f55672;
        C17037 c17039 = c17037.f55676;
        int i = c17037.f55678;
        long j = c17037.f55674;
        long j2 = c17037.f55673;
        boolean z = c17037.f55671;
        int i2 = c17037.f55675;
        long[] jArr = c17037.f55677;
        if (!c17037.m40149()) {
            C25243 c25243M47499 = m47499(c17039);
            C25243 c25243M474910 = m47499(c17038);
            int iMax = Math.max(c25243M47499.f81568, c25243M474910.f81568) + 1;
            long j3 = ((long) c25243M47499.f81565) + ((long) c25243M474910.f81565);
            int i3 = (int) j3;
            if (j3 != i3) {
                throw new ArithmeticException();
            }
            boolean z2 = c25243M47499.f81562 || c25243M474910.f81562;
            long jM47503 = m47503(c25243M47499.f81567, c25243M474910.f81567);
            long jM47504 = m47503(48L, m47503(c25243M47499.f81564, c25243M474910.f81564));
            if (i != iMax || i2 != i3 || z != z2 || jArr != null || j2 != jM47503 || j != jM47504 || Math.abs(c25243M47499.f81568 - c25243M474910.f81568) > 1) {
                throw new IllegalStateException("Invalid dirty AVL branch");
            }
            C17037 c170310 = c17039;
            while (!c170310.m40149()) {
                c170310 = c170310.f55672;
            }
            C17037 c170311 = c17038;
            while (!c170311.m40149()) {
                c170311 = c170311.f55676;
            }
            if (c170310.m40148() && c170311.m40148() && c170310.f55670 == c170311.f55670) {
                throw new IllegalStateException("Adjacent dirty runs were not merged");
            }
            return new C25243(iMax, i3, z2, c25243M47499.f81563, c25243M474910.f81566, jM47503, jM47504);
        }
        if (i2 <= 0 || i != 1) {
            throw new IllegalStateException("Invalid dirty leaf");
        }
        if (!c17037.m40147()) {
            boolean z3 = c17037.f55670;
            if (z != z3) {
                throw new IllegalStateException("Invalid uniform dirty leaf");
            }
            if (j2 == 0 && j == 48) {
                return new C25243(1, c17037.f55675, z3, z3, z3, 0L, 48L);
            }
            throw new IllegalStateException("Invalid uniform dirty budget");
        }
        if (i2 > 65536 || jArr.length != m47496(i2) || c17037.f55670) {
            throw new IllegalStateException("Invalid bitmap dirty leaf");
        }
        int i4 = i2 & 63;
        if (i4 != 0 && (jArr[jArr.length - 1] >>> i4) != 0) {
            throw new IllegalStateException("Dirty bitmap has trailing bits");
        }
        boolean zM47509 = m47509(0, jArr);
        int i5 = 0;
        boolean z4 = false;
        boolean z5 = true;
        while (i5 < jArr.length) {
            long j4 = (i5 != jArr.length - 1 || i4 == 0) ? -1L : (1 << i4) - 1;
            long j5 = jArr[i5];
            z4 |= j5 != 0;
            z5 &= j5 == j4;
            i5++;
        }
        if (!z4 || z5 || !z) {
            throw new IllegalStateException("Dirty bitmap was not canonicalized");
        }
        long length = 8 * ((long) jArr.length);
        long j6 = 48 + length;
        if (j2 != length || j != j6) {
            throw new IllegalStateException("Invalid bitmap dirty budget");
        }
        int i6 = c17037.f55675;
        return new C25243(1, i6, true, zM47509, m47509(i6 - 1, jArr), length, j6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23751 m47491(C17037 c17037, int i) {
        if (c17037 == null) {
            if (i == 0) {
                return C23751.f76977;
            }
            throw new IndexOutOfBoundsException(C13645.m33382(i, "offset="));
        }
        C17037 c17038 = c17037.f55676;
        boolean z = c17037.f55670;
        C17037 c17039 = c17037.f55672;
        int i2 = c17037.f55675;
        int i3 = 0;
        C17037 c170310 = null;
        if (i == 0) {
            return new C23751(c170310, c17037, i3);
        }
        if (i == i2) {
            return new C23751(c17037, c170310, i3);
        }
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C13645.m33382(i, "offset="));
        }
        if (c17037.m40149()) {
            return !c17037.m40147() ? new C23751(m47483(i, z), m47483(i2 - i, z), i3) : new C23751(m47505(c17037, 0, i), m47505(c17037, i, i2 - i), i3);
        }
        int i4 = c17038.f55675;
        if (i < i4) {
            C23751 c23751M47491 = m47491(c17038, i);
            return new C23751(c23751M47491.f76978, m47498(c23751M47491.f76979, c17039), i3);
        }
        if (i == i4) {
            return new C23751(c17038, c17039, i3);
        }
        C23751 c23751M47492 = m47491(c17039, i - i4);
        return new C23751(m47498(c17038, c23751M47492.f76978), c23751M47492.f76979, i3);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C17037 m47510(C17037 c17037, C17037 c17038) {
        if (c17037 == null) {
            return c17038;
        }
        if (c17038 == null) {
            return c17037;
        }
        int i = c17037.f55678;
        int i2 = c17038.f55678;
        if (i > i2 + 1) {
            return m47485(m47506(c17037.f55676, m47510(c17037.f55672, c17038)));
        }
        if (i2 > i + 1) {
            return m47485(m47506(m47510(c17037, c17038.f55676), c17038.f55672));
        }
        return m47506(c17037, c17038);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17037 m47485(C17037 c17037) {
        C17037 c17038 = c17037.f55676;
        C17037 c17039 = c17037.f55672;
        int i = (c17038 == null ? 0 : c17038.f55678) - (c17039 == null ? 0 : c17039.f55678);
        if (i > 1) {
            C17037 c170310 = c17038.f55676;
            int i2 = c170310 == null ? 0 : c170310.f55678;
            C17037 c170311 = c17038.f55672;
            return i2 >= (c170311 != null ? c170311.f55678 : 0) ? m47506(c170310, m47506(c170311, c17039)) : m47506(m47506(c170310, c170311.f55676), m47506(c170311.f55672, c17039));
        }
        if (i >= -1) {
            return c17037;
        }
        C17037 c170312 = c17039.f55672;
        int i3 = c170312 == null ? 0 : c170312.f55678;
        C17037 c170313 = c17039.f55676;
        return i3 >= (c170313 != null ? c170313.f55678 : 0) ? m47506(m47506(c17038, c170313), c170312) : m47506(m47506(c17038, c170313.f55676), m47506(c170313.f55672, c170312));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C17783 m47501(C17037 c17037) {
        if (c17037.m40149()) {
            return new C17783(null, c17037);
        }
        C17783 c17783M47501 = m47501(c17037.f55672);
        return new C17783(m47510(c17037.f55676, c17783M47501.f58368), c17783M47501.f58367);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C17783 m47511(C17037 c17037) {
        if (c17037.m40149()) {
            return new C17783(null, c17037);
        }
        C17783 c17783M47511 = m47511(c17037.f55676);
        return new C17783(m47510(c17783M47511.f58368, c17037.f55672), c17783M47511.f58367);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C17037 m47498(C17037 c17037, C17037 c17038) {
        if (c17037 == null) {
            return c17038;
        }
        if (c17038 == null) {
            return c17037;
        }
        C17037 c17039 = c17037;
        while (!c17039.m40149()) {
            c17039 = c17039.f55672;
        }
        C17037 c170310 = c17038;
        while (!c170310.m40149()) {
            c170310 = c170310.f55676;
        }
        if (!c17039.m40148() || !c170310.m40148() || c17039.f55670 != c170310.f55670) {
            return m47510(c17037, c17038);
        }
        C17783 c17783M47501 = m47501(c17037);
        C17783 c17783M47511 = m47511(c17038);
        long j = ((long) c17783M47501.f58367.f55675) + ((long) c17783M47511.f58367.f55675);
        if (j > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        return m47498(m47498(c17783M47501.f58368, m47483((int) j, c17783M47501.f58367.f55670)), c17783M47511.f58368);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17037 m47505(C17037 c17037, int i, int i2) {
        long[] jArr = new long[m47496(i2)];
        for (int i3 = 0; i3 < i2; i3++) {
            if (m47509(i + i3, c17037.f55677)) {
                int i4 = i3 >>> 6;
                jArr[i4] = jArr[i4] | (1 << (i3 & 63));
            }
        }
        return m47497(i2, jArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C17037 m47497(int i, long[] jArr) {
        if (i <= 0 || i > 65536 || jArr.length != m47496(i)) {
            throw new IllegalArgumentException("Invalid dirty bitmap");
        }
        int i2 = i & 63;
        if (i2 != 0) {
            int length = jArr.length - 1;
            jArr[length] = jArr[length] & ((1 << i2) - 1);
        }
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        while (i3 < jArr.length) {
            long j = (i3 != jArr.length - 1 || i2 == 0) ? -1L : (1 << i2) - 1;
            long j2 = jArr[i3];
            z |= j2 != 0;
            z2 &= j2 == j;
            i3++;
        }
        if (!z) {
            return m47483(i, false);
        }
        if (z2) {
            return m47483(i, true);
        }
        return new C17037(null, null, jArr, i, 1, false, true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m47509(int i, long[] jArr) {
        return ((1 << (i & 63)) & jArr[i >>> 6]) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17037 m47483(int i, boolean z) {
        return new C17037(null, null, null, i, 1, z, z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17037 m47506(C17037 c17037, C17037 c17038) {
        long j = ((long) c17037.f55675) + ((long) c17038.f55675);
        int i = (int) j;
        if (j == i) {
            return new C17037(c17037, c17038, null, i, Math.max(c17037.f55678, c17038.f55678) + 1, false, c17037.f55671 || c17038.f55671);
        }
        throw new ArithmeticException();
    }
}
