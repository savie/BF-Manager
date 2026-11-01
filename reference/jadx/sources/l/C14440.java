package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.google.android.material.badge.BadgeDrawable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M4F8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14440 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final char[] f47331 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f47332;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f47333;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f47334;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f47335;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f47336;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f47337;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f47338;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f47339;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f47340;

    public C14440(C23612 c23612) {
        this.f47332 = c23612.f76508;
        String str = c23612.f76506;
        this.f47334 = m34728(str, 0, str.length(), false);
        String str2 = c23612.f76509;
        this.f47337 = m34728(str2, 0, str2.length(), false);
        this.f47339 = c23612.f76510;
        int i = c23612.f76503;
        this.f47336 = i == -1 ? m34733(c23612.f76508) : i;
        this.f47333 = m34729(c23612.f76507, false);
        ArrayList arrayList = c23612.f76504;
        this.f47340 = arrayList != null ? m34729(arrayList, true) : null;
        String str3 = c23612.f76505;
        this.f47335 = str3 != null ? m34728(str3, 0, str3.length(), false) : null;
        this.f47338 = c23612.toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m34747() {
        return this.f47332;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m34734() {
        return this.f47332.equals(b.a);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m34739() {
        if (this.f47334.isEmpty()) {
            return "";
        }
        int length = this.f47332.length() + 3;
        String str = this.f47338;
        return str.substring(length, C0140.m1221(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m34746() {
        return this.f47334;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34737() {
        if (this.f47337.isEmpty()) {
            return "";
        }
        int length = this.f47332.length() + 3;
        String str = this.f47338;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m34742() {
        return this.f47337;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m34748() {
        return this.f47339;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m34740() {
        return this.f47336;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m34733(String str) {
        if (str.equals(a.s)) {
            return 80;
        }
        return str.equals(b.a) ? 443 : -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m34743() {
        int length = this.f47332.length() + 3;
        String str = this.f47338;
        int iIndexOf = str.indexOf(47, length);
        return str.substring(iIndexOf, C0140.m1221(str, iIndexOf, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34741() {
        int length = this.f47332.length() + 3;
        String str = this.f47338;
        int iIndexOf = str.indexOf(47, length);
        int iM1221 = C0140.m1221(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM1221) {
            int i = iIndexOf + 1;
            int iM1220 = C0140.m1220(str, i, iM1221, '/');
            arrayList.add(str.substring(i, iM1220));
            iIndexOf = iM1220;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List m34736() {
        return this.f47333;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m34735() {
        if (this.f47340 == null) {
            return null;
        }
        String str = this.f47338;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, C0140.m1220(str, iIndexOf, str.length(), '#'));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34730(StringBuilder sb, List list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(com.alipay.sdk.m.p.a.h);
                sb.append(str2);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ArrayList m34726(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m34749() {
        List list = this.f47340;
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m34730(sb, list);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final URI m34745() {
        C23612 c23612 = new C23612();
        String str = this.f47332;
        c23612.f76508 = str;
        c23612.f76506 = m34739();
        c23612.f76509 = m34737();
        c23612.f76510 = this.f47339;
        int iM34733 = m34733(str);
        int i = this.f47336;
        if (i == iM34733) {
            i = -1;
        }
        c23612.f76503 = i;
        ArrayList arrayList = c23612.f76507;
        arrayList.clear();
        arrayList.addAll(m34741());
        String strM34735 = m34735();
        String strSubstring = null;
        c23612.f76504 = strM34735 != null ? m34726(m34727(strM34735, 0, strM34735.length(), " \"'<>#", true, false, true, true)) : null;
        if (this.f47335 != null) {
            String str2 = this.f47338;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        c23612.f76505 = strSubstring;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) arrayList.get(i2);
            arrayList.set(i2, m34727(str3, 0, str3.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = c23612.f76504;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) c23612.f76504.get(i3);
                if (str4 != null) {
                    c23612.f76504.set(i3, m34727(str4, 0, str4.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str5 = c23612.f76505;
        if (str5 != null) {
            c23612.f76505 = m34727(str5, 0, str5.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = c23612.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14440 m34738(String str) {
        C23612 c23612;
        try {
            c23612 = new C23612();
            c23612.m52086(this, str);
        } catch (IllegalArgumentException unused) {
            c23612 = null;
        }
        if (c23612 != null) {
            return c23612.m52085();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m34744() {
        C23612 c23612;
        try {
            c23612 = new C23612();
            c23612.m52086(this, "/...");
        } catch (IllegalArgumentException unused) {
            c23612 = null;
        }
        c23612.getClass();
        c23612.f76506 = m34727("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        c23612.f76509 = m34727("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return c23612.m52085().f47338;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C14440 m34732(String str) {
        C23612 c23612 = new C23612();
        c23612.m52086(null, str);
        return c23612.m52085();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C14440) && ((C14440) obj).f47338.equals(this.f47338);
    }

    public final int hashCode() {
        return this.f47338.hashCode();
    }

    public final String toString() {
        return this.f47338;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m34729(ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList2.add(str != null ? m34728(str, 0, str.length(), z) : null);
        }
        return C0561.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34728(String str, int i, int i2, boolean z) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C6043 c6043 = new C6043();
                c6043.m16408(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i3 = iCharCount + 2) < i2) {
                        int iM1218 = C0140.m1218(str.charAt(iCharCount + 1));
                        int iM1219 = C0140.m1218(str.charAt(i3));
                        if (iM1218 != -1 && iM1219 != -1) {
                            c6043.m16434writeByte((iM1218 << 4) + iM1219);
                            iCharCount = i3;
                        } else {
                            c6043.m16419(iCodePointAt);
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c6043.m16434writeByte(32);
                    } else {
                        c6043.m16419(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return c6043.m16427();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34731(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C0140.m1218(str.charAt(i + 1)) != -1 && C0140.m1218(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34727(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || m34731(iCharCount, i2, str)))) && (iCodePointAt != 43 || !z3)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                C6043 c6043 = new C6043();
                c6043.m16408(i, iCharCount, str);
                C6043 c6044 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            String str3 = z ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B";
                            c6043.m16408(0, str3.length(), str3);
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z4) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z || (z2 && !m34731(iCharCount, i2, str)))))) {
                            if (c6044 == null) {
                                c6044 = new C6043();
                            }
                            c6044.m16419(iCodePointAt2);
                            while (!c6044.mo16415()) {
                                byte b = c6044.readByte();
                                c6043.m16434writeByte(37);
                                char[] cArr = f47331;
                                c6043.m16434writeByte((int) cArr[((b & 255) >> 4) & 15]);
                                c6043.m16434writeByte((int) cArr[b & 15]);
                            }
                        } else {
                            c6043.m16419(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c6043.m16427();
            }
        }
        return str.substring(i, i2);
    }
}
