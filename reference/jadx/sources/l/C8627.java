package l;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.۠۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8627 {
    public static /* synthetic */ Comparator thenComparing(Comparator comparator, Comparator comparator2) {
        return comparator instanceof InterfaceC7136 ? ((InterfaceC7136) comparator).thenComparing(comparator2) : C2661.$default$thenComparing(comparator, comparator2);
    }

    public static /* synthetic */ Comparator thenComparing(Comparator comparator, Function function) {
        return comparator instanceof InterfaceC7136 ? ((InterfaceC7136) comparator).thenComparing(function) : C2661.$default$thenComparing(comparator, function);
    }

    public static /* synthetic */ Comparator thenComparingInt(Comparator comparator, ToIntFunction toIntFunction) {
        return comparator instanceof InterfaceC7136 ? ((InterfaceC7136) comparator).thenComparingInt(toIntFunction) : C2661.$default$thenComparingInt(comparator, toIntFunction);
    }

    public static /* synthetic */ Comparator thenComparingLong(Comparator comparator, ToLongFunction toLongFunction) {
        return comparator instanceof InterfaceC7136 ? ((InterfaceC7136) comparator).thenComparingLong(toLongFunction) : C2661.$default$thenComparingLong(comparator, toLongFunction);
    }

    public static Comparator reversed(Comparator comparator) {
        return comparator instanceof InterfaceC7136 ? ((InterfaceC7136) comparator).reversed() : Collections.reverseOrder(comparator);
    }
}
