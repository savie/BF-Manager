package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAS4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12450 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f40012 = new AtomicInteger();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f40013;

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC12450 mo15678(int i);

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo15679();

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo15680(int i);

    public AbstractC12450(int i) {
        f40012.getAndIncrement();
        this.f40013 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5213 m30918(C11002 c11002, C2777 c2777) {
        if (c2777 == null) {
            c2777 = C7998.f26546;
        }
        C7998 c7998 = c2777.f9157;
        if (c7998 == null || c2777 == C7998.f26546) {
            return C18461.f60086;
        }
        C18461 c18461 = C18461.f60086;
        return C5213.m15677(m30918(c11002, c7998), ((C7976) ((AbstractC17715) c11002.f34748.get(c2777.f9156)).m41478(0)).f26510.f58209);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo30922() {
        return this == C18461.f60086;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30921() {
        return mo15680(mo15679() - 1) == Integer.MAX_VALUE;
    }

    public final int hashCode() {
        return this.f40013;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC12450 m30920(AbstractC12450 abstractC12450, AbstractC12450 abstractC12451, boolean z, C20875 c20875) {
        AbstractC12450 c20699;
        AbstractC12450 abstractC12452;
        AbstractC12450 c206910 = abstractC12450;
        AbstractC12450 c206911 = abstractC12451;
        if (c206910 != c206911 && !abstractC12450.equals(abstractC12451)) {
            boolean z2 = c206910 instanceof C5213;
            if (z2 && (c206911 instanceof C5213)) {
                C5213 c5213 = (C5213) c206910;
                AbstractC12450 abstractC12453 = c5213.f18392;
                int i = c5213.f18393;
                C5213 c5214 = (C5213) c206911;
                AbstractC12450 abstractC12454 = c5214.f18392;
                int i2 = c5214.f18393;
                if (c20875 != null) {
                    AbstractC12450 abstractC12455 = (AbstractC12450) c20875.m47709(c5213, c5214);
                    if (abstractC12455 != null) {
                        return abstractC12455;
                    }
                    AbstractC12450 abstractC12456 = (AbstractC12450) c20875.m47709(c5214, c5213);
                    if (abstractC12456 != null) {
                        return abstractC12456;
                    }
                }
                AbstractC12450 abstractC12457 = null;
                if (z) {
                    abstractC12452 = C18461.f60086;
                    if (c5213 != abstractC12452 && c5214 != abstractC12452) {
                        abstractC12452 = null;
                    }
                } else {
                    AbstractC12450 abstractC12458 = C18461.f60086;
                    if (c5213 == abstractC12458 && c5214 == abstractC12458) {
                        abstractC12452 = abstractC12458;
                    } else {
                        if (c5213 == abstractC12458) {
                            c20699 = new C20699(new AbstractC12450[]{abstractC12454, null}, new int[]{i2, Integer.MAX_VALUE});
                        } else if (c5214 == abstractC12458) {
                            c20699 = new C20699(new AbstractC12450[]{abstractC12453, null}, new int[]{i, Integer.MAX_VALUE});
                        } else {
                            abstractC12452 = null;
                        }
                        abstractC12452 = c20699;
                    }
                }
                if (abstractC12452 != null) {
                    if (c20875 != null) {
                        c20875.m47710(c5213, c5214, abstractC12452);
                    }
                    return abstractC12452;
                }
                if (i == i2) {
                    AbstractC12450 abstractC12450M30920 = m30920(abstractC12453, abstractC12454, z, c20875);
                    if (abstractC12450M30920 == abstractC12453) {
                        return c5213;
                    }
                    if (abstractC12450M30920 == abstractC12454) {
                        return c5214;
                    }
                    AbstractC12450 abstractC12450M15677 = C5213.m15677(abstractC12450M30920, i);
                    if (c20875 != null) {
                        c20875.m47710(c5213, c5214, abstractC12450M15677);
                    }
                    return abstractC12450M15677;
                }
                if (c5213 == c5214 || (abstractC12453 != null && abstractC12453.equals(abstractC12454))) {
                    abstractC12457 = abstractC12453;
                }
                if (abstractC12457 != null) {
                    int[] iArr = {i, i2};
                    if (i > i2) {
                        iArr[0] = i2;
                        iArr[1] = i;
                    }
                    AbstractC12450 c206912 = new C20699(new AbstractC12450[]{abstractC12457, abstractC12457}, iArr);
                    if (c20875 != null) {
                        c20875.m47710(c5213, c5214, c206912);
                    }
                    return c206912;
                }
                int[] iArr2 = {i, i2};
                AbstractC12450[] abstractC12450Arr = {abstractC12453, abstractC12454};
                if (i > i2) {
                    iArr2[0] = i2;
                    iArr2[1] = i;
                    abstractC12450Arr = new AbstractC12450[]{abstractC12454, abstractC12453};
                }
                AbstractC12450 c206913 = new C20699(abstractC12450Arr, iArr2);
                if (c20875 != null) {
                    c20875.m47710(c5213, c5214, c206913);
                }
                return c206913;
            }
            if (z) {
                if (c206910 instanceof C18461) {
                    return c206910;
                }
                if (c206911 instanceof C18461) {
                    return c206911;
                }
            }
            if (z2) {
                c206910 = new C20699((C5213) c206910);
            }
            if (c206911 instanceof C5213) {
                c206911 = new C20699((C5213) c206911);
            }
            C20699 c206914 = (C20699) c206910;
            C20699 c206915 = (C20699) c206911;
            if (c20875 != null) {
                AbstractC12450 abstractC12459 = (AbstractC12450) c20875.m47709(c206914, c206915);
                if (abstractC12459 != null) {
                    boolean z3 = C17671.f58065;
                    return abstractC12459;
                }
                AbstractC12450 abstractC124510 = (AbstractC12450) c20875.m47709(c206915, c206914);
                if (abstractC124510 != null) {
                    boolean z4 = C17671.f58065;
                    return abstractC124510;
                }
            }
            int[] iArr3 = c206914.f66355;
            AbstractC12450[] abstractC12450Arr2 = c206914.f66354;
            int length = iArr3.length;
            int[] iArr4 = c206915.f66355;
            AbstractC12450[] abstractC12450Arr3 = c206915.f66354;
            int[] iArrCopyOf = new int[length + iArr4.length];
            int length2 = iArr3.length + iArr4.length;
            AbstractC12450[] abstractC12450Arr4 = new AbstractC12450[length2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < iArr3.length && i4 < iArr4.length) {
                AbstractC12450 abstractC124511 = abstractC12450Arr2[i3];
                AbstractC12450 abstractC124512 = abstractC12450Arr3[i4];
                C20699 c206916 = c206914;
                int i6 = iArr3[i3];
                C20699 c206917 = c206915;
                int i7 = iArr4[i4];
                if (i6 == i7) {
                    boolean z5 = i6 == Integer.MAX_VALUE && abstractC124511 == null && abstractC124512 == null;
                    boolean z6 = (abstractC124511 == null || abstractC124512 == null || !abstractC124511.equals(abstractC124512)) ? false : true;
                    if (z5 || z6) {
                        abstractC12450Arr4[i5] = abstractC124511;
                        iArrCopyOf[i5] = i6;
                    } else {
                        abstractC12450Arr4[i5] = m30920(abstractC124511, abstractC124512, z, c20875);
                        iArrCopyOf[i5] = i6;
                    }
                    i3++;
                } else {
                    if (i6 < i7) {
                        abstractC12450Arr4[i5] = abstractC124511;
                        iArrCopyOf[i5] = i6;
                        i3++;
                    } else {
                        abstractC12450Arr4[i5] = abstractC124512;
                        iArrCopyOf[i5] = i7;
                    }
                    i5++;
                    c206914 = c206916;
                    c206915 = c206917;
                }
                i4++;
                i5++;
                c206914 = c206916;
                c206915 = c206917;
            }
            AbstractC12450 abstractC124513 = c206914;
            AbstractC12450 abstractC124514 = c206915;
            if (i3 < iArr3.length) {
                while (i3 < iArr3.length) {
                    abstractC12450Arr4[i5] = abstractC12450Arr2[i3];
                    iArrCopyOf[i5] = iArr3[i3];
                    i5++;
                    i3++;
                }
            } else {
                while (i4 < iArr4.length) {
                    abstractC12450Arr4[i5] = abstractC12450Arr3[i4];
                    iArrCopyOf[i5] = iArr4[i4];
                    i5++;
                    i4++;
                }
            }
            if (i5 < length2) {
                if (i5 == 1) {
                    AbstractC12450 abstractC12450M15678 = C5213.m15677(abstractC12450Arr4[0], iArrCopyOf[0]);
                    if (c20875 != null) {
                        c20875.m47710(abstractC124513, abstractC124514, abstractC12450M15678);
                    }
                    return abstractC12450M15678;
                }
                abstractC12450Arr4 = (AbstractC12450[]) Arrays.copyOf(abstractC12450Arr4, i5);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
            }
            c206910 = new C20699(abstractC12450Arr4, iArrCopyOf);
            if (c206910.equals(abstractC124513)) {
                if (c20875 != null) {
                    c20875.m47710(abstractC124513, abstractC124514, abstractC124513);
                }
                boolean z7 = C17671.f58065;
                return abstractC124513;
            }
            if (c206910.equals(abstractC124514)) {
                if (c20875 != null) {
                    c20875.m47710(abstractC124513, abstractC124514, abstractC124514);
                }
                boolean z8 = C17671.f58065;
                return abstractC124514;
            }
            HashMap map = new HashMap();
            for (AbstractC12450 abstractC124515 : abstractC12450Arr4) {
                if (!map.containsKey(abstractC124515)) {
                    map.put(abstractC124515, abstractC124515);
                }
            }
            for (int i8 = 0; i8 < abstractC12450Arr4.length; i8++) {
                abstractC12450Arr4[i8] = (AbstractC12450) map.get(abstractC12450Arr4[i8]);
            }
            if (c20875 != null) {
                c20875.m47710(abstractC124513, abstractC124514, c206910);
            }
            boolean z9 = C17671.f58065;
        }
        return c206910;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC12450 m30919(AbstractC12450 abstractC12450, C6485 c6485, IdentityHashMap identityHashMap) {
        AbstractC12450 c20699;
        if (abstractC12450.mo30922()) {
            return abstractC12450;
        }
        AbstractC12450 abstractC12451 = (AbstractC12450) identityHashMap.get(abstractC12450);
        if (abstractC12451 != null) {
            return abstractC12451;
        }
        AbstractC12450 abstractC12450M18319 = c6485.m18319(abstractC12450);
        HashMap map = c6485.f21801;
        if (abstractC12450M18319 != null) {
            identityHashMap.put(abstractC12450, abstractC12450M18319);
            return abstractC12450M18319;
        }
        AbstractC12450[] abstractC12450Arr = new AbstractC12450[abstractC12450.mo15679()];
        boolean z = false;
        for (int i = 0; i < abstractC12450Arr.length; i++) {
            AbstractC12450 abstractC12450M30919 = m30919(abstractC12450.mo15678(i), c6485, identityHashMap);
            if (z || abstractC12450M30919 != abstractC12450.mo15678(i)) {
                if (!z) {
                    abstractC12450Arr = new AbstractC12450[abstractC12450.mo15679()];
                    for (int i2 = 0; i2 < abstractC12450.mo15679(); i2++) {
                        abstractC12450Arr[i2] = abstractC12450.mo15678(i2);
                    }
                    z = true;
                }
                abstractC12450Arr[i] = abstractC12450M30919;
            }
        }
        if (!z) {
            if (abstractC12450 != C18461.f60086 && ((AbstractC12450) map.get(abstractC12450)) == null) {
                map.put(abstractC12450, abstractC12450);
            }
            identityHashMap.put(abstractC12450, abstractC12450);
            return abstractC12450;
        }
        if (abstractC12450Arr.length == 0) {
            c20699 = C18461.f60086;
        } else if (abstractC12450Arr.length == 1) {
            c20699 = C5213.m15677(abstractC12450Arr[0], abstractC12450.mo15680(0));
        } else {
            c20699 = new C20699(abstractC12450Arr, ((C20699) abstractC12450).f66355);
        }
        if (c20699 != C18461.f60086 && ((AbstractC12450) map.get(c20699)) == null) {
            map.put(c20699, c20699);
        }
        identityHashMap.put(c20699, c20699);
        identityHashMap.put(abstractC12450, c20699);
        return c20699;
    }
}
