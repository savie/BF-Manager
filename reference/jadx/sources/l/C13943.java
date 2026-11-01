package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13943 implements Predicate {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16579 f45891;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45892 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f45893;

    public /* synthetic */ C13943(C6761 c6761, AbstractC16579 abstractC16579) {
        this.f45893 = c6761;
        this.f45891 = abstractC16579;
    }

    public /* synthetic */ C13943(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        this.f45891 = abstractC16579;
        this.f45893 = abstractC165710;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f45892) {
            case 0:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f45892) {
            case 0:
                C23800 c23800 = ((C6761) this.f45893).f22802;
                return c23800.m52428((AbstractC16579) obj, this.f45891, c23800.f76946);
            default:
                return ((AbstractC22015) obj).test(this.f45891, (AbstractC16579) this.f45893);
        }
    }
}
