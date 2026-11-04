package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16537 implements Set {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Set f53533;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23251 f53534;

    public C16537(C23251 c23251, Set set) {
        this.f53534 = c23251;
        this.f53533 = set;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f53533.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f53533.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f53533.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C24743(this.f53534, this.f53533.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f53533.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f53533.toArray(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        this.f53534.m52273();
        return this.f53533.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        this.f53534.m52273();
        return this.f53533.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f53533.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f53534.m52273();
        return this.f53533.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f53534.m52273();
        return this.f53533.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f53534.m52273();
        return this.f53533.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f53534.m52273();
        this.f53533.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f53533.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f53533.hashCode();
    }

    public final String toString() {
        return this.f53533.toString();
    }
}
