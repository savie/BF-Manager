package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19816 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15340 f63685;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22664 f63686;

    public /* synthetic */ C19816(AbstractC15340 abstractC15340, AbstractC22664 abstractC22664) {
        this.f63685 = abstractC15340;
        this.f63686 = abstractC22664;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f63685.f50096.f6446.m55149((AbstractC22664) ((C7395) obj).f38067.mo50621().f48335, this.f63686);
    }
}
