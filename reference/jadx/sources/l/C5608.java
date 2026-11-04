package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5608 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1879 f19436;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C5608(C1879 c1879) {
        this.f19436 = c1879;
    }

    @Override // java.io.InputStream
    public final int read() {
        C1879 c1879 = this.f19436;
        if (c1879.f6314 > 0) {
            return c1879.readByte() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f19436.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f19436.f6314, 2147483647L);
    }

    public final String toString() {
        return this.f19436 + ".inputStream()";
    }
}
