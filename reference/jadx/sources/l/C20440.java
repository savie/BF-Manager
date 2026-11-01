package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩶᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20440 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final OutputStream f66269;

    public C20440(OutputStream outputStream) {
        this.f66269 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.f66269.write(i);
        } catch (RuntimeException e) {
            throw C17617.m40982(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f66269.write(bArr, i, i2);
        } catch (RuntimeException e) {
            throw C17617.m40982(e);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f66269.flush();
        } catch (RuntimeException e) {
            throw C17617.m40982(e);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.f66269.close();
        } catch (RuntimeException e) {
            throw C17617.m40982(e);
        }
    }
}
