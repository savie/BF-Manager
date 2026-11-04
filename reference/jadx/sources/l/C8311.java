package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.۠֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35B7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8311 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22392(int i) {
        int i2;
        if (i < -1) {
            return false;
        }
        return i == -1 || (i2 = i & 255) == 0 || i2 == 255 || (i & 65280) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22390(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + "B";
        }
        if (j < 1048576) {
            return m22391("K", j / 1024.0d);
        }
        if (j < 1073741824) {
            return m22391("M", j / 1048576.0d);
        }
        if (j < 1099511627776L) {
            return m22391("G", j / 1.073741824E9d);
        }
        return m22391("T", j / 1.099511627776E12d);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m22393(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + " B";
        }
        if (j < 1048576) {
            return m22391(" KB", j / 1024.0d);
        }
        if (j < 1073741824) {
            return m22391(" MB", j / 1048576.0d);
        }
        if (j < 1099511627776L) {
            return m22391(" GB", j / 1.073741824E9d);
        }
        return m22391(" TB", j / 1.099511627776E12d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22391(String str, double d) {
        long jRound = Math.round(d * 100.0d);
        boolean z = jRound < 0;
        if (z) {
            jRound = -jRound;
        }
        long j = jRound / 100;
        long j2 = jRound % 100;
        StringBuilder sb = new StringBuilder(str.length() + 7);
        if (z) {
            sb.append('-');
        }
        sb.append(j);
        sb.append('.');
        if (j2 < 10) {
            sb.append('0');
        }
        return C2764.m9137(sb, j2, str);
    }
}
