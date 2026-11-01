package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.᩹ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22433 extends AbstractC1826 implements List, RandomAccess, InterfaceC14674 {
    public static final long serialVersionUID = -889275714;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC16706 f73216 = new C13967(0, C12038.f40301);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73217 = 0;

    @Override // java.util.List, l.InterfaceC14674
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C11146.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, l.InterfaceC14674
    public /* synthetic */ void sort(Comparator comparator) {
        C11146.$default$sort(this, comparator);
    }

    @Override // l.AbstractC1826
    @Deprecated
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC22433 mo5971() {
        return this;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m49801() {
        Object[] objArr = {2, 5, 6};
        C6019.m16341(3, objArr);
        return m49802(3, objArr);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14592 m49795() {
        return C16063.m38064();
    }

    public static AbstractC22433 of() {
        return C12038.f40301;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m49802(int i, Object[] objArr) {
        if (i == 0) {
            return C12038.f40301;
        }
        return new C12038(i, objArr);
    }

    @SafeVarargs
    public static AbstractC22433 of(Object... objArr) {
        C18304.m42516("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = "Blues";
        objArr2[1] = "Classic Rock";
        objArr2[2] = "Country";
        objArr2[3] = "Dance";
        objArr2[4] = "Disco";
        objArr2[5] = "Funk";
        objArr2[6] = "Grunge";
        objArr2[7] = "Hip-Hop";
        objArr2[8] = "Jazz";
        objArr2[9] = "Metal";
        objArr2[10] = "New Age";
        objArr2[11] = "Oldies";
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        C6019.m16341(length, objArr2);
        return m49802(length, objArr2);
    }

    public static AbstractC22433 of(Object obj) {
        Object[] objArr = {obj};
        C6019.m16341(1, objArr);
        return m49802(1, objArr);
    }

    public static AbstractC22433 of(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C6019.m16341(2, objArr);
        return m49802(2, objArr);
    }

    public static AbstractC22433 of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        C6019.m16341(5, objArr);
        return m49802(5, objArr);
    }

    public static AbstractC22433 of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7};
        C6019.m16341(7, objArr);
        return m49802(7, objArr);
    }

    public static AbstractC22433 copyOf(Collection collection) {
        if (collection instanceof AbstractC1826) {
            AbstractC22433 abstractC22433Mo5971 = ((AbstractC1826) collection).mo5971();
            if (!abstractC22433Mo5971.mo5042()) {
                return abstractC22433Mo5971;
            }
            Object[] array = abstractC22433Mo5971.toArray();
            return m49802(array.length, array);
        }
        Object[] array2 = collection.toArray();
        C6019.m16341(array2.length, array2);
        return m49802(array2.length, array2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m49799(Iterator it) {
        if (!it.hasNext()) {
            return C12038.f40301;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return of(next);
        }
        C4793 c4793 = new C4793();
        while (true) {
            c4793.m52161(next);
            if (!it.hasNext()) {
                return c4793.m13309();
            }
            next = it.next();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m49800(Object[] objArr) {
        if (objArr.length == 0) {
            return C12038.f40301;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        C6019.m16341(objArr2.length, objArr2);
        return m49802(objArr2.length, objArr2);
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final AbstractC0477 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final AbstractC16706 listIterator(int i) {
        C18304.m42519(i, size());
        if (isEmpty()) {
            return f73216;
        }
        return new C13967(i, this);
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    public AbstractC22433 subList(int i, int i2) {
        C18304.m42511(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C12038.f40301;
        }
        return new C5499(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ۙ */
    public int mo5968(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* JADX INFO: renamed from: ֨ */
    public AbstractC22433 mo29543() {
        return size() <= 1 ? this : new C11850(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // l.AbstractC1826
    public Object writeReplace() {
        return new C2676(toArray());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4793 m49796(int i) {
        C20296.m45806(i, "expectedSize");
        return new C4793(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m49797(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return m49799(iterable.iterator());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m49798(Comparator comparator, Collection collection) {
        comparator.getClass();
        Object[] objArrM50471 = C22808.m50471(collection);
        C6019.m16341(objArrM50471.length, objArrM50471);
        Arrays.sort(objArrM50471, comparator);
        return m49802(objArrM50471.length, objArrM50471);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && C13638.equals(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (C13638.equals(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        do {
            size--;
            if (size < 0) {
                return -1;
            }
        } while (!obj.equals(get(size)));
        return size;
    }
}
