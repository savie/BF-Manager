package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.᩹֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23212 extends AbstractC5312 implements InterfaceC17462, InterfaceC5427 {
    @Override // java.util.List, l.InterfaceC5427
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C15121.$default$replaceAll(this, unaryOperator);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52129(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C14442.m34864(i, "Index (", ") is negative"));
        }
        if (i <= size()) {
            return;
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Index (", ") is greater than list size (");
        sbM12235.append(size());
        sbM12235.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m52131(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C14442.m34864(i, "Index (", ") is negative"));
        }
        if (i < size()) {
            return;
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Index (", ") is greater than or equal to list size (");
        sbM12235.append(size());
        sbM12235.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC21938, l.InterfaceC9372, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC2546 spliterator() {
        if (this instanceof RandomAccess) {
            return new C11277(this);
        }
        return new C22641(listIterator(0), C8008.m21873(this), 16464);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC15970 interfaceC15970ListIterator = listIterator(0);
        int size = size();
        int iHashCode = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            E next = interfaceC15970ListIterator.next();
            iHashCode = (iHashCode * 31) + (next == 0 ? 0 : next.hashCode());
            size = i;
        }
    }

    public int indexOf(Object obj) {
        InterfaceC15970 interfaceC15970ListIterator = listIterator(0);
        while (interfaceC15970ListIterator.hasNext()) {
            if (C17359.equals(obj, interfaceC15970ListIterator.next())) {
                return interfaceC15970ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public InterfaceC15224 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC17462, java.util.List
    public final InterfaceC15970 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public int lastIndexOf(Object obj) {
        InterfaceC15970 interfaceC15970ListIterator = listIterator(size());
        while (interfaceC15970ListIterator.hasPrevious()) {
            if (C17359.equals(obj, interfaceC15970ListIterator.previous())) {
                return interfaceC15970ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public void forEach(Consumer consumer) {
        if (this instanceof RandomAccess) {
            int size = size();
            for (int i = 0; i < size; i++) {
                consumer.accept(get(i));
            }
            return;
        }
        C13689.$default$forEach(this, consumer);
    }

    public void sort(Comparator comparator) {
        Object[] array = toArray();
        if (comparator == null) {
            Arrays.sort(array, 0, array.length);
        } else {
            Arrays.sort(array, 0, array.length, comparator);
        }
        mo25606(0, array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo25604(0, size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int size = size();
        if (size == 0) {
            return C8338.f27328;
        }
        Object[] objArr = new Object[size];
        mo25605(0, 0, size, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = Arrays.copyOf(objArr, size);
        }
        mo25605(0, 0, size, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                InterfaceC15970 interfaceC15970ListIterator = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (true) {
                    int i = size - 1;
                    if (size == 0) {
                        return true;
                    }
                    if (C17359.equals(interfaceC15970ListIterator.next(), listIterator.next())) {
                        size = i;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC17462) {
                InterfaceC15970 interfaceC15970ListIterator = listIterator(0);
                InterfaceC15970 interfaceC15970ListIterator2 = ((InterfaceC17462) list).listIterator();
                while (interfaceC15970ListIterator.hasNext() && interfaceC15970ListIterator2.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC15970ListIterator.next()).compareTo(interfaceC15970ListIterator2.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (interfaceC15970ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC15970ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC15970 interfaceC15970ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC15970ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo2 = ((Comparable) interfaceC15970ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC15970ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public final Object pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return remove(((C9829) this).f31644 - 1);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object m52130() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size() - 1);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC15970 interfaceC15970ListIterator = listIterator(0);
        int size = size();
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                E next = interfaceC15970ListIterator.next();
                if (this == next) {
                    sb.append("(this list)");
                } else {
                    sb.append(String.valueOf(next));
                }
                size = i;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
