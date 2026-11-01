package l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.ۨ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11705 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Object f39343 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Set f39344;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient Object f39345;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient Object[] f39346;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f39347;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient int[] f39348;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient Object[] f39349;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f39350;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Set f39351;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public transient Collection f39352;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29241(C11705 c11705) {
        c11705.f39350--;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C11705 m29221() {
        C11705 c11705 = new C11705();
        c11705.m29244(3);
        return c11705;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C11705 m29231(int i) {
        C11705 c11705 = new C11705();
        c11705.m29244(i);
        return c11705;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29244(int i) {
        C18304.m42516("Expected size must be >= 0", i >= 0);
        this.f39347 = Math.min(Math.max(i, 1), Mod.M30);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m29245() {
        return this.f39345 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m29242() {
        Object obj = this.f39345;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int m29223() {
        return (1 << (this.f39347 & 31)) - 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29247() {
        this.f39347 += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        int i = 1;
        if (m29245()) {
            C18304.m42522("Arrays already allocated", m29245());
            int i2 = this.f39347;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (((double) iHighestOneBit) * 1.0d)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f39345 = C2531.m7910(iMax2);
            this.f39347 = C2531.m7907(this.f39347, 32 - Integer.numberOfLeadingZeros(iMax2 - 1), 31);
            this.f39348 = new int[i2];
            this.f39349 = new Object[i2];
            this.f39346 = new Object[i2];
        }
        Map mapM29242 = m29242();
        if (mapM29242 != null) {
            return mapM29242.put(obj, obj2);
        }
        int[] iArrM29233 = m29233();
        Object[] objArrM29239 = m29239();
        Object[] objArrM29240 = m29240();
        int i3 = this.f39350;
        int i4 = i3 + 1;
        int iM30863 = C12411.m30863(obj);
        int iM29223 = m29223();
        int i5 = iM30863 & iM29223;
        Object obj3 = this.f39345;
        C13638.requireNonNull(obj3);
        int iM7908 = C2531.m7908(i5, obj3);
        if (iM7908 != 0) {
            int i6 = ~iM29223;
            int i7 = iM30863 & i6;
            int i8 = 0;
            while (true) {
                int i9 = iM7908 - i;
                int i10 = iArrM29233[i9];
                if ((i10 & i6) == i7 && C13638.equals(obj, objArrM29239[i9])) {
                    Object obj4 = objArrM29240[i9];
                    objArrM29240[i9] = obj2;
                    return obj4;
                }
                int i11 = i10 & iM29223;
                i8++;
                if (i11 == 0) {
                    if (i8 < 9) {
                        if (i4 > iM29223) {
                            iM29223 = m29224(iM29223, (iM29223 + 1) * (iM29223 < 32 ? 4 : 2), iM30863, i3);
                            break;
                        }
                        iArrM29233[i9] = C2531.m7907(i10, i4, iM29223);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m29223() + 1, 1.0f);
                    int iM29246 = isEmpty() ? -1 : 0;
                    while (iM29246 >= 0) {
                        linkedHashMap.put(m29239()[iM29246], m29240()[iM29246]);
                        iM29246 = m29246(iM29246);
                    }
                    this.f39345 = linkedHashMap;
                    this.f39348 = null;
                    this.f39349 = null;
                    this.f39346 = null;
                    m29247();
                    return linkedHashMap.put(obj, obj2);
                }
                i = 1;
                iM7908 = i11;
            }
        } else if (i4 > iM29223) {
            iM29223 = m29224(iM29223, (iM29223 + 1) * (iM29223 < 32 ? 4 : 2), iM30863, i3);
        } else {
            Object obj5 = this.f39345;
            C13638.requireNonNull(obj5);
            C2531.m7911(i5, i4, obj5);
        }
        int length = m29233().length;
        if (i4 > length && (iMin = Math.min(Mod.M30, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f39348 = Arrays.copyOf(m29233(), iMin);
            this.f39349 = Arrays.copyOf(m29239(), iMin);
            this.f39346 = Arrays.copyOf(m29240(), iMin);
        }
        m29233()[i3] = C2531.m7907(iM30863, 0, iM29223);
        m29239()[i3] = obj;
        m29240()[i3] = obj2;
        this.f39350 = i4;
        m29247();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m29224(int i, int i2, int i3, int i4) {
        Object objM7910 = C2531.m7910(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C2531.m7911(i3 & i5, i4 + 1, objM7910);
        }
        Object obj = this.f39345;
        C13638.requireNonNull(obj);
        int[] iArrM29233 = m29233();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM7908 = C2531.m7908(i6, obj);
            while (iM7908 != 0) {
                int i7 = iM7908 - 1;
                int i8 = iArrM29233[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM7909 = C2531.m7908(i10, objM7910);
                C2531.m7911(i10, iM7908, objM7910);
                iArrM29233[i7] = C2531.m7907(i9, iM7909, i5);
                iM7908 = i8 & i;
            }
        }
        this.f39345 = objM7910;
        this.f39347 = C2531.m7907(this.f39347, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m29225(Object obj) {
        if (m29245()) {
            return -1;
        }
        int iM30863 = C12411.m30863(obj);
        int iM29223 = m29223();
        Object obj2 = this.f39345;
        C13638.requireNonNull(obj2);
        int iM7908 = C2531.m7908(iM30863 & iM29223, obj2);
        if (iM7908 == 0) {
            return -1;
        }
        int i = ~iM29223;
        int i2 = iM30863 & i;
        do {
            int i3 = iM7908 - 1;
            int i4 = m29233()[i3];
            if ((i4 & i) == i2 && C13638.equals(obj, m29239()[i3])) {
                return i3;
            }
            iM7908 = i4 & iM29223;
        } while (iM7908 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM29242 = m29242();
        if (mapM29242 != null) {
            return mapM29242.containsKey(obj);
        }
        return m29225(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM29242 = m29242();
        if (mapM29242 != null) {
            return mapM29242.get(obj);
        }
        int iM29225 = m29225(obj);
        if (iM29225 == -1) {
            return null;
        }
        return m29240()[iM29225];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM29242 = m29242();
        if (mapM29242 != null) {
            return mapM29242.remove(obj);
        }
        Object objM29236 = m29236(obj);
        if (objM29236 == f39343) {
            return null;
        }
        return objM29236;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object m29236(Object obj) {
        boolean zM29245 = m29245();
        Object obj2 = f39343;
        if (zM29245) {
            return obj2;
        }
        int iM29223 = m29223();
        Object obj3 = this.f39345;
        C13638.requireNonNull(obj3);
        int iM7909 = C2531.m7909(obj, null, iM29223, obj3, m29233(), m29239(), null);
        if (iM7909 == -1) {
            return obj2;
        }
        Object obj4 = m29240()[iM7909];
        m29243(iM7909, iM29223);
        this.f39350--;
        m29247();
        return obj4;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m29246(int i) {
        int i2 = i + 1;
        if (i2 < this.f39350) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f39344;
        if (set != null) {
            return set;
        }
        C3361 c3361 = new C3361(this);
        this.f39344 = c3361;
        return c3361;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f39351;
        if (set != null) {
            return set;
        }
        C1950 c1950 = new C1950(this);
        this.f39351 = c1950;
        return c1950;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM29242 = m29242();
        return mapM29242 != null ? mapM29242.size() : this.f39350;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM29242 = m29242();
        if (mapM29242 != null) {
            return mapM29242.containsValue(obj);
        }
        for (int i = 0; i < this.f39350; i++) {
            if (C13638.equals(obj, m29240()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f39352;
        if (collection != null) {
            return collection;
        }
        C13822 c13822 = new C13822(this);
        this.f39352 = c13822;
        return c13822;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m29245()) {
            return;
        }
        m29247();
        Map mapM29242 = m29242();
        if (mapM29242 != null) {
            this.f39347 = Math.min(Math.max(size(), 3), Mod.M30);
            mapM29242.clear();
            this.f39345 = null;
            this.f39350 = 0;
            return;
        }
        Arrays.fill(m29239(), 0, this.f39350, (Object) null);
        Arrays.fill(m29240(), 0, this.f39350, (Object) null);
        Object obj = this.f39345;
        C13638.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m29233(), 0, this.f39350, 0);
        this.f39350 = 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Iterator c23824;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapM29242 = m29242();
        if (mapM29242 != null) {
            c23824 = mapM29242.entrySet().iterator();
        } else {
            c23824 = new C23824(this);
        }
        while (c23824.hasNext()) {
            Map.Entry entry = (Map.Entry) c23824.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(C8479.m22141(i, "Invalid size: "));
        }
        m29244(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m29237(C11705 c11705) {
        Object obj = c11705.f39345;
        C13638.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29243(int i, int i2) {
        Object obj = this.f39345;
        C13638.requireNonNull(obj);
        int[] iArrM29233 = m29233();
        Object[] objArrM29239 = m29239();
        Object[] objArrM29240 = m29240();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj2 = objArrM29239[i3];
            objArrM29239[i] = obj2;
            objArrM29240[i] = objArrM29240[i3];
            objArrM29239[i3] = null;
            objArrM29240[i3] = null;
            iArrM29233[i] = iArrM29233[i3];
            iArrM29233[i3] = 0;
            int iM30863 = C12411.m30863(obj2) & i2;
            int iM7908 = C2531.m7908(iM30863, obj);
            if (iM7908 == size) {
                C2531.m7911(iM30863, i + 1, obj);
                return;
            }
            while (true) {
                int i4 = iM7908 - 1;
                int i5 = iArrM29233[i4];
                int i6 = i5 & i2;
                if (i6 == size) {
                    iArrM29233[i4] = C2531.m7907(i5, i + 1, i2);
                    return;
                }
                iM7908 = i6;
            }
        } else {
            objArrM29239[i] = null;
            objArrM29240[i] = null;
            iArrM29233[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] m29233() {
        int[] iArr = this.f39348;
        C13638.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Object[] m29239() {
        Object[] objArr = this.f39349;
        C13638.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[] m29240() {
        Object[] objArr = this.f39346;
        C13638.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m29227(C11705 c11705, int i) {
        return c11705.m29239()[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m29238(C11705 c11705, int i) {
        return c11705.m29240()[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29229(C11705 c11705, int i, Object obj) {
        c11705.m29240()[i] = obj;
    }
}
