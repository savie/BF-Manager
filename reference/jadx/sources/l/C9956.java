package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4R6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9956 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f32006;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f32007;

    public C9956(BufferedOutputStream bufferedOutputStream, BufferedOutputStream bufferedOutputStream2) {
        this.f32006 = bufferedOutputStream;
        this.f32007 = bufferedOutputStream2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f32006.write(i);
        this.f32007.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f32006.write(bArr, i, i2);
        this.f32007.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f32006.flush();
        this.f32007.flush();
    }
}
