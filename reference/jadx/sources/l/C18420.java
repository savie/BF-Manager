package l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ܿܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17B9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18420 extends AbstractFutureC3504 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC23642 f59993;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Future f59994;

    public C18420(AbstractFutureC3504 abstractFutureC3504, InterfaceC23642 interfaceC23642) {
        this.f59994 = abstractFutureC3504;
        this.f59993 = interfaceC23642;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f59994.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f59994.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f59994.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f59993.apply(this.f59994.get());
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f59993.apply(this.f59994.get(j, timeUnit));
    }
}
