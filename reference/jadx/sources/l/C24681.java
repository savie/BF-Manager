package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56SO */
/* JADX INFO: loaded from: classes.dex */
public final class C24681 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f79864;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16475 f79865;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C24681(C16475 c16475, int i) {
        this.f79865 = c16475;
        this.f79864 = i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f79864 == 0) {
            return -1;
        }
        int i = this.f79865.readByte();
        this.f79864--;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f79864;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f79865.read(bArr, i, Math.min(i3, i2));
        if (i4 < 0) {
            throw new EOFException("Truncated legacy UTF field");
        }
        this.f79864 -= i4;
        return i4;
    }
}
