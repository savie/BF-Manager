package l;

/* JADX INFO: renamed from: l.ܶ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5LD */
/* JADX INFO: loaded from: classes5.dex */
public final class C16095 extends AbstractC8909 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38250(C13791 c13791) {
        boolean z = false;
        if (c13791.f43751.size() == 0) {
            return false;
        }
        int[] iArr = new int[C22874.m51600(c13791)];
        C24498 c24498 = c13791.f43750;
        C2868 c2868 = new C2868(iArr);
        for (AbstractC12563 first = c24498.getFirst(); first != null; first = first.m31273()) {
            C22874.m51594(first, c2868, true);
        }
        AbstractC12563 first2 = c13791.f43750.getFirst();
        while (first2 != null) {
            if (first2.f40344 == EnumC20768.ASSIGN && first2.mo11730().f34921 == EnumC22260.LOCAL) {
                C4448 c4448 = (C4448) first2.mo11730();
                if (iArr[c4448.f15916] == 0) {
                    AbstractC11071 abstractC11071Mo11728 = first2.mo11728();
                    if (abstractC11071Mo11728 instanceof AbstractC11905) {
                        c13791.f43751.remove(c4448);
                        C0631 c0631 = new C0631(abstractC11071Mo11728);
                        c13791.f43750.m54762(first2, c0631);
                        first2 = c0631;
                        z = true;
                    }
                }
            }
            first2 = first2.m31273();
        }
        return z;
    }
}
