package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.LongConsumer;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.᩻ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23785 extends AbstractC20257 implements InterfaceC21750, InterfaceC14674 {
    @Override // l.AbstractC20257, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC20257, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* synthetic */ InterfaceC20693 spliterator() {
        return C11146.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo27937(i, ((Long) obj).longValue());
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(set(i, ((Long) obj).longValue()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52322(int i) {
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
    public final void m52321(int i) {
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

    @Override // l.AbstractC20257, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC10462 spliterator() {
        if (this instanceof RandomAccess) {
            return new C16729(this);
        }
        return new C16811(listIterator(0), C17745.m41307(this), 16720);
    }

    @Override // java.util.List, l.InterfaceC14674
    public final void sort(Comparator comparator) {
        InterfaceC4816 c13990;
        if (comparator == null || (comparator instanceof InterfaceC4816)) {
            c13990 = (InterfaceC4816) comparator;
        } else {
            c13990 = new C13990(comparator);
        }
        mo39603(c13990);
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC14800) {
            return mo27939(i, (InterfaceC14800) collection);
        }
        m52322(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo27937(i, ((Long) it.next()).longValue());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC20257, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC18222 interfaceC18222ListIterator = listIterator(0);
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            long jNextLong = interfaceC18222ListIterator.nextLong();
            i = (i * 31) + ((int) (jNextLong ^ (jNextLong >>> 32)));
            size = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC14800, l.InterfaceC5522
    public InterfaceC1288 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC21750, java.util.List
    public final InterfaceC18222 listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: ֨ */
    public int mo39601(long j) {
        InterfaceC18222 interfaceC18222ListIterator = listIterator(0);
        while (interfaceC18222ListIterator.hasNext()) {
            if (j == interfaceC18222ListIterator.nextLong()) {
                return interfaceC18222ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.InterfaceC14800
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo6642(long j) {
        return mo39601(j) >= 0;
    }

    /* JADX INFO: renamed from: ܰ */
    public int mo39604(long j) {
        InterfaceC18222 interfaceC18222ListIterator = listIterator(size());
        while (interfaceC18222ListIterator.hasPrevious()) {
            if (j == interfaceC18222ListIterator.mo11697()) {
                return interfaceC18222ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC20257, l.InterfaceC5522
    public void forEach(LongConsumer longConsumer) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(longConsumer);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            longConsumer.accept(getLong(i));
        }
    }

    @Override // java.util.List, l.InterfaceC14674
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C13638.requireNonNull(unaryOperator);
        LongUnaryOperator longUnaryOperator = unaryOperator instanceof LongUnaryOperator ? (LongUnaryOperator) unaryOperator : new LongUnaryOperator() { // from class: l.ܶᩳᩴ
            public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator2) {
                return C19095.$default$andThen(this, longUnaryOperator2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j) {
                return ((Long) unaryOperator.apply(Long.valueOf(j))).longValue();
            }

            public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator2) {
                return C19095.$default$compose(this, longUnaryOperator2);
            }
        };
        InterfaceC18222 interfaceC18222ListIterator = listIterator(0);
        while (interfaceC18222ListIterator.hasNext()) {
            interfaceC18222ListIterator.mo11695(longUnaryOperator.applyAsLong(interfaceC18222ListIterator.nextLong()));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo27935(0, size());
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return mo39601(((Long) obj).longValue());
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
                if (list instanceof InterfaceC21750) {
                    InterfaceC18222 interfaceC18222ListIterator = listIterator(0);
                    InterfaceC18222 interfaceC18222ListIterator2 = ((InterfaceC21750) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (interfaceC18222ListIterator.nextLong() != interfaceC18222ListIterator2.nextLong()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC18222 interfaceC18222ListIterator3 = listIterator(0);
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (C13638.equals(interfaceC18222ListIterator3.next(), listIterator.next())) {
                            size = i2;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return mo39604(((Long) obj).longValue());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC21750) {
                InterfaceC18222 interfaceC18222ListIterator = listIterator(0);
                InterfaceC18222 interfaceC18222ListIterator2 = ((InterfaceC21750) list).listIterator();
                while (interfaceC18222ListIterator.hasNext() && interfaceC18222ListIterator2.hasNext()) {
                    int iCompare = Long.compare(interfaceC18222ListIterator.nextLong(), interfaceC18222ListIterator2.nextLong());
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                if (interfaceC18222ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC18222ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC18222 interfaceC18222ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC18222ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC18222ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC18222ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Long.valueOf(mo27941(i));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long[] m52323() {
        int size = size();
        if (size == 0) {
            return C11272.f38094;
        }
        long[] jArr = new long[size];
        mo27938(jArr, 0, 0, size);
        return jArr;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo27939(int i, InterfaceC14800 interfaceC14800) {
        m52322(i);
        InterfaceC1288 it = interfaceC14800.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo27937(i, it.nextLong());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC20257
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6641(InterfaceC14800 interfaceC14800) {
        return mo27939(size(), interfaceC14800);
    }

    @Override // l.AbstractC20257, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC18222 interfaceC18222ListIterator = listIterator(0);
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
                sb.append(String.valueOf(interfaceC18222ListIterator.nextLong()));
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

    /* JADX INFO: renamed from: ۙ */
    public void mo39603(InterfaceC4816 interfaceC4816) {
        if (interfaceC4816 == null) {
            mo39605(interfaceC4816);
            return;
        }
        long[] jArrM52323 = m52323();
        C11272.m28249(jArrM52323, 0, jArrM52323.length, interfaceC4816, (long[]) null);
        mo27936(0, jArrM52323.length, jArrM52323);
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo39605(InterfaceC4816 interfaceC4816) {
        long[] jArrM52323 = m52323();
        if (interfaceC4816 == null) {
            C11272.m28247(jArrM52323.length, jArrM52323);
        } else {
            C11272.m28248(jArrM52323, 0, jArrM52323.length, interfaceC4816);
        }
        mo27936(0, jArrM52323.length, jArrM52323);
    }
}
