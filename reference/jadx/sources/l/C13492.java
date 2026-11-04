package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.۬֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X6S5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13492 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileChannel f42910;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42911;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f42912;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f42913 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C13492(C6781 c6781, FileChannel fileChannel) {
        this.f42910 = fileChannel;
        this.f42912 = c6781.f22605;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f42913;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C17359.checkFromIndexSize(i, i2, bArr.length);
        if (this.f42911) {
            throw new IOException("Migration state stream is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f42912;
        if (j == 0) {
            return -1;
        }
        int i3 = this.f42910.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, j)));
        if (i3 <= 0) {
            throw new EOFException("Migration state changed during reading");
        }
        this.f42912 -= (long) i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f42911) {
            return;
        }
        this.f42911 = true;
        this.f42910.close();
    }
}
