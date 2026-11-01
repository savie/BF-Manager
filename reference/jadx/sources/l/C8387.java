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

/* JADX INFO: renamed from: l.۠᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes4.dex */
public class C8387 extends AbstractC2720 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353131L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f29125;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient Object[] f29126;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29127;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C8387(Object[] objArr, boolean z) {
        this.f29126 = objArr;
        this.f29125 = z;
    }

    public C8387(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C2271.m6966(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f29126 = C7681.f25444;
        } else {
            this.f29126 = new Object[i];
        }
        this.f29125 = false;
    }

    public C8387() {
        this.f29126 = C7681.f25443;
        this.f29125 = false;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Object[] m22019() {
        return this.f29126;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8387 m22018(Object[] objArr) {
        if (objArr.length < 0) {
            throw new IllegalArgumentException(C12441.m30911(objArr.length, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder("The specified length (0) is greater than the array size (")));
        }
        C8387 c8387 = new C8387(objArr, true);
        c8387.f29127 = 0;
        return c8387;
    }

    static {
        C11064.of(new C1363(1), new C13359(1), new C4185(1), new EnumC23764[0]);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m22017(int i) {
        Object[] objArr = this.f29126;
        if (i <= objArr.length) {
            return;
        }
        if (objArr != C7681.f25443) {
            i = (int) Math.max(Math.min(((long) objArr.length) + ((long) (objArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        if (this.f29125) {
            this.f29126 = C7681.m20308(i, this.f29127, this.f29126);
        } else {
            Object[] objArr2 = new Object[i];
            System.arraycopy(this.f29126, 0, objArr2, 0, this.f29127);
            this.f29126 = objArr2;
        }
    }

    @Override // l.InterfaceC4548
    /* JADX INFO: renamed from: ۙ */
    public final void mo12693(int i, int i2, int i3, Object[] objArr) {
        C7000.m18807(objArr.length, i2, i3);
        System.arraycopy(this.f29126, i, objArr, i2, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m8301(i);
        m22017(this.f29127 + 1);
        int i2 = this.f29127;
        if (i != i2) {
            Object[] objArr = this.f29126;
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        }
        this.f29126[i] = obj;
        this.f29127++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m22017(this.f29127 + 1);
        Object[] objArr = this.f29126;
        int i = this.f29127;
        this.f29127 = i + 1;
        objArr[i] = obj;
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i < this.f29127) {
            return this.f29126[i];
        }
        throw new IndexOutOfBoundsException(C12441.m30911(this.f29127, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC2720, java.util.List
    public final int indexOf(Object obj) {
        Object[] objArr = this.f29126;
        for (int i = 0; i < this.f29127; i++) {
            if (C13638.equals(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC2720, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f29126;
        int i = this.f29127;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (C13638.equals(obj, objArr[i2])) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f29127;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f29127, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
        }
        Object[] objArr = this.f29126;
        Object obj = objArr[i];
        int i3 = i2 - 1;
        this.f29127 = i3;
        if (i != i3) {
            System.arraycopy(objArr, i + 1, objArr, i, i3 - i);
        }
        objArr[this.f29127] = null;
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
        if (i >= this.f29127) {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f29127, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i, "Index (", ") is greater than or equal to list size (")));
        }
        Object[] objArr = this.f29126;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // l.AbstractC2720, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Arrays.fill(this.f29126, 0, this.f29127, (Object) null);
        this.f29127 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29127;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f29127) {
            return this;
        }
        m8301(i);
        m8301(i2);
        if (i <= i2) {
            return new C18970(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // l.AbstractC2720, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        int i = this.f29127;
        if (i == 0) {
            return C7681.f25444;
        }
        return Arrays.copyOf(this.f29126, i, Object[].class);
    }

    @Override // l.AbstractC2720, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[this.f29127];
        } else if (objArr.length < this.f29127) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f29127);
        }
        System.arraycopy(this.f29126, 0, objArr, 0, this.f29127);
        int length = objArr.length;
        int i = this.f29127;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22021(int i) {
        Object[] objArr = this.f29126;
        if (i > objArr.length) {
            this.f29126 = C7681.m20308(i, this.f29127, objArr);
        }
        int i2 = this.f29127;
        if (i > i2) {
            Arrays.fill(this.f29126, i2, i, (Object) null);
        } else {
            Arrays.fill(this.f29126, i, i2, (Object) null);
        }
        this.f29127 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f29127 == 0;
    }

    @Override // l.InterfaceC4548
    /* JADX INFO: renamed from: ۙ */
    public final void mo12692(int i, int i2) {
        C7000.m18804(this.f29127, i, i2);
        Object[] objArr = this.f29126;
        System.arraycopy(objArr, i2, objArr, i, this.f29127 - i2);
        int i3 = i2 - i;
        this.f29127 -= i3;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            this.f29126[this.f29127 + i4] = null;
            i3 = i4;
        }
    }

    @Override // l.InterfaceC4548
    /* JADX INFO: renamed from: ۙ */
    public final void mo12694(int i, int i2, Object[] objArr) {
        m8301(i);
        C7000.m18807(objArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f29127) {
            System.arraycopy(objArr, 0, this.f29126, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C12441.m30911(this.f29127, MotionUtils.EASING_TYPE_FORMAT_END, C17214.m40153(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC2720, l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f29126;
        for (int i = 0; i < this.f29127; i++) {
            consumer.accept(objArr[i]);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC4548) {
            return m22020(i, (InterfaceC4548) collection);
        }
        m8301(i);
        int size = collection.size();
        if (size == 0) {
            return false;
        }
        m22017(this.f29127 + size);
        Object[] objArr = this.f29126;
        System.arraycopy(objArr, i, objArr, i + size, this.f29127 - i);
        Iterator it = collection.iterator();
        this.f29127 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f29126[i] = it.next();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22020(int i, InterfaceC4548 interfaceC4548) {
        m8301(i);
        int size = interfaceC4548.size();
        if (size == 0) {
            return false;
        }
        m22017(this.f29127 + size);
        Object[] objArr = this.f29126;
        System.arraycopy(objArr, i, objArr, i + size, this.f29127 - i);
        interfaceC4548.mo12693(0, i, size, this.f29126);
        this.f29127 += size;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        Object[] objArr = this.f29126;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f29127;
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
        boolean z = this.f29127 != i3;
        this.f29127 = i3;
        return z;
    }

    @Override // l.AbstractC14695, java.util.Collection, l.InterfaceC10441
    public final boolean removeIf(Predicate predicate) {
        int i;
        Object[] objArr = this.f29126;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f29127;
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
        boolean z = this.f29127 != i3;
        this.f29127 = i3;
        return z;
    }

    @Override // l.AbstractC2720, java.util.List
    public final InterfaceC13722 listIterator(int i) {
        m8301(i);
        return new C23204(this, i);
    }

    @Override // l.AbstractC2720, l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC10441, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C15443(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C15443(this);
    }

    @Override // l.AbstractC2720, java.util.List, l.InterfaceC14674
    public final void sort(Comparator comparator) {
        if (comparator == null) {
            Arrays.sort(this.f29126, 0, this.f29127);
        } else {
            Arrays.sort(this.f29126, 0, this.f29127, comparator);
        }
    }

    public final Object clone() {
        Class<?> cls = getClass();
        Object[] objArrCopyOf = C7681.f25444;
        if (cls == C8387.class) {
            Object[] objArr = this.f29126;
            int i = this.f29127;
            if (i != 0) {
                objArrCopyOf = Arrays.copyOf(objArr, i, Object[].class);
            }
            C8387 c8387 = new C8387(objArrCopyOf, false);
            c8387.f29127 = this.f29127;
            return c8387;
        }
        try {
            C8387 c8388 = (C8387) super.clone();
            Object[] objArr2 = this.f29126;
            int i2 = this.f29127;
            if (i2 != 0) {
                objArrCopyOf = Arrays.copyOf(objArr2, i2, Object[].class);
            }
            c8388.f29126 = objArrCopyOf;
            return c8388;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    @Override // l.AbstractC2720, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C8387) {
            C8387 c8387 = (C8387) obj;
            if (c8387 != this) {
                int i = this.f29127;
                int i2 = c8387.f29127;
                if (i == i2) {
                    Object[] objArr = this.f29126;
                    Object[] objArr2 = c8387.f29126;
                    if (objArr != objArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (C13638.equals(objArr[i3], objArr2[i3])) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C18970) {
            return ((C18970) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC2720
    /* JADX INFO: renamed from: ۙ */
    public final int compareTo(List list) {
        if (list instanceof C8387) {
            C8387 c8387 = (C8387) list;
            int i = this.f29127;
            int i2 = c8387.f29127;
            Object[] objArr = this.f29126;
            Object[] objArr2 = c8387.f29126;
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
        if (list instanceof C18970) {
            return -((C18970) list).compareTo(this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f29126;
        for (int i = 0; i < this.f29127; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object[] objArr = new Object[this.f29127];
        this.f29126 = objArr;
        for (int i = 0; i < this.f29127; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }
}
