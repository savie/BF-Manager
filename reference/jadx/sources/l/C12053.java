package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C12053 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C23988 f38823;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Closeable f38824;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Throwable f38825;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f38826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f38827;

    public C12053(C23988 c23988, Closeable closeable) {
        this.f38823 = c23988;
        this.f38824 = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f38827) {
                m30232();
                return;
            }
            if (this.f38826) {
                boolean z = false;
                while (!this.f38827) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                m30232();
                return;
            }
            this.f38826 = true;
            try {
                this.f38824.close();
                synchronized (this) {
                    this.f38825 = null;
                    this.f38827 = true;
                    notifyAll();
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f38825 = th;
                    this.f38827 = true;
                    notifyAll();
                }
            }
            C23988.m53535(this.f38823, this);
            m30232();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30232() throws IOException {
        Throwable th = this.f38825;
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
            throw new IOException("Failed to close HLS thumbnail resource", th);
        }
    }
}
