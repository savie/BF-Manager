package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.᩷ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20859 extends AbstractC18036 implements InterfaceC16357, InterfaceC14674 {
    @Override // l.AbstractC18036, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* synthetic */ InterfaceC20693 spliterator() {
        return C11146.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo26069(((Float) obj).floatValue(), i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Float.valueOf(mo26064(((Float) obj).floatValue(), i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46896(int i) {
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
    public final void m46895(int i) {
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

    @Override // l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC11501 spliterator() {
        if (this instanceof RandomAccess) {
            return new C7453(this);
        }
        return new C12912(listIterator(0), C17745.m41307(this), 16720);
    }

    @Override // java.util.List, l.InterfaceC14674
    public final void sort(Comparator comparator) {
        InterfaceC12829 c3655;
        if (comparator == null || (comparator instanceof InterfaceC12829)) {
            c3655 = (InterfaceC12829) comparator;
        } else {
            c3655 = new C3655(comparator);
        }
        mo27740(c3655);
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC13535) {
            return mo26068(i, (InterfaceC13535) collection);
        }
        m46896(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo26069(((Float) it.next()).floatValue(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC12124 interfaceC12124ListIterator = listIterator(0);
        int size = size();
        int iFloatToRawIntBits = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iFloatToRawIntBits;
            }
            iFloatToRawIntBits = (iFloatToRawIntBits * 31) + Float.floatToRawIntBits(interfaceC12124ListIterator.nextFloat());
            size = i;
        }
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public InterfaceC10007 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC16357, java.util.List
    public final InterfaceC12124 listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: ۖ */
    public int mo27734(float f) {
        InterfaceC12124 interfaceC12124ListIterator = listIterator(0);
        while (interfaceC12124ListIterator.hasNext()) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(interfaceC12124ListIterator.nextFloat())) {
                return interfaceC12124ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.InterfaceC13535
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5900(float f) {
        return mo27734(f) >= 0;
    }

    /* JADX INFO: renamed from: ܰ */
    public int mo27739(float f) {
        InterfaceC12124 interfaceC12124ListIterator = listIterator(size());
        while (interfaceC12124ListIterator.hasPrevious()) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(interfaceC12124ListIterator.mo2134())) {
                return interfaceC12124ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC18036, l.InterfaceC19179
    /* JADX INFO: renamed from: ܰ */
    public void mo6890(InterfaceC17767 interfaceC17767) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(interfaceC17767);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            interfaceC17767.mo35707(getFloat(i));
        }
    }

    @Override // java.util.List, l.InterfaceC14674
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C13638.requireNonNull(unaryOperator);
        InterfaceC6561 interfaceC6561 = unaryOperator instanceof InterfaceC6561 ? (InterfaceC6561) unaryOperator : new InterfaceC6561() { // from class: l.֡ۖᩴ
            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
                return C13451.$default$andThen(this, doubleUnaryOperator);
            }

            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
                return C13451.$default$compose(this, doubleUnaryOperator);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // l.InterfaceC6561
            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
            public final float mo1192(float f) {
                return ((Float) unaryOperator.apply(Float.valueOf(f))).floatValue();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Float.valueOf(mo1192(((Float) obj).floatValue()));
            }

            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                return mo1192(C21273.m47736(d));
            }
        };
        InterfaceC12124 interfaceC12124ListIterator = listIterator(0);
        while (interfaceC12124ListIterator.hasNext()) {
            interfaceC12124ListIterator.mo2132(interfaceC6561.mo1192(interfaceC12124ListIterator.nextFloat()));
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo26065(0, size());
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return mo27734(((Float) obj).floatValue());
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return mo27739(((Float) obj).floatValue());
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
                if (list instanceof InterfaceC16357) {
                    InterfaceC12124 interfaceC12124ListIterator = listIterator(0);
                    InterfaceC12124 interfaceC12124ListIterator2 = ((InterfaceC16357) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (interfaceC12124ListIterator.nextFloat() != interfaceC12124ListIterator2.nextFloat()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC12124 interfaceC12124ListIterator3 = listIterator(0);
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (C13638.equals(interfaceC12124ListIterator3.next(), listIterator.next())) {
                            size = i2;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC16357) {
                InterfaceC12124 interfaceC12124ListIterator = listIterator(0);
                InterfaceC12124 interfaceC12124ListIterator2 = ((InterfaceC16357) list).listIterator();
                while (interfaceC12124ListIterator.hasNext() && interfaceC12124ListIterator2.hasNext()) {
                    int iCompare = Float.compare(interfaceC12124ListIterator.nextFloat(), interfaceC12124ListIterator2.nextFloat());
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                if (interfaceC12124ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC12124ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC12124 interfaceC12124ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC12124ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC12124ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC12124ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Float.valueOf(mo26070(i));
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo27740(InterfaceC12829 interfaceC12829) {
        float[] fArr;
        int size = size();
        if (size == 0) {
            fArr = C9571.f32283;
        } else {
            float[] fArr2 = new float[size];
            mo26066(0, 0, size, fArr2);
            fArr = fArr2;
        }
        if (interfaceC12829 == null) {
            C9571.m24436(0, fArr.length, fArr, null);
        } else {
            C9571.m24437(fArr, 0, fArr.length, interfaceC12829, null);
        }
        mo26067(0, fArr.length, fArr);
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo26068(int i, InterfaceC13535 interfaceC13535) {
        m46896(i);
        InterfaceC10007 it = interfaceC13535.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo26069(it.nextFloat(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC18036
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28524(InterfaceC13535 interfaceC13535) {
        return mo26068(size(), interfaceC13535);
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC12124 interfaceC12124ListIterator = listIterator(0);
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
                sb.append(String.valueOf(interfaceC12124ListIterator.nextFloat()));
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
