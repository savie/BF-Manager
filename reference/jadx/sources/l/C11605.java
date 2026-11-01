package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۨۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 52O */
/* JADX INFO: loaded from: classes4.dex */
public final class C11605 extends AbstractC16853 implements InterfaceC4548, RandomAccess, Serializable, Cloneable, InterfaceC14674 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.AbstractC16853, java.util.Collection, java.util.List
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    @Override // java.util.List, l.InterfaceC14674
    public final void sort(Comparator comparator) {
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        List list = (List) obj;
        return (list == this || list.isEmpty()) ? 0 : -1;
    }

    @Override // l.AbstractC16853, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C2035.f7590;
    }

    @Override // l.AbstractC16853, l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final /* bridge */ /* synthetic */ InterfaceC6269 iterator() {
        return C2035.f7590;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return C2035.f7590;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        listIterator(i);
        return C2035.f7590;
    }

    @Override // java.util.List
    public final Object get(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC14674
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC4548, java.util.List
    public final InterfaceC13722 listIterator() {
        return C2035.f7590;
    }

    @Override // l.InterfaceC4548, java.util.List
    public final InterfaceC13722 listIterator(int i) {
        if (i == 0) {
            return C2035.f7590;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC4548
    /* JADX INFO: renamed from: ۙ */
    public final void mo12693(int i, int i2, int i3, Object[] objArr) {
        if (i != 0 || i3 != 0 || i2 < 0 || i2 > objArr.length) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // l.InterfaceC4548
    /* JADX INFO: renamed from: ۙ */
    public final void mo12692(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC4548
    /* JADX INFO: renamed from: ۙ */
    public final void mo12694(int i, int i2, Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C2431.f9738;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    private Object readResolve() {
        return C2431.f9738;
    }
}
