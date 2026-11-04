package l;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۧܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11766 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final MessageDigest f38027;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f38028;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final OutputStream f38029;

    public C11766(OutputStream outputStream, MessageDigest messageDigest) {
        this.f38029 = outputStream;
        this.f38027 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f38029.write(i);
        this.f38027.update((byte) i);
        long j = this.f38028;
        long j2 = 1;
        if (j > 9007199254740991L - j2) {
            throw new IOException("Output exceeds the supported size range");
        }
        this.f38028 = j + j2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f38029.write(bArr, i, i2);
        this.f38027.update(bArr, i, i2);
        long j = this.f38028;
        long j2 = i2;
        if (j > 9007199254740991L - j2) {
            throw new IOException("Output exceeds the supported size range");
        }
        this.f38028 = j + j2;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f38029.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38029.close();
    }
}
