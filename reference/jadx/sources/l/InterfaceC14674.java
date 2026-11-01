package l;

import java.util.Comparator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ܳܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC14674 extends InterfaceC10441 {
    void replaceAll(UnaryOperator unaryOperator);

    void sort(Comparator comparator);

    @Override // java.lang.Iterable, java.util.List, l.InterfaceC14674, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    InterfaceC20693 spliterator();
}
