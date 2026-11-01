package l;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: PAH8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15198 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Exception f49594;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Boolean f49595;

    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36412() {
        String[] list;
        Boolean bool = f49595;
        if (bool == null) {
            Locale locale = Locale.getDefault();
            boolean z = locale.getLanguage().equals("zh") && locale.getCountry().equals("CN");
            boolean z2 = Build.MANUFACTURER.equalsIgnoreCase("rockchip") && Build.MODEL.toLowerCase().contains("sandbox");
            boolean zContains = Build.FINGERPRINT.toLowerCase().contains("springer");
            if ((z && (z2 || zContains)) || Log.getStackTraceString(f49594).contains("SimidaGuarder")) {
                bool = Boolean.TRUE;
            } else if (!Build.DEVICE.equals("OnePlus6") || (list = new File("/system/app").list()) == null) {
                bool = Boolean.FALSE;
            } else {
                int i = 0;
                for (String str : list) {
                    str.getClass();
                    switch (str) {
                        case "alipay":
                        case "weixin":
                        case "qq":
                        case "AdbIME":
                            i++;
                            break;
                    }
                }
                if (i == 4) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
            }
            f49595 = bool;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36413() {
        f49594 = new Exception();
    }
}
