package l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܽܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16777 implements AutoCloseable {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f53703 = new ThreadLocal();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f53704;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f53705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f53706;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f53704 != 0) {
            throw new IllegalStateException("Persistence sessions are still active");
        }
        this.f53705 = true;
        this.f53706.shutdown();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C0548 m39352() {
        int i;
        if (this.f53705 || (i = this.f53704) == 256) {
            throw new RejectedExecutionException("Persistence session limit reached or scheduler closed");
        }
        this.f53704 = i + 1;
        return new C0548(this);
    }

    public C16777() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactory() { // from class: l.᩶ܿۖ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(new RunnableC3185(2, runnable), "editable-persist-" + atomicInteger.incrementAndGet());
                thread.setDaemon(true);
                return thread;
            }
        });
        this.f53706 = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39346(Runnable runnable) {
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = f53703;
        threadLocal.set(bool);
        try {
            runnable.run();
        } finally {
            threadLocal.remove();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m39350() {
        return Boolean.TRUE.equals(f53703.get());
    }
}
