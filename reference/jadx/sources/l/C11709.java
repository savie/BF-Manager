package l;

/* JADX INFO: renamed from: l.ۨ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11709 extends C0647 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9116 f39354;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4777 f39355;

    public C11709(C9116 c9116, AbstractC4777 abstractC4777) {
        this.f39354 = c9116;
        this.f39355 = abstractC4777;
    }

    @Override // l.C0647
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo2942(AbstractC7124 abstractC7124) {
        switch (C2535.f10042[abstractC7124.f23823.ordinal()]) {
            case 1:
            case 2:
            case 3:
                AbstractC7124[] abstractC7124ArrMo19023 = abstractC7124.mo19023();
                if (C22292.m49457(abstractC7124ArrMo19023[0])) {
                    for (int i = 1; i < abstractC7124ArrMo19023.length; i++) {
                        mo2942(abstractC7124ArrMo19023[i]);
                    }
                    throw C22292.f72826;
                }
                break;
            case 4:
                if (C22292.m49457(abstractC7124.mo19024())) {
                    mo2942(abstractC7124.mo19019());
                    throw C22292.f72826;
                }
                break;
            case 5:
                if (C22292.m49457(abstractC7124.mo19020())) {
                    throw C22292.f72826;
                }
                break;
            case 6:
                if (abstractC7124.mo19019().f23823 == EnumC9947.CONSTANT && ((Number) ((C14760) abstractC7124.mo19019()).f48276).intValue() == 0) {
                    mo2942(abstractC7124.mo19024());
                    throw C22292.f72825;
                }
                break;
            case 7:
                if (abstractC7124.mo19019().f23823 == EnumC9947.CONSTANT && ((Number) ((C14760) abstractC7124.mo19019()).f48276).longValue() == 0) {
                    mo2942(abstractC7124.mo19024());
                    throw C22292.f72825;
                }
                break;
            case 8:
                if (abstractC7124.mo19020().f23823 == EnumC9947.CONSTANT && ((Number) ((C14760) abstractC7124.mo19020()).f48276).intValue() < 0) {
                    throw C22292.f72827;
                }
                break;
            case 9:
                for (AbstractC7124 abstractC7125 : abstractC7124.mo19023()) {
                    if (abstractC7125.f23823 == EnumC9947.CONSTANT) {
                        if (((Number) ((C14760) abstractC7125).f48276).intValue() < 0) {
                            throw C22292.f72827;
                        }
                        mo2942(abstractC7125);
                    }
                }
                break;
        }
        super.mo2942(abstractC7124);
        EnumC9947 enumC9947 = abstractC7124.f23823;
        if (enumC9947 == EnumC9947.LOCAL || enumC9947 == EnumC9947.CONSTANT) {
            return abstractC7124;
        }
        C2184 c2184 = new C2184();
        C9116 c9116 = this.f39354;
        c9116.f31044.add(c2184);
        c9116.f31045.m29526(this.f39355, C2660.m8188(c2184, abstractC7124));
        return c2184;
    }
}
