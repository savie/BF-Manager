package l;

/* JADX INFO: renamed from: l.᩸ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6PN */
/* JADX INFO: loaded from: classes4.dex */
public final class C21716 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final char[] f70407 = new char[0];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f70408;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[][] f70409 = new char[16][];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f70410;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f70411;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m48454(int i) {
        return (-8) & ((((long) i) * 2) + 23);
    }

    public C21716(long j) {
        this.f70408 = Math.min(65536L, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m48457(int i) {
        int i2 = this.f70410;
        do {
            i2--;
            if (i2 < 0) {
                return null;
            }
        } while (this.f70409[i2].length != i);
        return m48453(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48456(char[] cArr) {
        int length = cArr.length;
        long jM48454 = m48454(length);
        if (length < 16 || length > 8192 || (length & (length - 1)) != 0) {
            return false;
        }
        int i = this.f70410;
        char[][] cArr2 = this.f70409;
        if (i == cArr2.length) {
            return false;
        }
        long j = this.f70411;
        if (jM48454 > this.f70408 - j) {
            return false;
        }
        this.f70410 = i + 1;
        cArr2[i] = cArr;
        this.f70411 = j + jM48454;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m48455() {
        int i = this.f70410;
        if (i == 0) {
            return 0L;
        }
        return m48454(m48453(i - 1).length);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private char[] m48453(int i) {
        char[][] cArr = this.f70409;
        char[] cArr2 = cArr[i];
        int i2 = this.f70410 - 1;
        this.f70410 = i2;
        cArr[i] = cArr[i2];
        cArr[i2] = null;
        this.f70411 -= m48454(cArr2.length);
        return cArr2;
    }
}
