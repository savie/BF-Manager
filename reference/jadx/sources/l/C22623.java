package l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.᩹᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22623 {
    public static BiPredicate $default$and(BiPredicate biPredicate, BiPredicate biPredicate2) {
        C13638.requireNonNull(biPredicate2);
        return new C9218(biPredicate, biPredicate2, 1);
    }

    public static BiPredicate $default$negate(BiPredicate biPredicate) {
        return new C5295(6, biPredicate);
    }

    public static BiPredicate $default$or(BiPredicate biPredicate, BiPredicate biPredicate2) {
        C13638.requireNonNull(biPredicate2);
        return new C9218(biPredicate, biPredicate2, 0);
    }
}
