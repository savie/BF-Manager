package l;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 39WK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15815 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f51456 = Pattern.compile("^((.*)\\._)?_?(.*)\\._sub\\._([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f51455 = Pattern.compile("^((.*)?\\._)?([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m37743(String str) {
        String strM40633;
        String strSubstring;
        String str2;
        String strM37742;
        String str3;
        String strM37743;
        String strM37744;
        String strM37745;
        String lowerCase = str.toLowerCase();
        String strM37746 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int iIndexOf = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            strM40633 = C17307.m40633(str.substring(0, iIndexOf));
            strSubstring = str.substring(iIndexOf);
        } else {
            if (!lowerCase.contains("_") && lowerCase.contains(".")) {
                int iIndexOf2 = lowerCase.indexOf(46);
                strM40633 = C17307.m40633(str.substring(0, iIndexOf2));
                strSubstring = C17307.m40633(str.substring(iIndexOf2));
            } else {
                Matcher matcher = f51456.matcher(lowerCase);
                if (matcher.matches()) {
                    strM37743 = m37742(str, matcher, 2);
                    strM37746 = m37742(str, matcher, 3);
                    strM37744 = m37742(str, matcher, 4);
                    strM37742 = m37742(str, matcher, 5);
                    strM37745 = m37742(str, matcher, 6);
                } else {
                    Matcher matcher2 = f51455.matcher(lowerCase);
                    if (matcher2.matches()) {
                        strM37743 = m37742(str, matcher2, 2);
                        strM37744 = m37742(str, matcher2, 3);
                        strM37742 = m37742(str, matcher2, 4);
                        strM37745 = m37742(str, matcher2, 5);
                    } else {
                        str2 = "";
                        str3 = str2;
                        strM37742 = str3;
                    }
                }
                String str4 = strM37745;
                str2 = strM37743;
                lowerCase = strM37744;
                String str5 = strM37746;
                strM37746 = str4;
                str3 = str5;
            }
            String strM40634 = C17307.m40633(lowerCase);
            String strM40635 = C17307.m40633(strM37746);
            HashMap map = new HashMap(5);
            map.put(EnumC20662.Instance, str2);
            map.put(EnumC20662.Application, strM40634);
            map.put(EnumC20662.Protocol, strM37742);
            map.put(EnumC20662.Domain, strM40635);
            map.put(EnumC20662.Subtype, str3);
            return map;
        }
        lowerCase = "";
        strM37742 = lowerCase;
        strM37746 = strSubstring;
        str2 = strM40633;
        str3 = strM37742;
        String strM40636 = C17307.m40633(lowerCase);
        String strM40637 = C17307.m40633(strM37746);
        HashMap map2 = new HashMap(5);
        map2.put(EnumC20662.Instance, str2);
        map2.put(EnumC20662.Application, strM40636);
        map2.put(EnumC20662.Protocol, strM37742);
        map2.put(EnumC20662.Domain, strM40637);
        map2.put(EnumC20662.Subtype, str3);
        return map2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37742(String str, Matcher matcher, int i) {
        return matcher.start(i) != -1 ? str.substring(matcher.start(i), matcher.end(i)) : "";
    }
}
