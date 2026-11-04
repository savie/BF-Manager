package net.sf.sevenzipjbinding;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import l.C17359;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeXZOutputStream extends OutputStream {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f81998 = {-3, 55, 122, 88, 90, 0};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f81999 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f82000;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f82002;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final OutputStream f82003;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f82005;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f82006;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f82007;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f82004 = new byte[1048576];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] f82001 = new byte[1];

    public static native long nativeCreate(int i, int i2);

    public static native void nativeDestroy(long j);

    public static native byte[] nativeEncodeChunk(long j, byte[] bArr, int i, int i2);

    public static native byte[] nativeFinish(long j);

    public static native int nativeGetApiVersion();

    public NativeXZOutputStream(OutputStream outputStream, int i) throws IOException {
        C17359.requireNonNull(outputStream, "outputStream");
        this.f82003 = outputStream;
        if (i < 0 || i > 9) {
            throw new IOException("Unsupported native XZ compression options");
        }
        if (!m56778()) {
            throw new IOException("Native XZ encoder is unavailable");
        }
        long jNativeCreate = nativeCreate(i, 4);
        if (jNativeCreate == 0) {
            throw new IOException("Failed to create native XZ encoder");
        }
        try {
            outputStream.write(m56779());
            this.f82006 = jNativeCreate;
        } catch (IOException | Error | RuntimeException e) {
            nativeDestroy(jNativeCreate);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m56778() {
        try {
            return nativeGetApiVersion() == 2;
        } catch (LinkageError unused) {
            return false;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f82001;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m56777();
        while (i2 > 0) {
            int i3 = this.f82007;
            OutputStream outputStream = this.f82003;
            if (i3 != 0 || i2 < 1048576) {
                int iMin = Math.min(i2, 1048576 - i3);
                int i4 = this.f82007;
                byte[] bArr2 = this.f82004;
                System.arraycopy(bArr, i, bArr2, i4, iMin);
                int i5 = this.f82007 + iMin;
                this.f82007 = i5;
                i += iMin;
                i2 -= iMin;
                if (i5 == 1048576 && i5 != 0) {
                    try {
                        byte[] bArrNativeEncodeChunk = nativeEncodeChunk(this.f82006, bArr2, 0, i5);
                        if (bArrNativeEncodeChunk == null || bArrNativeEncodeChunk.length == 0) {
                            throw new IOException("Invalid native XZ chunk result");
                        }
                        outputStream.write(bArrNativeEncodeChunk);
                        this.f82007 = 0;
                    } catch (IOException e) {
                        IOException iOException = this.f82000;
                        if (iOException == null) {
                            this.f82000 = e;
                        } else if (iOException != e) {
                            iOException.addSuppressed(e);
                        }
                        long j = this.f82006;
                        this.f82006 = 0L;
                        if (j != 0) {
                            nativeDestroy(j);
                        }
                        throw this.f82000;
                    }
                }
            } else {
                try {
                    byte[] bArrNativeEncodeChunk2 = nativeEncodeChunk(this.f82006, bArr, i, 1048576);
                    if (bArrNativeEncodeChunk2 == null || bArrNativeEncodeChunk2.length == 0) {
                        throw new IOException("Invalid native XZ chunk result");
                    }
                    outputStream.write(bArrNativeEncodeChunk2);
                    i += 1048576;
                    i2 -= 1048576;
                } catch (IOException e2) {
                    IOException iOException2 = this.f82000;
                    if (iOException2 == null) {
                        this.f82000 = e2;
                    } else if (iOException2 != e2) {
                        iOException2.addSuppressed(e2);
                    }
                    long j2 = this.f82006;
                    this.f82006 = 0L;
                    if (j2 != 0) {
                        nativeDestroy(j2);
                    }
                    throw this.f82000;
                }
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m56777();
        try {
            int i = this.f82007;
            OutputStream outputStream = this.f82003;
            if (i != 0) {
                try {
                    byte[] bArrNativeEncodeChunk = nativeEncodeChunk(this.f82006, this.f82004, 0, i);
                    if (bArrNativeEncodeChunk == null || bArrNativeEncodeChunk.length == 0) {
                        throw new IOException("Invalid native XZ chunk result");
                    }
                    outputStream.write(bArrNativeEncodeChunk);
                    this.f82007 = 0;
                } catch (IOException e) {
                    IOException iOException = this.f82000;
                    if (iOException == null) {
                        this.f82000 = e;
                    } else if (iOException != e) {
                        iOException.addSuppressed(e);
                    }
                    long j = this.f82006;
                    this.f82006 = 0L;
                    if (j != 0) {
                        nativeDestroy(j);
                    }
                    throw this.f82000;
                }
            }
            outputStream.flush();
        } catch (IOException e2) {
            IOException iOException2 = this.f82000;
            if (iOException2 == null) {
                this.f82000 = e2;
            } else if (iOException2 != e2) {
                iOException2.addSuppressed(e2);
            }
            long j2 = this.f82006;
            this.f82006 = 0L;
            if (j2 != 0) {
                nativeDestroy(j2);
            }
            throw this.f82000;
        }
    }

    public final void finish() throws IOException {
        IOException iOException = this.f82000;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f82002) {
            return;
        }
        if (this.f82005) {
            throw new IOException("Stream closed");
        }
        try {
            int i = this.f82007;
            OutputStream outputStream = this.f82003;
            if (i != 0) {
                try {
                    byte[] bArrNativeEncodeChunk = nativeEncodeChunk(this.f82006, this.f82004, 0, i);
                    if (bArrNativeEncodeChunk == null || bArrNativeEncodeChunk.length == 0) {
                        throw new IOException("Invalid native XZ chunk result");
                    }
                    outputStream.write(bArrNativeEncodeChunk);
                    this.f82007 = 0;
                } catch (IOException e) {
                    IOException iOException2 = this.f82000;
                    if (iOException2 == null) {
                        this.f82000 = e;
                    } else if (iOException2 != e) {
                        iOException2.addSuppressed(e);
                    }
                    long j = this.f82006;
                    this.f82006 = 0L;
                    if (j != 0) {
                        nativeDestroy(j);
                    }
                    throw this.f82000;
                }
            }
            byte[] bArrNativeFinish = nativeFinish(this.f82006);
            if (bArrNativeFinish == null || bArrNativeFinish.length == 0) {
                throw new IOException("Invalid native XZ footer result");
            }
            outputStream.write(bArrNativeFinish);
            this.f82002 = true;
            long j2 = this.f82006;
            this.f82006 = 0L;
            if (j2 != 0) {
                nativeDestroy(j2);
            }
        } catch (IOException e2) {
            IOException iOException3 = this.f82000;
            if (iOException3 == null) {
                this.f82000 = e2;
            } else if (iOException3 != e2) {
                iOException3.addSuppressed(e2);
            }
            long j3 = this.f82006;
            this.f82006 = 0L;
            if (j3 != 0) {
                nativeDestroy(j3);
            }
            throw this.f82000;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f82005) {
            return;
        }
        if (this.f82000 == null) {
            try {
                finish();
            } catch (IOException e) {
                e = e;
            }
        }
        e = null;
        this.f82005 = true;
        long j = this.f82006;
        this.f82006 = 0L;
        if (j != 0) {
            nativeDestroy(j);
        }
        try {
            this.f82003.close();
        } catch (IOException e2) {
            if (e2 != this.f82000) {
                if (e == null) {
                    e = e2;
                } else {
                    e.addSuppressed(e2);
                }
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56777() throws IOException {
        IOException iOException = this.f82000;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f82005) {
            throw new IOException("Stream closed");
        }
        if (this.f82002) {
            throw new IOException("Stream finished");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m56779() {
        byte[] bArr = new byte[12];
        System.arraycopy(f81998, 0, bArr, 0, 6);
        bArr[6] = 0;
        bArr[7] = (byte) 4;
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 6, 2);
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            bArr[i + 8] = (byte) (value >>> (i * 8));
        }
        return bArr;
    }
}
