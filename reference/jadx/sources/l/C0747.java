package l;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.֡᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05O1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0747 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3242(Iterable iterable, Comparator comparator) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (!(iterable instanceof SortedSet)) {
            if (!(iterable instanceof InterfaceC20504)) {
                return false;
            }
            comparator2 = ((InterfaceC20504) iterable).comparator();
        } else {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C17308.f55088;
            }
        }
        return comparator.equals(comparator2);
    }
}
