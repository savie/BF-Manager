package l;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܽۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 39WK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16473 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f52934 = Pattern.compile("^((.*)\\._)?_?(.*)\\._sub\\._([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f52933 = Pattern.compile("^((.*)?\\._)?([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m38742(String str) {
        String strM1635;
        String strSubstring;
        String str2;
        String strM38741;
        String str3;
        String strM38742;
        String strM38743;
        String strM38744;
        String lowerCase = str.toLowerCase();
        String strM38745 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int iIndexOf = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            strM1635 = C0244.m1635(str.substring(0, iIndexOf));
            strSubstring = str.substring(iIndexOf);
        } else {
            if (!lowerCase.contains("_") && lowerCase.contains(".")) {
                int iIndexOf2 = lowerCase.indexOf(46);
                strM1635 = C0244.m1635(str.substring(0, iIndexOf2));
                strSubstring = C0244.m1635(str.substring(iIndexOf2));
            } else {
                Matcher matcher = f52934.matcher(lowerCase);
                if (matcher.matches()) {
                    strM38742 = m38741(str, matcher, 2);
                    strM38745 = m38741(str, matcher, 3);
                    strM38743 = m38741(str, matcher, 4);
                    strM38741 = m38741(str, matcher, 5);
                    strM38744 = m38741(str, matcher, 6);
                } else {
                    Matcher matcher2 = f52933.matcher(lowerCase);
                    if (matcher2.matches()) {
                        strM38742 = m38741(str, matcher2, 2);
                        strM38743 = m38741(str, matcher2, 3);
                        strM38741 = m38741(str, matcher2, 4);
                        strM38744 = m38741(str, matcher2, 5);
                    } else {
                        str2 = "";
                        str3 = str2;
                        strM38741 = str3;
                    }
                }
                String str4 = strM38744;
                str2 = strM38742;
                lowerCase = strM38743;
                String str5 = strM38745;
                strM38745 = str4;
                str3 = str5;
            }
            String strM1636 = C0244.m1635(lowerCase);
            String strM1637 = C0244.m1635(strM38745);
            HashMap map = new HashMap(5);
            map.put(EnumC6075.Instance, str2);
            map.put(EnumC6075.Application, strM1636);
            map.put(EnumC6075.Protocol, strM38741);
            map.put(EnumC6075.Domain, strM1637);
            map.put(EnumC6075.Subtype, str3);
            return map;
        }
        lowerCase = "";
        strM38741 = lowerCase;
        strM38745 = strSubstring;
        str2 = strM1635;
        str3 = strM38741;
        String strM1638 = C0244.m1635(lowerCase);
        String strM1639 = C0244.m1635(strM38745);
        HashMap map2 = new HashMap(5);
        map2.put(EnumC6075.Instance, str2);
        map2.put(EnumC6075.Application, strM1638);
        map2.put(EnumC6075.Protocol, strM38741);
        map2.put(EnumC6075.Domain, strM1639);
        map2.put(EnumC6075.Subtype, str3);
        return map2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38741(String str, Matcher matcher, int i) {
        return matcher.start(i) != -1 ? str.substring(matcher.start(i), matcher.end(i)) : "";
    }
}
