package l;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91T6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14418 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f47255;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String f47256;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f47257;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34686() {
        f47255 = true;
        if (!f47257 && C6696.m18084()) {
            C2462.m7545();
            Iterator it = C2462.f9811.iterator();
            while (it.hasNext()) {
                if (((C13753) it.next()).f45349.equals("/system")) {
                    return;
                }
            }
            try {
                Process processExec = Runtime.getRuntime().exec("magisk -v");
                if (C1459.m5044(processExec, 200L) && processExec.exitValue() == 0 && !C20010.m45297(processExec.getInputStream(), Charset.defaultCharset()).toLowerCase().contains("lite")) {
                    if (C5553.m15313("/sbin/.magisk/mirror/system_root/system", new String[0]).mo33975()) {
                        f47257 = true;
                        f47256 = "/sbin/.magisk/mirror/system_root/system";
                        C19812.m45047(new C23590(0));
                    } else if (C5553.m15313("/sbin/.magisk/mirror/system", new String[0]).mo33975()) {
                        f47257 = true;
                        f47256 = "/sbin/.magisk/mirror/system";
                        C19812.m45047(new C23590(0));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34685(String str) {
        if (!f47255) {
            m34686();
        }
        if (!f47257) {
            return str;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.equals("/system") && !lowerCase.startsWith("/system/")) {
            return str;
        }
        return f47256 + str.substring(7);
    }
}
