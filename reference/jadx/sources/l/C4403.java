package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZARU */
/* JADX INFO: loaded from: classes2.dex */
public class C4403 implements Set {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f15674;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f15675 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object[][] f15676;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f15677;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f15678;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC21803 f15679;

    /* JADX INFO: renamed from: ۙ */
    public Object mo3127(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ */
    public Object[] mo3128(int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ܰ */
    public Object[][] mo3129(int i) {
        throw null;
    }

    public C4403(AbstractC21803 abstractC21803, int i) {
        this.f15679 = abstractC21803 == null ? C12871.f42814 : abstractC21803;
        this.f15677 = 16;
        this.f15674 = i;
        this.f15676 = mo3129(16);
        this.f15678 = (int) Math.floor(((double) 16) * 0.75d);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object m12269(Object obj) {
        Object[] objArrCopyOf;
        int i = this.f15675;
        int i2 = this.f15678;
        int i3 = this.f15674;
        if (i > i2) {
            Object[][] objArr = this.f15676;
            int length = objArr.length * 2;
            Object[][] objArrMo3129 = mo3129(length);
            int[] iArr = new int[objArrMo3129.length];
            this.f15676 = objArrMo3129;
            this.f15678 = (int) (((double) length) * 0.75d);
            for (Object[] objArr2 : objArr) {
                if (objArr2 != null) {
                    for (Object obj2 : objArr2) {
                        if (obj2 == null) {
                            break;
                        }
                        int iM12271 = m12271(obj2);
                        int i4 = iArr[iM12271];
                        if (i4 == 0) {
                            objArrCopyOf = mo3128(i3);
                            objArrMo3129[iM12271] = objArrCopyOf;
                        } else {
                            objArrCopyOf = objArrMo3129[iM12271];
                            if (i4 == objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length * 2);
                                objArrMo3129[iM12271] = objArrCopyOf;
                            }
                        }
                        objArrCopyOf[i4] = obj2;
                        iArr[iM12271] = iArr[iM12271] + 1;
                    }
                }
            }
        }
        int iM12272 = m12271(obj);
        Object[] objArr3 = this.f15676[iM12272];
        if (objArr3 == null) {
            Object[] objArrMo3128 = mo3128(i3);
            objArrMo3128[0] = obj;
            this.f15676[iM12272] = objArrMo3128;
            this.f15675++;
            return obj;
        }
        for (int i5 = 0; i5 < objArr3.length; i5++) {
            Object obj3 = objArr3[i5];
            if (obj3 == null) {
                objArr3[i5] = obj;
                this.f15675++;
                return obj;
            }
            if (this.f15679.mo14893(obj3, obj)) {
                return obj3;
            }
        }
        int length2 = objArr3.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length * 2);
        this.f15676[iM12272] = objArrCopyOf2;
        objArrCopyOf2[length2] = obj;
        this.f15675++;
        return obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m12272(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f15676[m12271(obj)];
            Object obj2 = null;
            if (objArr != null) {
                for (Object obj3 : objArr) {
                    if (obj3 == null) {
                        break;
                    }
                    if (this.f15679.mo14893(obj3, obj)) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m12271(Object obj) {
        return this.f15679.mo14892(obj) & (this.f15676.length - 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iM13217 = 0;
        for (Object[] objArr : this.f15676) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    iM13217 = C4758.m13217(iM13217, this.f15679.mo14892(obj));
                }
            }
        }
        return C4758.m13213(iM13217, this.f15675);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4403)) {
            return false;
        }
        C4403 c4403 = (C4403) obj;
        if (c4403.f15675 != this.f15675) {
            return false;
        }
        return containsAll(c4403);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return m12269(obj) == obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f15675;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        Object[] objArrMo3128 = mo3128(this.f15675);
        int i = 0;
        for (Object[] objArr : this.f15676) {
            if (objArr != null) {
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        break;
                    }
                    objArrMo3128[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return objArrMo3128;
    }

    public final String toString() {
        if (this.f15675 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Object[] objArr : this.f15676) {
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
        return this.f15675 == 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m12272(mo3127(obj));
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3261(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f15675;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = 0;
        for (Object[] objArr2 : this.f15676) {
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
        return m12270(mo3127(obj));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m12270(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.f15676[m12271(obj)];
            if (objArr != null) {
                for (int i = 0; i < objArr.length && (obj2 = objArr[i]) != null; i++) {
                    if (this.f15679.mo14893(obj2, obj)) {
                        System.arraycopy(objArr, i + 1, objArr, i, (objArr.length - i) - 1);
                        objArr[objArr.length - 1] = null;
                        this.f15675--;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection instanceof C4403) {
            for (Object[] objArr : ((C4403) collection).f15676) {
                if (objArr != null) {
                    for (Object obj : objArr) {
                        if (obj == null) {
                            break;
                        }
                        if (m12272(mo3127(obj))) {
                        }
                    }
                }
            }
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m12272(mo3127(it.next()))) {
            }
        }
        return true;
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (m12269(obj) != obj) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Object obj;
        int i = 0;
        for (Object[] objArr : this.f15676) {
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
        boolean z = i != this.f15675;
        this.f15675 = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zM12270 = false;
        while (it.hasNext()) {
            zM12270 |= m12270(mo3127(it.next()));
        }
        return zM12270;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f15675 = 0;
        int i = this.f15677;
        this.f15676 = mo3129(i);
        this.f15678 = (int) Math.floor(((double) i) * 0.75d);
    }
}
