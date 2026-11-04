package l;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۠ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8421 extends AbstractList implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f27576;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC5417 f27577;

    public C8421(List list, InterfaceC5417 interfaceC5417) {
        list.getClass();
        this.f27576 = list;
        interfaceC5417.getClass();
        this.f27577 = interfaceC5417;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f27576.subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f27577.apply(this.f27576.get(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C2455(this, this.f27576.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f27576.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f27577.apply(this.f27576.remove(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27576.size();
    }
}
