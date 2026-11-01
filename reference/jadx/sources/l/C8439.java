package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.۠᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6NV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8439 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22094(char c) {
        return c == '\n' || c == '\r' || c == 133 || c == 8232 || c == 8233;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22093(String str) {
        int i;
        int iM22098;
        int iM22099;
        int iM220910;
        int iIndexOf = str.indexOf("//");
        while (iIndexOf >= 0) {
            int i2 = iIndexOf - 1;
            while (i2 >= 0) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != ' ' && cCharAt != '\t') {
                    break;
                } else {
                    i2--;
                }
            }
            if (i2 < 0 || m22094(str.charAt(i2))) {
                int iM220911 = m22098(iIndexOf + 2, str);
                if (m22095(iM220911, str, "require") && (iM22098 = m22098((i = iM220911 + 7), str)) != i && m22095(iM22098, str, "mt") && (iM22099 = m22098(iM22098 + 2, str)) != str.length() && str.charAt(iM22099) == '>') {
                    int i3 = iM22099 + 1;
                    boolean z = i3 < str.length() && str.charAt(i3) == '=';
                    if (z) {
                        i3 = iM22099 + 2;
                    }
                    int iM220912 = m22098(i3, str);
                    int iM22091 = m22091(iM220912, str);
                    if (iM22091 >= 0 && ((iM220910 = m22098(iM22091, str)) >= str.length() || m22094(str.charAt(iM220910)))) {
                        String strSubstring = str.substring(iM220912, iM22091);
                        boolean z2 = strSubstring.indexOf(46) < 0;
                        int iM220913 = z2 ? 26101061 : m22099("2.26.10");
                        int i4 = z2 ? Integer.parseInt(strSubstring) : m22099(strSubstring);
                        if (z) {
                            if (iM220913 >= i4) {
                                return;
                            }
                        } else if (iM220913 > i4) {
                            return;
                        }
                        throw new C22737(C16737.m39288(R.string.MT_Protector) + "\n(Require " + (z2 ? "VersionCode" : "VersionName") + " " + (z ? ">=" : ">") + " " + strSubstring + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                }
            }
            iIndexOf = str.indexOf("//", iIndexOf + 2);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m22091(int i, String str) {
        int i2;
        int iM22092;
        int iM22093;
        int i3;
        int iM22094;
        int iM22095;
        int iM22096 = m22092(i, str);
        int i4 = iM22096 - i;
        if (i4 == 8) {
            return iM22096;
        }
        if (i4 != 1 || iM22096 == str.length() || str.charAt(iM22096) != '.' || (iM22093 = (iM22092 = m22092((i2 = iM22096 + 1), str)) - i2) < 1 || iM22093 > 3 || iM22092 == str.length() || str.charAt(iM22092) != '.' || (iM22095 = (iM22094 = m22092((i3 = iM22092 + 1), str)) - i3) < 1 || iM22095 > 3) {
            return -1;
        }
        return iM22094;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22092(int i, String str) {
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m22098(int i, String str) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22095(int i, String str, String str2) {
        if (str2.length() + i <= str.length()) {
            for (int i2 = 0; i2 < str2.length(); i2++) {
                char cCharAt = str.charAt(i + i2);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                if (cCharAt == str2.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m22097(int i, String str) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || (cCharAt >= '\t' && cCharAt <= '\r'))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m22100(String str, String str2) {
        int iIndexOf = str2.indexOf(35);
        while (iIndexOf >= 0) {
            int i = iIndexOf - 1;
            while (i >= 0) {
                char cCharAt = str2.charAt(i);
                if (!m22094(cCharAt)) {
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != 11 && cCharAt != '\f') {
                        break;
                    }
                    i--;
                }
                return new C19209(str, new C0219()).m44128(str2);
            }
            if (i >= 0) {
                iIndexOf = str2.indexOf(35, iIndexOf + 1);
            } else {
                return new C19209(str, new C0219()).m44128(str2);
            }
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m22096(String str, String str2) {
        boolean z = str2.indexOf(46) < 0;
        int iM22099 = z ? 26101061 : m22099("2.26.10");
        int i = z ? Integer.parseInt(str2) : m22099(str2);
        str.getClass();
        switch (str) {
            case "<":
                if (iM22099 < i) {
                    return true;
                }
                return false;
            case ">":
                if (iM22099 > i) {
                    return true;
                }
                return false;
            case "!=":
                if (iM22099 != i) {
                    return true;
                }
                return false;
            case "<=":
                if (iM22099 <= i) {
                    return true;
                }
                return false;
            case "==":
                if (iM22099 == i) {
                    return true;
                }
                return false;
            case ">=":
                if (iM22099 >= i) {
                    return true;
                }
                return false;
            default:
                throw new RuntimeException("Unknown operator: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m22099(String str) {
        int iIndexOf = str.indexOf(46);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(46, i);
        int iIndexOf3 = str.indexOf(45);
        if (iIndexOf3 < 0) {
            iIndexOf3 = str.length();
        }
        return Integer.parseInt(str.substring(iIndexOf2 + 1, iIndexOf3)) + (Integer.parseInt(str.substring(i, iIndexOf2)) * 1000) + (Integer.parseInt(str.substring(0, iIndexOf)) * BasicLabelFormatter.MILLION);
    }
}
