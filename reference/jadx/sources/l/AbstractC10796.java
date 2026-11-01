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

/* JADX INFO: renamed from: l.ۧۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10796 extends AbstractC15735 implements InterfaceC10609, InterfaceC14674 {
    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* synthetic */ InterfaceC20693 spliterator() {
        return C11146.$default$spliterator(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo26775(i, (Integer) obj);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        return remove(i);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return mo26776(i, (Integer) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27091(int i) {
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
    public final void m27090(int i) {
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

    public void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    public boolean add(int i) {
        add(size(), i);
        return true;
    }

    @Override // l.AbstractC15735, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC11790 spliterator() {
        if (this instanceof RandomAccess) {
            return new C0211(this);
        }
        return new C23079(iterator(), C17745.m41307(this), 16720);
    }

    public void sort(Comparator comparator) {
        InterfaceC16481 c12248;
        if (comparator == null || (comparator instanceof InterfaceC16481)) {
            c12248 = (InterfaceC16481) comparator;
        } else {
            c12248 = new C12248(comparator);
        }
        mo3174(c12248);
    }

    public int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC10131) {
            return mo3170(i, (InterfaceC10131) collection);
        }
        m27091(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, ((Integer) it.next()).intValue());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public InterfaceC21191 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public InterfaceC21191 listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo3179(int[] iArr) {
        mo3175(iArr);
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo3175(int[] iArr) {
        mo3168(0, iArr.length, iArr);
    }

    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public int indexOf(int i) {
        InterfaceC21191 interfaceC21191ListIterator = listIterator();
        while (interfaceC21191ListIterator.hasNext()) {
            if (i == interfaceC21191ListIterator.nextInt()) {
                return interfaceC21191ListIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(int i) {
        InterfaceC21191 interfaceC21191ListIterator = listIterator(size());
        while (interfaceC21191ListIterator.hasPrevious()) {
            if (i == interfaceC21191ListIterator.mo3719()) {
                return interfaceC21191ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ۙ */
    public void mo26775(int i, Integer num) {
        add(i, num.intValue());
    }

    @Override // l.AbstractC15735, l.InterfaceC22603
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
    public void mo3169(IntUnaryOperator intUnaryOperator) {
        InterfaceC21191 interfaceC21191ListIterator = listIterator();
        while (interfaceC21191ListIterator.hasNext()) {
            interfaceC21191ListIterator.mo3716(intUnaryOperator.applyAsInt(interfaceC21191ListIterator.nextInt()));
        }
    }

    public void replaceAll(final UnaryOperator unaryOperator) {
        C13638.requireNonNull(unaryOperator);
        mo3169(unaryOperator instanceof IntUnaryOperator ? (IntUnaryOperator) unaryOperator : new IntUnaryOperator() { // from class: l.᩵᩺ᩴ
            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C15568.$default$andThen(this, intUnaryOperator);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return ((Integer) unaryOperator.apply(Integer.valueOf(i))).intValue();
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C15568.$default$compose(this, intUnaryOperator);
            }
        });
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo3166(0, size());
    }

    @Override // java.util.List
    public final Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC21191 it = iterator();
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

    @Override // l.InterfaceC10609, java.util.List
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
        if (list instanceof InterfaceC10609) {
            InterfaceC21191 interfaceC21191ListIterator = listIterator();
            InterfaceC21191 interfaceC21191ListIterator2 = ((InterfaceC10609) list).listIterator();
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return true;
                }
                if (interfaceC21191ListIterator.nextInt() != interfaceC21191ListIterator2.nextInt()) {
                    return false;
                }
                size = i;
            }
        } else {
            InterfaceC21191 interfaceC21191ListIterator3 = listIterator();
            ListIterator listIterator = list.listIterator();
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return true;
                }
                if (!C13638.equals(interfaceC21191ListIterator3.next(), listIterator.next())) {
                    return false;
                }
                size = i2;
            }
        }
    }

    @Override // l.InterfaceC10609, java.util.List
    public final int lastIndexOf(Object obj) {
        return lastIndexOf(((Integer) obj).intValue());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public int compareTo(List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof InterfaceC10609) {
            InterfaceC21191 interfaceC21191ListIterator = listIterator();
            InterfaceC21191 interfaceC21191ListIterator2 = ((InterfaceC10609) list).listIterator();
            while (interfaceC21191ListIterator.hasNext() && interfaceC21191ListIterator2.hasNext()) {
                int iCompare = Integer.compare(interfaceC21191ListIterator.nextInt(), interfaceC21191ListIterator2.nextInt());
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            if (interfaceC21191ListIterator2.hasNext()) {
                return -1;
            }
            return interfaceC21191ListIterator.hasNext() ? 1 : 0;
        }
        InterfaceC21191 interfaceC21191ListIterator3 = listIterator();
        ListIterator listIterator = list.listIterator();
        while (interfaceC21191ListIterator3.hasNext() && listIterator.hasNext()) {
            int iCompareTo = ((Comparable) interfaceC21191ListIterator3.next()).compareTo(listIterator.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (listIterator.hasNext()) {
            return -1;
        }
        return interfaceC21191ListIterator3.hasNext() ? 1 : 0;
    }

    @Override // l.InterfaceC10609, java.util.List
    public Integer remove(int i) {
        return Integer.valueOf(mo3180(i));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m27092() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return mo3180(size() - 1);
    }

    @Override // l.InterfaceC10609
    /* JADX INFO: renamed from: ܰ */
    public Integer mo26776(int i, Integer num) {
        return Integer.valueOf(set(i, num.intValue()));
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo3173(InterfaceC10609 interfaceC10609) {
        C15070 c15070 = (C15070) this;
        return c15070.m36104(c15070.f49126, interfaceC10609);
    }

    @Override // l.AbstractC15735, l.InterfaceC10131
    /* JADX INFO: renamed from: ᩷ */
    public int[] mo3181() {
        int size = size();
        if (size == 0) {
            return C8014.f26269;
        }
        int[] iArr = new int[size];
        mo3167(0, 0, size, iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo3170(int i, InterfaceC10131 interfaceC10131) {
        m27091(i);
        InterfaceC13431 it = interfaceC10131.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, it.nextInt());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC15735
    /* JADX INFO: renamed from: ۙ */
    public boolean mo3172(InterfaceC10131 interfaceC10131) {
        return mo3170(size(), interfaceC10131);
    }

    @Override // l.AbstractC15735, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC21191 it = iterator();
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

    /* JADX INFO: renamed from: ۨ */
    public void mo3174(InterfaceC16481 interfaceC16481) {
        if (interfaceC16481 == null) {
            mo3178(interfaceC16481);
            return;
        }
        int[] iArrMo3181 = mo3181();
        C8014.m21116(iArrMo3181, 0, iArrMo3181.length, interfaceC16481, (int[]) null);
        mo3179(iArrMo3181);
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo3178(InterfaceC16481 interfaceC16481) {
        int[] iArrMo3181 = mo3181();
        if (interfaceC16481 == null) {
            C8014.m21114(iArrMo3181.length, iArrMo3181);
        } else {
            C8014.m21115(iArrMo3181, 0, iArrMo3181.length, interfaceC16481);
        }
        mo3179(iArrMo3181);
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
