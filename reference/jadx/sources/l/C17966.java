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

/* JADX INFO: renamed from: l.ᩳۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 14GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17966 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f57465;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f57466;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f57467;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f57468;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f57469;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f57470;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f57471;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f57472;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f57473;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f57463 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f57464 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f57461 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Pattern f57462 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C17966(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f57469 = str;
        this.f57467 = str2;
        this.f57472 = j;
        this.f57468 = str3;
        this.f57473 = str4;
        this.f57471 = z;
        this.f57466 = z2;
        this.f57470 = z3;
        this.f57465 = z4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m41797() {
        return this.f57469;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m41798() {
        return this.f57467;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m41795(int i, String str) {
        int iM41794 = m41794(str, 0, i, false);
        Pattern pattern = f57462;
        Matcher matcher = pattern.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iIndexOf = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM41794 < i) {
            int iM41795 = m41794(str, iM41794 + 1, i, true);
            matcher.region(iM41794, iM41795);
            if (i3 == -1 && matcher.usePattern(pattern).matches()) {
                int i7 = Integer.parseInt(matcher.group(1));
                int i8 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
                i5 = i8;
                i3 = i7;
            } else if (i4 == -1 && matcher.usePattern(f57461).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern2 = f57464;
                if (matcher.usePattern(pattern2).matches()) {
                    iIndexOf = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i2 != -1 && matcher.usePattern(f57463).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else if (i2 != -1) {
            }
            iM41794 = m41794(str, iM41795 + 1, i, false);
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
        GregorianCalendar gregorianCalendar = new GregorianCalendar(C0140.f1181);
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
    public static int m41794(String str, int i, int i2, boolean z) {
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
    public static List m41796(C14440 c14440, C10912 c10912) {
        List list;
        long j;
        String strSubstring;
        C17966 c17966;
        String strSubstring2;
        List listM27349 = c10912.m27349("Set-Cookie");
        int size = listM27349.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            String str = (String) listM27349.get(i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int length = str.length();
            int iM1220 = C0140.m1220(str, i, length, ';');
            int iM1221 = C0140.m1220(str, i, iM1220, a.h);
            if (iM1221 != iM1220) {
                int iM1239 = C0140.m1239(i, iM1221, str);
                String strSubstring3 = str.substring(iM1239, C0140.m1238(iM1239, iM1221, str));
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
                        int iM12310 = C0140.m1239(iM1221 + 1, iM1220, str);
                        String strSubstring4 = str.substring(iM12310, C0140.m1238(iM12310, iM1220, str));
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
                            int i5 = iM1220 + 1;
                            String str2 = null;
                            long j2 = -1;
                            long jM41795 = 253402300799999L;
                            boolean z = false;
                            boolean z2 = false;
                            boolean z3 = true;
                            boolean z4 = false;
                            String str3 = null;
                            int i6 = i5;
                            while (true) {
                                long j3 = C17492.FOREVER_NS;
                                if (i6 >= length) {
                                    list = listM27349;
                                    if (j2 == Long.MIN_VALUE) {
                                        j = Long.MIN_VALUE;
                                    } else if (j2 != -1) {
                                        if (j2 <= 9223372036854775L) {
                                            j3 = j2 * 1000;
                                        }
                                        long j4 = jCurrentTimeMillis + j3;
                                        j = (j4 < jCurrentTimeMillis || j4 > 253402300799999L) ? 253402300799999L : j4;
                                    } else {
                                        j = jM41795;
                                    }
                                    String str4 = c14440.f47339;
                                    if (str3 != null) {
                                        if (!str4.equals(str3) && (!str4.endsWith(str3) || str4.charAt((str4.length() - str3.length()) - 1) != '.' || C0140.m1240(str4))) {
                                            break;
                                        }
                                    } else {
                                        str3 = str4;
                                    }
                                    if (str4.length() == str3.length() || PublicSuffixDatabase.get().getEffectiveTldPlusOne(str3) != null) {
                                        if (str2 == null || !str2.startsWith("/")) {
                                            String strM34743 = c14440.m34743();
                                            int iLastIndexOf = strM34743.lastIndexOf(47);
                                            strSubstring = iLastIndexOf != 0 ? strM34743.substring(0, iLastIndexOf) : "/";
                                        } else {
                                            strSubstring = str2;
                                        }
                                        c17966 = new C17966(strSubstring3, strSubstring4, j, str3, strSubstring, z, z2, z3, z4);
                                        break;
                                    }
                                } else {
                                    int iM1222 = C0140.m1220(str, i6, length, ';');
                                    int iM1223 = C0140.m1220(str, i6, iM1222, a.h);
                                    int iM12311 = C0140.m1239(i6, iM1223, str);
                                    List list2 = listM27349;
                                    String strSubstring5 = str.substring(iM12311, C0140.m1238(iM12311, iM1223, str));
                                    if (iM1223 < iM1222) {
                                        int iM12312 = C0140.m1239(iM1223 + 1, iM1222, str);
                                        strSubstring2 = str.substring(iM12312, C0140.m1238(iM12312, iM1222, str));
                                    } else {
                                        strSubstring2 = "";
                                    }
                                    if (strSubstring5.equalsIgnoreCase("expires")) {
                                        try {
                                            jM41795 = m41795(strSubstring2.length(), strSubstring2);
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
                                        String strM1223 = C0140.m1223(strSubstring2);
                                        if (strM1223 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        z3 = false;
                                        str3 = strM1223;
                                    } else if (strSubstring5.equalsIgnoreCase(MotionUtils.EASING_TYPE_PATH)) {
                                        str2 = strSubstring2;
                                    } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                        z = true;
                                    } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                        z2 = true;
                                    }
                                    i6 = iM1222 + 1;
                                    listM27349 = list2;
                                }
                            }
                        } else {
                            list = listM27349;
                        }
                        c17966 = null;
                        break;
                    } else {
                        list = listM27349;
                        c17966 = null;
                        break;
                    }
                } else {
                    list = listM27349;
                    c17966 = null;
                    break;
                }
            } else {
                list = listM27349;
                c17966 = null;
                break;
            }
            if (c17966 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c17966);
            }
            i2++;
            i = 0;
            listM27349 = list;
        }
        return arrayList != null ? C0561.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57469);
        sb.append(a.h);
        sb.append(this.f57467);
        if (this.f57465) {
            long j = this.f57472;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C8659.m22460(new Date(j)));
            }
        }
        if (!this.f57470) {
            sb.append("; domain=");
            sb.append(this.f57468);
        }
        sb.append("; path=");
        sb.append(this.f57473);
        if (this.f57471) {
            sb.append("; secure");
        }
        if (this.f57466) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17966)) {
            return false;
        }
        C17966 c17966 = (C17966) obj;
        return c17966.f57469.equals(this.f57469) && c17966.f57467.equals(this.f57467) && c17966.f57468.equals(this.f57468) && c17966.f57473.equals(this.f57473) && c17966.f57472 == this.f57472 && c17966.f57471 == this.f57471 && c17966.f57466 == this.f57466 && c17966.f57465 == this.f57465 && c17966.f57470 == this.f57470;
    }

    public final int hashCode() {
        int iM33812 = C13958.m33812(C13958.m33812(C13958.m33812(C13958.m33812(527, 31, this.f57469), 31, this.f57467), 31, this.f57468), 31, this.f57473);
        long j = this.f57472;
        return ((((((((iM33812 + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f57471 ? 1 : 0)) * 31) + (!this.f57466 ? 1 : 0)) * 31) + (!this.f57465 ? 1 : 0)) * 31) + (!this.f57470 ? 1 : 0);
    }
}
