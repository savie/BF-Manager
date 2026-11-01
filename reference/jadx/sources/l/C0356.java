package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0356 {
    public static InterfaceC20693 spliterator(Iterable iterable) {
        if (iterable instanceof InterfaceC16585) {
            return ((InterfaceC16585) iterable).spliterator();
        }
        if (iterable instanceof LinkedHashSet) {
            return C19988.spliterator((LinkedHashSet) iterable, 17);
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            return new C18118(sortedSet, sortedSet);
        }
        if (iterable instanceof Set) {
            return C19988.spliterator((Set) iterable, 1);
        }
        if (iterable instanceof List) {
            return C11146.$default$spliterator((List) iterable);
        }
        return iterable instanceof Collection ? C19988.spliterator((Collection) iterable, 0) : C19988.b(iterable.iterator(), 0);
    }

    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof InterfaceC16585) {
            ((InterfaceC16585) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof Collection)) {
            C20113.$default$forEach(iterable, consumer);
            return;
        }
        C13638.requireNonNull(consumer);
        Iterator it = ((Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
