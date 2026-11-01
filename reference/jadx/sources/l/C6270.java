package l;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۛ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N8XS */
/* JADX INFO: loaded from: classes2.dex */
public final class C6270 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f21253;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C18917 f21255;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f21254 = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f21256 = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f21253 = Pattern.compile("[ \t\r\n]+");
        f21255 = new C18917();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17349(String str) {
        String str2;
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt != '<') {
                if (cCharAt == '>') {
                    str2 = "&gt;";
                } else if (sb != null) {
                    sb.append(cCharAt);
                }
            } else {
                str2 = "&lt;";
            }
            if (sb == null) {
                sb = new StringBuilder();
                sb.append((CharSequence) str, 0, i);
            }
            sb.append(str2);
        }
        return sb != null ? sb.toString() : str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m17350(String str) {
        if (!f21254.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f21256.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            f21255.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb.append(C11210.m28154(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m17351(String str) {
        String strTrim = str.trim();
        Locale locale = Locale.ROOT;
        return f21253.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }
}
