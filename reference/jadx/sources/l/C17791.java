package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M8BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17791 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15995 f56403;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final OutputStream f56404;

    public C17791(OutputStream outputStream) {
        this.f56404 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.f56403 == null) {
            this.f56403 = new C15995(this.f56404);
        }
        this.f56403.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return;
        }
        if (this.f56403 == null) {
            this.f56403 = new C15995(this.f56404);
        }
        this.f56403.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        C15995 c15995 = this.f56403;
        if (c15995 != null) {
            c15995.flush();
        } else {
            this.f56404.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C15995 c15995 = this.f56403;
        if (c15995 != null) {
            c15995.close();
        } else {
            this.f56404.close();
        }
    }
}
