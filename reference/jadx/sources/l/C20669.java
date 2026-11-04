package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H6IQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20669 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7837 f66280;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f66281;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C20669(InputStream inputStream, C7837 c7837) {
        super(inputStream);
        this.f66281 = 536870912L;
        this.f66280 = c7837;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47300() throws IOException {
        AbstractC13057.m32543(this.f66280);
        if (this.f66281 <= 0) {
            throw new IOException("Image metadata scan limit exceeded");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        m47300();
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            this.f66281--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        m47300();
        int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, this.f66281));
        if (i3 > 0) {
            this.f66281 -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        m47300();
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, Math.min(this.f66281, 65536L)));
        this.f66281 -= jSkip;
        return jSkip;
    }
}
