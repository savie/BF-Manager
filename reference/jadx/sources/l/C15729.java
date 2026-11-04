package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܶ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes5.dex */
public final class C15729 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23189 f51165;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f51166;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f51167;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f51168 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C15729(C23189 c23189) {
        this.f51165 = c23189;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f51168;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C17359.checkFromIndexSize(i, i2, bArr.length);
        C23189 c23189 = this.f51165;
        C3051 c3051 = c23189.f75152;
        C3051.m9914(c3051);
        if (this.f51166) {
            throw new IOException("Legacy state slice is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f51167 == c23189.f75151) {
            return -1;
        }
        int i3 = c3051.f9887.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, c23189.f75151 - this.f51167)), c23189.f75153 + this.f51167);
        if (i3 <= 0) {
            throw new EOFException("Legacy state slice is truncated");
        }
        this.f51167 += (long) i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f51166 = true;
    }
}
