package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4M5 */
/* JADX INFO: loaded from: classes3.dex */
public class C10405 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m26304(Context context, int i) {
        return C18165.m42287(context, i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m26305(Context context, int i) {
        return C16631.m39102(context.getResources(), i, context.getTheme());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m26299(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C18871.m43519(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m26300(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return C5695.m15707(context).m15710() ? 0 : -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Executor m26302(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C19577.m44686(context);
        }
        return C22795.m50452(new Handler(context.getMainLooper()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26303(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C8288.m21706(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m26301(Context context, Class cls) {
        String strM43521;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C18871.m43520(context, cls);
        }
        if (i >= 23) {
            strM43521 = C18871.m43521(context, cls);
        } else {
            strM43521 = (String) C8994.f30767.get(cls);
        }
        if (strM43521 != null) {
            return context.getSystemService(strM43521);
        }
        return null;
    }
}
