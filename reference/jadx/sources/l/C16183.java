package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16183 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20107 f52523;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final OutputStream f52524;

    public C16183(OutputStream outputStream) {
        this.f52524 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.f52523 == null) {
            this.f52523 = new C20107(this.f52524);
        }
        this.f52523.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return;
        }
        if (this.f52523 == null) {
            this.f52523 = new C20107(this.f52524);
        }
        this.f52523.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        C20107 c20107 = this.f52523;
        if (c20107 != null) {
            c20107.flush();
        } else {
            this.f52524.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C20107 c20107 = this.f52523;
        if (c20107 != null) {
            c20107.close();
        } else {
            this.f52524.close();
        }
    }
}
