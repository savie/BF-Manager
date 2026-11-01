package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1FL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7308 extends AbstractC15735 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return false;
    }

    @Override // l.AbstractC15735, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
    public final void forEach(IntConsumer intConsumer) {
    }

    @Override // java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return C18369.f58582;
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ InterfaceC13431 iterator() {
        return C18369.f58582;
    }

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final /* bridge */ /* synthetic */ InterfaceC20693 spliterator() {
        return C21667.f70272;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C7681.f25444;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11790 spliterator() {
        return C21667.f70272;
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735, java.util.Collection, l.InterfaceC10441
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C13638.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ᩷ */
    public final int[] mo3181() {
        return C8014.f26269;
    }

    @Override // l.AbstractC15735
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo19503(InterfaceC10131 interfaceC10131) {
        return interfaceC10131.isEmpty();
    }

    @Override // l.AbstractC15735
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3172(InterfaceC10131 interfaceC10131) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo3176(InterfaceC10131 interfaceC10131) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo3165(InterfaceC10131 interfaceC10131) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3171(IntPredicate intPredicate) {
        C13638.requireNonNull(intPredicate);
        return false;
    }
}
