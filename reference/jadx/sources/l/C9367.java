package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C9367 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m24033(int i) {
        return (i + 63) >>> 6;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m24038(long j, long j2) {
        long j3 = j2 + j;
        return (j3 < 0 || j3 < j) ? C17492.FOREVER_NS : j3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C5838 m24039(int i, boolean z) {
        if (i == 0) {
            return null;
        }
        return m24019(i, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5838 m24022(C5838 c5838, int i, int i2) {
        C22979.m50823(c5838 == null ? 0 : c5838.f19808, i, i2);
        if (i2 == 0) {
            return null;
        }
        return m24027(m24027(c5838, i).f46872, i2).f46871;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5838 m24023(C5838 c5838, int i, int i2, int i3) {
        int i4 = c5838 == null ? 0 : c5838.f19808;
        if (i < 0 || i2 < i || i2 > i4 || i3 < 0) {
            StringBuilder sbM2791 = C0589.m2791("start=", i, ", end=", ", replacementLength=", i2);
            sbM2791.append(i3);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        if (i2 - i == i3 && i3 != 0) {
            return m24026(c5838, new int[]{i}, 1, i3);
        }
        C14306 c14306M24027 = m24027(c5838, i);
        return m24035(m24035(c14306M24027.f46871, m24039(i3, true)), m24027(c14306M24027.f46872, i2 - i).f46872);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5838 m24026(C5838 c5838, int[] iArr, int i, int i2) {
        int i3 = c5838 == null ? 0 : c5838.f19808;
        if (i2 <= 0 || i < 0 || i > iArr.length) {
            throw new IllegalArgumentException("Invalid dirty batch");
        }
        int i4 = -1;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = iArr[i5];
            long j = ((long) i6) + ((long) i2);
            if (i6 < 0 || i6 < i4 || j > i3) {
                throw new IndexOutOfBoundsException(C8479.m22141(i6, "Invalid dirty match offset "));
            }
            i4 = (int) j;
        }
        return i == 0 ? c5838 : m24024(c5838, 0, iArr, 0, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24029(C5838 c5838, int i, boolean[] zArr, int i2) {
        C22979.m50823(c5838 == null ? 0 : c5838.f19808, i, i2);
        C22979.m50824(zArr.length, 0, i2);
        if (i2 == 0) {
            return;
        }
        m24030(c5838, i, zArr, 0, i2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static long m24045(C5838 c5838) {
        if (c5838 == null) {
            return 0L;
        }
        return c5838.f19800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m24017(long j) {
        if (j < 0 || j > 2147483647L) {
            return C17492.FOREVER_NS;
        }
        long j2 = (j + 65535) / 65536;
        if (j2 == 0) {
            return 0L;
        }
        return ((j2 * 2) - 1) * 48;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24030(C5838 c5838, int i, boolean[] zArr, int i2, int i3) {
        boolean zM16054 = c5838.m16054();
        C5838 c5839 = c5838.f19804;
        int i4 = 0;
        if (zM16054) {
            if (c5838.m16052()) {
                long[] jArr = c5838.f19807;
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
            Arrays.fill(zArr, i2, i3 + i2, c5838.f19802);
            return;
        }
        int i9 = c5839.f19808;
        if (i < i9) {
            int iMin2 = Math.min(i3, i9 - i);
            m24030(c5839, i, zArr, i2, iMin2);
            i2 += iMin2;
            i3 -= iMin2;
        } else {
            i4 = i - i9;
        }
        if (i3 > 0) {
            m24030(c5838.f19806, i4, zArr, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5838 m24024(C5838 c5838, int i, int[] iArr, int i2, int i3, int i4) {
        long j = i;
        int i5 = c5838.f19808;
        C5838 c5839 = c5838.f19804;
        long j2 = ((long) i5) + j;
        long j3 = i4;
        long j4 = 1;
        int iM24016 = m24016(i2, (j - j3) + 1, iArr, i3);
        int iM24017 = m24016(iM24016, j2, iArr, i3);
        if (iM24016 < iM24017 && (!c5838.m16053() || !c5838.f19802)) {
            if (!c5838.m16054()) {
                C5838 c5838M24024 = m24024(c5838.f19804, i, iArr, iM24016, iM24017, i4);
                C5838 c5838M24025 = m24024(c5838.f19806, c5839.f19808 + i, iArr, iM24016, iM24017, i4);
                if (c5838M24024 != c5839 || c5838M24025 != c5838.f19806) {
                    return m24035(c5838M24024, c5838M24025);
                }
            } else {
                int i6 = iM24016;
                int i7 = iM24017;
                if (c5838.m16052()) {
                    long[] jArr = (long[]) c5838.f19807.clone();
                    m24031(jArr, i, c5838.f19808, iArr, i6, i7, i4);
                    return m24034(c5838.f19808, jArr);
                }
                int iMax = Math.max(i, iArr[i6]);
                long jMin = Math.min(j2, ((long) iArr[i7 - 1]) + j3);
                long jMax = Math.max(j, (((long) iMax) / 65536) * 65536);
                long jMin2 = Math.min(j2, ((jMin + 65535) / 65536) * 65536);
                C5838 c5838M24039 = j < jMax ? m24039((int) (jMax - j), false) : null;
                while (jMax < jMin2) {
                    int iMin = (int) (Math.min(jMin2, ((jMax / 65536) + j4) * 65536) - jMax);
                    long[] jArr2 = new long[m24033(iMin)];
                    C5838 c58310 = c5838M24039;
                    int iM24018 = m24016(i6, (jMax - j3) + j4, iArr, i7);
                    long j5 = jMin2;
                    long j6 = ((long) iMin) + jMax;
                    m24031(jArr2, (int) jMax, iMin, iArr, iM24018, m24016(iM24018, j6, iArr, i7), i4);
                    c5838M24039 = m24035(c58310, m24034(iMin, jArr2));
                    i7 = i7;
                    i6 = i6;
                    jMin2 = j5;
                    jMax = j6;
                    j4 = 1;
                }
                C5838 c58311 = c5838M24039;
                long j7 = jMin2;
                return j7 < j2 ? m24035(c58311, m24039((int) (j2 - j7), false)) : c58311;
            }
        }
        return c5838;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24031(long[] jArr, int i, int i2, int[] iArr, int i3, int i4, int i5) {
        long j = ((long) i) + ((long) i2);
        while (i3 < i4) {
            int iMax = Math.max(i, iArr[i3]);
            int iMin = (int) Math.min(j, ((long) iArr[i3]) + ((long) i5));
            if (iMax < iMin) {
                m24042(iMax - i, iMin - i, jArr);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m24042(int i, int i2, long[] jArr) {
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
    public static int m24016(int i, long j, int[] iArr, int i2) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m24037(int i) {
        if (i <= 0 || i > 65536) {
            throw new IllegalArgumentException("Invalid dirty bitmap length");
        }
        return m24033(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m24043(C5838 c5838) {
        m24036(c5838);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C17127 m24036(C5838 c5838) {
        if (c5838 == null) {
            return new C17127(0, 0, false, false, false, 0L, 0L);
        }
        C5838 c5839 = c5838.f19806;
        C5838 c58310 = c5838.f19804;
        int i = c5838.f19801;
        long j = c5838.f19800;
        long j2 = c5838.f19805;
        boolean z = c5838.f19803;
        int i2 = c5838.f19808;
        long[] jArr = c5838.f19807;
        if (!c5838.m16054()) {
            C17127 c17127M24036 = m24036(c58310);
            C17127 c17127M24037 = m24036(c5839);
            int iMax = Math.max(c17127M24036.f54615, c17127M24037.f54615) + 1;
            long j3 = ((long) c17127M24036.f54620) + ((long) c17127M24037.f54620);
            int i3 = (int) j3;
            if (j3 != i3) {
                throw new ArithmeticException();
            }
            boolean z2 = c17127M24036.f54616 || c17127M24037.f54616;
            long jM24038 = m24038(c17127M24036.f54619, c17127M24037.f54619);
            long jM24039 = m24038(48L, m24038(c17127M24036.f54614, c17127M24037.f54614));
            if (i != iMax || i2 != i3 || z != z2 || jArr != null || j2 != jM24038 || j != jM24039 || Math.abs(c17127M24036.f54615 - c17127M24037.f54615) > 1) {
                throw new IllegalStateException("Invalid dirty AVL branch");
            }
            C5838 c58311 = c58310;
            while (!c58311.m16054()) {
                c58311 = c58311.f19806;
            }
            C5838 c58312 = c5839;
            while (!c58312.m16054()) {
                c58312 = c58312.f19804;
            }
            if (c58311.m16053() && c58312.m16053() && c58311.f19802 == c58312.f19802) {
                throw new IllegalStateException("Adjacent dirty runs were not merged");
            }
            return new C17127(iMax, i3, z2, c17127M24036.f54618, c17127M24037.f54617, jM24038, jM24039);
        }
        if (i2 <= 0 || i != 1) {
            throw new IllegalStateException("Invalid dirty leaf");
        }
        if (!c5838.m16052()) {
            boolean z3 = c5838.f19802;
            if (z != z3) {
                throw new IllegalStateException("Invalid uniform dirty leaf");
            }
            if (j2 == 0 && j == 48) {
                return new C17127(1, c5838.f19808, z3, z3, z3, 0L, 48L);
            }
            throw new IllegalStateException("Invalid uniform dirty budget");
        }
        if (i2 > 65536 || jArr.length != m24033(i2) || c5838.f19802) {
            throw new IllegalStateException("Invalid bitmap dirty leaf");
        }
        int i4 = i2 & 63;
        if (i4 != 0 && (jArr[jArr.length - 1] >>> i4) != 0) {
            throw new IllegalStateException("Dirty bitmap has trailing bits");
        }
        boolean zM24044 = m24044(0, jArr);
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
        int i6 = c5838.f19808;
        return new C17127(1, i6, true, zM24044, m24044(i6 - 1, jArr), length, j6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14306 m24027(C5838 c5838, int i) {
        if (c5838 == null) {
            if (i == 0) {
                return C14306.f46870;
            }
            throw new IndexOutOfBoundsException(C8479.m22141(i, "offset="));
        }
        C5838 c5839 = c5838.f19804;
        boolean z = c5838.f19802;
        C5838 c58310 = c5838.f19806;
        int i2 = c5838.f19808;
        int i3 = 0;
        C5838 c58311 = null;
        if (i == 0) {
            return new C14306(c58311, c5838, i3);
        }
        if (i == i2) {
            return new C14306(c5838, c58311, i3);
        }
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "offset="));
        }
        if (c5838.m16054()) {
            return !c5838.m16052() ? new C14306(m24019(i, z), m24019(i2 - i, z), i3) : new C14306(m24040(c5838, 0, i), m24040(c5838, i, i2 - i), i3);
        }
        int i4 = c5839.f19808;
        if (i < i4) {
            C14306 c14306M24027 = m24027(c5839, i);
            return new C14306(c14306M24027.f46871, m24035(c14306M24027.f46872, c58310), i3);
        }
        if (i == i4) {
            return new C14306(c5839, c58310, i3);
        }
        C14306 c14306M24028 = m24027(c58310, i - i4);
        return new C14306(m24035(c5839, c14306M24028.f46871), c14306M24028.f46872, i3);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C5838 m24013(C5838 c5838, C5838 c5839) {
        if (c5838 == null) {
            return c5839;
        }
        if (c5839 == null) {
            return c5838;
        }
        int i = c5838.f19801;
        int i2 = c5839.f19801;
        if (i > i2 + 1) {
            return m24021(m24041(c5838.f19804, m24013(c5838.f19806, c5839)));
        }
        if (i2 > i + 1) {
            return m24021(m24041(m24013(c5838, c5839.f19804), c5839.f19806));
        }
        return m24041(c5838, c5839);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5838 m24021(C5838 c5838) {
        C5838 c5839 = c5838.f19804;
        C5838 c58310 = c5838.f19806;
        int i = (c5839 == null ? 0 : c5839.f19801) - (c58310 == null ? 0 : c58310.f19801);
        if (i > 1) {
            C5838 c58311 = c5839.f19804;
            int i2 = c58311 == null ? 0 : c58311.f19801;
            C5838 c58312 = c5839.f19806;
            return i2 >= (c58312 != null ? c58312.f19801 : 0) ? m24041(c58311, m24041(c58312, c58310)) : m24041(m24041(c58311, c58312.f19804), m24041(c58312.f19806, c58310));
        }
        if (i >= -1) {
            return c5838;
        }
        C5838 c58313 = c58310.f19806;
        int i3 = c58313 == null ? 0 : c58313.f19801;
        C5838 c58314 = c58310.f19804;
        return i3 >= (c58314 != null ? c58314.f19801 : 0) ? m24041(m24041(c5839, c58314), c58313) : m24041(m24041(c5839, c58314.f19804), m24041(c58314.f19806, c58313));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C10778 m24032(C5838 c5838) {
        if (c5838.m16054()) {
            return new C10778(null, c5838);
        }
        C10778 c10778M24032 = m24032(c5838.f19806);
        return new C10778(m24013(c5838.f19804, c10778M24032.f36728), c10778M24032.f36727);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C10778 m24014(C5838 c5838) {
        if (c5838.m16054()) {
            return new C10778(null, c5838);
        }
        C10778 c10778M24014 = m24014(c5838.f19804);
        return new C10778(m24013(c10778M24014.f36728, c5838.f19806), c10778M24014.f36727);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C5838 m24035(C5838 c5838, C5838 c5839) {
        if (c5838 == null) {
            return c5839;
        }
        if (c5839 == null) {
            return c5838;
        }
        C5838 c58310 = c5838;
        while (!c58310.m16054()) {
            c58310 = c58310.f19806;
        }
        C5838 c58311 = c5839;
        while (!c58311.m16054()) {
            c58311 = c58311.f19804;
        }
        if (!c58310.m16053() || !c58311.m16053() || c58310.f19802 != c58311.f19802) {
            return m24013(c5838, c5839);
        }
        C10778 c10778M24032 = m24032(c5838);
        C10778 c10778M24014 = m24014(c5839);
        long j = ((long) c10778M24032.f36727.f19808) + ((long) c10778M24014.f36727.f19808);
        if (j > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        return m24035(m24035(c10778M24032.f36728, m24019((int) j, c10778M24032.f36727.f19802)), c10778M24014.f36728);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C5838 m24040(C5838 c5838, int i, int i2) {
        long[] jArr = new long[m24033(i2)];
        for (int i3 = 0; i3 < i2; i3++) {
            if (m24044(i + i3, c5838.f19807)) {
                int i4 = i3 >>> 6;
                jArr[i4] = jArr[i4] | (1 << (i3 & 63));
            }
        }
        return m24034(i2, jArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C5838 m24034(int i, long[] jArr) {
        if (i <= 0 || i > 65536 || jArr.length != m24033(i)) {
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
            return m24019(i, false);
        }
        if (z2) {
            return m24019(i, true);
        }
        return new C5838(null, null, jArr, i, 1, false, true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m24044(int i, long[] jArr) {
        return ((1 << (i & 63)) & jArr[i >>> 6]) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5838 m24019(int i, boolean z) {
        return new C5838(null, null, null, i, 1, z, z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C5838 m24041(C5838 c5838, C5838 c5839) {
        long j = ((long) c5838.f19808) + ((long) c5839.f19808);
        int i = (int) j;
        if (j == i) {
            return new C5838(c5838, c5839, null, i, Math.max(c5838.f19801, c5839.f19801) + 1, false, c5838.f19803 || c5839.f19803);
        }
        throw new ArithmeticException();
    }
}
