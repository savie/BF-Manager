package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 34CP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21296 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17768 f69306;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C21296(C17768 c17768) {
        this.f69306 = c17768;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C17768 c17768 = this.f69306;
        C6043 c6043 = c17768.f56358;
        if (c17768.f56359) {
            throw new IOException("closed");
        }
        if (c6043.f20522 == 0 && c17768.f56357.mo2293(c6043, 8192L) == -1) {
            return -1;
        }
        return c6043.readByte() & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C17768 c17768 = this.f69306;
        C6043 c6043 = c17768.f56358;
        if (c17768.f56359) {
            throw new IOException("closed");
        }
        C15653.m37329(bArr.length, i, i2);
        if (c6043.f20522 == 0 && c17768.f56357.mo2293(c6043, 8192L) == -1) {
            return -1;
        }
        return c6043.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        C17768 c17768 = this.f69306;
        if (c17768.f56359) {
            throw new IOException("closed");
        }
        return (int) Math.min(c17768.f56358.f20522, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f69306.close();
    }

    public final String toString() {
        return this.f69306 + ".inputStream()";
    }
}
