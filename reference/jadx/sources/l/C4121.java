package l;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۘۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05O1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4121 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13216(Iterable iterable, Comparator comparator) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (!(iterable instanceof SortedSet)) {
            if (!(iterable instanceof InterfaceC24259)) {
                return false;
            }
            comparator2 = ((InterfaceC24259) iterable).comparator();
        } else {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C0108.f1051;
            }
        }
        return comparator.equals(comparator2);
    }
}
