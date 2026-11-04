package l;

import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes.dex */
public final class C25090 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20614 f81126;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f81127;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f81128;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f81133 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f81129 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f81130 = new byte[1];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f81132 = new byte[1024];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16884 f81131 = new C16884();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f81125 = 1;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C25090(C20614 c20614, long j, byte[] bArr) {
        this.f81126 = c20614;
        this.f81128 = bArr;
        this.f81127 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.f81133) {
            byte[] bArr = this.f81130;
            if (read(bArr, 0, 1) != -1) {
                return bArr[0] & 255;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (this.f81133) {
            return -1;
        }
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        int length = i2;
        if (this.f81133) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || length < 0 || i + length > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (length == 0) {
            return 0;
        }
        int i3 = this.f81129;
        if (i3 > 0) {
            if (i3 <= length) {
                length = i3;
            }
            System.arraycopy(this.f81132, 0, bArr, i, length);
            int i4 = this.f81129;
            if (length != i4) {
                byte[] bArr3 = this.f81132;
                System.arraycopy(bArr3, length, bArr3, 0, i4 - length);
            }
            this.f81129 -= length;
            return length;
        }
        C20614 c20614 = this.f81126;
        if (c20614.f66131.f31750.length - 13 < length) {
            length = c20614.f66131.f31750.length - 13;
        }
        if (c20614.f66130 == 0 && length > 1024) {
            length = 1024;
        }
        c20614.f66134.getClass();
        int length2 = c20614.f66130 == 0 ? 1024 : c20614.f66131.f31750.length - 13;
        while (true) {
            int i5 = c20614.f66134.f11952;
            int i6 = this.f81125;
            bArr2 = this.f81128;
            if (i5 >= i6) {
                break;
            }
            try {
                C20614.m47204(c20614, bArr2, this.f81127, length2, c20614.f66134);
                this.f81127 += (long) length2;
            } catch (Exception unused) {
                throw new IOException(d.O);
            }
        }
        C9866 c9866 = c20614.f66131;
        C16884 c16884 = this.f81131;
        c20614.m47199(c9866, c16884);
        this.f81131 = c16884;
        this.f81129 = c16884.f55231;
        int i7 = c16884.f55232;
        try {
            C23598 c23598M11391 = c20614.f66134.m11391(this.f81131.f55233);
            if (i7 != 101 && i7 != 103) {
                throw new IOException(d.O);
            }
            if (i7 != 101) {
                c20614.f66131.f31751 = 0;
                c20614.m47192(0, 4, c20614.f66131.f31750);
                int iM25658 = c20614.f66131.m25658();
                int i8 = this.f81129 - 4;
                this.f81129 = i8;
                int i9 = i8 - iM25658;
                long j = iM25658;
                if (iM25658 <= 0) {
                    return 0;
                }
                if (iM25658 <= length) {
                    length = iM25658;
                }
                int i10 = c20614.f66129.read(bArr, i, length);
                if (i10 < 0) {
                    return -1;
                }
                int i11 = iM25658 - i10;
                this.f81129 = i11;
                if (i11 > 0) {
                    if (this.f81132.length < i11) {
                        this.f81132 = new byte[i11];
                    }
                    int i12 = 0;
                    while (i11 > 0) {
                        int i13 = c20614.f66129.read(this.f81132, i12, i11);
                        if (i13 <= 0) {
                            break;
                        }
                        i12 += i13;
                        i11 -= i13;
                    }
                }
                if (i9 > 0) {
                    c20614.f66129.skip(i9);
                }
                if (j < c23598M11391.f76611) {
                    c20614.f66134.m11392(c20614.f66131, this.f81131);
                    try {
                        C20614.m47204(c20614, bArr2, c23598M11391.f76610 + j, (int) (c23598M11391.f76611 - j), c20614.f66134);
                        this.f81127 = c23598M11391.f76610 + c23598M11391.f76611;
                    } catch (Exception unused2) {
                        throw new IOException(d.O);
                    }
                }
                if (this.f81125 < c20614.f66134.f11953.length) {
                    this.f81125++;
                }
                return i10;
            }
            c20614.m47198(c20614.f66131, this.f81129);
            int iM25659 = c20614.f66131.m25658();
            this.f81129 = 0;
            if (iM25659 == 1) {
                close();
                return -1;
            }
            throw new IOException(d.O);
        } catch (C16138 e) {
            this.f81127 = e.f52424;
            skip(this.f81131.f55231);
            c20614.f66134.m11392(c20614.f66131, this.f81131);
            return 0;
        } catch (C20199 e2) {
            throw new IOException("error: " + e2.toString(), e2);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f81133) {
            return;
        }
        this.f81133 = true;
        C20614 c20614 = this.f81126;
        c20614.f66134.m11392(c20614.f66131, this.f81131);
        try {
            C20614.m47205(c20614, this.f81128, this.f81131);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString(), e2);
        }
    }
}
