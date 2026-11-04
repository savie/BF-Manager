package l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P6N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11214 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final FileOutputStream f35374;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11438 f35375;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f35376;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f35377;

    public C11214(File file, long j, C11438 c11438) {
        this.f35374 = new FileOutputStream(file);
        this.f35376 = j;
        this.f35375 = c11438;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        C11438 c11438 = this.f35375;
        AbstractC13057.m32543(c11438);
        long j = i2;
        if (j <= this.f35376 - this.f35377) {
            this.f35374.write(bArr, i, i2);
            this.f35377 += j;
            AbstractC13057.m32543(c11438);
            return;
        }
        throw new IOException("Image export exceeds byte limit");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C11438 c11438 = this.f35375;
        AbstractC13057.m32543(c11438);
        if (1 <= this.f35376 - this.f35377) {
            this.f35374.write(i);
            this.f35377++;
            AbstractC13057.m32543(c11438);
            return;
        }
        throw new IOException("Image export exceeds byte limit");
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f35374.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f35374.close();
    }
}
