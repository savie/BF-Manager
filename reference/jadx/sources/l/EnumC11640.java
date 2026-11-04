package l;

import bin.mt.plus.R;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۧ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L73J */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11640 {
    ANY(-1, -1),
    ZERO(0, 1),
    ZERO_TO_TEN_KB(0, 10240),
    TEN_KB_TO_ONE_MB(10240, 1048576),
    ONE_TO_TEN_MB(1048576, 10485760),
    TEN_TO_ONE_HUNDRED_MB(10485760, 104857600),
    ONE_HUNDRED_MB_TO_ONE_GB(104857600, 1073741824),
    AT_LEAST_ONE_GB(1073741824, -1);


    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String[] f36494 = {"B", "KB", "MB", "GB", "TB"};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f36503;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f36504;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long m29243(long j, long j2) {
        if (j != -1 || j2 == -1) {
            return j;
        }
        return 0L;
    }

    EnumC11640(long j, long j2) {
        this.f36504 = j;
        this.f36503 = j2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long m29245() {
        return this.f36504;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long m29246() {
        return this.f36503;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m29244() {
        switch (C1946.f6511[ordinal()]) {
            case 1:
                return C21576.m49088(R.string.MT_Protector);
            case 2:
                return m29238(0L);
            case 3:
                return "0 - " + m29238(10240L);
            case 4:
                return m29239(10240L, 1048576L);
            case 5:
                return m29239(1048576L, 10485760L);
            case 6:
                return m29239(10485760L, 104857600L);
            case 7:
                return m29239(104857600L, 1073741824L);
            case 8:
                return "≥ " + m29238(1073741824L);
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC11640 m29237(long j, long j2) {
        for (EnumC11640 enumC11640 : values()) {
            if (enumC11640.f36504 == j && enumC11640.f36503 == j2) {
                return enumC11640;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m29241(long j, long j2) {
        EnumC11640 enumC11640M29237 = m29237(j, j2);
        if (enumC11640M29237 != null) {
            return enumC11640M29237.m29244();
        }
        if (j == -1) {
            return "< " + m29235(j2);
        }
        if (j2 == -1) {
            return "≥ " + m29235(j);
        }
        return m29239(j, j2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m29239(long j, long j2) {
        int iM29242 = m29242(j);
        int iM29243 = m29242(j2);
        StringBuilder sbM10405 = C3188.m10405(iM29242 > iM29243 ? m29236(j, iM29243) : m29235(j), " - ");
        sbM10405.append(m29235(j2));
        return sbM10405.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29235(long j) {
        return j == 0 ? "0" : m29238(j);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m29238(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + "B";
        }
        if (j % 1073741824 == 0) {
            return C2764.m9137(new StringBuilder(), j >> 30, "GB");
        }
        if (j % 1048576 == 0) {
            return C2764.m9137(new StringBuilder(), j >> 20, "MB");
        }
        return j % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS == 0 ? C2764.m9137(new StringBuilder(), j >> 10, "KB") : C8311.m22393(j).replace(" ", "");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m29242(long j) {
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
    public static String m29236(long j, int i) {
        while (i > 0) {
            long j2 = 1 << (i * 10);
            if (j % j2 == 0) {
                return (j / j2) + f36494[i];
            }
            i--;
        }
        return j + f36494[0];
    }
}
