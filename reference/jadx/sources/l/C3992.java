package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.ۘۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MAWZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3992 extends AbstractC24130 implements InterfaceC19654 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Executor f13657;

    public C3992(Executor executor) {
        this.f13657 = executor;
        C15609.m37340(executor);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f13657);
    }

    @Override // l.AbstractC18951
    public final String toString() {
        return this.f13657.toString();
    }

    @Override // l.AbstractC18951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11210(InterfaceC11536 interfaceC11536, Runnable runnable) {
        try {
            this.f13657.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            C13686.m33478(interfaceC11536, cancellationException);
            C1755.m6200().mo11210(interfaceC11536, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f13657;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3992) && ((C3992) obj).f13657 == this.f13657;
    }
}
