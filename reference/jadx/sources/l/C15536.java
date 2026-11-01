package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15536 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f50565 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f50566 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5657 m37146(InterfaceC22591 interfaceC22591) {
        C13465.m32966(interfaceC22591, "object");
        boolean z = interfaceC22591 instanceof InterfaceC5657;
        boolean z2 = interfaceC22591 instanceof InterfaceC7296;
        if (z && z2) {
            return new C15764((InterfaceC7296) interfaceC22591, (InterfaceC5657) interfaceC22591);
        }
        if (z2) {
            return new C15764((InterfaceC7296) interfaceC22591, null);
        }
        if (z) {
            return (InterfaceC5657) interfaceC22591;
        }
        Class<?> cls = interfaceC22591.getClass();
        if (m37144(cls) == 2) {
            Object obj = f50566.get(cls);
            C13465.m32962(obj);
            List list = (List) obj;
            if (list.size() == 1) {
                return new C19539(m37145((Constructor) list.get(0), interfaceC22591));
            }
            int size = list.size();
            InterfaceC0240[] interfaceC0240Arr = new InterfaceC0240[size];
            for (int i = 0; i < size; i++) {
                interfaceC0240Arr[i] = m37145((Constructor) list.get(i), interfaceC22591);
            }
            return new C10119(interfaceC0240Arr);
        }
        return new C17651(interfaceC22591);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0240 m37145(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            C13465.m32967(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return (InterfaceC0240) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37144(Class cls) {
        Constructor declaredConstructor;
        Class<?>[] interfaces;
        int length;
        Class<?> cls2;
        HashMap map = f50565;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                C13465.m32967(name, "fullPackage");
                if (name.length() != 0) {
                    C13465.m32967(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    C13465.m32967(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                C13465.m32967(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = C12529.m31134(canonicalName, ".", "_").concat("_LifecycleAdapter");
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
            HashMap map2 = f50566;
            if (declaredConstructor != null) {
                map2.put(cls, C4892.m13617(declaredConstructor));
            } else if (!C8708.f29938.m22537(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass != null && InterfaceC22591.class.isAssignableFrom(superclass)) {
                    C13465.m32967(superclass, "superclass");
                    if (m37144(superclass) != 1) {
                        Object obj = map2.get(superclass);
                        C13465.m32962(obj);
                        arrayList = new ArrayList((Collection) obj);
                        interfaces = cls.getInterfaces();
                        C13465.m32967(interfaces, "klass.interfaces");
                        length = interfaces.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            cls2 = interfaces[i2];
                            if (cls2 == null) {
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                } else {
                    interfaces = cls.getInterfaces();
                    C13465.m32967(interfaces, "klass.interfaces");
                    length = interfaces.length;
                    while (i2 < length) {
                        cls2 = interfaces[i2];
                        if (cls2 == null && InterfaceC22591.class.isAssignableFrom(cls2)) {
                            C13465.m32967(cls2, "intrface");
                            if (m37144(cls2) != 1) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = map2.get(cls2);
                                C13465.m32962(obj2);
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
