package l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9300 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30234;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2589 f30235;

    public C9300(C2589 c2589) {
        this.f30235 = c2589;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ScheduledFuture m24528(RunnableC18932 runnableC18932, long j) {
        ScheduledFuture<?> scheduledFutureSchedule;
        synchronized (this.f30235) {
            if (this.f30234 || this.f30235.f8311) {
                throw new RejectedExecutionException("Persistence scheduler slot is closed");
            }
            scheduledFutureSchedule = this.f30235.f8313.schedule(runnableC18932, j, TimeUnit.NANOSECONDS);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f30235) {
            if (this.f30234) {
                return;
            }
            this.f30234 = true;
            this.f30235.f8312--;
        }
    }
}
