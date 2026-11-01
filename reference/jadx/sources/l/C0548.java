package l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֡ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0548 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f2298;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16777 f2299;

    public C0548(C16777 c16777) {
        this.f2299 = c16777;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ScheduledFuture m2559(RunnableC16052 runnableC16052, long j) {
        ScheduledFuture<?> scheduledFutureSchedule;
        synchronized (this.f2299) {
            if (this.f2298 || this.f2299.f53705) {
                throw new RejectedExecutionException("Persistence scheduler slot is closed");
            }
            scheduledFutureSchedule = this.f2299.f53706.schedule(runnableC16052, j, TimeUnit.NANOSECONDS);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f2299) {
            if (this.f2298) {
                return;
            }
            this.f2298 = true;
            this.f2299.f53704--;
        }
    }
}
