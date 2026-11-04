package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.simpleframework.xml.core.Entry;

/* JADX INFO: renamed from: l.ܰᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14782 implements Map, Serializable {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final C14782 f48364;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f48365;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f48366;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f48367;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Object[] f48368;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object[] f48369;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f48370;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f48371;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f48372;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C0613 f48373;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21496 f48374;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f48375;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18512 f48376;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f48377;

    @Override // java.util.Map
    public final void putAll(Map map) {
        C15243.m36590(map, "from");
        m35607();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m35598(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM35602 = m35602(entry.getKey());
            Object[] objArr = this.f48368;
            if (objArr == null) {
                int length = this.f48369.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f48368 = objArr;
            }
            if (iM35602 >= 0) {
                objArr[iM35602] = entry.getValue();
            } else {
                int i = (-iM35602) - 1;
                if (!C15243.m36589(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35604(Collection collection) {
        C15243.m36590(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m35605((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35605(Map.Entry entry) {
        C15243.m36590(entry, Entry.DEFAULT_NAME);
        int iM35600 = m35600(entry.getKey());
        if (iM35600 < 0) {
            return false;
        }
        Object[] objArr = this.f48368;
        C15243.m36586(objArr);
        return C15243.m36589(objArr[iM35600], entry.getValue());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35609(Map.Entry entry) {
        C15243.m36590(entry, Entry.DEFAULT_NAME);
        m35607();
        int iM35600 = m35600(entry.getKey());
        if (iM35600 < 0) {
            return false;
        }
        Object[] objArr = this.f48368;
        C15243.m36586(objArr);
        if (!C15243.m36589(objArr[iM35600], entry.getValue())) {
            return false;
        }
        m35596(iM35600);
        return true;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f48370 == 0;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f48370;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14782 m35603() {
        m35607();
        this.f48365 = true;
        if (this.f48370 > 0) {
            return this;
        }
        C14782 c14782 = f48364;
        C15243.m36587((Object) c14782, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c14782;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f48365) {
            return new C8071(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m35600(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m35595(obj) >= 0;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM35600 = m35600(obj);
        if (iM35600 < 0) {
            return null;
        }
        Object[] objArr = this.f48368;
        C15243.m36586(objArr);
        return objArr[iM35600];
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m35607();
        int iM35602 = m35602(obj);
        Object[] objArr = this.f48368;
        if (objArr == null) {
            int length = this.f48369.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f48368 = objArr;
        }
        if (iM35602 < 0) {
            int i = (-iM35602) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[iM35602] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m35607();
        int iM35600 = m35600(obj);
        if (iM35600 < 0) {
            return null;
        }
        Object[] objArr = this.f48368;
        C15243.m36586(objArr);
        Object obj2 = objArr[iM35600];
        m35596(iM35600);
        return obj2;
    }

    @Override // java.util.Map
    public final void clear() {
        m35607();
        int i = this.f48372 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f48367;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f48377[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        C23734.m53000(0, this.f48372, this.f48369);
        Object[] objArr = this.f48368;
        if (objArr != null) {
            C23734.m53000(0, this.f48372, objArr);
        }
        this.f48370 = 0;
        this.f48372 = 0;
        this.f48371++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C18512 c18512 = this.f48376;
        if (c18512 != null) {
            return c18512;
        }
        C18512 c18513 = new C18512(this);
        this.f48376 = c18513;
        return c18513;
    }

    @Override // java.util.Map
    public final Collection values() {
        C0613 c0613 = this.f48373;
        if (c0613 != null) {
            return c0613;
        }
        C0613 c0614 = new C0613(this);
        this.f48373 = c0614;
        return c0614;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C21496 c21496 = this.f48374;
        if (c21496 != null) {
            return c21496;
        }
        C21496 c21497 = new C21496(this);
        this.f48374 = c21497;
        return c21497;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f48370 == map.size() && m35604((Collection) map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f48370 * 3) + 2);
        sb.append("{");
        C20750 c20750 = new C20750(this);
        int i = 0;
        while (c20750.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            if (c20750.m18503() >= c20750.m18505().f48372) {
                throw new NoSuchElementException();
            }
            int iM18503 = c20750.m18503();
            c20750.m18504(iM18503 + 1);
            c20750.m18501(iM18503);
            Object obj = c20750.m18505().f48369[c20750.m18500()];
            if (obj == c20750.m18505()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(a.h);
            Object[] objArr = c20750.m18505().f48368;
            C15243.m36586(objArr);
            Object obj2 = objArr[c20750.m18500()];
            if (obj2 == c20750.m18505()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c20750.m18502();
            i++;
        }
        sb.append(l.d);
        String string = sb.toString();
        C15243.m36591(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m35598(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f48369;
        int length = objArr.length;
        int i2 = this.f48372;
        int i3 = length - i2;
        int i4 = i2 - this.f48370;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m35589(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 >= 0) {
            if (i5 > objArr.length) {
                int length2 = objArr.length;
                int i6 = length2 + (length2 >> 1);
                if (i6 - i5 < 0) {
                    i6 = i5;
                }
                if (i6 - 2147483639 > 0) {
                    i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i6);
                C15243.m36591(objArrCopyOf2, "copyOf(...)");
                this.f48369 = objArrCopyOf2;
                Object[] objArr2 = this.f48368;
                if (objArr2 != null) {
                    objArrCopyOf = Arrays.copyOf(objArr2, i6);
                    C15243.m36591(objArrCopyOf, "copyOf(...)");
                } else {
                    objArrCopyOf = null;
                }
                this.f48368 = objArrCopyOf;
                int[] iArrCopyOf = Arrays.copyOf(this.f48367, i6);
                C15243.m36591(iArrCopyOf, "copyOf(...)");
                this.f48367 = iArrCopyOf;
                int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
                if (iHighestOneBit > this.f48377.length) {
                    m35592(iHighestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private final void m35592(int i) {
        int[] iArr;
        this.f48371++;
        int i2 = 0;
        if (this.f48372 > this.f48370) {
            m35589(false);
        }
        this.f48377 = new int[i];
        this.f48375 = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f48372) {
            int i3 = i2 + 1;
            int iM35593 = m35593(this.f48369[i2]);
            int i4 = this.f48366;
            while (true) {
                iArr = this.f48377;
                if (iArr[iM35593] == 0) {
                    break;
                }
                i4--;
                if (i4 >= 0) {
                    iM35593 = iM35593 == 0 ? iArr.length - 1 : iM35593 - 1;
                } else {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
            }
            iArr[iM35593] = i3;
            this.f48367[i2] = iM35593;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35607() {
        if (this.f48365) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object[] m35590(C14782 c14782) {
        Object[] objArr = c14782.f48368;
        if (objArr != null) {
            return objArr;
        }
        int length = c14782.f48369.length;
        if (length < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr2 = new Object[length];
        c14782.f48368 = objArr2;
        return objArr2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private final int m35593(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f48375;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m35589(boolean z) {
        int i;
        Object[] objArr = this.f48368;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f48372;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f48367;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f48369;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f48377[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        C23734.m53000(i3, i, this.f48369);
        if (objArr != null) {
            C23734.m53000(i3, this.f48372, objArr);
        }
        this.f48372 = i3;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private final int m35600(Object obj) {
        int iM35593 = m35593(obj);
        int i = this.f48366;
        while (true) {
            int i2 = this.f48377[iM35593];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (C15243.m36589(this.f48369[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM35593 = iM35593 == 0 ? this.f48377.length - 1 : iM35593 - 1;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private final int m35595(Object obj) {
        int i = this.f48372;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f48367[i] >= 0) {
                Object[] objArr = this.f48368;
                C15243.m36586(objArr);
                if (C15243.m36589(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35602(Object obj) {
        m35607();
        while (true) {
            int iM35593 = m35593(obj);
            int i = this.f48366 * 2;
            int length = this.f48377.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f48377;
                int i3 = iArr[iM35593];
                if (i3 == 0) {
                    int i4 = this.f48372;
                    Object[] objArr = this.f48369;
                    if (i4 >= objArr.length) {
                        m35598(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f48372 = i5;
                    objArr[i4] = obj;
                    this.f48367[i4] = iM35593;
                    iArr[iM35593] = i5;
                    this.f48370++;
                    this.f48371++;
                    if (i2 > this.f48366) {
                        this.f48366 = i2;
                    }
                    return i4;
                }
                if (C15243.m36589(this.f48369[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 <= i) {
                    iM35593 = iM35593 == 0 ? this.f48377.length - 1 : iM35593 - 1;
                } else {
                    m35592(this.f48377.length * 2);
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35608(Object obj) {
        m35607();
        int iM35600 = m35600(obj);
        if (iM35600 < 0) {
            return false;
        }
        m35596(iM35600);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m35596(int i) {
        int i2;
        int i3;
        int iM35593;
        int[] iArr;
        Object[] objArr = this.f48369;
        C15243.m36590(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.f48368;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.f48367[i];
        loop0: while (true) {
            int i5 = 0;
            int length = i4;
            do {
                length = length == 0 ? this.f48377.length - 1 : length - 1;
                int[] iArr2 = this.f48377;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f48366) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM35593 = m35593(this.f48369[i3]) - length;
                    iArr = this.f48377;
                }
            } while ((iM35593 & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f48367[i3] = i4;
            i4 = length;
        }
        this.f48367[i] = -1;
        this.f48370--;
        this.f48371++;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m35606(Object obj) {
        m35607();
        int iM35595 = m35595(obj);
        if (iM35595 < 0) {
            return false;
        }
        m35596(iM35595);
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C20750 c20750 = new C20750(this);
        int i = 0;
        while (c20750.hasNext()) {
            if (c20750.m18503() >= c20750.m18505().f48372) {
                throw new NoSuchElementException();
            }
            int iM18503 = c20750.m18503();
            c20750.m18504(iM18503 + 1);
            c20750.m18501(iM18503);
            Object obj = c20750.m18505().f48369[c20750.m18500()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c20750.m18505().f48368;
            C15243.m36586(objArr);
            Object obj2 = objArr[c20750.m18500()];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c20750.m18502();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    static {
        C14782 c14782 = new C14782(0);
        c14782.f48365 = true;
        f48364 = c14782;
    }

    public C14782(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f48369 = objArr;
        this.f48368 = null;
        this.f48367 = iArr;
        this.f48377 = new int[iHighestOneBit];
        this.f48366 = 2;
        this.f48372 = 0;
        this.f48375 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
