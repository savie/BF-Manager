package l;

/* JADX INFO: renamed from: l.᩵֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20200 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14978 f64842;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11995 f64843;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9757 f64844;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f64845;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11995 m46457(C9757 c9757) {
        C20200 c20200 = new C20200(c9757);
        int iM25434 = c20200.f64844.m25434();
        while (true) {
            C11995 c11995 = c20200.f64843;
            if (iM25434 >= 0) {
                int[] iArr = c20200.f64845;
                C4560.m14320(iM25434, iArr);
                C7521 c7521M30148 = c11995.m30148(iM25434);
                C22438 c22438M36044 = c20200.f64842.m36044(iM25434);
                C15724 c15724M50596 = c22438M36044.m50596();
                int size = c15724M50596.size();
                boolean z = c22438M36044.m50589() && c15724M50596.m37632().m40437() != null;
                int i = size - 1;
                C7521 c7521M20588 = c7521M30148;
                for (int i2 = 0; i2 < size; i2++) {
                    if (z && i2 == i) {
                        c7521M20588.mo15005();
                        c7521M20588 = c7521M20588.m20588();
                    }
                    AbstractC17216 abstractC17216M31617get = c15724M50596.m31617get(i2);
                    C20946 c20946M40435 = abstractC17216M31617get.m40435();
                    if (c20946M40435 == null) {
                        C20946 c20946M40437 = abstractC17216M31617get.m40437();
                        if (c20946M40437 != null && c7521M20588.get(c20946M40437.m47903()) != null) {
                            c7521M20588.m20589(c7521M20588.get(c20946M40437.m47903()));
                        }
                    } else {
                        C20946 c20946M47888 = c20946M40435.m47888();
                        c7521M20588.getClass();
                        if (!c20946M47888.equals(c7521M20588.get(c20946M47888.m47903()))) {
                            C20946 c20946M20585 = c7521M20588.m20585(c20946M47888.m47896());
                            if (c20946M20585 != null && c20946M20585.m47903() != c20946M47888.m47903()) {
                                c7521M20588.m20589(c20946M20585);
                            }
                            c11995.m30151(abstractC17216M31617get, c20946M47888);
                            c7521M20588.m20592(c20946M47888);
                        }
                    }
                }
                c7521M20588.mo15005();
                C24698 c24698M50590 = c22438M36044.m50590();
                int size2 = c24698M50590.size();
                int iM50593 = c22438M36044.m50593();
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = c24698M50590.get(i3);
                    if (c11995.m30152(i4, i4 == iM50593 ? c7521M20588 : c7521M30148)) {
                        C4560.m14326(i4, iArr);
                    }
                }
                iM25434 = C4560.m14323(0, iArr);
            } else {
                c11995.mo15005();
                return c11995;
            }
        }
    }

    public C20200(C9757 c9757) {
        C14978 c14978M25432 = c9757.m25432();
        int iM37668 = c14978M25432.m37668();
        this.f64844 = c9757;
        this.f64842 = c14978M25432;
        this.f64843 = new C11995(c9757);
        this.f64845 = C4560.m14321(iM37668);
    }
}
