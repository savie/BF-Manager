package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5941 implements Collection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Collection f20213;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9470 f20214;

    public C5941(C9470 c9470, Collection collection) {
        this.f20214 = c9470;
        this.f20213 = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f20213.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f20213.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20213.contains(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C10881(this.f20214, this.f20213.iterator());
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f20213.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f20213.toArray(objArr);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        this.f20214.m24246();
        return this.f20213.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f20213.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f20214.m24246();
        return this.f20213.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f20214.m24246();
        return this.f20213.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f20214.m24246();
        this.f20213.clear();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.f20213.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f20213.hashCode();
    }

    public final String toString() {
        return this.f20213.toString();
    }
}
