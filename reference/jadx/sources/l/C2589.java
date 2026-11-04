package l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۖۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2589 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f8310 = new ThreadLocal();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f8311;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f8312;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f8313;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f8312 != 0) {
            throw new IllegalStateException("Persistence sessions are still active");
        }
        this.f8311 = true;
        this.f8313.shutdown();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9300 m8661() {
        int i;
        if (this.f8311 || (i = this.f8312) == 256) {
            throw new RejectedExecutionException("Persistence session limit reached or scheduler closed");
        }
        this.f8312 = i + 1;
        return new C9300(this);
    }

    public C2589() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactory() { // from class: l.֨ۢ᩸
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(new RunnableC1444(2, runnable), "editable-persist-" + atomicInteger.incrementAndGet());
                thread.setDaemon(true);
                return thread;
            }
        });
        this.f8313 = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8655(Runnable runnable) {
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = f8310;
        threadLocal.set(bool);
        try {
            runnable.run();
        } finally {
            threadLocal.remove();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m8660() {
        return Boolean.TRUE.equals(f8310.get());
    }
}
