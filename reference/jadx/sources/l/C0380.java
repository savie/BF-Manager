package l;

import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.֡ۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0380 {
    public static LongPredicate $default$and(LongPredicate longPredicate, LongPredicate longPredicate2) {
        C17359.requireNonNull(longPredicate2);
        return new C23150(longPredicate, longPredicate2, 1);
    }

    public static LongPredicate $default$negate(LongPredicate longPredicate) {
        return new C3249(8, longPredicate);
    }

    public static LongPredicate $default$or(LongPredicate longPredicate, LongPredicate longPredicate2) {
        C17359.requireNonNull(longPredicate2);
        return new C23150(longPredicate, longPredicate2, 0);
    }
}
