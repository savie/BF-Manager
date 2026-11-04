package l;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.֨᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1492 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f5190;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f5191;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Integer f5192;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f5193;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f5194;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Integer f5195;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f5196;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f5197;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f5198;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f5199;

    public C1492(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f5196 = str;
        this.f5191 = i;
        this.f5192 = num;
        this.f5195 = num2;
        this.f5199 = f;
        this.f5198 = z;
        this.f5197 = z2;
        this.f5194 = z3;
        this.f5190 = z4;
        this.f5193 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1492 m5316(String str, C19391 c19391) {
        int i;
        C20782.m47565(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = c19391.f62662;
        if (length != i2) {
            int length2 = strArrSplit.length;
            String str2 = C7116.f23455;
            Locale locale = Locale.US;
            StringBuilder sbM5126 = C1402.m5126("Skipping malformed 'Style:' line (expected ", i2, " values, found ", "): '", length2);
            sbM5126.append(str);
            sbM5126.append("'");
            C1896.m6517(sbM5126.toString());
            return null;
        }
        try {
            String strTrim = strArrSplit[c19391.f62661].trim();
            int i3 = c19391.f62657;
            int i4 = -1;
            int iM5318 = i3 != -1 ? m5318(strArrSplit[i3].trim()) : -1;
            int i5 = c19391.f62656;
            Integer numM5319 = i5 != -1 ? m5319(strArrSplit[i5].trim()) : null;
            int i6 = c19391.f62658;
            Integer numM53110 = i6 != -1 ? m5319(strArrSplit[i6].trim()) : null;
            int i7 = c19391.f62665;
            float f = -3.4028235E38f;
            if (i7 != -1) {
                String strTrim2 = strArrSplit[i7].trim();
                try {
                    f = Float.parseFloat(strTrim2);
                } catch (NumberFormatException e) {
                    C1896.m6514("Failed to parse font size: '" + strTrim2 + "'", e);
                }
            }
            int i8 = c19391.f62664;
            boolean z = false;
            if (i8 != -1 && m5317(strArrSplit[i8].trim())) {
                z = true;
            }
            int i9 = c19391.f62663;
            boolean z2 = i9 != -1 && m5317(strArrSplit[i9].trim());
            int i10 = c19391.f62666;
            boolean z3 = i10 != -1 && m5317(strArrSplit[i10].trim());
            int i11 = c19391.f62660;
            boolean z4 = i11 != -1 && m5317(strArrSplit[i11].trim());
            int i12 = c19391.f62659;
            if (i12 != -1) {
                String strTrim3 = strArrSplit[i12].trim();
                try {
                    int i13 = Integer.parseInt(strTrim3.trim());
                    if (i13 == 1 || i13 == 3) {
                        i4 = i13;
                    } else {
                        C1896.m6517("Ignoring unknown BorderStyle: " + strTrim3);
                    }
                } catch (NumberFormatException unused) {
                }
                i = i4;
            } else {
                i = -1;
            }
            return new C1492(strTrim, iM5318, numM5319, numM53110, f, z, z2, z3, z4, i);
        } catch (RuntimeException e2) {
            C1896.m6514("Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m5318(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i;
                default:
                    C22313.m50377("Ignoring unknown alignment: ", str);
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Integer m5319(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            C20782.m47565(j <= 4294967295L);
            return Integer.valueOf(Color.argb(C18444.m42970(((j >> 24) & 255) ^ 255), C18444.m42970(j & 255), C18444.m42970((j >> 8) & 255), C18444.m42970((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            C1896.m6514("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5317(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            C1896.m6514("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
