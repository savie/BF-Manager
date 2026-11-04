package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11316 implements Collection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Collection f35665;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23251 f35666;

    public C11316(C23251 c23251, Collection collection) {
        this.f35666 = c23251;
        this.f35665 = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f35665.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f35665.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f35665.contains(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C24743(this.f35666, this.f35665.iterator());
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f35665.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f35665.toArray(objArr);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        this.f35666.m52273();
        return this.f35665.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f35665.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f35666.m52273();
        return this.f35665.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f35666.m52273();
        return this.f35665.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f35666.m52273();
        this.f35665.clear();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.f35665.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f35665.hashCode();
    }

    public final String toString() {
        return this.f35665.toString();
    }
}
