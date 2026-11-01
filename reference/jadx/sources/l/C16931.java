package l;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܽ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBKY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16931 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object f54128;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Method f54129;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Class f54130;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f54130 = cls;
            f54128 = cls.newInstance();
            cls.getMethod("getUDID", Context.class);
            f54129 = cls.getMethod("getOAID", Context.class);
            cls.getMethod("getVAID", Context.class);
            cls.getMethod("getAAID", Context.class);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39624() {
        return (f54130 == null || f54128 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39623(Context context) {
        Method method;
        Object obj = f54128;
        if (obj == null || (method = f54129) == null) {
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
