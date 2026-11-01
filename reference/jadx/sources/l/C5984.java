package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 54G6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5984 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f20347;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7739 f20348;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f20349;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f20350;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C5984(InterfaceC7739 interfaceC7739, long j, long j2, boolean z) {
        this.f20348 = interfaceC7739;
        this.f20347 = z;
        this.f20349 = j2;
        this.f20350 = j;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i;
        long j = this.f20349;
        this.f20349 = j - 1;
        if (j <= 0) {
            return -1;
        }
        synchronized (this.f20348) {
            try {
                try {
                    InterfaceC7739 interfaceC7739 = this.f20348;
                    long j2 = this.f20350;
                    this.f20350 = 1 + j2;
                    interfaceC7739.seek(j2);
                    i = this.f20348.read();
                } catch (IOException e) {
                    if (this.f20347 && !(e instanceof EOFException) && !(e instanceof InterruptedIOException)) {
                        throw new C9513(e.getMessage(), e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) (this.f20349 & 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f20349;
        if (j <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        synchronized (this.f20348) {
            try {
                this.f20348.seek(this.f20350);
                i3 = this.f20348.read(bArr, i, i2);
            } catch (IOException e) {
                if (this.f20347 && !(e instanceof EOFException) && !(e instanceof InterruptedIOException)) {
                    throw new C9513(e.getMessage(), e);
                }
                throw e;
            }
        }
        if (i3 > 0) {
            long j2 = i3;
            this.f20350 += j2;
            this.f20349 -= j2;
        }
        return i3;
    }
}
