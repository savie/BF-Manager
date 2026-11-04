package l;

import java.io.IOException;
import java.io.OutputStream;
import net.sf.sevenzipjbinding.SevenZip;

/* JADX INFO: renamed from: l.ܿ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes4.dex */
public final class C18615 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final OutputStream f60527;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f60528 = new byte[32768];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f60529;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f60530;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f60531;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f60532;

    public C18615(OutputStream outputStream) {
        this.f60527 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m43306();
        int i2 = this.f60531;
        int i3 = i2 + 1;
        this.f60531 = i3;
        byte[] bArr = this.f60528;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m43308();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m43306();
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        while (i2 > 0) {
            int i3 = this.f60531;
            byte[] bArr2 = this.f60528;
            if (i3 == 0 && i2 >= bArr2.length) {
                try {
                    byte[] bArrNativeWriteUltraDeflateCompressor = SevenZip.nativeWriteUltraDeflateCompressor(m43307(), bArr, i, bArr2.length);
                    if (bArrNativeWriteUltraDeflateCompressor != null && bArrNativeWriteUltraDeflateCompressor.length != 0) {
                        this.f60527.write(bArrNativeWriteUltraDeflateCompressor);
                    }
                    i += bArr2.length;
                    i2 -= bArr2.length;
                } catch (IOException e) {
                    IOException iOException = this.f60532;
                    if (iOException == null) {
                        this.f60532 = e;
                    } else if (iOException != e) {
                        iOException.addSuppressed(e);
                    }
                    long j = this.f60530;
                    this.f60530 = 0L;
                    if (j != 0) {
                        SevenZip.nativeDestroyUltraDeflateCompressor(j);
                    }
                    throw e;
                }
            } else {
                int iMin = Math.min(i2, bArr2.length - i3);
                System.arraycopy(bArr, i, bArr2, this.f60531, iMin);
                int i4 = this.f60531 + iMin;
                this.f60531 = i4;
                i += iMin;
                i2 -= iMin;
                if (i4 == bArr2.length) {
                    m43308();
                }
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f60529) {
            return;
        }
        m43306();
        try {
            m43308();
            byte[] bArrNativeFlushUltraDeflateCompressor = SevenZip.nativeFlushUltraDeflateCompressor(m43307());
            OutputStream outputStream = this.f60527;
            if (bArrNativeFlushUltraDeflateCompressor != null && bArrNativeFlushUltraDeflateCompressor.length != 0) {
                outputStream.write(bArrNativeFlushUltraDeflateCompressor);
            }
            outputStream.flush();
        } catch (IOException e) {
            IOException iOException = this.f60532;
            if (iOException == null) {
                this.f60532 = e;
            } else if (iOException != e) {
                iOException.addSuppressed(e);
            }
            long j = this.f60530;
            this.f60530 = 0L;
            if (j != 0) {
                SevenZip.nativeDestroyUltraDeflateCompressor(j);
            }
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f60529) {
            return;
        }
        this.f60529 = true;
        IOException iOException = this.f60532;
        OutputStream outputStream = this.f60527;
        if (iOException == null) {
            m43308();
            byte[] bArrNativeFinishUltraDeflateCompressor = SevenZip.nativeFinishUltraDeflateCompressor(m43307());
            if (bArrNativeFinishUltraDeflateCompressor != null && bArrNativeFinishUltraDeflateCompressor.length != 0) {
                outputStream.write(bArrNativeFinishUltraDeflateCompressor);
            }
        }
        th = null;
        try {
            long j = this.f60530;
            this.f60530 = 0L;
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
            if (th2 != this.f60532) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m43308() throws IOException {
        int i = this.f60531;
        if (i == 0) {
            return;
        }
        try {
            byte[] bArrNativeWriteUltraDeflateCompressor = SevenZip.nativeWriteUltraDeflateCompressor(m43307(), this.f60528, 0, i);
            if (bArrNativeWriteUltraDeflateCompressor != null && bArrNativeWriteUltraDeflateCompressor.length != 0) {
                this.f60527.write(bArrNativeWriteUltraDeflateCompressor);
            }
            this.f60531 = 0;
        } catch (IOException e) {
            IOException iOException = this.f60532;
            if (iOException == null) {
                this.f60532 = e;
            } else if (iOException != e) {
                iOException.addSuppressed(e);
            }
            long j = this.f60530;
            this.f60530 = 0L;
            if (j != 0) {
                SevenZip.nativeDestroyUltraDeflateCompressor(j);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private long m43307() throws IOException {
        if (this.f60530 == 0) {
            long jNativeCreateUltraDeflateCompressor = SevenZip.nativeCreateUltraDeflateCompressor();
            this.f60530 = jNativeCreateUltraDeflateCompressor;
            if (jNativeCreateUltraDeflateCompressor == 0) {
                throw new IOException("Failed to create Ultra Deflate compressor");
            }
        }
        return this.f60530;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43306() throws IOException {
        if (this.f60529) {
            throw new IOException("Stream closed");
        }
        IOException iOException = this.f60532;
        if (iOException != null) {
            throw iOException;
        }
    }
}
