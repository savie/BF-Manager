package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24769 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16563 f80164;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f80165;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f80166;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Closeable f80167;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f80168 = new FutureC23690();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m55290() {
        try {
            if (!this.f80165 && !this.f80166) {
                this.f80165 = true;
                try {
                    C5261.f18538.execute(new Runnable() { // from class: l.ۧۗ᩸
                        @Override // java.lang.Runnable
                        public final void run() {
                            C24769 c24769 = this.f35734;
                            c24769.getClass();
                            try {
                                c24769.close();
                            } catch (IOException unused) {
                            }
                        }
                    });
                } catch (RuntimeException unused) {
                    this.f80165 = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C24769(C16563 c16563, Closeable closeable) {
        this.f80164 = c16563;
        this.f80167 = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean z;
        synchronized (this) {
            z = this.f80166;
            this.f80166 = true;
        }
        if (!z) {
            try {
                this.f80167.close();
                this.f80168.m52935((Object) null);
            } catch (Throwable th) {
                try {
                    this.f80168.m52937(th);
                } catch (Throwable th2) {
                    C16563.m39238(this.f80164, this);
                    throw th2;
                }
            }
            C16563.m39238(this.f80164, this);
        }
        try {
            this.f80168.m52947();
        } catch (C3552 e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                IOException iOException = (IOException) cause;
                C22327.m50389(iOException);
                throw iOException;
            }
            if (cause instanceof RuntimeException) {
                RuntimeException runtimeException = (RuntimeException) cause;
                C22327.m50389(runtimeException);
                throw runtimeException;
            }
            if (!(cause instanceof Error)) {
                throw new IOException("Input close failed", cause);
            }
            Error error = (Error) cause;
            C22327.m50389(error);
            throw error;
        }
    }
}
