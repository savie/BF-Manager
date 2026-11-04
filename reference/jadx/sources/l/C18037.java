package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6I2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18037 implements Collection, Set {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59061;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f59062 = C6850.f22761;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object[] f59063 = C6850.f22762;

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        C15243.m36590(collection, "elements");
        int size = collection.size() + this.f59061;
        int i = this.f59061;
        int[] iArr = this.f59062;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f59063;
            C11293.m28555(this, size);
            int i2 = this.f59061;
            if (i2 > 0) {
                C21168.m48277(0, 0, iArr, this.f59062, i2);
                C21168.m48279(0, this.f59061, 6, objArr, this.f59063);
            }
        }
        if (this.f59061 != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        C15243.m36590(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        C15243.m36590(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        C15243.m36590(collection, "elements");
        boolean z = false;
        for (int i = this.f59061 - 1; -1 < i; i--) {
            if (!collection.contains(this.f59063[i])) {
                m42036(i);
                z = true;
            }
        }
        return z;
    }

    public C18037(int i) {
        if (i > 0) {
            C11293.m28555(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f59062;
        int i = this.f59061;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42037(int[] iArr) {
        this.f59062 = iArr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] m42039() {
        return this.f59062;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42038(Object[] objArr) {
        this.f59063 = objArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m42040(int i) {
        return this.f59063[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object[] m42041() {
        return this.f59063;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iHashCode;
        int iM28547;
        int i = this.f59061;
        if (obj == null) {
            iM28547 = C11293.m28547(this, null, 0);
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iM28547 = C11293.m28547(this, obj, iHashCode);
        }
        if (iM28547 >= 0) {
            return false;
        }
        int i2 = ~iM28547;
        int[] iArr = this.f59062;
        if (i >= iArr.length) {
            int i3 = 8;
            if (i >= 8) {
                i3 = (i >> 1) + i;
            } else if (i < 4) {
                i3 = 4;
            }
            Object[] objArr = this.f59063;
            C11293.m28555(this, i3);
            if (i != this.f59061) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f59062;
            if (iArr2.length != 0) {
                C21168.m48277(0, 0, iArr, iArr2, iArr.length);
                C21168.m48279(0, objArr.length, 6, objArr, this.f59063);
            }
        }
        if (i2 < i) {
            int[] iArr3 = this.f59062;
            int i4 = i2 + 1;
            C21168.m48277(i4, i2, iArr3, iArr3, i);
            Object[] objArr2 = this.f59063;
            C21168.m48276(i4, i2, i, objArr2, objArr2);
        }
        int i5 = this.f59061;
        if (i == i5) {
            int[] iArr4 = this.f59062;
            if (i2 < iArr4.length) {
                iArr4[i2] = iHashCode;
                this.f59063[i2] = obj;
                this.f59061 = i5 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f59061 != 0) {
            this.f59062 = C6850.f22761;
            this.f59063 = C6850.f22762;
            this.f59061 = 0;
        }
        if (this.f59061 != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f59061 <= 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42036(int i) {
        int i2 = this.f59061;
        Object[] objArr = this.f59063;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f59062;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                C21168.m48277(i, i4, iArr, iArr, i2);
                Object[] objArr2 = this.f59063;
                C21168.m48276(i, i4, i2, objArr2, objArr2);
            }
            this.f59063[i3] = null;
        } else {
            C11293.m28555(this, i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                C21168.m48277(0, 0, iArr, this.f59062, i);
                C21168.m48279(0, i, 6, objArr, this.f59063);
            }
            if (i < i3) {
                int i5 = i + 1;
                C21168.m48277(i, i5, iArr, this.f59062, i2);
                C21168.m48276(i, i5, i2, objArr, this.f59063);
            }
        }
        if (i2 != this.f59061) {
            throw new ConcurrentModificationException();
        }
        this.f59061 = i3;
        return obj;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m42042() {
        return this.f59061;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f59061;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C21168.m48278(0, this.f59061, this.f59063);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        C15243.m36590(objArr, "array");
        int i = this.f59061;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        C21168.m48276(0, 0, this.f59061, this.f59063, objArr);
        return objArr;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21021(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int iM28547;
        if (obj == null) {
            iM28547 = C11293.m28547(this, null, 0);
        } else {
            iM28547 = C11293.m28547(this, obj, obj.hashCode());
        }
        return iM28547 >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM28547;
        if (obj == null) {
            iM28547 = C11293.m28547(this, null, 0);
        } else {
            iM28547 = C11293.m28547(this, obj, obj.hashCode());
        }
        if (iM28547 < 0) {
            return false;
        }
        m42036(iM28547);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f59061 != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f59061;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f59063[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f59061 * 14);
        sb.append('{');
        int i = this.f59061;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f59063[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        C15243.m36591(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
