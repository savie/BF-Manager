package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes.dex */
public final class C23581 implements Set {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Set f76382;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9470 f76383;

    public C23581(C9470 c9470, Set set) {
        this.f76383 = c9470;
        this.f76382 = set;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f76382.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f76382.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f76382.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C10881(this.f76383, this.f76382.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f76382.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f76382.toArray(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        this.f76383.m24246();
        return this.f76382.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        this.f76383.m24246();
        return this.f76382.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f76382.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f76383.m24246();
        return this.f76382.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f76383.m24246();
        return this.f76382.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f76383.m24246();
        return this.f76382.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f76383.m24246();
        this.f76382.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f76382.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f76382.hashCode();
    }

    public final String toString() {
        return this.f76382.toString();
    }
}
