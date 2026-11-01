package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8237 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f28676;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC1886 f28677;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14588 f28678;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f28679;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC5614 f28680;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f28681;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f28682 = new byte[1];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BufferedInputStream f28683;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C8237(AbstractC1886 abstractC1886, C22682 c22682) {
        this.f28677 = abstractC1886;
        this.f28680 = c22682;
        this.f28678 = abstractC1886.mo5283();
        this.f28683 = new BufferedInputStream(abstractC1886.mo5285(), 32768);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f28682;
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f28681 = this.f28679;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        long j;
        long j2;
        AbstractC1886 abstractC1886 = this.f28677;
        try {
            IOException iOException = this.f28676;
            if (iOException == null) {
                AbstractC1886.m6135(this.f28680);
                abstractC1886.m6137(this.f28678);
                close();
                this.f28683 = new BufferedInputStream(abstractC1886.mo5285(), 32768);
                this.f28679 = 0L;
                byte[] bArr = new byte[1024];
                do {
                    j = this.f28679;
                    j2 = this.f28681;
                    if (j >= j2) {
                        return;
                    }
                } while (read(bArr, 0, (int) Math.min(1024, j2 - j)) >= 0);
                throw new IOException("GIF rewind reached end of input");
            }
            throw iOException;
        } catch (IOException e) {
            this.f28676 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            IOException iOException = this.f28676;
            if (iOException == null) {
                AbstractC1886.m6135(this.f28680);
                BufferedInputStream bufferedInputStream = this.f28683;
                if (bufferedInputStream == null) {
                    throw new InterruptedIOException("GIF input is closed");
                }
                int i3 = bufferedInputStream.read(bArr, i, (int) Math.min(i2, 268435457 - this.f28679));
                if (i3 > 0) {
                    long j = this.f28679 + ((long) i3);
                    this.f28679 = j;
                    if (j > 268435456) {
                        throw new IOException("GIF input exceeds byte limit");
                    }
                }
                return i3;
            }
            throw iOException;
        } catch (IOException e) {
            this.f28676 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        BufferedInputStream bufferedInputStream = this.f28683;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (IOException unused) {
            }
            this.f28683 = null;
        }
    }
}
