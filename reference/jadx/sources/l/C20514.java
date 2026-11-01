package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

/* JADX INFO: renamed from: l.᩷֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6SP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20514 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f66488;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final PushbackInputStream f66489;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C20514(PushbackInputStream pushbackInputStream, int i) {
        this.f66489 = pushbackInputStream;
        this.f66488 = i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f66488 == 0) {
            return -1;
        }
        int iM37221 = C15576.m37221((InputStream) this.f66489);
        this.f66488--;
        return iM37221;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f66488;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f66489.read(bArr, i, Math.min(i2, i3));
        if (i4 < 0) {
            throw new EOFException("Truncated legacy compression block");
        }
        if (i4 <= 0) {
            throw new IOException("Legacy compression block read made no progress");
        }
        this.f66488 -= i4;
        return i4;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.min(this.f66488, this.f66489.available());
    }
}
