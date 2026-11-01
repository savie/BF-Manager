package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۡ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54YN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9151 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC7739 f31099;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f31100;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f31101 = -1;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f31101 = this.f31100;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        long j = this.f31101;
        if (j < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        this.f31100 = j;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C9151(long j, C1388 c1388) {
        this.f31100 = j;
        this.f31099 = c1388;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f31100;
        InterfaceC7739 interfaceC7739 = this.f31099;
        interfaceC7739.seek(j);
        this.f31100++;
        return interfaceC7739.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        long j = this.f31100;
        InterfaceC7739 interfaceC7739 = this.f31099;
        interfaceC7739.seek(j);
        int i = interfaceC7739.read(bArr);
        if (i > 0) {
            this.f31100 += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f31100;
        InterfaceC7739 interfaceC7739 = this.f31099;
        interfaceC7739.seek(j);
        int i3 = interfaceC7739.read(bArr, i, i2);
        if (i3 > 0) {
            this.f31100 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long jMin = Math.min((int) j, available());
        this.f31100 += jMin;
        return jMin;
    }

    @Override // java.io.InputStream
    public final int available() {
        long length = this.f31099.length() - this.f31100;
        if (length > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) length;
    }
}
