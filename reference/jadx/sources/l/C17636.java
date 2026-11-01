package l;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.alipay.sdk.m.u0.c;

/* JADX INFO: renamed from: l.ܿ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBMG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17636 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static HandlerThread f56044;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f56045;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static String f56046;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile C17636 f56047;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C6347 f56048;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String f56049;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Context f56050;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static Handler f56051;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static volatile C1271 f56052;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Object f56053 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17636 m41009(Context context) {
        if (f56047 == null) {
            synchronized (C17636.class) {
                f56050 = context.getApplicationContext();
                f56047 = new C17636();
            }
        }
        if (f56052 == null) {
            synchronized (C17636.class) {
                f56050 = context.getApplicationContext();
                HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
                f56044 = handlerThread;
                handlerThread.start();
                f56051 = new HandlerC12698(f56044.getLooper());
                f56052 = new C1271(f56050);
                m41014();
            }
        }
        return f56047;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41012() {
        return f56045;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m41015() {
        if (!f56045) {
            return null;
        }
        String str = f56049;
        if (str != null) {
            return str;
        }
        m41010(0);
        if (f56048 == null) {
            Context context = f56050;
            f56048 = new C6347(f56047, 0);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f56048);
        }
        return f56049;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41010(int i) {
        Object obj = f56053;
        synchronized (obj) {
            Message messageObtainMessage = f56051.obtainMessage();
            messageObtainMessage.what = 11;
            Bundle bundle = new Bundle();
            bundle.putInt("type", i);
            if (i == 1 || i == 2) {
                bundle.putString(c.d, null);
            }
            messageObtainMessage.setData(bundle);
            f56051.sendMessage(messageObtainMessage);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                obj.wait(2000L);
            } catch (InterruptedException unused) {
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis < 2000) {
                if (i == 0) {
                    f56049 = f56046;
                    f56046 = null;
                } else if (i == 1) {
                    if (f56046 != null) {
                        f56046 = null;
                    }
                } else {
                    if (i != 2) {
                        if (i != 4) {
                        }
                    } else if (f56046 != null) {
                        f56046 = null;
                    }
                    f56046 = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m41014() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, c.c, "unknown");
        } catch (Throwable unused) {
            str = "0";
        }
        f56045 = "1".equals(str);
    }
}
