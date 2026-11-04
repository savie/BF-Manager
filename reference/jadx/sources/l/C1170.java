package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1170 {
    public static /* synthetic */ InterfaceC20670 parallelStream(Collection collection) {
        return collection instanceof InterfaceC9372 ? ((InterfaceC9372) collection).mo52748parallelStream() : C12465.stream(b(collection), true);
    }

    public static /* synthetic */ boolean removeIf(Collection collection, Predicate predicate) {
        return collection instanceof InterfaceC9372 ? ((InterfaceC9372) collection).removeIf(predicate) : C10118.$default$removeIf(collection, predicate);
    }

    public static /* synthetic */ InterfaceC20670 stream(Collection collection) {
        return collection instanceof InterfaceC9372 ? ((InterfaceC9372) collection).mo52749stream() : C12465.stream(b(collection), false);
    }

    public static /* synthetic */ Object[] toArray(Collection collection, IntFunction intFunction) {
        return collection instanceof InterfaceC9372 ? ((InterfaceC9372) collection).toArray(intFunction) : collection.toArray((Object[]) intFunction.apply(0));
    }

    public static InterfaceC8409 b(Collection collection) {
        if (collection instanceof InterfaceC9372) {
            return ((InterfaceC9372) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return C13629.spliterator((LinkedHashSet) collection, 17);
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C0775(sortedSet, sortedSet);
        }
        if (collection instanceof Set) {
            return C13629.spliterator((Set) collection, 1);
        }
        return collection instanceof List ? C15121.$default$spliterator((List) collection) : C13629.spliterator(collection, 0);
    }

    public static void a(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC9372) {
            ((InterfaceC9372) collection).forEach(consumer);
            return;
        }
        C17359.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
