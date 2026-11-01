package l;

import java.math.RoundingMode;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.ۜۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08QK */
/* JADX INFO: loaded from: classes2.dex */
public final class C6694 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f22567;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f22568;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f22569 = new ThreadLocal();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f22570;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void m18069(long j) {
        this.f22568 = j;
        this.f22567 = j == C17492.FOREVER_NS ? 0L : -9223372036854775807L;
        this.f22570 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m18070() {
        return this.f22567 != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized long m18071() {
        long j;
        j = this.f22568;
        if (j == C17492.FOREVER_NS || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized long m18072(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!m18070()) {
            long jLongValue = this.f22568;
            if (jLongValue == 9223372036854775806L) {
                Long l2 = (Long) this.f22569.get();
                l2.getClass();
                jLongValue = l2.longValue();
            }
            this.f22567 = jLongValue - j;
            notifyAll();
        }
        this.f22570 = j;
        return j + this.f22567;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m18073(long j, boolean z) {
        C2023.m6510(this.f22568 == 9223372036854775806L);
        if (m18070()) {
            return;
        }
        if (z) {
            this.f22569.set(Long.valueOf(j));
        } else {
            while (!m18070()) {
                wait();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized long m18074() {
        return this.f22567;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a A[PHI: r12
      0x003a: PHI (r12v2 long) = (r12v0 long), (r12v6 long) binds: [B:9:0x0011, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized long m18075(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f22570;
        if (j3 != -9223372036854775807L) {
            String str = C17983.f57504;
            long jM41830 = C17983.m41830(j3, 90000L, 1000000L, RoundingMode.DOWN);
            long j4 = jM41830 / 8589934592L;
            Long.signum(j4);
            long j5 = (j4 * 8589934592L) + j;
            j += (j4 + 1) * 8589934592L;
            if (j5 >= jM41830) {
                j2 = j5;
            } else {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        String str2 = C17983.f57504;
        return m18072(C17983.m41830(j2, 1000000L, 90000L, RoundingMode.DOWN));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized long m18076() {
        long j;
        j = this.f22570;
        return j != -9223372036854775807L ? j + this.f22567 : m18071();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049 A[PHI: r12
      0x0049: PHI (r12v2 long) = (r12v0 long), (r12v6 long) binds: [B:9:0x0011, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized long m18077(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f22570;
        if (j3 != -9223372036854775807L) {
            String str = C17983.f57504;
            long jM41830 = C17983.m41830(j3, 90000L, 1000000L, RoundingMode.DOWN);
            long j4 = (Blake2xsDigest.MAX_NUMBER_BLOCKS + jM41830) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - jM41830) < Math.abs(j - jM41830)) {
                j2 = j5;
            } else {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        String str2 = C17983.f57504;
        return m18072(C17983.m41830(j2, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public C6694(long j) {
        m18069(j);
    }
}
