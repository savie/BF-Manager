package l;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22252 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72742 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C3446 f72743 = new C3446(new C2495());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Handler f72744 = new HandlerC5318(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m49413(String str) {
        if (str.startsWith("/system/") || str.startsWith("/data/")) {
            return false;
        }
        return C5553.m15304(str) || C8272.m21690(str) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49407(String str) {
        if (str == null) {
            return;
        }
        synchronized (C22252.class) {
            C3446 c3446 = f72743;
            c3446.remove(str);
            c3446.add(str);
            Handler handler = f72744;
            if (!handler.hasMessages(0)) {
                handler.sendEmptyMessageDelayed(0, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m49411(String str) {
        String strM28608 = AbstractC11462.m28608(str);
        while (strM28608.length() > 1 && strM28608.endsWith("/")) {
            strM28608 = C20630.m46498(1, 0, strM28608);
        }
        return strM28608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49408(String str, boolean z) {
        String strM49411 = m49411(str);
        if ((z && !m49412(strM49411)) || !m49413(strM49411)) {
            strM49411 = null;
        }
        m49407(strM49411);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49405(String str, EnumC11669 enumC11669, boolean z) {
        String strM49411 = m49411(str);
        if (enumC11669 != EnumC11669.NONE && ((enumC11669 != EnumC11669.EXACT || !z || m49412(strM49411)) && m49413(strM49411))) {
            if (enumC11669 != EnumC11669.TREE) {
                return strM49411;
            }
            if (!m49411(strM49411).equalsIgnoreCase(m49411("/sdcard"))) {
                if (!m49411(strM49411).equalsIgnoreCase(m49411(m49411(C11904.f39934.mo33986())))) {
                    C18149 c18149M21690 = C8272.m21690(strM49411);
                    if (c18149M21690 == null) {
                        return strM49411;
                    }
                    if (!m49411(strM49411).equalsIgnoreCase(m49411(m49411(c18149M21690.f58039.getPath())))) {
                        return strM49411;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m49412(String str) {
        if (str.toLowerCase(Locale.ROOT).contains("download")) {
            return true;
        }
        String strM48172 = C21512.m48172(str);
        if (strM48172 != null) {
            return strM48172.startsWith("image") || strM48172.startsWith("video") || strM48172.startsWith("audio");
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49409(AbstractC20745 abstractC20745) {
        m49408(abstractC20745.mo33986(), true);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m49404(String str) {
        m49407(m49405(str, EnumC11669.EXACT, true));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m49410(String str) {
        m49407(m49405(str, EnumC11669.TREE, false));
    }
}
