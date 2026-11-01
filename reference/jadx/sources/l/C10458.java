package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۤᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R6VA */
/* JADX INFO: loaded from: classes3.dex */
public final class C10458 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35695;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Thread f35696 = Thread.currentThread();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9047 f35697;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26419() {
        this.f35697 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9047 m26420(Closeable closeable) {
        C9047 c9047;
        c9047 = new C9047(closeable);
        if (this.f35695) {
            c9047.close();
            throw new InterruptedIOException("Text search canceled.");
        }
        this.f35697 = c9047;
        return c9047;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m26422() {
        return this.f35695;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26421() {
        C9047 c9047;
        synchronized (this) {
            this.f35695 = true;
            Thread thread = this.f35696;
            if (thread != null) {
                thread.interrupt();
            }
            c9047 = this.f35697;
            this.f35697 = null;
        }
        if (c9047 == null) {
            return;
        }
        try {
            c9047.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26423() {
        C9047 c9047;
        synchronized (this) {
            this.f35696 = null;
            c9047 = this.f35697;
            this.f35697 = null;
        }
        if (c9047 == null) {
            return;
        }
        try {
            c9047.close();
        } catch (IOException unused) {
        }
    }
}
