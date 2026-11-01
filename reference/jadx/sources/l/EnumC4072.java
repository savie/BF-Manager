package l;

import bin.mt.plus.R;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۘܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L73J */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4072 {
    ANY(-1, -1),
    ZERO(0, 1),
    ZERO_TO_TEN_KB(0, 10240),
    TEN_KB_TO_ONE_MB(10240, 1048576),
    ONE_TO_TEN_MB(1048576, 10485760),
    TEN_TO_ONE_HUNDRED_MB(10485760, 104857600),
    ONE_HUNDRED_MB_TO_ONE_GB(104857600, 1073741824),
    AT_LEAST_ONE_GB(1073741824, -1);


    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f14973 = {"B", "KB", "MB", "GB", "TB"};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f14979;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f14980;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long m11596(long j, long j2) {
        if (j != -1 || j2 == -1) {
            return j;
        }
        return 0L;
    }

    EnumC4072(long j, long j2) {
        this.f14980 = j;
        this.f14979 = j2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long m11604() {
        return this.f14980;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long m11605() {
        return this.f14979;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m11603() {
        switch (C13246.f44003[ordinal()]) {
            case 1:
                return C16737.m39288(R.string.MT_Protector);
            case 2:
                return m11600(0L);
            case 3:
                return "0 - " + m11600(10240L);
            case 4:
                return m11601(10240L, 1048576L);
            case 5:
                return m11601(1048576L, 10485760L);
            case 6:
                return m11601(10485760L, 104857600L);
            case 7:
                return m11601(104857600L, 1073741824L);
            case 8:
                return "≥ " + m11600(1073741824L);
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4072 m11599(long j, long j2) {
        for (EnumC4072 enumC4072 : values()) {
            if (enumC4072.f14980 == j && enumC4072.f14979 == j2) {
                return enumC4072;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m11602(long j, long j2) {
        EnumC4072 enumC4072M11599 = m11599(j, j2);
        if (enumC4072M11599 != null) {
            return enumC4072M11599.m11603();
        }
        if (j == -1) {
            return "< " + m11597(j2);
        }
        if (j2 == -1) {
            return "≥ " + m11597(j);
        }
        return m11601(j, j2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m11601(long j, long j2) {
        int iM11595 = m11595(j);
        int iM11596 = m11595(j2);
        StringBuilder sbM8976 = C3012.m8976(iM11595 > iM11596 ? m11598(j, iM11596) : m11597(j), " - ");
        sbM8976.append(m11597(j2));
        return sbM8976.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11597(long j) {
        return j == 0 ? "0" : m11600(j);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m11600(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + "B";
        }
        if (j % 1073741824 == 0) {
            return C15037.m36023(new StringBuilder(), j >> 30, "GB");
        }
        if (j % 1048576 == 0) {
            return C15037.m36023(new StringBuilder(), j >> 20, "MB");
        }
        return j % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS == 0 ? C15037.m36023(new StringBuilder(), j >> 10, "KB") : C1791.m5873(j).replace(" ", "");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m11595(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return 0;
        }
        if (j % 1073741824 == 0) {
            return 3;
        }
        if (j % 1048576 == 0) {
            return 2;
        }
        if (j % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS == 0 || j < 1048576) {
            return 1;
        }
        if (j < 1073741824) {
            return 2;
        }
        return j < 1099511627776L ? 3 : 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11598(long j, int i) {
        while (i > 0) {
            long j2 = 1 << (i * 10);
            if (j % j2 == 0) {
                return (j / j2) + f14973[i];
            }
            i--;
        }
        return j + f14973[0];
    }
}
