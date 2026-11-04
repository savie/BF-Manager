package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

/* JADX INFO: renamed from: l.۟֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R6SP */
/* JADX INFO: loaded from: classes4.dex */
public final class C7526 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f24849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final PushbackInputStream f24850;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C7526(PushbackInputStream pushbackInputStream, int i) {
        this.f24850 = pushbackInputStream;
        this.f24849 = i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f24849 == 0) {
            return -1;
        }
        int iM43518 = C18713.m43518((InputStream) this.f24850);
        this.f24849--;
        return iM43518;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f24849;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f24850.read(bArr, i, Math.min(i2, i3));
        if (i4 < 0) {
            throw new EOFException("Truncated legacy compression block");
        }
        if (i4 <= 0) {
            throw new IOException("Legacy compression block read made no progress");
        }
        this.f24849 -= i4;
        return i4;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.min(this.f24849, this.f24850.available());
    }
}
