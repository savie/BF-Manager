package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡ۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9372 extends InterfaceC22091 {
    @Override // l.InterfaceC9372, l.InterfaceC22091
    void forEach(Consumer consumer);

    /* JADX INFO: renamed from: parallelStream */
    InterfaceC20670 mo52748parallelStream();

    boolean removeIf(Predicate predicate);

    @Override // l.InterfaceC21938, l.InterfaceC9372, l.InterfaceC22091, l.InterfaceC13409
    InterfaceC8409 spliterator();

    /* JADX INFO: renamed from: stream */
    InterfaceC20670 mo52749stream();

    Object[] toArray(IntFunction intFunction);
}
