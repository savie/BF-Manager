package l;

/* JADX INFO: renamed from: l.ᩳ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8DO */
/* JADX INFO: loaded from: classes4.dex */
public final class C18273 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int[] f58298 = {3, 3, 3, 3, 2, 2, 3};

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int[] f58299 = {1, 2, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f58300;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f58301;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f58302;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58303;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f58304;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f58305;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f58306;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f58307;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f58308;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42460(byte[] bArr) {
        bArr[0] = (byte) this.f58300;
        bArr[1] = (byte) this.f58303;
        bArr[2] = (byte) this.f58307;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42462(int i, C2460 c2460) throws C22861 {
        m42463();
        int iM7500 = c2460.m7500();
        int i2 = 0;
        if (c2460.m7503() < 2) {
            return false;
        }
        this.f58305 = m42459(c2460);
        this.f58306 = c2460.m7500() - iM7500;
        int iM7516 = c2460.m7516();
        this.f58301 = 1;
        if (iM7516 == 240) {
            this.f58300 = iM7516;
            while (c2460.m7516() != 247) {
            }
        } else if (iM7516 == 255) {
            int iM7517 = c2460.m7516();
            int iM42459 = m42459(c2460);
            this.f58300 = iM7516;
            if (iM7517 == 47) {
                c2460.m7510(iM7500);
                m42463();
                return false;
            }
            if (iM7517 == 81) {
                long jM7525 = c2460.m7525();
                this.f58302 = jM7525;
                if (jM7525 <= 0) {
                    throw C22861.m50611("Tempo event data value must be a non-zero positive value. Parsed value: " + this.f58302);
                }
                c2460.m7535(iM42459 - 3);
            } else {
                c2460.m7535(iM42459);
            }
        } else {
            boolean z = iM7516 < 128;
            if (!z) {
                i = iM7516;
            } else {
                if (i == Integer.MIN_VALUE) {
                    throw C22861.m50610("Running status in the first event.", (Throwable) null);
                }
                this.f58303 = iM7516;
                this.f58301 = 2;
            }
            if (i >= 128 && i <= 255) {
                if (i >= 240) {
                    i2 = f58299[i & 15];
                } else {
                    i2 = f58298[(i >> 4) & 7];
                }
            }
            if (!z && i2 > this.f58301) {
                this.f58303 = c2460.m7516();
                this.f58301++;
            }
            if (i2 > this.f58301) {
                this.f58307 = c2460.m7516();
                this.f58301++;
            }
            this.f58300 = i;
        }
        this.f58304 = c2460.m7500() - iM7500;
        c2460.m7510(iM7500);
        this.f58308 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42461() {
        return this.f58308;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42463() {
        this.f58308 = false;
        this.f58306 = -1;
        this.f58300 = Integer.MIN_VALUE;
        this.f58303 = Integer.MIN_VALUE;
        this.f58307 = Integer.MIN_VALUE;
        this.f58305 = -1L;
        this.f58304 = -1;
        this.f58301 = -1;
        this.f58302 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m42459(C2460 c2460) {
        int i = 0;
        int i2 = 0;
        do {
            int iM7516 = c2460.m7516();
            i = (i << 7) | (iM7516 & 127);
            i2++;
            if ((iM7516 & 128) == 0) {
                break;
            }
        } while (i2 <= 4);
        return i;
    }
}
