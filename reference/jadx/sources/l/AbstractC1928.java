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

/* JADX INFO: renamed from: l.֫۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1928 extends AbstractC4911 implements List, RandomAccess, InterfaceC5427 {
    public static final long serialVersionUID = -889275714;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14956 f6476 = new C19827(0, C4867.f16966);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6477 = 0;

    @Override // java.util.List, l.InterfaceC5427
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C15121.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, l.InterfaceC5427
    public /* synthetic */ void sort(Comparator comparator) {
        C15121.$default$sort(this, comparator);
    }

    @Override // l.AbstractC4911
    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 mo6621() {
        return this;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m6617() {
        Object[] objArr = {2, 5, 6};
        C7566.m20662(3, objArr);
        return m6618(3, objArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC5754 m6611() {
        return C8091.m21979();
    }

    public static AbstractC1928 of() {
        return C4867.f16966;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m6618(int i, Object[] objArr) {
        if (i == 0) {
            return C4867.f16966;
        }
        return new C4867(i, objArr);
    }

    @SafeVarargs
    public static AbstractC1928 of(Object... objArr) {
        C12128.m30308("the total number of elements must fit in an int", objArr.length <= 2147483635);
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
        C7566.m20662(length, objArr2);
        return m6618(length, objArr2);
    }

    public static AbstractC1928 of(Object obj) {
        Object[] objArr = {obj};
        C7566.m20662(1, objArr);
        return m6618(1, objArr);
    }

    public static AbstractC1928 of(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C7566.m20662(2, objArr);
        return m6618(2, objArr);
    }

    public static AbstractC1928 of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        C7566.m20662(5, objArr);
        return m6618(5, objArr);
    }

    public static AbstractC1928 of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7};
        C7566.m20662(7, objArr);
        return m6618(7, objArr);
    }

    public static AbstractC1928 copyOf(Collection collection) {
        if (collection instanceof AbstractC4911) {
            AbstractC1928 abstractC1928Mo6621 = ((AbstractC4911) collection).mo6621();
            if (!abstractC1928Mo6621.mo14905()) {
                return abstractC1928Mo6621;
            }
            Object[] array = abstractC1928Mo6621.toArray();
            return m6618(array.length, array);
        }
        Object[] array2 = collection.toArray();
        C7566.m20662(array2.length, array2);
        return m6618(array2.length, array2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m6614(Iterator it) {
        if (!it.hasNext()) {
            return C4867.f16966;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return of(next);
        }
        C22811 c22811 = new C22811();
        while (true) {
            c22811.m19805(next);
            if (!it.hasNext()) {
                return c22811.m51441();
            }
            next = it.next();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m6615(Object[] objArr) {
        if (objArr.length == 0) {
            return C4867.f16966;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        C7566.m20662(objArr2.length, objArr2);
        return m6618(objArr2.length, objArr2);
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final AbstractC4516 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final AbstractC14956 listIterator(int i) {
        C12128.m30311(i, size());
        if (isEmpty()) {
            return f6476;
        }
        return new C19827(i, this);
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    public AbstractC1928 subList(int i, int i2) {
        C12128.m30303(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C4867.f16966;
        }
        return new C5657(this, i, i3);
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

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo6619(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC1928 mo6620() {
        return size() <= 1 ? this : new C15351(this);
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

    @Override // l.AbstractC4911
    public Object writeReplace() {
        return new C13114(toArray());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22811 m6616(int i) {
        C19278.m44623(i, "expectedSize");
        return new C22811(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m6612(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return m6614(iterable.iterator());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m6613(Comparator comparator, Collection collection) {
        comparator.getClass();
        Object[] objArrM39337 = C16625.m39337(collection);
        C7566.m20662(objArrM39337.length, objArrM39337);
        Arrays.sort(objArrM39337, comparator);
        return m6618(objArrM39337.length, objArrM39337);
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
                            if (it2.hasNext() && C17359.equals(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (C17359.equals(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.List
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

    @Override // java.util.List
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
