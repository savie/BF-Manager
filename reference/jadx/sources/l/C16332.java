package l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽ֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16332 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f52615;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13364 f52616;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FileOutputStream f52617;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f52618;

    public C16332(File file, long j, C13364 c13364) {
        this.f52617 = new FileOutputStream(file);
        this.f52615 = j;
        this.f52616 = c13364;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        C13364 c13364 = this.f52616;
        AbstractC1886.m6135(c13364);
        long j = i2;
        if (j <= this.f52615 - this.f52618) {
            this.f52617.write(bArr, i, i2);
            this.f52618 += j;
            AbstractC1886.m6135(c13364);
            return;
        }
        throw new IOException("Image export exceeds byte limit");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C13364 c13364 = this.f52616;
        AbstractC1886.m6135(c13364);
        if (1 <= this.f52615 - this.f52618) {
            this.f52617.write(i);
            this.f52618++;
            AbstractC1886.m6135(c13364);
            return;
        }
        throw new IOException("Image export exceeds byte limit");
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f52617.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f52617.close();
    }
}
