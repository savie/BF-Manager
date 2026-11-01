package l;

/* JADX INFO: renamed from: l.֡᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E6MO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0745 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Runnable f3046;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f3047;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f3048;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f3049;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20502 f3050;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C20502 m3239(long j) {
        try {
            if (j < 0) {
                throw new IllegalArgumentException("Reservation must not be negative");
            }
            long j2 = this.f3047;
            long j3 = this.f3048;
            if (j <= j2 - j3) {
                long j4 = j3 + j;
                C20502 c20502 = this.f3050;
                if (c20502 == null || c20502.m46302(Math.max(j4, c20502.m46301()))) {
                    long j5 = this.f3048 + j;
                    this.f3048 = j5;
                    this.f3049 = Math.max(this.f3049, j5);
                    return new C20502(this, j);
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m3240(RunnableC7981 runnableC7981) {
        this.f3046 = runnableC7981;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized long m3241() {
        return this.f3048;
    }

    public C0745(long j, C20502 c20502) {
        if (j <= 0) {
            throw new IllegalArgumentException("Bitmap budget must be positive");
        }
        this.f3047 = j;
        this.f3050 = c20502;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3235(C0745 c0745, long j) {
        C20502 c20502 = c0745.f3050;
        return c20502 == null || c20502.m46302(Math.max(j, c20502.m46301()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m3238() {
        return this.f3047;
    }
}
