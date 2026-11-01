package l;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12992 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Integer f43318;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f43319;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f43320;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f43321;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f43322;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f43323;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f43324;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Integer f43325;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f43326;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f43327;

    public C12992(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f43327 = str;
        this.f43321 = i;
        this.f43325 = num;
        this.f43318 = num2;
        this.f43319 = f;
        this.f43326 = z;
        this.f43322 = z2;
        this.f43323 = z3;
        this.f43320 = z4;
        this.f43324 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12992 m32119(String str, C22164 c22164) {
        int i;
        C2023.m6507(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = c22164.f72500;
        if (length != i2) {
            int length2 = strArrSplit.length;
            String str2 = C17983.f57504;
            Locale locale = Locale.US;
            StringBuilder sbM2791 = C0589.m2791("Skipping malformed 'Style:' line (expected ", i2, " values, found ", "): '", length2);
            sbM2791.append(str);
            sbM2791.append("'");
            C0303.m1848(sbM2791.toString());
            return null;
        }
        try {
            String strTrim = strArrSplit[c22164.f72491].trim();
            int i3 = c22164.f72494;
            int i4 = -1;
            int iM32121 = i3 != -1 ? m32121(strArrSplit[i3].trim()) : -1;
            int i5 = c22164.f72493;
            Integer numM32117 = i5 != -1 ? m32117(strArrSplit[i5].trim()) : null;
            int i6 = c22164.f72498;
            Integer numM32118 = i6 != -1 ? m32117(strArrSplit[i6].trim()) : null;
            int i7 = c22164.f72492;
            float f = -3.4028235E38f;
            if (i7 != -1) {
                String strTrim2 = strArrSplit[i7].trim();
                try {
                    f = Float.parseFloat(strTrim2);
                } catch (NumberFormatException e) {
                    C0303.m1852("Failed to parse font size: '" + strTrim2 + "'", e);
                }
            }
            int i8 = c22164.f72499;
            boolean z = false;
            if (i8 != -1 && m32120(strArrSplit[i8].trim())) {
                z = true;
            }
            int i9 = c22164.f72495;
            boolean z2 = i9 != -1 && m32120(strArrSplit[i9].trim());
            int i10 = c22164.f72501;
            boolean z3 = i10 != -1 && m32120(strArrSplit[i10].trim());
            int i11 = c22164.f72496;
            boolean z4 = i11 != -1 && m32120(strArrSplit[i11].trim());
            int i12 = c22164.f72497;
            if (i12 != -1) {
                String strTrim3 = strArrSplit[i12].trim();
                try {
                    int i13 = Integer.parseInt(strTrim3.trim());
                    if (i13 == 1 || i13 == 3) {
                        i4 = i13;
                    } else {
                        C0303.m1848("Ignoring unknown BorderStyle: " + strTrim3);
                    }
                } catch (NumberFormatException unused) {
                }
                i = i4;
            } else {
                i = -1;
            }
            return new C12992(strTrim, iM32121, numM32117, numM32118, f, z, z2, z3, z4, i);
        } catch (RuntimeException e2) {
            C0303.m1852("Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m32121(String str) {
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
                    C16523.m38891("Ignoring unknown alignment: ", str);
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Integer m32117(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            C2023.m6507(j <= 4294967295L);
            return Integer.valueOf(Color.argb(C17039.m39818(((j >> 24) & 255) ^ 255), C17039.m39818(j & 255), C17039.m39818((j >> 8) & 255), C17039.m39818((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            C0303.m1852("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m32120(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            C0303.m1852("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
