package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4Q9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7959 extends AbstractC10195 implements Collection {
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((C17194) this).f56023.iterator();
    }

    @Override // java.util.Collection
    public final int size() {
        return ((C17194) this).f56023.size();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return ((C17194) this).f56023.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return ((C17194) this).f56023.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((C17194) this).f56023.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return ((C17194) this).f56023.add(obj);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return ((C17194) this).f56023.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((C17194) this).f56023.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return ((C17194) this).f56023.addAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return ((C17194) this).f56023.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        ((C17194) this).f56023.clear();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ((C17194) this).f56023.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ((C17194) this).f56023.toArray(objArr);
    }
}
