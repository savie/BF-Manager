package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4937 {
    public static InterfaceC8409 spliterator(Iterable iterable) {
        if (iterable instanceof InterfaceC22091) {
            return ((InterfaceC22091) iterable).spliterator();
        }
        if (iterable instanceof LinkedHashSet) {
            return C13629.spliterator((LinkedHashSet) iterable, 17);
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            return new C0775(sortedSet, sortedSet);
        }
        if (iterable instanceof Set) {
            return C13629.spliterator((Set) iterable, 1);
        }
        if (iterable instanceof List) {
            return C15121.$default$spliterator((List) iterable);
        }
        return iterable instanceof Collection ? C13629.spliterator((Collection) iterable, 0) : C13629.spliteratorUnknownSize(iterable.iterator(), 0);
    }

    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof InterfaceC22091) {
            ((InterfaceC22091) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof Collection)) {
            C13689.$default$forEach(iterable, consumer);
            return;
        }
        C17359.requireNonNull(consumer);
        Iterator it = ((Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
