package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۖܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4GJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2803 extends OutputStream {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public OutputStream f9221;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public CRC32 f9222 = new CRC32();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f9220 = 0;

    public C2803(OutputStream outputStream) {
        this.f9221 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f9221.write(bArr, i, i2);
        this.f9222.update(bArr, i, i2);
        this.f9220 += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f9221.write(i);
        this.f9222.update(i);
        this.f9220++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m9271() {
        return this.f9220;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m9272() {
        return (int) this.f9222.getValue();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9221.close();
    }
}
