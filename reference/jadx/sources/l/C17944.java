package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩳۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7AP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17944 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f57397;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f57398;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 f57399;

    static {
        m41769();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m41774() {
        return f57399;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m41773() {
        return f57398;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41770() {
        return f57397;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m41769() {
        String string = ApplicationC0716.f2992.getString("rwmip", null);
        if (TextUtils.isEmpty(string)) {
            f57399 = C11904.f39934;
        } else {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(string, new String[0]);
            if (!abstractC20745M15313.mo33974()) {
                abstractC20745M15313 = C11904.f39934;
            }
            f57399 = abstractC20745M15313;
        }
        int i = ApplicationC0716.f2992.getInt("rwmp", 8081);
        f57398 = C15945.m37906(i) ? i : 8081;
        String string2 = ApplicationC0716.f2992.getString("rwmpc", "");
        String strTrim = string2 == null ? "" : string2.trim();
        f57397 = m41772(strTrim) ? strTrim : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41771(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            f57399 = C11904.f39934;
        } else {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
            if (!abstractC20745M15313.mo33974()) {
                abstractC20745M15313 = C11904.f39934;
            }
            f57399 = abstractC20745M15313;
        }
        Integer numM37905 = C15945.m37905(str2);
        if (numM37905 != null) {
            f57398 = numM37905.intValue();
        }
        String strTrim = str3 == null ? "" : str3.trim();
        if (m41772(strTrim)) {
            f57397 = strTrim;
        }
        ApplicationC0716.f2992.edit().putString("rwmip", f57399.mo33986()).mo4065(f57398, "rwmp").putString("rwmpc", f57397).apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41772(String str) {
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
