package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAH8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8941 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f29180;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f29181;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f29182;

    public AbstractC8941(OutputStream outputStream) {
        super(outputStream);
        this.f29181 = new byte[1];
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f29180 = true;
    }

    public void finish() {
        this.f29182 = true;
    }

    public final boolean isClosed() {
        return this.f29180;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23905() throws IOException {
        if (this.f29182) {
            throw new IOException("Stream has already been finished.");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m23906() {
        return this.f29182;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f29181;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }
}
