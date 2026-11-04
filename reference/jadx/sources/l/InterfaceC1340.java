package l;

import java.util.Collection;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.֨ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51QH */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1340 extends Collection, InterfaceC20206 {
    boolean add(int i);

    boolean contains(int i);

    @Override // java.util.Collection
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC20206
    InterfaceC6036 iterator();

    @Override // java.util.Collection
    @Deprecated
    InterfaceC20670 parallelStream();

    @Override // java.util.Collection
    @Deprecated
    boolean remove(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    InterfaceC15949 spliterator();

    @Override // java.util.Collection
    @Deprecated
    InterfaceC20670 stream();

    /* JADX INFO: renamed from: ۘ */
    int[] mo2687();

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    boolean mo4931(Integer num);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    boolean mo4932(IntPredicate intPredicate);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    boolean mo4933(int i);
}
