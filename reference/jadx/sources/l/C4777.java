package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ۙ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61X7 */
/* JADX INFO: loaded from: classes2.dex */
public class C4777 implements Cloneable {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static Class[] f16755;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static Class[] f16756;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16757 = 0;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f16758;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static Class[] f16759;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f16760;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15789 f16763;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Method f16764;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Class f16765;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC17455 f16766;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Object[] f16767;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f16768;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Float f16769;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Method f16770;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f16771;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC21931 f16772;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final C18723 f16762 = new C18723();

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final C25040 f16761 = new C25040();

    static {
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        f16759 = new Class[]{cls, Float.class, cls2, cls3, Double.class, Integer.class};
        f16755 = new Class[]{cls3, Integer.class, cls, cls2, Float.class, Double.class};
        f16756 = new Class[]{cls2, Double.class, cls, cls3, Float.class, Integer.class};
        f16760 = new HashMap();
        f16758 = new HashMap();
    }

    public C4777(String str) {
        this.f16764 = null;
        this.f16770 = null;
        this.f16763 = null;
        this.f16771 = new ReentrantReadWriteLock();
        this.f16767 = new Object[1];
        this.f16768 = str;
    }

    public C4777(AbstractC17455 abstractC17455) {
        this.f16764 = null;
        this.f16770 = null;
        this.f16763 = null;
        this.f16771 = new ReentrantReadWriteLock();
        this.f16767 = new Object[1];
        this.f16766 = abstractC17455;
        if (abstractC17455 != null) {
            this.f16768 = abstractC17455.m40956();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo14747(float... fArr) {
        this.f16765 = Float.TYPE;
        int length = fArr.length;
        C23249[] c23249Arr = new C23249[Math.max(length, 2)];
        if (length != 1) {
            c23249Arr[0] = new C23249(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                c23249Arr[i] = new C23249(i / (length - 1), fArr[i]);
            }
        } else {
            C23249 c23249 = new C23249();
            c23249.f10078 = 0.0f;
            c23249Arr[0] = c23249;
            c23249Arr[1] = new C23249(1.0f, fArr[0]);
        }
        this.f16763 = new C15789(c23249Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Method m14740(Class cls, Class cls2, String str) {
        Class<?>[] clsArr;
        String str2 = this.f16768;
        if (str2 != null && str2.length() != 0) {
            str = C8008.m21875(Character.toUpperCase(str2.charAt(0)), str, str2.substring(1));
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
        if (this.f16765.equals(Float.class)) {
            clsArr = f16759;
        } else if (this.f16765.equals(Integer.class)) {
            clsArr = f16755;
        } else {
            clsArr = this.f16765.equals(Double.class) ? f16756 : new Class[]{this.f16765};
        }
        for (Class<?> cls3 : clsArr) {
            Class<?>[] clsArr2 = {cls3};
            try {
                try {
                    Method method = cls.getMethod(str, clsArr2);
                    this.f16765 = cls3;
                    return method;
                } catch (NoSuchMethodException unused2) {
                }
            } catch (NoSuchMethodException unused3) {
                declaredMethod = cls.getDeclaredMethod(str, clsArr2);
                declaredMethod.setAccessible(true);
                this.f16765 = cls3;
                return declaredMethod;
            }
        }
        C17359.toString(this.f16765);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Method m14741(Class cls, HashMap map, String str, Class cls2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f16771;
        try {
            reentrantReadWriteLock.writeLock().lock();
            HashMap map2 = (HashMap) map.get(cls);
            Method methodM14740 = map2 != null ? (Method) map2.get(this.f16768) : null;
            if (methodM14740 == null) {
                methodM14740 = m14740(cls, cls2, str);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(cls, map2);
                }
                map2.put(this.f16768, methodM14740);
            }
            return methodM14740;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo14744(Class cls) {
        this.f16764 = m14741(cls, f16760, "set", this.f16765);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14749(Object obj) {
        AbstractC17455 abstractC17455 = this.f16766;
        if (abstractC17455 != null) {
            try {
                abstractC17455.mo1284(obj);
                for (AbstractC3111 abstractC3111 : this.f16763.f65072) {
                    if (!abstractC3111.f10080) {
                        abstractC3111.mo10181(this.f16766.mo1284(obj));
                    }
                }
                return;
            } catch (ClassCastException unused) {
                this.f16766.getClass();
                C17359.toString(obj);
                this.f16766 = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f16764 == null) {
            mo14744((Class) cls);
        }
        for (AbstractC3111 abstractC3112 : this.f16763.f65072) {
            if (!abstractC3112.f10080) {
                if (this.f16770 == null) {
                    this.f16770 = m14741(cls, f16758, "get", null);
                }
                try {
                    abstractC3112.mo10181(this.f16770.invoke(obj, null));
                } catch (IllegalAccessException e) {
                    e.toString();
                } catch (InvocationTargetException e2) {
                    e2.toString();
                }
            }
        }
    }

    @Override // 
    public C4777 clone() {
        try {
            C4777 c4777 = (C4777) super.clone();
            c4777.f16768 = this.f16768;
            c4777.f16766 = this.f16766;
            c4777.f16763 = this.f16763.clone();
            c4777.f16772 = this.f16772;
            return c4777;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo14745(Object obj) {
        Object[] objArr = this.f16767;
        AbstractC17455 abstractC17455 = this.f16766;
        if (abstractC17455 != null) {
            abstractC17455.mo39478(obj, mo14742());
        }
        if (this.f16764 != null) {
            try {
                objArr[0] = mo14742();
                this.f16764.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.toString();
            } catch (InvocationTargetException e2) {
                e2.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14748() {
        InterfaceC21931 interfaceC21931;
        if (this.f16772 == null) {
            Class cls = this.f16765;
            if (cls == Integer.class) {
                interfaceC21931 = f16762;
            } else {
                interfaceC21931 = cls == Float.class ? f16761 : null;
            }
            this.f16772 = interfaceC21931;
        }
        InterfaceC21931 interfaceC21932 = this.f16772;
        if (interfaceC21932 != null) {
            this.f16763.f65071 = interfaceC21932;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14746(C1815 c1815) {
        this.f16772 = c1815;
        this.f16763.f65071 = c1815;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo14743(float f) {
        this.f16769 = Float.valueOf(this.f16763.m37719(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Float mo14742() {
        return this.f16769;
    }

    public final String toString() {
        return this.f16768 + ": " + this.f16763.toString();
    }
}
