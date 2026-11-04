package l;

/* JADX INFO: renamed from: l.ۖۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E6MO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2442 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f7823;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f7824;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f7825;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9153 f7826;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Runnable f7827;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9153 m8242(long j) {
        try {
            if (j < 0) {
                throw new IllegalArgumentException("Reservation must not be negative");
            }
            long j2 = this.f7823;
            long j3 = this.f7825;
            if (j <= j2 - j3) {
                long j4 = j3 + j;
                C9153 c9153 = this.f7826;
                if (c9153 == null || c9153.m24288(Math.max(j4, c9153.m24287()))) {
                    long j5 = this.f7825 + j;
                    this.f7825 = j5;
                    this.f7824 = Math.max(this.f7824, j5);
                    return new C9153(this, j);
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m8243(RunnableC4886 runnableC4886) {
        this.f7827 = runnableC4886;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized long m8244() {
        return this.f7825;
    }

    public C2442(long j, C9153 c9153) {
        if (j <= 0) {
            throw new IllegalArgumentException("Bitmap budget must be positive");
        }
        this.f7823 = j;
        this.f7826 = c9153;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8237(C2442 c2442, long j) {
        C9153 c9153 = c2442.f7826;
        return c9153 == null || c9153.m24288(Math.max(j, c9153.m24287()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m8241() {
        return this.f7823;
    }
}
