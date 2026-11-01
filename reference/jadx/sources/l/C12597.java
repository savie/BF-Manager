package l;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.material.internal.ManufacturerUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: l.۫ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 253O */
/* JADX INFO: loaded from: classes3.dex */
public final class C12597 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String f42104 = Build.MANUFACTURER.toLowerCase();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static double m31374() throws Throwable {
        try {
            String strM31370 = m31370("ro.build.version.emui");
            return Double.parseDouble(strM31370.substring(strM31370.indexOf("_") + 1));
        } catch (Exception unused) {
            return 4.0d;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31370(String str) throws Throwable {
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m31369() {
        return !TextUtils.isEmpty(m31370("ro.miui.ui.version.name"));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m31373() throws Throwable {
        String strM31370 = m31370("ro.build.display.id");
        if (TextUtils.isEmpty(strM31370)) {
            return false;
        }
        return strM31370.contains("flyme") || strM31370.toLowerCase().contains("flyme");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m31375() {
        return f42104.contains("huawei");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31371() {
        String str = f42104;
        return str.contains("qiku") || str.contains("360");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m31372() {
        return f42104.contains("oppo");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m31368() {
        return f42104.contains("vivo");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m31376() {
        return f42104.contains(ManufacturerUtils.SAMSUNG);
    }
}
