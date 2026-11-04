package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4967 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13455 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f42835 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f42836 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5252 m33094(InterfaceC22406 interfaceC22406) {
        C15243.m36590(interfaceC22406, "object");
        boolean z = interfaceC22406 instanceof InterfaceC5252;
        boolean z2 = interfaceC22406 instanceof InterfaceC12314;
        if (z && z2) {
            return new C24249((InterfaceC12314) interfaceC22406, (InterfaceC5252) interfaceC22406);
        }
        if (z2) {
            return new C24249((InterfaceC12314) interfaceC22406, null);
        }
        if (z) {
            return (InterfaceC5252) interfaceC22406;
        }
        Class<?> cls = interfaceC22406.getClass();
        if (m33093(cls) == 2) {
            Object obj = f42836.get(cls);
            C15243.m36586(obj);
            List list = (List) obj;
            if (list.size() == 1) {
                return new C15450(m33095((Constructor) list.get(0), interfaceC22406));
            }
            int size = list.size();
            InterfaceC14551[] interfaceC14551Arr = new InterfaceC14551[size];
            for (int i = 0; i < size; i++) {
                interfaceC14551Arr[i] = m33095((Constructor) list.get(i), interfaceC22406);
            }
            return new C20519(interfaceC14551Arr);
        }
        return new C14946(interfaceC22406);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14551 m33095(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            C15243.m36586(objNewInstance);
            return (InterfaceC14551) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33093(Class cls) {
        Constructor declaredConstructor;
        Iterator itM3335;
        Class cls2;
        HashMap map = f42835;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                C15243.m36586((Object) name);
                if (name.length() != 0) {
                    C15243.m36586((Object) canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    C15243.m36591(canonicalName, "substring(...)");
                }
                C15243.m36586((Object) canonicalName);
                String strConcat = C0878.m3573(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap map2 = f42836;
            if (declaredConstructor != null) {
                map2.put(cls, C7743.m21087(declaredConstructor));
            } else if (!C3365.f10974.m11062(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass != null && InterfaceC22406.class.isAssignableFrom(superclass)) {
                    C15243.m36586(superclass);
                    if (m33093(superclass) != 1) {
                        Object obj = map2.get(superclass);
                        C15243.m36586(obj);
                        arrayList = new ArrayList((Collection) obj);
                        itM3335 = C0834.m3335(cls.getInterfaces());
                        while (itM3335.hasNext()) {
                            cls2 = (Class) itM3335.next();
                            if (cls2 == null) {
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                } else {
                    itM3335 = C0834.m3335(cls.getInterfaces());
                    while (itM3335.hasNext()) {
                        cls2 = (Class) itM3335.next();
                        if (cls2 == null && InterfaceC22406.class.isAssignableFrom(cls2)) {
                            C15243.m36586(cls2);
                            if (m33093(cls2) != 1) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = map2.get(cls2);
                                C15243.m36586(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                        }
                    }
                    if (arrayList != null) {
                        map2.put(cls, arrayList);
                    }
                }
            }
            i = 2;
        }
        map.put(cls, Integer.valueOf(i));
        return i;
    }
}
