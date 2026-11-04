package l;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2OJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13223 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f42209;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f42210;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        InputStream inputStream = ((FilterInputStream) this).in;
        C17359.requireNonNull(inputStream);
        inputStream.mark(i);
        this.f42210 = this.f42209;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        InputStream inputStream = ((FilterInputStream) this).in;
        C17359.requireNonNull(inputStream);
        if (!inputStream.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f42210 == -1) {
            throw new IOException("Mark not set");
        }
        InputStream inputStream2 = ((FilterInputStream) this).in;
        C17359.requireNonNull(inputStream2);
        inputStream2.reset();
        this.f42209 = this.f42210;
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C13223(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.f42210 = -1L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        C17359.requireNonNull(inputStream);
        int i = inputStream.read();
        if (i != -1) {
            this.f42209++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        C17359.requireNonNull(inputStream);
        int i3 = inputStream.read(bArr, i, i2);
        if (i3 != -1) {
            this.f42209 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        C17359.requireNonNull(inputStream);
        long jSkip = inputStream.skip(j);
        this.f42209 += jSkip;
        return jSkip;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m32768() {
        return this.f42209;
    }
}
