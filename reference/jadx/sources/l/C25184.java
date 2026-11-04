package l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.᩻ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C5LF */
/* JADX INFO: loaded from: classes.dex */
public final class C25184 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BigInteger f81399;

    public C25184(String str, int i) {
        String strReplace = str.replace(" ", "").replace("_", "");
        if (strReplace.startsWith("-")) {
            try {
                strReplace = Integer.toHexString(Integer.parseInt(strReplace, i));
                i = 16;
            } catch (NumberFormatException unused) {
            }
        }
        this.f81399 = new BigInteger(strReplace, i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m56144() {
        BigInteger bigInteger = this.f81399;
        if (bigInteger.intValue() < 0) {
            return bigInteger.toString(10) + ", " + bigInteger.intValue() + " (32bit)";
        }
        return bigInteger.toString(10);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m56146() {
        return m56142(4, this.f81399.toString(2), "0b");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56142(int i, String str, String str2) {
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m56147() {
        return m56142(8, this.f81399.toString(16).toUpperCase(), "0x");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m56145() {
        return m56142(4, this.f81399.toString(8), "0_");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56143() {
        return this.f81399.intValue();
    }
}
