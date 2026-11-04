package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֫ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J2K4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1901 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C1901 f6400 = new C1901();

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        throw new IOException("flush() failed: stream is closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C5125.m15493(i, i2, bArr);
        throw new IOException("write(byte[], int, int) failed: stream is closed");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        throw new IOException("write(int) failed: stream is closed");
    }
}
