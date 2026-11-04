package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34CP */
/* JADX INFO: loaded from: classes4.dex */
public final class C10081 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1133 f32320;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C10081(C1133 c1133) {
        this.f32320 = c1133;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C1133 c1133 = this.f32320;
        C1879 c1879 = c1133.f4207;
        if (c1133.f4209) {
            throw new IOException("closed");
        }
        if (c1879.f6314 == 0 && c1133.f4208.mo4186(c1879, 8192L) == -1) {
            return -1;
        }
        return c1879.readByte() & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C1133 c1133 = this.f32320;
        C1879 c1879 = c1133.f4207;
        if (c1133.f4209) {
            throw new IOException("closed");
        }
        C11222.m28280(bArr.length, i, i2);
        if (c1879.f6314 == 0 && c1133.f4208.mo4186(c1879, 8192L) == -1) {
            return -1;
        }
        return c1879.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        C1133 c1133 = this.f32320;
        if (c1133.f4209) {
            throw new IOException("closed");
        }
        return (int) Math.min(c1133.f4207.f6314, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32320.close();
    }

    public final String toString() {
        return this.f32320 + ".inputStream()";
    }
}
