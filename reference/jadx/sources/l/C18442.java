package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4R6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18442 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f58796;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f58797;

    public C18442(BufferedOutputStream bufferedOutputStream, BufferedOutputStream bufferedOutputStream2) {
        this.f58796 = bufferedOutputStream;
        this.f58797 = bufferedOutputStream2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f58796.write(i);
        this.f58797.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f58796.write(bArr, i, i2);
        this.f58797.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f58796.flush();
        this.f58797.flush();
    }
}
