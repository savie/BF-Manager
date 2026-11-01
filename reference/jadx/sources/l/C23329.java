package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.᩺᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23329 {
    public static IntPredicate $default$and(IntPredicate intPredicate, IntPredicate intPredicate2) {
        C13638.requireNonNull(intPredicate2);
        return new C0749(intPredicate, intPredicate2, 1);
    }

    public static IntPredicate $default$negate(IntPredicate intPredicate) {
        return new C5295(7, intPredicate);
    }

    public static IntPredicate $default$or(IntPredicate intPredicate, IntPredicate intPredicate2) {
        C13638.requireNonNull(intPredicate2);
        return new C0749(intPredicate, intPredicate2, 0);
    }
}
