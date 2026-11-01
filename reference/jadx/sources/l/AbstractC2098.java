package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6CN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2098 extends AbstractC20257 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.AbstractC20257, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // l.AbstractC20257, l.InterfaceC5522
    public final void forEach(LongConsumer longConsumer) {
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // l.AbstractC20257, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.InterfaceC14800
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean mo6642(long j) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C23162.f75192;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC14800, l.InterfaceC5522
    public final /* bridge */ /* synthetic */ InterfaceC1288 iterator() {
        return C23162.f75192;
    }

    @Override // l.AbstractC20257, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final /* bridge */ /* synthetic */ InterfaceC20693 spliterator() {
        return C12578.f42048;
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

    @Override // l.AbstractC20257, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC20257, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20257, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20257, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20257, java.util.Collection, l.InterfaceC10441
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C13638.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC20257
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo6644(InterfaceC14800 interfaceC14800) {
        return interfaceC14800.isEmpty();
    }

    @Override // l.AbstractC20257
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6641(InterfaceC14800 interfaceC14800) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20257
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo6643(InterfaceC14800 interfaceC14800) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20257
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo6639(InterfaceC14800 interfaceC14800) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20257, l.InterfaceC14800
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6640(LongPredicate longPredicate) {
        C13638.requireNonNull(longPredicate);
        return false;
    }
}
