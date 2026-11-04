package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 9QE */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16080 extends AbstractC0660 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.AbstractC0660, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
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

    @Override // l.AbstractC0660, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC0660, l.InterfaceC17572
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2880(InterfaceC1737 interfaceC1737) {
        return false;
    }

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo6580(float f) {
        return false;
    }

    @Override // l.AbstractC0660, l.InterfaceC10113
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2884(InterfaceC0419 interfaceC0419) {
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C13842.f43938;
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ InterfaceC9367 iterator() {
        return C13842.f43938;
    }

    @Override // l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final /* bridge */ /* synthetic */ InterfaceC8409 spliterator() {
        return C24112.f77947;
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

    @Override // l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15906 spliterator() {
        return C24112.f77947;
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC0660, java.util.Collection, l.InterfaceC9372
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C17359.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC0660
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo2886(InterfaceC17572 interfaceC17572) {
        return interfaceC17572.isEmpty();
    }

    @Override // l.AbstractC0660
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2881(InterfaceC17572 interfaceC17572) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC0660
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2882(InterfaceC17572 interfaceC17572) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC0660
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2887(InterfaceC17572 interfaceC17572) {
        throw new UnsupportedOperationException();
    }
}
