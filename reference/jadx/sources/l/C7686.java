package l;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes3.dex */
public final class C7686 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Field f25454;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Method f25455;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Class f25456;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Method f25457;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Field f25458;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Handler f25459 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Method f25460;

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f25456 = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f25458 = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f25454 = declaredField2;
        Class cls2 = f25456;
        Class<?> cls3 = Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f25457 = declaredMethod;
        Class cls4 = f25456;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f25455 = declaredMethod2;
        Class cls5 = f25456;
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && cls5 != null) {
            try {
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f25460 = method;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20317(Activity activity) {
        Object obj;
        Handler handler = f25459;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
            return true;
        }
        Method method = f25460;
        if (((i != 26 && i != 27) || method != null) && (f25455 != null || f25457 != null)) {
            try {
                Object obj2 = f25454.get(activity);
                if (obj2 != null && (obj = f25458.get(activity)) != null) {
                    Application application = activity.getApplication();
                    C10509 c10509 = new C10509(activity);
                    application.registerActivityLifecycleCallbacks(c10509);
                    handler.post(new RunnableC8392(c10509, obj2));
                    try {
                        if (i == 26 || i == 27) {
                            Boolean bool = Boolean.FALSE;
                            method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                        } else {
                            activity.recreate();
                        }
                        handler.post(new RunnableC19681(application, c10509));
                        return true;
                    } catch (Throwable th) {
                        handler.post(new RunnableC19681(application, c10509));
                        throw th;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20318(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f25454.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f25459.postAtFrontOfQueue(new RunnableC9098(f25458.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
