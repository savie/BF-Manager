package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17994 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f58933;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C15294 f58934;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f58935;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC13057 f58936;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC7509 f58937;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IOException f58938;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f58939 = new byte[1];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BufferedInputStream f58940;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C17994(AbstractC13057 abstractC13057, C4108 c4108) {
        this.f58936 = abstractC13057;
        this.f58937 = c4108;
        this.f58934 = abstractC13057.mo17423();
        this.f58940 = new BufferedInputStream(abstractC13057.mo17428(), 32768);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f58939;
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f58933 = this.f58935;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        long j;
        long j2;
        AbstractC13057 abstractC13057 = this.f58936;
        try {
            IOException iOException = this.f58938;
            if (iOException == null) {
                AbstractC13057.m32543(this.f58937);
                abstractC13057.m32544(this.f58934);
                close();
                this.f58940 = new BufferedInputStream(abstractC13057.mo17428(), 32768);
                this.f58935 = 0L;
                byte[] bArr = new byte[1024];
                do {
                    j = this.f58935;
                    j2 = this.f58933;
                    if (j >= j2) {
                        return;
                    }
                } while (read(bArr, 0, (int) Math.min(1024, j2 - j)) >= 0);
                throw new IOException("GIF rewind reached end of input");
            }
            throw iOException;
        } catch (IOException e) {
            this.f58938 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            IOException iOException = this.f58938;
            if (iOException == null) {
                AbstractC13057.m32543(this.f58937);
                BufferedInputStream bufferedInputStream = this.f58940;
                if (bufferedInputStream == null) {
                    throw new InterruptedIOException("GIF input is closed");
                }
                int i3 = bufferedInputStream.read(bArr, i, (int) Math.min(i2, 268435457 - this.f58935));
                if (i3 > 0) {
                    long j = this.f58935 + ((long) i3);
                    this.f58935 = j;
                    if (j > 268435456) {
                        throw new IOException("GIF input exceeds byte limit");
                    }
                }
                return i3;
            }
            throw iOException;
        } catch (IOException e) {
            this.f58938 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        BufferedInputStream bufferedInputStream = this.f58940;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (IOException unused) {
            }
            this.f58940 = null;
        }
    }
}
