package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۚۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 56K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5369 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InputStream f18824;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1640 f18825;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f18826 = new AtomicBoolean();

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C5369(C1640 c1640, InputStream inputStream) {
        this.f18825 = c1640;
        this.f18824 = inputStream;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C1640 c1640 = this.f18825;
        c1640.m5807();
        if (this.f18826.get()) {
            throw new IOException("Audio thumbnail stream is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = 16777216 - c1640.f5667;
        if (j <= 0) {
            throw new IOException("Audio thumbnail read limit exceeded");
        }
        int i3 = this.f18824.read(bArr, i, (int) Math.min(i2, j));
        if (i3 > 0) {
            c1640.f5667 += (long) i3;
        }
        c1640.m5807();
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i;
        byte[] bArr = new byte[4096];
        long j2 = 0;
        while (j2 < j && (i = read(bArr, 0, (int) Math.min(4096, j - j2))) >= 0) {
            j2 += (long) i;
        }
        return j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16036() {
        Closeable closeable = this.f18824;
        if (closeable instanceof InterfaceC18696) {
            this.f18826.set(true);
            ((InterfaceC18696) closeable).cancel();
        } else {
            C20244.m46520(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f18826.compareAndSet(false, true)) {
            this.f18824.close();
        }
    }
}
