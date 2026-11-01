package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ܺ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61X7 */
/* JADX INFO: loaded from: classes4.dex */
public class C16147 implements Cloneable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52178 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static Class[] f52180;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static Class[] f52181;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f52182;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static Class[] f52183;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f52184;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Method f52186;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f52187;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Method f52188;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC3445 f52189;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Class f52190;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Float f52191;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4857 f52192;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f52193;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC20380 f52194;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object[] f52195;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final C7000 f52179 = new C7000();

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final C13012 f52185 = new C13012();

    static {
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        f52180 = new Class[]{cls, Float.class, cls2, cls3, Double.class, Integer.class};
        f52181 = new Class[]{cls3, Integer.class, cls, cls2, Float.class, Double.class};
        f52183 = new Class[]{cls2, Double.class, cls, cls3, Float.class, Integer.class};
        f52182 = new HashMap();
        f52184 = new HashMap();
    }

    public C16147(String str) {
        this.f52188 = null;
        this.f52186 = null;
        this.f52192 = null;
        this.f52193 = new ReentrantReadWriteLock();
        this.f52195 = new Object[1];
        this.f52187 = str;
    }

    public C16147(AbstractC3445 abstractC3445) {
        this.f52188 = null;
        this.f52186 = null;
        this.f52192 = null;
        this.f52193 = new ReentrantReadWriteLock();
        this.f52195 = new Object[1];
        this.f52189 = abstractC3445;
        if (abstractC3445 != null) {
            this.f52187 = abstractC3445.m10150();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo38226(float... fArr) {
        this.f52190 = Float.TYPE;
        int length = fArr.length;
        C14031[] c14031Arr = new C14031[Math.max(length, 2)];
        if (length != 1) {
            c14031Arr[0] = new C14031(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                c14031Arr[i] = new C14031(i / (length - 1), fArr[i]);
            }
        } else {
            C14031 c14031 = new C14031();
            c14031.f40006 = 0.0f;
            c14031Arr[0] = c14031;
            c14031Arr[1] = new C14031(1.0f, fArr[0]);
        }
        this.f52192 = new C4857(c14031Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Method m38219(Class cls, Class cls2, String str) {
        Class<?>[] clsArr;
        String str2 = this.f52187;
        if (str2 != null && str2.length() != 0) {
            str = str + Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
        }
        Method declaredMethod = null;
        if (cls2 == null) {
            try {
                return cls.getMethod(str, null);
            } catch (NoSuchMethodException e) {
                try {
                    declaredMethod = cls.getDeclaredMethod(str, null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (NoSuchMethodException unused) {
                    e.toString();
                    return declaredMethod;
                }
            }
        }
        if (this.f52190.equals(Float.class)) {
            clsArr = f52180;
        } else if (this.f52190.equals(Integer.class)) {
            clsArr = f52181;
        } else {
            clsArr = this.f52190.equals(Double.class) ? f52183 : new Class[]{this.f52190};
        }
        for (Class<?> cls3 : clsArr) {
            Class<?>[] clsArr2 = {cls3};
            try {
                try {
                    Method method = cls.getMethod(str, clsArr2);
                    this.f52190 = cls3;
                    return method;
                } catch (NoSuchMethodException unused2) {
                }
            } catch (NoSuchMethodException unused3) {
                declaredMethod = cls.getDeclaredMethod(str, clsArr2);
                declaredMethod.setAccessible(true);
                this.f52190 = cls3;
                return declaredMethod;
            }
        }
        C13638.toString(this.f52190);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Method m38220(Class cls, HashMap map, String str, Class cls2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52193;
        try {
            reentrantReadWriteLock.writeLock().lock();
            HashMap map2 = (HashMap) map.get(cls);
            Method methodM38219 = map2 != null ? (Method) map2.get(this.f52187) : null;
            if (methodM38219 == null) {
                methodM38219 = m38219(cls, cls2, str);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(cls, map2);
                }
                map2.put(this.f52187, methodM38219);
            }
            return methodM38219;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo38223(Class cls) {
        this.f52188 = m38220(cls, f52182, "set", this.f52190);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38228(Object obj) {
        AbstractC3445 abstractC3445 = this.f52189;
        if (abstractC3445 != null) {
            try {
                abstractC3445.mo4726(obj);
                for (AbstractC11914 abstractC11914 : this.f52192.f10534) {
                    if (!abstractC11914.f40007) {
                        abstractC11914.mo29722(this.f52189.mo4726(obj));
                    }
                }
                return;
            } catch (ClassCastException unused) {
                this.f52189.getClass();
                C13638.toString(obj);
                this.f52189 = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f52188 == null) {
            mo38223((Class) cls);
        }
        for (AbstractC11914 abstractC11915 : this.f52192.f10534) {
            if (!abstractC11915.f40007) {
                if (this.f52186 == null) {
                    this.f52186 = m38220(cls, f52184, "get", null);
                }
                try {
                    abstractC11915.mo29722(this.f52186.invoke(obj, null));
                } catch (IllegalAccessException e) {
                    e.toString();
                } catch (InvocationTargetException e2) {
                    e2.toString();
                }
            }
        }
    }

    @Override // 
    public C16147 clone() {
        try {
            C16147 c16147 = (C16147) super.clone();
            c16147.f52187 = this.f52187;
            c16147.f52189 = this.f52189;
            c16147.f52192 = this.f52192.clone();
            c16147.f52194 = this.f52194;
            return c16147;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo38224(Object obj) {
        Object[] objArr = this.f52195;
        AbstractC3445 abstractC3445 = this.f52189;
        if (abstractC3445 != null) {
            abstractC3445.mo6532(obj, mo38221());
        }
        if (this.f52188 != null) {
            try {
                objArr[0] = mo38221();
                this.f52188.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.toString();
            } catch (InvocationTargetException e2) {
                e2.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38227() {
        InterfaceC20380 interfaceC20380;
        if (this.f52194 == null) {
            Class cls = this.f52190;
            if (cls == Integer.class) {
                interfaceC20380 = f52179;
            } else {
                interfaceC20380 = cls == Float.class ? f52185 : null;
            }
            this.f52194 = interfaceC20380;
        }
        InterfaceC20380 interfaceC20381 = this.f52194;
        if (interfaceC20381 != null) {
            this.f52192.f10533 = interfaceC20381;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38225(C1375 c1375) {
        this.f52194 = c1375;
        this.f52192.f10533 = c1375;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo38222(float f) {
        this.f52191 = Float.valueOf(this.f52192.m13555(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Float mo38221() {
        return this.f52191;
    }

    public final String toString() {
        return this.f52187 + ": " + this.f52192.toString();
    }
}
