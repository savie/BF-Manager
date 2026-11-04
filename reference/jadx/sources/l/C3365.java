package l;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5S8 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C3365 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C3365 f10974 = new C3365();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f10975 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f10976 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m11062(Class cls) {
        HashMap map = this.f10976;
        Boolean bool = (Boolean) map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((InterfaceC23898) method.getAnnotation(InterfaceC23898.class)) != null) {
                    m11059(cls, declaredMethods);
                    return true;
                }
            }
            map.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16043 m11061(Class cls) {
        C16043 c16043 = (C16043) this.f10975.get(cls);
        return c16043 != null ? c16043 : m11059(cls, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11060(HashMap map, C23503 c23503, EnumC9330 enumC9330, Class cls) {
        EnumC9330 enumC9331 = (EnumC9330) map.get(c23503);
        if (enumC9331 == null || enumC9330 == enumC9331) {
            if (enumC9331 == null) {
                map.put(c23503, enumC9330);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c23503.f75984.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC9331 + ", new value " + enumC9330);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16043 m11059(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(m11061(superclass).f52044);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m11061(cls2).f52044.entrySet()) {
                m11060(map, (C23503) entry.getKey(), (EnumC9330) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC23898 interfaceC23898 = (InterfaceC23898) method.getAnnotation(InterfaceC23898.class);
            if (interfaceC23898 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC11217.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC9330 enumC9330Value = interfaceC23898.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC9330.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC9330Value != EnumC9330.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m11060(map, new C23503(method, i), enumC9330Value, cls);
                z = true;
            }
        }
        C16043 c16043 = new C16043(map);
        this.f10975.put(cls, c16043);
        this.f10976.put(cls, Boolean.valueOf(z));
        return c16043;
    }
}
