package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11322 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35677;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC25384 f35678;

    public /* synthetic */ C11322(AbstractC25384 abstractC25384, int i) {
        this.f35677 = i;
        this.f35678 = abstractC25384;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f35677) {
            case 0:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f35677) {
            case 0:
                return ((AbstractC22664) obj) != ((AbstractC22664) this.f35678);
            default:
                return ((C12510) obj).f40164 == ((C5816) this.f35678).f38072;
        }
    }
}
