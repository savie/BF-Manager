package l;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.֡ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T2QG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0333 implements InterfaceFutureC12329 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f1741;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceFutureC12329 f1740 = new C0333(null);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C16562 f1739 = new C16562(C0333.class);

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public C0333(Object obj) {
        this.f1741 = obj;
    }

    @Override // l.InterfaceFutureC12329
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1994(Runnable runnable, Executor executor) {
        C18304.m42513(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f1739.m38979().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f1741;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f1741 + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f1741;
    }
}
