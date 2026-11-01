package l;

/* JADX INFO: renamed from: l.۬ۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12843 extends AbstractC22015 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10727 f42734;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        AbstractC16579 abstractC165710 = (AbstractC16579) obj2;
        C10727 c10727 = this.f42734;
        boolean z = c10727.f36565.m52399(abstractC16579, c10727.f36572.f14220) || c10727.f36565.m52399(abstractC165710, c10727.f36572.f14220);
        EnumC6617 enumC6617 = EnumC6617.VOID;
        return z && !(abstractC16579.m39001(enumC6617) || abstractC165710.m39001(enumC6617));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12843(C10727 c10727, EnumC18651 enumC18651) {
        super(c10727, enumC18651);
        this.f42734 = c10727;
    }

    @Override // l.AbstractC22015
    /* JADX INFO: renamed from: ۙ */
    public final C10498 mo3459(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        return m35939(new C5081(this, m31849(abstractC16579), m31849(abstractC165710)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC16579 m31849(AbstractC16579 abstractC16579) {
        boolean zMo9481 = abstractC16579.mo9481();
        C10727 c10727 = this.f42734;
        if (zMo9481) {
            return c10727.m26964(abstractC16579);
        }
        if (abstractC16579.m39001(EnumC6617.VOID) || abstractC16579.m39001(EnumC6617.BOT) || c10727.f36565.m52399(abstractC16579, c10727.f36572.f14220)) {
            return abstractC16579;
        }
        if (abstractC16579.m39001(EnumC6617.TYPEVAR)) {
            return m31849(abstractC16579.mo18112());
        }
        return c10727.f36572.f14275;
    }
}
