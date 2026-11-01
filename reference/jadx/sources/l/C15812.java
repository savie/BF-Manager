package l;

import java.util.Collections;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15812 extends AbstractC3110 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC3110 f51171;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC0618 f51172;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 f51173;

    public C15812(AbstractC23903 abstractC23903, AbstractC0618 abstractC0618, AbstractC3110 abstractC3110) {
        super(abstractC23903);
        this.f51172 = abstractC0618;
        this.f51173 = C21825.of((Object) abstractC0618);
        this.f51171 = abstractC3110;
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo3802(Predicate predicate, EnumC10167 enumC10167) {
        return (predicate == null || predicate.test(this.f51172)) ? this.f51173 : Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo3803(AbstractC11242 abstractC11242, Predicate predicate, EnumC10167 enumC10167) {
        AbstractC0618 abstractC0618 = this.f51172;
        return (abstractC0618.f77453 == abstractC11242 && (predicate == null || predicate.test(abstractC0618))) ? this.f51173 : Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3110 mo9328(AbstractC23903 abstractC23903) {
        if (this.f51172 == abstractC23903) {
            return this.f51171;
        }
        return null;
    }
}
