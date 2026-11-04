package l;

import java.io.IOException;
import java.io.OutputStream;
import net.sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.ۧܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C11683 extends OutputStream implements InterfaceC16251 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f37838;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f37839;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f37840;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f37841;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final NativeXZOutputStream f37842;

    public C11683(NativeXZOutputStream nativeXZOutputStream, long j) {
        this.f37842 = nativeXZOutputStream;
        this.f37838 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f37842.write(i);
        m29366(1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f37842.write(bArr, i, i2);
        m29366(i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f37842.flush();
        this.f37840 = this.f37839;
        this.f37841 = 0L;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f37842.close();
        this.f37840 = this.f37839;
        this.f37841 = 0L;
    }

    @Override // l.InterfaceC16251
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo29367() {
        return this.f37840;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29366(int i) throws IOException {
        long j = i;
        this.f37839 += j;
        long j2 = this.f37841 + j;
        long j3 = j2 - (j2 % 1048576);
        this.f37840 += j3;
        this.f37841 = j2 - j3;
        long j4 = this.f37838;
        if (j4 <= 0) {
            return;
        }
        if (j >= j4) {
            this.f37838 = 0L;
            this.f37842.flush();
            this.f37840 = this.f37839;
            this.f37841 = 0L;
            return;
        }
        this.f37838 = j4 - j;
    }
}
