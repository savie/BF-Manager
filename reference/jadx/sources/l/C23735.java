package l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.᩻ܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23735 implements BiPredicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14563 f76802;

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
        C21825 c21825 = (C21825) obj2;
        if (obj instanceof AbstractC16579) {
            return ((AbstractC16579) obj).m39005(c21825);
        }
        if (obj instanceof C11948) {
            return C11397.of(((C11948) obj).m29763()).anyMatch(new C14173(1, this.f76802, c21825));
        }
        return false;
    }
}
