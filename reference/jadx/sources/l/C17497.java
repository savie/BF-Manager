package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17497 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f56856;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 f56857;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f56858;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C17497(InterfaceC17713 interfaceC17713, long j, long j2) {
        this.f56857 = interfaceC17713;
        this.f56858 = j;
        this.f56856 = j2;
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.f56856;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        synchronized (this.f56857) {
            this.f56857.seek(this.f56858);
            i3 = this.f56857.read(bArr, i, i2);
            if (i3 > 0) {
                long j2 = i3;
                this.f56856 -= j2;
                this.f56858 += j2;
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        long j = this.f56856;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }
}
