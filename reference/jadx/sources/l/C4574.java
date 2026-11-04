package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P78M */
/* JADX INFO: loaded from: classes2.dex */
public final class C4574 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f16277;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f16278;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f16279;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f16280;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f16281;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C21728 f16282 = new C21728(0, 0, 0, 0, new ArrayList(), new ArrayList());

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C6921 f16283;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f16284;

    public C4574(int i, int i2, String str, String str2, String str3, String str4) {
        this.f16284 = str;
        this.f16281 = str2;
        this.f16280 = str3;
        this.f16277 = str4;
        this.f16278 = i;
        this.f16279 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4574 m14369(int i, String str) {
        String strTrim = C22474.m50675(str).trim().substring(6).trim();
        int iIndexOf = strTrim.indexOf(61);
        if (iIndexOf >= 0) {
            strTrim = strTrim.substring(0, iIndexOf).trim();
        }
        int iM14367 = m14367(strTrim, ':');
        if (iM14367 < 0) {
            return m14370(i, "field", strTrim);
        }
        C13632 c13632M14372 = m14372(iM14367, strTrim);
        return new C4574(i, i, "field", c13632M14372.f43292, C12669.m31438(new StringBuilder(), c13632M14372.f43292, ":", m14368(strTrim.substring(iM14367 + 1).trim())), strTrim.substring(0, c13632M14372.f43293).trim());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C4574 m14371(int i, String str) {
        String strTrim = C22474.m50675(str).trim().substring(7).trim();
        int iM14367 = m14367(strTrim, '(');
        if (iM14367 < 0) {
            return m14370(i, e.s, strTrim);
        }
        C13632 c13632M14372 = m14372(iM14367, strTrim);
        return new C4574(i, i, e.s, c13632M14372.f43292, C8947.m23910(new StringBuilder(), c13632M14372.f43292, m14368(strTrim.substring(iM14367).trim())), strTrim.substring(0, c13632M14372.f43293).trim());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14367(String str, char c) {
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
    public static String m14368(String str) {
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
    public static C4574 m14370(int i, String str, String str2) {
        int iIndexOf = str2.indexOf(str.equals("field") ? 58 : 40);
        return new C4574(i, i, str, iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf), str2, "");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13632 m14372(int i, String str) {
        int iLastIndexOf;
        while (i > 0 && Character.isWhitespace(str.charAt(i - 1))) {
            i--;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (str.charAt(i2) == '`' && (iLastIndexOf = str.lastIndexOf(96, i - 2)) >= 0) {
                return new C13632(str.substring(iLastIndexOf + 1, i2), iLastIndexOf);
            }
        }
        int i3 = i;
        while (i3 > 0 && !Character.isWhitespace(str.charAt(i3 - 1))) {
            i3--;
        }
        return new C13632(str.substring(i3, i), i3);
    }
}
