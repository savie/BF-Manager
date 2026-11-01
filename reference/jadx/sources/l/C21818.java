package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L1C0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21818 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC7707 f70868;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f70869;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m48581(C5590 c5590, long j) {
        AbstractC7707 abstractC7707 = c5590.f19194;
        ArrayList arrayList = c5590.f19195;
        if (abstractC7707 instanceof C7001) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC14058 interfaceC14058 = (InterfaceC14058) arrayList.get(i);
            if (interfaceC14058 instanceof C5590) {
                C5590 c5591 = (C5590) interfaceC14058;
                if (c5591.f19194 != abstractC7707) {
                    jMax = Math.max(jMax, m48581(c5591, ((long) c5591.f19193) + j));
                }
            }
        }
        C5590 c5592 = abstractC7707.f25501;
        C5590 c5593 = abstractC7707.f25505;
        if (c5590 != c5592) {
            return jMax;
        }
        long jMo13593 = abstractC7707.mo13593() + j;
        return Math.max(Math.max(jMax, m48581(c5593, jMo13593)), jMo13593 - ((long) c5593.f19193));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m48580(C5590 c5590, long j) {
        AbstractC7707 abstractC7707 = c5590.f19194;
        ArrayList arrayList = c5590.f19195;
        if (abstractC7707 instanceof C7001) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC14058 interfaceC14058 = (InterfaceC14058) arrayList.get(i);
            if (interfaceC14058 instanceof C5590) {
                C5590 c5591 = (C5590) interfaceC14058;
                if (c5591.f19194 != abstractC7707) {
                    jMin = Math.min(jMin, m48580(c5591, ((long) c5591.f19193) + j));
                }
            }
        }
        C5590 c5592 = abstractC7707.f25505;
        C5590 c5593 = abstractC7707.f25501;
        if (c5590 != c5592) {
            return jMin;
        }
        long jMo13593 = j - abstractC7707.mo13593();
        return Math.min(Math.min(jMin, m48580(c5593, jMo13593)), jMo13593 - ((long) c5593.f19193));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m48582(C15781 c15781, int i) {
        long j;
        AbstractC7707 abstractC7707 = this.f70868;
        if (!(abstractC7707 instanceof C4884) ? i != 0 ? (abstractC7707 instanceof C18996) : (abstractC7707 instanceof C15469) : ((C4884) abstractC7707).f25508 == i) {
            return 0L;
        }
        C5590 c5590 = (i == 0 ? c15781.f67376 : c15781.f67409).f25501;
        C5590 c5591 = (i == 0 ? c15781.f67376 : c15781.f67409).f25505;
        C5590 c5592 = abstractC7707.f25501;
        C5590 c5593 = abstractC7707.f25501;
        C5590 c5594 = abstractC7707.f25505;
        boolean zContains = c5592.f19189.contains(c5590);
        boolean zContains2 = c5594.f19189.contains(c5591);
        long jMo13593 = abstractC7707.mo13593();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(m48581(c5593, c5593.f19193), ((long) c5593.f19193) + jMo13593);
            }
            if (zContains2) {
                return Math.max(-m48580(c5594, c5594.f19193), ((long) (-c5594.f19193)) + jMo13593);
            }
            return (abstractC7707.mo13593() + ((long) c5593.f19193)) - ((long) c5594.f19193);
        }
        long jM48581 = m48581(c5593, 0L);
        long jM48580 = m48580(c5594, 0L);
        long j2 = jM48581 - jMo13593;
        int i2 = c5594.f19193;
        if (j2 >= (-i2)) {
            j2 += (long) i2;
        }
        long j3 = c5593.f19193;
        long j4 = ((-jM48580) - jMo13593) - j3;
        if (j4 >= j3) {
            j4 -= j3;
        }
        float fM46584 = abstractC7707.f25504.m46584(i);
        if (fM46584 > 0.0f) {
            j = (long) ((j2 / (1.0f - fM46584)) + (j4 / fM46584));
        } else {
            j = 0;
        }
        float f = j;
        return (((long) c5593.f19193) + ((((long) ((f * fM46584) + 0.5f)) + jMo13593) + ((long) C0280.m1792(1.0f, fM46584, f, 0.5f)))) - ((long) c5594.f19193);
    }
}
