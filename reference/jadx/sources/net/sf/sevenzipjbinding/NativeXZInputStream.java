package net.sf.sevenzipjbinding;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import l.C17359;
import l.C9214;
import l.InterfaceC8469;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeXZInputStream extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f81986;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f81988;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f81990;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public IOException f81991;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f81992;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f81993;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f81994;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f81995;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InputStream f81996;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f81997;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] f81987 = new byte[65536];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] f81989 = new byte[1];

    public static native long nativeCreate();

    public static native long nativeDecode(long j, byte[] bArr, int i, int i2, boolean z, byte[] bArr2, int i3, int i4);

    public static native void nativeDestroy(long j);

    public static native int nativeGetApiVersion();

    public static native void nativeValidateHeader(byte[] bArr);

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public NativeXZInputStream(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[65536];
        this.f81997 = bArr;
        C17359.requireNonNull(inputStream, "inputStream");
        this.f81996 = inputStream;
        long jNativeCreate = nativeCreate();
        this.f81993 = jNativeCreate;
        if (jNativeCreate == 0) {
            throw new IOException("Failed to create native XZ decoder");
        }
        try {
            new DataInputStream(inputStream).readFully(bArr, 0, 12);
            nativeValidateHeader(bArr);
            this.f81986 = 12;
        } catch (Throwable th) {
            m56774();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m56776() {
        try {
            return nativeGetApiVersion() == 1;
        } catch (LinkageError unused) {
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f81989;
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int iMin;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f81996 != null) {
            IOException iOException = this.f81991;
            if (iOException != null) {
                throw iOException;
            }
            if (this.f81994) {
                return -1;
            }
            int i4 = 0;
            while (i2 > 0) {
                try {
                    int i5 = this.f81988;
                    int i6 = this.f81992;
                    byte[] bArr2 = this.f81987;
                    if (i5 != i6) {
                        iMin = Math.min(i2, this.f81992 - this.f81988);
                        System.arraycopy(bArr2, this.f81988, bArr, i, iMin);
                        this.f81988 += iMin;
                    } else if (i2 >= 65536) {
                        iMin = m56775(i, 65536, bArr);
                        if (iMin < 0) {
                            break;
                        }
                    } else {
                        this.f81988 = 0;
                        int iM56775 = m56775(0, bArr2.length, bArr2);
                        this.f81992 = iM56775;
                        if (iM56775 < 0) {
                            this.f81992 = 0;
                            break;
                        }
                        iMin = Math.min(i2, this.f81992 - this.f81988);
                        System.arraycopy(bArr2, this.f81988, bArr, i, iMin);
                        this.f81988 += iMin;
                    }
                    i += iMin;
                    i2 -= iMin;
                    i4 += iMin;
                } catch (IOException e) {
                    this.f81991 = e;
                    m56774();
                    if (i4 == 0) {
                        throw e;
                    }
                }
            }
            if (i4 == 0 && this.f81994) {
                return -1;
            }
            return i4;
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f81996;
        if (inputStream == null) {
            return;
        }
        this.f81996 = null;
        try {
            m56774();
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m56775(int i, int i2, byte[] bArr) throws IOException {
        while (!this.f81994) {
            if (this.f81990 == this.f81986 && !this.f81995) {
                this.f81990 = 0;
                InputStream inputStream = this.f81996;
                byte[] bArr2 = this.f81997;
                int i3 = inputStream.read(bArr2);
                this.f81986 = i3;
                if (i3 < 0) {
                    this.f81986 = 0;
                    this.f81995 = true;
                } else if (i3 == 0) {
                    int i4 = this.f81996.read();
                    if (i4 < 0) {
                        this.f81995 = true;
                    } else {
                        bArr2[0] = (byte) i4;
                        this.f81986 = 1;
                    }
                }
            }
            int i5 = this.f81990;
            int i6 = this.f81986 - i5;
            long jNativeDecode = nativeDecode(this.f81993, this.f81997, i5, i6, this.f81995, bArr, i, i2);
            if (((-1125899906842624L) & jNativeDecode) != 0) {
                throw new IOException("Invalid native XZ decoder result flags");
            }
            int i7 = (int) (jNativeDecode & 16777215);
            int i8 = (int) (16777215 & (jNativeDecode >>> 24));
            if (i7 > i6 || i8 > i2) {
                throw new IOException("Invalid native XZ decoder result size");
            }
            int i9 = this.f81990 + i7;
            this.f81990 = i9;
            boolean z = (281474976710656L & jNativeDecode) != 0;
            boolean z2 = (jNativeDecode & 562949953421312L) != 0;
            if (z && i9 != this.f81986) {
                throw new IOException("Native XZ decoder requested input before consuming the current buffer");
            }
            if (i8 > 0) {
                return i8;
            }
            if (this.f81995 && i9 == this.f81986 && z) {
                if (!z2) {
                    throw new EOFException("Unexpected end of XZ input");
                }
                this.f81994 = true;
                m56774();
                return -1;
            }
            if (i9 == i5 && (!z || i9 != this.f81986)) {
                throw new IOException("Native XZ decoder made no progress");
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f81996 != null) {
            IOException iOException = this.f81991;
            if (iOException != null) {
                throw iOException;
            }
            return this.f81992 - this.f81988;
        }
        throw new IOException("Stream closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56774() {
        long j = this.f81993;
        if (j != 0) {
            nativeDestroy(j);
            this.f81993 = 0L;
        }
    }
}
