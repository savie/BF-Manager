package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC10441 extends InterfaceC16585 {
    @Override // l.InterfaceC10441, l.InterfaceC16585
    void forEach(Consumer consumer);

    InterfaceC5046 parallelStream();

    boolean removeIf(Predicate predicate);

    @Override // l.InterfaceC0624, l.InterfaceC10441, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    InterfaceC20693 spliterator();

    InterfaceC5046 stream();

    Object[] toArray(IntFunction intFunction);
}
