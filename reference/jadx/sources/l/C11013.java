package l;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.alipay.sdk.m.u0.c;

/* JADX INFO: renamed from: l.ۤܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OBMG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11013 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f34776;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile C11013 f34777;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Handler f34778;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Context f34779;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String f34780;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static HandlerThread f34781;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Object f34782 = new Object();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C22948 f34783;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile C2697 f34784;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f34785;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11013 m27873(Context context) {
        if (f34777 == null) {
            synchronized (C11013.class) {
                f34779 = context.getApplicationContext();
                f34777 = new C11013();
            }
        }
        if (f34784 == null) {
            synchronized (C11013.class) {
                f34779 = context.getApplicationContext();
                HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
                f34781 = handlerThread;
                handlerThread.start();
                f34778 = new HandlerC22202(f34781.getLooper());
                f34784 = new C2697(f34779);
                m27877();
            }
        }
        return f34777;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27876() {
        return f34785;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m27879() {
        if (!f34785) {
            return null;
        }
        String str = f34780;
        if (str != null) {
            return str;
        }
        m27874(0);
        if (f34783 == null) {
            Context context = f34779;
            f34783 = new C22948(f34777, 0);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f34783);
        }
        return f34780;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27874(int i) {
        Object obj = f34782;
        synchronized (obj) {
            Message messageObtainMessage = f34778.obtainMessage();
            messageObtainMessage.what = 11;
            Bundle bundle = new Bundle();
            bundle.putInt("type", i);
            if (i == 1 || i == 2) {
                bundle.putString(c.d, null);
            }
            messageObtainMessage.setData(bundle);
            f34778.sendMessage(messageObtainMessage);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                obj.wait(2000L);
            } catch (InterruptedException unused) {
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis < 2000) {
                if (i == 0) {
                    f34780 = f34776;
                    f34776 = null;
                } else if (i == 1) {
                    if (f34776 != null) {
                        f34776 = null;
                    }
                } else {
                    if (i != 2) {
                        if (i != 4) {
                        }
                    } else if (f34776 != null) {
                        f34776 = null;
                    }
                    f34776 = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m27877() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, c.c, "unknown");
        } catch (Throwable unused) {
            str = "0";
        }
        f34785 = "1".equals(str);
    }
}
