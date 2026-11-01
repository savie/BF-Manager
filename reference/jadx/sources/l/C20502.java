package l;

/* JADX INFO: renamed from: l.᩶᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E6MO */
/* JADX INFO: loaded from: classes4.dex */
public final class C20502 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0745 f66469;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f66470;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f66471;

    public C20502(C0745 c0745, long j) {
        this.f66469 = c0745;
        this.f66470 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m46302(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Allocation must not be negative");
        }
        synchronized (this.f66469) {
            if (!this.f66471 && j <= this.f66469.f3047 - (this.f66469.f3048 - this.f66470)) {
                C0745 c0745 = this.f66469;
                if (C0745.m3235(c0745, (c0745.f3048 - this.f66470) + j)) {
                    Runnable runnable = j < this.f66470 ? this.f66469.f3046 : null;
                    C0745 c0746 = this.f66469;
                    c0746.f3048 = (j - this.f66470) + c0746.f3048;
                    this.f66470 = j;
                    C0745 c0747 = this.f66469;
                    c0747.f3049 = Math.max(c0747.f3049, this.f66469.f3048);
                    if (runnable == null) {
                        return true;
                    }
                    runnable.run();
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m46301() {
        long j;
        synchronized (this.f66469) {
            j = this.f66470;
        }
        return j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f66469) {
            if (this.f66471) {
                return;
            }
            Runnable runnable = this.f66470 > 0 ? this.f66469.f3046 : null;
            this.f66469.f3048 -= this.f66470;
            this.f66470 = 0L;
            this.f66471 = true;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
