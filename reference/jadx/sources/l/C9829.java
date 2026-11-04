package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes4.dex */
public class C9829 extends AbstractC23212 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353131L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient Object[] f31642;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f31643;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31644;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C9829(Object[] objArr, boolean z) {
        this.f31642 = objArr;
        this.f31643 = z;
    }

    public C9829(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C14442.m34864(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f31642 = C8338.f27328;
        } else {
            this.f31642 = new Object[i];
        }
        this.f31643 = false;
    }

    public C9829() {
        this.f31642 = C8338.f27327;
        this.f31643 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] m25602() {
        return this.f31642;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9829 m25601(Object[] objArr) {
        if (objArr.length < 0) {
            throw new IllegalArgumentException(C12669.m31437(objArr.length, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder("The specified length (0) is greater than the array size (")));
        }
        C9829 c9829 = new C9829(objArr, true);
        c9829.f31644 = 0;
        return c9829;
    }

    static {
        C15448.of(new C17056(1), new C14304(), new C25221(1), new EnumC13211[0]);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m25609(int i) {
        Object[] objArr = this.f31642;
        if (i <= objArr.length) {
            return;
        }
        if (objArr != C8338.f27327) {
            i = (int) Math.max(Math.min(((long) objArr.length) + ((long) (objArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        if (this.f31643) {
            this.f31642 = C8338.m22444(i, this.f31644, this.f31642);
        } else {
            Object[] objArr2 = new Object[i];
            System.arraycopy(this.f31642, 0, objArr2, 0, this.f31644);
            this.f31642 = objArr2;
        }
    }

    @Override // l.InterfaceC17462
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25605(int i, int i2, int i3, Object[] objArr) {
        C18450.m42990(objArr.length, i2, i3);
        System.arraycopy(this.f31642, i, objArr, i2, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m52129(i);
        m25609(this.f31644 + 1);
        int i2 = this.f31644;
        if (i != i2) {
            Object[] objArr = this.f31642;
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        }
        this.f31642[i] = obj;
        this.f31644++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m25609(this.f31644 + 1);
        Object[] objArr = this.f31642;
        int i = this.f31644;
        this.f31644 = i + 1;
        objArr[i] = obj;
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i < this.f31644) {
            return this.f31642[i];
        }
        throw new IndexOutOfBoundsException(C12669.m31437(this.f31644, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC23212, java.util.List
    public final int indexOf(Object obj) {
        Object[] objArr = this.f31642;
        for (int i = 0; i < this.f31644; i++) {
            if (C17359.equals(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC23212, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f31642;
        int i = this.f31644;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (C17359.equals(obj, objArr[i2])) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f31644;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f31644, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
        }
        Object[] objArr = this.f31642;
        Object obj = objArr[i];
        int i3 = i2 - 1;
        this.f31644 = i3;
        if (i != i3) {
            System.arraycopy(objArr, i + 1, objArr, i, i3 - i);
        }
        objArr[this.f31644] = null;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        if (i >= this.f31644) {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f31644, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i, "Index (", ") is greater than or equal to list size (")));
        }
        Object[] objArr = this.f31642;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // l.AbstractC23212, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Arrays.fill(this.f31642, 0, this.f31644, (Object) null);
        this.f31644 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31644;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f31644) {
            return this;
        }
        m52129(i);
        m52129(i2);
        if (i <= i2) {
            return new C18780(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C0703.m3016("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // l.AbstractC23212, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        int i = this.f31644;
        if (i == 0) {
            return C8338.f27328;
        }
        return Arrays.copyOf(this.f31642, i, Object[].class);
    }

    @Override // l.AbstractC23212, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[this.f31644];
        } else if (objArr.length < this.f31644) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f31644);
        }
        System.arraycopy(this.f31642, 0, objArr, 0, this.f31644);
        int length = objArr.length;
        int i = this.f31644;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m25608(int i) {
        Object[] objArr = this.f31642;
        if (i > objArr.length) {
            this.f31642 = C8338.m22444(i, this.f31644, objArr);
        }
        int i2 = this.f31644;
        if (i > i2) {
            Arrays.fill(this.f31642, i2, i, (Object) null);
        } else {
            Arrays.fill(this.f31642, i, i2, (Object) null);
        }
        this.f31644 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f31644 == 0;
    }

    @Override // l.InterfaceC17462
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25604(int i, int i2) {
        C18450.m42985(this.f31644, i, i2);
        Object[] objArr = this.f31642;
        System.arraycopy(objArr, i2, objArr, i, this.f31644 - i2);
        int i3 = i2 - i;
        this.f31644 -= i3;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            this.f31642[this.f31644 + i4] = null;
            i3 = i4;
        }
    }

    @Override // l.InterfaceC17462
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25606(int i, int i2, Object[] objArr) {
        m52129(i);
        C18450.m42990(objArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f31644) {
            System.arraycopy(objArr, 0, this.f31642, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C12669.m31437(this.f31644, MotionUtils.EASING_TYPE_FORMAT_END, C3769.m12235(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC23212, l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f31642;
        for (int i = 0; i < this.f31644; i++) {
            consumer.accept(objArr[i]);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC17462) {
            return m25607(i, (InterfaceC17462) collection);
        }
        m52129(i);
        int size = collection.size();
        if (size == 0) {
            return false;
        }
        m25609(this.f31644 + size);
        Object[] objArr = this.f31642;
        System.arraycopy(objArr, i, objArr, i + size, this.f31644 - i);
        Iterator it = collection.iterator();
        this.f31644 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f31642[i] = it.next();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25607(int i, InterfaceC17462 interfaceC17462) {
        m52129(i);
        int size = interfaceC17462.size();
        if (size == 0) {
            return false;
        }
        m25609(this.f31644 + size);
        Object[] objArr = this.f31642;
        System.arraycopy(objArr, i, objArr, i + size, this.f31644 - i);
        interfaceC17462.mo25605(0, i, size, this.f31642);
        this.f31644 += size;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        Object[] objArr = this.f31642;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f31644;
            if (i2 >= i) {
                break;
            }
            if (!collection.contains(objArr[i2])) {
                objArr[i3] = objArr[i2];
                i3++;
            }
            i2++;
        }
        Arrays.fill(objArr, i3, i, (Object) null);
        boolean z = this.f31644 != i3;
        this.f31644 = i3;
        return z;
    }

    @Override // l.AbstractC5312, java.util.Collection, l.InterfaceC9372
    public final boolean removeIf(Predicate predicate) {
        int i;
        Object[] objArr = this.f31642;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f31644;
            if (i2 >= i) {
                break;
            }
            if (!predicate.test(objArr[i2])) {
                objArr[i3] = objArr[i2];
                i3++;
            }
            i2++;
        }
        Arrays.fill(objArr, i3, i, (Object) null);
        boolean z = this.f31644 != i3;
        this.f31644 = i3;
        return z;
    }

    @Override // l.AbstractC23212, l.InterfaceC17462, java.util.List
    public final InterfaceC15970 listIterator(int i) {
        m52129(i);
        return new C21018(this, i);
    }

    @Override // l.AbstractC23212, l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC21938, l.InterfaceC9372, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C18034(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C18034(this);
    }

    @Override // l.AbstractC23212, java.util.List, l.InterfaceC5427
    public final void sort(Comparator comparator) {
        if (comparator == null) {
            Arrays.sort(this.f31642, 0, this.f31644);
        } else {
            Arrays.sort(this.f31642, 0, this.f31644, comparator);
        }
    }

    public final Object clone() {
        Class<?> cls = getClass();
        Object[] objArrCopyOf = C8338.f27328;
        if (cls == C9829.class) {
            Object[] objArr = this.f31642;
            int i = this.f31644;
            if (i != 0) {
                objArrCopyOf = Arrays.copyOf(objArr, i, Object[].class);
            }
            C9829 c9829 = new C9829(objArrCopyOf, false);
            c9829.f31644 = this.f31644;
            return c9829;
        }
        try {
            C9829 c98210 = (C9829) super.clone();
            Object[] objArr2 = this.f31642;
            int i2 = this.f31644;
            if (i2 != 0) {
                objArrCopyOf = Arrays.copyOf(objArr2, i2, Object[].class);
            }
            c98210.f31642 = objArrCopyOf;
            return c98210;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    @Override // l.AbstractC23212, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C9829) {
            C9829 c9829 = (C9829) obj;
            if (c9829 != this) {
                int i = this.f31644;
                int i2 = c9829.f31644;
                if (i == i2) {
                    Object[] objArr = this.f31642;
                    Object[] objArr2 = c9829.f31642;
                    if (objArr != objArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (C17359.equals(objArr[i3], objArr2[i3])) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C18780) {
            return ((C18780) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC23212
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int compareTo(List list) {
        if (list instanceof C9829) {
            C9829 c9829 = (C9829) list;
            int i = this.f31644;
            int i2 = c9829.f31644;
            Object[] objArr = this.f31642;
            Object[] objArr2 = c9829.f31642;
            int i3 = 0;
            while (i3 < i && i3 < i2) {
                int iCompareTo = ((Comparable) objArr[i3]).compareTo(objArr2[i3]);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                i3++;
            }
            if (i3 < i2) {
                return -1;
            }
            return i3 < i ? 1 : 0;
        }
        if (list instanceof C18780) {
            return -((C18780) list).compareTo(this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f31642;
        for (int i = 0; i < this.f31644; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object[] objArr = new Object[this.f31644];
        this.f31642 = objArr;
        for (int i = 0; i < this.f31644; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }
}
