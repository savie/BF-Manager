package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5081 implements Predicate {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16579 f17721;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22015 f17722;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16579 f17723;

    public /* synthetic */ C5081(AbstractC22015 abstractC22015, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        this.f17722 = abstractC22015;
        this.f17723 = abstractC16579;
        this.f17721 = abstractC165710;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC22015 abstractC22015 = this.f17722;
        abstractC22015.getClass();
        C21825 c21825Mo33523 = ((C10498) obj).f77449.mo33523();
        C10727 c10727 = abstractC22015.f71371;
        return c10727.f36565.m52399((AbstractC16579) c21825Mo33523.f70876, this.f17723) && c10727.f36565.m52399((AbstractC16579) c21825Mo33523.f70877.f70876, this.f17721);
    }
}
