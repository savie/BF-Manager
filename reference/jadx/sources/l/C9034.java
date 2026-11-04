package l;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.material.internal.ManufacturerUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: l.ۡ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 253O */
/* JADX INFO: loaded from: classes3.dex */
public final class C9034 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String f29396 = Build.MANUFACTURER.toLowerCase();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static double m24089() throws Throwable {
        try {
            String strM24087 = m24087("ro.build.version.emui");
            return Double.parseDouble(strM24087.substring(strM24087.indexOf("_") + 1));
        } catch (Exception unused) {
            return 4.0d;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24087(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(str)).getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return line;
            } catch (IOException unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m24095() {
        return !TextUtils.isEmpty(m24087("ro.miui.ui.version.name"));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m24090() throws Throwable {
        String strM24087 = m24087("ro.build.display.id");
        if (TextUtils.isEmpty(strM24087)) {
            return false;
        }
        return strM24087.contains("flyme") || strM24087.toLowerCase().contains("flyme");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m24094() {
        return f29396.contains("huawei");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24088() {
        String str = f29396;
        return str.contains("qiku") || str.contains("360");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m24093() {
        return f29396.contains("oppo");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m24091() {
        return f29396.contains("vivo");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m24092() {
        return f29396.contains(ManufacturerUtils.SAMSUNG);
    }
}
