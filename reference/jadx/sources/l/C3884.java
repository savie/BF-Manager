package l;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۘۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S8SM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3884 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f13254 = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m12523(C21287 c21287) {
        int iM48516 = c21287.m48516();
        if (m12525(c21287)) {
            return;
        }
        c21287.m48510(iM48516);
        throw C2970.m9688("Expected WEBVTT. Got " + c21287.m48515(StandardCharsets.UTF_8), (Throwable) null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m12525(C21287 c21287) {
        c21287.getClass();
        String strM48515 = c21287.m48515(StandardCharsets.UTF_8);
        return strM48515 != null && strM48515.startsWith("WEBVTT");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m12524(String str) {
        String str2 = C7116.f23455;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() == 3) {
                j2 += Long.parseLong(strTrim);
            } else {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
        }
        return j2 * 1000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m12521(String str) {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Matcher m12522(C21287 c21287) {
        String strM48515;
        while (true) {
            String strM48516 = c21287.m48515(StandardCharsets.UTF_8);
            if (strM48516 == null) {
                return null;
            }
            if (f13254.matcher(strM48516).matches()) {
                do {
                    strM48515 = c21287.m48515(StandardCharsets.UTF_8);
                    if (strM48515 == null) {
                        break;
                    }
                } while (!strM48515.isEmpty());
            } else {
                Matcher matcher = C6122.f20889.matcher(strM48516);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
