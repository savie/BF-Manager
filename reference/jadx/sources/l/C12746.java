package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12746 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InputStream f40808;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f40810;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f40811 = new byte[8];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f40809 = true;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C12746(long j, InputStream inputStream) {
        this.f40808 = inputStream;
        this.f40810 = j;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!this.f40809) {
            throw new IOException("Legacy app state field is closed");
        }
        if (this.f40810 == 0) {
            return -1;
        }
        int i = this.f40808.read();
        if (i < 0) {
            throw new EOFException("Truncated legacy app state field");
        }
        this.f40810--;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C17359.checkFromIndexSize(i, i2, bArr.length);
        if (!this.f40809) {
            throw new IOException("Legacy app state field is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f40810;
        if (j == 0) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j);
        int i3 = this.f40808.read(bArr, i, iMin);
        if (i3 <= 0 || i3 > iMin) {
            throw new EOFException("Truncated or stalled legacy app state field");
        }
        this.f40810 -= (long) i3;
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20348 m31583(int i) throws EOFException {
        if (i > this.f40810) {
            throw new EOFException("Truncated legacy app state number");
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f40811;
            if (i2 == i) {
                return new C20348(bArr);
            }
            i2 += read(bArr, i2, i - i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31582() {
        return m31583(4).readInt();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40809 = false;
    }
}
