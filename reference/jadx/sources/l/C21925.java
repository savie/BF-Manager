package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩹֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21925 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f71130;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0757 f71131;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C21925(C0757 c0757, int i) {
        this.f71131 = c0757;
        this.f71130 = i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f71130 == 0) {
            return -1;
        }
        int i = this.f71131.readByte();
        this.f71130--;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f71130;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f71131.read(bArr, i, Math.min(i3, i2));
        if (i4 < 0) {
            throw new EOFException("Truncated legacy UTF field");
        }
        this.f71130 -= i4;
        return i4;
    }
}
