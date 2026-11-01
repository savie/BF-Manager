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

/* JADX INFO: renamed from: l.ۖᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2720 extends AbstractC14695 implements InterfaceC4548, InterfaceC14674 {
    @Override // java.util.List, l.InterfaceC14674
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C11146.$default$replaceAll(this, unaryOperator);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8301(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C2271.m6966(i, "Index (", ") is negative"));
        }
        if (i <= size()) {
            return;
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Index (", ") is greater than list size (");
        sbM40153.append(size());
        sbM40153.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m8299(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C2271.m6966(i, "Index (", ") is negative"));
        }
        if (i < size()) {
            return;
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Index (", ") is greater than or equal to list size (");
        sbM40153.append(size());
        sbM40153.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC10441, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC7371 spliterator() {
        if (this instanceof RandomAccess) {
            return new C9756(this);
        }
        return new C17249(listIterator(0), C17745.m41307(this), 16464);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC13722 interfaceC13722ListIterator = listIterator(0);
        int size = size();
        int iHashCode = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            E next = interfaceC13722ListIterator.next();
            iHashCode = (iHashCode * 31) + (next == 0 ? 0 : next.hashCode());
            size = i;
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        InterfaceC13722 interfaceC13722ListIterator = listIterator(0);
        while (interfaceC13722ListIterator.hasNext()) {
            if (C13638.equals(obj, interfaceC13722ListIterator.next())) {
                return interfaceC13722ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public InterfaceC6269 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC4548, java.util.List
    public final InterfaceC13722 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        InterfaceC13722 interfaceC13722ListIterator = listIterator(size());
        while (interfaceC13722ListIterator.hasPrevious()) {
            if (C13638.equals(obj, interfaceC13722ListIterator.previous())) {
                return interfaceC13722ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public void forEach(Consumer consumer) {
        if (this instanceof RandomAccess) {
            int size = size();
            for (int i = 0; i < size; i++) {
                consumer.accept(get(i));
            }
            return;
        }
        C20113.$default$forEach(this, consumer);
    }

    @Override // java.util.List, l.InterfaceC14674
    public void sort(Comparator comparator) {
        Object[] array = toArray();
        if (comparator == null) {
            Arrays.sort(array, 0, array.length);
        } else {
            Arrays.sort(array, 0, array.length, comparator);
        }
        mo12694(0, array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo12692(0, size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int size = size();
        if (size == 0) {
            return C7681.f25444;
        }
        Object[] objArr = new Object[size];
        mo12693(0, 0, size, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = Arrays.copyOf(objArr, size);
        }
        mo12693(0, 0, size, objArr);
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
                InterfaceC13722 interfaceC13722ListIterator = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (true) {
                    int i = size - 1;
                    if (size == 0) {
                        return true;
                    }
                    if (C13638.equals(interfaceC13722ListIterator.next(), listIterator.next())) {
                        size = i;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC4548) {
                InterfaceC13722 interfaceC13722ListIterator = listIterator(0);
                InterfaceC13722 interfaceC13722ListIterator2 = ((InterfaceC4548) list).listIterator();
                while (interfaceC13722ListIterator.hasNext() && interfaceC13722ListIterator2.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC13722ListIterator.next()).compareTo(interfaceC13722ListIterator2.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (interfaceC13722ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC13722ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC13722 interfaceC13722ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC13722ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo2 = ((Comparable) interfaceC13722ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC13722ListIterator3.hasNext()) {
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
        return remove(((C8387) this).f29127 - 1);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object m8302() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size() - 1);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC13722 interfaceC13722ListIterator = listIterator(0);
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
                E next = interfaceC13722ListIterator.next();
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

    @Override // java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
