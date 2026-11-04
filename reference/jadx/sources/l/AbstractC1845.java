package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 6CN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1845 extends AbstractC13711 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.AbstractC13711, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // l.AbstractC13711, l.InterfaceC3336
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

    @Override // l.AbstractC13711, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.InterfaceC5574
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo6352(long j) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C14522.f45678;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC5574, l.InterfaceC3336
    public final /* bridge */ /* synthetic */ InterfaceC12285 iterator() {
        return C14522.f45678;
    }

    @Override // l.AbstractC13711, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final /* bridge */ /* synthetic */ InterfaceC8409 spliterator() {
        return C10531.f33499;
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

    @Override // l.AbstractC13711, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC13711, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13711, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13711, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13711, java.util.Collection, l.InterfaceC9372
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C17359.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC13711
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo6353(InterfaceC5574 interfaceC5574) {
        return interfaceC5574.isEmpty();
    }

    @Override // l.AbstractC13711
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6350(InterfaceC5574 interfaceC5574) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13711
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo6351(InterfaceC5574 interfaceC5574) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13711
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo6354(InterfaceC5574 interfaceC5574) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13711, l.InterfaceC5574
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6349(LongPredicate longPredicate) {
        C17359.requireNonNull(longPredicate);
        return false;
    }
}
