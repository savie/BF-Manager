package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LAS4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11729 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f39420 = new AtomicInteger();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f39421;

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC11729 mo10716(int i);

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo10717();

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo10718(int i);

    public AbstractC11729(int i) {
        f39420.getAndIncrement();
        this.f39421 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7495 m29309(C16233 c16233, C8472 c8472) {
        if (c8472 == null) {
            c8472 = C23289.f75535;
        }
        C23289 c23289 = c8472.f29378;
        if (c23289 == null || c8472 == C23289.f75535) {
            return C3615.f13295;
        }
        C3615 c3615 = C3615.f13295;
        return C7495.m19996(m29309(c16233, c23289), ((C23018) ((AbstractC2120) c16233.f52365.get(c8472.f29377)).m6671(0)).f74809.f7775);
    }

    /* JADX INFO: renamed from: ܰ */
    public boolean mo10719() {
        return this == C3615.f13295;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29312() {
        return mo10718(mo10717() - 1) == Integer.MAX_VALUE;
    }

    public final int hashCode() {
        return this.f39421;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11729 m29311(AbstractC11729 abstractC11729, AbstractC11729 abstractC117210, boolean z, C13577 c13577) {
        AbstractC11729 c13495;
        AbstractC11729 abstractC117211;
        AbstractC11729 c13496 = abstractC11729;
        AbstractC11729 c13497 = abstractC117210;
        if (c13496 != c13497 && !abstractC11729.equals(abstractC117210)) {
            boolean z2 = c13496 instanceof C7495;
            if (z2 && (c13497 instanceof C7495)) {
                C7495 c7495 = (C7495) c13496;
                AbstractC11729 abstractC117212 = c7495.f24961;
                int i = c7495.f24960;
                C7495 c7496 = (C7495) c13497;
                AbstractC11729 abstractC117213 = c7496.f24961;
                int i2 = c7496.f24960;
                if (c13577 != null) {
                    AbstractC11729 abstractC117214 = (AbstractC11729) c13577.m33182(c7495, c7496);
                    if (abstractC117214 != null) {
                        return abstractC117214;
                    }
                    AbstractC11729 abstractC117215 = (AbstractC11729) c13577.m33182(c7496, c7495);
                    if (abstractC117215 != null) {
                        return abstractC117215;
                    }
                }
                AbstractC11729 abstractC117216 = null;
                if (z) {
                    abstractC117211 = C3615.f13295;
                    if (c7495 != abstractC117211 && c7496 != abstractC117211) {
                        abstractC117211 = null;
                    }
                } else {
                    AbstractC11729 abstractC117217 = C3615.f13295;
                    if (c7495 == abstractC117217 && c7496 == abstractC117217) {
                        abstractC117211 = abstractC117217;
                    } else {
                        if (c7495 == abstractC117217) {
                            c13495 = new C13495(new AbstractC11729[]{abstractC117213, null}, new int[]{i2, Integer.MAX_VALUE});
                        } else if (c7496 == abstractC117217) {
                            c13495 = new C13495(new AbstractC11729[]{abstractC117212, null}, new int[]{i, Integer.MAX_VALUE});
                        } else {
                            abstractC117211 = null;
                        }
                        abstractC117211 = c13495;
                    }
                }
                if (abstractC117211 != null) {
                    if (c13577 != null) {
                        c13577.m33183(c7495, c7496, abstractC117211);
                    }
                    return abstractC117211;
                }
                if (i == i2) {
                    AbstractC11729 abstractC11729M29311 = m29311(abstractC117212, abstractC117213, z, c13577);
                    if (abstractC11729M29311 == abstractC117212) {
                        return c7495;
                    }
                    if (abstractC11729M29311 == abstractC117213) {
                        return c7496;
                    }
                    AbstractC11729 abstractC11729M19996 = C7495.m19996(abstractC11729M29311, i);
                    if (c13577 != null) {
                        c13577.m33183(c7495, c7496, abstractC11729M19996);
                    }
                    return abstractC11729M19996;
                }
                if (c7495 == c7496 || (abstractC117212 != null && abstractC117212.equals(abstractC117213))) {
                    abstractC117216 = abstractC117212;
                }
                if (abstractC117216 != null) {
                    int[] iArr = {i, i2};
                    if (i > i2) {
                        iArr[0] = i2;
                        iArr[1] = i;
                    }
                    AbstractC11729 c13498 = new C13495(new AbstractC11729[]{abstractC117216, abstractC117216}, iArr);
                    if (c13577 != null) {
                        c13577.m33183(c7495, c7496, c13498);
                    }
                    return c13498;
                }
                int[] iArr2 = {i, i2};
                AbstractC11729[] abstractC11729Arr = {abstractC117212, abstractC117213};
                if (i > i2) {
                    iArr2[0] = i2;
                    iArr2[1] = i;
                    abstractC11729Arr = new AbstractC11729[]{abstractC117213, abstractC117212};
                }
                AbstractC11729 c13499 = new C13495(abstractC11729Arr, iArr2);
                if (c13577 != null) {
                    c13577.m33183(c7495, c7496, c13499);
                }
                return c13499;
            }
            if (z) {
                if (c13496 instanceof C3615) {
                    return c13496;
                }
                if (c13497 instanceof C3615) {
                    return c13497;
                }
            }
            if (z2) {
                c13496 = new C13495((C7495) c13496);
            }
            if (c13497 instanceof C7495) {
                c13497 = new C13495((C7495) c13497);
            }
            C13495 c134910 = (C13495) c13496;
            C13495 c134911 = (C13495) c13497;
            if (c13577 != null) {
                AbstractC11729 abstractC117218 = (AbstractC11729) c13577.m33182(c134910, c134911);
                if (abstractC117218 != null) {
                    boolean z3 = C1499.f6053;
                    return abstractC117218;
                }
                AbstractC11729 abstractC117219 = (AbstractC11729) c13577.m33182(c134911, c134910);
                if (abstractC117219 != null) {
                    boolean z4 = C1499.f6053;
                    return abstractC117219;
                }
            }
            int[] iArr3 = c134910.f44596;
            AbstractC11729[] abstractC11729Arr2 = c134910.f44597;
            int length = iArr3.length;
            int[] iArr4 = c134911.f44596;
            AbstractC11729[] abstractC11729Arr3 = c134911.f44597;
            int[] iArrCopyOf = new int[length + iArr4.length];
            int length2 = iArr3.length + iArr4.length;
            AbstractC11729[] abstractC11729Arr4 = new AbstractC11729[length2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < iArr3.length && i4 < iArr4.length) {
                AbstractC11729 abstractC117220 = abstractC11729Arr2[i3];
                AbstractC11729 abstractC117221 = abstractC11729Arr3[i4];
                C13495 c134912 = c134910;
                int i6 = iArr3[i3];
                C13495 c134913 = c134911;
                int i7 = iArr4[i4];
                if (i6 == i7) {
                    boolean z5 = i6 == Integer.MAX_VALUE && abstractC117220 == null && abstractC117221 == null;
                    boolean z6 = (abstractC117220 == null || abstractC117221 == null || !abstractC117220.equals(abstractC117221)) ? false : true;
                    if (z5 || z6) {
                        abstractC11729Arr4[i5] = abstractC117220;
                        iArrCopyOf[i5] = i6;
                    } else {
                        abstractC11729Arr4[i5] = m29311(abstractC117220, abstractC117221, z, c13577);
                        iArrCopyOf[i5] = i6;
                    }
                    i3++;
                } else {
                    if (i6 < i7) {
                        abstractC11729Arr4[i5] = abstractC117220;
                        iArrCopyOf[i5] = i6;
                        i3++;
                    } else {
                        abstractC11729Arr4[i5] = abstractC117221;
                        iArrCopyOf[i5] = i7;
                    }
                    i5++;
                    c134910 = c134912;
                    c134911 = c134913;
                }
                i4++;
                i5++;
                c134910 = c134912;
                c134911 = c134913;
            }
            AbstractC11729 abstractC117222 = c134910;
            AbstractC11729 abstractC117223 = c134911;
            if (i3 < iArr3.length) {
                while (i3 < iArr3.length) {
                    abstractC11729Arr4[i5] = abstractC11729Arr2[i3];
                    iArrCopyOf[i5] = iArr3[i3];
                    i5++;
                    i3++;
                }
            } else {
                while (i4 < iArr4.length) {
                    abstractC11729Arr4[i5] = abstractC11729Arr3[i4];
                    iArrCopyOf[i5] = iArr4[i4];
                    i5++;
                    i4++;
                }
            }
            if (i5 < length2) {
                if (i5 == 1) {
                    AbstractC11729 abstractC11729M19997 = C7495.m19996(abstractC11729Arr4[0], iArrCopyOf[0]);
                    if (c13577 != null) {
                        c13577.m33183(abstractC117222, abstractC117223, abstractC11729M19997);
                    }
                    return abstractC11729M19997;
                }
                abstractC11729Arr4 = (AbstractC11729[]) Arrays.copyOf(abstractC11729Arr4, i5);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
            }
            c13496 = new C13495(abstractC11729Arr4, iArrCopyOf);
            if (c13496.equals(abstractC117222)) {
                if (c13577 != null) {
                    c13577.m33183(abstractC117222, abstractC117223, abstractC117222);
                }
                boolean z7 = C1499.f6053;
                return abstractC117222;
            }
            if (c13496.equals(abstractC117223)) {
                if (c13577 != null) {
                    c13577.m33183(abstractC117222, abstractC117223, abstractC117223);
                }
                boolean z8 = C1499.f6053;
                return abstractC117223;
            }
            HashMap map = new HashMap();
            for (AbstractC11729 abstractC117224 : abstractC11729Arr4) {
                if (!map.containsKey(abstractC117224)) {
                    map.put(abstractC117224, abstractC117224);
                }
            }
            for (int i8 = 0; i8 < abstractC11729Arr4.length; i8++) {
                abstractC11729Arr4[i8] = (AbstractC11729) map.get(abstractC11729Arr4[i8]);
            }
            if (c13577 != null) {
                c13577.m33183(abstractC117222, abstractC117223, c13496);
            }
            boolean z9 = C1499.f6053;
        }
        return c13496;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11729 m29310(AbstractC11729 abstractC11729, C2555 c2555, IdentityHashMap identityHashMap) {
        AbstractC11729 c13495;
        if (abstractC11729.mo10719()) {
            return abstractC11729;
        }
        AbstractC11729 abstractC117210 = (AbstractC11729) identityHashMap.get(abstractC11729);
        if (abstractC117210 != null) {
            return abstractC117210;
        }
        AbstractC11729 abstractC11729M7962 = c2555.m7962(abstractC11729);
        HashMap map = c2555.f10105;
        if (abstractC11729M7962 != null) {
            identityHashMap.put(abstractC11729, abstractC11729M7962);
            return abstractC11729M7962;
        }
        AbstractC11729[] abstractC11729Arr = new AbstractC11729[abstractC11729.mo10717()];
        boolean z = false;
        for (int i = 0; i < abstractC11729Arr.length; i++) {
            AbstractC11729 abstractC11729M29310 = m29310(abstractC11729.mo10716(i), c2555, identityHashMap);
            if (z || abstractC11729M29310 != abstractC11729.mo10716(i)) {
                if (!z) {
                    abstractC11729Arr = new AbstractC11729[abstractC11729.mo10717()];
                    for (int i2 = 0; i2 < abstractC11729.mo10717(); i2++) {
                        abstractC11729Arr[i2] = abstractC11729.mo10716(i2);
                    }
                    z = true;
                }
                abstractC11729Arr[i] = abstractC11729M29310;
            }
        }
        if (!z) {
            if (abstractC11729 != C3615.f13295 && ((AbstractC11729) map.get(abstractC11729)) == null) {
                map.put(abstractC11729, abstractC11729);
            }
            identityHashMap.put(abstractC11729, abstractC11729);
            return abstractC11729;
        }
        if (abstractC11729Arr.length == 0) {
            c13495 = C3615.f13295;
        } else if (abstractC11729Arr.length == 1) {
            c13495 = C7495.m19996(abstractC11729Arr[0], abstractC11729.mo10718(0));
        } else {
            c13495 = new C13495(abstractC11729Arr, ((C13495) abstractC11729).f44596);
        }
        if (c13495 != C3615.f13295 && ((AbstractC11729) map.get(c13495)) == null) {
            map.put(c13495, c13495);
        }
        identityHashMap.put(c13495, c13495);
        identityHashMap.put(abstractC11729, c13495);
        return c13495;
    }
}
