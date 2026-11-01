package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8512 {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        C13638.requireNonNull(predicate2);
        return new C11334(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new C5295(9, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        C13638.requireNonNull(predicate2);
        return new C11334(predicate, predicate2, 1);
    }
}
