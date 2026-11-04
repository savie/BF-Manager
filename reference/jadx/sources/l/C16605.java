package l;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 16GA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16605 implements Predicate {
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
        return ((List) ((Map.Entry) obj).getValue()).size() == 1;
    }
}
