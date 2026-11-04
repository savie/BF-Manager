package l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܰܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39KO */
/* JADX INFO: loaded from: classes5.dex */
public final class C14690 extends AbstractFutureC3504 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4250 f48011;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    public C14690(C4250 c4250) {
        this.f48011 = c4250;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f48011.m13573();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        try {
            C4250 c4250 = this.f48011;
            c4250.getClass();
            return c4250.m13574(0L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        try {
            return this.f48011.m13570(j, timeUnit);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }
}
