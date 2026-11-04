package l;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܶᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74X */
/* JADX INFO: loaded from: classes4.dex */
public final class C16281 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8367 f52873;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f52874;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile EnumC17773 f52875;

    public C16281(C8367 c8367, boolean z, String str) {
        EnumC17773 enumC17773;
        this.f52873 = c8367;
        this.f52874 = str;
        if (c8367 != null) {
            enumC17773 = EnumC17773.CACHE;
        } else {
            enumC17773 = z ? EnumC17773.PENDING : EnumC17773.BYPASS;
        }
        this.f52875 = enumC17773;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m38630() {
        boolean z;
        m38626();
        synchronized (this) {
            z = this.f52875 == EnumC17773.CACHE && this.f52873 != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8367 m38629() {
        C8367 c8367;
        m38626();
        synchronized (this) {
            c8367 = this.f52875 == EnumC17773.CACHE ? this.f52873 : null;
        }
        return c8367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8367 m38628() throws InterruptedIOException {
        m38626();
        while (true) {
            m38627();
            synchronized (this) {
                if (this.f52875 != EnumC17773.RELEASED) {
                    if (this.f52875 == EnumC17773.CACHE) {
                        return this.f52873;
                    }
                    if (this.f52875 == EnumC17773.BYPASS) {
                        return null;
                    }
                    if (this.f52875 == EnumC17773.PENDING) {
                        this.f52875 = EnumC17773.DECIDING;
                        try {
                            return m38624();
                        } catch (InterruptedIOException e) {
                            m38625();
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

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C8367 m38624() throws InterruptedIOException {
        EnumC23741 enumC23741;
        EnumC23741 enumC23742;
        C8367 c8367;
        m38627();
        long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
        long jNanoTime = System.nanoTime() + nanos;
        synchronized (C3603.f12354) {
            while (true) {
                if ((C3603.f12355 != EnumC23741.UNINITIALIZED && C3603.f12355 != EnumC23741.INITIALIZING) || this.f52875 != EnumC17773.DECIDING || nanos <= 0) {
                    break;
                }
                long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
                try {
                    C3603.f12354.wait(millis, (int) (nanos - TimeUnit.MILLISECONDS.toNanos(millis)));
                    nanos = jNanoTime - System.nanoTime();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while waiting for media cache initialization");
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                }
            }
            enumC23741 = C3603.f12355;
            EnumC23741 enumC23743 = C3603.f12355;
            enumC23742 = EnumC23741.READY;
            c8367 = enumC23743 == enumC23742 ? C3603.f12353 : null;
        }
        m38627();
        synchronized (this) {
            if (this.f52875 != EnumC17773.RELEASED) {
                m38627();
                EnumC17773 enumC17773 = this.f52875;
                EnumC17773 enumC17774 = EnumC17773.CACHE;
                if (enumC17773 == enumC17774) {
                    return this.f52873;
                }
                EnumC17773 enumC17775 = this.f52875;
                EnumC17773 enumC17776 = EnumC17773.BYPASS;
                if (enumC17775 == enumC17776) {
                    return null;
                }
                if (this.f52875 != EnumC17773.DECIDING) {
                    throw new InterruptedIOException("Media cache decision was canceled");
                }
                if (enumC23741 == enumC23742 && c8367 != null) {
                    this.f52873 = c8367;
                    this.f52875 = enumC17774;
                } else {
                    this.f52875 = enumC17776;
                }
                notifyAll();
                return this.f52873;
            }
            throw new InterruptedIOException("Media cache session was released");
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m38625() {
        synchronized (this) {
            if (this.f52875 == EnumC17773.DECIDING) {
                this.f52875 = EnumC17773.PENDING;
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38626() {
        EnumC23741 enumC23741;
        EnumC23741 enumC23742;
        C8367 c8367;
        EnumC17773 enumC17773 = this.f52875;
        EnumC17773 enumC17774 = EnumC17773.PENDING;
        if (enumC17773 != enumC17774) {
            return;
        }
        synchronized (C3603.f12354) {
            enumC23741 = C3603.f12355;
            EnumC23741 enumC23743 = C3603.f12355;
            enumC23742 = EnumC23741.READY;
            c8367 = enumC23743 == enumC23742 ? C3603.f12353 : null;
        }
        if (enumC23741 == EnumC23741.UNINITIALIZED || enumC23741 == EnumC23741.INITIALIZING) {
            return;
        }
        synchronized (this) {
            if (this.f52875 != enumC17774) {
                return;
            }
            if (enumC23741 == enumC23742 && c8367 != null) {
                this.f52873 = c8367;
                this.f52875 = EnumC17773.CACHE;
            } else {
                this.f52875 = EnumC17773.BYPASS;
            }
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m38627() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Interrupted while waiting for media cache initialization");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38632() {
        synchronized (this) {
            if (this.f52875 != EnumC17773.RELEASED) {
                this.f52875 = EnumC17773.BYPASS;
            }
            notifyAll();
        }
        C3603.m11691();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m38631() {
        return this.f52874;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f52875 = EnumC17773.RELEASED;
            notifyAll();
        }
        C3603.m11691();
    }
}
