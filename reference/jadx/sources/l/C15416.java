package l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.ܳܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15416 implements Map, Serializable {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Object f50234 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient int f50235;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient Object f50236;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient int[] f50237;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f50238;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient Object[] f50239;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Object[] f50240;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36905(C15416 c15416) {
        c15416.f50235--;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36916(int i) {
        C12128.m30308("Expected size must be >= 0", i >= 0);
        this.f50238 = Math.min(Math.max(i, 1), Mod.M30);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m36919() {
        return this.f50236 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m36914() {
        Object obj = this.f50236;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int m36903() {
        return (1 << (this.f50238 & 31)) - 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36918() {
        this.f50238 += 32;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        int i = 1;
        if (m36919()) {
            C12128.m30314("Arrays already allocated", m36919());
            int i2 = this.f50238;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (((double) iHighestOneBit) * 1.0d)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f50236 = C13179.m32698(iMax2);
            this.f50238 = C13179.m32695(this.f50238, 32 - Integer.numberOfLeadingZeros(iMax2 - 1), 31);
            this.f50237 = new int[i2];
            this.f50240 = new Object[i2];
            this.f50239 = new Object[i2];
        }
        Map mapM36914 = m36914();
        if (mapM36914 != null) {
            return mapM36914.put(obj, obj2);
        }
        int[] iArrM36894 = m36894();
        Object[] objArrM36902 = m36902();
        Object[] objArrM36906 = m36906();
        int i3 = this.f50235;
        int i4 = i3 + 1;
        int iM4502 = C1247.m4502(obj);
        int iM36903 = m36903();
        int i5 = iM4502 & iM36903;
        Object obj3 = this.f50236;
        C17359.requireNonNull(obj3);
        int iM32696 = C13179.m32696(i5, obj3);
        if (iM32696 != 0) {
            int i6 = ~iM36903;
            int i7 = iM4502 & i6;
            int i8 = 0;
            while (true) {
                int i9 = iM32696 - i;
                int i10 = iArrM36894[i9];
                if ((i10 & i6) == i7 && C17359.equals(obj, objArrM36902[i9])) {
                    Object obj4 = objArrM36906[i9];
                    objArrM36906[i9] = obj2;
                    return obj4;
                }
                int i11 = i10 & iM36903;
                i8++;
                if (i11 == 0) {
                    if (i8 < 9) {
                        if (i4 > iM36903) {
                            iM36903 = m36895(iM36903, (iM36903 + 1) * (iM36903 < 32 ? 4 : 2), iM4502, i3);
                            break;
                        }
                        iArrM36894[i9] = C13179.m32695(i10, i4, iM36903);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m36903() + 1, 1.0f);
                    int iM36917 = isEmpty() ? -1 : 0;
                    while (iM36917 >= 0) {
                        linkedHashMap.put(m36902()[iM36917], m36906()[iM36917]);
                        iM36917 = m36917(iM36917);
                    }
                    this.f50236 = linkedHashMap;
                    this.f50237 = null;
                    this.f50240 = null;
                    this.f50239 = null;
                    m36918();
                    return linkedHashMap.put(obj, obj2);
                }
                i = 1;
                iM32696 = i11;
            }
        } else if (i4 > iM36903) {
            iM36903 = m36895(iM36903, (iM36903 + 1) * (iM36903 < 32 ? 4 : 2), iM4502, i3);
        } else {
            Object obj5 = this.f50236;
            C17359.requireNonNull(obj5);
            C13179.m32699(i5, i4, obj5);
        }
        int length = m36894().length;
        if (i4 > length && (iMin = Math.min(Mod.M30, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f50237 = Arrays.copyOf(m36894(), iMin);
            this.f50240 = Arrays.copyOf(m36902(), iMin);
            this.f50239 = Arrays.copyOf(m36906(), iMin);
        }
        m36894()[i3] = C13179.m32695(iM4502, 0, iM36903);
        m36902()[i3] = obj;
        m36906()[i3] = obj2;
        this.f50235 = i4;
        m36918();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m36895(int i, int i2, int i3, int i4) {
        Object objM32698 = C13179.m32698(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C13179.m32699(i3 & i5, i4 + 1, objM32698);
        }
        Object obj = this.f50236;
        C17359.requireNonNull(obj);
        int[] iArrM36894 = m36894();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM32696 = C13179.m32696(i6, obj);
            while (iM32696 != 0) {
                int i7 = iM32696 - 1;
                int i8 = iArrM36894[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM32697 = C13179.m32696(i10, objM32698);
                C13179.m32699(i10, iM32696, objM32698);
                iArrM36894[i7] = C13179.m32695(i9, iM32697, i5);
                iM32696 = i8 & i;
            }
        }
        this.f50236 = objM32698;
        this.f50238 = C13179.m32695(this.f50238, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m36896(Object obj) {
        if (m36919()) {
            return -1;
        }
        int iM4502 = C1247.m4502(obj);
        int iM36903 = m36903();
        Object obj2 = this.f50236;
        C17359.requireNonNull(obj2);
        int iM32696 = C13179.m32696(iM4502 & iM36903, obj2);
        if (iM32696 == 0) {
            return -1;
        }
        int i = ~iM36903;
        int i2 = iM4502 & i;
        do {
            int i3 = iM32696 - 1;
            int i4 = m36894()[i3];
            if ((i4 & i) == i2 && C17359.equals(obj, m36902()[i3])) {
                return i3;
            }
            iM32696 = i4 & iM36903;
        } while (iM32696 != 0);
        return -1;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM36914 = m36914();
        if (mapM36914 != null) {
            return mapM36914.containsKey(obj);
        }
        return m36896(obj) != -1;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Map mapM36914 = m36914();
        if (mapM36914 != null) {
            return mapM36914.get(obj);
        }
        int iM36896 = m36896(obj);
        if (iM36896 == -1) {
            return null;
        }
        return m36906()[iM36896];
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Map mapM36914 = m36914();
        if (mapM36914 != null) {
            return mapM36914.remove(obj);
        }
        Object objM36910 = m36910(obj);
        if (objM36910 == f50234) {
            return null;
        }
        return objM36910;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object m36910(Object obj) {
        boolean zM36919 = m36919();
        Object obj2 = f50234;
        if (zM36919) {
            return obj2;
        }
        int iM36903 = m36903();
        Object obj3 = this.f50236;
        C17359.requireNonNull(obj3);
        int iM32697 = C13179.m32697(obj, null, iM36903, obj3, m36894(), m36902(), null);
        if (iM32697 == -1) {
            return obj2;
        }
        Object obj4 = m36906()[iM32697];
        m36915(iM32697, iM36903);
        this.f50235--;
        m36918();
        return obj4;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m36917(int i) {
        int i2 = i + 1;
        if (i2 < this.f50235) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return C15769.m37710(this, obj);
    }

    public final String toString() {
        return C15769.m37709(this);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C10941(this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C4976(this);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return new C4976(this).hashCode();
    }

    @Override // java.util.Map
    public final int size() {
        Map mapM36914 = m36914();
        return mapM36914 != null ? mapM36914.size() : this.f50235;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM36914 = m36914();
        if (mapM36914 != null) {
            return mapM36914.containsValue(obj);
        }
        for (int i = 0; i < this.f50235; i++) {
            if (C17359.equals(obj, m36906()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C19892(this);
    }

    @Override // java.util.Map
    public final void clear() {
        if (m36919()) {
            return;
        }
        m36918();
        Map mapM36914 = m36914();
        if (mapM36914 != null) {
            this.f50238 = Math.min(Math.max(size(), 3), Mod.M30);
            mapM36914.clear();
            this.f50236 = null;
            this.f50235 = 0;
            return;
        }
        Arrays.fill(m36902(), 0, this.f50235, (Object) null);
        Arrays.fill(m36906(), 0, this.f50235, (Object) null);
        Object obj = this.f50236;
        C17359.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m36894(), 0, this.f50235, 0);
        this.f50235 = 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Iterator c7345;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapM36914 = m36914();
        if (mapM36914 != null) {
            c7345 = mapM36914.entrySet().iterator();
        } else {
            c7345 = new C7345(this);
        }
        while (c7345.hasNext()) {
            Map.Entry entry = (Map.Entry) c7345.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(C13645.m33382(i, "Invalid size: "));
        }
        m36916(Math.min(i, 256));
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m36911(C15416 c15416) {
        Object obj = c15416.f50236;
        C17359.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36915(int i, int i2) {
        Object obj = this.f50236;
        C17359.requireNonNull(obj);
        int[] iArrM36894 = m36894();
        Object[] objArrM36902 = m36902();
        Object[] objArrM36906 = m36906();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj2 = objArrM36902[i3];
            objArrM36902[i] = obj2;
            objArrM36906[i] = objArrM36906[i3];
            objArrM36902[i3] = null;
            objArrM36906[i3] = null;
            iArrM36894[i] = iArrM36894[i3];
            iArrM36894[i3] = 0;
            int iM4502 = C1247.m4502(obj2) & i2;
            int iM32696 = C13179.m32696(iM4502, obj);
            if (iM32696 == size) {
                C13179.m32699(iM4502, i + 1, obj);
                return;
            }
            while (true) {
                int i4 = iM32696 - 1;
                int i5 = iArrM36894[i4];
                int i6 = i5 & i2;
                if (i6 == size) {
                    iArrM36894[i4] = C13179.m32695(i5, i + 1, i2);
                    return;
                }
                iM32696 = i6;
            }
        } else {
            objArrM36902[i] = null;
            objArrM36906[i] = null;
            iArrM36894[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] m36894() {
        int[] iArr = this.f50237;
        C17359.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object[] m36902() {
        Object[] objArr = this.f50240;
        C17359.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object[] m36906() {
        Object[] objArr = this.f50239;
        C17359.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m36898(C15416 c15416, int i) {
        return c15416.m36902()[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m36912(C15416 c15416, int i) {
        return c15416.m36906()[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36900(C15416 c15416, int i, Object obj) {
        c15416.m36906()[i] = obj;
    }
}
