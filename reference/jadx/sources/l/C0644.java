package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֡᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0644 extends FilterOutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f2759;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f2760;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19617 f2761;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0644(OutputStream outputStream, C19617 c19617, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        super(outputStream);
        this.f2761 = c19617;
        this.f2759 = atomicBoolean;
        this.f2760 = atomicReference;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(i);
            m2940();
        } catch (IOException e) {
            m2940();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            m2940();
        } catch (IOException e) {
            m2940();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
            m2940();
        } catch (IOException e) {
            m2940();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f2761.isClosed()) {
            m2940();
            return;
        }
        try {
            super.close();
            m2940();
            while (!this.f2759.get()) {
                m2940();
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                    return;
                }
            }
        } catch (IOException e) {
            m2940();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2940() throws IOException {
        IOException iOException = (IOException) this.f2760.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }
}
