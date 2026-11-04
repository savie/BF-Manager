package l;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9MB */
/* JADX INFO: loaded from: classes5.dex */
public final class C14454 extends AbstractC24152 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Object[] f45479 = new Object[0];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object[] f45480 = f45479;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f45481;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f45482;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM34914;
        C15243.m36590(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f45480.length != 0) {
            int iM34915 = m34914(this.f45481 + this.f45482);
            int i = this.f45482;
            if (i < iM34915) {
                iM34914 = i;
                while (i < iM34915) {
                    Object obj = this.f45480[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f45480[iM34914] = obj;
                        iM34914++;
                    }
                    i++;
                }
                Object[] objArr = this.f45480;
                C15243.m36590(objArr, "<this>");
                Arrays.fill(objArr, iM34914, iM34915, (Object) null);
            } else {
                int length = this.f45480.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.f45480;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f45480[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM34914 = m34914(i2);
                for (int i3 = 0; i3 < iM34915; i3++) {
                    Object[] objArr3 = this.f45480;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f45480[iM34914] = obj3;
                        iM34914 = m34918(iM34914);
                    }
                }
                z = z2;
            }
            if (z) {
                m34913();
                this.f45481 = m34915(iM34914 - this.f45482);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM34914;
        C15243.m36590(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f45480.length != 0) {
            int iM34915 = m34914(this.f45481 + this.f45482);
            int i = this.f45482;
            if (i < iM34915) {
                iM34914 = i;
                while (i < iM34915) {
                    Object obj = this.f45480[i];
                    if (collection.contains(obj)) {
                        this.f45480[iM34914] = obj;
                        iM34914++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Object[] objArr = this.f45480;
                C15243.m36590(objArr, "<this>");
                Arrays.fill(objArr, iM34914, iM34915, (Object) null);
            } else {
                int length = this.f45480.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.f45480;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f45480[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM34914 = m34914(i2);
                for (int i3 = 0; i3 < iM34915; i3++) {
                    Object[] objArr3 = this.f45480;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f45480[iM34914] = obj3;
                        iM34914 = m34918(iM34914);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m34913();
                this.f45481 = m34915(iM34914 - this.f45482);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo34920 = mo34920();
        if (i < 0 || i >= iMo34920) {
            throw new IndexOutOfBoundsException(C6934.m19217("index: ", i, iMo34920, ", size: "));
        }
        return this.f45480[m34914(this.f45482 + i)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo34920() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo34920 = mo34920();
        if (i < 0 || i >= iMo34920) {
            throw new IndexOutOfBoundsException(C6934.m19217("index: ", i, iMo34920, ", size: "));
        }
        int iM34914 = m34914(this.f45482 + i);
        Object[] objArr = this.f45480;
        Object obj2 = objArr[iM34914];
        objArr[iM34914] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo34920()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f45481;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C6934.m19217("index: ", i, i2, ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m34913();
        m34916(this.f45481 + 1);
        int iM34914 = m34914(this.f45482 + i);
        int i3 = this.f45481;
        if (i < ((i3 + 1) >> 1)) {
            if (iM34914 == 0) {
                Object[] objArr = this.f45480;
                C15243.m36590(objArr, "<this>");
                iM34914 = objArr.length;
            }
            int i4 = iM34914 - 1;
            int i5 = this.f45482;
            if (i5 == 0) {
                Object[] objArr2 = this.f45480;
                C15243.m36590(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.f45482;
            if (i4 >= i6) {
                Object[] objArr3 = this.f45480;
                objArr3[length] = objArr3[i6];
                C21168.m48276(i6, i6 + 1, i4 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f45480;
                C21168.m48276(i6 - 1, i6, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f45480;
                objArr5[objArr5.length - 1] = objArr5[0];
                C21168.m48276(0, 1, i4 + 1, objArr5, objArr5);
            }
            this.f45480[i4] = obj;
            this.f45482 = length;
        } else {
            int iM34915 = m34914(i3 + this.f45482);
            if (iM34914 < iM34915) {
                Object[] objArr6 = this.f45480;
                C21168.m48276(iM34914 + 1, iM34914, iM34915, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f45480;
                C21168.m48276(1, 0, iM34915, objArr7, objArr7);
                Object[] objArr8 = this.f45480;
                objArr8[0] = objArr8[objArr8.length - 1];
                C21168.m48276(iM34914 + 1, iM34914, objArr8.length - 1, objArr8, objArr8);
            }
            this.f45480[iM34914] = obj;
        }
        this.f45481++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C15243.m36590(collection, "elements");
        int i2 = this.f45481;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C6934.m19217("index: ", i, i2, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f45481) {
            return addAll(collection);
        }
        m34913();
        m34916(collection.size() + this.f45481);
        int iM34914 = m34914(this.f45481 + this.f45482);
        int iM34915 = m34914(this.f45482 + i);
        int size = collection.size();
        if (i >= ((this.f45481 + 1) >> 1)) {
            int i3 = iM34915 + size;
            if (iM34915 < iM34914) {
                int i4 = size + iM34914;
                Object[] objArr = this.f45480;
                if (i4 <= objArr.length) {
                    C21168.m48276(i3, iM34915, iM34914, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    C21168.m48276(i3 - objArr.length, iM34915, iM34914, objArr, objArr);
                } else {
                    int length = iM34914 - (i4 - objArr.length);
                    C21168.m48276(0, length, iM34914, objArr, objArr);
                    Object[] objArr2 = this.f45480;
                    C21168.m48276(i3, iM34915, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f45480;
                C21168.m48276(size, 0, iM34914, objArr3, objArr3);
                Object[] objArr4 = this.f45480;
                if (i3 >= objArr4.length) {
                    C21168.m48276(i3 - objArr4.length, iM34915, objArr4.length, objArr4, objArr4);
                } else {
                    C21168.m48276(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f45480;
                    C21168.m48276(i3, iM34915, objArr5.length - size, objArr5, objArr5);
                }
            }
            m34912(iM34915, collection);
            return true;
        }
        int i5 = this.f45482;
        int length2 = i5 - size;
        if (iM34915 < i5) {
            Object[] objArr6 = this.f45480;
            C21168.m48276(length2, i5, objArr6.length, objArr6, objArr6);
            if (size >= iM34915) {
                Object[] objArr7 = this.f45480;
                C21168.m48276(objArr7.length - size, 0, iM34915, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f45480;
                C21168.m48276(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f45480;
                C21168.m48276(0, size, iM34915, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f45480;
            C21168.m48276(length2, i5, iM34915, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f45480;
            length2 += objArr11.length;
            int i6 = iM34915 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                C21168.m48276(length2, i5, iM34915, objArr11, objArr11);
            } else {
                C21168.m48276(length2, i5, i5 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f45480;
                C21168.m48276(0, this.f45482 + length3, iM34915, objArr12, objArr12);
            }
        }
        this.f45482 = length2;
        m34912(m34915(iM34915 - size), collection);
        return true;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C15946.m38063(i, i2, this.f45481);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f45481) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo34919(i);
            return;
        }
        m34913();
        if (i < this.f45481 - i2) {
            int iM34914 = m34914(this.f45482 + (i - 1));
            int iM34915 = m34914(this.f45482 + (i2 - 1));
            while (i > 0) {
                int i4 = iM34914 + 1;
                int iMin = Math.min(i, Math.min(i4, iM34915 + 1));
                Object[] objArr = this.f45480;
                int i5 = iM34915 - iMin;
                int i6 = iM34914 - iMin;
                C21168.m48276(i5 + 1, i6 + 1, i4, objArr, objArr);
                iM34914 = m34915(i6);
                iM34915 = m34915(i5);
                i -= iMin;
            }
            int iM34916 = m34914(this.f45482 + i3);
            m34917(this.f45482, iM34916);
            this.f45482 = iM34916;
        } else {
            int iM34917 = m34914(this.f45482 + i2);
            int iM34918 = m34914(this.f45482 + i);
            int i7 = this.f45481;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f45480;
                i2 = Math.min(i7, Math.min(objArr2.length - iM34917, objArr2.length - iM34918));
                Object[] objArr3 = this.f45480;
                int i8 = iM34917 + i2;
                C21168.m48276(iM34918, iM34917, i8, objArr3, objArr3);
                iM34917 = m34914(i8);
                iM34918 = m34914(iM34918 + i2);
            }
            int iM34919 = m34914(this.f45481 + this.f45482);
            m34917(m34915(iM34919 - i3), iM34919);
        }
        this.f45481 -= i3;
    }

    @Override // l.AbstractC24152
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo34919(int i) {
        int i2 = this.f45481;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C6934.m19217("index: ", i, i2, ", size: "));
        }
        if (i == C7743.m21085((List) this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m34913();
        int iM34914 = m34914(this.f45482 + i);
        Object[] objArr = this.f45480;
        Object obj = objArr[iM34914];
        if (i < (this.f45481 >> 1)) {
            int i3 = this.f45482;
            if (iM34914 >= i3) {
                C21168.m48276(i3 + 1, i3, iM34914, objArr, objArr);
            } else {
                C21168.m48276(1, 0, iM34914, objArr, objArr);
                Object[] objArr2 = this.f45480;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f45482;
                C21168.m48276(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f45480;
            int i5 = this.f45482;
            objArr3[i5] = null;
            this.f45482 = m34918(i5);
        } else {
            int iM34915 = m34914(C7743.m21085((List) this) + this.f45482);
            if (iM34914 <= iM34915) {
                Object[] objArr4 = this.f45480;
                C21168.m48276(iM34914, iM34914 + 1, iM34915 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f45480;
                C21168.m48276(iM34914, iM34914 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f45480;
                objArr6[objArr6.length - 1] = objArr6[0];
                C21168.m48276(0, 1, iM34915 + 1, objArr6, objArr6);
            }
            this.f45480[iM34915] = null;
        }
        this.f45481--;
        return obj;
    }

    @Override // l.AbstractC24152
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo34920() {
        return this.f45481;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m34916(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f45480;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f45479) {
            if (i < 10) {
                i = 10;
            }
            this.f45480 = new Object[i];
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
        C21168.m48276(0, this.f45482, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f45480;
        int length2 = objArr3.length;
        int i3 = this.f45482;
        C21168.m48276(length2 - i3, 0, i3, objArr3, objArr2);
        this.f45482 = 0;
        this.f45480 = objArr2;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private final int m34914(int i) {
        Object[] objArr = this.f45480;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private final int m34915(int i) {
        return i < 0 ? i + this.f45480.length : i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private final int m34918(int i) {
        Object[] objArr = this.f45480;
        C15243.m36590(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void addFirst(Object obj) {
        m34913();
        m34916(this.f45481 + 1);
        int length = this.f45482;
        if (length == 0) {
            Object[] objArr = this.f45480;
            C15243.m36590(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f45482 = i;
        this.f45480[i] = obj;
        this.f45481++;
    }

    public final void addLast(Object obj) {
        m34913();
        m34916(mo34920() + 1);
        this.f45480[m34914(mo34920() + this.f45482)] = obj;
        this.f45481 = mo34920() + 1;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m34913();
        Object[] objArr = this.f45480;
        int i = this.f45482;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f45482 = m34918(i);
        this.f45481 = mo34920() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m34913();
        int iM34914 = m34914(C7743.m21085((List) this) + this.f45482);
        Object[] objArr = this.f45480;
        Object obj = objArr[iM34914];
        objArr[iM34914] = null;
        this.f45481 = mo34920() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m34912(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f45480.length;
        while (i < length && it.hasNext()) {
            this.f45480[i] = it.next();
            i++;
        }
        int i2 = this.f45482;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f45480[i3] = it.next();
        }
        this.f45481 = collection.size() + this.f45481;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        C15243.m36590(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m34913();
        m34916(collection.size() + mo34920());
        m34912(m34914(mo34920() + this.f45482), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM34914 = m34914(mo34920() + this.f45482);
        int length = this.f45482;
        if (length < iM34914) {
            while (length < iM34914) {
                if (C15243.m36589(obj, this.f45480[length])) {
                    i = this.f45482;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f45482) < iM34914) {
            return -1;
        }
        int length2 = this.f45480.length;
        while (length < length2) {
            if (C15243.m36589(obj, this.f45480[length])) {
                i = this.f45482;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM34914; i2++) {
            if (C15243.m36589(obj, this.f45480[i2])) {
                length = i2 + this.f45480.length;
                i = this.f45482;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM34914 = m34914(this.f45481 + this.f45482);
        int i2 = this.f45482;
        if (i2 < iM34914) {
            length = iM34914 - 1;
            if (i2 <= length) {
                while (!C15243.m36589(obj, this.f45480[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f45482;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f45482 >= iM34914) {
            do {
                iM34914--;
                if (-1 >= iM34914) {
                    Object[] objArr = this.f45480;
                    C15243.m36590(objArr, "<this>");
                    length = objArr.length - 1;
                    int i3 = this.f45482;
                    if (i3 <= length) {
                        while (!C15243.m36589(obj, this.f45480[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f45482;
                    }
                }
                return length - i;
            } while (!C15243.m36589(obj, this.f45480[iM34914]));
            length = iM34914 + this.f45480.length;
            i = this.f45482;
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
        mo34919(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m34913();
            m34917(this.f45482, m34914(mo34920() + this.f45482));
        }
        this.f45482 = 0;
        this.f45481 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        C15243.m36590(objArr, "array");
        int length = objArr.length;
        int i = this.f45481;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            C15243.m36587(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM34914 = m34914(this.f45481 + this.f45482);
        int i2 = this.f45482;
        if (i2 < iM34914) {
            C21168.m48279(i2, iM34914, 2, this.f45480, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f45480;
            C21168.m48276(0, this.f45482, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f45480;
            C21168.m48276(objArr3.length - this.f45482, 0, iM34914, objArr3, objArr);
        }
        int i3 = this.f45481;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m34917(int i, int i2) {
        if (i < i2) {
            Object[] objArr = this.f45480;
            C15243.m36590(objArr, "<this>");
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Object[] objArr2 = this.f45480;
            Arrays.fill(objArr2, i, objArr2.length, (Object) null);
            Object[] objArr3 = this.f45480;
            C15243.m36590(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private final void m34913() {
        ((AbstractList) this).modCount++;
    }
}
