package l;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۖ۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2661 {
    public static Comparator $default$thenComparing(Comparator comparator, Comparator comparator2) {
        C17359.requireNonNull(comparator2);
        return new C5601(comparator, comparator2, 0);
    }

    public static Comparator $default$thenComparing(Comparator comparator, Function function) {
        return C8627.thenComparing(comparator, comparing(function));
    }

    public static Comparator $default$thenComparingInt(Comparator comparator, ToIntFunction toIntFunction) {
        return C8627.thenComparing(comparator, comparingInt(toIntFunction));
    }

    public static Comparator $default$thenComparingLong(Comparator comparator, ToLongFunction toLongFunction) {
        return C8627.thenComparing(comparator, comparingLong(toLongFunction));
    }

    public static Comparator reverseOrder() {
        return Collections.reverseOrder();
    }

    public static Comparator comparing(Function function, Comparator comparator) {
        C17359.requireNonNull(function);
        C17359.requireNonNull(comparator);
        return new C5601(comparator, function, 1);
    }

    public static Comparator comparing(Function function) {
        C17359.requireNonNull(function);
        return new C11282(2, function);
    }

    public static Comparator comparingInt(ToIntFunction toIntFunction) {
        C17359.requireNonNull(toIntFunction);
        return new C11282(0, toIntFunction);
    }

    public static Comparator comparingLong(ToLongFunction toLongFunction) {
        C17359.requireNonNull(toLongFunction);
        return new C11282(3, toLongFunction);
    }

    public static Comparator $default$thenComparingDouble(Comparator comparator, ToDoubleFunction toDoubleFunction) {
        C17359.requireNonNull(toDoubleFunction);
        return C8627.thenComparing(comparator, new C11282(1, toDoubleFunction));
    }
}
