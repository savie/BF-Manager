package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۠ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: P7KL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8336 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashSet m21765(String str) {
        int iM21766;
        HashSet hashSet = new HashSet();
        if (!str.isEmpty()) {
            char cM9601 = C3184.m9601(1, str);
            boolean z = cM9601 == '\n' || cM9601 == '\r';
            String[] strArrSplit = str.split("\\R");
            int length = strArrSplit.length;
            String str2 = length == 0 ? "" : strArrSplit[length - 1];
            if (z) {
                iM21766 = 0;
            } else {
                iM21766 = m21766(str2);
                for (String str3 : strArrSplit) {
                    int length2 = str3.length();
                    int iCharCount = 0;
                    while (iCharCount < length2) {
                        int iCodePointAt = str3.codePointAt(iCharCount);
                        if (!Character.isWhitespace(iCodePointAt)) {
                            iM21766 = Math.min(iM21766, m21766(str3));
                            if (iM21766 != 0) {
                                break;
                            }
                            break;
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
            }
            String strSubstring = str2.substring(0, iM21766);
            for (String str4 : strArrSplit) {
                int length3 = str4.length();
                int iCharCount2 = 0;
                while (iCharCount2 < length3) {
                    int iCodePointAt2 = str4.codePointAt(iCharCount2);
                    if (!Character.isWhitespace(iCodePointAt2)) {
                        if (!str4.startsWith(strSubstring)) {
                            hashSet.add(EnumC18919.INCONSISTENT);
                            break;
                        }
                        break;
                    }
                    iCharCount2 += Character.charCount(iCodePointAt2);
                }
                if (iM21766 < str4.length() && Character.isWhitespace(str4.charAt(str4.length() - 1))) {
                    hashSet.add(EnumC18919.TRAILING);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m21766(String str) {
        int length = str.length();
        int length2 = str.length();
        int iCharCount = 0;
        while (iCharCount < length2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return length - str.substring(iCharCount, length2).length();
    }
}
