package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77BL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11905 implements Predicate {
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
        return C5383.m14948(((InterfaceC2557) obj).getPath());
    }
}
