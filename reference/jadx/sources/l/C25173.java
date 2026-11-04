package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54YN */
/* JADX INFO: loaded from: classes.dex */
public final class C25173 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f81362;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 f81363;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f81364 = -1;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f81364 = this.f81362;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        long j = this.f81364;
        if (j < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        this.f81362 = j;
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C25173(long j, C13961 c13961) {
        this.f81362 = j;
        this.f81363 = c13961;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f81362;
        InterfaceC17713 interfaceC17713 = this.f81363;
        interfaceC17713.seek(j);
        this.f81362++;
        return interfaceC17713.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        long j = this.f81362;
        InterfaceC17713 interfaceC17713 = this.f81363;
        interfaceC17713.seek(j);
        int i = interfaceC17713.read(bArr);
        if (i > 0) {
            this.f81362 += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f81362;
        InterfaceC17713 interfaceC17713 = this.f81363;
        interfaceC17713.seek(j);
        int i3 = interfaceC17713.read(bArr, i, i2);
        if (i3 > 0) {
            this.f81362 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long jMin = Math.min((int) j, available());
        this.f81362 += jMin;
        return jMin;
    }

    @Override // java.io.InputStream
    public final int available() {
        long length = this.f81363.length() - this.f81362;
        if (length > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) length;
    }
}
