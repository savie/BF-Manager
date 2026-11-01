package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.ܺܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: MAWZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16077 extends AbstractC21015 implements InterfaceC5493 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Executor f51992;

    public C16077(Executor executor) {
        this.f51992 = executor;
        C3190.m9606(executor);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f51992);
    }

    @Override // l.AbstractC12405
    public final String toString() {
        return this.f51992.toString();
    }

    @Override // l.AbstractC12405
    /* JADX INFO: renamed from: ۙ */
    public final void mo8623(InterfaceC22386 interfaceC22386, Runnable runnable) {
        try {
            this.f51992.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            C9727.m24682(interfaceC22386, cancellationException);
            C6904.m18522().mo8623(interfaceC22386, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f51992;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16077) && ((C16077) obj).f51992 == this.f51992;
    }
}
