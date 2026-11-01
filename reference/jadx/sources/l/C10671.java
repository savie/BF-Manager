package l;

import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10671 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4670 f36402;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f36403;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f36408;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f36407 = false;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f36401 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f36404 = new byte[1];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f36406 = new byte[1024];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23371 f36400 = new C23371();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f36405 = 1;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C10671(C4670 c4670, long j, byte[] bArr) {
        this.f36402 = c4670;
        this.f36408 = bArr;
        this.f36403 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.f36407) {
            byte[] bArr = this.f36404;
            if (read(bArr, 0, 1) != -1) {
                return bArr[0] & 255;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (this.f36407) {
            return -1;
        }
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        int length = i2;
        if (this.f36407) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || length < 0 || i + length > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (length == 0) {
            return 0;
        }
        int i3 = this.f36401;
        if (i3 > 0) {
            if (i3 <= length) {
                length = i3;
            }
            System.arraycopy(this.f36406, 0, bArr, i, length);
            int i4 = this.f36401;
            if (length != i4) {
                byte[] bArr3 = this.f36406;
                System.arraycopy(bArr3, length, bArr3, 0, i4 - length);
            }
            this.f36401 -= length;
            return length;
        }
        C4670 c4670 = this.f36402;
        if (c4670.f16532.f48679.length - 13 < length) {
            length = c4670.f16532.f48679.length - 13;
        }
        if (c4670.f16533 == 0 && length > 1024) {
            length = 1024;
        }
        c4670.f16521.getClass();
        int length2 = c4670.f16533 == 0 ? 1024 : c4670.f16532.f48679.length - 13;
        while (true) {
            int i5 = c4670.f16521.f10956;
            int i6 = this.f36405;
            bArr2 = this.f36408;
            if (i5 >= i6) {
                break;
            }
            try {
                C4670.m12904(c4670, bArr2, this.f36403, length2, c4670.f16521);
                this.f36403 += (long) length2;
            } catch (Exception unused) {
                throw new IOException(d.O);
            }
        }
        C14904 c14904 = c4670.f16532;
        C23371 c23371 = this.f36400;
        c4670.m12908(c14904, c23371);
        this.f36400 = c23371;
        this.f36401 = c23371.f75717;
        int i7 = c23371.f75718;
        try {
            C9260 c9260M8714 = c4670.f16521.m8714(this.f36400.f75719);
            if (i7 != 101 && i7 != 103) {
                throw new IOException(d.O);
            }
            if (i7 != 101) {
                c4670.f16532.f48680 = 0;
                c4670.m12894(0, 4, c4670.f16532.f48679);
                int iM35638 = c4670.f16532.m35638();
                int i8 = this.f36401 - 4;
                this.f36401 = i8;
                int i9 = i8 - iM35638;
                long j = iM35638;
                if (iM35638 <= 0) {
                    return 0;
                }
                if (iM35638 <= length) {
                    length = iM35638;
                }
                int i10 = c4670.f16522.read(bArr, i, length);
                if (i10 < 0) {
                    return -1;
                }
                int i11 = iM35638 - i10;
                this.f36401 = i11;
                if (i11 > 0) {
                    if (this.f36406.length < i11) {
                        this.f36406 = new byte[i11];
                    }
                    int i12 = 0;
                    while (i11 > 0) {
                        int i13 = c4670.f16522.read(this.f36406, i12, i11);
                        if (i13 <= 0) {
                            break;
                        }
                        i12 += i13;
                        i11 -= i13;
                    }
                }
                if (i9 > 0) {
                    c4670.f16522.skip(i9);
                }
                if (j < c9260M8714.f31483) {
                    c4670.f16521.m8715(c4670.f16532, this.f36400);
                    try {
                        C4670.m12904(c4670, bArr2, c9260M8714.f31482 + j, (int) (c9260M8714.f31483 - j), c4670.f16521);
                        this.f36403 = c9260M8714.f31482 + c9260M8714.f31483;
                    } catch (Exception unused2) {
                        throw new IOException(d.O);
                    }
                }
                if (this.f36405 < c4670.f16521.f10957.length) {
                    this.f36405++;
                }
                return i10;
            }
            c4670.m12907(c4670.f16532, this.f36401);
            int iM35639 = c4670.f16532.m35638();
            this.f36401 = 0;
            if (iM35639 == 1) {
                close();
                return -1;
            }
            throw new IOException(d.O);
        } catch (C1497 e) {
            this.f36403 = e.f6051;
            skip(this.f36400.f75717);
            c4670.f16521.m8715(c4670.f16532, this.f36400);
            return 0;
        } catch (C12019 e2) {
            throw new IOException("error: " + e2.toString(), e2);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f36407) {
            return;
        }
        this.f36407 = true;
        C4670 c4670 = this.f36402;
        c4670.f16521.m8715(c4670.f16532, this.f36400);
        try {
            C4670.m12905(c4670, this.f36408, this.f36400);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString(), e2);
        }
    }
}
