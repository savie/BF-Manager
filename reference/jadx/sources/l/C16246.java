package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes5.dex */
public final class C16246 extends BufferedInputStream implements InterfaceC18696, InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20614 f52795;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f52796;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f52797;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C16246(C20614 c20614, InputStream inputStream) {
        super(inputStream, 32768);
        this.f52797 = new Object();
        this.f52796 = 0;
        this.f52795 = c20614;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f52797) {
            if (this.f52796 != 0) {
                return;
            }
            boolean z = true;
            this.f52796 = 1;
            try {
                super.close();
                synchronized (this.f52797) {
                    if (this.f52796 != 1) {
                        z = false;
                    }
                    this.f52796 = 2;
                }
                if (z) {
                    C10367.m26670(this.f52795);
                }
            } catch (IOException unused) {
                synchronized (this.f52797) {
                    if (this.f52796 != 1) {
                        z = false;
                    }
                    this.f52796 = 2;
                    if (z) {
                        C20614 c20614 = this.f52795;
                        int i = C10367.f32989;
                        C5261.f18540.execute(new RunnableC8131(c20614));
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f52797) {
                    if (this.f52796 != 1) {
                        z = false;
                    }
                    this.f52796 = 2;
                    if (z) {
                        C20614 c20615 = this.f52795;
                        int i2 = C10367.f32989;
                        C5261.f18540.execute(new RunnableC8131(c20615));
                    }
                    throw th;
                }
            }
        }
    }

    @Override // l.InterfaceC18696
    public final void cancel() {
        synchronized (this.f52797) {
            if (this.f52796 == 2) {
                return;
            }
            this.f52796 = 2;
            C20614 c20614 = this.f52795;
            int i = C10367.f32989;
            C5261.f18540.execute(new RunnableC8131(c20614));
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        if (this.f52796 == 0) {
        } else {
            throw new IOException("SFTP input stream is closed");
        }
        return super.read();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (this.f52796 == 0) {
        } else {
            throw new IOException("SFTP input stream is closed");
        }
        return super.read(bArr, i, Math.min(i2, EnumC6121.f20881));
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
