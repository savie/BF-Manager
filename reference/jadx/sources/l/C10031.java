package l;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۤۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUN */
/* JADX INFO: loaded from: classes4.dex */
public final class C10031 extends AbstractC8620 implements List, Cloneable, RandomAccess, Serializable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34241;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient Object f34242;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient Type f34243;

    public C10031() {
        this.f34241 = new ArrayList(10);
    }

    public C10031(ArrayList arrayList) {
        this.f34241 = arrayList;
    }

    public C10031(int i) {
        this.f34241 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Object m25306() {
        return this.f34242;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25313(Object obj) {
        this.f34242 = obj;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Type m25309() {
        return this.f34243;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25307(Type type) {
        this.f34243 = type;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f34241.size();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f34241.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f34241.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f34241.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f34241.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f34241.toArray(objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f34241.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f34241.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f34241.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f34241.addAll(collection);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f34241.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f34241.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f34241.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f34241.clear();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.f34241.set(i, obj);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f34241.add(i, obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.f34241.remove(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f34241.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f34241.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f34241.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f34241.listIterator(i);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f34241.subList(i, i2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f34241.get(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m25308(int i) {
        Object obj = this.f34241.get(i);
        if (obj == null) {
            return 0;
        }
        return C8219.m21529(obj).intValue();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m25310(int i) {
        Object obj = this.f34241.get(i);
        int i2 = C8219.f28613;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15676 m25312(int i) {
        Object obj = this.f34241.get(i);
        if (obj instanceof C15676) {
            return (C15676) obj;
        }
        return (C15676) AbstractC8620.m22395(obj);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C10031 m25311(int i) {
        Object obj = this.f34241.get(i);
        if (obj instanceof C10031) {
            return (C10031) obj;
        }
        return (C10031) AbstractC8620.m22395(obj);
    }

    public final Object clone() {
        return new C10031(new ArrayList(this.f34241));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f34241.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f34241.hashCode();
    }
}
