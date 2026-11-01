package l;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۢۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R4F7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9501 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f32147;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f32148;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f32149;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f32146 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f32145 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public C9501(String str, String str2, String str3) {
        this.f32149 = str;
        this.f32148 = str2;
        this.f32147 = str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9501 m24336(String str) {
        Matcher matcher = f32146.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f32145.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = C20630.m46498(1, 1, strGroup3);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    StringBuilder sbM30515 = C12278.m30515("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \"");
                    sbM30515.append(str);
                    sbM30515.append('\"');
                    throw new IllegalArgumentException(sbM30515.toString());
                }
                str2 = strGroup3;
            }
        }
        return new C9501(str, lowerCase, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24337() {
        return this.f32148;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Charset m24338(Charset charset) {
        try {
            String str = this.f32147;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String toString() {
        return this.f32149;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9501) && ((C9501) obj).f32149.equals(this.f32149);
    }

    public final int hashCode() {
        return this.f32149.hashCode();
    }
}
