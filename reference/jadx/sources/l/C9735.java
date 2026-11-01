package l;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9735 {
    public static /* synthetic */ Object compute(Map map, Object obj, BiFunction biFunction) {
        if (map instanceof InterfaceC4464) {
            return ((InterfaceC4464) map).compute(obj, biFunction);
        }
        return map instanceof ConcurrentMap ? C11666.$default$compute((ConcurrentMap) map, obj, biFunction) : C1972.$default$compute(map, obj, biFunction);
    }

    public static /* synthetic */ Object computeIfAbsent(Map map, Object obj, Function function) {
        if (map instanceof InterfaceC4464) {
            return ((InterfaceC4464) map).computeIfAbsent(obj, function);
        }
        return map instanceof ConcurrentMap ? C11666.$default$computeIfAbsent((ConcurrentMap) map, obj, function) : C1972.$default$computeIfAbsent(map, obj, function);
    }

    public static /* synthetic */ Object computeIfPresent(Map map, Object obj, BiFunction biFunction) {
        if (map instanceof InterfaceC4464) {
            return ((InterfaceC4464) map).computeIfPresent(obj, biFunction);
        }
        return map instanceof ConcurrentMap ? C11666.$default$computeIfPresent((ConcurrentMap) map, obj, biFunction) : C1972.$default$computeIfPresent(map, obj, biFunction);
    }

    public static /* synthetic */ void forEach(Map map, BiConsumer biConsumer) {
        if (map instanceof InterfaceC4464) {
            ((InterfaceC4464) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            C11666.$default$forEach((ConcurrentMap) map, biConsumer);
        } else {
            C1972.$default$forEach(map, biConsumer);
        }
    }

    public static /* synthetic */ Object merge(Map map, Object obj, Object obj2, BiFunction biFunction) {
        if (map instanceof InterfaceC4464) {
            return ((InterfaceC4464) map).merge(obj, obj2, biFunction);
        }
        return map instanceof ConcurrentMap ? C11666.$default$merge((ConcurrentMap) map, obj, obj2, biFunction) : C1972.$default$merge(map, obj, obj2, biFunction);
    }

    public static /* synthetic */ Object putIfAbsent(Map map, Object obj, Object obj2) {
        return map instanceof InterfaceC4464 ? ((InterfaceC4464) map).putIfAbsent(obj, obj2) : C1972.$default$putIfAbsent(map, obj, obj2);
    }

    public static /* synthetic */ boolean remove(Map map, Object obj, Object obj2) {
        return map instanceof InterfaceC4464 ? ((InterfaceC4464) map).remove(obj, obj2) : C1972.$default$remove(map, obj, obj2);
    }

    public static /* synthetic */ Object replace(Map map, Object obj, Object obj2) {
        return map instanceof InterfaceC4464 ? ((InterfaceC4464) map).replace(obj, obj2) : C1972.$default$replace(map, obj, obj2);
    }

    public static /* synthetic */ boolean replace(Map map, Object obj, Object obj2, Object obj3) {
        return map instanceof InterfaceC4464 ? ((InterfaceC4464) map).replace(obj, obj2, obj3) : C1972.$default$replace(map, obj, obj2, obj3);
    }

    public static /* synthetic */ void replaceAll(Map map, BiFunction biFunction) {
        if (map instanceof InterfaceC4464) {
            ((InterfaceC4464) map).replaceAll(biFunction);
        } else if (map instanceof ConcurrentMap) {
            C11666.$default$replaceAll((ConcurrentMap) map, biFunction);
        } else {
            C1972.$default$replaceAll(map, biFunction);
        }
    }

    public static Object getOrDefault(Map map, Object obj, Object obj2) {
        if (map instanceof InterfaceC4464) {
            return ((InterfaceC4464) map).getOrDefault(obj, obj2);
        }
        if (!(map instanceof ConcurrentMap)) {
            return C1972.$default$getOrDefault(map, obj, obj2);
        }
        Object obj3 = ((ConcurrentMap) map).get(obj);
        return obj3 != null ? obj3 : obj2;
    }
}
