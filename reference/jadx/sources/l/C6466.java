package l;

/* JADX INFO: renamed from: l.ۛܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6466 extends C23094 {
    @Override // l.C23094
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18292(AbstractC12563 abstractC12563) {
        if (abstractC12563.f40344 == EnumC20768.FILL_ARRAY_DATA && C21382.m48616(abstractC12563.mo11730())) {
            throw C21382.f68099;
        }
        super.mo18292(abstractC12563);
    }

    @Override // l.C23094
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18291(AbstractC11071 abstractC11071) {
        switch (C4228.f15427[abstractC11071.f34921.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (C21382.m48616(abstractC11071.mo15448()[0])) {
                    throw C21382.f68099;
                }
                return;
            case 4:
                if (C21382.m48616(abstractC11071.mo27979())) {
                    throw C21382.f68099;
                }
                return;
            case 5:
                if (C21382.m48616(abstractC11071.mo20366())) {
                    throw C21382.f68099;
                }
                return;
            case 6:
                if (abstractC11071.mo27977().f34921 == EnumC22260.CONSTANT && ((Number) ((C16380) abstractC11071.mo27977()).f53172).intValue() == 0) {
                    throw C21382.f68098;
                }
                return;
            case 7:
                if (abstractC11071.mo27977().f34921 == EnumC22260.CONSTANT && ((Number) ((C16380) abstractC11071.mo27977()).f53172).longValue() == 0) {
                    throw C21382.f68098;
                }
                return;
            case 8:
                if (abstractC11071.mo20366().f34921 == EnumC22260.CONSTANT && ((Number) ((C16380) abstractC11071.mo20366()).f53172).intValue() < 0) {
                    throw C21382.f68097;
                }
                return;
            case 9:
                for (AbstractC11071 abstractC11072 : abstractC11071.mo15448()) {
                    if (abstractC11072.f34921 == EnumC22260.CONSTANT && ((Number) ((C16380) abstractC11072).f53172).intValue() < 0) {
                        throw C21382.f68097;
                    }
                }
                return;
            default:
                return;
        }
    }
}
