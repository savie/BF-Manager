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

/* JADX INFO: renamed from: l.ᩳ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes5.dex */
public final class C19308 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Class f62385;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Field f62386;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Field f62387;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Method f62388;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Method f62389;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Handler f62390 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Method f62391;

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
        f62385 = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f62386 = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f62387 = declaredField2;
        Class cls2 = f62385;
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
        f62389 = declaredMethod;
        Class cls4 = f62385;
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
        f62391 = declaredMethod2;
        Class cls5 = f62385;
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && cls5 != null) {
            try {
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f62388 = method;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44679(Activity activity) {
        Object obj;
        Handler handler = f62390;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
            return true;
        }
        Method method = f62388;
        if (((i != 26 && i != 27) || method != null) && (f62391 != null || f62389 != null)) {
            try {
                Object obj2 = f62387.get(activity);
                if (obj2 != null && (obj = f62386.get(activity)) != null) {
                    Application application = activity.getApplication();
                    C8121 c8121 = new C8121(activity);
                    application.registerActivityLifecycleCallbacks(c8121);
                    handler.post(new RunnableC21546(c8121, obj2));
                    try {
                        if (i == 26 || i == 27) {
                            Boolean bool = Boolean.FALSE;
                            method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                        } else {
                            activity.recreate();
                        }
                        handler.post(new RunnableC18562(application, c8121));
                        return true;
                    } catch (Throwable th) {
                        handler.post(new RunnableC18562(application, c8121));
                        throw th;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44680(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f62387.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f62390.postAtFrontOfQueue(new RunnableC0663(f62386.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
