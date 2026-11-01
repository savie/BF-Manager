package l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ۨܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AY8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC11844 extends AbstractC8316 implements Runnable {
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final RunnableC11844 f39749;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final long f39750;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final synchronized void m29537() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m21746();
            notifyAll();
        }
    }

    static {
        Long l2;
        RunnableC11844 runnableC11844 = new RunnableC11844();
        f39749 = runnableC11844;
        runnableC11844.m48460(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f39750 = timeUnit.toNanos(l2.longValue());
    }

    @Override // l.AbstractC19605
    /* JADX INFO: renamed from: ֡ */
    public final Thread mo14851() {
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
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // l.AbstractC8316
    /* JADX INFO: renamed from: ۙ */
    public final void mo21742(Runnable runnable) {
        if (debugStatus != 4) {
            super.mo21742(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // l.AbstractC19605
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29538(long j, AbstractRunnableC18193 abstractRunnableC18193) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // l.AbstractC8316, l.AbstractC21721
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21390.m47940(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m29537();
                    if (m21745()) {
                        return;
                    }
                    mo14851();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM21743 = m21743();
                    if (jM21743 == C17492.FOREVER_NS) {
                        long jNanoTime = System.nanoTime();
                        if (j == C17492.FOREVER_NS) {
                            j = f39750 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m29537();
                            if (m21745()) {
                                return;
                            }
                            mo14851();
                            return;
                        }
                        if (jM21743 > j2) {
                            jM21743 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM21743 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m29537();
                            if (m21745()) {
                                return;
                            }
                            mo14851();
                            return;
                        }
                        LockSupport.parkNanos(this, jM21743);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m29537();
            if (!m21745()) {
                mo14851();
            }
            throw th;
        }
    }
}
