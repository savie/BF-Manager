package com.alipay.sdk.m.y;

import com.alipay.sdk.interior.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import l.C0242;
import l.C3012;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public static Log.ISdkLogCallback a = null;
    public static final String b = "alipaysdk";

    public static void a(Log.ISdkLogCallback iSdkLogCallback) {
        a = iSdkLogCallback;
    }

    public static void b(String str, String str2) {
        a(a(str, str2));
    }

    public static void c(String str, String str2) {
        a(a(str, str2));
    }

    public static void d(String str, String str2) {
        a(a(str, str2));
    }

    public static void e(String str, String str2) {
        a(a(str, str2));
    }

    public static void a(String str) {
        try {
            Log.ISdkLogCallback iSdkLogCallback = a;
            if (iSdkLogCallback != null) {
                if (com.alipay.sdk.m.o.b.i().g(null)) {
                    iSdkLogCallback.onLogLine("[AlipaySDK] " + str);
                } else {
                    iSdkLogCallback.onLogLine("[AlipaySDK] " + new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault()).format(new Date()) + " " + str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void a(String str, String str2, Throwable th) {
        StringBuilder sbM8976 = C3012.m8976(a(str, str2), " ");
        sbM8976.append(b(th));
        a(sbM8976.toString());
    }

    public static void a(Throwable th) {
        if (th == null) {
            return;
        }
        try {
            a(b(th));
        } catch (Throwable unused) {
        }
    }

    public static String a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return !com.alipay.sdk.m.o.b.i().g(null) ? C0242.m1617("[", str, "][", str2, "]") : C0242.m1617("[", str, "][", str2, "]");
    }
}
