package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.۠ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8096 extends AbstractC3861 implements InterfaceC10338, InterfaceC14674 {
    @Override // l.AbstractC3861, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* synthetic */ InterfaceC20693 spliterator() {
        return C11146.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo26241(((Character) obj).charValue(), i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Character.valueOf(mo26237(((Character) obj).charValue(), i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21307(int i) {
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
    public final void m21305(int i) {
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

    @Override // l.AbstractC3861, java.util.Collection, java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC11687 spliterator() {
        if (this instanceof RandomAccess) {
            return new C18679(this);
        }
        return new C6747(listIterator(0), C17745.m41307(this), 16720);
    }

    @Override // java.util.List, l.InterfaceC14674
    public final void sort(Comparator comparator) {
        InterfaceC4692 c13866;
        if (comparator == null || (comparator instanceof InterfaceC4692)) {
            c13866 = (InterfaceC4692) comparator;
        } else {
            c13866 = new C13866(comparator);
        }
        mo21308(c13866);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC23475) {
            return mo21309(i, (InterfaceC23475) collection);
        }
        m21307(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo26241(((Character) it.next()).charValue(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC20921 interfaceC20921ListIterator = listIterator(0);
        int size = size();
        int iMo1416 = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iMo1416;
            }
            iMo1416 = (iMo1416 * 31) + interfaceC20921ListIterator.mo1416();
            size = i;
        }
    }

    @Override // l.InterfaceC10338
    public int indexOf(char c) {
        InterfaceC20921 interfaceC20921ListIterator = listIterator(0);
        while (interfaceC20921ListIterator.hasNext()) {
            if (c == interfaceC20921ListIterator.mo1416()) {
                return interfaceC20921ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public InterfaceC15277 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC10338, java.util.List
    public final InterfaceC20921 listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2286(char c) {
        return indexOf(c) >= 0;
    }

    @Override // l.InterfaceC10338
    public int lastIndexOf(char c) {
        InterfaceC20921 interfaceC20921ListIterator = listIterator(size());
        while (interfaceC20921ListIterator.hasPrevious()) {
            if (c == interfaceC20921ListIterator.mo19146()) {
                return interfaceC20921ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC3861, l.InterfaceC6809
    /* JADX INFO: renamed from: ۙ */
    public void mo2288(InterfaceC1164 interfaceC1164) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(interfaceC1164);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            interfaceC1164.mo4297(getChar(i));
        }
    }

    @Override // java.util.List, l.InterfaceC14674
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C13638.requireNonNull(unaryOperator);
        InterfaceC21564 interfaceC21564 = unaryOperator instanceof InterfaceC21564 ? (InterfaceC21564) unaryOperator : new InterfaceC21564() { // from class: l.ۡܰᩴ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C15568.$default$andThen(this, intUnaryOperator);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C15568.$default$compose(this, intUnaryOperator);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // l.InterfaceC21564
            /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
            public final char mo23217(char c) {
                return ((Character) unaryOperator.apply(Character.valueOf(c))).charValue();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Character.valueOf(mo23217(((Character) obj).charValue()));
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return mo23217(C21273.m47738(i));
            }
        };
        InterfaceC20921 interfaceC20921ListIterator = listIterator(0);
        while (interfaceC20921ListIterator.hasNext()) {
            interfaceC20921ListIterator.mo19147(interfaceC21564.mo23217(interfaceC20921ListIterator.mo1416()));
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Character.valueOf(getChar(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo26238(0, size());
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return indexOf(((Character) obj).charValue());
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return lastIndexOf(((Character) obj).charValue());
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
                if (list instanceof InterfaceC10338) {
                    InterfaceC20921 interfaceC20921ListIterator = listIterator(0);
                    InterfaceC20921 interfaceC20921ListIterator2 = ((InterfaceC10338) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (interfaceC20921ListIterator.mo1416() != interfaceC20921ListIterator2.mo1416()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC20921 interfaceC20921ListIterator3 = listIterator(0);
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (C13638.equals(interfaceC20921ListIterator3.next(), listIterator.next())) {
                            size = i2;
                        }
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
            if (list instanceof InterfaceC10338) {
                InterfaceC20921 interfaceC20921ListIterator = listIterator(0);
                InterfaceC20921 interfaceC20921ListIterator2 = ((InterfaceC10338) list).listIterator();
                while (interfaceC20921ListIterator.hasNext() && interfaceC20921ListIterator2.hasNext()) {
                    int iCompare = Character.compare(interfaceC20921ListIterator.mo1416(), interfaceC20921ListIterator2.mo1416());
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                if (interfaceC20921ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC20921ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC20921 interfaceC20921ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC20921ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC20921ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC20921ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Character.valueOf(mo26242(i));
    }

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo21310(InterfaceC4692 interfaceC4692) {
        char[] cArr;
        int size = size();
        if (size == 0) {
            cArr = C17124.f54609;
        } else {
            char[] cArr2 = new char[size];
            mo26239(0, 0, cArr2, size);
            cArr = cArr2;
        }
        if (interfaceC4692 == null) {
            C17124.m39983(cArr, cArr.length);
        } else {
            C17124.m39985(cArr, 0, cArr.length, interfaceC4692);
        }
        mo26240(cArr, 0, cArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo21309(int i, InterfaceC23475 interfaceC23475) {
        m21307(i);
        InterfaceC15277 it = interfaceC23475.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo26241(it.mo1416(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC3861
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2290(InterfaceC23475 interfaceC23475) {
        return mo21309(size(), interfaceC23475);
    }

    @Override // l.AbstractC3861, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC20921 interfaceC20921ListIterator = listIterator(0);
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
                sb.append(String.valueOf(interfaceC20921ListIterator.mo1416()));
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

    @Override // l.InterfaceC10338
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo21308(InterfaceC4692 interfaceC4692) {
        char[] cArr;
        if (interfaceC4692 != null) {
            int size = size();
            if (size == 0) {
                cArr = C17124.f54609;
            } else {
                char[] cArr2 = new char[size];
                mo26239(0, 0, cArr2, size);
                cArr = cArr2;
            }
            C17124.m39986(cArr, 0, cArr.length, interfaceC4692, (char[]) null);
            mo26240(cArr, 0, cArr.length);
            return;
        }
        mo21310(interfaceC4692);
    }
}
