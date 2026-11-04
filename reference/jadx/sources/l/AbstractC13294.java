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

/* JADX INFO: renamed from: l.۫ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13294 extends AbstractC13711 implements InterfaceC18252, InterfaceC5427 {
    @Override // l.AbstractC13711, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC13711, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C15121.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo37193(i, ((Long) obj).longValue());
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(set(i, ((Long) obj).longValue()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32831(int i) {
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
    public final void m32838(int i) {
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

    @Override // l.AbstractC13711, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC9301 spliterator() {
        if (this instanceof RandomAccess) {
            return new C22245(this);
        }
        return new C21720(listIterator(0), C8008.m21873(this), 16720);
    }

    @Override // java.util.List, l.InterfaceC5427
    public final void sort(Comparator comparator) {
        InterfaceC16760 c17506;
        if (comparator == null || (comparator instanceof InterfaceC16760)) {
            c17506 = (InterfaceC16760) comparator;
        } else {
            c17506 = new C17506(comparator);
        }
        mo32832(c17506);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC5574) {
            return mo32833(i, (InterfaceC5574) collection);
        }
        m32831(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo37193(i, ((Long) it.next()).longValue());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC13711, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC0353 interfaceC0353ListIterator = listIterator(0);
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            long jNextLong = interfaceC0353ListIterator.nextLong();
            i = (i * 31) + ((int) (jNextLong ^ (jNextLong >>> 32)));
            size = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC5574, l.InterfaceC3336
    public InterfaceC12285 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC18252, java.util.List
    public final InterfaceC0353 listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int mo32834(long j) {
        InterfaceC0353 interfaceC0353ListIterator = listIterator(0);
        while (interfaceC0353ListIterator.hasNext()) {
            if (j == interfaceC0353ListIterator.nextLong()) {
                return interfaceC0353ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.InterfaceC5574
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6352(long j) {
        return mo32834(j) >= 0;
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int mo32836(long j) {
        InterfaceC0353 interfaceC0353ListIterator = listIterator(size());
        while (interfaceC0353ListIterator.hasPrevious()) {
            if (j == interfaceC0353ListIterator.mo2123()) {
                return interfaceC0353ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC13711, l.InterfaceC3336
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

    @Override // java.util.List, l.InterfaceC5427
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C17359.requireNonNull(unaryOperator);
        LongUnaryOperator longUnaryOperator = unaryOperator instanceof LongUnaryOperator ? (LongUnaryOperator) unaryOperator : new LongUnaryOperator() { // from class: l.᩶ۢ᩹
            public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator2) {
                return C7838.$default$andThen(this, longUnaryOperator2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j) {
                return ((Long) unaryOperator.apply(Long.valueOf(j))).longValue();
            }

            public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator2) {
                return C7838.$default$compose(this, longUnaryOperator2);
            }
        };
        InterfaceC0353 interfaceC0353ListIterator = listIterator(0);
        while (interfaceC0353ListIterator.hasNext()) {
            interfaceC0353ListIterator.mo2124(longUnaryOperator.applyAsLong(interfaceC0353ListIterator.nextLong()));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo37191(0, size());
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return mo32834(((Long) obj).longValue());
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
                if (list instanceof InterfaceC18252) {
                    InterfaceC0353 interfaceC0353ListIterator = listIterator(0);
                    InterfaceC0353 interfaceC0353ListIterator2 = ((InterfaceC18252) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (interfaceC0353ListIterator.nextLong() != interfaceC0353ListIterator2.nextLong()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC0353 interfaceC0353ListIterator3 = listIterator(0);
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (C17359.equals(interfaceC0353ListIterator3.next(), listIterator.next())) {
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
        return mo32836(((Long) obj).longValue());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC18252) {
                InterfaceC0353 interfaceC0353ListIterator = listIterator(0);
                InterfaceC0353 interfaceC0353ListIterator2 = ((InterfaceC18252) list).listIterator();
                while (interfaceC0353ListIterator.hasNext() && interfaceC0353ListIterator2.hasNext()) {
                    int iCompare = Long.compare(interfaceC0353ListIterator.nextLong(), interfaceC0353ListIterator2.nextLong());
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                if (interfaceC0353ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC0353ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC0353 interfaceC0353ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC0353ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC0353ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC0353ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Long.valueOf(mo37196(i));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long[] m32835() {
        int size = size();
        if (size == 0) {
            return C15268.f49916;
        }
        long[] jArr = new long[size];
        mo37194(jArr, 0, 0, size);
        return jArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo32833(int i, InterfaceC5574 interfaceC5574) {
        m32831(i);
        InterfaceC12285 it = interfaceC5574.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo37193(i, it.nextLong());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC13711
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6350(InterfaceC5574 interfaceC5574) {
        return mo32833(size(), interfaceC5574);
    }

    @Override // l.AbstractC13711, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC0353 interfaceC0353ListIterator = listIterator(0);
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
                sb.append(String.valueOf(interfaceC0353ListIterator.nextLong()));
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

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo32832(InterfaceC16760 interfaceC16760) {
        if (interfaceC16760 == null) {
            mo32837(interfaceC16760);
            return;
        }
        long[] jArrM32835 = m32835();
        C15268.m36634(jArrM32835, 0, jArrM32835.length, interfaceC16760, (long[]) null);
        mo37192(0, jArrM32835.length, jArrM32835);
    }

    @Override // l.InterfaceC18252
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo32837(InterfaceC16760 interfaceC16760) {
        long[] jArrM32835 = m32835();
        if (interfaceC16760 == null) {
            C15268.m36632(jArrM32835.length, jArrM32835);
        } else {
            C15268.m36633(jArrM32835, 0, jArrM32835.length, interfaceC16760);
        }
        mo37192(0, jArrM32835.length, jArrM32835);
    }
}
