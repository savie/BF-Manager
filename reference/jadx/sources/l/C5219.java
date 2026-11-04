package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.ۙ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6NV */
/* JADX INFO: loaded from: classes2.dex */
public final class C5219 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15704(char c) {
        return c == '\n' || c == '\r' || c == 133 || c == 8232 || c == 8233;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15703(String str) {
        int i;
        int iM15708;
        int iM15709;
        int iM157010;
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
            if (i2 < 0 || m15704(str.charAt(i2))) {
                int iM157011 = m15708(iIndexOf + 2, str);
                if (m15705(iM157011, str, "require") && (iM15708 = m15708((i = iM157011 + 7), str)) != i && m15705(iM15708, str, "mt") && (iM15709 = m15708(iM15708 + 2, str)) != str.length() && str.charAt(iM15709) == '>') {
                    int i3 = iM15709 + 1;
                    boolean z = i3 < str.length() && str.charAt(i3) == '=';
                    if (z) {
                        i3 = iM15709 + 2;
                    }
                    int iM157012 = m15708(i3, str);
                    int iM15711 = m15711(iM157012, str);
                    if (iM15711 >= 0 && ((iM157010 = m15708(iM15711, str)) >= str.length() || m15704(str.charAt(iM157010)))) {
                        String strSubstring = str.substring(iM157012, iM15711);
                        boolean z2 = strSubstring.indexOf(46) < 0;
                        int iM157013 = z2 ? 26110365 : m15709("2.26.11");
                        int i4 = z2 ? Integer.parseInt(strSubstring) : m15709(strSubstring);
                        if (z) {
                            if (iM157013 >= i4) {
                                return;
                            }
                        } else if (iM157013 > i4) {
                            return;
                        }
                        throw new C7105(C21576.m49088(R.string.MT_Protector) + "\n(Require " + (z2 ? "VersionCode" : "VersionName") + " " + (z ? ">=" : ">") + " " + strSubstring + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                }
            }
            iIndexOf = str.indexOf("//", iIndexOf + 2);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m15711(int i, String str) {
        int i2;
        int iM15702;
        int iM15703;
        int i3;
        int iM15704;
        int iM15705;
        int iM15706 = m15702(i, str);
        int i4 = iM15706 - i;
        if (i4 == 8) {
            return iM15706;
        }
        if (i4 != 1 || iM15706 == str.length() || str.charAt(iM15706) != '.' || (iM15703 = (iM15702 = m15702((i2 = iM15706 + 1), str)) - i2) < 1 || iM15703 > 3 || iM15702 == str.length() || str.charAt(iM15702) != '.' || (iM15705 = (iM15704 = m15702((i3 = iM15702 + 1), str)) - i3) < 1 || iM15705 > 3) {
            return -1;
        }
        return iM15704;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15702(int i, String str) {
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m15708(int i, String str) {
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
    public static boolean m15705(int i, String str, String str2) {
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m15707(int i, String str) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || (cCharAt >= '\t' && cCharAt <= '\r'))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m15710(String str, String str2) {
        int iIndexOf = str2.indexOf(35);
        while (iIndexOf >= 0) {
            int i = iIndexOf - 1;
            while (i >= 0) {
                char cCharAt = str2.charAt(i);
                if (!m15704(cCharAt)) {
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != 11 && cCharAt != '\f') {
                        break;
                    }
                    i--;
                }
                return new C20179(str, new C13921(1)).m46427(str2);
            }
            if (i >= 0) {
                iIndexOf = str2.indexOf(35, iIndexOf + 1);
            } else {
                return new C20179(str, new C13921(1)).m46427(str2);
            }
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m15706(String str, String str2) {
        boolean z = str2.indexOf(46) < 0;
        int iM15709 = z ? 26110365 : m15709("2.26.11");
        int i = z ? Integer.parseInt(str2) : m15709(str2);
        str.getClass();
        switch (str) {
            case "<":
                if (iM15709 < i) {
                    return true;
                }
                return false;
            case ">":
                if (iM15709 > i) {
                    return true;
                }
                return false;
            case "!=":
                if (iM15709 != i) {
                    return true;
                }
                return false;
            case "<=":
                if (iM15709 <= i) {
                    return true;
                }
                return false;
            case "==":
                if (iM15709 == i) {
                    return true;
                }
                return false;
            case ">=":
                if (iM15709 >= i) {
                    return true;
                }
                return false;
            default:
                throw new RuntimeException("Unknown operator: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m15709(String str) {
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
