package l;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܳ۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M9MB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14378 extends AbstractC10850 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Object[] f47117 = new Object[0];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f47118;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object[] f47119 = f47117;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f47120;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM34605;
        C13465.m32966(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f47119.length != 0) {
            int iM34606 = m34605(this.f47118 + this.f47120);
            int i = this.f47120;
            if (i < iM34606) {
                iM34605 = i;
                while (i < iM34606) {
                    Object obj = this.f47119[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f47119[iM34605] = obj;
                        iM34605++;
                    }
                    i++;
                }
                C1676.m5591(this.f47119, null, iM34605, iM34606);
            } else {
                int length = this.f47119.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f47119;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f47119[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM34605 = m34605(i2);
                for (int i3 = 0; i3 < iM34606; i3++) {
                    Object[] objArr2 = this.f47119;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f47119[iM34605] = obj3;
                        iM34605 = m34606(iM34605);
                    }
                }
                z = z2;
            }
            if (z) {
                m34609();
                this.f47118 = m34608(iM34605 - this.f47120);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM34605;
        C13465.m32966(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f47119.length != 0) {
            int iM34606 = m34605(this.f47118 + this.f47120);
            int i = this.f47120;
            if (i < iM34606) {
                iM34605 = i;
                while (i < iM34606) {
                    Object obj = this.f47119[i];
                    if (collection.contains(obj)) {
                        this.f47119[iM34605] = obj;
                        iM34605++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C1676.m5591(this.f47119, null, iM34605, iM34606);
            } else {
                int length = this.f47119.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f47119;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f47119[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM34605 = m34605(i2);
                for (int i3 = 0; i3 < iM34606; i3++) {
                    Object[] objArr2 = this.f47119;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f47119[iM34605] = obj3;
                        iM34605 = m34606(iM34605);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m34609();
                this.f47118 = m34608(iM34605 - this.f47120);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo27204 = mo27204();
        if (i < 0 || i >= iMo27204) {
            throw new IndexOutOfBoundsException(C2271.m6967("index: ", i, iMo27204, ", size: "));
        }
        return this.f47119[m34605(this.f47120 + i)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo27204() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo27204 = mo27204();
        if (i < 0 || i >= iMo27204) {
            throw new IndexOutOfBoundsException(C2271.m6967("index: ", i, iMo27204, ", size: "));
        }
        int iM34605 = m34605(this.f47120 + i);
        Object[] objArr = this.f47119;
        Object obj2 = objArr[iM34605];
        objArr[iM34605] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo27204()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f47118;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C2271.m6967("index: ", i, i2, ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m34609();
        m34610(this.f47118 + 1);
        int iM34605 = m34605(this.f47120 + i);
        int i3 = this.f47118;
        if (i < ((i3 + 1) >> 1)) {
            if (iM34605 == 0) {
                Object[] objArr = this.f47119;
                C13465.m32966(objArr, "<this>");
                iM34605 = objArr.length;
            }
            int i4 = iM34605 - 1;
            int i5 = this.f47120;
            if (i5 == 0) {
                Object[] objArr2 = this.f47119;
                C13465.m32966(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.f47120;
            if (i4 >= i6) {
                Object[] objArr3 = this.f47119;
                objArr3[length] = objArr3[i6];
                C9439.m24197(i6, i6 + 1, i4 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f47119;
                C9439.m24197(i6 - 1, i6, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f47119;
                objArr5[objArr5.length - 1] = objArr5[0];
                C9439.m24197(0, 1, i4 + 1, objArr5, objArr5);
            }
            this.f47119[i4] = obj;
            this.f47120 = length;
        } else {
            int iM34606 = m34605(i3 + this.f47120);
            if (iM34605 < iM34606) {
                Object[] objArr6 = this.f47119;
                C9439.m24197(iM34605 + 1, iM34605, iM34606, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f47119;
                C9439.m24197(1, 0, iM34606, objArr7, objArr7);
                Object[] objArr8 = this.f47119;
                objArr8[0] = objArr8[objArr8.length - 1];
                C9439.m24197(iM34605 + 1, iM34605, objArr8.length - 1, objArr8, objArr8);
            }
            this.f47119[iM34605] = obj;
        }
        this.f47118++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C13465.m32966(collection, "elements");
        int i2 = this.f47118;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C2271.m6967("index: ", i, i2, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f47118) {
            return addAll(collection);
        }
        m34609();
        m34610(collection.size() + this.f47118);
        int iM34605 = m34605(this.f47118 + this.f47120);
        int iM34606 = m34605(this.f47120 + i);
        int size = collection.size();
        if (i >= ((this.f47118 + 1) >> 1)) {
            int i3 = iM34606 + size;
            if (iM34606 < iM34605) {
                int i4 = size + iM34605;
                Object[] objArr = this.f47119;
                if (i4 <= objArr.length) {
                    C9439.m24197(i3, iM34606, iM34605, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    C9439.m24197(i3 - objArr.length, iM34606, iM34605, objArr, objArr);
                } else {
                    int length = iM34605 - (i4 - objArr.length);
                    C9439.m24197(0, length, iM34605, objArr, objArr);
                    Object[] objArr2 = this.f47119;
                    C9439.m24197(i3, iM34606, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f47119;
                C9439.m24197(size, 0, iM34605, objArr3, objArr3);
                Object[] objArr4 = this.f47119;
                if (i3 >= objArr4.length) {
                    C9439.m24197(i3 - objArr4.length, iM34606, objArr4.length, objArr4, objArr4);
                } else {
                    C9439.m24197(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f47119;
                    C9439.m24197(i3, iM34606, objArr5.length - size, objArr5, objArr5);
                }
            }
            m34607(iM34606, collection);
            return true;
        }
        int i5 = this.f47120;
        int length2 = i5 - size;
        if (iM34606 < i5) {
            Object[] objArr6 = this.f47119;
            C9439.m24197(length2, i5, objArr6.length, objArr6, objArr6);
            if (size >= iM34606) {
                Object[] objArr7 = this.f47119;
                C9439.m24197(objArr7.length - size, 0, iM34606, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f47119;
                C9439.m24197(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f47119;
                C9439.m24197(0, size, iM34606, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f47119;
            C9439.m24197(length2, i5, iM34606, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f47119;
            length2 += objArr11.length;
            int i6 = iM34606 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                C9439.m24197(length2, i5, iM34606, objArr11, objArr11);
            } else {
                C9439.m24197(length2, i5, i5 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f47119;
                C9439.m24197(0, this.f47120 + length3, iM34606, objArr12, objArr12);
            }
        }
        this.f47120 = length2;
        m34607(m34608(iM34606 - size), collection);
        return true;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C0265.m1765(i, i2, this.f47118);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f47118) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo27203(i);
            return;
        }
        m34609();
        if (i < this.f47118 - i2) {
            int iM34605 = m34605(this.f47120 + (i - 1));
            int iM34606 = m34605(this.f47120 + (i2 - 1));
            while (i > 0) {
                int i4 = iM34605 + 1;
                int iMin = Math.min(i, Math.min(i4, iM34606 + 1));
                Object[] objArr = this.f47119;
                int i5 = iM34606 - iMin;
                int i6 = iM34605 - iMin;
                C9439.m24197(i5 + 1, i6 + 1, i4, objArr, objArr);
                iM34605 = m34608(i6);
                iM34606 = m34608(i5);
                i -= iMin;
            }
            int iM34607 = m34605(this.f47120 + i3);
            m34611(this.f47120, iM34607);
            this.f47120 = iM34607;
        } else {
            int iM34608 = m34605(this.f47120 + i2);
            int iM34609 = m34605(this.f47120 + i);
            int i7 = this.f47118;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f47119;
                i2 = Math.min(i7, Math.min(objArr2.length - iM34608, objArr2.length - iM34609));
                Object[] objArr3 = this.f47119;
                int i8 = iM34608 + i2;
                C9439.m24197(iM34609, iM34608, i8, objArr3, objArr3);
                iM34608 = m34605(i8);
                iM34609 = m34605(iM34609 + i2);
            }
            int iM346010 = m34605(this.f47118 + this.f47120);
            m34611(m34608(iM346010 - i3), iM346010);
        }
        this.f47118 -= i3;
    }

    @Override // l.AbstractC10850
    /* JADX INFO: renamed from: ۙ */
    public final Object mo27203(int i) {
        int i2 = this.f47118;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C2271.m6967("index: ", i, i2, ", size: "));
        }
        if (i == C4892.m13615((List) this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m34609();
        int iM34605 = m34605(this.f47120 + i);
        Object[] objArr = this.f47119;
        Object obj = objArr[iM34605];
        if (i < (this.f47118 >> 1)) {
            int i3 = this.f47120;
            if (iM34605 >= i3) {
                C9439.m24197(i3 + 1, i3, iM34605, objArr, objArr);
            } else {
                C9439.m24197(1, 0, iM34605, objArr, objArr);
                Object[] objArr2 = this.f47119;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f47120;
                C9439.m24197(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f47119;
            int i5 = this.f47120;
            objArr3[i5] = null;
            this.f47120 = m34606(i5);
        } else {
            int iM34606 = m34605(C4892.m13615((List) this) + this.f47120);
            if (iM34605 <= iM34606) {
                Object[] objArr4 = this.f47119;
                C9439.m24197(iM34605, iM34605 + 1, iM34606 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f47119;
                C9439.m24197(iM34605, iM34605 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f47119;
                objArr6[objArr6.length - 1] = objArr6[0];
                C9439.m24197(0, 1, iM34606 + 1, objArr6, objArr6);
            }
            this.f47119[iM34606] = null;
        }
        this.f47118--;
        return obj;
    }

    @Override // l.AbstractC10850
    /* JADX INFO: renamed from: ܰ */
    public final int mo27204() {
        return this.f47118;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final void m34610(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f47119;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f47117) {
            if (i < 10) {
                i = 10;
            }
            this.f47119 = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        C9439.m24197(0, this.f47120, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f47119;
        int length2 = objArr3.length;
        int i3 = this.f47120;
        C9439.m24197(length2 - i3, 0, i3, objArr3, objArr2);
        this.f47120 = 0;
        this.f47119 = objArr2;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private final int m34605(int i) {
        Object[] objArr = this.f47119;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private final int m34608(int i) {
        return i < 0 ? i + this.f47119.length : i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private final int m34606(int i) {
        Object[] objArr = this.f47119;
        C13465.m32966(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void addFirst(Object obj) {
        m34609();
        m34610(this.f47118 + 1);
        int length = this.f47120;
        if (length == 0) {
            Object[] objArr = this.f47119;
            C13465.m32966(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f47120 = i;
        this.f47119[i] = obj;
        this.f47118++;
    }

    public final void addLast(Object obj) {
        m34609();
        m34610(mo27204() + 1);
        this.f47119[m34605(mo27204() + this.f47120)] = obj;
        this.f47118 = mo27204() + 1;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m34609();
        Object[] objArr = this.f47119;
        int i = this.f47120;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f47120 = m34606(i);
        this.f47118 = mo27204() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m34609();
        int iM34605 = m34605(C4892.m13615((List) this) + this.f47120);
        Object[] objArr = this.f47119;
        Object obj = objArr[iM34605];
        objArr[iM34605] = null;
        this.f47118 = mo27204() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m34607(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f47119.length;
        while (i < length && it.hasNext()) {
            this.f47119[i] = it.next();
            i++;
        }
        int i2 = this.f47120;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f47119[i3] = it.next();
        }
        this.f47118 = collection.size() + this.f47118;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        C13465.m32966(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m34609();
        m34610(collection.size() + mo27204());
        m34607(m34605(mo27204() + this.f47120), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM34605 = m34605(mo27204() + this.f47120);
        int length = this.f47120;
        if (length < iM34605) {
            while (length < iM34605) {
                if (C13465.m32965(obj, this.f47119[length])) {
                    i = this.f47120;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f47120) < iM34605) {
            return -1;
        }
        int length2 = this.f47119.length;
        while (length < length2) {
            if (C13465.m32965(obj, this.f47119[length])) {
                i = this.f47120;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM34605; i2++) {
            if (C13465.m32965(obj, this.f47119[i2])) {
                length = i2 + this.f47119.length;
                i = this.f47120;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM34605 = m34605(this.f47118 + this.f47120);
        int i2 = this.f47120;
        if (i2 < iM34605) {
            length = iM34605 - 1;
            if (i2 <= length) {
                while (!C13465.m32965(obj, this.f47119[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f47120;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f47120 >= iM34605) {
            do {
                iM34605--;
                if (-1 >= iM34605) {
                    Object[] objArr = this.f47119;
                    C13465.m32966(objArr, "<this>");
                    length = objArr.length - 1;
                    int i3 = this.f47120;
                    if (i3 <= length) {
                        while (!C13465.m32965(obj, this.f47119[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f47120;
                    }
                }
                return length - i;
            } while (!C13465.m32965(obj, this.f47119[iM34605]));
            length = iM34605 + this.f47119.length;
            i = this.f47120;
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo27203(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m34609();
            m34611(this.f47120, m34605(mo27204() + this.f47120));
        }
        this.f47120 = 0;
        this.f47118 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        C13465.m32966(objArr, "array");
        int length = objArr.length;
        int i = this.f47118;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            C13465.m32963(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM34605 = m34605(this.f47118 + this.f47120);
        int i2 = this.f47120;
        if (i2 < iM34605) {
            C1676.m5592(this.f47119, objArr, 0, i2, iM34605, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f47119;
            C9439.m24197(0, this.f47120, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f47119;
            C9439.m24197(objArr3.length - this.f47120, 0, iM34605, objArr3, objArr);
        }
        int i3 = this.f47118;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final void m34611(int i, int i2) {
        if (i < i2) {
            C1676.m5591(this.f47119, null, i, i2);
            return;
        }
        Object[] objArr = this.f47119;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        C1676.m5591(this.f47119, null, 0, i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private final void m34609() {
        ((AbstractList) this).modCount++;
    }
}
