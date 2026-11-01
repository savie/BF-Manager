package l;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8SM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3113 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f11725 = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m9340(C2460 c2460) {
        int iM7500 = c2460.m7500();
        if (m9342(c2460)) {
            return;
        }
        c2460.m7510(iM7500);
        throw C22861.m50610("Expected WEBVTT. Got " + c2460.m7523(StandardCharsets.UTF_8), (Throwable) null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m9342(C2460 c2460) {
        c2460.getClass();
        String strM7523 = c2460.m7523(StandardCharsets.UTF_8);
        return strM7523 != null && strM7523.startsWith("WEBVTT");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m9341(String str) {
        String str2 = C17983.f57504;
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
    public static float m9338(String str) {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Matcher m9339(C2460 c2460) {
        String strM7523;
        while (true) {
            String strM7524 = c2460.m7523(StandardCharsets.UTF_8);
            if (strM7524 == null) {
                return null;
            }
            if (f11725.matcher(strM7524).matches()) {
                do {
                    strM7523 = c2460.m7523(StandardCharsets.UTF_8);
                    if (strM7523 == null) {
                        break;
                    }
                } while (!strM7523.isEmpty());
            } else {
                Matcher matcher = C1702.f6726.matcher(strM7524);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
