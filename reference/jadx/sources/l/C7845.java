package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7845 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19032 f26133;

    public C7845(C19032 c19032) {
        this.f26133 = c19032;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C19032 c19032 = this.f26133;
        if (c19032.f61656) {
            throw new IOException("closed");
        }
        c19032.f61654.m6455writeByte((int) ((byte) i));
        c19032.mo6431();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C19032 c19032 = this.f26133;
        if (c19032.f61656) {
            throw new IOException("closed");
        }
        c19032.f61654.write(bArr, i, i2);
        c19032.mo6431();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        C19032 c19032 = this.f26133;
        if (c19032.f61656) {
            return;
        }
        c19032.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f26133.close();
    }

    public final String toString() {
        return this.f26133 + ".outputStream()";
    }
}
