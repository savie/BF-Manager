package l;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֨ܿ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74X */
/* JADX INFO: loaded from: classes2.dex */
public final class C1263 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f5481;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15327 f5482;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile EnumC22431 f5483;

    public C1263(C15327 c15327, boolean z, String str) {
        EnumC22431 enumC22431;
        this.f5482 = c15327;
        this.f5481 = str;
        if (c15327 != null) {
            enumC22431 = EnumC22431.CACHE;
        } else {
            enumC22431 = z ? EnumC22431.PENDING : EnumC22431.BYPASS;
        }
        this.f5483 = enumC22431;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m4582() {
        boolean z;
        m4581();
        synchronized (this) {
            z = this.f5483 == EnumC22431.CACHE && this.f5482 != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15327 m4583() {
        C15327 c15327;
        m4581();
        synchronized (this) {
            c15327 = this.f5483 == EnumC22431.CACHE ? this.f5482 : null;
        }
        return c15327;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15327 m4584() {
        m4581();
        while (true) {
            m4580();
            synchronized (this) {
                if (this.f5483 != EnumC22431.RELEASED) {
                    if (this.f5483 == EnumC22431.CACHE) {
                        return this.f5482;
                    }
                    if (this.f5483 == EnumC22431.BYPASS) {
                        return null;
                    }
                    if (this.f5483 == EnumC22431.PENDING) {
                        this.f5483 = EnumC22431.DECIDING;
                        try {
                            return m4578();
                        } catch (InterruptedIOException e) {
                            m4579();
                            throw e;
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while waiting for media cache initialization");
                        interruptedIOException.initCause(e2);
                        throw interruptedIOException;
                    }
                } else {
                    throw new InterruptedIOException("Media cache session was released");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private C15327 m4578() throws InterruptedIOException {
        EnumC13259 enumC13259;
        EnumC13259 enumC132510;
        C15327 c15327;
        m4580();
        long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
        long jNanoTime = System.nanoTime() + nanos;
        synchronized (C4085.f15002) {
            while (true) {
                if ((C4085.f14999 != EnumC13259.UNINITIALIZED && C4085.f14999 != EnumC13259.INITIALIZING) || this.f5483 != EnumC22431.DECIDING || nanos <= 0) {
                    break;
                }
                long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
                try {
                    C4085.f15002.wait(millis, (int) (nanos - TimeUnit.MILLISECONDS.toNanos(millis)));
                    nanos = jNanoTime - System.nanoTime();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while waiting for media cache initialization");
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                }
            }
            enumC13259 = C4085.f14999;
            EnumC13259 enumC132511 = C4085.f14999;
            enumC132510 = EnumC13259.READY;
            c15327 = enumC132511 == enumC132510 ? C4085.f15001 : null;
        }
        m4580();
        synchronized (this) {
            if (this.f5483 != EnumC22431.RELEASED) {
                m4580();
                EnumC22431 enumC22431 = this.f5483;
                EnumC22431 enumC22432 = EnumC22431.CACHE;
                if (enumC22431 == enumC22432) {
                    return this.f5482;
                }
                EnumC22431 enumC22433 = this.f5483;
                EnumC22431 enumC22434 = EnumC22431.BYPASS;
                if (enumC22433 == enumC22434) {
                    return null;
                }
                if (this.f5483 != EnumC22431.DECIDING) {
                    throw new InterruptedIOException("Media cache decision was canceled");
                }
                if (enumC13259 == enumC132510 && c15327 != null) {
                    this.f5482 = c15327;
                    this.f5483 = enumC22432;
                } else {
                    this.f5483 = enumC22434;
                }
                notifyAll();
                return this.f5482;
            }
            throw new InterruptedIOException("Media cache session was released");
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m4579() {
        synchronized (this) {
            if (this.f5483 == EnumC22431.DECIDING) {
                this.f5483 = EnumC22431.PENDING;
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m4581() {
        EnumC13259 enumC13259;
        EnumC13259 enumC132510;
        C15327 c15327;
        EnumC22431 enumC22431 = this.f5483;
        EnumC22431 enumC22432 = EnumC22431.PENDING;
        if (enumC22431 != enumC22432) {
            return;
        }
        synchronized (C4085.f15002) {
            enumC13259 = C4085.f14999;
            EnumC13259 enumC132511 = C4085.f14999;
            enumC132510 = EnumC13259.READY;
            c15327 = enumC132511 == enumC132510 ? C4085.f15001 : null;
        }
        if (enumC13259 == EnumC13259.UNINITIALIZED || enumC13259 == EnumC13259.INITIALIZING) {
            return;
        }
        synchronized (this) {
            if (this.f5483 != enumC22432) {
                return;
            }
            if (enumC13259 == enumC132510 && c15327 != null) {
                this.f5482 = c15327;
                this.f5483 = EnumC22431.CACHE;
            } else {
                this.f5483 = EnumC22431.BYPASS;
            }
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m4580() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Interrupted while waiting for media cache initialization");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m4585() {
        synchronized (this) {
            if (this.f5483 != EnumC22431.RELEASED) {
                this.f5483 = EnumC22431.BYPASS;
            }
            notifyAll();
        }
        C4085.m11617();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m4586() {
        return this.f5481;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f5483 = EnumC22431.RELEASED;
            notifyAll();
        }
        C4085.m11617();
    }
}
