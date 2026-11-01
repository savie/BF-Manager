package l;

import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2492 {
    public static /* synthetic */ Object compute(ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
        return concurrentMap instanceof InterfaceC5315 ? ((InterfaceC5315) concurrentMap).compute(obj, biFunction) : C11666.$default$compute(concurrentMap, obj, biFunction);
    }

    public static /* synthetic */ Object computeIfAbsent(ConcurrentMap concurrentMap, Object obj, Function function) {
        return concurrentMap instanceof InterfaceC5315 ? ((InterfaceC5315) concurrentMap).computeIfAbsent(obj, function) : C11666.$default$computeIfAbsent(concurrentMap, obj, function);
    }

    public static /* synthetic */ void forEach(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        if (concurrentMap instanceof InterfaceC5315) {
            ((InterfaceC5315) concurrentMap).forEach(biConsumer);
        } else {
            C11666.$default$forEach(concurrentMap, biConsumer);
        }
    }
}
