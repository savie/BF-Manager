package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45HA */
/* JADX INFO: loaded from: classes2.dex */
public class C2870 extends AbstractCollection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6163 f9444;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Collection f9445;

    public C2870(Collection collection, InterfaceC6163 interfaceC6163) {
        this.f9445 = collection;
        this.f9444 = interfaceC6163;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        C12128.m30309(this.f9444.apply(obj));
        return this.f9445.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C12128.m30309(this.f9444.apply(it.next()));
        }
        return this.f9445.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C16625.m39335(this.f9445, this.f9444);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !C16625.m39333(this.f9445, this.f9444);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f9445.iterator();
        it.getClass();
        InterfaceC6163 interfaceC6163 = this.f9444;
        interfaceC6163.getClass();
        return new C23339(it, interfaceC6163);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f9445.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f9445.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f9444.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f9445.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f9444.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f9445.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f9444.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C4583.m14374(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return C4583.m14374(iterator()).toArray(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        Collection collection = this.f9445;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f9444.apply(obj);
        }
        return false;
    }
}
