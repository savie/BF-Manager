package l;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes3.dex */
public final class C0841 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f3160;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f3161;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f3162;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C0841(long j, InputStream inputStream) {
        super(inputStream);
        this.f3161 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3344(C6808 c6808) {
        if (((FilterInputStream) this).in instanceof FileInputStream) {
            C13519.m33209(C19853.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) ((FilterInputStream) this).in).getChannel()).size(), c6808);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        m3343();
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            m3342(1L);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        m3343();
        InputStream inputStream = ((FilterInputStream) this).in;
        long j = i2;
        long j2 = this.f3161 - this.f3160;
        if (j2 != C25227.FOREVER_NS) {
            j2++;
        }
        int i3 = inputStream.read(bArr, i, (int) Math.min(j, j2));
        if (i3 > 0) {
            m3342(i3);
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        m3343();
        InputStream inputStream = ((FilterInputStream) this).in;
        long j2 = this.f3161 - this.f3160;
        if (j2 != C25227.FOREVER_NS) {
            j2++;
        }
        long jSkip = inputStream.skip(Math.min(j, j2));
        if (jSkip > 0) {
            m3342(jSkip);
        }
        return jSkip;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m3342(long j) throws C9789 {
        long j2 = this.f3160;
        if (j > this.f3161 - j2) {
            this.f3162 = true;
        } else {
            this.f3160 = j2 + j;
        }
        m3343();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3343() throws C9789 {
        if (this.f3162) {
            throw new C9789("Image input exceeds byte limit");
        }
    }
}
