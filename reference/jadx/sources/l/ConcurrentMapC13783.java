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

/* JADX INFO: renamed from: l.ܰۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class ConcurrentMapC13783 extends AbstractMap implements ConcurrentMap, Serializable, InterfaceC5315 {
    public static final int g = Runtime.getRuntime().availableProcessors();
    public static final C2762 h;
    public static final long i;
    public static final long j;
    public static final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f77963l;
    public static final long m;
    public static final int n;
    public static final int o;
    public static final ObjectStreamField[] serialPersistentFields;
    public static final long serialVersionUID = 7249069246763182397L;
    public volatile transient C19427[] a;
    public volatile transient C19427[] b;
    public volatile transient long baseCount;
    public volatile transient C3903[] c;
    public volatile transient int cellsBusy;
    public transient C4609 d;
    public transient C0376 e;
    public transient C22955 f;
    public volatile transient int sizeCtl;
    public volatile transient int transferIndex;

    public static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C10255[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        C2762 c2762 = C2762.b;
        h = c2762;
        i = c2762.h(ConcurrentMapC13783.class, "sizeCtl");
        j = c2762.h(ConcurrentMapC13783.class, "transferIndex");
        k = c2762.h(ConcurrentMapC13783.class, "baseCount");
        f77963l = c2762.h(ConcurrentMapC13783.class, "cellsBusy");
        m = c2762.h(C3903.class, b.d);
        n = c2762.a(C19427[].class);
        int iB = c2762.b(C19427[].class);
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

    public static final C19427 k(C19427[] c19427Arr, int i2) {
        return (C19427) h.f(c19427Arr, (((long) i2) << o) + ((long) n));
    }

    public static final boolean b(C19427[] c19427Arr, int i2, C19427 c19427) {
        C2762 c2762 = h;
        return AbstractC1726.E(c2762.a, c19427Arr, (((long) i2) << o) + ((long) n), c19427);
    }

    public static final void h(C19427[] c19427Arr, int i2, C19427 c19427) {
        h.j(c19427Arr, (((long) i2) << o) + ((long) n), c19427);
    }

    public ConcurrentMapC13783() {
    }

    public ConcurrentMapC13783(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentMapC13783(int i2, float f) {
        this(i2, f, 1);
    }

    public ConcurrentMapC13783(int i2, float f, int i3) {
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
        C19427 c19427K;
        Object obj2;
        int i2 = i(obj.hashCode());
        C19427[] c19427Arr = this.a;
        if (c19427Arr == null || (length = c19427Arr.length) <= 0 || (c19427K = k(c19427Arr, (length - 1) & i2)) == null) {
            return null;
        }
        int i3 = c19427K.a;
        if (i3 == i2) {
            Object obj3 = c19427K.b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return c19427K.c;
            }
        } else if (i3 < 0) {
            C19427 c19427A = c19427K.a(i2, obj);
            if (c19427A != null) {
                return c19427A.c;
            }
            return null;
        }
        while (true) {
            c19427K = c19427K.d;
            if (c19427K == null) {
                return null;
            }
            if (c19427K.a == i2 && ((obj2 = c19427K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return c19427K.c;
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
        C19427[] c19427Arr = this.a;
        if (c19427Arr != null) {
            C20838 c20838 = new C20838(c19427Arr, c19427Arr.length, 0, c19427Arr.length);
            while (true) {
                C19427 c19427A = c20838.a();
                if (c19427A == null) {
                    break;
                }
                Object obj2 = c19427A.c;
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
        C19427[] c19427ArrE = this.a;
        int i3 = 0;
        while (true) {
            if (c19427ArrE != null) {
                int length = c19427ArrE.length;
                if (length != 0) {
                    int i4 = (length - 1) & i2;
                    C19427 c19427K = k(c19427ArrE, i4);
                    if (c19427K == null) {
                        if (b(c19427ArrE, i4, new C19427(i2, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i5 = c19427K.a;
                        if (i5 == -1) {
                            c19427ArrE = d(c19427ArrE, c19427K);
                        } else {
                            if (z && i5 == i2 && (((obj5 = c19427K.b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = c19427K.c) != null)) {
                                return obj6;
                            }
                            synchronized (c19427K) {
                                if (k(c19427ArrE, i4) != c19427K) {
                                    obj3 = null;
                                } else if (i5 >= 0) {
                                    i3 = 1;
                                    while (true) {
                                        if (c19427K.a == i2 && ((obj4 = c19427K.b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                            obj3 = c19427K.c;
                                            if (!z) {
                                                c19427K.c = obj2;
                                            }
                                        } else {
                                            C19427 c19427 = c19427K.d;
                                            if (c19427 == null) {
                                                c19427K.d = new C19427(i2, obj, obj2);
                                                obj3 = null;
                                            } else {
                                                i3++;
                                                c19427K = c19427;
                                            }
                                        }
                                    }
                                } else if (c19427K instanceof C15900) {
                                    C20133 c20133E = ((C15900) c19427K).e(i2, obj, obj2);
                                    if (c20133E != null) {
                                        Object obj7 = c20133E.c;
                                        if (!z) {
                                            c20133E.c = obj2;
                                        }
                                        obj3 = obj7;
                                    } else {
                                        obj3 = null;
                                    }
                                    i3 = 2;
                                } else {
                                    if (c19427K instanceof C8844) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                    obj3 = null;
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(c19427ArrE, i4);
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
            c19427ArrE = e();
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
        C19427 c19427K;
        boolean z;
        Object obj4;
        C20133 c20133B;
        Object obj5;
        int i3 = i(obj.hashCode());
        C19427[] c19427ArrD = this.a;
        while (c19427ArrD != null && (length = c19427ArrD.length) != 0 && (c19427K = k(c19427ArrD, (i2 = (length - 1) & i3))) != null) {
            int i4 = c19427K.a;
            if (i4 == -1) {
                c19427ArrD = d(c19427ArrD, c19427K);
            } else {
                synchronized (c19427K) {
                    if (k(c19427ArrD, i2) == c19427K) {
                        z = true;
                        if (i4 >= 0) {
                            C19427 c19427 = null;
                            while (true) {
                                if (c19427K.a == i3 && ((obj5 = c19427K.b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                    obj4 = c19427K.c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            c19427K.c = obj2;
                                        } else if (c19427 != null) {
                                            c19427.d = c19427K.d;
                                        } else {
                                            h(c19427ArrD, i2, c19427K.d);
                                        }
                                    }
                                } else {
                                    C19427 c19428 = c19427K.d;
                                    if (c19428 != null) {
                                        c19427 = c19427K;
                                        c19427K = c19428;
                                    }
                                }
                                obj4 = null;
                            }
                        } else if (c19427K instanceof C15900) {
                            C15900 c15900 = (C15900) c19427K;
                            C20133 c20133 = c15900.e;
                            if (c20133 == null || (c20133B = c20133.b(i3, obj, null)) == null) {
                                obj4 = null;
                            } else {
                                obj4 = c20133B.c;
                                if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                    obj4 = null;
                                } else if (obj2 != null) {
                                    c20133B.c = obj2;
                                } else if (c15900.f(c20133B)) {
                                    h(c19427ArrD, i2, p(c15900.f));
                                }
                            }
                        } else {
                            if (c19427K instanceof C8844) {
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
        C19427 c19427K;
        C19427[] c19427ArrD = this.a;
        long j3 = 0;
        loop0: while (true) {
            j2 = j3;
            int i2 = 0;
            while (true) {
                if (c19427ArrD == null || i2 >= c19427ArrD.length) {
                    break loop0;
                }
                c19427K = k(c19427ArrD, i2);
                if (c19427K == null) {
                    i2++;
                } else {
                    int i3 = c19427K.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (c19427K) {
                        if (k(c19427ArrD, i2) == c19427K) {
                            if (i3 < 0) {
                                c19427K = c19427K instanceof C15900 ? ((C15900) c19427K).f : null;
                            }
                            while (c19427K != null) {
                                j2--;
                                c19427K = c19427K.d;
                            }
                            h(c19427ArrD, i2, null);
                            i2++;
                        }
                    }
                }
            }
            c19427ArrD = d(c19427ArrD, c19427K);
            j3 = j2;
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C4609 c4609 = this.d;
        if (c4609 != null) {
            return c4609;
        }
        C4609 c46010 = new C4609(this, null);
        this.d = c46010;
        return c46010;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        C0376 c0376 = this.e;
        if (c0376 != null) {
            return c0376;
        }
        C0376 c0377 = new C0376(this);
        this.e = c0377;
        return c0377;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        C22955 c22955 = this.f;
        if (c22955 != null) {
            return c22955;
        }
        C22955 c22956 = new C22955(this);
        this.f = c22956;
        return c22956;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        C19427[] c19427Arr = this.a;
        int iHashCode = 0;
        if (c19427Arr != null) {
            C20838 c20838 = new C20838(c19427Arr, c19427Arr.length, 0, c19427Arr.length);
            while (true) {
                C19427 c19427A = c20838.a();
                if (c19427A == null) {
                    break;
                }
                iHashCode += c19427A.c.hashCode() ^ c19427A.b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        C19427[] c19427Arr = this.a;
        int length = c19427Arr == null ? 0 : c19427Arr.length;
        C20838 c20838 = new C20838(c19427Arr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        C19427 c19427A = c20838.a();
        if (c19427A != null) {
            while (true) {
                Object obj = c19427A.b;
                Object obj2 = c19427A.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append(a.h);
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                c19427A = c20838.a();
                if (c19427A == null) {
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
        C19427[] c19427Arr = this.a;
        int length = c19427Arr == null ? 0 : c19427Arr.length;
        C20838 c20838 = new C20838(c19427Arr, length, 0, length);
        while (true) {
            C19427 c19427A = c20838.a();
            if (c19427A != null) {
                Object obj3 = c19427A.c;
                Object obj4 = map.get(c19427A.b);
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
        C10255[] c10255Arr = new C10255[16];
        for (int i6 = 0; i6 < 16; i6++) {
            c10255Arr[i6] = new C10255();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", c10255Arr);
        putFieldPutFields.put("segmentShift", i4);
        putFieldPutFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        C19427[] c19427Arr = this.a;
        if (c19427Arr != null) {
            C20838 c20838 = new C20838(c19427Arr, c19427Arr.length, 0, c19427Arr.length);
            while (true) {
                C19427 c19427A = c20838.a();
                if (c19427A == null) {
                    break;
                }
                objectOutputStream.writeObject(c19427A.b);
                objectOutputStream.writeObject(c19427A.c);
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
        C19427 c19427 = null;
        long j4 = 0;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j2 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j4++;
            c19427 = new C19427(i(object.hashCode()), object, object2, c19427);
        }
        if (j4 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j5 = (long) (((double) (j4 / 0.75f)) + 1.0d);
        int iL = j5 >= 1073741824 ? 1073741824 : l((int) j5);
        C19427[] c19427Arr = new C19427[iL];
        int i2 = iL - 1;
        while (c19427 != null) {
            C19427 c19428 = c19427.d;
            int i3 = c19427.a;
            int i4 = i3 & i2;
            C19427 c19427K = k(c19427Arr, i4);
            if (c19427K == null) {
                z = true;
            } else {
                Object obj2 = c19427.b;
                if (c19427K.a >= 0) {
                    int i5 = 0;
                    C19427 c19429 = c19427K;
                    while (true) {
                        if (c19429 == null) {
                            z = true;
                            break;
                        }
                        if (c19429.a == i3 && ((obj = c19429.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        } else {
                            i5++;
                            c19429 = c19429.d;
                        }
                    }
                    if (z && i5 >= 8) {
                        long j6 = j3 + 1;
                        c19427.d = c19427K;
                        C20133 c20133 = null;
                        C20133 c20134 = null;
                        C19427 c194210 = c19427;
                        while (c194210 != null) {
                            long j7 = j6;
                            C20133 c20135 = new C20133(c194210.a, c194210.b, c194210.c, null, null);
                            c20135.h = c20134;
                            if (c20134 == null) {
                                c20133 = c20135;
                            } else {
                                c20134.d = c20135;
                            }
                            c194210 = c194210.d;
                            c20134 = c20135;
                            j6 = j7;
                        }
                        h(c19427Arr, i4, new C15900(c20133));
                        j3 = j6;
                    }
                } else if (((C15900) c19427K).e(i3, obj2, c19427.c) == null) {
                    j3 += j2;
                }
                z = false;
            }
            j2 = 1;
            if (z) {
                j3++;
                c19427.d = c19427K;
                h(c19427Arr, i4, c19427);
            }
            c19427 = c19428;
        }
        this.a = c19427Arr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC4464
    public Object putIfAbsent(Object obj, Object obj2) {
        return f(obj, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC4464
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC4464
    public boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC4464
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        C19427[] c19427Arr = this.a;
        if (c19427Arr == null) {
            return;
        }
        C20838 c20838 = new C20838(c19427Arr, c19427Arr.length, 0, c19427Arr.length);
        while (true) {
            C19427 c19427A = c20838.a();
            if (c19427A == null) {
                return;
            } else {
                biConsumer.accept(c19427A.b, c19427A.c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        C19427[] c19427Arr = this.a;
        if (c19427Arr == null) {
            return;
        }
        C20838 c20838 = new C20838(c19427Arr, c19427Arr.length, 0, c19427Arr.length);
        while (true) {
            C19427 c19427A = c20838.a();
            if (c19427A == null) {
                return;
            }
            Object obj = c19427A.c;
            Object obj2 = c19427A.b;
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
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC13783.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        C20133 c20133B;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        C19427[] c19427ArrE = this.a;
        Object objApply = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (c19427ArrE != null) {
                int length = c19427ArrE.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    C19427 c19427K = k(c19427ArrE, i5);
                    if (c19427K == null) {
                        break;
                    }
                    int i6 = c19427K.a;
                    if (i6 == -1) {
                        c19427ArrE = d(c19427ArrE, c19427K);
                    } else {
                        synchronized (c19427K) {
                            if (k(c19427ArrE, i5) == c19427K) {
                                if (i6 >= 0) {
                                    i4 = 1;
                                    C19427 c19427 = null;
                                    while (true) {
                                        if (c19427K.a == i2 && ((obj2 = c19427K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                            objApply = biFunction.apply(obj, c19427K.c);
                                            if (objApply != null) {
                                                c19427K.c = objApply;
                                                break;
                                            }
                                            C19427 c19428 = c19427K.d;
                                            if (c19427 != null) {
                                                c19427.d = c19428;
                                            } else {
                                                h(c19427ArrE, i5, c19428);
                                            }
                                            i3 = -1;
                                            break;
                                        }
                                        C19427 c19429 = c19427K.d;
                                        if (c19429 == null) {
                                            break;
                                        }
                                        i4++;
                                        c19427 = c19427K;
                                        c19427K = c19429;
                                    }
                                } else if (c19427K instanceof C15900) {
                                    C15900 c15900 = (C15900) c19427K;
                                    C20133 c20133 = c15900.e;
                                    if (c20133 != null && (c20133B = c20133.b(i2, obj, null)) != null) {
                                        objApply = biFunction.apply(obj, c20133B.c);
                                        if (objApply != null) {
                                            c20133B.c = objApply;
                                        } else {
                                            if (c15900.f(c20133B)) {
                                                h(c19427ArrE, i5, p(c15900.f));
                                            }
                                            i3 = -1;
                                        }
                                    }
                                    i4 = 2;
                                } else if (c19427K instanceof C8844) {
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
            c19427ArrE = e();
        }
        if (i3 != 0) {
            a(i3, i4);
        }
        return objApply;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r13, java.util.function.BiFunction r14) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC13783.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i2;
        Object obj3;
        if (obj == null || obj2 == null || biFunction == null) {
            throw null;
        }
        int i3 = i(obj.hashCode());
        C19427[] c19427ArrE = this.a;
        Object objApply = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (c19427ArrE != null) {
                int length = c19427ArrE.length;
                if (length != 0) {
                    int i6 = (length - 1) & i3;
                    C19427 c19427K = k(c19427ArrE, i6);
                    i2 = 1;
                    if (c19427K == null) {
                        if (b(c19427ArrE, i6, new C19427(i3, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i7 = c19427K.a;
                        if (i7 == -1) {
                            c19427ArrE = d(c19427ArrE, c19427K);
                        } else {
                            synchronized (c19427K) {
                                if (k(c19427ArrE, i6) == c19427K) {
                                    if (i7 >= 0) {
                                        i4 = 1;
                                        C19427 c19427 = null;
                                        while (true) {
                                            if (c19427K.a == i3 && ((obj3 = c19427K.b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                Object objApply2 = biFunction.apply(c19427K.c, obj2);
                                                if (objApply2 != null) {
                                                    c19427K.c = objApply2;
                                                } else {
                                                    C19427 c19428 = c19427K.d;
                                                    if (c19427 != null) {
                                                        c19427.d = c19428;
                                                    } else {
                                                        h(c19427ArrE, i6, c19428);
                                                    }
                                                    i5 = -1;
                                                }
                                                objApply = objApply2;
                                                break;
                                            }
                                            C19427 c19429 = c19427K.d;
                                            if (c19429 == null) {
                                                c19427K.d = new C19427(i3, obj, obj2);
                                                i5 = 1;
                                                objApply = obj2;
                                                break;
                                            }
                                            i4++;
                                            C19427 c194210 = c19427K;
                                            c19427K = c19429;
                                            c19427 = c194210;
                                        }
                                    } else if (c19427K instanceof C15900) {
                                        C15900 c15900 = (C15900) c19427K;
                                        C20133 c20133 = c15900.e;
                                        C20133 c20133B = c20133 == null ? null : c20133.b(i3, obj, null);
                                        objApply = c20133B == null ? obj2 : biFunction.apply(c20133B.c, obj2);
                                        if (objApply != null) {
                                            if (c20133B != null) {
                                                c20133B.c = objApply;
                                            } else {
                                                c15900.e(i3, obj, objApply);
                                                i5 = 1;
                                            }
                                        } else if (c20133B != null) {
                                            if (c15900.f(c20133B)) {
                                                h(c19427ArrE, i6, p(c15900.f));
                                            }
                                            i5 = -1;
                                        }
                                        i4 = 2;
                                    } else if (c19427K instanceof C8844) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            }
                            if (i4 != 0) {
                                if (i4 >= 8) {
                                    n(c19427ArrE, i6);
                                }
                                i2 = i5;
                                obj2 = objApply;
                                break;
                            }
                        }
                    }
                }
            }
            c19427ArrE = e();
        }
        if (i2 != 0) {
            a(i2, i4);
        }
        return obj2;
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public static C4609 newKeySet() {
        return new C4609(new ConcurrentMapC13783(), Boolean.TRUE);
    }

    public final C19427[] e() {
        while (true) {
            C19427[] c19427Arr = this.a;
            if (c19427Arr != null && c19427Arr.length != 0) {
                return c19427Arr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else if (h.c(this, i, i2, -1)) {
                try {
                    C19427[] c19427Arr2 = this.a;
                    if (c19427Arr2 == null || c19427Arr2.length == 0) {
                        int i3 = i2 > 0 ? i2 : 16;
                        C19427[] c19427Arr3 = new C19427[i3];
                        this.a = c19427Arr3;
                        i2 = i3 - (i3 >>> 2);
                        c19427Arr2 = c19427Arr3;
                    }
                    return c19427Arr2;
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
        C16605 c16605;
        int i3;
        int i4;
        ConcurrentMapC13783 concurrentMapC13783;
        boolean z;
        ConcurrentMapC13783 concurrentMapC13784;
        int i5;
        C3903[] c3903Arr;
        boolean z2;
        C2762 c2762;
        long j3;
        long j4;
        boolean z3;
        int length;
        boolean z4;
        int length2;
        int length3;
        C3903 c3903;
        long j5;
        C19427[] c19427Arr;
        int length4;
        C19427[] c19427Arr2;
        C3903[] c3903Arr2 = this.c;
        if (c3903Arr2 != null) {
            if (c3903Arr2 != null) {
                zD = true;
            } else {
                zD = true;
            }
            c16605 = C22249.f;
            i3 = ((C22249) c16605.get()).b;
            if (i3 == 0) {
                C22249.d();
                i3 = ((C22249) c16605.get()).b;
                zD = true;
            }
            i4 = 0;
            concurrentMapC13783 = this;
            while (true) {
                z = false;
                int i6 = i3;
                concurrentMapC13784 = concurrentMapC13783;
                i5 = i6;
                while (true) {
                    c3903Arr = concurrentMapC13784.c;
                    if (c3903Arr == null) {
                    }
                    z2 = z;
                    if (concurrentMapC13784.cellsBusy != 0) {
                        c2762 = h;
                        j3 = k;
                        j4 = concurrentMapC13784.baseCount;
                        if (c2762.d(concurrentMapC13784, j3, j4, j4 + j2)) {
                            return;
                        }
                    } else {
                        c2762 = h;
                        j3 = k;
                        j4 = concurrentMapC13784.baseCount;
                        if (c2762.d(concurrentMapC13784, j3, j4, j4 + j2)) {
                            return;
                        }
                    }
                    z = z2;
                    concurrentMapC13784 = this;
                    i4 = 0;
                }
                if (concurrentMapC13784.c == c3903Arr) {
                    concurrentMapC13784.c = (C3903[]) Arrays.copyOf(c3903Arr, length << 1);
                }
                i4 = 0;
                concurrentMapC13784.cellsBusy = 0;
                ConcurrentMapC13783 concurrentMapC13785 = concurrentMapC13784;
                i3 = i5;
                concurrentMapC13783 = concurrentMapC13785;
            }
        } else {
            C2762 c2763 = h;
            long j6 = k;
            long j7 = this.baseCount;
            j5 = j7 + j2;
            if (!c2763.d(this, j6, j7, j5)) {
                if (c3903Arr2 != null || (length3 = c3903Arr2.length - 1) < 0 || (c3903 = c3903Arr2[length3 & ((C22249) C22249.f.get()).b]) == null) {
                    zD = true;
                } else {
                    C2762 c2764 = h;
                    long j8 = m;
                    long j9 = c3903.value;
                    zD = c2764.d(c3903, j8, j9, j9 + j2);
                    if (zD) {
                        if (i2 <= 1) {
                            return;
                        } else {
                            j5 = j();
                        }
                    }
                }
                c16605 = C22249.f;
                i3 = ((C22249) c16605.get()).b;
                if (i3 == 0) {
                    C22249.d();
                    i3 = ((C22249) c16605.get()).b;
                    zD = true;
                }
                i4 = 0;
                concurrentMapC13783 = this;
                while (true) {
                    z = false;
                    int i7 = i3;
                    concurrentMapC13784 = concurrentMapC13783;
                    i5 = i7;
                    while (true) {
                        c3903Arr = concurrentMapC13784.c;
                        if (c3903Arr == null && (length = c3903Arr.length) > 0) {
                            C3903 c3904 = c3903Arr[(length - 1) & i5];
                            if (c3904 != null) {
                                if (zD) {
                                    C2762 c2765 = h;
                                    long j10 = m;
                                    boolean z5 = z;
                                    long j11 = c3904.value;
                                    if (c2765.d(c3904, j10, j11, j11 + j2)) {
                                        return;
                                    }
                                    if (concurrentMapC13784.c == c3903Arr && length < g) {
                                        if (z5) {
                                            if (concurrentMapC13784.cellsBusy == 0) {
                                                if (c2765.c(concurrentMapC13784, f77963l, 0, 1)) {
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
                                ((C22249) C22249.f.get()).b = i5;
                                z2 = z;
                                z = z2;
                                concurrentMapC13784 = this;
                                i4 = 0;
                            } else if (concurrentMapC13784.cellsBusy == 0) {
                                C3903 c3905 = new C3903(j2);
                                if (concurrentMapC13784.cellsBusy == 0) {
                                    if (h.c(concurrentMapC13784, f77963l, 0, 1)) {
                                        try {
                                            C3903[] c3903Arr3 = concurrentMapC13784.c;
                                            if (c3903Arr3 == null || (length2 = c3903Arr3.length) <= 0) {
                                                z4 = false;
                                            } else {
                                                int i10 = (length2 - 1) & i5;
                                                if (c3903Arr3[i10] == null) {
                                                    c3903Arr3[i10] = c3905;
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                            }
                                            concurrentMapC13784.cellsBusy = i4;
                                            if (z4) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            concurrentMapC13784.cellsBusy = i4;
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z = false;
                            int i11 = i5 ^ (i5 << 13);
                            int i12 = i11 ^ (i11 >>> 17);
                            i5 = i12 ^ (i12 << 5);
                            ((C22249) C22249.f.get()).b = i5;
                            z2 = z;
                            z = z2;
                            concurrentMapC13784 = this;
                            i4 = 0;
                        } else {
                            z2 = z;
                            if (concurrentMapC13784.cellsBusy != 0 && concurrentMapC13784.c == c3903Arr) {
                                if (h.c(concurrentMapC13784, f77963l, 0, 1)) {
                                    try {
                                        if (concurrentMapC13784.c == c3903Arr) {
                                            C3903[] c3903Arr4 = new C3903[2];
                                            c3903Arr4[i5 & 1] = new C3903(j2);
                                            concurrentMapC13784.c = c3903Arr4;
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        concurrentMapC13784.cellsBusy = 0;
                                        if (z3) {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        concurrentMapC13784.cellsBusy = 0;
                                        throw th2;
                                    }
                                } else {
                                    c2762 = h;
                                    j3 = k;
                                    j4 = concurrentMapC13784.baseCount;
                                    if (c2762.d(concurrentMapC13784, j3, j4, j4 + j2)) {
                                        return;
                                    }
                                }
                            } else {
                                c2762 = h;
                                j3 = k;
                                j4 = concurrentMapC13784.baseCount;
                                if (c2762.d(concurrentMapC13784, j3, j4, j4 + j2)) {
                                    return;
                                }
                            }
                            z = z2;
                            concurrentMapC13784 = this;
                            i4 = 0;
                        }
                    }
                    try {
                        if (concurrentMapC13784.c == c3903Arr) {
                            concurrentMapC13784.c = (C3903[]) Arrays.copyOf(c3903Arr, length << 1);
                        }
                        i4 = 0;
                        concurrentMapC13784.cellsBusy = 0;
                        ConcurrentMapC13783 concurrentMapC13786 = concurrentMapC13784;
                        i3 = i5;
                        concurrentMapC13783 = concurrentMapC13786;
                    } catch (Throwable th3) {
                        concurrentMapC13784.cellsBusy = 0;
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
            if (j5 < i13 || (c19427Arr = this.a) == null || (length4 = c19427Arr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
            if (i13 < 0) {
                if ((i13 >>> 16) != iNumberOfLeadingZeros || i13 == iNumberOfLeadingZeros + 1 || i13 == iNumberOfLeadingZeros + 65535 || (c19427Arr2 = this.b) == null || this.transferIndex <= 0) {
                    return;
                }
                if (h.c(this, i, i13, i13 + 1)) {
                    m(c19427Arr, c19427Arr2);
                }
            } else if (h.c(this, i, i13, (iNumberOfLeadingZeros << 16) + 2)) {
                m(c19427Arr, null);
            }
            j5 = j();
        }
    }

    public final C19427[] d(C19427[] c19427Arr, C19427 c19427) {
        int i2;
        if (c19427 instanceof C21543) {
            C19427[] c19427Arr2 = ((C21543) c19427).e;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(c19427Arr.length) | 32768;
            while (c19427Arr2 == this.b && this.a == c19427Arr && (i2 = this.sizeCtl) < 0 && (i2 >>> 16) == iNumberOfLeadingZeros && i2 != iNumberOfLeadingZeros + 1 && i2 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
                if (h.c(this, i, i2, i2 + 1)) {
                    m(c19427Arr, c19427Arr2);
                    break;
                }
            }
            return c19427Arr2;
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
            C19427[] c19427Arr = this.a;
            if (c19427Arr == null || (length = c19427Arr.length) == 0) {
                int i4 = i3 > iL ? i3 : iL;
                if (h.c(this, i, i3, -1)) {
                    try {
                        if (this.a == c19427Arr) {
                            this.a = new C19427[i4];
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
                if (c19427Arr == this.a) {
                    if (h.c(this, i, i3, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(c19427Arr, null);
                    }
                }
            }
        }
    }

    public final void m(C19427[] c19427Arr, C19427[] c19427Arr2) {
        C19427[] c19427Arr3;
        int i2;
        int i3;
        int i4;
        int i5;
        C19427 c15900;
        C19427 c15901;
        C19427 c19427;
        boolean zB;
        ConcurrentMapC13783 concurrentMapC13783 = this;
        C19427[] c19427Arr4 = c19427Arr;
        int length = c19427Arr4.length;
        int i6 = g;
        int i7 = i6 > 1 ? (length >>> 3) / i6 : length;
        int i8 = i7 < 16 ? 16 : i7;
        if (c19427Arr2 == null) {
            try {
                C19427[] c19427Arr5 = new C19427[length << 1];
                concurrentMapC13783.b = c19427Arr5;
                concurrentMapC13783.transferIndex = length;
                c19427Arr3 = c19427Arr5;
            } catch (Throwable unused) {
                concurrentMapC13783.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            c19427Arr3 = c19427Arr2;
        }
        int length2 = c19427Arr3.length;
        C21543 c21543 = new C21543(c19427Arr3);
        int i9 = 0;
        int i10 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (z) {
                i9--;
                if (i9 < i10 && !z2) {
                    int i11 = concurrentMapC13783.transferIndex;
                    if (i11 <= 0) {
                        i9 = -1;
                    } else {
                        C2762 c2762 = h;
                        long j2 = j;
                        int i12 = i11 > i8 ? i11 - i8 : 0;
                        if (c2762.c(this, j2, i11, i12)) {
                            i9 = i11 - 1;
                            i10 = i12;
                        }
                    }
                }
                z = false;
            } else {
                C20133 c20133 = null;
                C19427 c19428 = null;
                if (i9 < 0 || i9 >= length || (i5 = i9 + length) >= length2) {
                    i2 = i8;
                    i3 = length2;
                    i4 = i10;
                    if (z2) {
                        this.b = null;
                        this.a = c19427Arr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentMapC13783 = this;
                    C2762 c2763 = h;
                    long j3 = i;
                    int i13 = concurrentMapC13783.sizeCtl;
                    if (c2763.c(this, j3, i13, i13 - 1)) {
                        if (i13 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i9 = length;
                        z = true;
                        z2 = true;
                    }
                } else {
                    C19427 c19427K = k(c19427Arr4, i9);
                    if (c19427K == null) {
                        zB = b(c19427Arr4, i9, c21543);
                    } else {
                        int i14 = c19427K.a;
                        if (i14 == -1) {
                            zB = true;
                        } else {
                            synchronized (c19427K) {
                                if (k(c19427Arr4, i9) == c19427K) {
                                    if (i14 >= 0) {
                                        int i15 = i14 & length;
                                        C19427 c19429 = c19427K;
                                        for (C19427 c194210 = c19427K.d; c194210 != null; c194210 = c194210.d) {
                                            int i16 = c194210.a & length;
                                            if (i16 != i15) {
                                                c19429 = c194210;
                                                i15 = i16;
                                            }
                                        }
                                        if (i15 == 0) {
                                            c19427 = null;
                                            c19428 = c19429;
                                        } else {
                                            c19427 = c19429;
                                        }
                                        while (c19427K != c19429) {
                                            int i17 = c19427K.a;
                                            Object obj = c19427K.b;
                                            C19427 c194211 = c19429;
                                            Object obj2 = c19427K.c;
                                            if ((i17 & length) == 0) {
                                                c19428 = new C19427(i17, obj, obj2, c19428);
                                            } else {
                                                c19427 = new C19427(i17, obj, obj2, c19427);
                                            }
                                            c19427K = c19427K.d;
                                            c19429 = c194211;
                                            i8 = i8;
                                        }
                                        i2 = i8;
                                        h(c19427Arr3, i9, c19428);
                                        h(c19427Arr3, i5, c19427);
                                        h(c19427Arr4, i9, c21543);
                                        i3 = length2;
                                        i4 = i10;
                                    } else {
                                        i2 = i8;
                                        if (c19427K instanceof C15900) {
                                            C15900 c15902 = (C15900) c19427K;
                                            C19427 c194212 = c15902.f;
                                            C20133 c20134 = null;
                                            C20133 c20135 = null;
                                            C20133 c20136 = null;
                                            int i18 = 0;
                                            int i19 = 0;
                                            while (c194212 != null) {
                                                int i20 = length2;
                                                int i21 = c194212.a;
                                                int i22 = i10;
                                                C20133 c20137 = new C20133(i21, c194212.b, c194212.c, null, null);
                                                if ((i21 & length) == 0) {
                                                    c20137.h = c20136;
                                                    if (c20136 == null) {
                                                        c20133 = c20137;
                                                    } else {
                                                        c20136.d = c20137;
                                                    }
                                                    i19++;
                                                    c20136 = c20137;
                                                } else {
                                                    c20137.h = c20135;
                                                    if (c20135 == null) {
                                                        c20134 = c20137;
                                                    } else {
                                                        c20135.d = c20137;
                                                    }
                                                    i18++;
                                                    c20135 = c20137;
                                                }
                                                c194212 = c194212.d;
                                                length2 = i20;
                                                i10 = i22;
                                            }
                                            i3 = length2;
                                            i4 = i10;
                                            if (i19 <= 6) {
                                                c15900 = p(c20133);
                                            } else {
                                                c15900 = i18 != 0 ? new C15900(c20133) : c15902;
                                            }
                                            if (i18 <= 6) {
                                                c15901 = p(c20134);
                                            } else {
                                                c15901 = i19 != 0 ? new C15900(c20134) : c15902;
                                            }
                                            h(c19427Arr3, i9, c15900);
                                            h(c19427Arr3, i5, c15901);
                                            c19427Arr4 = c19427Arr;
                                            h(c19427Arr4, i9, c21543);
                                        }
                                    }
                                    z = true;
                                } else {
                                    i2 = i8;
                                }
                                i3 = length2;
                                i4 = i10;
                            }
                            concurrentMapC13783 = this;
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
        C3903[] c3903Arr = this.c;
        long j2 = this.baseCount;
        if (c3903Arr != null) {
            for (C3903 c3903 : c3903Arr) {
                if (c3903 != null) {
                    j2 += c3903.value;
                }
            }
        }
        return j2;
    }

    public final void n(C19427[] c19427Arr, int i2) {
        int length = c19427Arr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        C19427 c19427K = k(c19427Arr, i2);
        if (c19427K == null || c19427K.a < 0) {
            return;
        }
        synchronized (c19427K) {
            if (k(c19427Arr, i2) == c19427K) {
                C20133 c20133 = null;
                C20133 c20134 = null;
                while (c19427K != null) {
                    C20133 c20135 = new C20133(c19427K.a, c19427K.b, c19427K.c, null, null);
                    c20135.h = c20134;
                    if (c20134 == null) {
                        c20133 = c20135;
                    } else {
                        c20134.d = c20135;
                    }
                    c19427K = c19427K.d;
                    c20134 = c20135;
                }
                h(c19427Arr, i2, new C15900(c20133));
            }
        }
    }

    public static C19427 p(C20133 c20133) {
        C19427 c19427 = null;
        C19427 c19428 = null;
        for (C19427 c19429 = c20133; c19429 != null; c19429 = c19429.d) {
            C19427 c194210 = new C19427(c19429.a, c19429.b, c19429.c);
            if (c19428 == null) {
                c19427 = c194210;
            } else {
                c19428.d = c194210;
            }
            c19428 = c194210;
        }
        return c19427;
    }
}
