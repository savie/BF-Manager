package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21508 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC7739 f69878;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f69879;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f69880;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C21508(InterfaceC7739 interfaceC7739, long j, long j2) {
        this.f69878 = interfaceC7739;
        this.f69880 = j;
        this.f69879 = j2;
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.f69879;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        synchronized (this.f69878) {
            this.f69878.seek(this.f69880);
            i3 = this.f69878.read(bArr, i, i2);
            if (i3 > 0) {
                long j2 = i3;
                this.f69879 -= j2;
                this.f69880 += j2;
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        long j = this.f69879;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }
}
