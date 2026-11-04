package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: l.ۡᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9576 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f30997;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f30998;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f30999;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f31000;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f31001;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f31002;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f31003;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f31004;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f31005;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f30995 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f30996 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f30993 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f30994 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C9576(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f31003 = str;
        this.f30997 = str2;
        this.f31004 = j;
        this.f30998 = str3;
        this.f31002 = str4;
        this.f30999 = z;
        this.f31005 = z2;
        this.f31000 = z3;
        this.f31001 = z4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m25009() {
        return this.f31003;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m25010() {
        return this.f30997;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m25007(int i, String str) {
        int iM25006 = m25006(str, 0, i, false);
        Pattern pattern = f30994;
        Matcher matcher = pattern.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iIndexOf = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM25006 < i) {
            int iM25007 = m25006(str, iM25006 + 1, i, true);
            matcher.region(iM25006, iM25007);
            if (i3 == -1 && matcher.usePattern(pattern).matches()) {
                int i7 = Integer.parseInt(matcher.group(1));
                int i8 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
                i5 = i8;
                i3 = i7;
            } else if (i4 == -1 && matcher.usePattern(f30993).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern2 = f30996;
                if (matcher.usePattern(pattern2).matches()) {
                    iIndexOf = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i2 != -1 && matcher.usePattern(f30995).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else if (i2 != -1) {
            }
            iM25006 = m25006(str, iM25007 + 1, i, false);
        }
        if (i2 >= 70 && i2 <= 99) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 <= 69) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException();
        }
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
        if (i4 < 1 || i4 > 31) {
            throw new IllegalArgumentException();
        }
        if (i3 < 0 || i3 > 23) {
            throw new IllegalArgumentException();
        }
        if (i5 < 0 || i5 > 59) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(C19822.f63721);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iIndexOf - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25006(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m25008(C16903 c16903, C11682 c11682) {
        List list;
        long j;
        String strSubstring;
        C9576 c9576;
        String strSubstring2;
        List listM29365 = c11682.m29365("Set-Cookie");
        int size = listM29365.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            String str = (String) listM29365.get(i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int length = str.length();
            int iM45590 = C19822.m45590(str, i, length, ';');
            int iM45591 = C19822.m45590(str, i, iM45590, a.h);
            if (iM45591 != iM45590) {
                int iM45609 = C19822.m45609(i, iM45591, str);
                String strSubstring3 = str.substring(iM45609, C19822.m45608(iM45609, iM45591, str));
                if (!strSubstring3.isEmpty()) {
                    int length2 = strSubstring3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            i3 = -1;
                            break;
                        }
                        char cCharAt = strSubstring3.charAt(i3);
                        if (cCharAt <= 31 || cCharAt >= 127) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        int iM456010 = C19822.m45609(iM45591 + 1, iM45590, str);
                        String strSubstring4 = str.substring(iM456010, C19822.m45608(iM456010, iM45590, str));
                        int length3 = strSubstring4.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length3) {
                                i4 = -1;
                                break;
                            }
                            char cCharAt2 = strSubstring4.charAt(i4);
                            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                                break;
                            }
                            i4++;
                        }
                        if (i4 == -1) {
                            int i5 = iM45590 + 1;
                            String str2 = null;
                            long j2 = -1;
                            long jM25007 = 253402300799999L;
                            boolean z = false;
                            boolean z2 = false;
                            boolean z3 = true;
                            boolean z4 = false;
                            String str3 = null;
                            int i6 = i5;
                            while (true) {
                                long j3 = C25227.FOREVER_NS;
                                if (i6 >= length) {
                                    list = listM29365;
                                    if (j2 == Long.MIN_VALUE) {
                                        j = Long.MIN_VALUE;
                                    } else if (j2 != -1) {
                                        if (j2 <= 9223372036854775L) {
                                            j3 = j2 * 1000;
                                        }
                                        long j4 = jCurrentTimeMillis + j3;
                                        j = (j4 < jCurrentTimeMillis || j4 > 253402300799999L) ? 253402300799999L : j4;
                                    } else {
                                        j = jM25007;
                                    }
                                    String str4 = c16903.f55276;
                                    if (str3 != null) {
                                        if (!str4.equals(str3) && (!str4.endsWith(str3) || str4.charAt((str4.length() - str3.length()) - 1) != '.' || C19822.m45610(str4))) {
                                            break;
                                        }
                                    } else {
                                        str3 = str4;
                                    }
                                    if (str4.length() == str3.length() || PublicSuffixDatabase.get().getEffectiveTldPlusOne(str3) != null) {
                                        if (str2 == null || !str2.startsWith("/")) {
                                            String strM39877 = c16903.m39877();
                                            int iLastIndexOf = strM39877.lastIndexOf(47);
                                            strSubstring = iLastIndexOf != 0 ? strM39877.substring(0, iLastIndexOf) : "/";
                                        } else {
                                            strSubstring = str2;
                                        }
                                        c9576 = new C9576(strSubstring3, strSubstring4, j, str3, strSubstring, z, z2, z3, z4);
                                        break;
                                    }
                                } else {
                                    int iM45592 = C19822.m45590(str, i6, length, ';');
                                    int iM45593 = C19822.m45590(str, i6, iM45592, a.h);
                                    int iM456011 = C19822.m45609(i6, iM45593, str);
                                    List list2 = listM29365;
                                    String strSubstring5 = str.substring(iM456011, C19822.m45608(iM456011, iM45593, str));
                                    if (iM45593 < iM45592) {
                                        int iM456012 = C19822.m45609(iM45593 + 1, iM45592, str);
                                        strSubstring2 = str.substring(iM456012, C19822.m45608(iM456012, iM45592, str));
                                    } else {
                                        strSubstring2 = "";
                                    }
                                    if (strSubstring5.equalsIgnoreCase("expires")) {
                                        try {
                                            jM25007 = m25007(strSubstring2.length(), strSubstring2);
                                            z4 = true;
                                        } catch (NumberFormatException | IllegalArgumentException unused) {
                                        }
                                    } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                        try {
                                            j2 = Long.parseLong(strSubstring2);
                                            if (j2 <= 0) {
                                                j2 = Long.MIN_VALUE;
                                            }
                                        } catch (NumberFormatException e) {
                                            if (!strSubstring2.matches("-?\\d+")) {
                                                throw e;
                                            }
                                            if (!strSubstring2.startsWith("-")) {
                                                j2 = Long.MAX_VALUE;
                                            }
                                            z4 = true;
                                        }
                                        z4 = true;
                                    } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                        if (strSubstring2.endsWith(".")) {
                                            throw new IllegalArgumentException();
                                        }
                                        if (strSubstring2.startsWith(".")) {
                                            strSubstring2 = strSubstring2.substring(1);
                                        }
                                        String strM45593 = C19822.m45593(strSubstring2);
                                        if (strM45593 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        z3 = false;
                                        str3 = strM45593;
                                    } else if (strSubstring5.equalsIgnoreCase(MotionUtils.EASING_TYPE_PATH)) {
                                        str2 = strSubstring2;
                                    } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                        z = true;
                                    } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                        z2 = true;
                                    }
                                    i6 = iM45592 + 1;
                                    listM29365 = list2;
                                }
                            }
                        } else {
                            list = listM29365;
                        }
                        c9576 = null;
                        break;
                    } else {
                        list = listM29365;
                        c9576 = null;
                        break;
                    }
                } else {
                    list = listM29365;
                    c9576 = null;
                    break;
                }
            } else {
                list = listM29365;
                c9576 = null;
                break;
            }
            if (c9576 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c9576);
            }
            i2++;
            i = 0;
            listM29365 = list;
        }
        return arrayList != null ? C4681.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31003);
        sb.append(a.h);
        sb.append(this.f30997);
        if (this.f31001) {
            long j = this.f31004;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C7143.m19708(new Date(j)));
            }
        }
        if (!this.f31000) {
            sb.append("; domain=");
            sb.append(this.f30998);
        }
        sb.append("; path=");
        sb.append(this.f31002);
        if (this.f30999) {
            sb.append("; secure");
        }
        if (this.f31005) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9576)) {
            return false;
        }
        C9576 c9576 = (C9576) obj;
        return c9576.f31003.equals(this.f31003) && c9576.f30997.equals(this.f30997) && c9576.f30998.equals(this.f30998) && c9576.f31002.equals(this.f31002) && c9576.f31004 == this.f31004 && c9576.f30999 == this.f30999 && c9576.f31005 == this.f31005 && c9576.f31001 == this.f31001 && c9576.f31000 == this.f31000;
    }

    public final int hashCode() {
        int iM30817 = C12351.m30817(C12351.m30817(C12351.m30817(C12351.m30817(527, 31, this.f31003), 31, this.f30997), 31, this.f30998), 31, this.f31002);
        long j = this.f31004;
        return ((((((((iM30817 + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f30999 ? 1 : 0)) * 31) + (!this.f31005 ? 1 : 0)) * 31) + (!this.f31001 ? 1 : 0)) * 31) + (!this.f31000 ? 1 : 0);
    }
}
