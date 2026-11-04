package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54G6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10260 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f32762;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 f32763;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f32764;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f32765;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C10260(InterfaceC17713 interfaceC17713, long j, long j2, boolean z) {
        this.f32763 = interfaceC17713;
        this.f32764 = z;
        this.f32762 = j2;
        this.f32765 = j;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i;
        long j = this.f32762;
        this.f32762 = j - 1;
        if (j <= 0) {
            return -1;
        }
        synchronized (this.f32763) {
            try {
                try {
                    InterfaceC17713 interfaceC17713 = this.f32763;
                    long j2 = this.f32765;
                    this.f32765 = 1 + j2;
                    interfaceC17713.seek(j2);
                    i = this.f32763.read();
                } catch (IOException e) {
                    if (this.f32764 && !(e instanceof EOFException) && !(e instanceof InterruptedIOException)) {
                        throw new C7278(e.getMessage(), e);
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
        return (int) (this.f32762 & 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f32762;
        if (j <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        synchronized (this.f32763) {
            try {
                this.f32763.seek(this.f32765);
                i3 = this.f32763.read(bArr, i, i2);
            } catch (IOException e) {
                if (this.f32764 && !(e instanceof EOFException) && !(e instanceof InterruptedIOException)) {
                    throw new C7278(e.getMessage(), e);
                }
                throw e;
            }
        }
        if (i3 > 0) {
            long j2 = i3;
            this.f32765 += j2;
            this.f32762 -= j2;
        }
        return i3;
    }
}
