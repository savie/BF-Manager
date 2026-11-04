package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LO */
/* JADX INFO: loaded from: classes.dex */
public final class C21966 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70903 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f70904 = Pattern.compile(".*");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m49709(String str) {
        if (str.equals("*")) {
            return ".*";
        }
        String strReplace = str.replace(".", "\\.");
        if (!strReplace.endsWith("*")) {
            return strReplace;
        }
        return strReplace.substring(0, strReplace.length() - 1) + ".+";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pattern m49708(String str) {
        String strM49709 = m49709(str);
        if (strM49709 == ".*") {
            return f70904;
        }
        return Pattern.compile(strM49709);
    }
}
