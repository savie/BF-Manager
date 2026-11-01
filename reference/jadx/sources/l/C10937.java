package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C10937 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f37195;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Closeable f37196;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Throwable f37197;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14465 f37198;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f37199;

    public C10937(C14465 c14465, Closeable closeable) {
        this.f37198 = c14465;
        this.f37196 = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f37199) {
                m27450();
                return;
            }
            if (this.f37195) {
                boolean z = false;
                while (!this.f37199) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                m27450();
                return;
            }
            this.f37195 = true;
            try {
                this.f37196.close();
                synchronized (this) {
                    this.f37197 = null;
                    this.f37199 = true;
                    notifyAll();
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f37197 = th;
                    this.f37199 = true;
                    notifyAll();
                }
            }
            C14465.m34864(this.f37198, this);
            m27450();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27450() throws IOException {
        Throwable th = this.f37197;
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
