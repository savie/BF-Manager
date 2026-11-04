package l;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ۨܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAQ4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12492 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f40108 = AtomicReferenceFieldUpdater.newUpdater(C12492.class, byte[].class, "buf");

    @InterfaceC19352
    public volatile byte[] buf;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f40109;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f40110;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f40111;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40112;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private byte[] m31033() throws IOException {
        byte[] bArr = this.buf;
        if (bArr != null) {
            return bArr;
        }
        throw new IOException("Stream closed");
    }

    public C12492(GZIPInputStream gZIPInputStream) {
        super(gZIPInputStream);
        this.f40111 = -1;
        this.buf = new byte[8192];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31032() throws IOException {
        byte[] bArrM31033 = m31033();
        int i = this.f40111;
        if (i < 0) {
            this.f40109 = 0;
        } else {
            int i2 = this.f40109;
            if (i2 >= bArrM31033.length) {
                if (i > 0) {
                    int i3 = i2 - i;
                    System.arraycopy(bArrM31033, i, bArrM31033, 0, i3);
                    this.f40109 = i3;
                    this.f40111 = 0;
                } else {
                    int length = bArrM31033.length;
                    int i4 = this.f40112;
                    if (length >= i4) {
                        this.f40111 = -1;
                        this.f40109 = 0;
                    } else {
                        if (bArrM31033.length >= 2147483639) {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                        int i5 = i2 <= 2147483639 - i2 ? i2 * 2 : 2147483639;
                        if (i5 <= i4) {
                            i4 = i5;
                        }
                        byte[] bArr = new byte[i4];
                        System.arraycopy(bArrM31033, 0, bArr, 0, i2);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40108;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, bArrM31033, bArr)) {
                            if (atomicReferenceFieldUpdater.get(this) != bArrM31033) {
                                throw new IOException("Stream closed");
                            }
                        }
                        bArrM31033 = bArr;
                    }
                }
            }
        }
        this.f40110 = this.f40109;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw new IOException("Stream closed");
        }
        int i6 = this.f40109;
        int i7 = inputStream.read(bArrM31033, i6, bArrM31033.length - i6);
        if (i7 > 0) {
            this.f40110 = i7 + this.f40109;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f40109 >= this.f40110) {
            m31032();
            if (this.f40109 >= this.f40110) {
                return -1;
            }
        }
        byte[] bArrM31033 = m31033();
        int i = this.f40109;
        this.f40109 = i + 1;
        return bArrM31033[i] & 255;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[DONT_INVERT, PHI: r3
      0x0044: PHI (r3v2 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x001a, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        InputStream inputStream;
        m31033();
        int i4 = i + i2;
        if ((i | i2 | i4 | (bArr.length - i4)) < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i5 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (true) {
            int i6 = i + i5;
            int i7 = i2 - i5;
            int i8 = this.f40110 - this.f40109;
            if (i8 <= 0) {
                if (i7 >= m31033().length && this.f40111 < 0) {
                    InputStream inputStream2 = ((FilterInputStream) this).in;
                    if (inputStream2 == null) {
                        throw new IOException("Stream closed");
                    }
                    i3 = inputStream2.read(bArr, i6, i7);
                } else {
                    m31032();
                    i8 = this.f40110 - this.f40109;
                    if (i8 <= 0) {
                        i3 = -1;
                    } else {
                        if (i8 < i7) {
                            i7 = i8;
                        }
                        System.arraycopy(m31033(), this.f40109, bArr, i6, i7);
                        this.f40109 += i7;
                        i3 = i7;
                    }
                }
            } else {
                if (i8 < i7) {
                    i7 = i8;
                }
                System.arraycopy(m31033(), this.f40109, bArr, i6, i7);
                this.f40109 += i7;
                i3 = i7;
            }
            if (i3 <= 0) {
                return i5 == 0 ? i3 : i5;
            }
            i5 += i3;
            if (i5 >= i2 || ((inputStream = ((FilterInputStream) this).in) != null && inputStream.available() <= 0)) {
                return i5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r2 <= 0) goto L17;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long skip(long r6) throws java.io.IOException {
        /*
            r5 = this;
            r5.m31033()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto La
            goto L36
        La:
            int r2 = r5.f40110
            int r3 = r5.f40109
            int r2 = r2 - r3
            long r2 = (long) r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L37
            int r2 = r5.f40111
            if (r2 >= 0) goto L29
            java.io.InputStream r0 = r5.in
            if (r0 == 0) goto L21
            long r6 = r0.skip(r6)
            return r6
        L21:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Stream closed"
            r6.<init>(r7)
            throw r6
        L29:
            r5.m31032()
            int r2 = r5.f40110
            int r3 = r5.f40109
            int r2 = r2 - r3
            long r2 = (long) r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L37
        L36:
            return r0
        L37:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L3c
            r6 = r2
        L3c:
            int r0 = r5.f40109
            long r0 = (long) r0
            long r0 = r0 + r6
            int r1 = (int) r0
            r5.f40109 = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12492.skip(long):long");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.f40110 - this.f40109;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw new IOException("Stream closed");
        }
        int iAvailable = inputStream.available();
        if (i > Integer.MAX_VALUE - iAvailable) {
            return Integer.MAX_VALUE;
        }
        return i + iAvailable;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        this.f40112 = i;
        this.f40111 = this.f40109;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        m31033();
        int i = this.f40111;
        if (i < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        this.f40109 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            byte[] bArr = this.buf;
            if (bArr == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40108;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, bArr, null)) {
                    InputStream inputStream = ((FilterInputStream) this).in;
                    ((FilterInputStream) this).in = null;
                    if (inputStream != null) {
                        inputStream.close();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == bArr);
        }
    }

    public final int readInt() throws IOException {
        byte[] bArrM31033 = m31033();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.f40109 >= this.f40110) {
                m31032();
                if (this.f40109 >= this.f40110) {
                    throw new EOFException();
                }
            }
            int i3 = this.f40109;
            this.f40109 = i3 + 1;
            i |= (bArrM31033[i3] & 255) << (i2 * 8);
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m31034(byte[] bArr) throws IOException {
        int i = readInt();
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return new String(bArr, 0, i, StandardCharsets.UTF_8);
    }
}
