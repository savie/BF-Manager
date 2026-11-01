package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11757 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39483;

    public /* synthetic */ C11757(int i) {
        this.f39483 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f39483) {
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
        switch (this.f39483) {
            case 0:
                return ((C0787) obj).f3371 == 1;
            default:
                return ((AbstractC8047) obj) instanceof AbstractC5930;
        }
    }
}
