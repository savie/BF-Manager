package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩸᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S371 */
/* JADX INFO: loaded from: classes.dex */
public final class C23074 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74856 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Object f74857;

    static {
        Object objInvoke;
        Method method = null;
        try {
            objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (Throwable th) {
            if (th.getClass().getName().equals("java.lang.ThreadDeath")) {
                throw th;
            }
            objInvoke = null;
        }
        f74857 = objInvoke;
        if (objInvoke != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (Throwable th2) {
                if (th2.getClass().getName().equals("java.lang.ThreadDeath")) {
                    throw th2;
                }
            }
        }
        if (objInvoke == null) {
            return;
        }
        try {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
            } catch (Throwable th3) {
                if (th3.getClass().getName().equals("java.lang.ThreadDeath")) {
                    throw th3;
                }
            }
            if (method == null) {
                return;
            }
            method.invoke(objInvoke, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
