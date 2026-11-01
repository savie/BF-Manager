package l;

import android.os.Build;

/* JADX INFO: renamed from: l.ۡ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AQD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8538 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22292(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (str.length() > 1 && str.charAt(0) == '+') {
                str = str.substring(1);
            }
            long j = Long.parseLong(str, 16);
            if ((4294967295L & j) == j) {
                return (int) j;
            }
            throw new NumberFormatException(C16523.m38890("Input ", str, " in base 16 is not in the range of an unsigned integer"));
        }
        int length = str.length();
        if (length <= 0) {
            throw new NumberFormatException(C16523.m38890("For input string: \"", str, "\""));
        }
        if (str.charAt(0) == '-') {
            throw new NumberFormatException(C16523.m38890("Illegal leading minus sign on unsigned string ", str, "."));
        }
        if (length <= 5) {
            return Integer.parseInt(str, 16);
        }
        long j2 = Long.parseLong(str, 16);
        if (((-4294967296L) & j2) == 0) {
            return (int) j2;
        }
        throw new NumberFormatException(C16523.m38890("String value ", str, " exceeds range of unsigned int."));
    }
}
