package l;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩶۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21338 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class f67985;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Method f67986;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean f67987;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Class f67988;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Method f67989;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48564(String str, int i, boolean z, boolean z2, Runnable runnable) {
        String string = "\n";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < str.length()) {
            if ((i2 & 1023) == 0) {
                runnable.run();
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\r' || cCharAt == '\n') {
                int i5 = i2 + 1;
                if (i5 >= str.length() || ((cCharAt != '\r' || str.charAt(i5) != '\n') && (!z || cCharAt != '\n' || str.charAt(i5) != '\r'))) {
                    i5 = i2;
                }
                if (i3 == 0) {
                    string = str.substring(i2, i5 + 1);
                }
                i3++;
                int i6 = i5;
                i4 = i5 + 1;
                i2 = i6;
            }
            i2++;
        }
        if (i3 == 0) {
            return z2 ? str : "";
        }
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(i3, i);
        if (iMin < 0) {
            throw new IllegalArgumentException(C13645.m33382(iMin, "count is negative: "));
        }
        int length = string.length();
        if (iMin == 0 || length == 0) {
            string = "";
        } else if (iMin != 1) {
            if (string.length() > Integer.MAX_VALUE / iMin) {
                throw new OutOfMemoryError("Repeating " + string.length() + " bytes String " + iMin + " times will produce a String exceeding maximum size.");
            }
            StringBuilder sb2 = new StringBuilder(length * iMin);
            for (int i7 = 0; i7 < iMin; i7++) {
                sb2.append(string);
            }
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(z2 ? str.substring(i4) : "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48567(int i) {
        return Character.isWhitespace(i) || i == 65279;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48563(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m48569(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48566(Context context, C13878 c13878) {
        try {
            c13878.getClass();
            if (C24988.m55831(context, "101492915").m55838("Common_ta_enable")) {
                f67989.invoke(f67985, Boolean.TRUE);
            } else {
                f67989.invoke(f67985, Boolean.FALSE);
            }
        } catch (Exception e) {
            C21587.m49116("OpenConfig", "checkStatStatus exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m48571(Context context, C13878 c13878) {
        try {
            f67985 = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f67988 = cls;
            f67986 = cls.getMethod("reportQQ", Context.class, String.class);
            f67988.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class cls2 = f67988;
            Class<?> cls3 = Integer.TYPE;
            cls2.getMethod("commitEvents", Context.class, cls3);
            Class cls4 = f67985;
            Class<?> cls5 = Boolean.TYPE;
            f67989 = cls4.getMethod("setEnableStatService", cls5);
            m48566(context, c13878);
            f67985.getMethod("setAutoExceptionCaught", cls5).invoke(f67985, Boolean.FALSE);
            f67985.getMethod("setEnableSmartReporting", cls5).invoke(f67985, Boolean.TRUE);
            f67985.getMethod("setSendPeriodMinutes", cls3).invoke(f67985, 1440);
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            f67985.getMethod("setStatSendStrategy", cls6).invoke(f67985, cls6.getField("PERIOD").get(null));
            f67988.getMethod("startStatService", Context.class, String.class, String.class).invoke(f67988, context, "Aqc101492915", Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            f67987 = true;
        } catch (Exception e) {
            C21587.m49116("OpenConfig", "start4QQConnect exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48565(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        bArr[i + 2] = (byte) (i2 >>> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m48570(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 3] = (byte) (i2 >>> 24);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m48568(Context context, C13878 c13878) {
        if (!TextUtils.isEmpty(c13878.m33823())) {
            C17111 c17111M40275 = C17111.m40275();
            String strM33823 = c13878.m33823();
            c17111M40275.getClass();
            C17111.m40277(strM33823, "101492915", "11", "0");
        }
        if (f67987) {
            m48566(context, c13878);
            if (c13878.m33823() != null) {
                try {
                    f67986.invoke(f67988, context, c13878.m33823());
                } catch (Exception e) {
                    C21587.m49116("OpenConfig", "reportQQ exception: " + e.toString());
                }
            }
        }
    }
}
