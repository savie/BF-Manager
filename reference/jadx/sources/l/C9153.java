package l;

/* JADX INFO: renamed from: l.ۡۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E6MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C9153 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f29731;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2442 f29732;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f29733;

    public C9153(C2442 c2442, long j) {
        this.f29732 = c2442;
        this.f29731 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m24288(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Allocation must not be negative");
        }
        synchronized (this.f29732) {
            if (!this.f29733 && j <= this.f29732.f7823 - (this.f29732.f7825 - this.f29731)) {
                C2442 c2442 = this.f29732;
                if (C2442.m8237(c2442, (c2442.f7825 - this.f29731) + j)) {
                    Runnable runnable = j < this.f29731 ? this.f29732.f7827 : null;
                    C2442 c2443 = this.f29732;
                    c2443.f7825 = (j - this.f29731) + c2443.f7825;
                    this.f29731 = j;
                    C2442 c2444 = this.f29732;
                    c2444.f7824 = Math.max(c2444.f7824, this.f29732.f7825);
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
    public final long m24287() {
        long j;
        synchronized (this.f29732) {
            j = this.f29731;
        }
        return j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f29732) {
            if (this.f29733) {
                return;
            }
            Runnable runnable = this.f29731 > 0 ? this.f29732.f7827 : null;
            this.f29732.f7825 -= this.f29731;
            this.f29731 = 0L;
            this.f29733 = true;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
