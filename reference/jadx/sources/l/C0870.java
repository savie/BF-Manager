package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.֨ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7AP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0870 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f3253;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f3254;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 f3255;

    static {
        m3557();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m3556() {
        return f3255;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m3555() {
        return f3254;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3552() {
        return f3253;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m3557() {
        String string = ApplicationC17729.f58258.getString("rwmip", null);
        if (TextUtils.isEmpty(string)) {
            f3255 = C6382.f21566;
        } else {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(string, new String[0]);
            if (!abstractC22044M35193.mo4281()) {
                abstractC22044M35193 = C6382.f21566;
            }
            f3255 = abstractC22044M35193;
        }
        int i = ApplicationC17729.f58258.getInt("rwmp", 8081);
        f3254 = C18856.m43746(i) ? i : 8081;
        String string2 = ApplicationC17729.f58258.getString("rwmpc", "");
        String strTrim = string2 == null ? "" : string2.trim();
        f3253 = m3554(strTrim) ? strTrim : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3553(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            f3255 = C6382.f21566;
        } else {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
            if (!abstractC22044M35193.mo4281()) {
                abstractC22044M35193 = C6382.f21566;
            }
            f3255 = abstractC22044M35193;
        }
        Integer numM43756 = C18856.m43756(str2);
        if (numM43756 != null) {
            f3254 = numM43756.intValue();
        }
        String strTrim = str3 == null ? "" : str3.trim();
        if (m3554(strTrim)) {
            f3253 = strTrim;
        }
        ApplicationC17729.f58258.edit().putString("rwmip", f3255.mo4294()).mo3486(f3254, "rwmp").putString("rwmpc", f3253).apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3554(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            return true;
        }
        if (strTrim.length() == 6) {
            for (int i = 0; i < strTrim.length(); i++) {
                char cCharAt = strTrim.charAt(i);
                if (cCharAt >= '0' && cCharAt <= '9') {
                }
            }
            return true;
        }
        return false;
    }
}
