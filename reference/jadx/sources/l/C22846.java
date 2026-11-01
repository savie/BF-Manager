package l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.᩺۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22846 implements BiPredicate {
    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C22623.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiPredicate negate() {
        return C22623.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return C22623.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return ((AbstractC16579) obj).f53222 == ((AbstractC16579) obj2).f53222;
    }
}
