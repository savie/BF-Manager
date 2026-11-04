package l;

import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.᩵ۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20517 {
    public static BiPredicate $default$and(BiPredicate biPredicate, BiPredicate biPredicate2) {
        C17359.requireNonNull(biPredicate2);
        return new C1126(biPredicate, biPredicate2, 1);
    }

    public static BiPredicate $default$negate(BiPredicate biPredicate) {
        return new C3249(6, biPredicate);
    }

    public static BiPredicate $default$or(BiPredicate biPredicate, BiPredicate biPredicate2) {
        C17359.requireNonNull(biPredicate2);
        return new C1126(biPredicate, biPredicate2, 0);
    }
}
