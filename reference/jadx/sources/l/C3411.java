package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3411 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Closeable f12591;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f12592;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f12593;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4513 f12594;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f12595 = new FutureC12075();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m10112() {
        try {
            if (!this.f12592 && !this.f12593) {
                this.f12592 = true;
                try {
                    C4716.f16635.execute(new Runnable() { // from class: l.ۢᩴۖ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3411 c3411 = this.f32824;
                            c3411.getClass();
                            try {
                                c3411.close();
                            } catch (IOException unused) {
                            }
                        }
                    });
                } catch (RuntimeException unused) {
                    this.f12592 = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C3411(C4513 c4513, Closeable closeable) {
        this.f12594 = c4513;
        this.f12591 = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean z;
        synchronized (this) {
            z = this.f12593;
            this.f12593 = true;
        }
        if (!z) {
            try {
                this.f12591.close();
                this.f12595.m30019((Object) null);
            } catch (Throwable th) {
                try {
                    this.f12595.m30021(th);
                } catch (Throwable th2) {
                    C4513.m12549(this.f12594, this);
                    throw th2;
                }
            }
            C4513.m12549(this.f12594, this);
        }
        try {
            this.f12595.m30027();
        } catch (C17013 e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (!(cause instanceof Error)) {
                throw new IOException("Input close failed", cause);
            }
            throw ((Error) cause);
        }
    }
}
