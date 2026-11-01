package l;

import com.alipay.sdk.m.p.a;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: l.۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 05OF */
/* JADX INFO: loaded from: classes3.dex */
public class C12274 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static int f41040;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int f41041;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Object[] f41042;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Object[] f41043;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f41044;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object[] f41045;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f41046;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30507(int i, Object obj) {
        int i2 = this.f41044;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM44320 = C19329.m44320(i2, i, this.f41046);
            if (iM44320 < 0 || obj.equals(this.f41045[iM44320 << 1])) {
                return iM44320;
            }
            int i3 = iM44320 + 1;
            while (i3 < i2 && this.f41046[i3] == i) {
                if (obj.equals(this.f41045[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            do {
                iM44320--;
                if (iM44320 < 0 || this.f41046[iM44320] != i) {
                    return ~i3;
                }
            } while (!obj.equals(this.f41045[iM44320 << 1]));
            return iM44320;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30506() {
        int i = this.f41044;
        if (i == 0) {
            return -1;
        }
        try {
            int iM44320 = C19329.m44320(i, 0, this.f41046);
            if (iM44320 < 0 || this.f41045[iM44320 << 1] == null) {
                return iM44320;
            }
            int i2 = iM44320 + 1;
            while (i2 < i && this.f41046[i2] == 0) {
                if (this.f41045[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            do {
                iM44320--;
                if (iM44320 < 0 || this.f41046[iM44320] != 0) {
                    return ~i2;
                }
            } while (this.f41045[iM44320 << 1] != null);
            return iM44320;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m30505(int i) {
        if (i == 8) {
            synchronized (C12274.class) {
                Object[] objArr = f41043;
                if (objArr != null) {
                    this.f41045 = objArr;
                    f41043 = (Object[]) objArr[0];
                    this.f41046 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f41040--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C12274.class) {
                Object[] objArr2 = f41042;
                if (objArr2 != null) {
                    this.f41045 = objArr2;
                    f41042 = (Object[]) objArr2[0];
                    this.f41046 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f41041--;
                    return;
                }
            }
        }
        this.f41046 = new int[i];
        this.f41045 = new Object[i << 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30504(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C12274.class) {
                if (f41040 < 10) {
                    objArr[0] = f41043;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f41043 = objArr;
                    f41040++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C12274.class) {
                if (f41041 < 10) {
                    objArr[0] = f41042;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f41042 = objArr;
                    f41041++;
                }
            }
        }
    }

    public C12274() {
        this.f41046 = C19329.f62345;
        this.f41045 = C19329.f62346;
        this.f41044 = 0;
    }

    public C12274(int i) {
        if (i == 0) {
            this.f41046 = C19329.f62345;
            this.f41045 = C19329.f62346;
        } else {
            m30505(i);
        }
        this.f41044 = 0;
    }

    public final void clear() {
        int i = this.f41044;
        if (i > 0) {
            int[] iArr = this.f41046;
            Object[] objArr = this.f41045;
            this.f41046 = C19329.f62345;
            this.f41045 = C19329.f62346;
            this.f41044 = 0;
            m30504(iArr, objArr, i);
        }
        if (this.f41044 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30512(int i) {
        int i2 = this.f41044;
        int[] iArr = this.f41046;
        if (iArr.length < i) {
            Object[] objArr = this.f41045;
            m30505(i);
            if (this.f41044 > 0) {
                System.arraycopy(iArr, 0, this.f41046, 0, i2);
                System.arraycopy(objArr, 0, this.f41045, 0, i2 << 1);
            }
            m30504(iArr, objArr, i2);
        }
        if (this.f41044 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m30508(obj) >= 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30508(Object obj) {
        return obj == null ? m30506() : m30507(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m30511(Object obj) {
        int i = this.f41044 * 2;
        Object[] objArr = this.f41045;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final boolean containsValue(Object obj) {
        return m30511(obj) >= 0;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM30508 = m30508(obj);
        return iM30508 >= 0 ? this.f41045[(iM30508 << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m30510(int i) {
        return this.f41045[i << 1];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object m30513(int i) {
        return this.f41045[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f41044 <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int iHashCode;
        int iM30507;
        int i = this.f41044;
        if (obj == null) {
            iM30507 = m30506();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iM30507 = m30507(iHashCode, obj);
        }
        if (iM30507 >= 0) {
            int i2 = (iM30507 << 1) + 1;
            Object[] objArr = this.f41045;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM30507;
        int[] iArr = this.f41046;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            Object[] objArr2 = this.f41045;
            m30505(i4);
            if (i != this.f41044) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f41046;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f41045, 0, objArr2.length);
            }
            m30504(iArr, objArr2, i);
        }
        if (i3 < i) {
            int[] iArr3 = this.f41046;
            int i5 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i5, i - i3);
            Object[] objArr3 = this.f41045;
            System.arraycopy(objArr3, i3 << 1, objArr3, i5 << 1, (this.f41044 - i3) << 1);
        }
        int i6 = this.f41044;
        if (i == i6) {
            int[] iArr4 = this.f41046;
            if (i3 < iArr4.length) {
                iArr4[i3] = iHashCode;
                Object[] objArr4 = this.f41045;
                int i7 = i3 << 1;
                objArr4[i7] = obj;
                objArr4[i7 + 1] = obj2;
                this.f41044 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object remove(Object obj) {
        int iM30508 = m30508(obj);
        if (iM30508 >= 0) {
            return m30509(iM30508);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM30508 = m30508(obj);
        if (iM30508 < 0) {
            return false;
        }
        Object objM30513 = m30513(iM30508);
        if (obj2 != objM30513 && (obj2 == null || !obj2.equals(objM30513))) {
            return false;
        }
        m30509(iM30508);
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object m30509(int i) {
        Object[] objArr = this.f41045;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f41044;
        int i4 = 0;
        if (i3 <= 1) {
            m30504(this.f41046, objArr, i3);
            this.f41046 = C19329.f62345;
            this.f41045 = C19329.f62346;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f41046;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                m30505(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f41044) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f41046, 0, i);
                    System.arraycopy(objArr, 0, this.f41045, 0, i2);
                }
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, this.f41046, i, i7);
                    System.arraycopy(objArr, i6 << 1, this.f41045, i2, i7 << 1);
                }
            } else {
                if (i < i5) {
                    int i8 = i + 1;
                    int i9 = i5 - i;
                    System.arraycopy(iArr, i8, iArr, i, i9);
                    Object[] objArr2 = this.f41045;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i2, i9 << 1);
                }
                Object[] objArr3 = this.f41045;
                int i10 = i5 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 != this.f41044) {
            throw new ConcurrentModificationException();
        }
        this.f41044 = i4;
        return obj;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM30508 = m30508(obj);
        if (iM30508 < 0) {
            return null;
        }
        int i = (iM30508 << 1) + 1;
        Object[] objArr = this.f41045;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM30508 = m30508(obj);
        if (iM30508 < 0) {
            return false;
        }
        Object objM30513 = m30513(iM30508);
        if (objM30513 != obj2 && (obj2 == null || !obj2.equals(objM30513))) {
            return false;
        }
        int i = (iM30508 << 1) + 1;
        Object[] objArr = this.f41045;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }

    public final int size() {
        return this.f41044;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12274) {
            C12274 c12274 = (C12274) obj;
            if (this.f41044 != c12274.f41044) {
                return false;
            }
            for (int i = 0; i < this.f41044; i++) {
                try {
                    Object objM30510 = m30510(i);
                    Object objM30513 = m30513(i);
                    Object orDefault = c12274.getOrDefault(objM30510, null);
                    if (objM30513 == null) {
                        if (orDefault != null || !c12274.containsKey(objM30510)) {
                            return false;
                        }
                    } else if (!objM30513.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f41044 != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f41044; i2++) {
                try {
                    Object objM30511 = m30510(i2);
                    Object objM30514 = m30513(i2);
                    Object obj2 = map.get(objM30511);
                    if (objM30514 == null) {
                        if (obj2 != null || !map.containsKey(objM30511)) {
                            return false;
                        }
                    } else if (!objM30514.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f41046;
        Object[] objArr = this.f41045;
        int i = this.f41044;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f41044 * 28);
        sb.append('{');
        for (int i = 0; i < this.f41044; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM30510 = m30510(i);
            if (objM30510 != this) {
                sb.append(objM30510);
            } else {
                sb.append("(this Map)");
            }
            sb.append(a.h);
            Object objM30513 = m30513(i);
            if (objM30513 != this) {
                sb.append(objM30513);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
