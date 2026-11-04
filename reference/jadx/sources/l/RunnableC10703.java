package l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ۤۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AY8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC10703 extends AbstractC23384 implements Runnable {
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final long f33994;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final RunnableC10703 f33995;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private final synchronized void m27297() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m52551();
            notifyAll();
        }
    }

    static {
        Long l2;
        RunnableC10703 runnableC10703 = new RunnableC10703();
        f33995 = runnableC10703;
        runnableC10703.m39384(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f33994 = timeUnit.toNanos(l2.longValue());
    }

    @Override // l.AbstractC3246
    /* JADX INFO: renamed from: ܿ */
    public final Thread mo10606() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(RunnableC10703.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // l.AbstractC23384
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27298(Runnable runnable) {
        if (debugStatus != 4) {
            super.mo27298(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // l.AbstractC3246
    /* JADX INFO: renamed from: ۙ */
    public final void mo10605(long j, AbstractRunnableC17416 abstractRunnableC17416) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // l.AbstractC23384, l.AbstractC16670
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23580.m52770(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m27297();
                    if (isEmpty()) {
                        return;
                    }
                    mo10606();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM52550 = m52550();
                    if (jM52550 == C25227.FOREVER_NS) {
                        long jNanoTime = System.nanoTime();
                        if (j == C25227.FOREVER_NS) {
                            j = f33994 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m27297();
                            if (isEmpty()) {
                                return;
                            }
                            mo10606();
                            return;
                        }
                        if (jM52550 > j2) {
                            jM52550 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM52550 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m27297();
                            if (isEmpty()) {
                                return;
                            }
                            mo10606();
                            return;
                        }
                        LockSupport.parkNanos(this, jM52550);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m27297();
            if (!isEmpty()) {
                mo10606();
            }
            throw th;
        }
    }
}
