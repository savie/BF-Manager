package l;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩷ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21023 {
    public static /* synthetic */ Comparator thenComparing(Comparator comparator, Comparator comparator2) {
        return comparator instanceof InterfaceC16085 ? ((InterfaceC16085) comparator).thenComparing(comparator2) : C7618.$default$thenComparing(comparator, comparator2);
    }

    public static /* synthetic */ Comparator thenComparing(Comparator comparator, Function function) {
        return comparator instanceof InterfaceC16085 ? ((InterfaceC16085) comparator).thenComparing(function) : C7618.$default$thenComparing(comparator, function);
    }

    public static /* synthetic */ Comparator thenComparingLong(Comparator comparator, ToLongFunction toLongFunction) {
        return comparator instanceof InterfaceC16085 ? ((InterfaceC16085) comparator).thenComparingLong(toLongFunction) : C7618.$default$thenComparingLong(comparator, toLongFunction);
    }

    public static Comparator reversed(Comparator comparator) {
        return comparator instanceof InterfaceC16085 ? ((InterfaceC16085) comparator).reversed() : Collections.reverseOrder(comparator);
    }
}
