package l;

/* JADX INFO: renamed from: l.ܰۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13549 extends AbstractC22015 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10727 f44720;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return m33135((AbstractC16579) obj, (AbstractC16579) obj2) != EnumC3669.INVALID;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13549(C10727 c10727, EnumC18651 enumC18651) {
        super(c10727, enumC18651);
        this.f44720 = c10727;
    }

    @Override // l.AbstractC22015
    /* JADX INFO: renamed from: ۙ */
    public final C10498 mo3459(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        AbstractC16579 abstractC16579M26965;
        EnumC3669 enumC3669M33135 = m33135(abstractC16579, abstractC165710);
        EnumC3669 enumC3669 = EnumC3669.NUMERIC_OR_BOOLEAN;
        C10727 c10727 = this.f44720;
        if (enumC3669M33135 == enumC3669) {
            abstractC16579M26965 = c10727.m26965(abstractC16579, abstractC165710);
        } else {
            abstractC16579M26965 = c10727.f36572.f14275;
        }
        return m35939(new C5081(this, abstractC16579M26965, abstractC16579M26965));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private EnumC3669 m33135(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        boolean zMo9481 = abstractC16579.mo9481();
        boolean zMo9482 = abstractC165710.mo9481();
        if (zMo9481 && zMo9482) {
            return EnumC3669.NUMERIC_OR_BOOLEAN;
        }
        C10727 c10727 = this.f44720;
        if (zMo9481) {
            return c10727.m26964(abstractC165710).mo9481() ? EnumC3669.NUMERIC_OR_BOOLEAN : EnumC3669.INVALID;
        }
        if (zMo9482) {
            return c10727.m26964(abstractC16579).mo9481() ? EnumC3669.NUMERIC_OR_BOOLEAN : EnumC3669.INVALID;
        }
        return (abstractC16579.mo1939() && abstractC165710.mo1939()) ? EnumC3669.REFERENCE : EnumC3669.INVALID;
    }
}
