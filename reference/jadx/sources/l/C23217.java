package l;

import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23217 {
    public static /* synthetic */ Object compute(ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
        return concurrentMap instanceof InterfaceC3079 ? ((InterfaceC3079) concurrentMap).compute(obj, biFunction) : C15757.$default$compute(concurrentMap, obj, biFunction);
    }

    public static /* synthetic */ Object computeIfAbsent(ConcurrentMap concurrentMap, Object obj, Function function) {
        return concurrentMap instanceof InterfaceC3079 ? ((InterfaceC3079) concurrentMap).computeIfAbsent(obj, function) : C15757.$default$computeIfAbsent(concurrentMap, obj, function);
    }

    public static /* synthetic */ void forEach(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        if (concurrentMap instanceof InterfaceC3079) {
            ((InterfaceC3079) concurrentMap).forEach(biConsumer);
        } else {
            C15757.$default$forEach(concurrentMap, biConsumer);
        }
    }
}
