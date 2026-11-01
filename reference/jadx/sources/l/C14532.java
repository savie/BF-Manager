package l;

/* JADX INFO: renamed from: l.ܳ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L5LD */
/* JADX INFO: loaded from: classes4.dex */
public final class C14532 extends AbstractC10872 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34969(C9116 c9116) {
        boolean z = false;
        if (c9116.f31044.size() == 0) {
            return false;
        }
        int[] iArr = new int[C21005.m47173(c9116)];
        C11834 c11834 = c9116.f31045;
        C18183 c18183 = new C18183(iArr);
        for (AbstractC4777 first = c11834.getFirst(); first != null; first = first.m13247()) {
            C21005.m47166(first, c18183, true);
        }
        AbstractC4777 first2 = c9116.f31045.getFirst();
        while (first2 != null) {
            if (first2.f16795 == EnumC2890.ASSIGN && first2.mo13244().f23823 == EnumC9947.LOCAL) {
                C2184 c2184 = (C2184) first2.mo13244();
                if (iArr[c2184.f7921] == 0) {
                    AbstractC7124 abstractC7124Mo13245 = first2.mo13245();
                    if (abstractC7124Mo13245 instanceof AbstractC17581) {
                        c9116.f31044.remove(c2184);
                        C13245 c13245 = new C13245(abstractC7124Mo13245);
                        c9116.f31045.m29523(first2, c13245);
                        first2 = c13245;
                        z = true;
                    }
                }
            }
            first2 = first2.m13247();
        }
        return z;
    }
}
