package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11432 extends AbstractC22015 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10727 f38482;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Predicate f38483;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj2;
        C10727 c10727 = this.f38482;
        AbstractC16579 abstractC16579M26964 = c10727.m26964((AbstractC16579) obj);
        Predicate predicate = this.f38483;
        return predicate.test(abstractC16579M26964) && predicate.test(c10727.m26964(abstractC16579));
    }

    public C11432(C10727 c10727, EnumC18651 enumC18651) {
        this(c10727, enumC18651, new C10085(2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11432(C10727 c10727, EnumC18651 enumC18651, Predicate predicate) {
        super(c10727, enumC18651);
        this.f38482 = c10727;
        this.f38483 = predicate;
    }

    @Override // l.AbstractC22015
    /* JADX INFO: renamed from: ۙ */
    public final C10498 mo3459(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        AbstractC16579 abstractC16579M26965 = this.f38482.m26965(abstractC16579, abstractC165710);
        return m35939(new C5081(this, abstractC16579M26965, abstractC16579M26965));
    }
}
