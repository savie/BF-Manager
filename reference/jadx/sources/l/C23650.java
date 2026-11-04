package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩹ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CG0 */
/* JADX INFO: loaded from: classes.dex */
public class C23650 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InputStream f76714;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f76715;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C11935 f76716;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8952 f76718;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0573 f76719;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C4478 f76721;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f76722 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final byte[] f76717 = new byte[1];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IOException f76720 = null;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52885(int i) {
        if (i < 0 || i > 2147483632) {
            throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
        }
        if (i < 4096) {
            i = 4096;
        }
        return (i + 15) & (-16);
    }

    public C23650(InputStream inputStream, long j, byte b, int i) throws C13996, C4258 {
        C0573 c0573M2591 = C0573.m2591();
        if (j < -1) {
            throw new C4258("Uncompressed size is too big");
        }
        int i2 = b & 255;
        if (i2 > 224) {
            throw new C13996("Invalid LZMA properties byte");
        }
        int i3 = i2 / 45;
        int i4 = i2 - (i3 * 45);
        int i5 = i4 / 9;
        int i6 = i4 - (i5 * 9);
        if (i < 0 || i > 2147483632) {
            throw new C4258("LZMA dictionary is too big for this implementation");
        }
        if (j < -1 || i6 < 0 || i6 > 8 || i5 < 0 || i5 > 4 || i3 < 0 || i3 > 4) {
            throw new IllegalArgumentException();
        }
        this.f76714 = inputStream;
        this.f76719 = c0573M2591;
        int iM52885 = m52885(i);
        if (j >= 0 && iM52885 > j) {
            iM52885 = m52885((int) j);
        }
        this.f76716 = new C11935(m52885(iM52885), c0573M2591);
        C8952 c8952 = new C8952(inputStream);
        this.f76718 = c8952;
        this.f76721 = new C4478(this.f76716, c8952, i6, i5, i3);
        this.f76715 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f76717;
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
        if (this.f76714 == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f76720;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f76722) {
            return -1;
        }
        while (i2 > 0) {
            try {
                long j = this.f76715;
                this.f76716.m29903((j < 0 || j >= ((long) i2)) ? i2 : (int) j);
                try {
                    this.f76721.m14183();
                } catch (C13996 e) {
                    if (this.f76715 != -1 || !this.f76721.m14182()) {
                        throw e;
                    }
                    this.f76722 = true;
                    this.f76718.mo9706();
                }
                int iM29896 = this.f76716.m29896(i, bArr);
                i += iM29896;
                i2 -= iM29896;
                i4 += iM29896;
                long j2 = this.f76715;
                if (j2 >= 0) {
                    long j3 = j2 - ((long) iM29896);
                    this.f76715 = j3;
                    if (j3 == 0) {
                        this.f76722 = true;
                    }
                }
                if (this.f76722) {
                    if (this.f76716.m29904()) {
                        throw new C13996();
                    }
                    if (!this.f76718.m23940()) {
                        throw new C13996();
                    }
                    C11935 c11935 = this.f76716;
                    if (c11935 != null) {
                        c11935.m29900(this.f76719);
                        this.f76716 = null;
                    }
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4;
                }
            } catch (IOException e2) {
                this.f76720 = e2;
                throw e2;
            }
        }
        return i4;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f76714 != null) {
            C11935 c11935 = this.f76716;
            if (c11935 != null) {
                c11935.m29900(this.f76719);
                this.f76716 = null;
            }
            try {
                this.f76714.close();
            } finally {
                this.f76714 = null;
            }
        }
    }
}
