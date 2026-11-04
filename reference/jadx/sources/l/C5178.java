package l;

import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O7JJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5178 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15607(String str, String str2) {
        LinkedHashSet<String> linkedHashSetM7502 = C2195.m7502(str);
        if (linkedHashSetM7502 != null && !linkedHashSetM7502.isEmpty()) {
            for (String str3 : linkedHashSetM7502) {
                String strM15608 = m15608(Pattern.compile(C17370.m40798("％" + str3.replace("$", " $ ").substring(1)), 66), str2, str3);
                if (strM15608 == null) {
                    strM15608 = m15608(Pattern.compile(C17370.m40798("％" + str3.replace("$", "个$ ").substring(1)), 66), str2, str3);
                }
                if (strM15608 == null) {
                    int iIndexOf = str3.indexOf(36);
                    if (iIndexOf > 1) {
                        String strM15609 = m15608(Pattern.compile(C17370.m40798("% " + str3.substring(1, iIndexOf) + " " + str3.substring(iIndexOf)), 66), str2, str3);
                        strM15608 = strM15609 == null ? m15608(Pattern.compile(C17370.m40798("% " + str3.substring(1, iIndexOf) + " $ " + str3.substring(iIndexOf + 1)), 66), str2, str3) : strM15609;
                    } else {
                        strM15608 = m15608(Pattern.compile(C17370.m40798("% " + str3.substring(1)), 66), str2, str3);
                    }
                }
                if (strM15608 != null) {
                    str2 = strM15608;
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15608(Pattern pattern, String str, String str2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(str2);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd < str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }
}
