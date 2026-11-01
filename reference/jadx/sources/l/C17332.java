package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C17332 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6043 f55147;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C17332(C6043 c6043) {
        this.f55147 = c6043;
    }

    @Override // java.io.InputStream
    public final int read() {
        C6043 c6043 = this.f55147;
        if (c6043.f20522 > 0) {
            return c6043.readByte() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f55147.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f55147.f20522, 2147483647L);
    }

    public final String toString() {
        return this.f55147 + ".inputStream()";
    }
}
