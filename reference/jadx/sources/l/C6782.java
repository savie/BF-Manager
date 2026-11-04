package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۜ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6782 extends AbstractC9542 implements InterfaceC9018, RandomAccess, Serializable, Cloneable, InterfaceC5427 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.AbstractC9542, java.util.Collection, java.util.List
    public final int hashCode() {
        return 1;
    }

    @Override // l.InterfaceC9018
    public final int indexOf(int i) {
        return -1;
    }

    @Override // l.InterfaceC9018, java.util.List
    @Deprecated
    public final int indexOf(Object obj) {
        return -1;
    }

    @Override // l.InterfaceC9018
    public final int lastIndexOf(int i) {
        return -1;
    }

    @Override // l.InterfaceC9018, java.util.List
    @Deprecated
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    @Override // l.InterfaceC9018, java.util.List
    @Deprecated
    public final Integer remove(int i) {
        throw null;
    }

    @Override // java.util.List, l.InterfaceC5427
    @Deprecated
    public final void sort(Comparator comparator) {
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۤ */
    public final void mo14694(InterfaceC4544 interfaceC4544) {
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۤ */
    public final void mo14695(int[] iArr) {
        throw null;
    }

    @Override // l.InterfaceC9018
    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Integer mo18912(int i, Integer num) {
        throw null;
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14699(InterfaceC4544 interfaceC4544) {
        throw null;
    }

    @Override // java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo18911(i, (Integer) obj);
        throw null;
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        List list = (List) obj;
        return (list == this || list.isEmpty()) ? 0 : -1;
    }

    @Override // l.AbstractC9542, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C0069.f975;
    }

    @Override // l.AbstractC9542, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ InterfaceC6036 iterator() {
        return C0069.f975;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return C0069.f975;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        listIterator(i);
        return C0069.f975;
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        subList(i, i2);
        return this;
    }

    @Override // l.InterfaceC9018
    public final int getInt(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4933(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ܶ */
    public final int mo14697(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    public final void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    public final int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC5427
    @Deprecated
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14690(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18911(int i, Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018, java.util.List
    @Deprecated
    public final Integer get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final boolean add(Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018, java.util.List
    public final InterfaceC8273 listIterator() {
        return C0069.f975;
    }

    @Override // l.AbstractC9542, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC8273 iterator() {
        return C0069.f975;
    }

    @Override // l.InterfaceC9018, java.util.List
    public final InterfaceC8273 listIterator(int i) {
        if (i == 0) {
            return C0069.f975;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // l.InterfaceC9018, java.util.List
    public final InterfaceC9018 subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14688(int i, int i2, int i3, int[] iArr) {
        if (i != 0 || i3 != 0 || i2 < 0 || i2 > iArr.length) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14687(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14698(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14700(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9018
    /* JADX INFO: renamed from: ۙ */
    public final void mo14689(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C22663.f73589;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    private Object readResolve() {
        return C22663.f73589;
    }
}
