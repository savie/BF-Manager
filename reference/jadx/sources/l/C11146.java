package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۧܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11146 {
    public static void $default$replaceAll(List list, UnaryOperator unaryOperator) {
        C13638.requireNonNull(unaryOperator);
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set(unaryOperator.apply(listIterator.next()));
        }
    }

    public static void $default$sort(List list, Comparator comparator) {
        Object[] array = list.toArray();
        Arrays.sort(array, comparator);
        ListIterator listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
    }

    public static InterfaceC20693 $default$spliterator(List list) {
        if (list instanceof RandomAccess) {
            return new C17165(list);
        }
        return C19988.spliterator(list, 16);
    }
}
