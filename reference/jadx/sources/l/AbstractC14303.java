package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D26 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14303 extends AbstractC3861 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.AbstractC3861, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2286(char c) {
        return false;
    }

    @Override // l.AbstractC3861, l.InterfaceC6809
    /* JADX INFO: renamed from: ۙ */
    public final void mo2288(InterfaceC1164 interfaceC1164) {
    }

    @Override // l.AbstractC3861, l.InterfaceC23475
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5454(InterfaceC23744 interfaceC23744) {
        return false;
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C19510.f62751;
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ InterfaceC15277 iterator() {
        return C19510.f62751;
    }

    @Override // l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final /* bridge */ /* synthetic */ InterfaceC20693 spliterator() {
        return C15215.f49622;
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

    @Override // l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11687 spliterator() {
        return C15215.f49622;
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3861, java.util.Collection, l.InterfaceC10441
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C13638.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC3861
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo11183(InterfaceC23475 interfaceC23475) {
        return interfaceC23475.isEmpty();
    }

    @Override // l.AbstractC3861
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2290(InterfaceC23475 interfaceC23475) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3861
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo11182(InterfaceC23475 interfaceC23475) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3861
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo11181(InterfaceC23475 interfaceC23475) {
        throw new UnsupportedOperationException();
    }
}
