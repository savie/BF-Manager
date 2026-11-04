package l;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.᩺ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T2QG */
/* JADX INFO: loaded from: classes.dex */
public final class C24434 implements InterfaceFutureC14736 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f79316;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceFutureC14736 f79315 = new C24434(null);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C4296 f79314 = new C4296(C24434.class);

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

    public C24434(Object obj) {
        this.f79316 = obj;
    }

    @Override // l.InterfaceFutureC14736
    /* JADX INFO: renamed from: ۙ */
    public final void mo7375(Runnable runnable, Executor executor) {
        C12128.m30305(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f79314.m13672().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f79316;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f79316 + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f79316;
    }
}
