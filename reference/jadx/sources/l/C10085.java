package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04V0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10085 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34425;

    public /* synthetic */ C10085(int i) {
        this.f34425 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f34425) {
            case 0:
                break;
            case 1:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f34425) {
            case 0:
                return C13638.nonNull((String) obj);
            case 1:
                return C3128.m9470((AbstractC8774) ((C18630) obj).f60400.f70876);
            default:
                return ((AbstractC16579) obj).mo9484();
        }
    }
}
