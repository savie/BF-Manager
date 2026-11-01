package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۘ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3579 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f13170;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f13171;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6402 f13172;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f13173 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C3579(C6402 c6402) {
        this.f13172 = c6402;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f13173;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C13638.checkFromIndexSize(i, i2, bArr.length);
        C6402 c6402 = this.f13172;
        C22631 c22631 = c6402.f21716;
        C22631.m50163(c22631);
        if (this.f13171) {
            throw new IOException("Legacy state slice is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f13170 == c6402.f21715) {
            return -1;
        }
        int i3 = c22631.f73739.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, c6402.f21715 - this.f13170)), c6402.f21717 + this.f13170);
        if (i3 <= 0) {
            throw new EOFException("Legacy state slice is truncated");
        }
        this.f13170 += (long) i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13171 = true;
    }
}
