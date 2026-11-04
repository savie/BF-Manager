package l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.۟᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8146 implements BiPredicate {
    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C20517.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiPredicate negate() {
        return C20517.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return C20517.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return ((AbstractC22664) obj2).m51073(((C2596) obj).f8340);
    }
}
