package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8MX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0261 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12257 f1538;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f1542;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f1541 = false;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f1540 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f1539 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C0261(InterfaceC15785 interfaceC15785, C12257 c12257) {
        this.f1542 = interfaceC15785;
        this.f1538 = c12257;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f1539;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C2023.m6510(!this.f1540);
        boolean z = this.f1541;
        InterfaceC15785 interfaceC15785 = this.f1542;
        if (!z) {
            interfaceC15785.mo9272(this.f1538);
            this.f1541 = true;
        }
        int i3 = interfaceC15785.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1540) {
            return;
        }
        this.f1542.close();
        this.f1540 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1760() {
        if (this.f1541) {
            return;
        }
        this.f1542.mo9272(this.f1538);
        this.f1541 = true;
    }
}
