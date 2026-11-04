package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۤ᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11166 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f35163;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f35164;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16096 f35165;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11166(OutputStream outputStream, C16096 c16096, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        super(outputStream);
        this.f35165 = c16096;
        this.f35164 = atomicBoolean;
        this.f35163 = atomicReference;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(i);
            m28109();
        } catch (IOException e) {
            m28109();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            m28109();
        } catch (IOException e) {
            m28109();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
            m28109();
        } catch (IOException e) {
            m28109();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f35165.isClosed()) {
            m28109();
            return;
        }
        try {
            super.close();
            m28109();
            while (!this.f35164.get()) {
                m28109();
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                    return;
                }
            }
        } catch (IOException e) {
            m28109();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28109() throws IOException {
        IOException iOException = (IOException) this.f35163.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }
}
