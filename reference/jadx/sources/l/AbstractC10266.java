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

/* JADX INFO: renamed from: l.ۢܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10266 extends AbstractC4301 implements InterfaceC9105, InterfaceC5427 {
    @Override // l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C15121.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo21904(((Character) obj).charValue(), i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Character.valueOf(mo21898(((Character) obj).charValue(), i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26472(int i) {
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
    public final void m26473(int i) {
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

    @Override // l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC16321 spliterator() {
        if (this instanceof RandomAccess) {
            return new C19217(this);
        }
        return new C4389(listIterator(0), C8008.m21873(this), 16720);
    }

    @Override // java.util.List, l.InterfaceC5427
    public final void sort(Comparator comparator) {
        InterfaceC16564 c17310;
        if (comparator == null || (comparator instanceof InterfaceC16564)) {
            c17310 = (InterfaceC16564) comparator;
        } else {
            c17310 = new C17310(comparator);
        }
        mo24255(c17310);
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC12835) {
            return mo21902(i, (InterfaceC12835) collection);
        }
        m26472(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo21904(((Character) it.next()).charValue(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC8360 interfaceC8360ListIterator = listIterator(0);
        int size = size();
        int iMo5320 = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iMo5320;
            }
            iMo5320 = (iMo5320 * 31) + interfaceC8360ListIterator.mo5320();
            size = i;
        }
    }

    @Override // l.InterfaceC9105
    public int indexOf(char c) {
        InterfaceC8360 interfaceC8360ListIterator = listIterator(0);
        while (interfaceC8360ListIterator.hasNext()) {
            if (c == interfaceC8360ListIterator.mo5320()) {
                return interfaceC8360ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public InterfaceC21040 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC9105, java.util.List
    public final InterfaceC8360 listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo5936(char c) {
        return indexOf(c) >= 0;
    }

    @Override // l.InterfaceC9105
    public int lastIndexOf(char c) {
        InterfaceC8360 interfaceC8360ListIterator = listIterator(size());
        while (interfaceC8360ListIterator.hasPrevious()) {
            if (c == interfaceC8360ListIterator.mo1359()) {
                return interfaceC8360ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC4301, l.InterfaceC3886
    /* JADX INFO: renamed from: ۙ */
    public void mo5932(InterfaceC12089 interfaceC12089) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(interfaceC12089);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            interfaceC12089.mo10258(getChar(i));
        }
    }

    @Override // java.util.List, l.InterfaceC5427
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C17359.requireNonNull(unaryOperator);
        InterfaceC18559 interfaceC18559 = unaryOperator instanceof InterfaceC18559 ? (InterfaceC18559) unaryOperator : new InterfaceC18559() { // from class: l.֨ۗ᩹
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C21263.$default$andThen(this, intUnaryOperator);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C21263.$default$compose(this, intUnaryOperator);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // l.InterfaceC18559
            /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
            public final char mo3669(char c) {
                return ((Character) unaryOperator.apply(Character.valueOf(c))).charValue();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Character.valueOf(mo3669(((Character) obj).charValue()));
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return mo3669(C8485.m22804(i));
            }
        };
        InterfaceC8360 interfaceC8360ListIterator = listIterator(0);
        while (interfaceC8360ListIterator.hasNext()) {
            interfaceC8360ListIterator.mo1362(interfaceC18559.mo3669(interfaceC8360ListIterator.mo5320()));
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Character.valueOf(getChar(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo21899(0, size());
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
                if (list instanceof InterfaceC9105) {
                    InterfaceC8360 interfaceC8360ListIterator = listIterator(0);
                    InterfaceC8360 interfaceC8360ListIterator2 = ((InterfaceC9105) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (interfaceC8360ListIterator.mo5320() != interfaceC8360ListIterator2.mo5320()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC8360 interfaceC8360ListIterator3 = listIterator(0);
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (C17359.equals(interfaceC8360ListIterator3.next(), listIterator.next())) {
                            size = i2;
                        }
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
            if (list instanceof InterfaceC9105) {
                InterfaceC8360 interfaceC8360ListIterator = listIterator(0);
                InterfaceC8360 interfaceC8360ListIterator2 = ((InterfaceC9105) list).listIterator();
                while (interfaceC8360ListIterator.hasNext() && interfaceC8360ListIterator2.hasNext()) {
                    int iCompare = Character.compare(interfaceC8360ListIterator.mo5320(), interfaceC8360ListIterator2.mo5320());
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                if (interfaceC8360ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC8360ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC8360 interfaceC8360ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC8360ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC8360ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC8360ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Character.valueOf(mo21903(i));
    }

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ᩷ */
    public void mo24256(InterfaceC16564 interfaceC16564) {
        char[] cArr;
        int size = size();
        if (size == 0) {
            cArr = C22532.f72878;
        } else {
            char[] cArr2 = new char[size];
            mo21900(0, 0, cArr2, size);
            cArr = cArr2;
        }
        if (interfaceC16564 == null) {
            C22532.m50772(cArr, cArr.length);
        } else {
            C22532.m50774(cArr, 0, cArr.length, interfaceC16564);
        }
        mo21901(cArr, 0, cArr.length);
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo21902(int i, InterfaceC12835 interfaceC12835) {
        m26472(i);
        InterfaceC21040 it = interfaceC12835.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo21904(it.mo5320(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC4301
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13694(InterfaceC12835 interfaceC12835) {
        return mo21902(size(), interfaceC12835);
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC8360 interfaceC8360ListIterator = listIterator(0);
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
                sb.append(String.valueOf(interfaceC8360ListIterator.mo5320()));
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

    @Override // l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public void mo24255(InterfaceC16564 interfaceC16564) {
        char[] cArr;
        if (interfaceC16564 != null) {
            int size = size();
            if (size == 0) {
                cArr = C22532.f72878;
            } else {
                char[] cArr2 = new char[size];
                mo21900(0, 0, cArr2, size);
                cArr = cArr2;
            }
            C22532.m50775(cArr, 0, cArr.length, interfaceC16564, (char[]) null);
            mo21901(cArr, 0, cArr.length);
            return;
        }
        mo24256(interfaceC16564);
    }
}
