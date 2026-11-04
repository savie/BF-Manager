package l;

import java.util.Collections;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11123 extends AbstractC16344 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 f35076;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC22970 f35077;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC16344 f35078;

    public C11123(AbstractC11781 abstractC11781, AbstractC22970 abstractC22970, AbstractC16344 abstractC16344) {
        super(abstractC11781);
        this.f35077 = abstractC22970;
        this.f35076 = C14769.of((Object) abstractC22970);
        this.f35078 = abstractC16344;
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo7472(Predicate predicate, EnumC13908 enumC13908) {
        return (predicate == null || predicate.test(this.f35077)) ? this.f35076 : Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo7473(AbstractC19728 abstractC19728, Predicate predicate, EnumC13908 enumC13908) {
        AbstractC22970 abstractC22970 = this.f35077;
        return (abstractC22970.f38072 == abstractC19728 && (predicate == null || predicate.test(abstractC22970))) ? this.f35076 : Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16344 mo7475(AbstractC11781 abstractC11781) {
        if (this.f35077 == abstractC11781) {
            return this.f35078;
        }
        return null;
    }
}
