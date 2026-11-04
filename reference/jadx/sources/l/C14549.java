package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ܰۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14549 {
    public static IntPredicate $default$and(IntPredicate intPredicate, IntPredicate intPredicate2) {
        C17359.requireNonNull(intPredicate2);
        return new C5250(intPredicate, intPredicate2, 1);
    }

    public static IntPredicate $default$negate(IntPredicate intPredicate) {
        return new C3249(7, intPredicate);
    }

    public static IntPredicate $default$or(IntPredicate intPredicate, IntPredicate intPredicate2) {
        C17359.requireNonNull(intPredicate2);
        return new C5250(intPredicate, intPredicate2, 0);
    }
}
