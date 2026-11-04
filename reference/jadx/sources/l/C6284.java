package l;

import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۛۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 574A */
/* JADX INFO: loaded from: classes3.dex */
public final class C6284 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12249 f21338;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4046 f21339;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC24184 f21340 = EnumC24184.WAITING;

    public C6284(C4046 c4046, C12249 c12249) {
        this.f21339 = c4046;
        this.f21338 = c12249;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17963() {
        synchronized (this.f21339) {
            if (this.f21340 == EnumC24184.WAITING) {
                while (this.f21338.f39406 != null) {
                    m17961();
                }
                m17962();
                this.f21338.f39407--;
                this.f21338.f39405++;
                this.f21340 = EnumC24184.READING;
            } else {
                throw new IllegalStateException("Unexpected HLS playlist cache lease state: " + this.f21340);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17967() {
        synchronized (this.f21339) {
            if (this.f21340 != EnumC24184.READING) {
                return;
            }
            this.f21338.f39405--;
            this.f21340 = EnumC24184.RELEASED;
            C4046.m13010(this.f21339, this.f21338);
            this.f21339.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m17966() {
        synchronized (this.f21339) {
            if (this.f21340 == EnumC24184.READING) {
                this.f21338.f39405--;
                if (this.f21338.f39406 == null) {
                    this.f21340 = EnumC24184.REFRESHING;
                    this.f21338.f39406 = this;
                    this.f21339.notifyAll();
                    while (this.f21338.f39405 > 0) {
                        m17961();
                    }
                    m17962();
                    return true;
                }
                this.f21340 = EnumC24184.WAITING;
                this.f21338.f39407++;
                this.f21339.notifyAll();
                while (this.f21338.f39406 != null) {
                    m17961();
                }
                m17962();
                this.f21338.f39407--;
                this.f21338.f39405++;
                this.f21340 = EnumC24184.READING;
                return false;
            }
            throw new IllegalStateException("Unexpected HLS playlist cache lease state: " + this.f21340);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m17964() {
        synchronized (this.f21339) {
            if (this.f21340 != EnumC24184.REFRESHING) {
                return;
            }
            if (this.f21338.f39406 == this) {
                this.f21338.f39406 = null;
            }
            this.f21340 = EnumC24184.RELEASED;
            C4046.m13010(this.f21339, this.f21338);
            this.f21339.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m17965() throws InterruptedIOException {
        synchronized (this.f21339) {
            m17962();
        }
        if (Thread.currentThread().isInterrupted()) {
            throw C4046.m13009("Interrupted while loading HLS playlist", (InterruptedException) null);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m17961() throws InterruptedIOException {
        try {
            this.f21339.wait();
            m17962();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            m17960();
            throw C4046.m13009("Interrupted while waiting for HLS playlist cache", e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m17962() throws InterruptedIOException {
        if (this.f21339.f13785 || this.f21340 == EnumC24184.RELEASED) {
            throw C4046.m13009("HLS playlist cache lease was released", (InterruptedException) null);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m17960() {
        EnumC24184 enumC24184 = this.f21340;
        EnumC24184 enumC24185 = EnumC24184.WAITING;
        C12249 c12249 = this.f21338;
        if (enumC24184 == enumC24185) {
            c12249.f39407--;
        } else if (enumC24184 == EnumC24184.READING) {
            c12249.f39405--;
        } else if (enumC24184 == EnumC24184.REFRESHING && c12249.f39406 == this) {
            c12249.f39406 = null;
        }
        this.f21340 = EnumC24184.RELEASED;
        C4046 c4046 = this.f21339;
        C4046.m13010(c4046, c12249);
        c4046.notifyAll();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f21339) {
            if (this.f21340 != EnumC24184.RELEASED) {
                m17960();
            }
        }
    }
}
