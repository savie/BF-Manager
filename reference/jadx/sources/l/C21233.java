package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩶ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RANP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21233 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14519 f67756;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C14519 f67757 = new C14519(null, null, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48400(AbstractC20487 abstractC20487) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        C14519 c14519 = f67756;
        C14519 c145110 = f67757;
        if (c14519 == null) {
            try {
                C14519 c145111 = new C14519(Class.class.getDeclaredMethod("getModule", null), abstractC20487.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC20487.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f67756 = c145111;
                c14519 = c145111;
            } catch (Exception unused) {
                f67756 = c145110;
                c14519 = c145110;
            }
        }
        if (c14519 == c145110 || (method = c14519.f45674) == null || (objInvoke = method.invoke(abstractC20487.getClass(), null)) == null || (method2 = c14519.f45672) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = c14519.f45673;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
