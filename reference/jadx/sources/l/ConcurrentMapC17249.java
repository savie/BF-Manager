package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.u0.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: l.ܽ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class ConcurrentMapC17249 extends AbstractMap implements ConcurrentMap, Serializable, InterfaceC3079 {
    public static final int g = Runtime.getRuntime().availableProcessors();
    public static final C23479 h;
    public static final long i;
    public static final long j;
    public static final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f82079l;
    public static final long m;
    public static final int n;
    public static final int o;
    public static final ObjectStreamField[] serialPersistentFields;
    public static final long serialVersionUID = 7249069246763182397L;
    public volatile transient C9790[] a;
    public volatile transient C9790[] b;
    public volatile transient long baseCount;
    public volatile transient C23963[] c;
    public volatile transient int cellsBusy;
    public transient C16503 d;
    public transient C4855 e;
    public transient C14265 f;
    public volatile transient int sizeCtl;
    public volatile transient int transferIndex;

    public static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C9045[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        C23479 c23479 = C23479.b;
        h = c23479;
        i = c23479.h(ConcurrentMapC17249.class, "sizeCtl");
        j = c23479.h(ConcurrentMapC17249.class, "transferIndex");
        k = c23479.h(ConcurrentMapC17249.class, "baseCount");
        f82079l = c23479.h(ConcurrentMapC17249.class, "cellsBusy");
        m = c23479.h(C23963.class, b.d);
        n = c23479.a(C9790[].class);
        int iB = c23479.b(C9790[].class);
        if (((iB - 1) & iB) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(iB);
    }

    public static final int l(int i2) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return iNumberOfLeadingZeros + 1;
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() != Comparable.class || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length != 1 || actualTypeArguments[0] != cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final C9790 k(C9790[] c9790Arr, int i2) {
        return (C9790) h.f(c9790Arr, (((long) i2) << o) + ((long) n));
    }

    public static final boolean b(C9790[] c9790Arr, int i2, C9790 c9790) {
        C23479 c23479 = h;
        return AbstractC1758.E(c23479.a, c9790Arr, (((long) i2) << o) + ((long) n), c9790);
    }

    public static final void h(C9790[] c9790Arr, int i2, C9790 c9790) {
        h.j(c9790Arr, (((long) i2) << o) + ((long) n), c9790);
    }

    public ConcurrentMapC17249() {
    }

    public ConcurrentMapC17249(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentMapC17249(int i2, float f) {
        this(i2, f, 1);
    }

    public ConcurrentMapC17249(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((double) ((i2 < i3 ? i3 : i2) / f)) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : l((int) j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int length;
        C9790 c9790K;
        Object obj2;
        int i2 = i(obj.hashCode());
        C9790[] c9790Arr = this.a;
        if (c9790Arr == null || (length = c9790Arr.length) <= 0 || (c9790K = k(c9790Arr, (length - 1) & i2)) == null) {
            return null;
        }
        int i3 = c9790K.a;
        if (i3 == i2) {
            Object obj3 = c9790K.b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return c9790K.c;
            }
        } else if (i3 < 0) {
            C9790 c9790A = c9790K.a(i2, obj);
            if (c9790A != null) {
                return c9790A.c;
            }
            return null;
        }
        while (true) {
            c9790K = c9790K.d;
            if (c9790K == null) {
                return null;
            }
            if (c9790K.a == i2 && ((obj2 = c9790K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return c9790K.c;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        C9790[] c9790Arr = this.a;
        if (c9790Arr != null) {
            C8300 c8300 = new C8300(c9790Arr, c9790Arr.length, 0, c9790Arr.length);
            while (true) {
                C9790 c9790A = c8300.a();
                if (c9790A == null) {
                    break;
                }
                Object obj2 = c9790A.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return f(obj, obj2, false);
    }

    public final Object f(Object obj, Object obj2, boolean z) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        C9790[] c9790ArrE = this.a;
        int i3 = 0;
        while (true) {
            if (c9790ArrE != null) {
                int length = c9790ArrE.length;
                if (length != 0) {
                    int i4 = (length - 1) & i2;
                    C9790 c9790K = k(c9790ArrE, i4);
                    if (c9790K == null) {
                        if (b(c9790ArrE, i4, new C9790(i2, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i5 = c9790K.a;
                        if (i5 == -1) {
                            c9790ArrE = d(c9790ArrE, c9790K);
                        } else {
                            if (z && i5 == i2 && (((obj5 = c9790K.b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = c9790K.c) != null)) {
                                return obj6;
                            }
                            synchronized (c9790K) {
                                if (k(c9790ArrE, i4) != c9790K) {
                                    obj3 = null;
                                } else if (i5 >= 0) {
                                    i3 = 1;
                                    while (true) {
                                        if (c9790K.a == i2 && ((obj4 = c9790K.b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                            obj3 = c9790K.c;
                                            if (!z) {
                                                c9790K.c = obj2;
                                            }
                                        } else {
                                            C9790 c9790 = c9790K.d;
                                            if (c9790 == null) {
                                                c9790K.d = new C9790(i2, obj, obj2);
                                                obj3 = null;
                                            } else {
                                                i3++;
                                                c9790K = c9790;
                                            }
                                        }
                                    }
                                } else if (c9790K instanceof C6809) {
                                    C13520 c13520E = ((C6809) c9790K).e(i2, obj, obj2);
                                    if (c13520E != null) {
                                        Object obj7 = c13520E.c;
                                        if (!z) {
                                            c13520E.c = obj2;
                                        }
                                        obj3 = obj7;
                                    } else {
                                        obj3 = null;
                                    }
                                    i3 = 2;
                                } else {
                                    if (c9790K instanceof C0842) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                    obj3 = null;
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(c9790ArrE, i4);
                                }
                                if (obj3 == null) {
                                    break;
                                }
                                return obj3;
                            }
                        }
                    }
                }
            }
            c9790ArrE = e();
        }
        a(1L, i3);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        o(map.size());
        for (Map.Entry entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return g(obj, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ad A[PHI: r8
      0x00ad: PHI (r8v3 boolean) = 
      (r8v1 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
      (r8v4 boolean)
     binds: [B:64:0x00ac, B:45:0x0074, B:47:0x007a, B:51:0x0082, B:53:0x0088, B:40:0x0067, B:30:0x0049, B:32:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        C9790 c9790K;
        boolean z;
        Object obj4;
        C13520 c13520B;
        Object obj5;
        int i3 = i(obj.hashCode());
        C9790[] c9790ArrD = this.a;
        while (c9790ArrD != null && (length = c9790ArrD.length) != 0 && (c9790K = k(c9790ArrD, (i2 = (length - 1) & i3))) != null) {
            int i4 = c9790K.a;
            if (i4 == -1) {
                c9790ArrD = d(c9790ArrD, c9790K);
            } else {
                synchronized (c9790K) {
                    if (k(c9790ArrD, i2) == c9790K) {
                        z = true;
                        if (i4 >= 0) {
                            C9790 c9790 = null;
                            while (true) {
                                if (c9790K.a == i3 && ((obj5 = c9790K.b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                    obj4 = c9790K.c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            c9790K.c = obj2;
                                        } else if (c9790 != null) {
                                            c9790.d = c9790K.d;
                                        } else {
                                            h(c9790ArrD, i2, c9790K.d);
                                        }
                                    }
                                } else {
                                    C9790 c9791 = c9790K.d;
                                    if (c9791 != null) {
                                        c9790 = c9790K;
                                        c9790K = c9791;
                                    }
                                }
                                obj4 = null;
                            }
                        } else if (c9790K instanceof C6809) {
                            C6809 c6809 = (C6809) c9790K;
                            C13520 c13520 = c6809.e;
                            if (c13520 == null || (c13520B = c13520.b(i3, obj, null)) == null) {
                                obj4 = null;
                            } else {
                                obj4 = c13520B.c;
                                if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                    obj4 = null;
                                } else if (obj2 != null) {
                                    c13520B.c = obj2;
                                } else if (c6809.f(c13520B)) {
                                    h(c9790ArrD, i2, p(c6809.f));
                                }
                            }
                        } else {
                            if (c9790K instanceof C0842) {
                                throw new IllegalStateException("Recursive update");
                            }
                            z = false;
                            obj4 = null;
                        }
                    } else {
                        z = false;
                        obj4 = null;
                    }
                }
                if (z) {
                    if (obj4 == null) {
                        break;
                    }
                    if (obj2 == null) {
                        a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        long j2;
        C9790 c9790K;
        C9790[] c9790ArrD = this.a;
        long j3 = 0;
        loop0: while (true) {
            j2 = j3;
            int i2 = 0;
            while (true) {
                if (c9790ArrD == null || i2 >= c9790ArrD.length) {
                    break loop0;
                }
                c9790K = k(c9790ArrD, i2);
                if (c9790K == null) {
                    i2++;
                } else {
                    int i3 = c9790K.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (c9790K) {
                        if (k(c9790ArrD, i2) == c9790K) {
                            if (i3 < 0) {
                                c9790K = c9790K instanceof C6809 ? ((C6809) c9790K).f : null;
                            }
                            while (c9790K != null) {
                                j2--;
                                c9790K = c9790K.d;
                            }
                            h(c9790ArrD, i2, null);
                            i2++;
                        }
                    }
                }
            }
            c9790ArrD = d(c9790ArrD, c9790K);
            j3 = j2;
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C16503 c16503 = this.d;
        if (c16503 != null) {
            return c16503;
        }
        C16503 c16504 = new C16503(this, null);
        this.d = c16504;
        return c16504;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        C4855 c4855 = this.e;
        if (c4855 != null) {
            return c4855;
        }
        C4855 c4856 = new C4855(this);
        this.e = c4856;
        return c4856;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        C14265 c14265 = this.f;
        if (c14265 != null) {
            return c14265;
        }
        C14265 c14266 = new C14265(this);
        this.f = c14266;
        return c14266;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        C9790[] c9790Arr = this.a;
        int iHashCode = 0;
        if (c9790Arr != null) {
            C8300 c8300 = new C8300(c9790Arr, c9790Arr.length, 0, c9790Arr.length);
            while (true) {
                C9790 c9790A = c8300.a();
                if (c9790A == null) {
                    break;
                }
                iHashCode += c9790A.c.hashCode() ^ c9790A.b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        C9790[] c9790Arr = this.a;
        int length = c9790Arr == null ? 0 : c9790Arr.length;
        C8300 c8300 = new C8300(c9790Arr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        C9790 c9790A = c8300.a();
        if (c9790A != null) {
            while (true) {
                Object obj = c9790A.b;
                Object obj2 = c9790A.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append(a.h);
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                c9790A = c8300.a();
                if (c9790A == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object value;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C9790[] c9790Arr = this.a;
        int length = c9790Arr == null ? 0 : c9790Arr.length;
        C8300 c8300 = new C8300(c9790Arr, length, 0, length);
        while (true) {
            C9790 c9790A = c8300.a();
            if (c9790A != null) {
                Object obj3 = c9790A.c;
                Object obj4 = map.get(c9790A.b);
                if (obj4 == null || (obj4 != obj3 && !obj4.equals(obj3))) {
                    break;
                }
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (obj2 = get(key)) == null || (value != obj2 && !value.equals(obj2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i2 = 1;
        int i3 = 0;
        while (i2 < 16) {
            i3++;
            i2 <<= 1;
        }
        int i4 = 32 - i3;
        int i5 = i2 - 1;
        C9045[] c9045Arr = new C9045[16];
        for (int i6 = 0; i6 < 16; i6++) {
            c9045Arr[i6] = new C9045();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", c9045Arr);
        putFieldPutFields.put("segmentShift", i4);
        putFieldPutFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        C9790[] c9790Arr = this.a;
        if (c9790Arr != null) {
            C8300 c8300 = new C8300(c9790Arr, c9790Arr.length, 0, c9790Arr.length);
            while (true) {
                C9790 c9790A = c8300.a();
                if (c9790A == null) {
                    break;
                }
                objectOutputStream.writeObject(c9790A.b);
                objectOutputStream.writeObject(c9790A.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j2;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j3 = 0;
        C9790 c9790 = null;
        long j4 = 0;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j2 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j4++;
            c9790 = new C9790(i(object.hashCode()), object, object2, c9790);
        }
        if (j4 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j5 = (long) (((double) (j4 / 0.75f)) + 1.0d);
        int iL = j5 >= 1073741824 ? 1073741824 : l((int) j5);
        C9790[] c9790Arr = new C9790[iL];
        int i2 = iL - 1;
        while (c9790 != null) {
            C9790 c9791 = c9790.d;
            int i3 = c9790.a;
            int i4 = i3 & i2;
            C9790 c9790K = k(c9790Arr, i4);
            if (c9790K == null) {
                z = true;
            } else {
                Object obj2 = c9790.b;
                if (c9790K.a >= 0) {
                    int i5 = 0;
                    C9790 c9792 = c9790K;
                    while (true) {
                        if (c9792 == null) {
                            z = true;
                            break;
                        }
                        if (c9792.a == i3 && ((obj = c9792.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        } else {
                            i5++;
                            c9792 = c9792.d;
                        }
                    }
                    if (z && i5 >= 8) {
                        long j6 = j3 + 1;
                        c9790.d = c9790K;
                        C13520 c13520 = null;
                        C13520 c13521 = null;
                        C9790 c9793 = c9790;
                        while (c9793 != null) {
                            long j7 = j6;
                            C13520 c13522 = new C13520(c9793.a, c9793.b, c9793.c, null, null);
                            c13522.h = c13521;
                            if (c13521 == null) {
                                c13520 = c13522;
                            } else {
                                c13521.d = c13522;
                            }
                            c9793 = c9793.d;
                            c13521 = c13522;
                            j6 = j7;
                        }
                        h(c9790Arr, i4, new C6809(c13520));
                        j3 = j6;
                    }
                } else if (((C6809) c9790K).e(i3, obj2, c9790.c) == null) {
                    j3 += j2;
                }
                z = false;
            }
            j2 = 1;
            if (z) {
                j3++;
                c9790.d = c9790K;
                h(c9790Arr, i4, c9790);
            }
            c9790 = c9791;
        }
        this.a = c9790Arr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC16613
    public Object putIfAbsent(Object obj, Object obj2) {
        return f(obj, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC16613
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC16613
    public boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        C9790[] c9790Arr = this.a;
        if (c9790Arr == null) {
            return;
        }
        C8300 c8300 = new C8300(c9790Arr, c9790Arr.length, 0, c9790Arr.length);
        while (true) {
            C9790 c9790A = c8300.a();
            if (c9790A == null) {
                return;
            } else {
                biConsumer.accept(c9790A.b, c9790A.c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        C9790[] c9790Arr = this.a;
        if (c9790Arr == null) {
            return;
        }
        C8300 c8300 = new C8300(c9790Arr, c9790Arr.length, 0, c9790Arr.length);
        while (true) {
            C9790 c9790A = c8300.a();
            if (c9790A == null) {
                return;
            }
            Object obj = c9790A.c;
            Object obj2 = c9790A.b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) != null) {
                    break;
                } else {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0050 */
    /* JADX WARN: Code duplicated, block: B:84:0x00df A[EDGE_INSN: B:84:0x00df->B:85:0x00e0 BREAK  A[LOOP:1: B:49:0x007b->B:66:0x00ac], PHI: r4 r5
      0x00df: PHI (r4v7 int) = (r4v1 int), (r4v1 int), (r4v17 int), (r4v17 int) binds: [B:46:0x0076, B:81:0x00d6, B:60:0x0096, B:56:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r5v10 java.lang.Object) = (r5v1 java.lang.Object), (r5v1 java.lang.Object), (r5v16 java.lang.Object), (r5v18 java.lang.Object) binds: [B:46:0x0076, B:81:0x00d6, B:60:0x0096, B:56:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC17249.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        C13520 c13520B;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        C9790[] c9790ArrE = this.a;
        Object objApply = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (c9790ArrE != null) {
                int length = c9790ArrE.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    C9790 c9790K = k(c9790ArrE, i5);
                    if (c9790K == null) {
                        break;
                    }
                    int i6 = c9790K.a;
                    if (i6 == -1) {
                        c9790ArrE = d(c9790ArrE, c9790K);
                    } else {
                        synchronized (c9790K) {
                            if (k(c9790ArrE, i5) == c9790K) {
                                if (i6 >= 0) {
                                    i4 = 1;
                                    C9790 c9790 = null;
                                    while (true) {
                                        if (c9790K.a == i2 && ((obj2 = c9790K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                            objApply = biFunction.apply(obj, c9790K.c);
                                            if (objApply != null) {
                                                c9790K.c = objApply;
                                                break;
                                            }
                                            C9790 c9791 = c9790K.d;
                                            if (c9790 != null) {
                                                c9790.d = c9791;
                                            } else {
                                                h(c9790ArrE, i5, c9791);
                                            }
                                            i3 = -1;
                                            break;
                                        }
                                        C9790 c9792 = c9790K.d;
                                        if (c9792 == null) {
                                            break;
                                        }
                                        i4++;
                                        c9790 = c9790K;
                                        c9790K = c9792;
                                    }
                                } else if (c9790K instanceof C6809) {
                                    C6809 c6809 = (C6809) c9790K;
                                    C13520 c13520 = c6809.e;
                                    if (c13520 != null && (c13520B = c13520.b(i2, obj, null)) != null) {
                                        objApply = biFunction.apply(obj, c13520B.c);
                                        if (objApply != null) {
                                            c13520B.c = objApply;
                                        } else {
                                            if (c6809.f(c13520B)) {
                                                h(c9790ArrE, i5, p(c6809.f));
                                            }
                                            i3 = -1;
                                        }
                                    }
                                    i4 = 2;
                                } else if (c9790K instanceof C0842) {
                                    throw new IllegalStateException("Recursive update");
                                }
                            }
                        }
                        if (i4 != 0) {
                            break;
                        }
                    }
                }
            }
            c9790ArrE = e();
        }
        if (i3 != 0) {
            a(i3, i4);
        }
        return objApply;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r13, java.util.function.BiFunction r14) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC17249.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i2;
        Object obj3;
        if (obj == null || obj2 == null || biFunction == null) {
            throw null;
        }
        int i3 = i(obj.hashCode());
        C9790[] c9790ArrE = this.a;
        Object objApply = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (c9790ArrE != null) {
                int length = c9790ArrE.length;
                if (length != 0) {
                    int i6 = (length - 1) & i3;
                    C9790 c9790K = k(c9790ArrE, i6);
                    i2 = 1;
                    if (c9790K == null) {
                        if (b(c9790ArrE, i6, new C9790(i3, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i7 = c9790K.a;
                        if (i7 == -1) {
                            c9790ArrE = d(c9790ArrE, c9790K);
                        } else {
                            synchronized (c9790K) {
                                if (k(c9790ArrE, i6) == c9790K) {
                                    if (i7 >= 0) {
                                        i4 = 1;
                                        C9790 c9790 = null;
                                        while (true) {
                                            if (c9790K.a == i3 && ((obj3 = c9790K.b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                Object objApply2 = biFunction.apply(c9790K.c, obj2);
                                                if (objApply2 != null) {
                                                    c9790K.c = objApply2;
                                                } else {
                                                    C9790 c9791 = c9790K.d;
                                                    if (c9790 != null) {
                                                        c9790.d = c9791;
                                                    } else {
                                                        h(c9790ArrE, i6, c9791);
                                                    }
                                                    i5 = -1;
                                                }
                                                objApply = objApply2;
                                                break;
                                            }
                                            C9790 c9792 = c9790K.d;
                                            if (c9792 == null) {
                                                c9790K.d = new C9790(i3, obj, obj2);
                                                i5 = 1;
                                                objApply = obj2;
                                                break;
                                            }
                                            i4++;
                                            C9790 c9793 = c9790K;
                                            c9790K = c9792;
                                            c9790 = c9793;
                                        }
                                    } else if (c9790K instanceof C6809) {
                                        C6809 c6809 = (C6809) c9790K;
                                        C13520 c13520 = c6809.e;
                                        C13520 c13520B = c13520 == null ? null : c13520.b(i3, obj, null);
                                        objApply = c13520B == null ? obj2 : biFunction.apply(c13520B.c, obj2);
                                        if (objApply != null) {
                                            if (c13520B != null) {
                                                c13520B.c = objApply;
                                            } else {
                                                c6809.e(i3, obj, objApply);
                                                i5 = 1;
                                            }
                                        } else if (c13520B != null) {
                                            if (c6809.f(c13520B)) {
                                                h(c9790ArrE, i6, p(c6809.f));
                                            }
                                            i5 = -1;
                                        }
                                        i4 = 2;
                                    } else if (c9790K instanceof C0842) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            }
                            if (i4 != 0) {
                                if (i4 >= 8) {
                                    n(c9790ArrE, i6);
                                }
                                i2 = i5;
                                obj2 = objApply;
                                break;
                            }
                        }
                    }
                }
            }
            c9790ArrE = e();
        }
        if (i2 != 0) {
            a(i2, i4);
        }
        return obj2;
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public static C16503 newKeySet() {
        return new C16503(new ConcurrentMapC17249(), Boolean.TRUE);
    }

    public final C9790[] e() {
        while (true) {
            C9790[] c9790Arr = this.a;
            if (c9790Arr != null && c9790Arr.length != 0) {
                return c9790Arr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else if (h.c(this, i, i2, -1)) {
                try {
                    C9790[] c9790Arr2 = this.a;
                    if (c9790Arr2 == null || c9790Arr2.length == 0) {
                        int i3 = i2 > 0 ? i2 : 16;
                        C9790[] c9790Arr3 = new C9790[i3];
                        this.a = c9790Arr3;
                        i2 = i3 - (i3 >>> 2);
                        c9790Arr2 = c9790Arr3;
                    }
                    return c9790Arr2;
                } finally {
                    this.sizeCtl = i2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x014f A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #2 {all -> 0x0163, blocks: (B:94:0x014b, B:96:0x014f), top: B:129:0x014b }] */
    public final void a(long j2, int i2) {
        boolean zD;
        C22009 c22009;
        int i3;
        int i4;
        ConcurrentMapC17249 concurrentMapC17249;
        boolean z;
        ConcurrentMapC17249 concurrentMapC172410;
        int i5;
        C23963[] c23963Arr;
        boolean z2;
        C23479 c23479;
        long j3;
        long j4;
        boolean z3;
        int length;
        boolean z4;
        int length2;
        int length3;
        C23963 c23963;
        long j5;
        C9790[] c9790Arr;
        int length4;
        C9790[] c9790Arr2;
        C23963[] c23963Arr2 = this.c;
        if (c23963Arr2 != null) {
            if (c23963Arr2 != null) {
                zD = true;
            } else {
                zD = true;
            }
            c22009 = C20233.f;
            i3 = ((C20233) c22009.get()).b;
            if (i3 == 0) {
                C20233.d();
                i3 = ((C20233) c22009.get()).b;
                zD = true;
            }
            i4 = 0;
            concurrentMapC17249 = this;
            while (true) {
                z = false;
                int i6 = i3;
                concurrentMapC172410 = concurrentMapC17249;
                i5 = i6;
                while (true) {
                    c23963Arr = concurrentMapC172410.c;
                    if (c23963Arr == null) {
                    }
                    z2 = z;
                    if (concurrentMapC172410.cellsBusy != 0) {
                        c23479 = h;
                        j3 = k;
                        j4 = concurrentMapC172410.baseCount;
                        if (c23479.d(concurrentMapC172410, j3, j4, j4 + j2)) {
                            return;
                        }
                    } else {
                        c23479 = h;
                        j3 = k;
                        j4 = concurrentMapC172410.baseCount;
                        if (c23479.d(concurrentMapC172410, j3, j4, j4 + j2)) {
                            return;
                        }
                    }
                    z = z2;
                    concurrentMapC172410 = this;
                    i4 = 0;
                }
                if (concurrentMapC172410.c == c23963Arr) {
                    concurrentMapC172410.c = (C23963[]) Arrays.copyOf(c23963Arr, length << 1);
                }
                i4 = 0;
                concurrentMapC172410.cellsBusy = 0;
                ConcurrentMapC17249 concurrentMapC172411 = concurrentMapC172410;
                i3 = i5;
                concurrentMapC17249 = concurrentMapC172411;
            }
        } else {
            C23479 c234710 = h;
            long j6 = k;
            long j7 = this.baseCount;
            j5 = j7 + j2;
            if (!c234710.d(this, j6, j7, j5)) {
                if (c23963Arr2 != null || (length3 = c23963Arr2.length - 1) < 0 || (c23963 = c23963Arr2[length3 & ((C20233) C20233.f.get()).b]) == null) {
                    zD = true;
                } else {
                    C23479 c234711 = h;
                    long j8 = m;
                    long j9 = c23963.value;
                    zD = c234711.d(c23963, j8, j9, j9 + j2);
                    if (zD) {
                        if (i2 <= 1) {
                            return;
                        } else {
                            j5 = j();
                        }
                    }
                }
                c22009 = C20233.f;
                i3 = ((C20233) c22009.get()).b;
                if (i3 == 0) {
                    C20233.d();
                    i3 = ((C20233) c22009.get()).b;
                    zD = true;
                }
                i4 = 0;
                concurrentMapC17249 = this;
                while (true) {
                    z = false;
                    int i7 = i3;
                    concurrentMapC172410 = concurrentMapC17249;
                    i5 = i7;
                    while (true) {
                        c23963Arr = concurrentMapC172410.c;
                        if (c23963Arr == null && (length = c23963Arr.length) > 0) {
                            C23963 c23964 = c23963Arr[(length - 1) & i5];
                            if (c23964 != null) {
                                if (zD) {
                                    C23479 c234712 = h;
                                    long j10 = m;
                                    boolean z5 = z;
                                    long j11 = c23964.value;
                                    if (c234712.d(c23964, j10, j11, j11 + j2)) {
                                        return;
                                    }
                                    if (concurrentMapC172410.c == c23963Arr && length < g) {
                                        if (z5) {
                                            if (concurrentMapC172410.cellsBusy == 0) {
                                                if (c234712.c(concurrentMapC172410, f82079l, 0, 1)) {
                                                    break;
                                                }
                                            }
                                            z = z5;
                                        } else {
                                            z = true;
                                        }
                                    }
                                } else {
                                    zD = true;
                                }
                                int i8 = i5 ^ (i5 << 13);
                                int i9 = i8 ^ (i8 >>> 17);
                                i5 = i9 ^ (i9 << 5);
                                ((C20233) C20233.f.get()).b = i5;
                                z2 = z;
                                z = z2;
                                concurrentMapC172410 = this;
                                i4 = 0;
                            } else if (concurrentMapC172410.cellsBusy == 0) {
                                C23963 c23965 = new C23963(j2);
                                if (concurrentMapC172410.cellsBusy == 0) {
                                    if (h.c(concurrentMapC172410, f82079l, 0, 1)) {
                                        try {
                                            C23963[] c23963Arr3 = concurrentMapC172410.c;
                                            if (c23963Arr3 == null || (length2 = c23963Arr3.length) <= 0) {
                                                z4 = false;
                                            } else {
                                                int i10 = (length2 - 1) & i5;
                                                if (c23963Arr3[i10] == null) {
                                                    c23963Arr3[i10] = c23965;
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                            }
                                            concurrentMapC172410.cellsBusy = i4;
                                            if (z4) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            concurrentMapC172410.cellsBusy = i4;
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z = false;
                            int i11 = i5 ^ (i5 << 13);
                            int i12 = i11 ^ (i11 >>> 17);
                            i5 = i12 ^ (i12 << 5);
                            ((C20233) C20233.f.get()).b = i5;
                            z2 = z;
                            z = z2;
                            concurrentMapC172410 = this;
                            i4 = 0;
                        } else {
                            z2 = z;
                            if (concurrentMapC172410.cellsBusy != 0 && concurrentMapC172410.c == c23963Arr) {
                                if (h.c(concurrentMapC172410, f82079l, 0, 1)) {
                                    try {
                                        if (concurrentMapC172410.c == c23963Arr) {
                                            C23963[] c23963Arr4 = new C23963[2];
                                            c23963Arr4[i5 & 1] = new C23963(j2);
                                            concurrentMapC172410.c = c23963Arr4;
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        concurrentMapC172410.cellsBusy = 0;
                                        if (z3) {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        concurrentMapC172410.cellsBusy = 0;
                                        throw th2;
                                    }
                                } else {
                                    c23479 = h;
                                    j3 = k;
                                    j4 = concurrentMapC172410.baseCount;
                                    if (c23479.d(concurrentMapC172410, j3, j4, j4 + j2)) {
                                        return;
                                    }
                                }
                            } else {
                                c23479 = h;
                                j3 = k;
                                j4 = concurrentMapC172410.baseCount;
                                if (c23479.d(concurrentMapC172410, j3, j4, j4 + j2)) {
                                    return;
                                }
                            }
                            z = z2;
                            concurrentMapC172410 = this;
                            i4 = 0;
                        }
                    }
                    try {
                        if (concurrentMapC172410.c == c23963Arr) {
                            concurrentMapC172410.c = (C23963[]) Arrays.copyOf(c23963Arr, length << 1);
                        }
                        i4 = 0;
                        concurrentMapC172410.cellsBusy = 0;
                        ConcurrentMapC17249 concurrentMapC172412 = concurrentMapC172410;
                        i3 = i5;
                        concurrentMapC17249 = concurrentMapC172412;
                    } catch (Throwable th3) {
                        concurrentMapC172410.cellsBusy = 0;
                        throw th3;
                    }
                }
            }
        }
        if (i2 < 0) {
            return;
        }
        while (true) {
            int i13 = this.sizeCtl;
            if (j5 < i13 || (c9790Arr = this.a) == null || (length4 = c9790Arr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
            if (i13 < 0) {
                if ((i13 >>> 16) != iNumberOfLeadingZeros || i13 == iNumberOfLeadingZeros + 1 || i13 == iNumberOfLeadingZeros + 65535 || (c9790Arr2 = this.b) == null || this.transferIndex <= 0) {
                    return;
                }
                if (h.c(this, i, i13, i13 + 1)) {
                    m(c9790Arr, c9790Arr2);
                }
            } else if (h.c(this, i, i13, (iNumberOfLeadingZeros << 16) + 2)) {
                m(c9790Arr, null);
            }
            j5 = j();
        }
    }

    public final C9790[] d(C9790[] c9790Arr, C9790 c9790) {
        int i2;
        if (c9790 instanceof C17995) {
            C9790[] c9790Arr2 = ((C17995) c9790).e;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(c9790Arr.length) | 32768;
            while (c9790Arr2 == this.b && this.a == c9790Arr && (i2 = this.sizeCtl) < 0 && (i2 >>> 16) == iNumberOfLeadingZeros && i2 != iNumberOfLeadingZeros + 1 && i2 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
                if (h.c(this, i, i2, i2 + 1)) {
                    m(c9790Arr, c9790Arr2);
                    break;
                }
            }
            return c9790Arr2;
        }
        return this.a;
    }

    public final void o(int i2) {
        int length;
        int iL = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            C9790[] c9790Arr = this.a;
            if (c9790Arr == null || (length = c9790Arr.length) == 0) {
                int i4 = i3 > iL ? i3 : iL;
                if (h.c(this, i, i3, -1)) {
                    try {
                        if (this.a == c9790Arr) {
                            this.a = new C9790[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                        this.sizeCtl = i3;
                    } catch (Throwable th) {
                        this.sizeCtl = i3;
                        throw th;
                    }
                } else {
                    continue;
                }
            } else {
                if (iL <= i3 || length >= 1073741824) {
                    return;
                }
                if (c9790Arr == this.a) {
                    if (h.c(this, i, i3, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(c9790Arr, null);
                    }
                }
            }
        }
    }

    public final void m(C9790[] c9790Arr, C9790[] c9790Arr2) {
        C9790[] c9790Arr3;
        int i2;
        int i3;
        int i4;
        int i5;
        C9790 c6809;
        C9790 c68010;
        C9790 c9790;
        boolean zB;
        ConcurrentMapC17249 concurrentMapC17249 = this;
        C9790[] c9790Arr4 = c9790Arr;
        int length = c9790Arr4.length;
        int i6 = g;
        int i7 = i6 > 1 ? (length >>> 3) / i6 : length;
        int i8 = i7 < 16 ? 16 : i7;
        if (c9790Arr2 == null) {
            try {
                C9790[] c9790Arr5 = new C9790[length << 1];
                concurrentMapC17249.b = c9790Arr5;
                concurrentMapC17249.transferIndex = length;
                c9790Arr3 = c9790Arr5;
            } catch (Throwable unused) {
                concurrentMapC17249.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            c9790Arr3 = c9790Arr2;
        }
        int length2 = c9790Arr3.length;
        C17995 c17995 = new C17995(c9790Arr3);
        int i9 = 0;
        int i10 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (z) {
                i9--;
                if (i9 < i10 && !z2) {
                    int i11 = concurrentMapC17249.transferIndex;
                    if (i11 <= 0) {
                        i9 = -1;
                    } else {
                        C23479 c23479 = h;
                        long j2 = j;
                        int i12 = i11 > i8 ? i11 - i8 : 0;
                        if (c23479.c(this, j2, i11, i12)) {
                            i9 = i11 - 1;
                            i10 = i12;
                        }
                    }
                }
                z = false;
            } else {
                C13520 c13520 = null;
                C9790 c9791 = null;
                if (i9 < 0 || i9 >= length || (i5 = i9 + length) >= length2) {
                    i2 = i8;
                    i3 = length2;
                    i4 = i10;
                    if (z2) {
                        this.b = null;
                        this.a = c9790Arr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentMapC17249 = this;
                    C23479 c234710 = h;
                    long j3 = i;
                    int i13 = concurrentMapC17249.sizeCtl;
                    if (c234710.c(this, j3, i13, i13 - 1)) {
                        if (i13 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i9 = length;
                        z = true;
                        z2 = true;
                    }
                } else {
                    C9790 c9790K = k(c9790Arr4, i9);
                    if (c9790K == null) {
                        zB = b(c9790Arr4, i9, c17995);
                    } else {
                        int i14 = c9790K.a;
                        if (i14 == -1) {
                            zB = true;
                        } else {
                            synchronized (c9790K) {
                                if (k(c9790Arr4, i9) == c9790K) {
                                    if (i14 >= 0) {
                                        int i15 = i14 & length;
                                        C9790 c9792 = c9790K;
                                        for (C9790 c9793 = c9790K.d; c9793 != null; c9793 = c9793.d) {
                                            int i16 = c9793.a & length;
                                            if (i16 != i15) {
                                                c9792 = c9793;
                                                i15 = i16;
                                            }
                                        }
                                        if (i15 == 0) {
                                            c9790 = null;
                                            c9791 = c9792;
                                        } else {
                                            c9790 = c9792;
                                        }
                                        while (c9790K != c9792) {
                                            int i17 = c9790K.a;
                                            Object obj = c9790K.b;
                                            C9790 c9794 = c9792;
                                            Object obj2 = c9790K.c;
                                            if ((i17 & length) == 0) {
                                                c9791 = new C9790(i17, obj, obj2, c9791);
                                            } else {
                                                c9790 = new C9790(i17, obj, obj2, c9790);
                                            }
                                            c9790K = c9790K.d;
                                            c9792 = c9794;
                                            i8 = i8;
                                        }
                                        i2 = i8;
                                        h(c9790Arr3, i9, c9791);
                                        h(c9790Arr3, i5, c9790);
                                        h(c9790Arr4, i9, c17995);
                                        i3 = length2;
                                        i4 = i10;
                                    } else {
                                        i2 = i8;
                                        if (c9790K instanceof C6809) {
                                            C6809 c68011 = (C6809) c9790K;
                                            C9790 c9795 = c68011.f;
                                            C13520 c13521 = null;
                                            C13520 c13522 = null;
                                            C13520 c13523 = null;
                                            int i18 = 0;
                                            int i19 = 0;
                                            while (c9795 != null) {
                                                int i20 = length2;
                                                int i21 = c9795.a;
                                                int i22 = i10;
                                                C13520 c13524 = new C13520(i21, c9795.b, c9795.c, null, null);
                                                if ((i21 & length) == 0) {
                                                    c13524.h = c13523;
                                                    if (c13523 == null) {
                                                        c13520 = c13524;
                                                    } else {
                                                        c13523.d = c13524;
                                                    }
                                                    i19++;
                                                    c13523 = c13524;
                                                } else {
                                                    c13524.h = c13522;
                                                    if (c13522 == null) {
                                                        c13521 = c13524;
                                                    } else {
                                                        c13522.d = c13524;
                                                    }
                                                    i18++;
                                                    c13522 = c13524;
                                                }
                                                c9795 = c9795.d;
                                                length2 = i20;
                                                i10 = i22;
                                            }
                                            i3 = length2;
                                            i4 = i10;
                                            if (i19 <= 6) {
                                                c6809 = p(c13520);
                                            } else {
                                                c6809 = i18 != 0 ? new C6809(c13520) : c68011;
                                            }
                                            if (i18 <= 6) {
                                                c68010 = p(c13521);
                                            } else {
                                                c68010 = i19 != 0 ? new C6809(c13521) : c68011;
                                            }
                                            h(c9790Arr3, i9, c6809);
                                            h(c9790Arr3, i5, c68010);
                                            c9790Arr4 = c9790Arr;
                                            h(c9790Arr4, i9, c17995);
                                        }
                                    }
                                    z = true;
                                } else {
                                    i2 = i8;
                                }
                                i3 = length2;
                                i4 = i10;
                            }
                            concurrentMapC17249 = this;
                        }
                    }
                    z = zB;
                    i2 = i8;
                    i3 = length2;
                    i4 = i10;
                }
                length2 = i3;
                i8 = i2;
                i10 = i4;
            }
        }
    }

    public final long j() {
        C23963[] c23963Arr = this.c;
        long j2 = this.baseCount;
        if (c23963Arr != null) {
            for (C23963 c23963 : c23963Arr) {
                if (c23963 != null) {
                    j2 += c23963.value;
                }
            }
        }
        return j2;
    }

    public final void n(C9790[] c9790Arr, int i2) {
        int length = c9790Arr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        C9790 c9790K = k(c9790Arr, i2);
        if (c9790K == null || c9790K.a < 0) {
            return;
        }
        synchronized (c9790K) {
            if (k(c9790Arr, i2) == c9790K) {
                C13520 c13520 = null;
                C13520 c13521 = null;
                while (c9790K != null) {
                    C13520 c13522 = new C13520(c9790K.a, c9790K.b, c9790K.c, null, null);
                    c13522.h = c13521;
                    if (c13521 == null) {
                        c13520 = c13522;
                    } else {
                        c13521.d = c13522;
                    }
                    c9790K = c9790K.d;
                    c13521 = c13522;
                }
                h(c9790Arr, i2, new C6809(c13520));
            }
        }
    }

    public static C9790 p(C13520 c13520) {
        C9790 c9790 = null;
        C9790 c9791 = null;
        for (C9790 c9792 = c13520; c9792 != null; c9792 = c9792.d) {
            C9790 c9793 = new C9790(c9792.a, c9792.b, c9792.c);
            if (c9791 == null) {
                c9790 = c9793;
            } else {
                c9791.d = c9793;
            }
            c9791 = c9793;
        }
        return c9790;
    }
}
