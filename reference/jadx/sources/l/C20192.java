package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.᩵֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6VA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20192 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64822;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Thread f64823 = Thread.currentThread();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3038 f64824;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C3038 m46434(Closeable closeable) {
        C3038 c3038;
        c3038 = new C3038(closeable);
        if (this.f64822) {
            c3038.close();
            throw new InterruptedIOException("Text search canceled.");
        }
        this.f64824 = c3038;
        return c3038;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m46436() {
        return this.f64822;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m46438() {
        this.f64824 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46435() {
        C3038 c3038;
        synchronized (this) {
            this.f64822 = true;
            Thread thread = this.f64823;
            if (thread != null) {
                thread.interrupt();
            }
            c3038 = this.f64824;
            this.f64824 = null;
        }
        if (c3038 == null) {
            return;
        }
        try {
            c3038.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46437() {
        C3038 c3038;
        synchronized (this) {
            this.f64823 = null;
            c3038 = this.f64824;
            this.f64824 = null;
        }
        if (c3038 == null) {
            return;
        }
        try {
            c3038.close();
        } catch (IOException unused) {
        }
    }
}
