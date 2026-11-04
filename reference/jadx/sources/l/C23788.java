package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩹᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8PU */
/* JADX INFO: loaded from: classes.dex */
public final class C23788 implements InterfaceC17207 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f77048;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f77054;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f77057;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f77046 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f77051 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f77058 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f77049 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f77044 = 0.97f;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f77050 = 1.03f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f77045 = 1.0f;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f77056 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f77047 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f77055 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f77053 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f77052 = -9223372036854775807L;

    public C23788(float f, long j, long j2) {
        this.f77054 = j;
        this.f77057 = j2;
        this.f77048 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53063(C3716 c3716) {
        this.f77046 = C7116.m19474(c3716.f12772);
        this.f77058 = C7116.m19474(c3716.f12771);
        this.f77049 = C7116.m19474(c3716.f12770);
        float f = c3716.f12774;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.f77044 = f;
        float f2 = c3716.f12773;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        this.f77050 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f77046 = -9223372036854775807L;
        }
        m53059();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53062(long j) {
        this.f77051 = j;
        m53059();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53064() {
        long j = this.f77055;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f77057;
        this.f77055 = j2;
        long j3 = this.f77049;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f77055 = j3;
        }
        this.f77056 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m53060(long j, long j2) {
        if (this.f77046 == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.f77053;
        if (j4 == -9223372036854775807L) {
            this.f77053 = j3;
            this.f77052 = 0L;
        } else {
            float f = this.f77048;
            float f2 = 1.0f - f;
            long jMax = Math.max(j3, (long) ((j3 * f2) + (j4 * f)));
            this.f77053 = jMax;
            this.f77052 = (long) ((f2 * Math.abs(j3 - jMax)) + (f * this.f77052));
        }
        if (this.f77056 != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f77056 < 1000) {
            return this.f77045;
        }
        this.f77056 = SystemClock.elapsedRealtime();
        long j5 = (this.f77052 * 3) + this.f77053;
        if (this.f77055 > j5) {
            float fM19474 = C7116.m19474(1000L);
            long[] jArr = {j5, this.f77047, this.f77055 - (((long) ((this.f77045 - 1.0f) * fM19474)) + ((long) ((this.f77050 - 1.0f) * fM19474)))};
            long j6 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j6) {
                    j6 = j7;
                }
            }
            this.f77055 = j6;
        } else {
            long jM19476 = C7116.m19476(j - ((long) (Math.max(0.0f, this.f77045 - 1.0f) / 1.0E-7f)), this.f77055, j5);
            this.f77055 = jM19476;
            long j8 = this.f77049;
            if (j8 != -9223372036854775807L && jM19476 > j8) {
                this.f77055 = j8;
            }
        }
        long j9 = j - this.f77055;
        if (Math.abs(j9) < this.f77054) {
            this.f77045 = 1.0f;
        } else {
            this.f77045 = C7116.m19457((1.0E-7f * j9) + 1.0f, this.f77044, this.f77050);
        }
        return this.f77045;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m53061() {
        return this.f77055;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m53059() {
        long j;
        long j2 = this.f77046;
        if (j2 != -9223372036854775807L) {
            j = this.f77051;
            if (j == -9223372036854775807L) {
                long j3 = this.f77058;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f77049;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f77047 == j) {
            return;
        }
        this.f77047 = j;
        this.f77055 = j;
        this.f77053 = -9223372036854775807L;
        this.f77052 = -9223372036854775807L;
        this.f77056 = -9223372036854775807L;
    }
}
