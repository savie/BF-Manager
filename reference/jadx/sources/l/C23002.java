package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23002 implements Predicate {
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
        C21590 c21590 = (C21590) ((Map.Entry) obj).getValue();
        c21590.getClass();
        return System.currentTimeMillis() - c21590.f70050 > 10000;
    }
}
