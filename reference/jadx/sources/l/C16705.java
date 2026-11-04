package l;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91T6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16705 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f53966;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String f53967;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f53968;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39472() {
        f53966 = true;
        if (!f53968 && C7756.m21096()) {
            C6265.m17916();
            Iterator it = C6265.f21252.iterator();
            while (it.hasNext()) {
                if (((C20435) it.next()).f65453.equals("/system")) {
                    return;
                }
            }
            try {
                Process processExec = Runtime.getRuntime().exec("magisk -v");
                if (C13069.m32548(processExec, 200L) && processExec.exitValue() == 0 && !C5125.m15490(processExec.getInputStream(), Charset.defaultCharset()).toLowerCase().contains("lite")) {
                    if (C14584.m35193("/sbin/.magisk/mirror/system_root/system", new String[0]).mo2934()) {
                        f53968 = true;
                        f53967 = "/sbin/.magisk/mirror/system_root/system";
                        C4013.m12977(new C7620(5));
                    } else if (C14584.m35193("/sbin/.magisk/mirror/system", new String[0]).mo2934()) {
                        f53968 = true;
                        f53967 = "/sbin/.magisk/mirror/system";
                        C4013.m12977(new C7620(5));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39471(String str) {
        if (!f53966) {
            m39472();
        }
        if (!f53968) {
            return str;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.equals("/system") && !lowerCase.startsWith("/system/")) {
            return str;
        }
        return f53967 + str.substring(7);
    }
}
