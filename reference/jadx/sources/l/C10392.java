package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۤܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: RANP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10392 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8981 f35571;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C8981 f35572 = new C8981(null, null, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26294(AbstractC21680 abstractC21680) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        C8981 c8981 = f35571;
        C8981 c8982 = f35572;
        if (c8981 == null) {
            try {
                C8981 c8983 = new C8981(Class.class.getDeclaredMethod("getModule", null), abstractC21680.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC21680.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f35571 = c8983;
                c8981 = c8983;
            } catch (Exception unused) {
                f35571 = c8982;
                c8981 = c8982;
            }
        }
        if (c8981 == c8982 || (method = c8981.f30752) == null || (objInvoke = method.invoke(abstractC21680.getClass(), null)) == null || (method2 = c8981.f30750) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = c8981.f30751;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
