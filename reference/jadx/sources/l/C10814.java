package l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۧۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public class C10814 extends AbstractList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f36838;

    public C10814(List list) {
        list.getClass();
        this.f36838 = list;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m27121() {
        return this.f36838;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f36838.add(m27119(i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f36838.clear();
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m27119(int i) {
        int size = this.f36838.size();
        C18304.m42519(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f36838;
        int size = list.size();
        C18304.m42510(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f36838;
        int size = list.size();
        C18304.m42510(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.f36838;
        int size = list.size();
        C18304.m42510(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36838.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        List list = this.f36838;
        C18304.m42511(i, i2, list.size());
        return C3051.m9147(list.subList(m27119(i2), m27119(i)));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C5874(this, this.f36838.listIterator(m27119(i)));
    }
}
