package l;

import java.io.IOException;
import java.io.OutputStream;
import net.sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.᩺ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes.dex */
public final class C23061 extends OutputStream implements InterfaceC19561 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f74917;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f74918;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f74919;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f74920;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final NativeXZOutputStream f74921;

    public C23061(NativeXZOutputStream nativeXZOutputStream, long j) {
        this.f74921 = nativeXZOutputStream;
        this.f74920 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f74921.write(i);
        m51012(1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f74921.write(bArr, i, i2);
        m51012(i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f74921.flush();
        this.f74919 = this.f74918;
        this.f74917 = 0L;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f74921.close();
        this.f74919 = this.f74918;
        this.f74917 = 0L;
    }

    @Override // l.InterfaceC19561
    /* JADX INFO: renamed from: ۙ */
    public final long mo44661() {
        return this.f74919;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51012(int i) throws IOException {
        long j = i;
        this.f74918 += j;
        long j2 = this.f74917 + j;
        long j3 = j2 - (j2 % 1048576);
        this.f74919 += j3;
        this.f74917 = j2 - j3;
        long j4 = this.f74920;
        if (j4 <= 0) {
            return;
        }
        if (j >= j4) {
            this.f74920 = 0L;
            this.f74921.flush();
            this.f74919 = this.f74918;
            this.f74917 = 0L;
            return;
        }
        this.f74920 = j4 - j;
    }
}
