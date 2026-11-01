package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45HA */
/* JADX INFO: loaded from: classes2.dex */
public class C6184 extends AbstractCollection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19010 f21056;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Collection f21057;

    public C6184(Collection collection, InterfaceC19010 interfaceC19010) {
        this.f21057 = collection;
        this.f21056 = interfaceC19010;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        C18304.m42517(this.f21056.apply(obj));
        return this.f21057.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C18304.m42517(this.f21056.apply(it.next()));
        }
        return this.f21057.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C22808.m50472(this.f21057, this.f21056);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !C22808.m50469(this.f21057, this.f21056);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f21057.iterator();
        it.getClass();
        InterfaceC19010 interfaceC19010 = this.f21056;
        interfaceC19010.getClass();
        return new C17868(it, interfaceC19010);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f21057.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f21057.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f21056.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f21057.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f21056.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f21057.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f21056.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C3051.m9145(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return C3051.m9145(iterator()).toArray(objArr);
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
        Collection collection = this.f21057;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f21056.apply(obj);
        }
        return false;
    }
}
