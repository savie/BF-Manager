package l;

/* JADX INFO: renamed from: l.᩺ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes.dex */
public final class C24366 extends C15634 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13791 f79067;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12563 f79068;

    public C24366(C13791 c13791, AbstractC12563 abstractC12563) {
        this.f79067 = c13791;
        this.f79068 = abstractC12563;
    }

    @Override // l.C15634
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo37386(AbstractC11071 abstractC11071) {
        switch (C4228.f15427[abstractC11071.f34921.ordinal()]) {
            case 1:
            case 2:
            case 3:
                AbstractC11071[] abstractC11071ArrMo15448 = abstractC11071.mo15448();
                if (C21382.m48616(abstractC11071ArrMo15448[0])) {
                    for (int i = 1; i < abstractC11071ArrMo15448.length; i++) {
                        mo37386(abstractC11071ArrMo15448[i]);
                    }
                    throw C21382.f68099;
                }
                break;
            case 4:
                if (C21382.m48616(abstractC11071.mo27979())) {
                    mo37386(abstractC11071.mo27977());
                    throw C21382.f68099;
                }
                break;
            case 5:
                if (C21382.m48616(abstractC11071.mo20366())) {
                    throw C21382.f68099;
                }
                break;
            case 6:
                if (abstractC11071.mo27977().f34921 == EnumC22260.CONSTANT && ((Number) ((C16380) abstractC11071.mo27977()).f53172).intValue() == 0) {
                    mo37386(abstractC11071.mo27979());
                    throw C21382.f68098;
                }
                break;
            case 7:
                if (abstractC11071.mo27977().f34921 == EnumC22260.CONSTANT && ((Number) ((C16380) abstractC11071.mo27977()).f53172).longValue() == 0) {
                    mo37386(abstractC11071.mo27979());
                    throw C21382.f68098;
                }
                break;
            case 8:
                if (abstractC11071.mo20366().f34921 == EnumC22260.CONSTANT && ((Number) ((C16380) abstractC11071.mo20366()).f53172).intValue() < 0) {
                    throw C21382.f68097;
                }
                break;
            case 9:
                for (AbstractC11071 abstractC11072 : abstractC11071.mo15448()) {
                    if (abstractC11072.f34921 == EnumC22260.CONSTANT) {
                        if (((Number) ((C16380) abstractC11072).f53172).intValue() < 0) {
                            throw C21382.f68097;
                        }
                        mo37386(abstractC11072);
                    }
                }
                break;
        }
        super.mo37386(abstractC11071);
        EnumC22260 enumC22260 = abstractC11071.f34921;
        if (enumC22260 == EnumC22260.LOCAL || enumC22260 == EnumC22260.CONSTANT) {
            return abstractC11071;
        }
        C4448 c4448 = new C4448();
        C13791 c13791 = this.f79067;
        c13791.f43751.add(c4448);
        c13791.f43750.m54765(this.f79068, C4360.m13864(c4448, abstractC11071));
        return c4448;
    }
}
