package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۡܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes3.dex */
public final class C8975 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19551 f30732;

    public C8975(OutputStream outputStream) {
        super(outputStream);
        this.f30732 = new C19551(32768);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        C19551 c19551 = this.f30732;
        if (c19551.f62830 < 32768) {
            c19551.write(i);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        C19551 c19551 = this.f30732;
        int iMin = Math.min(32768 - c19551.f62830, i2);
        if (iMin > 0) {
            c19551.write(bArr, i, iMin);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }
}
