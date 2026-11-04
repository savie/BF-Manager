package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20217 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f64898;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f64899;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C20217(long j, InputStream inputStream) {
        this.f64899 = inputStream;
        this.f64898 = Math.max(j, 0L);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f64898 <= 0) {
            return -1;
        }
        int i = this.f64899.read();
        if (i != -1) {
            this.f64898--;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f64898;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.f64899.read(bArr, i, (int) Math.min(i2, j));
        if (i3 > 0) {
            this.f64898 -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f64899.close();
    }
}
