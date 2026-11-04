package l;

import bin.mt.plus.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܳ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N33Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C15701 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f51025 = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f51026 = new SimpleDateFormat("MM-dd");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37478(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis >= 0) {
            long j2 = jCurrentTimeMillis / 1000;
            if (j2 < 60) {
                int i = (int) j2;
                return C21576.m49055().getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i));
            }
            long j3 = j2 / 60;
            if (j3 < 60) {
                int i2 = (int) j3;
                return C21576.m49055().getQuantityString(R.plurals.MT_Protector, i2, Integer.valueOf(i2));
            }
            long j4 = j3 / 60;
            if (j4 < 24) {
                int i3 = (int) j4;
                return C21576.m49055().getQuantityString(R.plurals.MT_Protector, i3, Integer.valueOf(i3));
            }
            long j5 = j4 / 24;
            if (j5 < 31) {
                int i4 = (int) j5;
                return C21576.m49055().getQuantityString(R.plurals.MT_Protector, i4, Integer.valueOf(i4));
            }
        }
        if (new Date().getYear() != new Date(j).getYear()) {
            return f51025.format(Long.valueOf(j));
        }
        return f51026.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Long m37477(C8826 c8826) {
        Long lM23696 = c8826.m23696();
        if (lM23696 == null && (lM23696 = c8826.m23693()) != null && c8826.m23692("OffsetTimeOriginal") == null) {
            lM23696 = Long.valueOf(lM23696.longValue() - ((long) TimeZone.getDefault().getRawOffset()));
        }
        if (lM23696 == null && (lM23696 = c8826.m23695()) != null && c8826.m23692("OffsetTimeDigitized") == null) {
            lM23696 = Long.valueOf(lM23696.longValue() - ((long) TimeZone.getDefault().getRawOffset()));
        }
        return (lM23696 == null && (lM23696 = c8826.m23691()) != null && c8826.m23692("OffsetTime") == null) ? Long.valueOf(lM23696.longValue() - ((long) TimeZone.getDefault().getRawOffset())) : lM23696;
    }
}
