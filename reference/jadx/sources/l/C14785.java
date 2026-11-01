package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܳ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes4.dex */
public final class C14785 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10983 f48333;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CountDownLatch f48334;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f48335;

    public C14785(AtomicReference atomicReference, InterfaceC10983 interfaceC10983, CountDownLatch countDownLatch) {
        this.f48335 = atomicReference;
        this.f48333 = interfaceC10983;
        this.f48334 = countDownLatch;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35422() throws IOException {
        IOException iOException = (IOException) this.f48335.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m35422();
        this.f48333.writeByte(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m35422();
        this.f48333.mo16397(i, i2, bArr);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m35422();
        this.f48333.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m35422();
        this.f48333.close();
        try {
            this.f48334.await();
        } catch (InterruptedException unused) {
        }
        m35422();
    }
}
