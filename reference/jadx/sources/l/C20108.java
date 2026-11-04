package l;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩴ᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20108 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f64607 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C16716 f64608 = new C16716(new C11157());

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Handler f64609 = new HandlerC23092(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m46236(String str) {
        if (str.startsWith("/system/") || str.startsWith("/data/")) {
            return false;
        }
        return C14584.m35214(str) || C17743.m41554(str) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46232(String str) {
        if (str == null) {
            return;
        }
        synchronized (C20108.class) {
            C16716 c16716 = f64608;
            c16716.remove(str);
            c16716.add(str);
            Handler handler = f64609;
            if (!handler.hasMessages(0)) {
                handler.sendEmptyMessageDelayed(0, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m46235(String str) {
        String strM20187 = AbstractC7364.m20187(str);
        while (strM20187.length() > 1 && strM20187.endsWith("/")) {
            strM20187 = C1402.m5124(1, 0, strM20187);
        }
        return strM20187;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46233(String str, boolean z) {
        String strM46235 = m46235(str);
        if ((z && !m46238(strM46235)) || !m46236(strM46235)) {
            strM46235 = null;
        }
        m46232(strM46235);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46230(String str, EnumC22346 enumC22346, boolean z) {
        String strM46235 = m46235(str);
        if (enumC22346 != EnumC22346.NONE && ((enumC22346 != EnumC22346.EXACT || !z || m46238(strM46235)) && m46236(strM46235))) {
            if (enumC22346 != EnumC22346.TREE) {
                return strM46235;
            }
            if (!m46235(strM46235).equalsIgnoreCase(m46235("/sdcard"))) {
                if (!m46235(strM46235).equalsIgnoreCase(m46235(m46235(C6382.f21566.mo4294())))) {
                    C16997 c16997M41554 = C17743.m41554(strM46235);
                    if (c16997M41554 == null) {
                        return strM46235;
                    }
                    if (!m46235(strM46235).equalsIgnoreCase(m46235(m46235(c16997M41554.f55538.getPath())))) {
                        return strM46235;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m46238(String str) {
        if (str.toLowerCase(Locale.ROOT).contains("download")) {
            return true;
        }
        String strM23965 = C8969.m23965(str);
        if (strM23965 != null) {
            return strM23965.startsWith("image") || strM23965.startsWith("video") || strM23965.startsWith("audio");
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46234(AbstractC22044 abstractC22044) {
        m46233(abstractC22044.mo4294(), true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m46239(String str) {
        m46232(m46230(str, EnumC22346.EXACT, true));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m46237(String str) {
        m46232(m46230(str, EnumC22346.TREE, false));
    }
}
