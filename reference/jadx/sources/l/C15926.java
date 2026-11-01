package l;

import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15926 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method f51604;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Object f51605 = new Object();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f51606;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37889(Resources.Theme theme) {
        synchronized (f51605) {
            if (!f51606) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    f51604 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f51606 = true;
            }
            Method method = f51604;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    f51604 = null;
                }
            }
        }
    }
}
