package l;

import java.io.IOException;
import java.io.OutputStream;
import net.sf.sevenzipjbinding.SevenZip;

/* JADX INFO: renamed from: l.֨֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes2.dex */
public final class C0804 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f3402;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f3403 = new byte[32768];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f3404;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final OutputStream f3405;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f3406;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f3407;

    public C0804(OutputStream outputStream) {
        this.f3405 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m3372();
        int i2 = this.f3406;
        int i3 = i2 + 1;
        this.f3406 = i3;
        byte[] bArr = this.f3403;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m3373();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m3372();
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        while (i2 > 0) {
            int i3 = this.f3406;
            byte[] bArr2 = this.f3403;
            if (i3 == 0 && i2 >= bArr2.length) {
                try {
                    byte[] bArrNativeWriteUltraDeflateCompressor = SevenZip.nativeWriteUltraDeflateCompressor(m3371(), bArr, i, bArr2.length);
                    if (bArrNativeWriteUltraDeflateCompressor != null && bArrNativeWriteUltraDeflateCompressor.length != 0) {
                        this.f3405.write(bArrNativeWriteUltraDeflateCompressor);
                    }
                    i += bArr2.length;
                    i2 -= bArr2.length;
                } catch (IOException e) {
                    IOException iOException = this.f3407;
                    if (iOException == null) {
                        this.f3407 = e;
                    } else if (iOException != e) {
                        iOException.addSuppressed(e);
                    }
                    long j = this.f3402;
                    this.f3402 = 0L;
                    if (j != 0) {
                        SevenZip.nativeDestroyUltraDeflateCompressor(j);
                    }
                    throw e;
                }
            } else {
                int iMin = Math.min(i2, bArr2.length - i3);
                System.arraycopy(bArr, i, bArr2, this.f3406, iMin);
                int i4 = this.f3406 + iMin;
                this.f3406 = i4;
                i += iMin;
                i2 -= iMin;
                if (i4 == bArr2.length) {
                    m3373();
                }
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f3404) {
            return;
        }
        m3372();
        try {
            m3373();
            byte[] bArrNativeFlushUltraDeflateCompressor = SevenZip.nativeFlushUltraDeflateCompressor(m3371());
            OutputStream outputStream = this.f3405;
            if (bArrNativeFlushUltraDeflateCompressor != null && bArrNativeFlushUltraDeflateCompressor.length != 0) {
                outputStream.write(bArrNativeFlushUltraDeflateCompressor);
            }
            outputStream.flush();
        } catch (IOException e) {
            IOException iOException = this.f3407;
            if (iOException == null) {
                this.f3407 = e;
            } else if (iOException != e) {
                iOException.addSuppressed(e);
            }
            long j = this.f3402;
            this.f3402 = 0L;
            if (j != 0) {
                SevenZip.nativeDestroyUltraDeflateCompressor(j);
            }
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f3404) {
            return;
        }
        this.f3404 = true;
        IOException iOException = this.f3407;
        OutputStream outputStream = this.f3405;
        if (iOException == null) {
            m3373();
            byte[] bArrNativeFinishUltraDeflateCompressor = SevenZip.nativeFinishUltraDeflateCompressor(m3371());
            if (bArrNativeFinishUltraDeflateCompressor != null && bArrNativeFinishUltraDeflateCompressor.length != 0) {
                outputStream.write(bArrNativeFinishUltraDeflateCompressor);
            }
        }
        th = null;
        try {
            long j = this.f3402;
            this.f3402 = 0L;
            if (j != 0) {
                SevenZip.nativeDestroyUltraDeflateCompressor(j);
            }
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            } else if (th != th) {
                th.addSuppressed(th);
            }
        }
        try {
            outputStream.close();
        } catch (Throwable th2) {
            if (th2 != this.f3407) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new IOException("Failed to close Ultra Deflate stream", th);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m3373() throws IOException {
        int i = this.f3406;
        if (i == 0) {
            return;
        }
        try {
            byte[] bArrNativeWriteUltraDeflateCompressor = SevenZip.nativeWriteUltraDeflateCompressor(m3371(), this.f3403, 0, i);
            if (bArrNativeWriteUltraDeflateCompressor != null && bArrNativeWriteUltraDeflateCompressor.length != 0) {
                this.f3405.write(bArrNativeWriteUltraDeflateCompressor);
            }
            this.f3406 = 0;
        } catch (IOException e) {
            IOException iOException = this.f3407;
            if (iOException == null) {
                this.f3407 = e;
            } else if (iOException != e) {
                iOException.addSuppressed(e);
            }
            long j = this.f3402;
            this.f3402 = 0L;
            if (j != 0) {
                SevenZip.nativeDestroyUltraDeflateCompressor(j);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private long m3371() throws IOException {
        if (this.f3402 == 0) {
            long jNativeCreateUltraDeflateCompressor = SevenZip.nativeCreateUltraDeflateCompressor();
            this.f3402 = jNativeCreateUltraDeflateCompressor;
            if (jNativeCreateUltraDeflateCompressor == 0) {
                throw new IOException("Failed to create Ultra Deflate compressor");
            }
        }
        return this.f3402;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3372() throws IOException {
        if (this.f3404) {
            throw new IOException("Stream closed");
        }
        IOException iOException = this.f3407;
        if (iOException != null) {
            throw iOException;
        }
    }
}
