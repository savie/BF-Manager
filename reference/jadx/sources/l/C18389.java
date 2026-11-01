package l;

import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ᩳ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18389 {
    public static LongPredicate $default$and(LongPredicate longPredicate, LongPredicate longPredicate2) {
        C13638.requireNonNull(longPredicate2);
        return new C17683(longPredicate, longPredicate2, 1);
    }

    public static LongPredicate $default$negate(LongPredicate longPredicate) {
        return new C5295(8, longPredicate);
    }

    public static LongPredicate $default$or(LongPredicate longPredicate, LongPredicate longPredicate2) {
        C13638.requireNonNull(longPredicate2);
        return new C17683(longPredicate, longPredicate2, 0);
    }
}
