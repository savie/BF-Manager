package l;

import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.۫ۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12884 {
    public static /* synthetic */ void replaceAll(List list, UnaryOperator unaryOperator) {
        if (list instanceof InterfaceC5427) {
            ((InterfaceC5427) list).replaceAll(unaryOperator);
        } else {
            C15121.$default$replaceAll(list, unaryOperator);
        }
    }

    public static /* synthetic */ void sort(List list, Comparator comparator) {
        if (list instanceof InterfaceC5427) {
            ((InterfaceC5427) list).sort(comparator);
        } else {
            C15121.$default$sort(list, comparator);
        }
    }

    public static /* synthetic */ InterfaceC8409 spliterator(List list) {
        return list instanceof InterfaceC5427 ? ((InterfaceC5427) list).spliterator() : C15121.$default$spliterator(list);
    }
}
