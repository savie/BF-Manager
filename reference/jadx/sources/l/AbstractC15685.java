package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ܳ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15685 extends AbstractC6957 implements InterfaceC9018, InterfaceC5427 {
    @Override // l.AbstractC6957, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C15121.$default$spliterator(this);
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo18911(i, (Integer) obj);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        return remove(i);
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return mo18912(i, (Integer) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37462(int i) {
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
    public final void m37464(int i) {
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

    public void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    public boolean add(int i) {
        add(size(), i);
        return true;
    }

    @Override // l.AbstractC6957, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC15949 spliterator() {
        if (this instanceof RandomAccess) {
            return new C5245(this);
        }
        return new C14457(iterator(), C8008.m21873(this), 16720);
    }

    public void sort(Comparator comparator) {
        InterfaceC4544 c21698;
        if (comparator == null || (comparator instanceof InterfaceC4544)) {
            c21698 = (InterfaceC4544) comparator;
        } else {
            c21698 = new C21698(comparator);
        }
        mo14694(c21698);
    }

    public int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC1340) {
            return mo14691(i, (InterfaceC1340) collection);
        }
        m37462(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, ((Integer) it.next()).intValue());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public InterfaceC8273 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public InterfaceC8273 listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo14700(int[] iArr) {
        mo14695(iArr);
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo14695(int[] iArr) {
        mo14689(0, iArr.length, iArr);
    }

    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public int indexOf(int i) {
        InterfaceC8273 interfaceC8273ListIterator = listIterator();
        while (interfaceC8273ListIterator.hasNext()) {
            if (i == interfaceC8273ListIterator.nextInt()) {
                return interfaceC8273ListIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(int i) {
        InterfaceC8273 interfaceC8273ListIterator = listIterator(size());
        while (interfaceC8273ListIterator.hasPrevious()) {
            if (i == interfaceC8273ListIterator.mo12330()) {
                return interfaceC8273ListIterator.nextIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo18911(int i, Integer num) {
        add(i, num.intValue());
    }

    @Override // l.AbstractC6957, l.InterfaceC20206
    public void forEach(IntConsumer intConsumer) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(intConsumer);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            intConsumer.accept(getInt(i));
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14690(IntUnaryOperator intUnaryOperator) {
        InterfaceC8273 interfaceC8273ListIterator = listIterator();
        while (interfaceC8273ListIterator.hasNext()) {
            interfaceC8273ListIterator.mo12327(intUnaryOperator.applyAsInt(interfaceC8273ListIterator.nextInt()));
        }
    }

    public void replaceAll(final UnaryOperator unaryOperator) {
        C17359.requireNonNull(unaryOperator);
        mo14690(unaryOperator instanceof IntUnaryOperator ? (IntUnaryOperator) unaryOperator : new IntUnaryOperator() { // from class: l.ۢ֡᩹
            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C21263.$default$andThen(this, intUnaryOperator);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return ((Integer) unaryOperator.apply(Integer.valueOf(i))).intValue();
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C21263.$default$compose(this, intUnaryOperator);
            }
        });
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo14687(0, size());
    }

    @Override // java.util.List
    public final Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC8273 it = iterator();
        int size = size();
        int iNextInt = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iNextInt;
            }
            iNextInt = (iNextInt * 31) + it.nextInt();
            size = i;
        }
    }

    @Override // l.InterfaceC9018, java.util.List
    public final int indexOf(Object obj) {
        return indexOf(((Integer) obj).intValue());
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof InterfaceC9018) {
            InterfaceC8273 interfaceC8273ListIterator = listIterator();
            InterfaceC8273 interfaceC8273ListIterator2 = ((InterfaceC9018) list).listIterator();
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return true;
                }
                if (interfaceC8273ListIterator.nextInt() != interfaceC8273ListIterator2.nextInt()) {
                    return false;
                }
                size = i;
            }
        } else {
            InterfaceC8273 interfaceC8273ListIterator3 = listIterator();
            ListIterator listIterator = list.listIterator();
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return true;
                }
                if (!C17359.equals(interfaceC8273ListIterator3.next(), listIterator.next())) {
                    return false;
                }
                size = i2;
            }
        }
    }

    @Override // l.InterfaceC9018, java.util.List
    public final int lastIndexOf(Object obj) {
        return lastIndexOf(((Integer) obj).intValue());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public int compareTo(List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof InterfaceC9018) {
            InterfaceC8273 interfaceC8273ListIterator = listIterator();
            InterfaceC8273 interfaceC8273ListIterator2 = ((InterfaceC9018) list).listIterator();
            while (interfaceC8273ListIterator.hasNext() && interfaceC8273ListIterator2.hasNext()) {
                int iCompare = Integer.compare(interfaceC8273ListIterator.nextInt(), interfaceC8273ListIterator2.nextInt());
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            if (interfaceC8273ListIterator2.hasNext()) {
                return -1;
            }
            return interfaceC8273ListIterator.hasNext() ? 1 : 0;
        }
        InterfaceC8273 interfaceC8273ListIterator3 = listIterator();
        ListIterator listIterator = list.listIterator();
        while (interfaceC8273ListIterator3.hasNext() && listIterator.hasNext()) {
            int iCompareTo = ((Comparable) interfaceC8273ListIterator3.next()).compareTo(listIterator.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (listIterator.hasNext()) {
            return -1;
        }
        return interfaceC8273ListIterator3.hasNext() ? 1 : 0;
    }

    public Integer remove(int i) {
        return Integer.valueOf(mo14697(i));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m37463() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return mo14697(size() - 1);
    }

    /* JADX INFO: renamed from: ᩷ */
    public Integer mo18912(int i, Integer num) {
        return Integer.valueOf(set(i, num.intValue()));
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo14693(InterfaceC9018 interfaceC9018) {
        C14763 c14763 = (C14763) this;
        return c14763.m35501(c14763.f48234, interfaceC9018);
    }

    @Override // l.AbstractC6957, l.InterfaceC1340
    /* JADX INFO: renamed from: ۘ */
    public int[] mo2687() {
        int size = size();
        if (size == 0) {
            return C8052.f26680;
        }
        int[] iArr = new int[size];
        mo14688(0, 0, size, iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo14691(int i, InterfaceC1340 interfaceC1340) {
        m37462(i);
        InterfaceC6036 it = interfaceC1340.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, it.nextInt());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC6957
    /* JADX INFO: renamed from: ۙ */
    public boolean mo14692(InterfaceC1340 interfaceC1340) {
        return mo14691(size(), interfaceC1340);
    }

    @Override // l.AbstractC6957, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC8273 it = iterator();
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
                sb.append(String.valueOf(it.nextInt()));
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

    /* JADX INFO: renamed from: ۤ */
    public void mo14694(InterfaceC4544 interfaceC4544) {
        if (interfaceC4544 == null) {
            mo14699(interfaceC4544);
            return;
        }
        int[] iArrMo2687 = mo2687();
        C8052.m21942(iArrMo2687, 0, iArrMo2687.length, interfaceC4544, (int[]) null);
        mo14700(iArrMo2687);
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo14699(InterfaceC4544 interfaceC4544) {
        int[] iArrMo2687 = mo2687();
        if (interfaceC4544 == null) {
            C8052.m21940(iArrMo2687.length, iArrMo2687);
        } else {
            C8052.m21941(iArrMo2687, 0, iArrMo2687.length, interfaceC4544);
        }
        mo14700(iArrMo2687);
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
