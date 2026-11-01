package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16371 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12138 f52688;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16579 f52689;

    public /* synthetic */ C16371(AbstractC12138 abstractC12138, AbstractC16579 abstractC16579) {
        this.f52688 = abstractC12138;
        this.f52689 = abstractC16579;
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
        return this.f52688.f40634.f36565.m52399((AbstractC16579) ((C10498) obj).f77449.mo33523().f70876, this.f52689);
    }
}
