package l;

import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܿۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T3M6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18134 extends AbstractC23356 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C18134 f59304 = new C18134();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f59305;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f59306;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[][] f59307;

    static {
        HashMap map = new HashMap();
        f59306 = map;
        map.put("file", 0);
        map.put("cdir", 1);
        map.put("pdir", 1);
        map.put("dir", 1);
        f59305 = new int[]{0, 1, 2};
        f59307 = new int[][]{new int[0], new int[]{2}, new int[]{1}, new int[]{2, 1}, new int[]{0}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1, 2}};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18134 m42247() {
        return f59304;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    @Override // l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ */
    public final C17388 mo1715(String str) {
        SimpleDateFormat simpleDateFormat;
        boolean z;
        if (str.startsWith(" ")) {
            if (str.length() > 1) {
                C17388 c17388 = new C17388();
                c17388.m40844(str);
                c17388.m40835(str.substring(1));
                return c17388;
            }
        } else {
            String[] strArrSplit = str.split(" ", 2);
            if (strArrSplit.length == 2 && !strArrSplit[1].isEmpty()) {
                String str2 = strArrSplit[0];
                if (str2.endsWith(l.b)) {
                    C17388 c17389 = new C17388();
                    c17389.m40844(str);
                    c17389.m40835(strArrSplit[1]);
                    String[] strArrSplit2 = str2.split(l.b);
                    boolean zContains = strArrSplit[0].toLowerCase(Locale.ENGLISH).contains("unix.mode=");
                    for (String str3 : strArrSplit2) {
                        String[] strArrSplit3 = str3.split("=", -1);
                        if (strArrSplit3.length == 2) {
                            String str4 = strArrSplit3[0];
                            Locale locale = Locale.ENGLISH;
                            String lowerCase = str4.toLowerCase(locale);
                            String str5 = strArrSplit3[1];
                            if (!str5.isEmpty()) {
                                String lowerCase2 = str5.toLowerCase(locale);
                                lowerCase.getClass();
                                switch (lowerCase) {
                                    case "modify":
                                        if (str5.contains(".")) {
                                            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
                                            z = true;
                                        } else {
                                            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                                            z = false;
                                        }
                                        TimeZone timeZone = C10646.getTimeZone("GMT");
                                        simpleDateFormat.setTimeZone(timeZone);
                                        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                                        ParsePosition parsePosition = new ParsePosition(0);
                                        simpleDateFormat.setLenient(false);
                                        Date date = simpleDateFormat.parse(str5, parsePosition);
                                        if (parsePosition.getIndex() != str5.length()) {
                                            gregorianCalendar = null;
                                        } else {
                                            gregorianCalendar.setTime(date);
                                            if (!z) {
                                                gregorianCalendar.clear(14);
                                            }
                                        }
                                        if (gregorianCalendar == null) {
                                            return null;
                                        }
                                        c17389.m40831(gregorianCalendar);
                                        break;
                                        break;
                                    case "sizd":
                                    case "size":
                                        c17389.m40829(Long.parseLong(str5));
                                        break;
                                    case "type":
                                        Integer num = (Integer) f59306.get(lowerCase2);
                                        if (num == null) {
                                            c17389.m40827(3);
                                            break;
                                        } else {
                                            c17389.m40827(num.intValue());
                                            break;
                                        }
                                        break;
                                    default:
                                        if (lowerCase.startsWith("unix.")) {
                                            String lowerCase3 = lowerCase.substring(5).toLowerCase(locale);
                                            lowerCase3.getClass();
                                            switch (lowerCase3) {
                                                case "mode":
                                                    int length = str5.length() - 3;
                                                    int i = 0;
                                                    for (int i2 = 3; i < i2; i2 = 3) {
                                                        int iCharAt = str5.charAt(length + i) - '0';
                                                        if (iCharAt >= 0 && iCharAt <= 7) {
                                                            for (int i3 : f59307[iCharAt]) {
                                                                c17389.m40828(f59305[i], i3, true);
                                                            }
                                                        }
                                                        i++;
                                                    }
                                                    break;
                                                case "group":
                                                    c17389.m40830(str5);
                                                    break;
                                                case "owner":
                                                    c17389.m40840(str5);
                                                    break;
                                            }
                                        } else {
                                            if (!zContains && "perm".equals(lowerCase)) {
                                                for (char c : lowerCase2.toCharArray()) {
                                                    if (c == 'a') {
                                                        c17389.m40828(0, 1, true);
                                                    } else if (c == 'p') {
                                                        c17389.m40828(0, 1, true);
                                                    } else if (c == 'r') {
                                                        c17389.m40828(0, 0, true);
                                                    } else if (c == 'w') {
                                                        c17389.m40828(0, 1, true);
                                                    } else if (c == 'l') {
                                                        c17389.m40828(0, 2, true);
                                                    } else if (c != 'm') {
                                                        switch (c) {
                                                            case q.f /* 99 */:
                                                                c17389.m40828(0, 1, true);
                                                                break;
                                                            case 'd':
                                                                c17389.m40828(0, 1, true);
                                                                break;
                                                            case 'e':
                                                                c17389.m40828(0, 0, true);
                                                                break;
                                                        }
                                                    } else {
                                                        c17389.m40828(0, 1, true);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    return c17389;
                }
            }
        }
        return null;
    }
}
