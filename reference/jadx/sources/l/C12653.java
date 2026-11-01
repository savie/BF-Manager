package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12653 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f42264 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f42265 = Pattern.compile(".*");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m31450(String str) {
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
    public static Pattern m31449(String str) {
        String strM31450 = m31450(str);
        if (strM31450 == ".*") {
            return f42265;
        }
        return Pattern.compile(strM31450);
    }
}
