package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4562 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20414 f16203;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C2923 f16202 = new C2923(C21825.m48588(), C21825.m48588(), false);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C16576 f16201 = new C16576();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2923 m12713(C7341 c7341, C2923 c2923, C2923 c2924, C2923 c2925) {
        C2923 c2926 = f16202;
        if (c2923 == c2926 && c2924 == c2926 && c2925 == c2926) {
            return c2926;
        }
        C21825 c21825 = c2923.f10989;
        C21825 c21826 = c2923.f10987;
        C21825 c21827 = c2925.f10989;
        C21825 c21828 = c2925.f10987;
        C21825 c21825M12711 = m12711(c7341, c21825, c21827);
        C21825 c21829 = c2924.f10989;
        C21825 c218210 = c2924.f10987;
        C21825 c21825M12712 = m12711(c7341, c21826, c21829);
        C21825 c21825M12713 = m12711(c7341, c2924.f10989, c2925.f10989);
        C21825 c21825M12714 = m12711(c7341, c2923.f10989, c21828);
        C21825 c21825M12715 = m12711(c7341, c21826, c218210);
        return new C2923(m12712(c7341, c21825M12713, c21825M12711, c21825M12712), m12712(c7341, m12711(c7341, c218210, c21828), c21825M12714, c21825M12715), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2923 m12715(C22864 c22864, C2923 c2923, C2923 c2924) {
        int i = C9275.f31533[c22864.mo1803().ordinal()];
        if (i == 1) {
            return m12714((AbstractC8047) c22864, c2923, c2924);
        }
        if (i != 2) {
            return f16202;
        }
        return new C2923(m12711(c22864, c2923.f10989, c2924.f10989), m12712(c22864, c2923.f10987, c2924.f10987), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2923 m12714(AbstractC8047 abstractC8047, C2923 c2923, C2923 c2924) {
        return new C2923(m12712(abstractC8047, c2923.f10989, c2924.f10989), m12711(abstractC8047, c2923.f10987, c2924.f10987), false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2923 m12716(AbstractC8047 abstractC8047, C2923 c2923, C2923 c2924) {
        if (c2923 == null || c2923.f10988) {
            return c2924;
        }
        return c2924.f10988 ? c2923 : new C2923(m12711(abstractC8047, c2923.f10989, c2924.f10989), m12711(abstractC8047, c2923.f10987, c2924.f10987), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21825 m12711(AbstractC8047 abstractC8047, C21825 c21825, C21825 c21826) {
        C21825 c21825M48588 = C21825.m48588();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C5558 c5558 = (C5558) it.next();
            Iterator it2 = c21826.iterator();
            while (it2.hasNext()) {
                C5558 c5559 = (C5558) it2.next();
                if (c5558.f77453 == c5559.f77453 && (c5558.f77447 & 4398046511104L) == 0 && (c5559.f77447 & 4398046511104L) == 0) {
                    this.f16203.m48199(abstractC8047, C23879.f77247);
                    c5559.f77447 |= 4398046511104L;
                    c21825M48588 = c21825M48588.m48591(c5559);
                }
            }
        }
        return c21825M48588;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final C21825 m12712(AbstractC8047 abstractC8047, C21825 c21825, C21825... c21825Arr) {
        for (C21825<C5558> c21826 : c21825Arr) {
            for (C5558 c5558 : c21826) {
                for (C5558 c5559 : c21825) {
                    if (c5559.f77453 == c5558.f77453 && (c5559.f77447 & 4398046511104L) == 0 && (c5558.f77447 & 4398046511104L) == 0) {
                        this.f16203.m48199(abstractC8047, C23879.f77247);
                        c5558.f77447 |= 4398046511104L;
                    }
                }
                c21825 = c21825.m48591(c5558);
            }
        }
        return c21825;
    }

    public C4562(C12343 c12343) {
        this.f16203 = C20414.m46161(c12343);
    }
}
