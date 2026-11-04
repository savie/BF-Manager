package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9A4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17438 implements Collection {
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

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo4094();

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        C15243.m36590(collection, "elements");
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
        return mo4094() == 0;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo4094();
    }

    public final String toString() {
        return C7743.m21086(this, ", ", "[", "]", new InterfaceC3071() { // from class: l.ܺ۟᩵
            @Override // l.InterfaceC3071
            public final Object invoke(Object obj) {
                return obj == this.f53933 ? "(this Collection)" : String.valueOf(obj);
            }
        }, 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C4803.m14827(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C15243.m36590(objArr, "array");
        return C4803.m14828(this, objArr);
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C15243.m36589(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }
}
