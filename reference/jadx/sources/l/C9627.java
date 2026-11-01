package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9627 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32415;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f32415) {
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
        switch (this.f32415) {
            case 0:
                return ((AbstractC6741) obj).mo9757();
            default:
                return ((Long) obj).longValue() != -1;
        }
    }
}
