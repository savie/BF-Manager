package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳ᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18323 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final OutputStream f58459;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f58460;

    public C18323(OutputStream outputStream) {
        this.f58459 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f58459.write(i);
        long j = this.f58460;
        long j2 = 1;
        if (j > 9007199254740991L - j2) {
            throw new IOException("Output exceeds the supported size range");
        }
        this.f58460 = j + j2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f58459.write(bArr, i, i2);
        long j = this.f58460;
        long j2 = i2;
        if (j > 9007199254740991L - j2) {
            throw new IOException("Output exceeds the supported size range");
        }
        this.f58460 = j + j2;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f58459.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f58459.close();
    }
}
