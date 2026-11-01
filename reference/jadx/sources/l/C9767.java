package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9767 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f32830;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f32831;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C9767(long j, InputStream inputStream) {
        this.f32831 = inputStream;
        this.f32830 = Math.max(j, 0L);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f32830 <= 0) {
            return -1;
        }
        int i = this.f32831.read();
        if (i != -1) {
            this.f32830--;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f32830;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.f32831.read(bArr, i, (int) Math.min(i2, j));
        if (i3 > 0) {
            this.f32830 -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32831.close();
    }
}
