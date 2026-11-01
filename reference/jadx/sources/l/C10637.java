package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۧ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10637 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f36305;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f36306;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileChannel f36307;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f36308 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C10637(C5697 c5697, FileChannel fileChannel) {
        this.f36307 = fileChannel;
        this.f36305 = c5697.f19435;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f36308;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C13638.checkFromIndexSize(i, i2, bArr.length);
        if (this.f36306) {
            throw new IOException("Migration state stream is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f36305;
        if (j == 0) {
            return -1;
        }
        int i3 = this.f36307.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, j)));
        if (i3 <= 0) {
            throw new EOFException("Migration state changed during reading");
        }
        this.f36305 -= (long) i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f36306) {
            return;
        }
        this.f36306 = true;
        this.f36307.close();
    }
}
