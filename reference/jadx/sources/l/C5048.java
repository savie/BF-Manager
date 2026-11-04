package l;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۙܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OBKY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5048 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object f17469;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Method f17470;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Class f17471;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f17471 = cls;
            f17469 = cls.newInstance();
            cls.getMethod("getUDID", Context.class);
            f17470 = cls.getMethod("getOAID", Context.class);
            cls.getMethod("getVAID", Context.class);
            cls.getMethod("getAAID", Context.class);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15283() {
        return (f17471 == null || f17469 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15282(Context context) {
        Method method;
        Object obj = f17469;
        if (obj == null || (method = f17470) == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
