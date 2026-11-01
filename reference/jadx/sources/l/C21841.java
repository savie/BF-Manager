package l;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Calendar;

/* JADX INFO: renamed from: l.᩸᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C21841 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Serializable f70902;

    public C21841(String str, int i) {
        String strReplace = str.replace(" ", "").replace("_", "");
        if (strReplace.startsWith("-")) {
            try {
                strReplace = Integer.toHexString(Integer.parseInt(strReplace, i));
                i = 16;
            } catch (NumberFormatException unused) {
            }
        }
        this.f70902 = new BigInteger(strReplace, i);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.Serializable, long[]] */
    public C21841() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(10, -24);
        this.f70902 = new long[]{jCurrentTimeMillis - 600000, jCurrentTimeMillis - 3600000, timeInMillis, calendar.getTimeInMillis(), jCurrentTimeMillis - 604800000, jCurrentTimeMillis - 2592000000L};
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String m48612() {
        BigInteger bigInteger = (BigInteger) this.f70902;
        if (bigInteger.intValue() < 0) {
            return bigInteger.toString(10) + ", " + bigInteger.intValue() + " (32bit)";
        }
        return bigInteger.toString(10);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m48610(long j) {
        long[] jArr = (long[]) this.f70902;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j > jArr[i]) {
                return i;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String m48613() {
        return m48607(4, ((BigInteger) this.f70902).toString(2), "0b");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48607(int i, String str, String str2) {
        int length;
        if (str.length() > 0 && str.charAt(0) == '-') {
            str2 = "-".concat(str2);
            str = str.substring(1);
        }
        StringBuilder sb = new StringBuilder(str2);
        if (str.length() % i != 0) {
            length = i - (str.length() % i);
            for (int i2 = 0; i2 < length; i2++) {
                sb.append('0');
            }
        } else {
            length = 0;
        }
        for (char c : str.toCharArray()) {
            if (length > 0 && length % i == 0) {
                sb.append('_');
            }
            sb.append(c);
            length++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String m48608() {
        return m48607(8, ((BigInteger) this.f70902).toString(16).toUpperCase(), "0x");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String m48611() {
        return m48607(4, ((BigInteger) this.f70902).toString(8), "0_");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m48609() {
        return ((BigInteger) this.f70902).intValue();
    }
}
