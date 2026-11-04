package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZARU */
/* JADX INFO: loaded from: classes2.dex */
public class C3721 implements Set {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f12788;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f12789 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object[][] f12790;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f12791;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f12792;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC4279 f12793;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object mo12105(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] mo12106(int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object[][] mo12110(int i) {
        throw null;
    }

    public C3721(AbstractC4279 abstractC4279, int i) {
        this.f12793 = abstractC4279 == null ? C21621.f69046 : abstractC4279;
        this.f12788 = 16;
        this.f12791 = i;
        this.f12790 = mo12110(16);
        this.f12792 = (int) Math.floor(((double) 16) * 0.75d);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object m12111(Object obj) {
        Object[] objArrCopyOf;
        int i = this.f12789;
        int i2 = this.f12792;
        int i3 = this.f12791;
        if (i > i2) {
            Object[][] objArr = this.f12790;
            int length = objArr.length * 2;
            Object[][] objArrMo12110 = mo12110(length);
            int[] iArr = new int[objArrMo12110.length];
            this.f12790 = objArrMo12110;
            this.f12792 = (int) (((double) length) * 0.75d);
            for (Object[] objArr2 : objArr) {
                if (objArr2 != null) {
                    for (Object obj2 : objArr2) {
                        if (obj2 == null) {
                            break;
                        }
                        int iM12107 = m12107(obj2);
                        int i4 = iArr[iM12107];
                        if (i4 == 0) {
                            objArrCopyOf = mo12106(i3);
                            objArrMo12110[iM12107] = objArrCopyOf;
                        } else {
                            objArrCopyOf = objArrMo12110[iM12107];
                            if (i4 == objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length * 2);
                                objArrMo12110[iM12107] = objArrCopyOf;
                            }
                        }
                        objArrCopyOf[i4] = obj2;
                        iArr[iM12107] = iArr[iM12107] + 1;
                    }
                }
            }
        }
        int iM12108 = m12107(obj);
        Object[] objArr3 = this.f12790[iM12108];
        if (objArr3 == null) {
            Object[] objArrMo12106 = mo12106(i3);
            objArrMo12106[0] = obj;
            this.f12790[iM12108] = objArrMo12106;
            this.f12789++;
            return obj;
        }
        for (int i5 = 0; i5 < objArr3.length; i5++) {
            Object obj3 = objArr3[i5];
            if (obj3 == null) {
                objArr3[i5] = obj;
                this.f12789++;
                return obj;
            }
            if (this.f12793.mo13640(obj3, obj)) {
                return obj3;
            }
        }
        int length2 = objArr3.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length * 2);
        this.f12790[iM12108] = objArrCopyOf2;
        objArrCopyOf2[length2] = obj;
        this.f12789++;
        return obj;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m12109(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f12790[m12107(obj)];
            Object obj2 = null;
            if (objArr != null) {
                for (Object obj3 : objArr) {
                    if (obj3 == null) {
                        break;
                    }
                    if (this.f12793.mo13640(obj3, obj)) {
                        obj2 = obj3;
                        break;
                    }
                }
            }
            if (obj2 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m12107(Object obj) {
        return this.f12793.mo13639(obj) & (this.f12790.length - 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iM19447 = 0;
        for (Object[] objArr : this.f12790) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    iM19447 = C7103.m19447(iM19447, this.f12793.mo13639(obj));
                }
            }
        }
        return C7103.m19444(iM19447, this.f12789);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3721)) {
            return false;
        }
        C3721 c3721 = (C3721) obj;
        if (c3721.f12789 != this.f12789) {
            return false;
        }
        return containsAll(c3721);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return m12111(obj) == obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12789;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        Object[] objArrMo12106 = mo12106(this.f12789);
        int i = 0;
        for (Object[] objArr : this.f12790) {
            if (objArr != null) {
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        break;
                    }
                    objArrMo12106[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return objArrMo12106;
    }

    public final String toString() {
        if (this.f12789 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Object[] objArr : this.f12790) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(obj.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12789 == 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m12109(mo12105(obj));
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C23859(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f12789;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = 0;
        for (Object[] objArr2 : this.f12790) {
            if (objArr2 != null) {
                int length2 = objArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    Object obj = objArr2[i3];
                    if (obj == null) {
                        break;
                    }
                    objArr[i2] = obj;
                    i3++;
                    i2++;
                }
            }
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return m12108(mo12105(obj));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m12108(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.f12790[m12107(obj)];
            if (objArr != null) {
                for (int i = 0; i < objArr.length && (obj2 = objArr[i]) != null; i++) {
                    if (this.f12793.mo13640(obj2, obj)) {
                        System.arraycopy(objArr, i + 1, objArr, i, (objArr.length - i) - 1);
                        objArr[objArr.length - 1] = null;
                        this.f12789--;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection instanceof C3721) {
            for (Object[] objArr : ((C3721) collection).f12790) {
                if (objArr != null) {
                    for (Object obj : objArr) {
                        if (obj == null) {
                            break;
                        }
                        if (m12109(mo12105(obj))) {
                        }
                    }
                }
            }
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m12109(mo12105(it.next()))) {
            }
        }
        return true;
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (m12111(obj) != obj) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Object obj;
        int i = 0;
        for (Object[] objArr : this.f12790) {
            if (objArr != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < objArr.length && (obj = objArr[i2]) != null) {
                    if (collection.contains(obj)) {
                        if (i2 != i3) {
                            objArr[i3] = objArr[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    objArr[i3] = null;
                    i3++;
                }
            }
        }
        boolean z = i != this.f12789;
        this.f12789 = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zM12108 = false;
        while (it.hasNext()) {
            zM12108 |= m12108(mo12105(it.next()));
        }
        return zM12108;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12789 = 0;
        int i = this.f12788;
        this.f12790 = mo12110(i);
        this.f12792 = (int) Math.floor(((double) i) * 0.75d);
    }
}
