package l;

/* JADX INFO: renamed from: l.ۛۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M6PN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6319 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final char[] f21417 = new char[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[][] f21418 = new char[16][];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f21419;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f21420;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f21421;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m18035(int i) {
        return (-8) & ((((long) i) * 2) + 23);
    }

    public C6319(long j) {
        this.f21421 = Math.min(65536L, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m18038(int i) {
        int i2 = this.f21419;
        do {
            i2--;
            if (i2 < 0) {
                return null;
            }
        } while (this.f21418[i2].length != i);
        return m18034(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18037(char[] cArr) {
        int length = cArr.length;
        long jM18035 = m18035(length);
        if (length < 16 || length > 8192 || (length & (length - 1)) != 0) {
            return false;
        }
        int i = this.f21419;
        char[][] cArr2 = this.f21418;
        if (i == cArr2.length) {
            return false;
        }
        long j = this.f21420;
        if (jM18035 > this.f21421 - j) {
            return false;
        }
        this.f21419 = i + 1;
        cArr2[i] = cArr;
        this.f21420 = j + jM18035;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m18036() {
        int i = this.f21419;
        if (i == 0) {
            return 0L;
        }
        return m18035(m18034(i - 1).length);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private char[] m18034(int i) {
        char[][] cArr = this.f21418;
        char[] cArr2 = cArr[i];
        int i2 = this.f21419 - 1;
        this.f21419 = i2;
        cArr[i] = cArr[i2];
        cArr[i2] = null;
        this.f21420 -= m18035(cArr2.length);
        return cArr2;
    }
}
