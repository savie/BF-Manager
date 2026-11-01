package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩺ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DO */
/* JADX INFO: loaded from: classes.dex */
public final class C22708 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14947 f73963;

    public C22708(C14947 c14947) {
        this.f73963 = c14947;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C14947 c14947 = this.f73963;
        if (c14947.f48765) {
            throw new IOException("closed");
        }
        c14947.f48764.m16434writeByte((int) ((byte) i));
        c14947.mo16425();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C14947 c14947 = this.f73963;
        if (c14947.f48765) {
            throw new IOException("closed");
        }
        c14947.f48764.write(bArr, i, i2);
        c14947.mo16425();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        C14947 c14947 = this.f73963;
        if (c14947.f48765) {
            return;
        }
        c14947.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f73963.close();
    }

    public final String toString() {
        return this.f73963 + ".outputStream()";
    }
}
