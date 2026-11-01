package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A7MK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12384 implements Predicate {
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
        AbstractC8047 abstractC8047 = (AbstractC8047) obj;
        return abstractC8047.mo16200() && C3128.m9470((AbstractC5930) abstractC8047);
    }
}
