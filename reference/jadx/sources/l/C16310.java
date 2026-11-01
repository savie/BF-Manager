package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F2NF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16310 extends AbstractC23366 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final OutputStream f52516;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f52517 = 0;

    public C16310(OutputStream outputStream) {
        this.f52516 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f52516.write(i);
        long j = this.f52517;
        if (j >= 0) {
            this.f52517 = j + 1;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f52516.write(bArr, i, i2);
        long j = this.f52517;
        if (j >= 0) {
            this.f52517 = j + ((long) i2);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f52516.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f52516.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m38455() {
        return this.f52517;
    }
}
