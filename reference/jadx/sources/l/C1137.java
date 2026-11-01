package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1S8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1137 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5105 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10748 f5107;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InputStream f5109;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] f5106 = new byte[4096];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f5112 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f5111 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f5114 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f5110 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f5113 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f5108 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C1137(InputStream inputStream, InterfaceC10748 interfaceC10748) {
        inputStream.getClass();
        this.f5109 = inputStream;
        this.f5107 = interfaceC10748;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f5108;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        byte[] bArr2 = this.f5106;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f5109 == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f5113;
        if (iOException != null) {
            throw iOException;
        }
        int i4 = 0;
        while (true) {
            try {
                int iMin = Math.min(this.f5111, i2);
                System.arraycopy(bArr2, this.f5112, bArr, i, iMin);
                int i5 = this.f5112 + iMin;
                this.f5112 = i5;
                int i6 = this.f5111 - iMin;
                this.f5111 = i6;
                i += iMin;
                i2 -= iMin;
                i4 += iMin;
                int i7 = this.f5114;
                if (i5 + i6 + i7 == 4096) {
                    System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                    this.f5112 = 0;
                }
                if (i2 == 0 || this.f5110) {
                    break;
                    break;
                }
                int i8 = this.f5112 + this.f5111 + this.f5114;
                int i9 = this.f5109.read(bArr2, i8, 4096 - i8);
                if (i9 == -1) {
                    this.f5110 = true;
                    this.f5111 = this.f5114;
                    this.f5114 = 0;
                } else {
                    int i10 = this.f5114 + i9;
                    this.f5114 = i10;
                    int iMo1309 = this.f5107.mo1309(this.f5112, i10, bArr2);
                    this.f5111 = iMo1309;
                    this.f5114 -= iMo1309;
                }
            } catch (IOException e) {
                this.f5113 = e;
                throw e;
            }
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f5109 == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f5113;
        if (iOException != null) {
            throw iOException;
        }
        return this.f5111;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f5109;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f5109 = null;
            }
        }
    }
}
