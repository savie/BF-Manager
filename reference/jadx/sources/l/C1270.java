package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֨ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1270 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C1270 f4570 = new C1270(null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19169 f4571;

    public C1270(AbstractC19169 abstractC19169) {
        this.f4571 = abstractC19169;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C1270 m4622() {
        return f4570;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1270 m4615(int i, C11974 c11974, boolean z) {
        if (i <= 0) {
            throw new IllegalArgumentException("Non-positive syntax run length");
        }
        C17359.requireNonNull(c11974, "style");
        return new C1270(new C7982(new int[]{i | (z ? Integer.MIN_VALUE : 0)}, new C11974[]{c11974}));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m4628() {
        AbstractC19169 abstractC19169 = this.f4571;
        if (abstractC19169 == null) {
            return 0;
        }
        return abstractC19169.f62019;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m4633() {
        AbstractC19169 abstractC19169 = this.f4571;
        if (abstractC19169 == null) {
            return 0;
        }
        return abstractC19169.f62021;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4632(int i, int i2) {
        C17359.checkFromToIndex(i, i2, m4628());
        return i < i2 && m4621(this.f4571, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m4631(int i) {
        C17359.checkIndex(i, m4628());
        AbstractC19169 abstractC19169 = this.f4571;
        while (abstractC19169 instanceof C4253) {
            C4253 c4253 = (C4253) abstractC19169;
            AbstractC19169 abstractC191610 = c4253.f15481;
            int i2 = abstractC191610.f62019;
            if (i < i2) {
                abstractC19169 = abstractC191610;
            } else {
                i -= i2;
                abstractC19169 = c4253.f15480;
            }
        }
        C7982 c7982 = (C7982) abstractC19169;
        int i3 = 0;
        while (true) {
            int i4 = c7982.f26521[i3] & Integer.MAX_VALUE;
            if (i < i4) {
                return c7982.f26520[i3];
            }
            i -= i4;
            i3++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1270 m4635(int i, int i2) {
        C17359.checkFromToIndex(i, i2, m4628());
        C1270 c1270 = f4570;
        if (i == i2) {
            return c1270;
        }
        if (i == 0 && i2 == m4628()) {
            return this;
        }
        AbstractC19169 abstractC19169 = m4619(m4619(this.f4571, i2).f32660, i).f32661;
        return abstractC19169 == null ? c1270 : new C1270(abstractC19169);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1270 m4630(C1270 c1270) {
        C17359.requireNonNull(c1270, "suffix");
        AbstractC19169 abstractC19169 = c1270.f4571;
        if (abstractC19169 == null) {
            return this;
        }
        AbstractC19169 abstractC191610 = this.f4571;
        if (abstractC191610 == null) {
            return c1270;
        }
        long jM4628 = ((long) m4628()) + ((long) c1270.m4628());
        if (jM4628 != ((int) jM4628)) {
            throw new ArithmeticException();
        }
        AbstractC19169 abstractC19169M4624 = m4624(abstractC191610, abstractC19169);
        return abstractC19169M4624 == null ? f4570 : new C1270(abstractC19169M4624);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1270 m4629(int i, int i2, C1270 c1270) {
        AbstractC19169 abstractC19169 = c1270.f4571;
        C17359.checkFromToIndex(i, i2, m4628());
        long jM4628 = ((long) (m4628() - (i2 - i))) + ((long) c1270.m4628());
        if (jM4628 != ((int) jM4628)) {
            throw new ArithmeticException();
        }
        if (i == i2 && abstractC19169 == null) {
            return this;
        }
        if (i == 0 && i2 == m4628()) {
            return c1270;
        }
        C10218 c10218M4619 = m4619(this.f4571, i2);
        AbstractC19169 abstractC19169M4624 = m4624(m4624(m4619(c10218M4619.f32660, i).f32660, abstractC19169), c10218M4619.f32661);
        return abstractC19169M4624 == null ? f4570 : new C1270(abstractC19169M4624);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0524 m4634(C1270 c1270) {
        C17359.requireNonNull(c1270, "other");
        AbstractC19169 abstractC19169 = c1270.f4571;
        AbstractC19169 abstractC191610 = this.f4571;
        if (abstractC191610 == abstractC19169) {
            return null;
        }
        int iMin = Math.min(m4628(), c1270.m4628());
        int iM4614 = iMin != 0 ? m4614(abstractC191610, abstractC19169, iMin, false) : 0;
        if (m4628() != c1270.m4628()) {
            return new C0524(iM4614, Math.max(m4628(), c1270.m4628()));
        }
        if (iM4614 == iMin) {
            return null;
        }
        return new C0524(iM4614, iMin - m4614(abstractC191610, abstractC19169, iMin - iM4614, true));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m4614(AbstractC19169 abstractC19169, AbstractC19169 abstractC191610, int i, boolean z) {
        C18423 c18423 = new C18423(abstractC19169, z);
        C18423 c18424 = new C18423(abstractC191610, z);
        int iMin = 0;
        while (iMin < i) {
            if (c18423.f60002 == c18424.f60002 && c18423.f59996 == c18424.f59996) {
                iMin += Math.min(i - iMin, c18423.f60002.f62019 - c18423.f59996);
                if (iMin == i) {
                    return iMin;
                }
                c18423.m42948();
                c18424.m42948();
            } else if ((c18423.f60002 instanceof C4253) && (!(c18424.f60002 instanceof C4253) || c18423.f60002.f62019 >= c18424.f60002.f62019)) {
                c18423.m42946();
            } else if (c18424.f60002 instanceof C4253) {
                c18424.m42946();
            } else {
                if (!((C7982) c18423.f60002).f26520[c18423.f59997].equals(((C7982) c18424.f60002).f26520[c18424.f59997])) {
                    break;
                }
                int iMin2 = Math.min(i - iMin, Math.min(c18423.f59999, c18424.f59999));
                iMin += iMin2;
                c18423.m42947(iMin2);
                c18424.m42947(iMin2);
            }
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1270 m4616(AbstractC19169 abstractC19169) {
        return abstractC19169 == null ? f4570 : new C1270(abstractC19169);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4621(AbstractC19169 abstractC19169, int i, int i2) {
        if (abstractC19169.f62018) {
            if (i != 0 || i2 != abstractC19169.f62019) {
                if (abstractC19169 instanceof C4253) {
                    C4253 c4253 = (C4253) abstractC19169;
                    AbstractC19169 abstractC191610 = c4253.f15481;
                    int i3 = abstractC191610.f62019;
                    if ((i >= i3 || !m4621(abstractC191610, i, Math.min(i2, i3))) && (i2 <= i3 || !m4621(c4253.f15480, Math.max(0, i - i3), i2 - i3))) {
                    }
                } else {
                    C7982 c7982 = (C7982) abstractC19169;
                    int i4 = 0;
                    for (int i5 = 0; i5 < c7982.f62021 && i4 < i2; i5++) {
                        i4 += c7982.f26521[i5] & Integer.MAX_VALUE;
                        if (i4 > i) {
                            C11974 c11974 = c7982.f26520[i5];
                            if ((c11974.m30046() >>> 24) == 6 || (c11974.m30047() >>> 24) == 6) {
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
    public static C10218 m4619(AbstractC19169 abstractC19169, int i) {
        if (i == 0) {
            return new C10218(null, abstractC19169);
        }
        if (i == abstractC19169.f62019) {
            return new C10218(abstractC19169, null);
        }
        if (abstractC19169 instanceof C7982) {
            C7982 c7982 = (C7982) abstractC19169;
            return new C10218(m4617(c7982, 0, i), m4617(c7982, i, c7982.f62019));
        }
        C4253 c4253 = (C4253) abstractC19169;
        AbstractC19169 abstractC191610 = c4253.f15481;
        AbstractC19169 abstractC191611 = c4253.f15480;
        int i2 = abstractC191610.f62019;
        if (i == i2) {
            return new C10218(abstractC191610, abstractC191611);
        }
        if (i < i2) {
            C10218 c10218M4619 = m4619(abstractC191610, i);
            return new C10218(c10218M4619.f32660, m4627(c10218M4619.f32661, abstractC191611));
        }
        C10218 c10218M46110 = m4619(abstractC191611, i - i2);
        return new C10218(m4627(abstractC191610, c10218M46110.f32660), c10218M46110.f32661);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7982 m4617(C7982 c7982, int i, int i2) {
        int[] iArr;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = c7982.f26521;
            iArr = c7982.f26521;
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
        C11974[] c11974Arr = (C11974[]) Arrays.copyOfRange(c7982.f26520, i5, i8);
        int i9 = 0;
        while (i9 < iArrCopyOfRange.length) {
            int i10 = iArrCopyOfRange[i9];
            int i11 = (i10 & Integer.MAX_VALUE) + i4;
            iArrCopyOfRange[i9] = (i <= i4 ? Integer.MIN_VALUE & i10 : 0) | (Math.min(i2, i11) - Math.max(i, i4));
            i9++;
            i4 = i11;
        }
        return new C7982(iArrCopyOfRange, c11974Arr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC19169 m4624(AbstractC19169 abstractC19169, AbstractC19169 abstractC191610) {
        int i;
        if (abstractC19169 == null) {
            return abstractC191610;
        }
        if (abstractC191610 == null) {
            return abstractC19169;
        }
        C7982 c7982M4618 = m4618(abstractC19169, false);
        C7982 c7982M4619 = m4618(abstractC191610, true);
        int i2 = (c7982M4619.f26521[0] < 0 || !c7982M4618.f26520[c7982M4618.f62021 - 1].equals(c7982M4619.f26520[0])) ? 0 : 1;
        int i3 = c7982M4618.f62021;
        int i4 = c7982M4619.f62021;
        int i5 = (i3 + i4) - i2;
        if (i2 == 0 && i5 > 128 && i3 >= 64 && i4 >= 64) {
            return m4627(abstractC19169, abstractC191610);
        }
        C7982[] c7982Arr = new C7982[4];
        c7982Arr[0] = c7982M4618;
        c7982Arr[1] = c7982M4619;
        AbstractC19169 abstractC19169M4626 = m4626(abstractC19169, false);
        AbstractC19169 abstractC19169M4627 = m4626(abstractC191610, true);
        int i6 = 2;
        while (i5 < 64 && (abstractC19169M4626 != null || abstractC19169M4627 != null)) {
            if (abstractC19169M4626 != null) {
                C7982 c7982M46110 = m4618(abstractC19169M4626, false);
                System.arraycopy(c7982Arr, 0, c7982Arr, 1, i6);
                c7982Arr[0] = c7982M46110;
                abstractC19169M4626 = m4626(abstractC19169M4626, false);
                i = c7982M46110.f62021;
            } else {
                C7982 c7982M46111 = m4618(abstractC19169M4627, true);
                c7982Arr[i6] = c7982M46111;
                abstractC19169M4627 = m4626(abstractC19169M4627, true);
                i = c7982M46111.f62021;
            }
            i5 += i;
            i6++;
        }
        int i7 = i5 <= 128 ? i5 : i5 / 2;
        int[] iArr = new int[i7];
        C11974[] c11974Arr = new C11974[i7];
        C11974 c11974 = null;
        int[] iArr2 = i5 == i7 ? null : new int[i5 - i7];
        C11974[] c11974Arr2 = i5 == i7 ? null : new C11974[i5 - i7];
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            C7982 c7982 = c7982Arr[i9];
            int i10 = 0;
            while (i10 < c7982.f62021) {
                int i11 = c7982.f26521[i10];
                Object obj = c7982.f26520[i10];
                boolean z = i8 >= 0 && i11 >= 0 && c11974.equals(obj);
                if (!z) {
                    i8++;
                }
                int i12 = i8 < i7 ? i8 : i8 - i7;
                int[] iArr3 = i8 < i7 ? iArr : iArr2;
                C11974[] c11974Arr3 = i8 < i7 ? c11974Arr : c11974Arr2;
                if (z) {
                    int i13 = iArr3[i12];
                    iArr3[i12] = (i13 & Integer.MIN_VALUE) | ((i13 & Integer.MAX_VALUE) + (i11 & Integer.MAX_VALUE));
                } else {
                    iArr3[i12] = i11;
                    c11974Arr3[i12] = obj;
                }
                i10++;
                c11974 = obj;
            }
        }
        AbstractC19169 c7983 = new C7982(iArr, c11974Arr);
        if (iArr2 != null) {
            c7983 = new C4253(c7983, new C7982(iArr2, c11974Arr2));
        }
        return m4627(m4627(abstractC19169M4626, c7983), abstractC19169M4627);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7982 m4618(AbstractC19169 abstractC19169, boolean z) {
        while (abstractC19169 instanceof C4253) {
            C4253 c4253 = (C4253) abstractC19169;
            abstractC19169 = z ? c4253.f15481 : c4253.f15480;
        }
        return (C7982) abstractC19169;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC19169 m4626(AbstractC19169 abstractC19169, boolean z) {
        if (abstractC19169 instanceof C7982) {
            return null;
        }
        C4253 c4253 = (C4253) abstractC19169;
        if (z) {
            return m4627(m4626(c4253.f15481, true), c4253.f15480);
        }
        return m4627(c4253.f15481, m4626(c4253.f15480, false));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC19169 m4627(AbstractC19169 abstractC19169, AbstractC19169 abstractC191610) {
        if (abstractC19169 == null) {
            return abstractC191610;
        }
        if (abstractC191610 == null) {
            return abstractC19169;
        }
        int i = abstractC19169.f62020;
        int i2 = abstractC191610.f62020;
        if (i > i2 + 1) {
            C4253 c4253 = (C4253) abstractC19169;
            return m4625(c4253.f15481, m4627(c4253.f15480, abstractC191610));
        }
        if (i2 > i + 1) {
            C4253 c4254 = (C4253) abstractC191610;
            return m4625(m4627(abstractC19169, c4254.f15481), c4254.f15480);
        }
        return new C4253(abstractC19169, abstractC191610);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C4253 m4625(AbstractC19169 abstractC19169, AbstractC19169 abstractC191610) {
        int i = abstractC19169.f62020;
        int i2 = abstractC191610.f62020;
        if (i > i2 + 1) {
            C4253 c4253 = (C4253) abstractC19169;
            AbstractC19169 abstractC191611 = c4253.f15481;
            int i3 = abstractC191611.f62020;
            AbstractC19169 abstractC191612 = c4253.f15480;
            if (i3 >= abstractC191612.f62020) {
                return new C4253(abstractC191611, new C4253(abstractC191612, abstractC191610));
            }
            C4253 c4254 = (C4253) abstractC191612;
            return new C4253(new C4253(abstractC191611, c4254.f15481), new C4253(c4254.f15480, abstractC191610));
        }
        if (i2 > i + 1) {
            C4253 c4255 = (C4253) abstractC191610;
            AbstractC19169 abstractC191613 = c4255.f15480;
            int i4 = abstractC191613.f62020;
            AbstractC19169 abstractC191614 = c4255.f15481;
            if (i4 >= abstractC191614.f62020) {
                return new C4253(new C4253(abstractC19169, abstractC191614), abstractC191613);
            }
            C4253 c4256 = (C4253) abstractC191614;
            return new C4253(new C4253(abstractC19169, c4256.f15481), new C4253(c4256.f15480, abstractC191613));
        }
        return new C4253(abstractC19169, abstractC191610);
    }
}
