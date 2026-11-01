package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟ܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7531 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f25031;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f25032;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f25033;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C7531(InputStream inputStream) {
        super(inputStream);
        this.f25031 = 268435456L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        m20055();
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            m20054(1L);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        m20055();
        InputStream inputStream = ((FilterInputStream) this).in;
        long j = i2;
        long j2 = this.f25031 - this.f25032;
        if (j2 != C17492.FOREVER_NS) {
            j2++;
        }
        int i3 = inputStream.read(bArr, i, (int) Math.min(j, j2));
        if (i3 > 0) {
            m20054(i3);
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        m20055();
        InputStream inputStream = ((FilterInputStream) this).in;
        long j2 = this.f25031 - this.f25032;
        if (j2 != C17492.FOREVER_NS) {
            j2++;
        }
        long jSkip = inputStream.skip(Math.min(j, j2));
        if (jSkip > 0) {
            m20054(jSkip);
        }
        return jSkip;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m20054(long j) throws IOException {
        long j2 = this.f25032;
        if (j > this.f25031 - j2) {
            this.f25033 = true;
        } else {
            this.f25032 = j2 + j;
        }
        m20055();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20055() throws IOException {
        if (this.f25033) {
            throw new IOException("Image input exceeds byte limit");
        }
    }
}
