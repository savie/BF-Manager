package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܳۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4GJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14452 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public OutputStream f47396;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public CRC32 f47398 = new CRC32();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f47397 = 0;

    public C14452(OutputStream outputStream) {
        this.f47396 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f47396.write(bArr, i, i2);
        this.f47398.update(bArr, i, i2);
        this.f47397 += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f47396.write(i);
        this.f47398.update(i);
        this.f47397++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m34850() {
        return this.f47397;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m34851() {
        return (int) this.f47398.getValue();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f47396.close();
    }
}
