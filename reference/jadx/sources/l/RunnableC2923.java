package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ۖ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q759 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2923 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f9568;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C25368 f9569;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Throwable f9570;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Thread f9573;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f9574;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Executor f9575;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f9576;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f9577;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f9578;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f9579;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f9580;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Throwable f9581;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public Thread f9582;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f9572 = new Object();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f9571 = -1;

    public RunnableC2923(InterfaceC13433 interfaceC13433, C25368 c25368, ThreadPoolExecutor threadPoolExecutor) {
        this.f9576 = interfaceC13433;
        this.f9569 = c25368;
        this.f9575 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m9570() {
        try {
            this.f9575.execute(this);
        } catch (RejectedExecutionException e) {
            m9567(new IOException("Preview open capacity is exhausted", e));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Throwable th;
        boolean z2;
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (this.f9572) {
            this.f9582 = threadCurrentThread;
            z = this.f9578;
        }
        long jMo8326 = -1;
        if (z) {
            th = null;
        } else {
            try {
                try {
                    jMo8326 = this.f9576.mo8326(this.f9569);
                    synchronized (this.f9572) {
                        this.f9577 = true;
                    }
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    synchronized (this.f9572) {
                        this.f9577 = true;
                    }
                }
            } catch (Throwable th3) {
                synchronized (this.f9572) {
                    if (this.f9582 == threadCurrentThread) {
                        this.f9582 = null;
                    }
                    Thread.interrupted();
                    throw th3;
                }
            }
        }
        if (th != null) {
            m9567(th);
            synchronized (this.f9572) {
                if (this.f9582 == threadCurrentThread) {
                    this.f9582 = null;
                }
            }
            Thread.interrupted();
            return;
        }
        synchronized (this.f9572) {
            this.f9570 = null;
            this.f9571 = jMo8326;
            this.f9580 = true;
            this.f9572.notifyAll();
            while (!this.f9578 && !this.f9574) {
                try {
                    this.f9572.wait();
                } catch (InterruptedException unused) {
                }
            }
            z2 = this.f9574;
        }
        if (!z2) {
            try {
                m9569();
            } catch (Throwable unused2) {
            }
        }
        synchronized (this.f9572) {
            if (this.f9582 == threadCurrentThread) {
                this.f9582 = null;
            }
        }
        Thread.interrupted();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m9567(Throwable th) {
        try {
            m9569();
        } catch (Throwable th2) {
            if (th2 != th) {
                th.addSuppressed(th2);
            }
        }
        synchronized (this.f9572) {
            this.f9570 = th;
            this.f9580 = true;
            this.f9572.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9568() {
        synchronized (this.f9572) {
            while (!this.f9580 && !this.f9578) {
                try {
                    this.f9572.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Preview read was canceled");
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                }
            }
            if (this.f9578) {
                throw new InterruptedIOException("Preview read was canceled");
            }
            Throwable th = this.f9570;
            if (th instanceof IOException) {
                IOException iOException = (IOException) th;
                C22327.m50389(iOException);
                throw iOException;
            }
            if (th instanceof RuntimeException) {
                RuntimeException runtimeException = (RuntimeException) th;
                C22327.m50389(runtimeException);
                throw runtimeException;
            }
            if (th instanceof Error) {
                Error error = (Error) th;
                C22327.m50389(error);
                throw error;
            }
            if (th != null) {
                throw new IOException("Preview data source open failed", this.f9570);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m9573() {
        synchronized (this.f9572) {
            if (!this.f9578 && this.f9580 && this.f9570 == null && !this.f9574) {
                this.f9574 = true;
                this.f9572.notifyAll();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m9571() {
        long j;
        synchronized (this.f9572) {
            j = this.f9571;
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9572() throws IOException {
        synchronized (this.f9572) {
            if (this.f9574) {
                return;
            }
            this.f9578 = true;
            boolean z = this.f9577;
            Thread thread = z ? null : this.f9582;
            this.f9572.notifyAll();
            if (thread != null) {
                thread.interrupt();
            }
            if (z) {
                m9569();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9569() throws IOException {
        boolean z;
        synchronized (this.f9572) {
            boolean z2 = false;
            if (!this.f9568) {
                this.f9568 = true;
                this.f9573 = Thread.currentThread();
                z = false;
                z2 = true;
            } else {
                if (this.f9573 == Thread.currentThread()) {
                    return;
                }
                z = false;
                while (!this.f9579) {
                    try {
                        this.f9572.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            Throwable th = this.f9581;
            if (z2) {
                th = null;
                try {
                    this.f9576.close();
                    synchronized (this.f9572) {
                        this.f9581 = null;
                        this.f9579 = true;
                        this.f9573 = null;
                        this.f9572.notifyAll();
                    }
                } catch (Throwable th2) {
                    synchronized (this.f9572) {
                        this.f9581 = th2;
                        this.f9579 = true;
                        this.f9573 = null;
                        this.f9572.notifyAll();
                        th = th2;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            m9566(th);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m9566(Throwable th) throws IOException {
        if (th instanceof IOException) {
            IOException iOException = (IOException) th;
            C22327.m50389(iOException);
            throw iOException;
        }
        if (th instanceof RuntimeException) {
            RuntimeException runtimeException = (RuntimeException) th;
            C22327.m50389(runtimeException);
            throw runtimeException;
        }
        if (th instanceof Error) {
            Error error = (Error) th;
            C22327.m50389(error);
            throw error;
        }
        if (th != null) {
            throw new IOException("Preview data source close failed", th);
        }
    }
}
