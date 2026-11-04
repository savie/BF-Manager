package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1FL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9542 extends AbstractC6957 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        return false;
    }

    @Override // l.AbstractC6957, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // l.AbstractC6957, l.InterfaceC20206
    public final void forEach(IntConsumer intConsumer) {
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return C0069.f975;
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC6036 iterator() {
        return C0069.f975;
    }

    @Override // l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final /* bridge */ /* synthetic */ InterfaceC8409 spliterator() {
        return C18187.f59429;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C8338.f27328;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }

    @Override // l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15949 spliterator() {
        return C18187.f59429;
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957, java.util.Collection, l.InterfaceC9372
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C17359.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ۘ */
    public final int[] mo2687() {
        return C8052.f26680;
    }

    @Override // l.AbstractC6957
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo19257(InterfaceC1340 interfaceC1340) {
        return interfaceC1340.isEmpty();
    }

    @Override // l.AbstractC6957
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14692(InterfaceC1340 interfaceC1340) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo14696(InterfaceC1340 interfaceC1340) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo14701(InterfaceC1340 interfaceC1340) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4932(IntPredicate intPredicate) {
        C17359.requireNonNull(intPredicate);
        return false;
    }
}
