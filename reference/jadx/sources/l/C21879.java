package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩷ۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21879 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14022 f69713;

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
        return C17359.equals(((C3319) ((C18959) obj)).m10937(), this.f69713);
    }
}
