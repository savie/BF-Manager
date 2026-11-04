package l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.֫֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1589 implements BiPredicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24710 f5486;

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
        C14769 c14769 = (C14769) obj2;
        if (obj instanceof AbstractC22664) {
            return ((AbstractC22664) obj).m51073(c14769);
        }
        if (obj instanceof C17007) {
            return C23654.of(((C17007) obj).m40085()).anyMatch(new C11283(this.f5486, c14769));
        }
        return false;
    }
}
