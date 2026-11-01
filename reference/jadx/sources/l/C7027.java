package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7027 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C7027 f23627 = new C7027(null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13378 f23628;

    public C7027(AbstractC13378 abstractC13378) {
        this.f23628 = abstractC13378;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C7027 m18855() {
        return f23627;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7027 m18851(int i, C15682 c15682, boolean z) {
        if (i <= 0) {
            throw new IllegalArgumentException("Non-positive syntax run length");
        }
        C13638.requireNonNull(c15682, "style");
        return new C7027(new C1382(new int[]{i | (z ? Integer.MIN_VALUE : 0)}, new C15682[]{c15682}));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18860() {
        AbstractC13378 abstractC13378 = this.f23628;
        if (abstractC13378 == null) {
            return 0;
        }
        return abstractC13378.f44317;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m18865() {
        AbstractC13378 abstractC13378 = this.f23628;
        if (abstractC13378 == null) {
            return 0;
        }
        return abstractC13378.f44315;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18864(int i, int i2) {
        C13638.checkFromToIndex(i, i2, m18860());
        return i < i2 && m18854(this.f23628, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m18863(int i) {
        C13638.checkIndex(i, m18860());
        AbstractC13378 abstractC13378 = this.f23628;
        while (abstractC13378 instanceof C14084) {
            C14084 c14084 = (C14084) abstractC13378;
            AbstractC13378 abstractC13379 = c14084.f46248;
            int i2 = abstractC13379.f44317;
            if (i < i2) {
                abstractC13378 = abstractC13379;
            } else {
                i -= i2;
                abstractC13378 = c14084.f46249;
            }
        }
        C1382 c1382 = (C1382) abstractC13378;
        int i3 = 0;
        while (true) {
            int i4 = c1382.f5767[i3] & Integer.MAX_VALUE;
            if (i < i4) {
                return c1382.f5768[i3];
            }
            i -= i4;
            i3++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7027 m18866(int i, int i2) {
        C13638.checkFromToIndex(i, i2, m18860());
        C7027 c7027 = f23627;
        if (i == i2) {
            return c7027;
        }
        if (i == 0 && i2 == m18860()) {
            return this;
        }
        AbstractC13378 abstractC13378 = m18850(m18850(this.f23628, i2).f15273, i).f15274;
        return abstractC13378 == null ? c7027 : new C7027(abstractC13378);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7027 m18862(C7027 c7027) {
        C13638.requireNonNull(c7027, "suffix");
        AbstractC13378 abstractC13378 = c7027.f23628;
        if (abstractC13378 == null) {
            return this;
        }
        AbstractC13378 abstractC13379 = this.f23628;
        if (abstractC13379 == null) {
            return c7027;
        }
        long jM18860 = ((long) m18860()) + ((long) c7027.m18860());
        if (jM18860 != ((int) jM18860)) {
            throw new ArithmeticException();
        }
        AbstractC13378 abstractC13378M18857 = m18857(abstractC13379, abstractC13378);
        return abstractC13378M18857 == null ? f23627 : new C7027(abstractC13378M18857);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7027 m18861(int i, int i2, C7027 c7027) {
        AbstractC13378 abstractC13378 = c7027.f23628;
        C13638.checkFromToIndex(i, i2, m18860());
        long jM18860 = ((long) (m18860() - (i2 - i))) + ((long) c7027.m18860());
        if (jM18860 != ((int) jM18860)) {
            throw new ArithmeticException();
        }
        if (i == i2 && abstractC13378 == null) {
            return this;
        }
        if (i == 0 && i2 == m18860()) {
            return c7027;
        }
        C4204 c4204M18850 = m18850(this.f23628, i2);
        AbstractC13378 abstractC13378M18857 = m18857(m18857(m18850(c4204M18850.f15273, i).f15273, abstractC13378), c4204M18850.f15274);
        return abstractC13378M18857 == null ? f23627 : new C7027(abstractC13378M18857);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22550 m18867(C7027 c7027) {
        C13638.requireNonNull(c7027, "other");
        AbstractC13378 abstractC13378 = c7027.f23628;
        AbstractC13378 abstractC13379 = this.f23628;
        if (abstractC13379 == abstractC13378) {
            return null;
        }
        int iMin = Math.min(m18860(), c7027.m18860());
        int iM18847 = iMin != 0 ? m18847(abstractC13379, abstractC13378, iMin, false) : 0;
        if (m18860() != c7027.m18860()) {
            return new C22550(iM18847, Math.max(m18860(), c7027.m18860()));
        }
        if (iM18847 == iMin) {
            return null;
        }
        return new C22550(iM18847, iMin - m18847(abstractC13379, abstractC13378, iMin - iM18847, true));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18847(AbstractC13378 abstractC13378, AbstractC13378 abstractC13379, int i, boolean z) {
        C5616 c5616 = new C5616(abstractC13378, z);
        C5616 c5617 = new C5616(abstractC13379, z);
        int iMin = 0;
        while (iMin < i) {
            if (c5616.f19217 == c5617.f19217 && c5616.f19218 == c5617.f19218) {
                iMin += Math.min(i - iMin, c5616.f19217.f44317 - c5616.f19218);
                if (iMin == i) {
                    return iMin;
                }
                c5616.m15493();
                c5617.m15493();
            } else if ((c5616.f19217 instanceof C14084) && (!(c5617.f19217 instanceof C14084) || c5616.f19217.f44317 >= c5617.f19217.f44317)) {
                c5616.m15491();
            } else if (c5617.f19217 instanceof C14084) {
                c5617.m15491();
            } else {
                if (!((C1382) c5616.f19217).f5768[c5616.f19220].equals(((C1382) c5617.f19217).f5768[c5617.f19220])) {
                    break;
                }
                int iMin2 = Math.min(i - iMin, Math.min(c5616.f19222, c5617.f19222));
                iMin += iMin2;
                c5616.m15492(iMin2);
                c5617.m15492(iMin2);
            }
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7027 m18852(AbstractC13378 abstractC13378) {
        return abstractC13378 == null ? f23627 : new C7027(abstractC13378);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18854(AbstractC13378 abstractC13378, int i, int i2) {
        if (abstractC13378.f44316) {
            if (i != 0 || i2 != abstractC13378.f44317) {
                if (abstractC13378 instanceof C14084) {
                    C14084 c14084 = (C14084) abstractC13378;
                    AbstractC13378 abstractC13379 = c14084.f46248;
                    int i3 = abstractC13379.f44317;
                    if ((i >= i3 || !m18854(abstractC13379, i, Math.min(i2, i3))) && (i2 <= i3 || !m18854(c14084.f46249, Math.max(0, i - i3), i2 - i3))) {
                    }
                } else {
                    C1382 c1382 = (C1382) abstractC13378;
                    int i4 = 0;
                    for (int i5 = 0; i5 < c1382.f44315 && i4 < i2; i5++) {
                        i4 += c1382.f5767[i5] & Integer.MAX_VALUE;
                        if (i4 > i) {
                            C15682 c15682 = c1382.f5768[i5];
                            if ((c15682.m37375() >>> 24) == 6 || (c15682.m37378() >>> 24) == 6) {
                                return true;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4204 m18850(AbstractC13378 abstractC13378, int i) {
        if (i == 0) {
            return new C4204(null, abstractC13378);
        }
        if (i == abstractC13378.f44317) {
            return new C4204(abstractC13378, null);
        }
        if (abstractC13378 instanceof C1382) {
            C1382 c1382 = (C1382) abstractC13378;
            return new C4204(m18848(c1382, 0, i), m18848(c1382, i, c1382.f44317));
        }
        C14084 c14084 = (C14084) abstractC13378;
        AbstractC13378 abstractC13379 = c14084.f46248;
        AbstractC13378 abstractC133710 = c14084.f46249;
        int i2 = abstractC13379.f44317;
        if (i == i2) {
            return new C4204(abstractC13379, abstractC133710);
        }
        if (i < i2) {
            C4204 c4204M18850 = m18850(abstractC13379, i);
            return new C4204(c4204M18850.f15273, m18846(c4204M18850.f15274, abstractC133710));
        }
        C4204 c4204M18851 = m18850(abstractC133710, i - i2);
        return new C4204(m18846(abstractC13379, c4204M18851.f15273), c4204M18851.f15274);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1382 m18848(C1382 c1382, int i, int i2) {
        int[] iArr;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = c1382.f5767;
            iArr = c1382.f5767;
            i3 = iArr2[i5];
            if ((i3 & Integer.MAX_VALUE) + i4 > i) {
                break;
            }
            i5++;
            i4 += i3 & Integer.MAX_VALUE;
        }
        int i6 = (i3 & Integer.MAX_VALUE) + i4;
        int i7 = i5;
        while (i6 < i2) {
            i7++;
            i6 += iArr[i7] & Integer.MAX_VALUE;
        }
        int i8 = i7 + 1;
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i5, i8);
        C15682[] c15682Arr = (C15682[]) Arrays.copyOfRange(c1382.f5768, i5, i8);
        int i9 = 0;
        while (i9 < iArrCopyOfRange.length) {
            int i10 = iArrCopyOfRange[i9];
            int i11 = (i10 & Integer.MAX_VALUE) + i4;
            iArrCopyOfRange[i9] = (i <= i4 ? Integer.MIN_VALUE & i10 : 0) | (Math.min(i2, i11) - Math.max(i, i4));
            i9++;
            i4 = i11;
        }
        return new C1382(iArrCopyOfRange, c15682Arr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC13378 m18857(AbstractC13378 abstractC13378, AbstractC13378 abstractC13379) {
        int i;
        if (abstractC13378 == null) {
            return abstractC13379;
        }
        if (abstractC13379 == null) {
            return abstractC13378;
        }
        C1382 c1382M18849 = m18849(abstractC13378, false);
        C1382 c1382M188410 = m18849(abstractC13379, true);
        int i2 = (c1382M188410.f5767[0] < 0 || !c1382M18849.f5768[c1382M18849.f44315 - 1].equals(c1382M188410.f5768[0])) ? 0 : 1;
        int i3 = c1382M18849.f44315;
        int i4 = c1382M188410.f44315;
        int i5 = (i3 + i4) - i2;
        if (i2 == 0 && i5 > 128 && i3 >= 64 && i4 >= 64) {
            return m18846(abstractC13378, abstractC13379);
        }
        C1382[] c1382Arr = new C1382[4];
        c1382Arr[0] = c1382M18849;
        c1382Arr[1] = c1382M188410;
        AbstractC13378 abstractC13378M18858 = m18858(abstractC13378, false);
        AbstractC13378 abstractC13378M18859 = m18858(abstractC13379, true);
        int i6 = 2;
        while (i5 < 64 && (abstractC13378M18858 != null || abstractC13378M18859 != null)) {
            if (abstractC13378M18858 != null) {
                C1382 c1382M188411 = m18849(abstractC13378M18858, false);
                System.arraycopy(c1382Arr, 0, c1382Arr, 1, i6);
                c1382Arr[0] = c1382M188411;
                abstractC13378M18858 = m18858(abstractC13378M18858, false);
                i = c1382M188411.f44315;
            } else {
                C1382 c1382M188412 = m18849(abstractC13378M18859, true);
                c1382Arr[i6] = c1382M188412;
                abstractC13378M18859 = m18858(abstractC13378M18859, true);
                i = c1382M188412.f44315;
            }
            i5 += i;
            i6++;
        }
        int i7 = i5 <= 128 ? i5 : i5 / 2;
        int[] iArr = new int[i7];
        C15682[] c15682Arr = new C15682[i7];
        C15682 c15682 = null;
        int[] iArr2 = i5 == i7 ? null : new int[i5 - i7];
        C15682[] c15682Arr2 = i5 == i7 ? null : new C15682[i5 - i7];
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            C1382 c1382 = c1382Arr[i9];
            int i10 = 0;
            while (i10 < c1382.f44315) {
                int i11 = c1382.f5767[i10];
                Object obj = c1382.f5768[i10];
                boolean z = i8 >= 0 && i11 >= 0 && c15682.equals(obj);
                if (!z) {
                    i8++;
                }
                int i12 = i8 < i7 ? i8 : i8 - i7;
                int[] iArr3 = i8 < i7 ? iArr : iArr2;
                C15682[] c15682Arr3 = i8 < i7 ? c15682Arr : c15682Arr2;
                if (z) {
                    int i13 = iArr3[i12];
                    iArr3[i12] = (i13 & Integer.MIN_VALUE) | ((i13 & Integer.MAX_VALUE) + (i11 & Integer.MAX_VALUE));
                } else {
                    iArr3[i12] = i11;
                    c15682Arr3[i12] = obj;
                }
                i10++;
                c15682 = obj;
            }
        }
        AbstractC13378 c1383 = new C1382(iArr, c15682Arr);
        if (iArr2 != null) {
            c1383 = new C14084(c1383, new C1382(iArr2, c15682Arr2));
        }
        return m18846(m18846(abstractC13378M18858, c1383), abstractC13378M18859);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1382 m18849(AbstractC13378 abstractC13378, boolean z) {
        while (abstractC13378 instanceof C14084) {
            C14084 c14084 = (C14084) abstractC13378;
            abstractC13378 = z ? c14084.f46248 : c14084.f46249;
        }
        return (C1382) abstractC13378;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC13378 m18858(AbstractC13378 abstractC13378, boolean z) {
        if (abstractC13378 instanceof C1382) {
            return null;
        }
        C14084 c14084 = (C14084) abstractC13378;
        if (z) {
            return m18846(m18858(c14084.f46248, true), c14084.f46249);
        }
        return m18846(c14084.f46248, m18858(c14084.f46249, false));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static AbstractC13378 m18846(AbstractC13378 abstractC13378, AbstractC13378 abstractC13379) {
        if (abstractC13378 == null) {
            return abstractC13379;
        }
        if (abstractC13379 == null) {
            return abstractC13378;
        }
        int i = abstractC13378.f44318;
        int i2 = abstractC13379.f44318;
        if (i > i2 + 1) {
            C14084 c14084 = (C14084) abstractC13378;
            return m18859(c14084.f46248, m18846(c14084.f46249, abstractC13379));
        }
        if (i2 > i + 1) {
            C14084 c14085 = (C14084) abstractC13379;
            return m18859(m18846(abstractC13378, c14085.f46248), c14085.f46249);
        }
        return new C14084(abstractC13378, abstractC13379);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C14084 m18859(AbstractC13378 abstractC13378, AbstractC13378 abstractC13379) {
        int i = abstractC13378.f44318;
        int i2 = abstractC13379.f44318;
        if (i > i2 + 1) {
            C14084 c14084 = (C14084) abstractC13378;
            AbstractC13378 abstractC133710 = c14084.f46248;
            int i3 = abstractC133710.f44318;
            AbstractC13378 abstractC133711 = c14084.f46249;
            if (i3 >= abstractC133711.f44318) {
                return new C14084(abstractC133710, new C14084(abstractC133711, abstractC13379));
            }
            C14084 c14085 = (C14084) abstractC133711;
            return new C14084(new C14084(abstractC133710, c14085.f46248), new C14084(c14085.f46249, abstractC13379));
        }
        if (i2 > i + 1) {
            C14084 c14086 = (C14084) abstractC13379;
            AbstractC13378 abstractC133712 = c14086.f46249;
            int i4 = abstractC133712.f44318;
            AbstractC13378 abstractC133713 = c14086.f46248;
            if (i4 >= abstractC133713.f44318) {
                return new C14084(new C14084(abstractC13378, abstractC133713), abstractC133712);
            }
            C14084 c14087 = (C14084) abstractC133713;
            return new C14084(new C14084(abstractC13378, c14087.f46248), new C14084(c14087.f46249, abstractC133712));
        }
        return new C14084(abstractC13378, abstractC13379);
    }
}
