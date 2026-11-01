package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.֡֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q759 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0062 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f946;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f947;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f948;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f950;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12257 f952;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Thread f953;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public Thread f954;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Throwable f955;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f956;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f957;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f958;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Throwable f959;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Executor f960;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object f951 = new Object();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f949 = -1;

    public RunnableC0062(InterfaceC15785 interfaceC15785, C12257 c12257, ThreadPoolExecutor threadPoolExecutor) {
        this.f950 = interfaceC15785;
        this.f952 = c12257;
        this.f960 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m981() {
        try {
            this.f960.execute(this);
        } catch (RejectedExecutionException e) {
            m975(new IOException("Preview open capacity is exhausted", e));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Throwable th;
        boolean z2;
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (this.f951) {
            this.f954 = threadCurrentThread;
            z = this.f956;
        }
        long jMo9272 = -1;
        if (z) {
            th = null;
        } else {
            try {
                try {
                    jMo9272 = this.f950.mo9272(this.f952);
                    synchronized (this.f951) {
                        this.f948 = true;
                    }
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    synchronized (this.f951) {
                        this.f948 = true;
                    }
                }
            } catch (Throwable th3) {
                synchronized (this.f951) {
                    if (this.f954 == threadCurrentThread) {
                        this.f954 = null;
                    }
                    Thread.interrupted();
                    throw th3;
                }
            }
        }
        if (th != null) {
            m975(th);
            synchronized (this.f951) {
                if (this.f954 == threadCurrentThread) {
                    this.f954 = null;
                }
            }
            Thread.interrupted();
            return;
        }
        synchronized (this.f951) {
            this.f955 = null;
            this.f949 = jMo9272;
            this.f958 = true;
            this.f951.notifyAll();
            while (!this.f956 && !this.f947) {
                try {
                    this.f951.wait();
                } catch (InterruptedException unused) {
                }
            }
            z2 = this.f947;
        }
        if (!z2) {
            try {
                m979();
            } catch (Throwable unused2) {
            }
        }
        synchronized (this.f951) {
            if (this.f954 == threadCurrentThread) {
                this.f954 = null;
            }
        }
        Thread.interrupted();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m975(Throwable th) {
        try {
            m979();
        } catch (Throwable th2) {
            if (th2 != th) {
                th.addSuppressed(th2);
            }
        }
        synchronized (this.f951) {
            this.f955 = th;
            this.f958 = true;
            this.f951.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m977() {
        synchronized (this.f951) {
            while (!this.f958 && !this.f956) {
                try {
                    this.f951.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Preview read was canceled");
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                }
            }
            if (this.f956) {
                throw new InterruptedIOException("Preview read was canceled");
            }
            Throwable th = this.f955;
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th != null) {
                throw new IOException("Preview data source open failed", this.f955);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m976() {
        synchronized (this.f951) {
            if (!this.f956 && this.f958 && this.f955 == null && !this.f947) {
                this.f947 = true;
                this.f951.notifyAll();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m978() {
        long j;
        synchronized (this.f951) {
            j = this.f949;
        }
        return j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m980() throws IOException {
        synchronized (this.f951) {
            if (this.f947) {
                return;
            }
            this.f956 = true;
            boolean z = this.f948;
            Thread thread = z ? null : this.f954;
            this.f951.notifyAll();
            if (thread != null) {
                thread.interrupt();
            }
            if (z) {
                m979();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m979() throws IOException {
        boolean z;
        synchronized (this.f951) {
            boolean z2 = false;
            if (!this.f957) {
                this.f957 = true;
                this.f953 = Thread.currentThread();
                z = false;
                z2 = true;
            } else {
                if (this.f953 == Thread.currentThread()) {
                    return;
                }
                z = false;
                while (!this.f946) {
                    try {
                        this.f951.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            Throwable th = this.f959;
            if (z2) {
                th = null;
                try {
                    this.f950.close();
                    synchronized (this.f951) {
                        this.f959 = null;
                        this.f946 = true;
                        this.f953 = null;
                        this.f951.notifyAll();
                    }
                } catch (Throwable th2) {
                    synchronized (this.f951) {
                        this.f959 = th2;
                        this.f946 = true;
                        this.f953 = null;
                        this.f951.notifyAll();
                        th = th2;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            m974(th);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m974(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th != null) {
            throw new IOException("Preview data source close failed", th);
        }
    }
}
