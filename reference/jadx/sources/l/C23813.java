package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.᩻ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6RA */
/* JADX INFO: loaded from: classes.dex */
public final class C23813 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f76998;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f76999;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileChannel f77000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f77001 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C23813(C14641 c14641, FileChannel fileChannel) {
        this.f77000 = fileChannel;
        this.f76998 = c14641.f47883;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f77001;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C13638.checkFromIndexSize(i, i2, bArr.length);
        if (this.f76999) {
            throw new IOException("Recovery attachment stream is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f76998;
        if (j == 0) {
            return -1;
        }
        int i3 = this.f77000.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, j)));
        if (i3 <= 0) {
            throw new EOFException("Recovery attachment changed during reading");
        }
        this.f76998 -= (long) i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f76999) {
            return;
        }
        this.f76999 = true;
        this.f77000.close();
    }
}
