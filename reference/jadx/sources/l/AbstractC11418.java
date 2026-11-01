package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9QE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11418 extends AbstractC18036 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.AbstractC18036, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
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

    @Override // l.AbstractC18036, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC18036, l.InterfaceC13535
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6888(InterfaceC1539 interfaceC1539) {
        return false;
    }

    @Override // l.AbstractC18036, l.InterfaceC19179
    /* JADX INFO: renamed from: ܰ */
    public final void mo6890(InterfaceC17767 interfaceC17767) {
    }

    @Override // l.InterfaceC13535
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5900(float f) {
        return false;
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C19885.f63755;
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ InterfaceC10007 iterator() {
        return C19885.f63755;
    }

    @Override // l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final /* bridge */ /* synthetic */ InterfaceC20693 spliterator() {
        return C3738.f13565;
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

    @Override // l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11501 spliterator() {
        return C3738.f13565;
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC18036, java.util.Collection, l.InterfaceC10441
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C13638.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC18036
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo28525(InterfaceC13535 interfaceC13535) {
        return interfaceC13535.isEmpty();
    }

    @Override // l.AbstractC18036
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo28524(InterfaceC13535 interfaceC13535) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC18036
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo27738(InterfaceC13535 interfaceC13535) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC18036
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo28523(InterfaceC13535 interfaceC13535) {
        throw new UnsupportedOperationException();
    }
}
