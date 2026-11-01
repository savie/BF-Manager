package l;

import java.util.Collection;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۤۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51QH */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC10131 extends Collection, InterfaceC22603 {
    boolean add(int i);

    boolean contains(int i);

    @Override // java.util.Collection
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC22603
    InterfaceC13431 iterator();

    @Override // java.util.Collection
    @Deprecated
    InterfaceC5046 parallelStream();

    @Override // java.util.Collection
    @Deprecated
    boolean remove(Object obj);

    @Override // java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    InterfaceC11790 spliterator();

    @Override // java.util.Collection
    @Deprecated
    InterfaceC5046 stream();

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    boolean mo25754(Integer num);

    /* JADX INFO: renamed from: ۙ */
    boolean mo3171(IntPredicate intPredicate);

    /* JADX INFO: renamed from: ᩷ */
    int[] mo3181();

    /* JADX INFO: renamed from: ᩸ */
    boolean mo3182(int i);
}
