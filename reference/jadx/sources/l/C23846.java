package l;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23846 {
    public static /* synthetic */ void sort(List list, Comparator comparator) {
        if (list instanceof InterfaceC14674) {
            ((InterfaceC14674) list).sort(comparator);
        } else {
            C11146.$default$sort(list, comparator);
        }
    }

    public static /* synthetic */ InterfaceC20693 spliterator(List list) {
        return list instanceof InterfaceC14674 ? ((InterfaceC14674) list).spliterator() : C11146.$default$spliterator(list);
    }
}
