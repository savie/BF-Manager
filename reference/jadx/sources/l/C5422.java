package l;

import bin.mt.plus.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۚܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N33Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C5422 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f18722 = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f18723 = new SimpleDateFormat("MM-dd");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14997(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis >= 0) {
            long j2 = jCurrentTimeMillis / 1000;
            if (j2 < 60) {
                int i = (int) j2;
                return C16737.m39279().getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i));
            }
            long j3 = j2 / 60;
            if (j3 < 60) {
                int i2 = (int) j3;
                return C16737.m39279().getQuantityString(R.plurals.MT_Protector, i2, Integer.valueOf(i2));
            }
            long j4 = j3 / 60;
            if (j4 < 24) {
                int i3 = (int) j4;
                return C16737.m39279().getQuantityString(R.plurals.MT_Protector, i3, Integer.valueOf(i3));
            }
            long j5 = j4 / 24;
            if (j5 < 31) {
                int i4 = (int) j5;
                return C16737.m39279().getQuantityString(R.plurals.MT_Protector, i4, Integer.valueOf(i4));
            }
        }
        if (new Date().getYear() != new Date(j).getYear()) {
            return f18722.format(Long.valueOf(j));
        }
        return f18723.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Long m14996(C3021 c3021) {
        Long lM9017 = c3021.m9017();
        if (lM9017 == null && (lM9017 = c3021.m9014()) != null && c3021.m9016("OffsetTimeOriginal") == null) {
            lM9017 = Long.valueOf(lM9017.longValue() - ((long) TimeZone.getDefault().getRawOffset()));
        }
        if (lM9017 == null && (lM9017 = c3021.m9018()) != null && c3021.m9016("OffsetTimeDigitized") == null) {
            lM9017 = Long.valueOf(lM9017.longValue() - ((long) TimeZone.getDefault().getRawOffset()));
        }
        return (lM9017 == null && (lM9017 = c3021.m9019()) != null && c3021.m9016("OffsetTime") == null) ? Long.valueOf(lM9017.longValue() - ((long) TimeZone.getDefault().getRawOffset())) : lM9017;
    }
}
