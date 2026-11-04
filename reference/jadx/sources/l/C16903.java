package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.google.android.material.badge.BadgeDrawable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4F8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16903 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f55268 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f55269;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f55270;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f55271;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f55272;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f55273;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f55274;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f55275;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f55276;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f55277;

    public C16903(C25109 c25109) {
        this.f55273 = c25109.f81196;
        String str = c25109.f81200;
        this.f55269 = m39857(str, 0, str.length(), false);
        String str2 = c25109.f81201;
        this.f55272 = m39857(str2, 0, str2.length(), false);
        this.f55276 = c25109.f81199;
        int i = c25109.f81198;
        this.f55275 = i == -1 ? m39862(c25109.f81196) : i;
        this.f55277 = m39858(c25109.f81197, false);
        ArrayList arrayList = c25109.f81202;
        this.f55274 = arrayList != null ? m39858(arrayList, true) : null;
        String str3 = c25109.f81195;
        this.f55270 = str3 != null ? m39857(str3, 0, str3.length(), false) : null;
        this.f55271 = c25109.toString();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final URI m39879() {
        C25109 c25109M39868 = m39868();
        ArrayList arrayList = c25109M39868.f81197;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList.set(i, m39856(str, 0, str.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = c25109M39868.f81202;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) c25109M39868.f81202.get(i2);
                if (str2 != null) {
                    c25109M39868.f81202.set(i2, m39856(str2, 0, str2.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str3 = c25109M39868.f81195;
        if (str3 != null) {
            c25109M39868.f81195 = m39856(str3, 0, str3.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = c25109M39868.toString();
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

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m39873() {
        return this.f55273;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m39871() {
        return this.f55273.equals(b.a);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m39876() {
        if (this.f55269.isEmpty()) {
            return "";
        }
        int length = this.f55273.length() + 3;
        String str = this.f55271;
        return str.substring(length, C19822.m45591(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m39865() {
        return this.f55269;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39866() {
        if (this.f55272.isEmpty()) {
            return "";
        }
        int length = this.f55273.length() + 3;
        String str = this.f55271;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m39864() {
        return this.f55272;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m39872() {
        return this.f55276;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m39880() {
        return this.f55275;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m39862(String str) {
        if (str.equals(a.s)) {
            return 80;
        }
        return str.equals(b.a) ? 443 : -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m39877() {
        int length = this.f55273.length() + 3;
        String str = this.f55271;
        int iIndexOf = str.indexOf(47, length);
        return str.substring(iIndexOf, C19822.m45591(str, iIndexOf, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m39869() {
        int length = this.f55273.length() + 3;
        String str = this.f55271;
        int iIndexOf = str.indexOf(47, length);
        int iM45591 = C19822.m45591(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM45591) {
            int i = iIndexOf + 1;
            int iM45590 = C19822.m45590(str, i, iM45591, '/');
            arrayList.add(str.substring(i, iM45590));
            iIndexOf = iM45590;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m39870() {
        return this.f55277;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m39878() {
        if (this.f55274 == null) {
            return null;
        }
        String str = this.f55271;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, C19822.m45590(str, iIndexOf, str.length(), '#'));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39859(StringBuilder sb, List list) {
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ArrayList m39863(String str) {
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

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m39874() {
        List list = this.f55274;
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m39859(sb, list);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C25109 m39868() {
        C25109 c25109 = new C25109();
        String str = this.f55273;
        c25109.f81196 = str;
        c25109.f81200 = m39876();
        c25109.f81201 = m39866();
        c25109.f81199 = this.f55276;
        int iM39862 = m39862(str);
        int i = this.f55275;
        if (i == iM39862) {
            i = -1;
        }
        c25109.f81198 = i;
        ArrayList arrayList = c25109.f81197;
        arrayList.clear();
        arrayList.addAll(m39869());
        String strM39878 = m39878();
        String strSubstring = null;
        c25109.f81202 = strM39878 != null ? m39863(m39856(strM39878, 0, strM39878.length(), " \"'<>#", true, false, true, true)) : null;
        if (this.f55270 != null) {
            String str2 = this.f55271;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        c25109.f81195 = strSubstring;
        return c25109;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16903 m39867(String str) {
        C25109 c25109;
        try {
            c25109 = new C25109();
            c25109.m55965(this, str);
        } catch (IllegalArgumentException unused) {
            c25109 = null;
        }
        if (c25109 != null) {
            return c25109.m55964();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m39875() {
        C25109 c25109;
        try {
            c25109 = new C25109();
            c25109.m55965(this, "/...");
        } catch (IllegalArgumentException unused) {
            c25109 = null;
        }
        c25109.m55967();
        c25109.m55970();
        return c25109.m55964().f55271;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C16903 m39861(String str) {
        C25109 c25109 = new C25109();
        c25109.m55965(null, str);
        return c25109.m55964();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16903) && ((C16903) obj).f55271.equals(this.f55271);
    }

    public final int hashCode() {
        return this.f55271.hashCode();
    }

    public final String toString() {
        return this.f55271;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m39858(ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList2.add(str != null ? m39857(str, 0, str.length(), z) : null);
        }
        return C4681.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39857(String str, int i, int i2, boolean z) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C1879 c1879 = new C1879();
                c1879.m6437(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i3 = iCharCount + 2) < i2) {
                        int iM45588 = C19822.m45588(str.charAt(iCharCount + 1));
                        int iM45589 = C19822.m45588(str.charAt(i3));
                        if (iM45588 != -1 && iM45589 != -1) {
                            c1879.m6455writeByte((iM45588 << 4) + iM45589);
                            iCharCount = i3;
                        } else {
                            c1879.m6444(iCodePointAt);
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c1879.m6455writeByte(32);
                    } else {
                        c1879.m6444(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return c1879.m6446();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39860(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C19822.m45588(str.charAt(i + 1)) != -1 && C19822.m45588(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39856(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || m39860(iCharCount, i2, str)))) && (iCodePointAt != 43 || !z3)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                C1879 c1879 = new C1879();
                c1879.m6437(i, iCharCount, str);
                C1879 c18710 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            String str3 = z ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B";
                            c1879.m6437(0, str3.length(), str3);
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z4) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z || (z2 && !m39860(iCharCount, i2, str)))))) {
                            if (c18710 == null) {
                                c18710 = new C1879();
                            }
                            c18710.m6444(iCodePointAt2);
                            while (!c18710.mo4182()) {
                                byte b = c18710.readByte();
                                c1879.m6455writeByte(37);
                                char[] cArr = f55268;
                                c1879.m6455writeByte((int) cArr[((b & 255) >> 4) & 15]);
                                c1879.m6455writeByte((int) cArr[b & 15]);
                            }
                        } else {
                            c1879.m6444(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c1879.m6446();
            }
        }
        return str.substring(i, i2);
    }
}
