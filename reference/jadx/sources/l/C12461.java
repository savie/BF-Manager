package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۨܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M1S8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12461 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f40031 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InputStream f40034;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12836 f40036;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f40038 = new byte[4096];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40039 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f40032 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f40035 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f40037 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f40040 = null;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] f40033 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C12461(InputStream inputStream, InterfaceC12836 interfaceC12836) {
        inputStream.getClass();
        this.f40034 = inputStream;
        this.f40036 = interfaceC12836;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f40033;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        byte[] bArr2 = this.f40038;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f40034 == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f40040;
        if (iOException != null) {
            throw iOException;
        }
        int i4 = 0;
        while (true) {
            try {
                int iMin = Math.min(this.f40032, i2);
                System.arraycopy(bArr2, this.f40039, bArr, i, iMin);
                int i5 = this.f40039 + iMin;
                this.f40039 = i5;
                int i6 = this.f40032 - iMin;
                this.f40032 = i6;
                i += iMin;
                i2 -= iMin;
                i4 += iMin;
                int i7 = this.f40035;
                if (i5 + i6 + i7 == 4096) {
                    System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                    this.f40039 = 0;
                }
                if (i2 == 0 || this.f40037) {
                    break;
                    break;
                }
                int i8 = this.f40039 + this.f40032 + this.f40035;
                int i9 = this.f40034.read(bArr2, i8, 4096 - i8);
                if (i9 == -1) {
                    this.f40037 = true;
                    this.f40032 = this.f40035;
                    this.f40035 = 0;
                } else {
                    int i10 = this.f40035 + i9;
                    this.f40035 = i10;
                    int iMo14458 = this.f40036.mo14458(this.f40039, i10, bArr2);
                    this.f40032 = iMo14458;
                    this.f40035 -= iMo14458;
                }
            } catch (IOException e) {
                this.f40040 = e;
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
        if (this.f40034 == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f40040;
        if (iOException != null) {
            throw iOException;
        }
        return this.f40032;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f40034;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f40034 = null;
            }
        }
    }
}
