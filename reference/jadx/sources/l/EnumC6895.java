package l;

import bin.mt.plus.R;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ۜܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L73K */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6895 {
    ANY(0, -1, 0, R.string.MT_Protector),
    TODAY(1, 0, 0, R.string.MT_Protector),
    YESTERDAY(2, 0, -1, R.string.MT_Protector),
    THIS_WEEK(3, 1, 0, R.string.MT_Protector),
    LAST_WEEK(4, 1, -1, R.string.MT_Protector),
    THIS_MONTH(5, 2, 0, R.string.MT_Protector),
    LAST_MONTH(6, 2, -1, R.string.MT_Protector),
    THIS_YEAR(7, 3, 0, R.string.MT_Protector);


    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String f23212 = " ";

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f23213;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f23214;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f23215;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f23216;

    EnumC6895(int i, int i2, int i3, int i4) {
        this.f23215 = i;
        this.f23213 = i2;
        this.f23216 = i3;
        this.f23214 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long[] m18507(long j) {
        int i = 2;
        if (this.f23213 == -1) {
            return new long[]{-1, -1};
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i2 = this.f23216;
        if (i2 != 0) {
            int i3 = this.f23213;
            if (i3 == 0) {
                i = 5;
            } else if (i3 == 1) {
                i = 3;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException();
                }
                i = 1;
            }
            calendar.add(i, i2);
        }
        return C8909.m23180(this.f23213, calendar.getTimeInMillis());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m18506() {
        return C16737.m39288(this.f23214);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m18508() {
        return this.f23215;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC6895 m18504(int i) {
        for (EnumC6895 enumC6895 : values()) {
            if (enumC6895 != ANY && enumC6895.f23215 == i) {
                return enumC6895;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18503(long j, long j2) {
        if (j == -1 && j2 == -1) {
            return ANY.m18506();
        }
        if (j == -1) {
            return "< " + C5319.m14739(j2);
        }
        if (j2 == -1) {
            return "≥ " + C5319.m14739(j);
        }
        return C5319.m14739(j) + " - " + C5319.m14739(j2);
    }
}
