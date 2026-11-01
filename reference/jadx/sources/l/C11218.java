package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۧ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11218 implements InterfaceC17464 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f37956;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f37957;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f37963;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f37959 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f37962 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f37966 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f37952 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f37954 = 0.97f;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f37965 = 1.03f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f37955 = 1.0f;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f37953 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f37958 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f37960 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f37964 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f37961 = -9223372036854775807L;

    public C11218(float f, long j, long j2) {
        this.f37956 = j;
        this.f37963 = j2;
        this.f37957 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28171(C23876 c23876) {
        this.f37959 = C17983.m41827(c23876.f77163);
        this.f37966 = C17983.m41827(c23876.f77164);
        this.f37952 = C17983.m41827(c23876.f77162);
        float f = c23876.f77161;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.f37954 = f;
        float f2 = c23876.f77165;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        this.f37965 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f37959 = -9223372036854775807L;
        }
        m28167();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28170(long j) {
        this.f37962 = j;
        m28167();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28172() {
        long j = this.f37960;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f37963;
        this.f37960 = j2;
        long j3 = this.f37952;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f37960 = j3;
        }
        this.f37953 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m28168(long j, long j2) {
        if (this.f37959 == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.f37964;
        if (j4 == -9223372036854775807L) {
            this.f37964 = j3;
            this.f37961 = 0L;
        } else {
            float f = this.f37957;
            float f2 = 1.0f - f;
            long jMax = Math.max(j3, (long) ((j3 * f2) + (j4 * f)));
            this.f37964 = jMax;
            this.f37961 = (long) ((f2 * Math.abs(j3 - jMax)) + (f * this.f37961));
        }
        if (this.f37953 != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f37953 < 1000) {
            return this.f37955;
        }
        this.f37953 = SystemClock.elapsedRealtime();
        long j5 = (this.f37961 * 3) + this.f37964;
        if (this.f37960 > j5) {
            float fM41827 = C17983.m41827(1000L);
            long[] jArr = {j5, this.f37958, this.f37960 - (((long) ((this.f37955 - 1.0f) * fM41827)) + ((long) ((this.f37965 - 1.0f) * fM41827)))};
            long j6 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j6) {
                    j6 = j7;
                }
            }
            this.f37960 = j6;
        } else {
            long jM41829 = C17983.m41829(j - ((long) (Math.max(0.0f, this.f37955 - 1.0f) / 1.0E-7f)), this.f37960, j5);
            this.f37960 = jM41829;
            long j8 = this.f37952;
            if (j8 != -9223372036854775807L && jM41829 > j8) {
                this.f37960 = j8;
            }
        }
        long j9 = j - this.f37960;
        if (Math.abs(j9) < this.f37956) {
            this.f37955 = 1.0f;
        } else {
            this.f37955 = C17983.m41810((1.0E-7f * j9) + 1.0f, this.f37954, this.f37965);
        }
        return this.f37955;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m28169() {
        return this.f37960;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m28167() {
        long j;
        long j2 = this.f37959;
        if (j2 != -9223372036854775807L) {
            j = this.f37962;
            if (j == -9223372036854775807L) {
                long j3 = this.f37966;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f37952;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f37958 == j) {
            return;
        }
        this.f37958 = j;
        this.f37960 = j;
        this.f37964 = -9223372036854775807L;
        this.f37961 = -9223372036854775807L;
        this.f37953 = -9223372036854775807L;
    }
}
