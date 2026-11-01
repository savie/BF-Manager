package l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩹ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 39KO */
/* JADX INFO: loaded from: classes.dex */
public final class C22023 extends AbstractFutureC3159 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5089 f71388;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    public C22023(C5089 c5089) {
        this.f71388 = c5089;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f71388.m14182();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        try {
            C5089 c5089 = this.f71388;
            c5089.getClass();
            return c5089.m14183(0L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        try {
            return this.f71388.m14179(j, timeUnit);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }
}
