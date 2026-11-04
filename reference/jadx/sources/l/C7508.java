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

/* JADX INFO: renamed from: l.۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4M5 */
/* JADX INFO: loaded from: classes3.dex */
public class C7508 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Drawable m20563(Context context, int i) {
        return C3779.m12259(context, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ColorStateList m20564(Context context, int i) {
        return C9217.m24393(context.getResources(), i, context.getTheme());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20558(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C14219.m34506(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20559(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return C4525.m14247(context).m14250() ? 0 : -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Executor m20561(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17949.m41887(context);
        }
        return C23455.m52664(new Handler(context.getMainLooper()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20562(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C20933.m47863(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m20560(Context context, Class cls) {
        String strM34508;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C14219.m34507(context, cls);
        }
        if (i >= 23) {
            strM34508 = C14219.m34508(context, cls);
        } else {
            strM34508 = (String) C0050.f901.get(cls);
        }
        if (strM34508 != null) {
            return context.getSystemService(strM34508);
        }
        return null;
    }
}
