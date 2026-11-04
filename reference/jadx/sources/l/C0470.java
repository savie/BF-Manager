package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.֡ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6YG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0470 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2299(C9113 c9113, String str, String str2, boolean z) throws C10186 {
        if (str == null || str.isEmpty()) {
            if (!z || str == null) {
                throw m2300("FILE_EMPTY_PATH_NOT_ALLOWED", "Path must not be empty.", str2, str);
            }
            return c9113.f29601;
        }
        m2303(str, str2);
        boolean z2 = str.charAt(0) == '/';
        try {
            String strM2304 = m2304(z2 ? str : C12669.m31438(new StringBuilder(), c9113.f29601, "/", str), str2);
            if (z2 || m2302(strM2304, c9113.f29601)) {
                return strM2304;
            }
            throw m2300("FILE_RELATIVE_PATH_ESCAPES_HOME", "Relative path resolves outside the current Home folder.", str2, str);
        } catch (C10186 e) {
            if (z2 || !"FILE_INVALID_PATH".equals(e.f32601)) {
                throw e;
            }
            throw m2300("FILE_RELATIVE_PATH_ESCAPES_HOME", "Relative path resolves outside the current Home folder.", str2, str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m2304(String str, String str2) throws C10186 {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                m2303(str, str2);
                ArrayDeque<String> arrayDeque = new ArrayDeque();
                for (String str3 : str.split("/", -1)) {
                    if (!str3.isEmpty() && !".".equals(str3)) {
                        if ("..".equals(str3)) {
                            if (arrayDeque.isEmpty()) {
                                throw m2300("FILE_INVALID_PATH", "Path escapes the filesystem root.", str2, str);
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
                return C14584.m35207(sb.length() != 0 ? sb.toString() : "/");
            }
        }
        throw m2300("FILE_PATH_NOT_ABSOLUTE", "Path must be absolute.", str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2302(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if ("/".equals(str2)) {
            return str.startsWith("/");
        }
        return str.startsWith(str2 + "/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2301(String str) {
        String strM35186 = C14584.m35186(str);
        if (strM35186 == null) {
            return false;
        }
        return strM35186.equalsIgnoreCase("Android/data") || strM35186.regionMatches(true, 0, "Android/data/", 0, 13);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m2303(String str, String str2) throws C10186 {
        if (str.indexOf(0) >= 0 || str.indexOf(92) >= 0) {
            throw m2300("FILE_INVALID_PATH", "Path contains an unsupported form.", str2, str);
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
        throw m2300("FILE_URI_UNSUPPORTED", "URI paths are not supported.", str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m2300(String str, String str2, String str3, String str4) {
        return C10186.m26306(str, str2, "fatal", null, JSON.object().add("argument", str3).add(MotionUtils.EASING_TYPE_PATH, str4 == null ? JSON.NULL : JSON.value(str4)));
    }
}
