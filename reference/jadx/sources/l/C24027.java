package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24027 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC18805 f77742;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f77743;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m53584(C16567 c16567, long j) {
        AbstractC18805 abstractC18805 = c16567.f53627;
        ArrayList arrayList = c16567.f53634;
        if (abstractC18805 instanceof C20297) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1652 interfaceC1652 = (InterfaceC1652) arrayList.get(i);
            if (interfaceC1652 instanceof C16567) {
                C16567 c16568 = (C16567) interfaceC1652;
                if (c16568.f53627 != abstractC18805) {
                    jMax = Math.max(jMax, m53584(c16568, ((long) c16568.f53628) + j));
                }
            }
        }
        C16567 c16569 = abstractC18805.f61068;
        C16567 c165610 = abstractC18805.f61071;
        if (c16567 != c16569) {
            return jMax;
        }
        long jMo16069 = abstractC18805.mo16069() + j;
        return Math.max(Math.max(jMax, m53584(c165610, jMo16069)), jMo16069 - ((long) c165610.f53628));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m53583(C16567 c16567, long j) {
        AbstractC18805 abstractC18805 = c16567.f53627;
        ArrayList arrayList = c16567.f53634;
        if (abstractC18805 instanceof C20297) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1652 interfaceC1652 = (InterfaceC1652) arrayList.get(i);
            if (interfaceC1652 instanceof C16567) {
                C16567 c16568 = (C16567) interfaceC1652;
                if (c16568.f53627 != abstractC18805) {
                    jMin = Math.min(jMin, m53583(c16568, ((long) c16568.f53628) + j));
                }
            }
        }
        C16567 c16569 = abstractC18805.f61071;
        C16567 c165610 = abstractC18805.f61068;
        if (c16567 != c16569) {
            return jMin;
        }
        long jMo16069 = j - abstractC18805.mo16069();
        return Math.min(Math.min(jMin, m53583(c165610, jMo16069)), jMo16069 - ((long) c165610.f53628));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m53585(C1497 c1497, int i) {
        long j;
        AbstractC18805 abstractC18805 = this.f77742;
        if (!(abstractC18805 instanceof C5381) ? i != 0 ? (abstractC18805 instanceof C14329) : (abstractC18805 instanceof C6127) : ((C5381) abstractC18805).f61074 == i) {
            return 0L;
        }
        C16567 c16567 = (i == 0 ? c1497.f33245 : c1497.f33195).f61068;
        C16567 c16568 = (i == 0 ? c1497.f33245 : c1497.f33195).f61071;
        C16567 c16569 = abstractC18805.f61068;
        C16567 c165610 = abstractC18805.f61068;
        C16567 c165611 = abstractC18805.f61071;
        boolean zContains = c16569.f53625.contains(c16567);
        boolean zContains2 = c165611.f53625.contains(c16568);
        long jMo16069 = abstractC18805.mo16069();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(m53584(c165610, c165610.f53628), ((long) c165610.f53628) + jMo16069);
            }
            if (zContains2) {
                return Math.max(-m53583(c165611, c165611.f53628), ((long) (-c165611.f53628)) + jMo16069);
            }
            return (abstractC18805.mo16069() + ((long) c165610.f53628)) - ((long) c165611.f53628);
        }
        long jM53584 = m53584(c165610, 0L);
        long jM53583 = m53583(c165611, 0L);
        long j2 = jM53584 - jMo16069;
        int i2 = c165611.f53628;
        if (j2 >= (-i2)) {
            j2 += (long) i2;
        }
        long j3 = c165610.f53628;
        long j4 = ((-jM53583) - jMo16069) - j3;
        if (j4 >= j3) {
            j4 -= j3;
        }
        float fM26807 = abstractC18805.f61072.m26807(i);
        if (fM26807 > 0.0f) {
            j = (long) ((j2 / (1.0f - fM26807)) + (j4 / fM26807));
        } else {
            j = 0;
        }
        float f = j;
        return (((long) c165610.f53628) + ((((long) ((f * fM26807) + 0.5f)) + jMo16069) + ((long) C19967.m45884(1.0f, fM26807, f, 0.5f)))) - ((long) c165611.f53628);
    }
}
