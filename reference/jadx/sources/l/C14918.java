package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ܶ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14918 implements IntPredicate {
    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C23329.$default$and(this, intPredicate);
    }

    public /* synthetic */ IntPredicate negate() {
        return C23329.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C23329.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        return i > 0;
    }
}
