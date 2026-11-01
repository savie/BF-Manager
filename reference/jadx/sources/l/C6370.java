package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۛ᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: J6YG */
/* JADX INFO: loaded from: classes2.dex */
public final class C6370 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17474(C3070 c3070, String str, String str2, boolean z) throws C12731 {
        if (str == null || str.isEmpty()) {
            if (!z || str == null) {
                throw m17475("FILE_EMPTY_PATH_NOT_ALLOWED", "Path must not be empty.", str2, str);
            }
            return c3070.f11564;
        }
        m17478(str, str2);
        boolean z2 = str.charAt(0) == '/';
        try {
            String strM17479 = m17479(z2 ? str : C1694.m5622(new StringBuilder(), c3070.f11564, "/", str), str2);
            if (z2 || m17477(strM17479, c3070.f11564)) {
                return strM17479;
            }
            throw m17475("FILE_RELATIVE_PATH_ESCAPES_HOME", "Relative path resolves outside the current Home folder.", str2, str);
        } catch (C12731 e) {
            if (z2 || !"FILE_INVALID_PATH".equals(e.f42472)) {
                throw e;
            }
            throw m17475("FILE_RELATIVE_PATH_ESCAPES_HOME", "Relative path resolves outside the current Home folder.", str2, str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m17479(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                m17478(str, str2);
                ArrayDeque<String> arrayDeque = new ArrayDeque();
                for (String str3 : str.split("/", -1)) {
                    if (!str3.isEmpty() && !".".equals(str3)) {
                        if ("..".equals(str3)) {
                            if (arrayDeque.isEmpty()) {
                                throw m17475("FILE_INVALID_PATH", "Path escapes the filesystem root.", str2, str);
                            }
                            arrayDeque.removeLast();
                        } else {
                            arrayDeque.addLast(str3);
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (String str4 : arrayDeque) {
                    sb.append('/');
                    sb.append(str4);
                }
                return C5553.m15323(sb.length() != 0 ? sb.toString() : "/");
            }
        }
        throw m17475("FILE_PATH_NOT_ABSOLUTE", "Path must be absolute.", str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17477(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if ("/".equals(str2)) {
            return str.startsWith("/");
        }
        return str.startsWith(str2 + "/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17476(String str) {
        String strM15306 = C5553.m15306(str);
        if (strM15306 == null) {
            return false;
        }
        return strM15306.equalsIgnoreCase("Android/data") || strM15306.regionMatches(true, 0, "Android/data/", 0, 13);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m17478(String str, String str2) throws C12731 {
        if (str.indexOf(0) >= 0 || str.indexOf(92) >= 0) {
            throw m17475("FILE_INVALID_PATH", "Path contains an unsupported form.", str2, str);
        }
        int iIndexOf = str.indexOf(58);
        if (iIndexOf <= 0) {
            return;
        }
        for (int i = 0; i < iIndexOf; i++) {
            char cCharAt = str.charAt(i);
            if (i == 0) {
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    return;
                }
            } else if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '+' && cCharAt != '-' && cCharAt != '.'))) {
                return;
            }
        }
        throw m17475("FILE_URI_UNSUPPORTED", "URI paths are not supported.", str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m17475(String str, String str2, String str3, String str4) {
        return C12731.m31631(str, str2, "fatal", null, JSON.object().add("argument", str3).add(MotionUtils.EASING_TYPE_PATH, str4 == null ? JSON.NULL : JSON.value(str4)));
    }
}
