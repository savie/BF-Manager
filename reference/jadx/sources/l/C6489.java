package l;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۛܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6489 extends AbstractC12454 implements List, Cloneable, RandomAccess, Serializable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient Object f21806;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f21807;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient Type f21808;

    public C6489() {
        this.f21807 = new ArrayList(10);
    }

    public C6489(ArrayList arrayList) {
        this.f21807 = arrayList;
    }

    public C6489(int i) {
        this.f21807 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m18320() {
        return this.f21806;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18323(Object obj) {
        this.f21806 = obj;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Type m18326() {
        return this.f21808;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18321(Type type) {
        this.f21808 = type;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f21807.size();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f21807.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f21807.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f21807.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f21807.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f21807.toArray(objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f21807.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f21807.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f21807.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f21807.addAll(collection);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f21807.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f21807.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f21807.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f21807.clear();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.f21807.set(i, obj);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f21807.add(i, obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.f21807.remove(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f21807.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f21807.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f21807.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f21807.listIterator(i);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f21807.subList(i, i2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f21807.get(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m18325(int i) {
        Object obj = this.f21807.get(i);
        if (obj == null) {
            return 0;
        }
        return C3134.m10228(obj).intValue();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m18327(int i) {
        Object obj = this.f21807.get(i);
        int i2 = C3134.f10148;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C14691 m18322(int i) {
        Object obj = this.f21807.get(i);
        if (obj instanceof C14691) {
            return (C14691) obj;
        }
        return (C14691) AbstractC12454.m30924(obj);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6489 m18324(int i) {
        Object obj = this.f21807.get(i);
        if (obj instanceof C6489) {
            return (C6489) obj;
        }
        return (C6489) AbstractC12454.m30924(obj);
    }

    public final Object clone() {
        return new C6489(new ArrayList(this.f21807));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f21807.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f21807.hashCode();
    }
}
