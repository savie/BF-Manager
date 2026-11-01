package l;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.۟ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7618 {
    public static Comparator $default$thenComparing(Comparator comparator, Comparator comparator2) {
        C13638.requireNonNull(comparator2);
        return new C14489(comparator, comparator2, 0);
    }

    public static Comparator $default$thenComparing(Comparator comparator, Function function) {
        return C21023.thenComparing(comparator, comparing(function));
    }

    public static Comparator $default$thenComparingLong(Comparator comparator, ToLongFunction toLongFunction) {
        return C21023.thenComparing(comparator, comparingLong(toLongFunction));
    }

    public static Comparator reverseOrder() {
        return Collections.reverseOrder();
    }

    public static Comparator comparing(Function function, Comparator comparator) {
        C13638.requireNonNull(function);
        C13638.requireNonNull(comparator);
        return new C14489(comparator, function, 1);
    }

    public static Comparator comparing(Function function) {
        C13638.requireNonNull(function);
        return new C9405(2, function);
    }

    public static Comparator comparingInt(ToIntFunction toIntFunction) {
        C13638.requireNonNull(toIntFunction);
        return new C9405(0, toIntFunction);
    }

    public static Comparator comparingLong(ToLongFunction toLongFunction) {
        C13638.requireNonNull(toLongFunction);
        return new C9405(3, toLongFunction);
    }

    public static Comparator $default$thenComparingDouble(Comparator comparator, ToDoubleFunction toDoubleFunction) {
        C13638.requireNonNull(toDoubleFunction);
        return C21023.thenComparing(comparator, new C9405(1, toDoubleFunction));
    }
}
