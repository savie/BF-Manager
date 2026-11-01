package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CG0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2548 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C7219 f10081;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f10082;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1843 f10083;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C17720 f10084;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InputStream f10085;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3690 f10086;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f10087 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] f10088 = new byte[1];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f10080 = null;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7937(int i) {
        if (i < 0 || i > 2147483632) {
            throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
        }
        if (i < 4096) {
            i = 4096;
        }
        return (i + 15) & (-16);
    }

    public C2548(InputStream inputStream, long j, byte b, int i) throws C6782, C19838 {
        C17720 c17720M41263 = C17720.m41263();
        if (j < -1) {
            throw new C6782("Uncompressed size is too big");
        }
        int i2 = b & 255;
        if (i2 > 224) {
            throw new C19838("Invalid LZMA properties byte");
        }
        int i3 = i2 / 45;
        int i4 = i2 - (i3 * 45);
        int i5 = i4 / 9;
        int i6 = i4 - (i5 * 9);
        if (i < 0 || i > 2147483632) {
            throw new C6782("LZMA dictionary is too big for this implementation");
        }
        if (j < -1 || i6 < 0 || i6 > 8 || i5 < 0 || i5 > 4 || i3 < 0 || i3 > 4) {
            throw new IllegalArgumentException();
        }
        this.f10085 = inputStream;
        this.f10084 = c17720M41263;
        int iM7937 = m7937(i);
        if (j >= 0 && iM7937 > j) {
            iM7937 = m7937((int) j);
        }
        this.f10083 = new C1843(m7937(iM7937), c17720M41263);
        C7219 c7219 = new C7219(inputStream);
        this.f10081 = c7219;
        this.f10086 = new C3690(this.f10083, c7219, i6, i5, i3);
        this.f10082 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f10088;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f10085 == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f10080;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f10087) {
            return -1;
        }
        while (i2 > 0) {
            try {
                long j = this.f10082;
                this.f10083.m6006((j < 0 || j >= ((long) i2)) ? i2 : (int) j);
                try {
                    this.f10086.m10860();
                } catch (C19838 e) {
                    if (this.f10082 != -1 || !this.f10086.m10859()) {
                        throw e;
                    }
                    this.f10087 = true;
                    this.f10081.mo19186();
                }
                int iM5999 = this.f10083.m5999(i, bArr);
                i += iM5999;
                i2 -= iM5999;
                i4 += iM5999;
                long j2 = this.f10082;
                if (j2 >= 0) {
                    long j3 = j2 - ((long) iM5999);
                    this.f10082 = j3;
                    if (j3 == 0) {
                        this.f10087 = true;
                    }
                }
                if (this.f10087) {
                    if (this.f10083.m6007()) {
                        throw new C19838();
                    }
                    if (!this.f10081.m19187()) {
                        throw new C19838();
                    }
                    C1843 c1843 = this.f10083;
                    if (c1843 != null) {
                        c1843.m6003(this.f10084);
                        this.f10083 = null;
                    }
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4;
                }
            } catch (IOException e2) {
                this.f10080 = e2;
                throw e2;
            }
        }
        return i4;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10085 != null) {
            C1843 c1843 = this.f10083;
            if (c1843 != null) {
                c1843.m6003(this.f10084);
                this.f10083 = null;
            }
            try {
                this.f10085.close();
            } finally {
                this.f10085 = null;
            }
        }
    }
}
