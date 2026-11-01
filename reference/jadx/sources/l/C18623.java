package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A5X5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18623 implements Collection, Set {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static Object[] f60383;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int f60384;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f60386;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Object[] f60388;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int[] f60389;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object[] f60390;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f60391;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17917 f60392;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int[] f60385 = new int[0];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object[] f60387 = new Object[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m43068(int i, Object obj) {
        int i2 = this.f60391;
        if (i2 == 0) {
            return -1;
        }
        int iM44320 = C19329.m44320(i2, i, this.f60389);
        if (iM44320 < 0 || obj.equals(this.f60390[iM44320])) {
            return iM44320;
        }
        int i3 = iM44320 + 1;
        while (i3 < i2 && this.f60389[i3] == i) {
            if (obj.equals(this.f60390[i3])) {
                return i3;
            }
            i3++;
        }
        do {
            iM44320--;
            if (iM44320 < 0 || this.f60389[iM44320] != i) {
                return ~i3;
            }
        } while (!obj.equals(this.f60390[iM44320]));
        return iM44320;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m43070() {
        int i = this.f60391;
        if (i == 0) {
            return -1;
        }
        int iM44320 = C19329.m44320(i, 0, this.f60389);
        if (iM44320 < 0 || this.f60390[iM44320] == null) {
            return iM44320;
        }
        int i2 = iM44320 + 1;
        while (i2 < i && this.f60389[i2] == 0) {
            if (this.f60390[i2] == null) {
                return i2;
            }
            i2++;
        }
        do {
            iM44320--;
            if (iM44320 < 0 || this.f60389[iM44320] != 0) {
                return ~i2;
            }
        } while (this.f60390[iM44320] != null);
        return iM44320;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m43071(int i) {
        if (i == 8) {
            synchronized (C18623.class) {
                Object[] objArr = f60388;
                if (objArr != null) {
                    this.f60390 = objArr;
                    f60388 = (Object[]) objArr[0];
                    this.f60389 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f60386--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C18623.class) {
                Object[] objArr2 = f60383;
                if (objArr2 != null) {
                    this.f60390 = objArr2;
                    f60383 = (Object[]) objArr2[0];
                    this.f60389 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f60384--;
                    return;
                }
            }
        }
        this.f60389 = new int[i];
        this.f60390 = new Object[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43069(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C18623.class) {
                if (f60386 < 10) {
                    objArr[0] = f60388;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f60388 = objArr;
                    f60386++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C18623.class) {
                if (f60384 < 10) {
                    objArr[0] = f60383;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f60383 = objArr;
                    f60384++;
                }
            }
        }
    }

    public C18623() {
        this(0);
    }

    public C18623(int i) {
        if (i == 0) {
            this.f60389 = f60385;
            this.f60390 = f60387;
        } else {
            m43071(i);
        }
        this.f60391 = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f60391;
        if (i != 0) {
            m43069(this.f60389, this.f60390, i);
            this.f60389 = f60385;
            this.f60390 = f60387;
            this.f60391 = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final int indexOf(Object obj) {
        return obj == null ? m43070() : m43068(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f60391 <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iHashCode;
        int iM43068;
        if (obj == null) {
            iM43068 = m43070();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iM43068 = m43068(iHashCode, obj);
        }
        if (iM43068 >= 0) {
            return false;
        }
        int i = ~iM43068;
        int i2 = this.f60391;
        int[] iArr = this.f60389;
        if (i2 >= iArr.length) {
            int i3 = 8;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i3 = 4;
            }
            Object[] objArr = this.f60390;
            m43071(i3);
            int[] iArr2 = this.f60389;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f60390, 0, objArr.length);
            }
            m43069(iArr, objArr, this.f60391);
        }
        int i4 = this.f60391;
        if (i < i4) {
            int[] iArr3 = this.f60389;
            int i5 = i + 1;
            System.arraycopy(iArr3, i, iArr3, i5, i4 - i);
            Object[] objArr2 = this.f60390;
            System.arraycopy(objArr2, i, objArr2, i5, this.f60391 - i);
        }
        this.f60389[i] = iHashCode;
        this.f60390[i] = obj;
        this.f60391++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m43072(iIndexOf);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43072(int i) {
        Object[] objArr = this.f60390;
        Object obj = objArr[i];
        int i2 = this.f60391;
        if (i2 <= 1) {
            m43069(this.f60389, objArr, i2);
            this.f60389 = f60385;
            this.f60390 = f60387;
            this.f60391 = 0;
            return;
        }
        int[] iArr = this.f60389;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            m43071(i2 > 8 ? i2 + (i2 >> 1) : 8);
            this.f60391--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f60389, 0, i);
                System.arraycopy(objArr, 0, this.f60390, 0, i);
            }
            int i3 = this.f60391;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, this.f60389, i, i3 - i);
                System.arraycopy(objArr, i4, this.f60390, i, this.f60391 - i);
                return;
            }
            return;
        }
        int i5 = i2 - 1;
        this.f60391 = i5;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, iArr, i, i5 - i);
            Object[] objArr2 = this.f60390;
            System.arraycopy(objArr2, i6, objArr2, i, this.f60391 - i);
        }
        this.f60390[this.f60391] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f60391;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f60391;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f60390, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f60391) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f60391);
        }
        System.arraycopy(this.f60390, 0, objArr, 0, this.f60391);
        int length = objArr.length;
        int i = this.f60391;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f60391 != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f60391; i++) {
                try {
                    if (!set.contains(this.f60390[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f60389;
        int i = this.f60391;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f60391 * 14);
        sb.append('{');
        for (int i = 0; i < this.f60391; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f60390[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f60392 == null) {
            this.f60392 = new C17917(this);
        }
        C17917 c17917 = this.f60392;
        if (c17917.f53026 == null) {
            c17917.f53026 = new C15802(c17917);
        }
        return c17917.f53026.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f60391;
        int[] iArr = this.f60389;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f60390;
            m43071(size);
            int i = this.f60391;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f60389, 0, i);
                System.arraycopy(objArr, 0, this.f60390, 0, this.f60391);
            }
            m43069(iArr, objArr, this.f60391);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f60391 - 1; i >= 0; i--) {
            if (!collection.contains(this.f60390[i])) {
                m43072(i);
                z = true;
            }
        }
        return z;
    }
}
