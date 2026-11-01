package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAH8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19221 extends FilterOutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] f62079;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f62080;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f62081;

    public AbstractC19221(OutputStream outputStream) {
        super(outputStream);
        this.f62079 = new byte[1];
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f62080 = true;
    }

    public void finish() {
        this.f62081 = true;
    }

    public final boolean isClosed() {
        return this.f62080;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44138() throws IOException {
        if (this.f62081) {
            throw new IOException("Stream has already been finished.");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m44139() {
        return this.f62081;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f62079;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }
}
