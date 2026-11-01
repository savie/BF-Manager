package l;

/* JADX INFO: renamed from: l.ܰ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13826 extends C16171 {
    @Override // l.C16171
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33648(AbstractC4777 abstractC4777) {
        if (abstractC4777.f16795 == EnumC2890.FILL_ARRAY_DATA && C22292.m49457(abstractC4777.mo13244())) {
            throw C22292.f72826;
        }
        super.mo33648(abstractC4777);
    }

    @Override // l.C16171
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33649(AbstractC7124 abstractC7124) {
        switch (C2535.f10042[abstractC7124.f23823.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (C22292.m49457(abstractC7124.mo19023()[0])) {
                    throw C22292.f72826;
                }
                return;
            case 4:
                if (C22292.m49457(abstractC7124.mo19024())) {
                    throw C22292.f72826;
                }
                return;
            case 5:
                if (C22292.m49457(abstractC7124.mo19020())) {
                    throw C22292.f72826;
                }
                return;
            case 6:
                if (abstractC7124.mo19019().f23823 == EnumC9947.CONSTANT && ((Number) ((C14760) abstractC7124.mo19019()).f48276).intValue() == 0) {
                    throw C22292.f72825;
                }
                return;
            case 7:
                if (abstractC7124.mo19019().f23823 == EnumC9947.CONSTANT && ((Number) ((C14760) abstractC7124.mo19019()).f48276).longValue() == 0) {
                    throw C22292.f72825;
                }
                return;
            case 8:
                if (abstractC7124.mo19020().f23823 == EnumC9947.CONSTANT && ((Number) ((C14760) abstractC7124.mo19020()).f48276).intValue() < 0) {
                    throw C22292.f72827;
                }
                return;
            case 9:
                for (AbstractC7124 abstractC7125 : abstractC7124.mo19023()) {
                    if (abstractC7125.f23823 == EnumC9947.CONSTANT && ((Number) ((C14760) abstractC7125).f48276).intValue() < 0) {
                        throw C22292.f72827;
                    }
                }
                return;
            default:
                return;
        }
    }
}
