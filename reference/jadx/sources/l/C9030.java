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

/* JADX INFO: renamed from: l.ۡܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9030 {
    public static /* synthetic */ InterfaceC5046 parallelStream(Collection collection) {
        return collection instanceof InterfaceC10441 ? ((InterfaceC10441) collection).parallelStream() : C21980.stream(b(collection), true);
    }

    public static /* synthetic */ boolean removeIf(Collection collection, Predicate predicate) {
        return collection instanceof InterfaceC10441 ? ((InterfaceC10441) collection).removeIf(predicate) : C19613.$default$removeIf(collection, predicate);
    }

    public static /* synthetic */ InterfaceC5046 stream(Collection collection) {
        return collection instanceof InterfaceC10441 ? ((InterfaceC10441) collection).stream() : C21980.stream(b(collection), false);
    }

    public static /* synthetic */ Object[] toArray(Collection collection, IntFunction intFunction) {
        return collection instanceof InterfaceC10441 ? ((InterfaceC10441) collection).toArray(intFunction) : collection.toArray((Object[]) intFunction.apply(0));
    }

    public static InterfaceC20693 b(Collection collection) {
        if (collection instanceof InterfaceC10441) {
            return ((InterfaceC10441) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return C19988.spliterator((LinkedHashSet) collection, 17);
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C18118(sortedSet, sortedSet);
        }
        if (collection instanceof Set) {
            return C19988.spliterator((Set) collection, 1);
        }
        return collection instanceof List ? C11146.$default$spliterator((List) collection) : C19988.spliterator(collection, 0);
    }

    public static void a(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC10441) {
            ((InterfaceC10441) collection).forEach(consumer);
            return;
        }
        C13638.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
