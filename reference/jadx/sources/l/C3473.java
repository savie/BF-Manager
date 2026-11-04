package l;

/* JADX INFO: renamed from: l.ۗܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3473 extends AbstractC24357 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1917 f12018;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return m11428((AbstractC22664) obj, (AbstractC22664) obj2) != EnumC21373.INVALID;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3473(C1917 c1917, EnumC21461 enumC21461) {
        super(c1917, enumC21461);
        this.f12018 = c1917;
    }

    @Override // l.AbstractC24357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7395 mo11429(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        AbstractC22664 abstractC22664M6597;
        EnumC21373 enumC21373M11428 = m11428(abstractC22664, abstractC22665);
        EnumC21373 enumC21373 = EnumC21373.NUMERIC_OR_BOOLEAN;
        C1917 c1917 = this.f12018;
        if (enumC21373M11428 == enumC21373) {
            abstractC22664M6597 = c1917.m6597(abstractC22664, abstractC22665);
        } else {
            abstractC22664M6597 = c1917.f6447.f48286;
        }
        return m44271(new C6457(this, abstractC22664M6597, abstractC22664M6597));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private EnumC21373 m11428(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        boolean zMo40452 = abstractC22664.mo40452();
        boolean zMo40453 = abstractC22665.mo40452();
        if (zMo40452 && zMo40453) {
            return EnumC21373.NUMERIC_OR_BOOLEAN;
        }
        C1917 c1917 = this.f12018;
        if (zMo40452) {
            return c1917.m6596(abstractC22665).mo40452() ? EnumC21373.NUMERIC_OR_BOOLEAN : EnumC21373.INVALID;
        }
        if (zMo40453) {
            return c1917.m6596(abstractC22664).mo40452() ? EnumC21373.NUMERIC_OR_BOOLEAN : EnumC21373.INVALID;
        }
        return (abstractC22664.mo9331() && abstractC22665.mo9331()) ? EnumC21373.REFERENCE : EnumC21373.INVALID;
    }
}
