package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F2NF */
/* JADX INFO: loaded from: classes.dex */
public final class C22158 extends AbstractC13207 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final OutputStream f71374;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f71375 = 0;

    public C22158(OutputStream outputStream) {
        this.f71374 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f71374.write(i);
        long j = this.f71375;
        if (j >= 0) {
            this.f71375 = j + 1;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f71374.write(bArr, i, i2);
        long j = this.f71375;
        if (j >= 0) {
            this.f71375 = j + ((long) i2);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f71374.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f71374.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m50122() {
        return this.f71375;
    }
}
