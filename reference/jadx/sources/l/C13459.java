package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13459 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f44520;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InputStream f44522;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f44523 = new byte[8];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f44521 = true;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C13459(long j, InputStream inputStream) {
        this.f44522 = inputStream;
        this.f44520 = j;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!this.f44521) {
            throw new IOException("Legacy app state field is closed");
        }
        if (this.f44520 == 0) {
            return -1;
        }
        int i = this.f44522.read();
        if (i < 0) {
            throw new EOFException("Truncated legacy app state field");
        }
        this.f44520--;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C13638.checkFromIndexSize(i, i2, bArr.length);
        if (!this.f44521) {
            throw new IOException("Legacy app state field is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f44520;
        if (j == 0) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j);
        int i3 = this.f44522.read(bArr, i, iMin);
        if (i3 <= 0 || i3 > iMin) {
            throw new EOFException("Truncated or stalled legacy app state field");
        }
        this.f44520 -= (long) i3;
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17367 m32945(int i) throws EOFException {
        if (i > this.f44520) {
            throw new EOFException("Truncated legacy app state number");
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f44523;
            if (i2 == i) {
                return new C17367(bArr);
            }
            i2 += read(bArr, i2, i - i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32944() {
        return m32945(4).readInt();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f44521 = false;
    }
}
