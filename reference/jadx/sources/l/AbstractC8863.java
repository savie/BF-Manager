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

/* JADX INFO: renamed from: l.۠᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8863 extends AbstractC0660 implements InterfaceC21874, InterfaceC5427 {
    @Override // l.AbstractC0660, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C15121.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo25096(((Float) obj).floatValue(), i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Float.valueOf(mo25091(((Float) obj).floatValue(), i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23741(int i) {
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
    public final void m23746(int i) {
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

    @Override // l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC15906 spliterator() {
        if (this instanceof RandomAccess) {
            return new C2897(this);
        }
        return new C6212(listIterator(0), C8008.m21873(this), 16720);
    }

    @Override // java.util.List, l.InterfaceC5427
    public final void sort(Comparator comparator) {
        InterfaceC6386 c24286;
        if (comparator == null || (comparator instanceof InterfaceC6386)) {
            c24286 = (InterfaceC6386) comparator;
        } else {
            c24286 = new C24286(comparator);
        }
        mo23744(c24286);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC17572) {
            return mo23742(i, (InterfaceC17572) collection);
        }
        m23741(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo25096(((Float) it.next()).floatValue(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC10685 interfaceC10685ListIterator = listIterator(0);
        int size = size();
        int iFloatToRawIntBits = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iFloatToRawIntBits;
            }
            iFloatToRawIntBits = (iFloatToRawIntBits * 31) + Float.floatToRawIntBits(interfaceC10685ListIterator.nextFloat());
            size = i;
        }
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public InterfaceC9367 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC21874, java.util.List
    public final InterfaceC10685 listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int mo23745(float f) {
        InterfaceC10685 interfaceC10685ListIterator = listIterator(0);
        while (interfaceC10685ListIterator.hasNext()) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(interfaceC10685ListIterator.nextFloat())) {
                return interfaceC10685ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo6580(float f) {
        return mo23745(f) >= 0;
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int mo23743(float f) {
        InterfaceC10685 interfaceC10685ListIterator = listIterator(size());
        while (interfaceC10685ListIterator.hasPrevious()) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(interfaceC10685ListIterator.mo15019())) {
                return interfaceC10685ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC0660, l.InterfaceC10113
    /* JADX INFO: renamed from: ᩷ */
    public void mo2884(InterfaceC0419 interfaceC0419) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(interfaceC0419);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            interfaceC0419.mo2223(getFloat(i));
        }
    }

    @Override // java.util.List, l.InterfaceC5427
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C17359.requireNonNull(unaryOperator);
        InterfaceC3974 interfaceC3974 = unaryOperator instanceof InterfaceC3974 ? (InterfaceC3974) unaryOperator : new InterfaceC3974() { // from class: l.ۙۛ᩹
            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
                return C6347.$default$andThen(this, doubleUnaryOperator);
            }

            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
                return C6347.$default$compose(this, doubleUnaryOperator);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // l.InterfaceC3974
            /* JADX INFO: renamed from: ᩷ */
            public final float mo12806(float f) {
                return ((Float) unaryOperator.apply(Float.valueOf(f))).floatValue();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Float.valueOf(mo12806(((Float) obj).floatValue()));
            }

            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                return mo12806(C8485.m22800(d));
            }
        };
        InterfaceC10685 interfaceC10685ListIterator = listIterator(0);
        while (interfaceC10685ListIterator.hasNext()) {
            interfaceC10685ListIterator.mo15018(interfaceC3974.mo12806(interfaceC10685ListIterator.nextFloat()));
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo25092(0, size());
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return mo23745(((Float) obj).floatValue());
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return mo23743(((Float) obj).floatValue());
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
                if (list instanceof InterfaceC21874) {
                    InterfaceC10685 interfaceC10685ListIterator = listIterator(0);
                    InterfaceC10685 interfaceC10685ListIterator2 = ((InterfaceC21874) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (interfaceC10685ListIterator.nextFloat() != interfaceC10685ListIterator2.nextFloat()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC10685 interfaceC10685ListIterator3 = listIterator(0);
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (C17359.equals(interfaceC10685ListIterator3.next(), listIterator.next())) {
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
            if (list instanceof InterfaceC21874) {
                InterfaceC10685 interfaceC10685ListIterator = listIterator(0);
                InterfaceC10685 interfaceC10685ListIterator2 = ((InterfaceC21874) list).listIterator();
                while (interfaceC10685ListIterator.hasNext() && interfaceC10685ListIterator2.hasNext()) {
                    int iCompare = Float.compare(interfaceC10685ListIterator.nextFloat(), interfaceC10685ListIterator2.nextFloat());
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                if (interfaceC10685ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC10685ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC10685 interfaceC10685ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC10685ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC10685ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC10685ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Float.valueOf(mo25095(i));
    }

    @Override // l.InterfaceC21874
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo23744(InterfaceC6386 interfaceC6386) {
        float[] fArr;
        int size = size();
        if (size == 0) {
            fArr = C11605.f36438;
        } else {
            float[] fArr2 = new float[size];
            mo25093(0, 0, size, fArr2);
            fArr = fArr2;
        }
        if (interfaceC6386 == null) {
            C11605.m29164(0, fArr.length, fArr, null);
        } else {
            C11605.m29165(fArr, 0, fArr.length, interfaceC6386, null);
        }
        mo25094(0, fArr.length, fArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo23742(int i, InterfaceC17572 interfaceC17572) {
        m23741(i);
        InterfaceC9367 it = interfaceC17572.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo25096(it.nextFloat(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC0660
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2881(InterfaceC17572 interfaceC17572) {
        return mo23742(size(), interfaceC17572);
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC10685 interfaceC10685ListIterator = listIterator(0);
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
                sb.append(String.valueOf(interfaceC10685ListIterator.nextFloat()));
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
