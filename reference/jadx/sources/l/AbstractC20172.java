package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4Q9 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20172 extends AbstractC16644 implements Collection {
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((C18822) this).f60999.iterator();
    }

    @Override // java.util.Collection
    public final int size() {
        return ((C18822) this).f60999.size();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return ((C18822) this).f60999.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return ((C18822) this).f60999.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((C18822) this).f60999.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return ((C18822) this).f60999.add(obj);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return ((C18822) this).f60999.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((C18822) this).f60999.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return ((C18822) this).f60999.addAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return ((C18822) this).f60999.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        ((C18822) this).f60999.clear();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ((C18822) this).f60999.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ((C18822) this).f60999.toArray(objArr);
    }
}
