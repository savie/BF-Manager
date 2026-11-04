package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۖۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AXS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2587 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Method f8309;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        C15243.m36586(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (C15243.m36589((Object) method2.getName(), (Object) "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                C15243.m36591(parameterTypes, "getParameterTypes(...)");
                if (C15243.m36589(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f8309 = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !C15243.m36589((Object) methods[i2].getName(), (Object) "getSuppressed"); i2++) {
        }
    }
}
