package l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.۬ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17B9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12851 extends AbstractFutureC3159 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC9511 f42753;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Future f42754;

    public C12851(AbstractFutureC3159 abstractFutureC3159, InterfaceC9511 interfaceC9511) {
        this.f42754 = abstractFutureC3159;
        this.f42753 = interfaceC9511;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f42754.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f42754.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f42754.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f42753.apply(this.f42754.get());
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f42753.apply(this.f42754.get(j, timeUnit));
    }
}
