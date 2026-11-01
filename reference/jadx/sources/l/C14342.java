package l;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܳۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C14342 extends AbstractList implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f46973;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC11955 f46974;

    public C14342(List list, InterfaceC11955 interfaceC11955) {
        list.getClass();
        this.f46973 = list;
        interfaceC11955.getClass();
        this.f46974 = interfaceC11955;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f46973.subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f46974.apply(this.f46973.get(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C23514(this, this.f46973.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f46973.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f46974.apply(this.f46973.remove(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46973.size();
    }
}
