package l;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5S8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class C8708 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C8708 f29938 = new C8708();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f29939 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f29940 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m22537(Class cls) {
        HashMap map = this.f29940;
        Boolean bool = (Boolean) map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((InterfaceC7774) method.getAnnotation(InterfaceC7774.class)) != null) {
                    m22534(cls, declaredMethods);
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
    public final C8002 m22536(Class cls) {
        C8002 c8002 = (C8002) this.f29939.get(cls);
        return c8002 != null ? c8002 : m22534(cls, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22535(HashMap map, C19291 c19291, EnumC1651 enumC1651, Class cls) {
        EnumC1651 enumC1652 = (EnumC1651) map.get(c19291);
        if (enumC1652 == null || enumC1651 == enumC1652) {
            if (enumC1652 == null) {
                map.put(c19291, enumC1651);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c19291.f62258.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1652 + ", new value " + enumC1651);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8002 m22534(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(m22536(superclass).f26243);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m22536(cls2).f26243.entrySet()) {
                m22535(map, (C19291) entry.getKey(), (EnumC1651) entry.getValue(), cls);
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
            InterfaceC7774 interfaceC7774 = (InterfaceC7774) method.getAnnotation(InterfaceC7774.class);
            if (interfaceC7774 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC1423.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC1651 enumC1651Value = interfaceC7774.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC1651.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC1651Value != EnumC1651.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m22535(map, new C19291(method, i), enumC1651Value, cls);
                z = true;
            }
        }
        C8002 c8002 = new C8002(map);
        this.f29939.put(cls, c8002);
        this.f29940.put(cls, Boolean.valueOf(z));
        return c8002;
    }
}
