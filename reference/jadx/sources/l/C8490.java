package l;

/* JADX INFO: renamed from: l.۠᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8490 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f29417;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5667 f29418;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19779 f29419;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17661 f29420;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19779 m22165(C17661 c17661) {
        C8490 c8490 = new C8490(c17661);
        int iM41142 = c8490.f29420.m41142();
        while (true) {
            C19779 c19779 = c8490.f29419;
            if (iM41142 >= 0) {
                int[] iArr = c8490.f29417;
                C9754.m24740(iM41142, iArr);
                C16956 c16956M44991 = c19779.m44991(iM41142);
                C12018 c12018M15553 = c8490.f29418.m15553(iM41142);
                C21895 c21895M29911 = c12018M15553.m29911();
                int size = c21895M29911.size();
                boolean z = c12018M15553.m29912() && c21895M29911.m48689().m37185() != null;
                int i = size - 1;
                C16956 c16956M39744 = c16956M44991;
                for (int i2 = 0; i2 < size; i2++) {
                    if (z && i2 == i) {
                        c16956M39744.mo9637();
                        c16956M39744 = c16956M39744.m39744();
                    }
                    AbstractC15546 abstractC15546M15274get = c21895M29911.m15274get(i2);
                    C16251 c16251M37187 = abstractC15546M15274get.m37187();
                    if (c16251M37187 == null) {
                        C16251 c16251M37185 = abstractC15546M15274get.m37185();
                        if (c16251M37185 != null && c16956M39744.get(c16251M37185.m38400()) != null) {
                            c16956M39744.m39745(c16956M39744.get(c16251M37185.m38400()));
                        }
                    } else {
                        C16251 c16251M38402 = c16251M37187.m38402();
                        c16956M39744.getClass();
                        if (!c16251M38402.equals(c16956M39744.get(c16251M38402.m38400()))) {
                            C16251 c16251M39740 = c16956M39744.m39740(c16251M38402.m38386());
                            if (c16251M39740 != null && c16251M39740.m38400() != c16251M38402.m38400()) {
                                c16956M39744.m39745(c16251M39740);
                            }
                            c19779.m44993(abstractC15546M15274get, c16251M38402);
                            c16956M39744.m39746(c16251M38402);
                        }
                    }
                }
                c16956M39744.mo9637();
                C4129 c4129M29916 = c12018M15553.m29916();
                int size2 = c4129M29916.size();
                int iM29918 = c12018M15553.m29918();
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = c4129M29916.get(i3);
                    if (c19779.m44994(i4, i4 == iM29918 ? c16956M39744 : c16956M44991)) {
                        C9754.m24734(i4, iArr);
                    }
                }
                iM41142 = C9754.m24745(0, iArr);
            } else {
                c19779.mo9637();
                return c19779;
            }
        }
    }

    public C8490(C17661 c17661) {
        C5667 c5667M41141 = c17661.m41141();
        int iM36890 = c5667M41141.m36890();
        this.f29420 = c17661;
        this.f29418 = c5667M41141;
        this.f29419 = new C19779(c17661);
        this.f29417 = C9754.m24742(iM36890);
    }
}
