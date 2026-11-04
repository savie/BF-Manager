package l;

import bin.mt.plus.R;
import java.util.Calendar;

/* JADX INFO: renamed from: l.᩻۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L73K */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC25067 {
    ANY(0, -1, 0, R.string.MT_Protector),
    TODAY(1, 0, 0, R.string.MT_Protector),
    YESTERDAY(2, 0, -1, R.string.MT_Protector),
    THIS_WEEK(3, 1, 0, R.string.MT_Protector),
    LAST_WEEK(4, 1, -1, R.string.MT_Protector),
    THIS_MONTH(5, 2, 0, R.string.MT_Protector),
    LAST_MONTH(6, 2, -1, R.string.MT_Protector),
    THIS_YEAR(7, 3, 0, R.string.MT_Protector);


    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String f81077 = " ";

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f81081;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f81082;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f81083;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f81084;

    EnumC25067(int i, int i2, int i3, int i4) {
        this.f81081 = i;
        this.f81083 = i2;
        this.f81084 = i3;
        this.f81082 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long[] m55898(long j) {
        int i = 2;
        if (this.f81083 == -1) {
            return new long[]{-1, -1};
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i2 = this.f81084;
        if (i2 != 0) {
            int i3 = this.f81083;
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
        return C17059.m40193(this.f81083, calendar.getTimeInMillis());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m55897() {
        return C21576.m49088(this.f81082);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m55899() {
        return this.f81081;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC25067 m55895(int i) {
        for (EnumC25067 enumC25067 : values()) {
            if (enumC25067 != ANY && enumC25067.f81081 == i) {
                return enumC25067;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m55894(long j, long j2) {
        if (j == -1 && j2 == -1) {
            return ANY.m55897();
        }
        if (j == -1) {
            return "< " + C22482.m50713(j2);
        }
        if (j2 == -1) {
            return "≥ " + C22482.m50713(j);
        }
        return C22482.m50713(j) + " - " + C22482.m50713(j2);
    }
}
