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

/* JADX INFO: renamed from: l.ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5695 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static ServiceConnectionC12046 f19423;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String f19424;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Object f19425 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static HashSet f19426 = new HashSet();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Object f19427 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f19428;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final NotificationManager f19429;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5695 m15707(Context context) {
        return new C5695(context);
    }

    public C5695(Context context) {
        this.f19428 = context;
        this.f19429 = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15711() {
        this.f19429.cancel(null, 1006);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15709(Notification notification) {
        NotificationManager notificationManager = this.f19429;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            C19807 c19807 = new C19807(this.f19428.getPackageName(), notification);
            synchronized (f19427) {
                if (f19423 == null) {
                    f19423 = new ServiceConnectionC12046(this.f19428.getApplicationContext());
                }
                f19423.m29942(c19807);
            }
            notificationManager.cancel(null, 1006);
            return;
        }
        notificationManager.notify(null, 1006, notification);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15710() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C15574.m37212(this.f19429);
        }
        Context context = this.f19428;
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Set m15708(Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f19425) {
            if (string != null) {
                if (!string.equals(f19424)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet2 = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet2.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    f19426 = hashSet2;
                    f19424 = string;
                }
                hashSet = f19426;
            } else {
                hashSet = f19426;
            }
            throw th;
        }
        return hashSet;
    }
}
