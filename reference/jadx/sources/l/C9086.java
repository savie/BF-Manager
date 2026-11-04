package l;

import com.alipay.sdk.m.p.a;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05OF */
/* JADX INFO: loaded from: classes3.dex */
public class C9086 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object[] f29523;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f29524;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f29525;

    public C9086() {
        this(0);
    }

    public C9086(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = C6850.f22761;
        } else {
            iArr = new int[i];
        }
        this.f29525 = iArr;
        if (i == 0) {
            objArr = C6850.f22762;
        } else {
            objArr = new Object[i << 1];
        }
        this.f29523 = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9086(C14307 c14307) {
        this(0);
        if (c14307 != null) {
            int i = c14307.f29524;
            m24224(this.f29524 + i);
            if (this.f29524 != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(c14307.m24220(i2), c14307.m24221(i2));
                }
            } else if (i > 0) {
                C21168.m48277(0, 0, c14307.f29525, this.f29525, i);
                C21168.m48276(0, 0, i << 1, c14307.f29523, this.f29523);
                this.f29524 = i;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final int m24217(int i, Object obj) {
        int i2 = this.f29524;
        if (i2 == 0) {
            return -1;
        }
        int iM19064 = C6850.m19064(i2, i, this.f29525);
        if (iM19064 < 0 || C15243.m36589(obj, this.f29523[iM19064 << 1])) {
            return iM19064;
        }
        int i3 = iM19064 + 1;
        while (i3 < i2 && this.f29525[i3] == i) {
            if (C15243.m36589(obj, this.f29523[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        do {
            iM19064--;
            if (iM19064 < 0 || this.f29525[iM19064] != i) {
                return ~i3;
            }
        } while (!C15243.m36589(obj, this.f29523[iM19064 << 1]));
        return iM19064;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final int m24216() {
        int i = this.f29524;
        if (i == 0) {
            return -1;
        }
        int iM19064 = C6850.m19064(i, 0, this.f29525);
        if (iM19064 < 0 || this.f29523[iM19064 << 1] == null) {
            return iM19064;
        }
        int i2 = iM19064 + 1;
        while (i2 < i && this.f29525[i2] == 0) {
            if (this.f29523[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        do {
            iM19064--;
            if (iM19064 < 0 || this.f29525[iM19064] != 0) {
                return ~i2;
            }
        } while (this.f29523[iM19064 << 1] != null);
        return iM19064;
    }

    public final void clear() {
        if (this.f29524 > 0) {
            this.f29525 = C6850.f22761;
            this.f29523 = C6850.f22762;
            this.f29524 = 0;
        }
        if (this.f29524 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24224(int i) {
        int i2 = this.f29524;
        int[] iArr = this.f29525;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            C15243.m36591(iArrCopyOf, "copyOf(this, newSize)");
            this.f29525 = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f29523, i * 2);
            C15243.m36591(objArrCopyOf, "copyOf(this, newSize)");
            this.f29523 = objArrCopyOf;
        }
        if (this.f29524 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m24223(obj) >= 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m24223(Object obj) {
        if (obj == null) {
            return m24216();
        }
        return m24217(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24218(Object obj) {
        int i = this.f29524 * 2;
        Object[] objArr = this.f29523;
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

    public boolean containsValue(Object obj) {
        return m24218(obj) >= 0;
    }

    public Object get(Object obj) {
        int iM24223 = m24223(obj);
        if (iM24223 >= 0) {
            return this.f29523[(iM24223 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM24223 = m24223(obj);
        return iM24223 >= 0 ? this.f29523[(iM24223 << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m24220(int i) {
        if (i < 0 || i >= this.f29524) {
            throw new IllegalArgumentException(C13645.m33382(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f29523[i << 1];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object m24221(int i) {
        if (i < 0 || i >= this.f29524) {
            throw new IllegalArgumentException(C13645.m33382(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f29523[(i << 1) + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m24219(int i, Object obj) {
        if (i < 0 || i >= this.f29524) {
            throw new IllegalArgumentException(C13645.m33382(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f29523;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f29524 <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f29524;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM24217 = obj != null ? m24217(iHashCode, obj) : m24216();
        if (iM24217 >= 0) {
            int i2 = (iM24217 << 1) + 1;
            Object[] objArr = this.f29523;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM24217;
        int[] iArr = this.f29525;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            C15243.m36591(iArrCopyOf, "copyOf(this, newSize)");
            this.f29525 = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f29523, i4 << 1);
            C15243.m36591(objArrCopyOf, "copyOf(this, newSize)");
            this.f29523 = objArrCopyOf;
            if (i != this.f29524) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f29525;
            int i5 = i3 + 1;
            C21168.m48277(i5, i3, iArr2, iArr2, i);
            Object[] objArr2 = this.f29523;
            C21168.m48276(i5 << 1, i3 << 1, this.f29524 << 1, objArr2, objArr2);
        }
        int i6 = this.f29524;
        if (i == i6) {
            int[] iArr3 = this.f29525;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f29523;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f29524 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM24223 = m24223(obj);
        if (iM24223 >= 0) {
            return m24222(iM24223);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM24223 = m24223(obj);
        if (iM24223 < 0 || !C15243.m36589(obj2, m24221(iM24223))) {
            return false;
        }
        m24222(iM24223);
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object m24222(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f29524)) {
            throw new IllegalArgumentException(C13645.m33382(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f29523;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f29525;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                C21168.m48277(i, i5, iArr, iArr, i2);
                Object[] objArr2 = this.f29523;
                C21168.m48276(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f29523;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            C15243.m36591(iArrCopyOf, "copyOf(this, newSize)");
            this.f29525 = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f29523, i7 << 1);
            C15243.m36591(objArrCopyOf, "copyOf(this, newSize)");
            this.f29523 = objArrCopyOf;
            if (i2 != this.f29524) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                C21168.m48277(0, 0, iArr, this.f29525, i);
                C21168.m48276(0, 0, i3, objArr, this.f29523);
            }
            if (i < i4) {
                int i8 = i + 1;
                C21168.m48277(i, i8, iArr, this.f29525, i2);
                C21168.m48276(i3, i8 << 1, i2 << 1, objArr, this.f29523);
            }
        }
        if (i2 != this.f29524) {
            throw new ConcurrentModificationException();
        }
        this.f29524 = i4;
        return obj;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM24223 = m24223(obj);
        if (iM24223 >= 0) {
            return m24219(iM24223, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM24223 = m24223(obj);
        if (iM24223 < 0 || !C15243.m36589(obj2, m24221(iM24223))) {
            return false;
        }
        m24219(iM24223, obj3);
        return true;
    }

    public final int size() {
        return this.f29524;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C9086) {
                int i = this.f29524;
                if (i != ((C9086) obj).f29524) {
                    return false;
                }
                C9086 c9086 = (C9086) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM24220 = m24220(i2);
                    Object objM24221 = m24221(i2);
                    Object obj2 = c9086.get(objM24220);
                    if (objM24221 != null) {
                        if (!objM24221.equals(obj2)) {
                            return false;
                        }
                    } else if (obj2 != null || !c9086.containsKey(objM24220)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f29524 != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f29524;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM24222 = m24220(i4);
                Object objM24223 = m24221(i4);
                Object obj3 = ((Map) obj).get(objM24222);
                if (objM24223 != null) {
                    if (!objM24223.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null || !((Map) obj).containsKey(objM24222)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f29525;
        Object[] objArr = this.f29523;
        int i = this.f29524;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f29524 * 28);
        sb.append('{');
        int i = this.f29524;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM24220 = m24220(i2);
            if (objM24220 != sb) {
                sb.append(objM24220);
            } else {
                sb.append("(this Map)");
            }
            sb.append(a.h);
            Object objM24221 = m24221(i2);
            if (objM24221 != sb) {
                sb.append(objM24221);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        C15243.m36591(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
