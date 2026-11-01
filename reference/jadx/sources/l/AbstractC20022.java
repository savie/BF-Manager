package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T9A4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20022 implements Collection {
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo39302();

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        C13465.m32966(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return mo39302() == 0;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo39302();
    }

    public final String toString() {
        return C4892.m13616(this, ", ", "[", "]", new InterfaceC15456() { // from class: l.ܺ۟۠
            @Override // l.InterfaceC15456
            public final Object invoke(Object obj) {
                return obj == this.f51134 ? "(this Collection)" : String.valueOf(obj);
            }
        }, 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C14750.m35367(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C13465.m32966(objArr, "array");
        return C14750.m35368(this, objArr);
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C13465.m32965(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }
}
