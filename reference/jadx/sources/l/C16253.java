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

/* JADX INFO: renamed from: l.ܺ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes5.dex */
public final class C16253 extends AbstractC7308 implements InterfaceC10609, RandomAccess, Serializable, Cloneable, InterfaceC14674 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.AbstractC7308, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // l.InterfaceC10609
    public final int indexOf(int i) {
        return -1;
    }

    @Override // l.InterfaceC10609, java.util.List
    @Deprecated
    public final int indexOf(Object obj) {
        return -1;
    }

    @Override // l.InterfaceC10609
    public final int lastIndexOf(int i) {
        return -1;
    }

    @Override // l.InterfaceC10609, java.util.List
    @Deprecated
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    @Override // l.InterfaceC10609, java.util.List
    @Deprecated
    public final Integer remove(int i) {
        throw null;
    }

    @Override // java.util.List, l.InterfaceC14674
    @Deprecated
    public final void sort(Comparator comparator) {
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۨ */
    public final void mo3174(InterfaceC16481 interfaceC16481) {
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۨ */
    public final void mo3175(int[] iArr) {
        throw null;
    }

    @Override // l.InterfaceC10609
    @Deprecated
    /* JADX INFO: renamed from: ܰ */
    public final Integer mo26776(int i, Integer num) {
        throw null;
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ */
    public final void mo3178(InterfaceC16481 interfaceC16481) {
        throw null;
    }

    @Override // java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo26775(i, (Integer) obj);
        throw null;
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        List list = (List) obj;
        return (list == this || list.isEmpty()) ? 0 : -1;
    }

    @Override // l.AbstractC7308, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C18369.f58582;
    }

    @Override // l.AbstractC7308, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC13431 iterator() {
        return C18369.f58582;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return C18369.f58582;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        listIterator(i);
        return C18369.f58582;
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

    @Override // l.InterfaceC10609
    public final int getInt(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo3182(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ᩳ */
    public final int mo3180(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    public final void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    public final int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC14674
    @Deprecated
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3169(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo26775(int i, Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609, java.util.List
    @Deprecated
    public final Integer get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
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

    @Override // l.InterfaceC10609, java.util.List
    public final InterfaceC21191 listIterator() {
        return C18369.f58582;
    }

    @Override // l.AbstractC7308, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC21191 iterator() {
        return C18369.f58582;
    }

    @Override // l.InterfaceC10609, java.util.List
    public final InterfaceC21191 listIterator(int i) {
        if (i == 0) {
            return C18369.f58582;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // l.InterfaceC10609, java.util.List
    public final InterfaceC10609 subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3167(int i, int i2, int i3, int[] iArr) {
        if (i != 0 || i3 != 0 || i2 < 0 || i2 > iArr.length) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3166(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ */
    public final void mo3177(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ */
    public final void mo3179(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public final void mo3168(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C17663.f56124;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    private Object readResolve() {
        return C17663.f56124;
    }
}
