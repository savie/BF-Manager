package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25264 implements Predicate {
    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        C17804 c17804 = (C17804) ((Map.Entry) obj).getValue();
        c17804.getClass();
        return System.currentTimeMillis() - c17804.f58424 > 10000;
    }
}
