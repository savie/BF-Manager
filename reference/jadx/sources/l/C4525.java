package l;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4525 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static ServiceConnectionC7287 f16111;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String f16114;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f16115;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final NotificationManager f16116;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Object f16113 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static HashSet f16110 = new HashSet();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Object f16112 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4525 m14247(Context context) {
        return new C4525(context);
    }

    public C4525(Context context) {
        this.f16115 = context;
        this.f16116 = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14251() {
        this.f16116.cancel(null, 1006);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14249(Notification notification) {
        NotificationManager notificationManager = this.f16116;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            C9523 c9523 = new C9523(this.f16115.getPackageName(), notification);
            synchronized (f16112) {
                if (f16111 == null) {
                    f16111 = new ServiceConnectionC7287(this.f16115.getApplicationContext());
                }
                f16111.m19951(c9523);
            }
            notificationManager.cancel(null, 1006);
            return;
        }
        notificationManager.notify(null, 1006, notification);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14250() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1321.m4847(this.f16116);
        }
        Context context = this.f16115;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Set m14248(Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f16113) {
            if (string != null) {
                if (!string.equals(f16114)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet2 = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet2.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    f16110 = hashSet2;
                    f16114 = string;
                }
                hashSet = f16110;
            } else {
                hashSet = f16110;
            }
            throw th;
        }
        return hashSet;
    }
}
