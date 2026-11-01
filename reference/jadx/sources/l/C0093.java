package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P78M */
/* JADX INFO: loaded from: classes2.dex */
public final class C0093 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f1010;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f1011;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f1012;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16322 f1013 = new C16322(0, 0, 0, 0, new ArrayList(), new ArrayList());

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f1014;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f1015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15617 f1016;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f1017;

    public C0093(int i, int i2, String str, String str2, String str3, String str4) {
        this.f1011 = str;
        this.f1017 = str2;
        this.f1010 = str3;
        this.f1012 = str4;
        this.f1015 = i;
        this.f1014 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0093 m1051(int i, String str) {
        String strTrim = C12089.m30082(str).trim().substring(6).trim();
        int iIndexOf = strTrim.indexOf(61);
        if (iIndexOf >= 0) {
            strTrim = strTrim.substring(0, iIndexOf).trim();
        }
        int iM1049 = m1049(strTrim, ':');
        if (iM1049 < 0) {
            return m1052(i, "field", strTrim);
        }
        C19850 c19850M1054 = m1054(iM1049, strTrim);
        return new C0093(i, i, "field", c19850M1054.f63670, C1694.m5622(new StringBuilder(), c19850M1054.f63670, ":", m1050(strTrim.substring(iM1049 + 1).trim())), strTrim.substring(0, c19850M1054.f63671).trim());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C0093 m1053(int i, String str) {
        String strTrim = C12089.m30082(str).trim().substring(7).trim();
        int iM1049 = m1049(strTrim, '(');
        if (iM1049 < 0) {
            return m1052(i, e.s, strTrim);
        }
        C19850 c19850M1054 = m1054(iM1049, strTrim);
        return new C0093(i, i, e.s, c19850M1054.f63670, C22697.m50267(new StringBuilder(), c19850M1054.f63670, m1050(strTrim.substring(iM1049).trim())), strTrim.substring(0, c19850M1054.f63671).trim());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m1049(String str, char c) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '`') {
                z = !z;
            } else if (!z && cCharAt == c) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1050(String str) {
        StringBuilder sb = null;
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (z || !Character.isWhitespace(cCharAt)) {
                if (sb != null) {
                    sb.append(cCharAt);
                }
                if (cCharAt == 'L') {
                    z = true;
                } else if (z && cCharAt == ';') {
                    z = false;
                }
            } else if (sb == null) {
                sb = new StringBuilder(str.length());
                sb.append((CharSequence) str, 0, i);
            }
        }
        return sb == null ? str : sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0093 m1052(int i, String str, String str2) {
        int iIndexOf = str2.indexOf(str.equals("field") ? 58 : 40);
        return new C0093(i, i, str, iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf), str2, "");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C19850 m1054(int i, String str) {
        int iLastIndexOf;
        while (i > 0 && Character.isWhitespace(str.charAt(i - 1))) {
            i--;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (str.charAt(i2) == '`' && (iLastIndexOf = str.lastIndexOf(96, i - 2)) >= 0) {
                return new C19850(str.substring(iLastIndexOf + 1, i2), iLastIndexOf);
            }
        }
        int i3 = i;
        while (i3 > 0 && !Character.isWhitespace(str.charAt(i3 - 1))) {
            i3--;
        }
        return new C19850(str.substring(i3, i), i3);
    }
}
