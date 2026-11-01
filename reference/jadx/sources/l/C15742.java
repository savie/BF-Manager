package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15742 implements Predicate {
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
        InterfaceC19759 interfaceC19759 = (InterfaceC19759) obj;
        return interfaceC19759.mo22124() == interfaceC19759.mo22126() && interfaceC19759.mo22129() == interfaceC19759.mo22123() && interfaceC19759.mo23602() == interfaceC19759.mo23600() && interfaceC19759.mo23598() == interfaceC19759.mo23594();
    }
}
