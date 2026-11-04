package l;

/* JADX INFO: renamed from: l.۬ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8DO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13892 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f44049 = {3, 3, 3, 3, 2, 2, 3};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f44050 = {1, 2, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f44051;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44052;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f44053;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f44054;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f44055;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f44056;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f44057;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f44058;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f44059;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33838(byte[] bArr) {
        bArr[0] = (byte) this.f44055;
        bArr[1] = (byte) this.f44052;
        bArr[2] = (byte) this.f44058;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33840(int i, C21287 c21287) throws C2970 {
        m33841();
        int iM48516 = c21287.m48516();
        int i2 = 0;
        if (c21287.m48486() < 2) {
            return false;
        }
        this.f44054 = m33837(c21287);
        this.f44053 = c21287.m48516() - iM48516;
        int iM48493 = c21287.m48493();
        this.f44059 = 1;
        if (iM48493 == 240) {
            this.f44055 = iM48493;
            while (c21287.m48493() != 247) {
            }
        } else if (iM48493 == 255) {
            int iM48494 = c21287.m48493();
            int iM33837 = m33837(c21287);
            this.f44055 = iM48493;
            if (iM48494 == 47) {
                c21287.m48510(iM48516);
                m33841();
                return false;
            }
            if (iM48494 == 81) {
                long jM48501 = c21287.m48501();
                this.f44051 = jM48501;
                if (jM48501 <= 0) {
                    throw C2970.m9689("Tempo event data value must be a non-zero positive value. Parsed value: " + this.f44051);
                }
                c21287.m48503(iM33837 - 3);
            } else {
                c21287.m48503(iM33837);
            }
        } else {
            boolean z = iM48493 < 128;
            if (!z) {
                i = iM48493;
            } else {
                if (i == Integer.MIN_VALUE) {
                    throw C2970.m9688("Running status in the first event.", (Throwable) null);
                }
                this.f44052 = iM48493;
                this.f44059 = 2;
            }
            if (i >= 128 && i <= 255) {
                if (i >= 240) {
                    i2 = f44050[i & 15];
                } else {
                    i2 = f44049[(i >> 4) & 7];
                }
            }
            if (!z && i2 > this.f44059) {
                this.f44052 = c21287.m48493();
                this.f44059++;
            }
            if (i2 > this.f44059) {
                this.f44058 = c21287.m48493();
                this.f44059++;
            }
            this.f44055 = i;
        }
        this.f44057 = c21287.m48516() - iM48516;
        c21287.m48510(iM48516);
        this.f44056 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33839() {
        return this.f44056;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33841() {
        this.f44056 = false;
        this.f44053 = -1;
        this.f44055 = Integer.MIN_VALUE;
        this.f44052 = Integer.MIN_VALUE;
        this.f44058 = Integer.MIN_VALUE;
        this.f44054 = -1L;
        this.f44057 = -1;
        this.f44059 = -1;
        this.f44051 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33837(C21287 c21287) {
        int i = 0;
        int i2 = 0;
        do {
            int iM48493 = c21287.m48493();
            i = (i << 7) | (iM48493 & 127);
            i2++;
            if ((iM48493 & 128) == 0) {
                break;
            }
        } while (i2 <= 4);
        return i;
    }
}
