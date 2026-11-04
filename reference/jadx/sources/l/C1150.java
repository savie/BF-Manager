package l;

import java.math.RoundingMode;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.֨ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08QK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1150 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f4251;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f4252 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f4253;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f4254;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized long m4243() {
        long j;
        j = this.f4251;
        if (j == C25227.FOREVER_NS || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized long m4244(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!m4251()) {
            long jLongValue = this.f4251;
            if (jLongValue == 9223372036854775806L) {
                Long l2 = (Long) this.f4252.get();
                l2.getClass();
                jLongValue = l2.longValue();
            }
            this.f4254 = jLongValue - j;
            notifyAll();
        }
        this.f4253 = j;
        return j + this.f4254;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4245(long j, boolean z) {
        C20782.m47568(this.f4251 == 9223372036854775806L);
        if (m4251()) {
            return;
        }
        if (z) {
            this.f4252.set(Long.valueOf(j));
        } else {
            while (!m4251()) {
                wait();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized long m4246() {
        return this.f4254;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a A[PHI: r12
      0x003a: PHI (r12v2 long) = (r12v0 long), (r12v6 long) binds: [B:9:0x0011, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized long m4247(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f4253;
        if (j3 != -9223372036854775807L) {
            String str = C7116.f23455;
            long jM19477 = C7116.m19477(j3, 90000L, 1000000L, RoundingMode.DOWN);
            long j4 = jM19477 / 8589934592L;
            Long.signum(j4);
            long j5 = (j4 * 8589934592L) + j;
            j += (j4 + 1) * 8589934592L;
            if (j5 >= jM19477) {
                j2 = j5;
            } else {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        String str2 = C7116.f23455;
        return m4244(C7116.m19477(j2, 1000000L, 90000L, RoundingMode.DOWN));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized long m4248() {
        long j;
        j = this.f4253;
        return j != -9223372036854775807L ? j + this.f4254 : m4243();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049 A[PHI: r12
      0x0049: PHI (r12v2 long) = (r12v0 long), (r12v6 long) binds: [B:9:0x0011, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized long m4249(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f4253;
        if (j3 != -9223372036854775807L) {
            String str = C7116.f23455;
            long jM19477 = C7116.m19477(j3, 90000L, 1000000L, RoundingMode.DOWN);
            long j4 = (Blake2xsDigest.MAX_NUMBER_BLOCKS + jM19477) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - jM19477) < Math.abs(j - jM19477)) {
                j2 = j5;
            } else {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        String str2 = C7116.f23455;
        return m4244(C7116.m19477(j2, 1000000L, 90000L, RoundingMode.DOWN));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m4250(long j) {
        this.f4251 = j;
        this.f4254 = j == C25227.FOREVER_NS ? 0L : -9223372036854775807L;
        this.f4253 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m4251() {
        return this.f4254 != -9223372036854775807L;
    }

    public C1150(long j) {
        m4250(j);
    }
}
